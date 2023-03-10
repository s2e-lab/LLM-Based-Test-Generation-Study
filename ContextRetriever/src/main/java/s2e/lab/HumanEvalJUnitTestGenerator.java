package s2e.lab;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.apache.commons.text.StringSubstitutor;
import org.junit.jupiter.api.Test;
import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;

import static java.lang.String.format;
import static s2e.lab.PromptUtils.HUMAN_EVAL_TEST_TEMPLATE;
import static s2e.lab.TestPromptCreator.HUMAN_EVAL_SCENARIO;
import static s2e.lab.TestPromptCreator.HUMAN_EVAL_TEST_FOLDER;

/**
 * This class creates JUnit tests for the HumanEval dataset (RQ1).
 *
 * @author Joanna C. S. Santos
 */
public class HumanEvalJUnitTestGenerator {
    public static String RQ1_TEST_FOLDER_NAME = HUMAN_EVAL_TEST_FOLDER + "%sTest.java";

    public static void main(String[] args) throws IOException {
        // scenario 4 is the one that has the full implementation
        File projectDirectory = new File(format(HUMAN_EVAL_SCENARIO, 4));

        // retrieves all classes under test
        for (File javaFile : JavaSearcher.findJavaFiles(projectDirectory)) {
            System.out.println(javaFile.getName());
            CompilationUnit cu = StaticJavaParser.parse(javaFile);
            HashMap<String, String> params = new HashMap<>();
            params.put("className", PromptUtils.getPrimaryClass(cu).getNameAsString());
            params.put("importedPackages", PromptUtils.getImportedPackages(cu));
            for (int i = 1; i <= 4; i++) {
                params.put("packageName", "scenario" + i);
                params.put("testMethods", getTestMethods(javaFile, i, params.get("className")));
                String unitTest = StringSubstitutor.replace(HUMAN_EVAL_TEST_TEMPLATE, params);
                File outputFile = new File(format(RQ1_TEST_FOLDER_NAME, i, javaFile.getName().replace(".java","")));
                System.out.println(outputFile);
                System.out.println(unitTest);
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
        int testId = 1;
        for (int i = start; i < lines.size() - 1; i += 2) {
            if (!lines.get(i).trim().startsWith("*") || !lines.get(i + 1).trim().startsWith("*")) break;
            String invocation = lines.get(i).replace("* > ", "").trim();
            String expected = lines.get(i + 1).replace("* ", "").trim();

            testBody.append("@Test\n");
            testBody.append(String.format("\tpublic void test%d() throws Exception {\n",testId++));
            testBody.append(
                    format("\t\tassertEquals(%s, scenario%d.%s.%s);\n",
                            escape(expected, javaFile),
                            scenarioNo,
                            className,
                            escape(invocation, javaFile))
            );
            testBody.append("\t}\n\n\t");
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
