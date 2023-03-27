package s2e.lab.analyzers;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.utils.Pair;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;
import static s2e.lab.generators.JavaOpenAIPromptGenerator.RQ1_BASE_DIR;
import static s2e.lab.generators.JavaOpenAIPromptGenerator.RQ2_BASE_DIR;

/**
 * Generates a report on the compilation of the generated tests.
 *
 * @author Joanna C. S. Santos
 */
public class CompilationAnalyzer {


    // where the tests generated by the LLM were saved
    public static String RQ1_TESTS_OUTPUT_DIR =
            RQ1_BASE_DIR + "%s_Data/%s_output/%s/";
    public static String RQ2_TESTS_OUTPUT_DIR =
            RQ2_BASE_DIR + "%s_Data/%s_output/%s/";

    // uses the fixed version
    public static String RQ1_JSON_OUTPUT =
            RQ1_BASE_DIR + "%s_Data/%s_output/%s_output_%d_fixed_extracode.json";
    public static String RQ1_CSV_PROMPT_INPUT =
            RQ1_BASE_DIR + "%s_Data/%s_input/%s_prompt.csv";
    public static String RQ2_JSON_OUTPUT =
            RQ2_BASE_DIR + "%s_Data/%s_output/%s_output_%d_fixed_extracode.json";
    public static String RQ2_CSV_PROMPT_INPUT =
            RQ2_BASE_DIR + "%s_Data/%s_input/%s_prompt.csv";
    // where to save things (solely based on the dataset & model!)
    public static String STATISTICS_CSV_OUTPUT =
            "../../ICSE23-results/%s/%s-Results/csv-data/%s.csv";
    public static String STATISTICS_JAVA_OUTPUT =
            "../../ICSE23-results/%s/%s-Results/src/test/java/%s/%s.java";


    // metadata saved
    private static final String[] CSV_HEADERS = new String[]{
            "id",
            "scenario",
            "token_size",
            "jUnitTestFileName",
            "finish_reason",
            "original_syntax_ok",
            "removed_extra_code",
            "syntax_ok_after_extra_code_removal",
            "number_test_methods",
            "number_assertions",
            "syntax_check"
    };

    /**
     * Inspects the generated tests and reports the possible syntax errors.
     *
     * @param isOriginalCompilable
     * @param isCompilableAfterFix
     * @return
     */
    public static String getSyntaxCheck(boolean isOriginalCompilable, boolean isCompilableAfterFix) {
        if (isOriginalCompilable)
            return "ORIGINAL_SYNTAX_OK";
        if (isCompilableAfterFix)
            return "EXTRA_CODE";
        return "UNKNOWN_SYNTAX_ERROR";
    }


    public static int computeNumberTestMethods(CompilationUnit cu) {
        if (cu == null) return -1;
        return (int) cu.findAll(AnnotationExpr.class).stream()
                .filter(annotationExpr -> annotationExpr.getNameAsString().equals("Test"))
                .count();
    }

    public static int computeNumberAssertions(CompilationUnit cu) {
        if (cu == null) return -1;
        return (int) cu.findAll(MethodCallExpr.class).stream()
                .map(c -> c.toString())
                .filter(c -> c.startsWith("assert") && c.matches("assert.*\\(.*\\)"))
                .count();
    }

    public static String getFinishReason(JsonObject resp) {
        JsonElement el = resp.get("choices").getAsJsonArray().get(0)
                .getAsJsonObject().get("finish_reason");
        return el == null || el.toString().equals("null") ? "" : el.getAsString();
    }


