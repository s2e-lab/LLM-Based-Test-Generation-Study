package s2e.lab.analyzers;

import com.github.javaparser.ParserConfiguration;
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
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.Triple;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

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
            "../../ICSE23-results/%s/%s-Results/%s/src/test/java/%s/%s.java";


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
            "syntax_check",
            "applied_heuristics"
    };

    /**
     * Inspects the generated tests and reports the possible syntax errors.
     *
     * @param isOriginalCompilable true if the original test generated is compilable
     * @param isCompilableAfterFix true if the modified code removed extra code is compilable
     * @param finishReason         why the model stopped generating the code
     * @return a string indicating the syntax check status
     */
    public static String getSyntaxCheck(boolean isOriginalCompilable, boolean isCompilableAfterFix, String finishReason) {
        if (isOriginalCompilable)
            return "ORIGINAL_SYNTAX_OK";
        if (isCompilableAfterFix)
            return "EXTRA_CODE";
        if (finishReason.equals("length"))
            return "INCOMPLETE_CODE";
        return "UNKNOWN_SYNTAX_ERROR";
    }

    /**
     * Computes the number of test methods in the generated test, based on the number of @Test annotations.
     *
     * @param cu compilation unit
     * @return the number of test methods, or -1 if the compilation unit is null.
     */
    public static int computeNumberTestMethods(CompilationUnit cu) {
        if (cu == null) return -1;
        return (int) cu.findAll(AnnotationExpr.class).stream()
                .filter(annotationExpr -> annotationExpr.getNameAsString().equals("Test"))
                .count();
    }

    /**
     * Computes the number of assertions in the generated test, based on the number of assert* calls.
     *
     * @param cu compilation unit
     * @return the number of assertions or -1 if the compilation unit is null
     */
    public static int computeNumberAssertions(CompilationUnit cu) {
        if (cu == null) return -1;
        return (int) cu.findAll(MethodCallExpr.class).stream()
                .map(c -> c.toString())
                .filter(c -> c.startsWith("assert") && c.matches("assert.*\\(.*\\)"))
                .count();
    }

    /**
     * Returns a string with the finish reason of the model.
     *
     * @param resp the response from the model
     * @return the finish reason.
     */
    public static String getFinishReason(JsonObject resp) {
        JsonElement el = resp.get("choices").getAsJsonArray().get(0)
                .getAsJsonObject().get("finish_reason");
        return el == null || el.toString().equals("null") ? "" : el.getAsString();
    }


    private static List<JsonArray> getPromptArrays(String rqJsonFile, String model, String dataset, String scenario, int token) throws IOException {
        switch (dataset) {
            case "HumanEvalJava":
                return Arrays.asList(getJsonArray(format(rqJsonFile, model, dataset, scenario, token)));
            case "SF110":
                List<JsonArray> output = new ArrayList<>();
                File sfInputFolder = new File(rqJsonFile.formatted(model, dataset, "", 0)).getParentFile();
                // find all JSON files in sfInputFolder
                List<File> jsonOutputFiles = Arrays.stream(sfInputFolder.listFiles())
                        .filter(f ->
                                f.getName().endsWith("fixed_extracode.json") &&
                                        f.getName().contains("_%d".formatted(token)) &&
                                        (f.getName().contains("%s_".formatted(scenario)) || scenario.equals("original"))
                        ).collect(Collectors.toList());

                for (File jsonOutputFile : jsonOutputFiles) {
                    output.add(getJsonArray(jsonOutputFile.getAbsolutePath()));
                }
                return output;
        }
        throw new IllegalArgumentException("Unknown dataset: " + dataset);


    }

    /**
     * Generates a report on the compilation of the generated tests.
     * It saves the results in two CSV files (see {@link CompilationAnalyzer#STATISTICS_CSV_OUTPUT}).
     * One CSV is to be used as input for tsDetect, the other has the raw data regarding compilation.
     *
     * @param dataset the dataset used to generate the tests
     * @param model   the model used to generate the tests
     * @throws IOException if the report cannot be generated
     */
    public static void generateReport(String dataset, String model, String[] scenarios, int[] max_tokens) throws IOException {




        String csvFilePath = STATISTICS_CSV_OUTPUT.formatted(model, dataset, "compilation_" + dataset);
        FileWriter csvWriter = new FileWriter(csvFilePath);
        CSVFormat csvFormat = CSVFormat.DEFAULT
                .builder()
                .setHeader(CSV_HEADERS)
                .build();

        StringBuilder sb = new StringBuilder();
        try (final CSVPrinter printer = new CSVPrinter(csvWriter, csvFormat)) {
            for (String scenario : scenarios) {
                for (int token : max_tokens) {
                    String rqJsonFile = scenario.equals("original") ? RQ1_JSON_OUTPUT : RQ2_JSON_OUTPUT;
                    String rqCsvFile = scenario.equals("original") ? RQ1_CSV_PROMPT_INPUT : RQ2_CSV_PROMPT_INPUT;
                    for (JsonArray promptArr : getPromptArrays(rqJsonFile, model, dataset, scenario, token)) {
                        String projectName = "";
//                        JsonArray promptArr = getJsonArray(format(rqJsonOutFile, model, dataset, scenario, token));

                        // key = promptID, value = Pair<classname, method_signature>
                        String filename = scenario;
                        if (dataset.equals("SF110")) {
                            projectName = promptArr.get(0).getAsJsonObject().get("prompt_id").getAsString().split("/")[3];
                            if (scenario.equals("original")) filename = projectName;
                            else filename = scenario + "_" + projectName;
                        }
                        // deletes old test files
                        // "../../ICSE23-results/%s/%s-Results/%s/src/test/java/%s/%s.java"
                        File projectTestFolder = new File(STATISTICS_JAVA_OUTPUT.formatted(model, dataset, dataset.equals("SF110") ? projectName : "", "", "").replace("//.java", ""));
                        if(projectTestFolder.exists()) { FileUtils.cleanDirectory(projectTestFolder); }


                        String promptInputFile = format(rqCsvFile, model, dataset, filename);
                        Map<String, Map<String, String>> promptMetadata = loadCsvInputPrompts(promptInputFile);
                        // key = promptID, value = Pair<isCompilable, hasExtraCode>
                        Map<String, Pair<Boolean, Boolean>> promptCompileStatus = new HashMap<>();
                        // enforce some integrity checks: either we have the same # of prompts, or 10x more, for CodeGen
                        assert promptArr.size() == promptMetadata.size() || promptArr.size() == promptMetadata.size() * 10;
                        for (JsonElement promptObj : promptArr) {
                            try {
                                JsonObject resp = promptObj.getAsJsonObject();
                                String promptID = resp.get("prompt_id").getAsString();
                                String prompt = resp.get("test_prompt").getAsString();
                                // this if condition is because there is some weirdness in the SF110 dataset, the promptID refers to the original folder rather than the scenario folder :(
                                String key = promptMetadata.containsKey(promptID) ? promptID : promptID.replace("/%s/".formatted(scenario), "/original/");
                                // this if below is because some weird thing happened!
                                // on the prompt output, ID is TransportKeyStoreBean0.java
                                // but the original prompt ID is TransportKeyStoreBean_0Test.java
                                if (!promptMetadata.containsKey(key)) {
                                    key = key.replace(".java", "Test.java");
                                    for (int i = key.length() - 4; i >= 0; i--) {
                                        if (promptMetadata.containsKey(key.substring(0, i) + "_" + key.substring(i))) {
                                            key = key.substring(0, i) + "_" + key.substring(i);
                                            break;
                                        }
                                    }
                                }
                                String classname = promptMetadata.get(key).get("classname");
                                String methodName = promptMetadata.get(key).get("method_signature").split("\\(")[0];
                                String packageName = promptMetadata.get(key).get("package");

                                // ensure a situation of unit testing an overload method (same name, different parameters)
                                String suffix = promptMetadata.get(key).get("suffix");
                                // choice_no is something related to codegen, it's the suggestion position
                                // recall CodeGen generates 10 suggestions, per prompt, so we need to add this to the suffix
                                String choiceNo = resp.has("choice_no") ? resp.get("choice_no").getAsString() : "";
                                if (!choiceNo.isEmpty())
                                    suffix += "_" + choiceNo;


                                String jUnitTestFileName = "%s_%s_%s_%d_%sTest".formatted(
                                        dataset.equals("SF110") ? scenario : "",
                                        classname, methodName, token,
                                        !suffix.isEmpty() ? suffix + "_" : ""
                                );
                                File jUnitTestFile = new File(STATISTICS_JAVA_OUTPUT.formatted(
                                        model, dataset, dataset.equals("SF110") ? projectName : "", packageName.replace(".", "/"), jUnitTestFileName));

                                // replace the "_[0-9]+Test.java" with ".java"
                                String productionFilePath = promptID.replaceAll("_[0-9]+Test.java", ".java");
                                File productionFile = new File("..", productionFilePath);
                                assert productionFile.exists();


                                // process the generated code
                                String fixedCode = resp.get("choices").getAsJsonArray().get(0)
                                        .getAsJsonObject().get("text").getAsString();

                                if (fixedCode.trim().length() == 0) continue;

                                // if it does not contain the prompt, then prepend it
                                String jUnitCodeAfterFix = fixedCode.contains(prompt.strip()) || fixedCode.contains("class %sTest {".formatted(classname)) ?
                                        fixedCode :
                                        prompt + "\n\t\t" + fixedCode;
                                // if it does not contain the prompt, then prepend it
                                String originalCode = resp.get("original_generated_code").getAsString();
                                String jUnitOriginalCode = originalCode.contains(prompt.strip()) || originalCode.contains("class %sTest {".formatted(classname)) ?
                                        originalCode :
                                        prompt + "\n\t\t" + originalCode;
                                String finishReason = getFinishReason(resp);
                                CompilationUnit originalCUnit = getCompilationUnit(jUnitOriginalCode);
                                boolean isOriginalCompilable = originalCUnit != null;
                                CompilationUnit fixedCUnit = getCompilationUnit(jUnitCodeAfterFix);
                                boolean isCompilableAfterFix = fixedCUnit != null;
                                boolean removedExtraCode = resp.get("removed_extra_code").getAsBoolean();
                                String appliedHeuristics = resp.has("applied_heuristics") ? resp.get("applied_heuristics").getAsString() : "";
                                CompilationUnit cu = isOriginalCompilable ? originalCUnit : fixedCUnit;
                                promptCompileStatus.put(promptID, new Pair<>(isOriginalCompilable, removedExtraCode));


                                // "id", "scenario", "token_size", "jUnitTestFileName", "finish_reason",
                                // "original_syntax_ok", "removed_extra_code", "syntax_ok_after_extra_code_removal"
                                // "number_test_methods", "number_assertions", "test_filename", "applied_heuristics"
                                printer.printRecord(promptID, scenario, token, jUnitTestFileName, finishReason,
                                        isOriginalCompilable, removedExtraCode, isCompilableAfterFix,
                                        computeNumberTestMethods(cu), computeNumberAssertions(cu),
                                        getSyntaxCheck(isOriginalCompilable, isCompilableAfterFix, finishReason), appliedHeuristics
                                );
                                if (isOriginalCompilable || isCompilableAfterFix) {
                                    // import all the java util package, JUnit5 assertions, and method under test
                                    cu.addImport("java.util.*");
                                    cu.addImport("org.junit.jupiter.api.*");
                                    cu.addImport("static org.junit.jupiter.api.Assertions.*");

                                    // add an import statement for the static method in HumanEvalJava
                                    String fullyQualifiedCutName = getFullyQualifiedCutName(dataset, promptID, classname);

                                    if (dataset.equals("HumanEvalJava")) {
                                        cu.addImport("static %s.*".formatted(fullyQualifiedCutName));
                                    } else if (dataset.equals("SF110")) {
                                        //TODO: do we need this? probably not if the test is in the same package as the CUT
//                                    CompilationUnit cuOriginalCode = getCompilationUnit(resp.get("original_code").getAsString());
//                                    if (cuOriginalCode.getPackageDeclaration().isPresent())
//                                        cu.addImport(cuOriginalCode.getPackageDeclaration().get().getName() + "." + classname);
                                    }

                                    // ensure class is on the right package (in case the generated test miss a package declaration or changed it)
                                    if (!packageName.isEmpty())
                                        cu.setPackageDeclaration(packageName);

                                    cu.getType(0).getConstructors().forEach(c -> {
                                        // update the constructor name to match the renaming scheme
                                        c.setName(jUnitTestFileName);
                                    });
                                    // update the class name to our custom name
                                    cu.getType(0).setName(jUnitTestFileName);

                                    sb.append("%s-%s,%s,%s\n".formatted(dataset, scenario, jUnitTestFile.getCanonicalPath(), productionFile.getCanonicalPath()));
                                    saveToJavaFile(jUnitTestFile, cu != null ? cu.toString() : jUnitOriginalCode);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }


        // saves the information for test smells detection by tsDetect
        saveTestSmellCsvInput(dataset, model, sb);
    }


    private static String getFullyQualifiedCutName(String dataset, String promptID, String classname) {
        String parts[] = "%s.*".formatted(promptID
                .replace("/" + dataset + "/src/main/java/", "")
                .replace(".java", "")
        ).split("/");
        parts[parts.length - 1] = classname;
        String fullyQualifiedCut = String.join(".", parts);
        return fullyQualifiedCut;
    }

    /**
     * Create a CSV file to be used as input by tsDetect.
     *
     * @param dataset the dataset used for unit test generation
     * @param model   the name of the  LLM
     * @param sb      the string builder containing the information to be saved
     * @throws IOException in case of input/output error.
     */
    private static void saveTestSmellCsvInput(String dataset, String model, StringBuilder sb) throws IOException {
        String testSmellsCsv = STATISTICS_CSV_OUTPUT.formatted(model, dataset, "TestSmellInput-%s-%s".formatted(dataset, model));
        try (FileWriter f = new FileWriter(testSmellsCsv)) {
            f.write(sb.toString());
        }
    }


    /**
     * Saves the given unit test to a Java file.
     *
     * @param jUnitTestFile the file to save the unit test
     * @param unitTest      the contents of the file
     * @throws IOException in case of input/output error.
     */
    private static void saveToJavaFile(File jUnitTestFile, String unitTest) throws IOException {
        jUnitTestFile.getParentFile().mkdirs(); // create parent dirs if needed
        try (FileWriter f = new FileWriter(jUnitTestFile)) {
            f.write(unitTest);
        }
        System.out.println("\tSaved " + jUnitTestFile);
    }


    /**
     * Given a string as input, it parses it and returns the compilation unit.
     *
     * @param code Java code
     * @return a CompilationUnit (or null if it is not compilable)
     */
    public static CompilationUnit getCompilationUnit(String code) {
        try {
            StaticJavaParser.getParserConfiguration().setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_11);
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
     * @param csvFilePath the path to the CSV file to load (i.e., the CSV file containing the input prompts).
     * @return a map containing the prompts' metadata (id, method_signature, classname).
     * @throws IOException in case of IO error.
     */
    private static Map<String, Map<String, String>> loadCsvInputPrompts(String csvFilePath) throws IOException {

        Map<String, Map<String, String>> output = new HashMap<>();
        // read a CSV file and put the data into a map
        String[] headers = {"id", "method_signature", "classname", "package", "suffix"};
        CSVFormat csvFormat = CSVFormat.DEFAULT
                .builder()
                .setHeader(headers)
                .setSkipHeaderRecord(true)
                .build();
        Iterable<CSVRecord> records = csvFormat.parse(new FileReader(csvFilePath));
        for (CSVRecord record : records) {
            Map<String, String> row = new HashMap<>();
            String promptID = record.get("id");
            row.put("method_signature", record.get("method_signature"));
            row.put("classname", record.get("classname"));
            row.put("package", record.get("package"));
            row.put("suffix", record.get("suffix"));
            output.put(promptID, row);
        }
        return output;
    }


    public static void main(String[] args) throws IOException {
        /* HumanEvalJava */

//        generateReport("HumanEvalJava", "CodeGen", new String[]{"original", "scenario1", "scenario2", "scenario3"}, new int[]{2000});
//        generateReport("HumanEvalJava", "GPT3.5", new String[]{"original", "scenario1", "scenario2", "scenario3"}, new int[]{2000});
//        generateReport("HumanEvalJava", "OpenAI", new String[]{"original", "scenario1", "scenario2", "scenario3"}, new int[]{2000,4000});


        /* SF110 */
       generateReport("SF110", "OpenAI", new String[]{/*"original",*/ "scenario4"/*, "scenario2", "scenario3", "scenario4"*/}, new int[]{4000/*,4000*/});
  //      generateReport("SF110", "GPT3.5", new String[]{/*"original",*/ "original"/*, "scenario2", "scenario3", "scenario4"*/}, new int[]{2000/*,4000*/});
   //     generateReport("SF110", "CodeGen", new String[]{/*"original",*/ "original"/*, "scenario2", "scenario3", "scenario4"*/}, new int[]{2000/*,4000*/});
//
    }
}
