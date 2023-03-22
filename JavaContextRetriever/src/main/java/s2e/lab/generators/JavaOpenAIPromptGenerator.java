package s2e.lab.generators;

import com.github.javaparser.ParseProblemException;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import org.apache.commons.io.FileUtils;
import s2e.lab.PromptUtils;
import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.String.format;
import static s2e.lab.PromptUtils.computeUnitTestPrompt;
import static s2e.lab.PromptUtils.save;

/**
 * This class is used to create the OpenAI prompts for the RQ1 and RQ2 according to each different scenario.
 * All of these are saved in JSON files inside the respective OpenAI_Data input folder .
 */
public class JavaOpenAIPromptGenerator {
    // how many test methods to generate?
    public static String NUMBER_OF_TESTS = "ten";

    // base directory for all the data (assuming current dir = the same root directory as this maven project)
    public static String BASE_DIR = "../";

    // Human Eval Java paths
    public static String HUMAN_EVAL_JAVA = BASE_DIR + "HumanEvalJava/";
    public static String HUMAN_EVAL_SCENARIO = HUMAN_EVAL_JAVA + "src/main/java/%s/";
    public static String HUMAN_EVAL_TEST_FOLDER = HUMAN_EVAL_JAVA + "src/test/%s/";

    // OSS project paths
    private static String SF100_EVOSUITE = BASE_DIR + "EvoSuiteBenchmark/";
    public static String SF100_EVOSUITE_SCENARIO = SF100_EVOSUITE + "%s/";

    // folders for RQ1
    public static String RQ1_BASE_DIR = BASE_DIR + "RQ1_Test_Generation/";
    public static String RQ1_PROMPT_OUTPUT_FILE = RQ1_BASE_DIR + "OpenAI_Data/%s_input/%s_prompt.json";

    // folders for RQ2
    public static String RQ2_BASE_DIR = BASE_DIR + "RQ2_Prompt_Elements/";
    public static String RQ2_PROMPT_OUTPUT_FILE = RQ2_BASE_DIR + "OpenAI_Data/%s_input/%s_prompt.json";


    // criteria used to filter out projects
    private static int MIN_METHODS_TO_TEST = 0; // Quartile 1
    private static int MAX_METHODS_TO_TEST = 31; // Quartile 3

    // method inclusion criteria
    public static Predicate<MethodDeclaration> METHOD_INCLUSION_CRITERIA = (m -> PromptUtils.hasGoodJavadoc(m));
    // project inclusion criteria
    // only includes projects that at least 1 method to test, but also between MIN and MAX (inclusive)
    public static Predicate<List<? extends Object>> PROJECT_INCLUSION_CRITERIA =
            (methods) ->
                    (methods.size() > 0 && methods.size() >= MIN_METHODS_TO_TEST && methods.size() <= MAX_METHODS_TO_TEST);


    public static void main(String[] args) throws IOException {
        /* HumanEvalJava */
        File humanEvalJavaRQ1 = new File(format(RQ1_PROMPT_OUTPUT_FILE, "HumanEvalJava", "")).getParentFile();
        File humanEvalJavaRQ2 = new File(format(RQ2_PROMPT_OUTPUT_FILE, "HumanEvalJava", "")).getParentFile();
        // create folders if they don't exist
        humanEvalJavaRQ1.mkdirs();
        humanEvalJavaRQ2.mkdirs();
        // clean old results from the input folder
        FileUtils.cleanDirectory(humanEvalJavaRQ1);
        FileUtils.cleanDirectory(humanEvalJavaRQ2);
        // generates the prompts for RQ1 and RQ2 for HumanEvalJava
        generateHumanEvalJavaPrompts();

        /* OSS projects */
        File sf110RQ1 = new File(format(RQ1_PROMPT_OUTPUT_FILE, "SF110", "")).getParentFile();
        File sf110RQ2 = new File(format(RQ2_PROMPT_OUTPUT_FILE, "SF110", "")).getParentFile();
        // create folders if they don't exist
        sf110RQ1.mkdirs();
        sf110RQ2.mkdirs();
        // clean old results from the input folder
        FileUtils.cleanDirectory(sf110RQ1);
        FileUtils.cleanDirectory(sf110RQ2);
        // generates the prompts for RQ1 and RQ2 for OSS projects from Evosuite Benchmark
        generateOSSPrompts();

    }