    public static void generateReport(String dataset, String model) throws IOException {
        String[] scenarios = {"original", "scenario1", "scenario2", "scenario3"};
        String csvFilePath = STATISTICS_CSV_OUTPUT.formatted(model, dataset, "compilation_" + dataset);
        FileWriter csvWriter = new FileWriter(csvFilePath);
        CSVFormat csvFormat = CSVFormat.DEFAULT
                .builder()
                .setHeader(CSV_HEADERS)
                .build();

        StringBuilder sb = new StringBuilder();
        try (final CSVPrinter printer = new CSVPrinter(csvWriter, csvFormat)) {

            for (String scenario : scenarios) {
                for (int token : new int[]{2000, 4000}) {
                    String rqJsonFile = scenario.equals("original") ? RQ1_JSON_OUTPUT : RQ2_JSON_OUTPUT;
                    String rqCsvFile = scenario.equals("original") ? RQ1_CSV_PROMPT_INPUT : RQ2_CSV_PROMPT_INPUT;
                    JsonArray promptArr = getJsonArray(format(rqJsonFile, model, dataset, scenario, token));

                    // key = promptID, value = Pair<classname, method_signature>
                    String promptInputFile = format(rqCsvFile, model, dataset, scenario);
                    Map<String, Pair<String, String>> promptMetadata = loadCsvInputprompts(promptInputFile);
                    // key = promptID, value = Pair<isCompilable, hasExtraCode>
                    Map<String, Pair<Boolean, Boolean>> promptCompileStatus = new HashMap<>();

                    assert promptArr.size() == promptMetadata.size();
                    for (JsonElement promptObj : promptArr) {
                        JsonObject resp = promptObj.getAsJsonObject();
                        String promptID = resp.get("prompt_id").getAsString();
                        String prompt = resp.get("test_prompt").getAsString();
                        String fixedCode = resp.get("choices").getAsJsonArray().get(0)
                                .getAsJsonObject().get("text").getAsString();
                        // if it does not contain the prompt, then prepend it
                        String jUnitCodeAfterFix = fixedCode.contains(prompt) ?
                                fixedCode :
                                prompt + "\n\t\t" + fixedCode;
                        // if it does not contain the prompt, then prepend it
                        String originalCode = resp.get("original_generated_code").getAsString();
                        String jUnitOriginalCode = originalCode.contains(prompt) ?
                                originalCode :
                                prompt + "\n\t\t" + originalCode;
                        String finishReason = getFinishReason(resp);
                        CompilationUnit originalCUnit = getCompilationUnit(jUnitOriginalCode);
                        boolean isOriginalCompilable = originalCUnit != null;
                        CompilationUnit fixedCUnit = getCompilationUnit(jUnitCodeAfterFix);
                        boolean isCompilableAfterFix = fixedCUnit != null;
                        boolean removedExtraCode = resp.get("removed_extra_code").getAsBoolean();
                        CompilationUnit cu = isOriginalCompilable ? originalCUnit : fixedCUnit;
                        promptCompileStatus.put(promptID, new Pair<>(isOriginalCompilable, removedExtraCode));
                        String classname = promptMetadata.get(promptID).a;
                        String methodSignature = promptMetadata.get(promptID).b;
                        String jUnitTestFileName = "%s_%s_%d_Test".formatted(
                                classname, methodSignature.split("\\(")[0], token
                        );
                        File jUnitTestFile = new File(STATISTICS_JAVA_OUTPUT.formatted(
                                model,
                                dataset,
                                scenario,
                                jUnitTestFileName)
                        );
                        File productionFile = new File("..", promptID);
                        assert productionFile.exists();

                        // "id", "scenario", "token_size", "jUnitTestFileName", "finish_reason",
                        // "original_syntax_ok", "removed_extra_code", "syntax_ok_after_extra_code_removal"
                        // "number_test_methods", "number_assertions", "test_filename"
                        printer.printRecord(promptID, scenario, token, jUnitTestFileName, finishReason,
                                isOriginalCompilable, removedExtraCode, isCompilableAfterFix,
                                computeNumberTestMethods(cu), computeNumberAssertions(cu), getSyntaxCheck(isOriginalCompilable, isCompilableAfterFix));
                        if (isOriginalCompilable || isCompilableAfterFix) {
                            // import the java util package
                            cu.addImport("java.util.*");
                            cu.getType(0).setName(jUnitTestFileName);
                        }

                        sb.append("%s-%s,%s,%s".formatted(dataset, scenario, jUnitTestFile.getCanonicalPath(), productionFile.getCanonicalPath()));
                        saveToJavaFile(jUnitTestFile, cu != null ? cu.toString() : jUnitOriginalCode);
                    }
                }
            }
        }


        String testSmellsCsv = STATISTICS_CSV_OUTPUT.formatted(model, dataset, "TestSmellInput-%s-%s.csv".formatted(dataset, model));
        try (FileWriter f = new FileWriter(testSmellsCsv)) {
            f.write(sb.toString());
        }
    }

    private static void saveToJavaFile(File jUnitTestFile, String unitTest) throws IOException {
        jUnitTestFile.getParentFile().mkdirs(); // create parent dirs if needed
        try (FileWriter f = new FileWriter(jUnitTestFile)) {
            f.write(unitTest);
        }
        System.out.println("Saved " + jUnitTestFile);
    }


    /**
     * Given a string as input, it parses it and returns the compilation unit.
     *
     * @param code Java code
     * @return a CompilationUnit (or null if it is not compilable)
     */
    public static CompilationUnit getCompilationUnit(String code) {
        try {
            return StaticJavaParser.parse(code);
        } catch (Exception e) { /* ignore */ }
        return null;
    }

    /**
     * Returns an array of objects from a JSON file.
     *
     * @param fileName path to the JSON file
     * @return an array of JSON objects (it assumed that the file contains an array of JSON objects)
     * @throws IOException in case of I/O errors.
     */
    public static JsonArray getJsonArray(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        try (
                Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)
        ) {
            JsonElement tree = JsonParser.parseReader(reader);
            return tree.getAsJsonArray();
        }
    }

    /**
     * Loads a CSV file and returns a map.
     *
     * @param csvFilePath
     * @return
     * @throws IOException
     */
    private static Map<String, Pair<String, String>> loadCsvInputprompts(String csvFilePath) throws IOException {
        Map<String, Pair<String, String>> output = new HashMap<>();
        // read a CSV file and put the data into a map
        String[] headers = {"id", "method_signature", "classname"};
        CSVFormat csvFormat = CSVFormat.DEFAULT
                .builder()
                .setHeader(headers)
                .setSkipHeaderRecord(true)
                .build();
        Iterable<CSVRecord> records = csvFormat.parse(new FileReader(csvFilePath));
        for (CSVRecord record : records) {
            String promptID = record.get("id");
            String methodSignature = record.get("method_signature");
            String classname = record.get("classname");
            output.put(promptID, new Pair<>(classname, methodSignature));
        }
        return output;
    }


    public static void main(String[] args) throws IOException {
//        generateReport("HumanEvalJava", "GPT3.5");
        generateReport("HumanEvalJava", "OpenAI");
//        generateReport("SF110", "OpenAI");
    }
}
