package s2e.lab;

import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static s2e.lab.PromptUtils.save;
import static s2e.lab.TestPromptCreator.RQ1_FOLDER_NAME;

/**
 * This class aims to collect basic statics about the datasets.
 *
 * @author Joanna C. S. Santos
 */
public class DatasetStaticsCollector {

    public static void main(String[] args) {
        // collect stats about the datasets
        collectStatsHumanEval();
    }

    private static void collectStatsHumanEval() throws IOException {


        File projectDirectory = new File(String.format(RQ1_FOLDER_NAME, 3));
        List<File> javaFiles = JavaSearcher.findJavaFiles(projectDirectory);

        List<HashMap<String, String>> outputList = new ArrayList<>();
        for (File javaFile : javaFiles) {

            HashMap<String, String> output = new HashMap<>();
            output.put("file", javaFile.getName());
            output.put("number_of_tests", String.valueOf(JavaSearcher.getNumberOfTests(javaFile)));
            output.put("number_of_methods", String.valueOf(JavaSearcher.getNumberOfMethods(javaFile)));
            output.put("number_of_lines", String.valueOf(JavaSearcher.getNumberOfLines(javaFile)));
            outputList.add(output);
        }
        save(outputList, String.format(RQ1_PROMPT_OUTPUT_FILE, i));
    }


}
}
