package s2e.lab;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.apache.commons.text.StringSubstitutor;
import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;

import static java.lang.String.format;
import static s2e.lab.PromptUtils.HUMAN_EVAL_TEST_TEMPLATE;
import static s2e.lab.TestPromptCreator.RQ1_BASE_DIR;
import static s2e.lab.TestPromptCreator.RQ1_FOLDER_NAME;

/**
 * This class creates JUnit tests for the HumanEval dataset (RQ1).
 *
 * @author Joanna C. S. Santos
 */
public class HumanEvalTestGenerator {
    public static String RQ1_TEST_FOLDER_NAME = RQ1_BASE_DIR + "data/tests/scenario%d/%sTest.java";

    public static void main(String[] args) throws IOException {

        File projectDirectory = new File(format(RQ1_FOLDER_NAME, 3));


        for (File javaFile : JavaSearcher.findJavaFiles(projectDirectory)) {
            System.out.println(javaFile.getName());
            CompilationUnit cu = StaticJavaParser.parse(javaFile);
            HashMap<String, String> params = new HashMap<>();
            params.put("className", PromptUtils.getPrimaryClass(cu).getNameAsString());
            params.put("importedPackages", PromptUtils.getImportedPackages(cu));
            for (int i = 1; i <= 3; i++) {
                params.put("packageName", "scenario" + i);
                params.put("assertions", getTestMethods(javaFile, i, params.get("className")));
                String unitTest = StringSubstitutor.replace(HUMAN_EVAL_TEST_TEMPLATE, params);
                File outputFile = new File(format(RQ1_TEST_FOLDER_NAME, i, params.get("className")));
                try (FileWriter file = new FileWriter(outputFile)) {
                    file.write(unitTest);
                }
            }
        }
    }

    private static String getTestMethods(File javaFile, int scenarioNo, String className) throws IOException {
        StringBuilder testBody = new StringBuilder();
        List<String> lines = Files.readAllLines(javaFile.toPath());
        int start = 0;
        // finds the first line that starts with "* > " (test case)
        // also ignores something like "* > 1.0" (this for test 81)
        for (; start < lines.size(); start++)
            if (lines.get(start).trim().startsWith("* > ") && !Character.isDigit(lines.get(start).trim().toCharArray()[4]))
                break;
        // finds the test cases
        for (int i = start; i < lines.size() - 1; i += 2) {
            if (!lines.get(i).trim().startsWith("*") || !lines.get(i + 1).trim().startsWith("*")) break;
            String invocation = lines.get(i).replace("* > ", "").trim();
            String expected = lines.get(i + 1).replace("* ", "").trim();
            testBody.append(
                    format("assertEquals(%s, scenario%d.%s.%s);\n\t\t",
                            escape(expected, javaFile),
                            scenarioNo,
                            className,
                            escape(invocation, javaFile))
            );
        }
        return testBody.toString();


    }

    /**
     * Given an input/output, it escapes python syntax to java syntax.
     *
     * @param s        string to be escaped
     * @param javaFile Java file under test
     * @return escaped string
     */
    private static String escape(String s, File javaFile) {
        //TODO: this is a quick fix to avoid parsing arrays within a string -- ex: "()"
        // we should use a more generalizable approach
        if (javaFile.getName().equals("id_132.java")) return s; // this is a special case, QUICK FIX

        String out = s;
        if (s.contains("["))
            out = out.replace("[", "Arrays.asList(").replace("]", ")");
        if (s.contains("{"))
            out = out.replace("{", "Map.of(").replace("}", ")").replace(": ", ", ");
        return out;
    }
}
