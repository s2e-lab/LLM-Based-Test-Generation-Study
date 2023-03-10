package s2e.lab;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static s2e.lab.PromptUtils.computeUnitTestPrompt;
import static s2e.lab.PromptUtils.save;

/**
 * This class is used to create the OpenAI prompts for the RQ1 and RQ2 according to each different scenario.
 * All of these are saved in JSON files.
 */
public class TestPromptCreator {
    public static String BASE_DIR = "../";
    public static String HUMAN_EVAL_JAVA = BASE_DIR + "HumanEvalJava/";
    public static String HUMAN_EVAL_SCENARIO = HUMAN_EVAL_JAVA + "src/main/java/%s/";
    public static String HUMAN_EVAL_TEST_FOLDER = HUMAN_EVAL_JAVA + "src/test/%s/";
    public static String RQ2_BASE_DIR = BASE_DIR + "RQ2_Prompt_Elements/";
    public static String RQ2_PROMPT_OUTPUT_FILE = RQ2_BASE_DIR + "OpenAI_Data/input/%s_prompt.json";

//    public static String RQ2_BASE_DIR = BASE_DIR + "RQ2_Open_Source_Projects/";
//    public static String RQ2_BENCHMARK_DIR = BASE_DIR + "EvoSuiteBenchmark/";
//    public static String RQ2_PROMPT_OUTPUT_FILE = RQ2_BASE_DIR + "OpenAI_Data/SF110_input/%s.json";

    public static String NUMBER_OF_PROMPTS = "ten";


    public static void main(String[] args) throws IOException {
        // generates the prompts for RQ1 and RQ2
        generateHumanEvalPrompts();
        // generates the prompts for RQ2
//        generateOSSPrompts();
    }

//    private static void generateOSSPrompts() throws IOException {
//
//        List<File> projectList = JavaSearcher.getProjectList(RQ2_BENCHMARK_DIR);
//        for (File project : projectList) {
//
//            System.out.println(project.getName());
//            List<File> javaFiles = JavaSearcher.findJavaFiles(project);
//            List<HashMap<String, String>> outputList = new ArrayList<>();
//
//            for (File javaFile : javaFiles) {
//                if (javaFile.getPath().toLowerCase().contains("/test/"))
//                    continue;
//                List<HashMap<String, String>> promptList = generateTestPrompt(javaFile, false);
//                if (!promptList.isEmpty())
//                    outputList.addAll(promptList);
//
//            }
//            save(outputList, String.format(RQ2_PROMPT_OUTPUT_FILE, project.getName()));
//
//        }
//    }


    private static void generateHumanEvalPrompts() throws IOException {

        // generates the JSON prompts for RQ1 and RQ2
        for (int i = 1; i <= 4; i++) {
            File projectDirectory = new File(String.format(HUMAN_EVAL_SCENARIO, i));
            // scenario 4 is the original code, change package to original
            if (i == 4) projectDirectory = new File(projectDirectory + "../original");
            assert  projectDirectory.exists();

//            List<File> javaFiles = JavaSearcher.findJavaFiles(projectDirectory);
//            List<HashMap<String, String>> outputList = new ArrayList<>();
//            for (File javaFile : javaFiles)
//                outputList.addAll(generateTestPrompt(javaFile, true));
//
//            save(outputList, String.format(RQ2_PROMPT_OUTPUT_FILE, i));
        }
    }

    /**
     * Use the template to create the JUnit test skeleton (header)
     *
     * @param javaFile    file that contains the method under test
     * @param isHumanEval true if we are generating the skeleton for HumanEval
     * @return
     */
    private static List<HashMap<String, String>> generateTestPrompt(File javaFile, boolean isHumanEval) {

        List<HashMap<String, String>> outputList = new ArrayList<>();
        System.out.println("File: " + javaFile.getName());


        try {
            CompilationUnit cu = StaticJavaParser.parse(javaFile);

            // get the class name
            ClassOrInterfaceDeclaration classDeclaration = PromptUtils.getPrimaryClass(cu);

            // collect the method name
            List<String> testableMethods = PromptUtils.getTestableMethodSignatures(classDeclaration);
            for (int i = 0; i < testableMethods.size(); i++) {
                String methodSignature = testableMethods.get(i);
                String suffix = testableMethods.size() == 1 ?
                        "" : // if only one, don't bother with the suffix
                        String.format("%d", i);

                HashMap<String, String> outputMap = computeUnitTestPrompt(javaFile, NUMBER_OF_PROMPTS, cu, classDeclaration.getNameAsString(), methodSignature, suffix, isHumanEval);
//                System.out.println(outputMap.get("test_prompt"));
                outputList.add(outputMap);
            }
        } catch (Exception e) {
            System.out.println("Error creating prompt for file: " + javaFile.getPath());
            System.out.println(e.getMessage());
        }

        return outputList;
    }


}
