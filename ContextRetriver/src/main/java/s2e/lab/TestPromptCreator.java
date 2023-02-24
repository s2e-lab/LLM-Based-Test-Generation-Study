package s2e.lab;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import s2e.lab.searcher.JavaSearcher;
import s2e.lab.visitors.ClassNameCollector;
import s2e.lab.visitors.MethodNameCollector;
import s2e.lab.visitors.PackageNameCollector;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class is used to create the OpenAI prompt for the RQ1.
 */
public class TestPromptCreator {
    public static String BASE_DIR = "../";
    public static String FOLDER_NAME = BASE_DIR + "RQ1_Prompt_Elements/data/scenario1/";
    public static String PROMPT_OUTPUT_FILE = BASE_DIR + "RQ1_Prompt_Elements/OpenAI_Data/input/scenario1_prompt_TESTE.json";

    public static void main(String[] args) throws IOException {

        File projectDirectory = new File(FOLDER_NAME);
        List<File> javaFiles = JavaSearcher.findJavaFiles(projectDirectory);

        List<HashMap<String, String>> outputList = new ArrayList<>();
        for (File javaFile : javaFiles) {

            HashMap<String, String> outputMap = new HashMap<>();
            System.out.println("File: " + javaFile.getName());
            String id = javaFile.getName().split("_")[1].split("\\.")[0];
            outputMap.put("id", id);

            CompilationUnit cu = StaticJavaParser.parse(javaFile);
            outputMap.put("original_code", cu.toString());
            StringBuilder sb = new StringBuilder();


            //collect the package names
            List<String> packageNames = new ArrayList<>();
            VoidVisitor<List<String>> packageNameCollector = new PackageNameCollector();
            packageNameCollector.visit(cu, packageNames);
//                System.out.println("Package Names: " + packageNames);
            assert packageNames.size() == 1;
            sb.append("package ").append(packageNames.get(0)).append(";\n\n");

            cu.getImports().forEach(i -> sb.append("import ").append(i.getNameAsString()).append(".*;\n"));
            sb.append("import org.junit.jupiter.api.Test;\n");
            sb.append("import static org.junit.jupiter.api.Assertions.*;\n\n");


            //collect the class names
            List<String> classNames = new ArrayList<>();
            VoidVisitor<List<String>> classNameCollector = new ClassNameCollector();
            classNameCollector.visit(cu, classNames);
            assert classNames.size() == 1;

            //collect the method names
            List<String> methodNames = new ArrayList<>();
            VoidVisitor<List<String>> methodNameCollector = new MethodNameCollector();
            methodNameCollector.visit(cu, methodNames);
//                System.out.println("Method Names: " + methodNames);
            assert methodNames.size() == 1;

            String className = classNames.get(0);
            sb.append("/**\n" + " * Unit tests of {@link ").append(className).append("}.\n")
                    .append(" * It contains ten test cases for the {@link ").append(className).append("#").append(methodNames.get(0)).append("()} method.\n")
                    .append(" */\n");
            sb.append("class ").append(className).append("Test {\n");
            sb.insert(0, "// " + className + "Test.java\n");
            sb.append("\t\t");

            System.out.println(sb);
            outputMap.put("test_prompt", sb.toString());

            outputList.add(outputMap);
        }

        String jsonStr = JSONArray.toJSONString(outputList);

        try (FileWriter file = new FileWriter(PROMPT_OUTPUT_FILE)) {
            file.write(jsonStr);
        }


    }
}
