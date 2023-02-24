package s2e.lab;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitor;
import org.apache.commons.text.StringSubstitutor;
import s2e.lab.searcher.JavaSearcher;
import s2e.lab.visitors.ClassNameCollector;
import s2e.lab.visitors.MethodNameCollector;
import s2e.lab.visitors.PackageNameCollector;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This class is used to create the OpenAI prompt for the RQ1.
 */
public class TestPromptCreator {
    public static String BASE_DIR = "../";
    public static String FOLDER_NAME = BASE_DIR + "RQ1_Prompt_Elements/data/scenario%d/";
    public static String PROMPT_OUTPUT_FILE = BASE_DIR + "RQ1_Prompt_Elements/OpenAI_Data/input/scenario%d_prompt.json";
    public static String UNIT_TEST_TEMPLATE;

    static {
        try {
            URL templateUrl = TestPromptCreator.class.getClassLoader().getResource("RQ1UnitTestTemplate.java");
            UNIT_TEST_TEMPLATE = new String(Files.readAllBytes(Paths.get(templateUrl.getPath())), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 3; i++) {
            File projectDirectory = new File(String.format(FOLDER_NAME, i));
            List<HashMap<String, String>> outputList = generateTestPrompt(projectDirectory);
            save(outputList, String.format(PROMPT_OUTPUT_FILE, i));
        }
    }

    private static void save(List<HashMap<String, String>> outputList, String outputFile) throws IOException {
        JsonArray objects = new JsonArray(outputList);
        String jsonStr = Jsoner.prettyPrint(Jsoner.serialize(objects));

        try (FileWriter file = new FileWriter(outputFile)) {
            file.write(jsonStr);
        }
        System.out.println("Successfully Copied JSON Object to " + outputFile);
    }

    private static List<HashMap<String, String>> generateTestPrompt(File projectDirectory) throws FileNotFoundException {
        List<File> javaFiles = JavaSearcher.findJavaFiles(projectDirectory);

        List<HashMap<String, String>> outputList = new ArrayList<>();
        for (File javaFile : javaFiles) {

            HashMap<String, String> outputMap = new HashMap<>();
            System.out.println("File: " + javaFile.getName());
            String id = javaFile.getName().split("_")[1].split("\\.")[0];
            outputMap.put("id", id);

            CompilationUnit cu = StaticJavaParser.parse(javaFile);
            outputMap.put("original_code", cu.toString());


            //collect the package names
            List<String> packageNames = new ArrayList<>();
            VoidVisitor<List<String>> packageNameCollector = new PackageNameCollector();
            packageNameCollector.visit(cu, packageNames);
            assert packageNames.size() == 1;


            //collect the class name
            List<String> classNames = new ArrayList<>();
            VoidVisitor<List<String>> classNameCollector = new ClassNameCollector();
            classNameCollector.visit(cu, classNames);
            assert classNames.size() == 1;


            //collect the method name
            List<String> methodNames = new ArrayList<>();
            VoidVisitor<List<String>> methodNameCollector = new MethodNameCollector();
            methodNameCollector.visit(cu, methodNames);
            assert methodNames.size() == 1;


            // fill in the template
            Map<String, Object> params = new HashMap<>();
            params.put("className", classNames.get(0));
            params.put("packageName", packageNames.get(0));
            params.put("importedPackages", cu.getImports().stream().map(i -> i.toString()).collect(Collectors.joining("")));
            params.put("numberTests", "ten");
            params.put("methodName", methodNames.get(0));


            outputMap.put("test_prompt", StringSubstitutor.replace(UNIT_TEST_TEMPLATE, params));

            outputList.add(outputMap);
        }
        return outputList;
    }
}
