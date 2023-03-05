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
 * This class is used to create the OpenAI prompt for the RQ1.
 * All of these are saved in JSON files.
 */
public class TestPromptCreator {
    public static String BASE_DIR = "../";
    public static String RQ1_BASE_DIR = BASE_DIR + "RQ1_Prompt_Elements/";
    public static String RQ1_FOLDER_NAME = RQ1_BASE_DIR + "data/scenario%d/";
    public static String RQ1_PROMPT_OUTPUT_FILE = RQ1_BASE_DIR + "OpenAI_Data/input/scenario%d_prompt.json";

    public static String RQ2_BASE_DIR = BASE_DIR + "RQ2_Open_Source_Projects/";
    public static String RQ2_BENCHMARK_DIR = BASE_DIR + "EvoSuiteBenchmark/";
    public static String RQ2_PROMPT_OUTPUT_FILE = RQ2_BASE_DIR + "OpenAI_Data/SF110_input/%s.json";

    public static String NUMBER_OF_PROMPTS = "ten";


    public static void main(String[] args) throws IOException {
        /// generates the prompts for RQ1
        generateHumanEvalPrompts();
        // generates the prompts for RQ2
        generateOSSPrompts();
    }

    private static void generateOSSPrompts() throws IOException {

        List<File> projectList = JavaSearcher.getProjectList(RQ2_BENCHMARK_DIR);
        for (File project : projectList) {

            System.out.println(project.getName());
            List<File> javaFiles = JavaSearcher.findJavaFiles(project);
            List<HashMap<String, String>> outputList = new ArrayList<>();

            for (File javaFile : javaFiles) {
                List<HashMap<String, String>> promptList =  generateTestPrompt(javaFile, false);
                if(!promptList.isEmpty())
                    outputList.addAll(promptList);

            }
            save(outputList, String.format(RQ2_PROMPT_OUTPUT_FILE, project.getName()));

        }
    }



    private static void generateHumanEvalPrompts() throws IOException {
        for (int i = 1; i <= 4; i++) {
            File projectDirectory = new File(String.format(RQ1_FOLDER_NAME, i));
            List<File> javaFiles = JavaSearcher.findJavaFiles(projectDirectory);

            List<HashMap<String, String>> outputList = new ArrayList<>();
            for (File javaFile : javaFiles)
                outputList.addAll(generateTestPrompt(javaFile, true));

            save(outputList, String.format(RQ1_PROMPT_OUTPUT_FILE, i));
        }
    }


    private static List<HashMap<String, String>> generateTestPrompt(File javaFile, boolean isHumanEval) {

        List<HashMap<String, String>> outputList = new ArrayList<>();
        System.out.println("File: " + javaFile.getName());

        if(javaFile.getPath().toLowerCase().contains("/test/"))
            return outputList;
        try{
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
        }catch (Exception e){
            System.out.println("Error creating prompt for file: " + javaFile.getPath());
            System.out.println(e.getMessage());
        }

        return outputList;
    }


}
