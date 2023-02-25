package s2e.lab;

import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static s2e.lab.TestPromptCreator.RQ1_FOLDER_NAME;

/**
 * This class creates JUnit tests for the HumanEval dataset (RQ1).
 *
 * @author Joanna C. S. Santos
 */
public class HumanEvalTestGenerator {
    public static void main(String[] args) throws IOException {
        Map<String, List<String>> sample2Scenario = new HashMap<>();
        for (int i = 1; i <= 3; i++) {
            File projectDirectory = new File(String.format(RQ1_FOLDER_NAME, i));
            List<File> javaFiles = JavaSearcher.findJavaFiles(projectDirectory);
            for (File javaFile : javaFiles) {
                sample2Scenario.putIfAbsent(javaFile.getName(), new ArrayList<>());
                String testBody=getTestMethods(javaFile, sample2Scenario, i);
                sample2Scenario.get(javaFile.getName()).add(testBody);
            }
        }
    }

    private static String getTestMethods(File javaFile, Map<String, List<String>> sample2Scenario, int i) {
        /* Read all the lines in the file */
        String testBody = "";

        return testBody;


    }
}
