package s2e.lab;


import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import s2e.lab.visitors.ClassNameCollector;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FixExtraTests {
    public static String BASE_PATH = "/Users/lsiddiqsunny/Documents/Notre_Dame/Research/Deep-Context-Aware-CodeGeneration/RQ1_Prompt_Elements/OpenAI_Data/output/";

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String fileName = "scenario1_output_fixed.json";
        JsonArray jsonArray = getJsonArray(BASE_PATH + fileName);
        if(jsonArray != null) {
            for (JsonElement jsonElement : jsonArray) {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                String prompt = jsonObject.get("test_prompt").getAsString();
                JsonArray choice = jsonObject.get("choices").getAsJsonArray();
                for (JsonElement jsonElement1 : choice) {
                    JsonObject jsonObject1 = jsonElement1.getAsJsonObject();
                    String text = jsonObject1.get("text").getAsString();
                    CompilationUnit cu = getCompilationUnit(prompt+"\n\t\t"+text);
                    //collect the class names
                    List<String> classNames = new ArrayList<>();
                    VoidVisitor<List<String>> classNameCollector = new ClassNameCollector();
                    classNameCollector.visit(cu, classNames);
                    System.out.println("Class Names: " + classNames);
                }
                System.out.println();
            }
        }

    }
    public static CompilationUnit getCompilationUnit(String code){
        CompilationUnit cu = StaticJavaParser.parse(code);
        return cu;
    }

    public static JsonArray getJsonArray(String fileName){
        Path path = Paths.get(fileName);

        try (Reader reader = Files.newBufferedReader(path,
                StandardCharsets.UTF_8)) {

            JsonParser parser = new JsonParser();
            JsonElement tree = parser.parse(reader);

            JsonArray array = tree.getAsJsonArray();
            return array;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }





}