    /**
     * Generates the JSON prompts for the OSS projects (SF110 - Evosuite Benchmark).
     *
     * @throws IOException
     */
    private static void generateOSSPrompts() throws IOException {
        // generates the JSON prompts for RQ1 and RQ2
        for (int i = 0; i <= 3; i++) {
            // scenario 0 is the original code, change package to original
            String scenarioName = (i == 0 ? "original" : ("scenario" + i));
            File scenarioDir = new File(format(SF100_EVOSUITE_SCENARIO, scenarioName));
            assert scenarioDir.exists();

            List<File> projectList = JavaSearcher.getProjectList(scenarioDir.getAbsolutePath());
            for (File project : projectList) {
                List<File> javaFiles = JavaSearcher.findJavaFiles(project);
                List<HashMap<String, String>> outputList = new ArrayList<>();

                for (File javaFile : javaFiles) {
                    // is it a test class?
                    if (javaFile.getPath().toLowerCase().contains("/test/"))
                        continue;

                    // gets testable methods according to a criteria
                    Predicate<MethodDeclaration> pred = scenarioName.equals("original") ? // if original scenario
                            METHOD_INCLUSION_CRITERIA : // then, use the 'good javadoc' criteria
                            null; // else, no need to filter because the scenario generation already filtered out the 'bad' methods

                    List<HashMap<String, String>> promptList = generateTestPrompt(javaFile, pred, true);
                    if (!promptList.isEmpty())
                        outputList.addAll(promptList);
                }
//            System.out.println(project.getName() + "\t" + outputList.size());
                // only includes projects that at least 1 method to test, but also between MIN and MAX (inclusive)
                if (PROJECT_INCLUSION_CRITERIA.test(outputList)) {
                    String rqPromptOutputFile = scenarioName.equals("original") ? RQ1_PROMPT_OUTPUT_FILE : RQ2_PROMPT_OUTPUT_FILE;
                    save(outputList, String.format(rqPromptOutputFile, "SF110", project.getName()));
                }
            }
        }
    }


    /**
     * Generates the JSON prompts for the HumanEvalJava project.
     * Generates the original scenario for RQ1, and the scenarios 1-3 for RQ2.
     *
     * @throws IOException
     */
    private static void generateHumanEvalJavaPrompts() throws IOException {

        // generates the JSON prompts for RQ1 and RQ2
        for (int i = 0; i <= 3; i++) {
            // scenario 0 is the original code, change package to original
            String scenarioName = (i == 0 ? "original" : ("scenario" + i));
            File scenarioDir = new File(format(HUMAN_EVAL_SCENARIO, scenarioName));
            assert scenarioDir.exists();

            List<File> javaFiles = JavaSearcher.findJavaFiles(scenarioDir);
            List<HashMap<String, String>> outputList = new ArrayList<>();
            for (File javaFile : javaFiles) {
                outputList.addAll(generateTestPrompt(javaFile, null, false));
            }
            // original sample = RQ1, otherwise, RQ2 folder
            String researchQuestion = scenarioName.equals("original") ? RQ1_PROMPT_OUTPUT_FILE : RQ2_PROMPT_OUTPUT_FILE;
            save(outputList, format(researchQuestion, "HumanEvalJava", scenarioName));
        }
    }

    /**
     * Use the template to create the JUnit test skeleton (header)
     *
     * @param javaFile   file that contains the method under test
     * @param predicate  a predicate to test whether a specific method declaration should be included or not
     * @param publicOnly if true, only testable methods from *public* classes are returned
     * @return a list of prompt metadata (metadata contains the ID, original code, and the test prompt)
     */
    private static List<HashMap<String, String>> generateTestPrompt(File javaFile, Predicate<MethodDeclaration> predicate, boolean publicOnly) {

        List<HashMap<String, String>> outputList = new ArrayList<>();
        try {
            CompilationUnit cu = StaticJavaParser.parse(javaFile);

            // get the class declaration
            ClassOrInterfaceDeclaration classDeclaration = PromptUtils.getPrimaryClass(cu);
            // Sometimes a Java file contains just a single enumeration or something else other than a class
            // getPrimaryClass(...) will return null in this case
            if (classDeclaration == null)
                return outputList;


            // collect the testable method's names (only if the class is also testable)
            List<MethodDeclaration> testableMethods = PromptUtils.getTestableMethods(classDeclaration, publicOnly);
            for (int i = 0; i < testableMethods.size(); i++) {
                MethodDeclaration methodDeclaration = testableMethods.get(i);
                // method ought to be ignored per the passed predicate
                if (predicate != null && !predicate.test(methodDeclaration))
                    continue;
                String methodSignature = methodDeclaration.getSignature().toString();
                // if only one, don't bother with the test name suffix
                String suffix = testableMethods.size() == 1 ? "" : String.valueOf(i);

                HashMap<String, String> outputMap = computeUnitTestPrompt(javaFile, NUMBER_OF_TESTS, cu, classDeclaration.getNameAsString(), methodSignature, suffix);
//                System.out.println(outputMap.get("id"));
                outputList.add(outputMap);
            }
        } catch (ParseProblemException e) {
            // System.err.println(format("Parsing error for Java File %s", javaFile.getName()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return outputList;
    }


}
