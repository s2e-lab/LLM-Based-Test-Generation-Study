import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitor;
import org.json.simple.JSONArray;
import searcher.JavaSearcher;
import visitors.ClassNameCollector;
import visitors.MethodNameCollector;
import visitors.PackageNameCollector;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestPromptCreator {
    static String FOLDER_NAME = "/Users/lsiddiqsunny/Documents/Notre Dame/Research/Deep-Context-Aware-CodeGeneration/RQ1_Prompt_Elements/Data/Scenario3/src/main/java/scenario3/";

    public static void main(String[] args){
        try {
            File projectDirectory = new File(FOLDER_NAME);
            List<File> javaFiles = JavaSearcher.findJavaFiles(projectDirectory);

            List<HashMap<String,String>> outputList = new ArrayList<>();
            for (File javaFile : javaFiles) {

                HashMap<String,String> outputMap = new HashMap<>();
                System.out.println("File: " + javaFile.getName());
                String id = javaFile.getName().split("_")[1].split("\\.")[0];
                outputMap.put("id", id);

                CompilationUnit cu = StaticJavaParser.parse(javaFile);
                outputMap.put("original_code",cu.toString());
                StringBuilder sb = new StringBuilder();


                //collect the package names
                List<String> packageNames = new ArrayList<>();
                VoidVisitor<List<String>> packageNameCollector = new PackageNameCollector();
                packageNameCollector.visit(cu, packageNames);
//                System.out.println("Package Names: " + packageNames);
                assert packageNames.size() == 1;
                sb.append("package ").append(packageNames.get(0)).append(";\n\n");

                cu.getImports().forEach(i -> sb.append("import ").append(i.getNameAsString()).append(";\n"));
                sb.append("import org.junit.jupiter.api.Test;\n");
                sb.append("import static org.junit.jupiter.api.Assertions.*;\n\n");


                //collect the class names
                List<String> classNames = new ArrayList<>();
                VoidVisitor<List<String>> classNameCollector = new ClassNameCollector();
                classNameCollector.visit(cu, classNames);
                assert classNames.size() == 1;
                sb.append("class ").append(classNames.get(0)).append("Test {\n");
                sb.insert(0, "// "+classNames.get(0)+"Test.java\n");

                //collect the method names
                List<String> methodNames = new ArrayList<>();
                VoidVisitor<List<String>> methodNameCollector = new MethodNameCollector();
                methodNameCollector.visit(cu, methodNames);
//                System.out.println("Method Names: " + methodNames);
                assert methodNames.size() == 1;

                sb.append("\t@Test\n");
                sb.append("\tvoid ").append(methodNames.get(0)).append("Test1() {\n");
                sb.append("\t\t// Test logic for ").append(methodNames.get(0)).append("\n");

                System.out.println(sb);
                outputMap.put("test_prompt",sb.toString());

                outputList.add(outputMap);
            }

            String jsonStr = JSONArray.toJSONString(outputList);
            System.out.println(jsonStr);
             FileWriter file = new FileWriter("Scenario3_prompt.json");
             file.write(jsonStr);
             file.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
