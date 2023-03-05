package s2e.lab;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import s2e.lab.visitors.ClassNameCollector;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CompilableTestCreator {
    public static String BASE_DIR = "../";
    public static String RQ1_BASE_DIR = BASE_DIR + "RQ1_Prompt_Elements/";
    public static String RQ1_INPUT_FILE_NAME = RQ1_BASE_DIR + "OpenAI_Data/output/scenario1_output.json";
    public static String RQ1_OUTPUT_FILE = RQ1_BASE_DIR + "RQ1_Result/coverage_result/src/test/java/scenario1/";

    public static void main(String[] args){
        File file = new File(RQ1_OUTPUT_FILE);
        if(!file.exists()){
            file.mkdirs();
        }
        JsonArray jsonArray = getJsonArray(RQ1_INPUT_FILE_NAME);
        if(jsonArray != null) {
            for (JsonElement jsonElement : jsonArray) {
                JsonObject jsonObject = jsonElement.getAsJsonObject();

                String promptID = jsonObject.get("prompt_id").getAsString();
                System.out.println(promptID);

                String prompt = jsonObject.get("test_prompt").getAsString();
                JsonArray choice = jsonObject.get("choices").getAsJsonArray();
                for (JsonElement jsonElement1 : choice) {
                    JsonObject jsonObject1 = jsonElement1.getAsJsonObject();
                    String text = jsonObject1.get("text").getAsString();
                    CompilationUnit cu = getCompilationUnit(prompt+"\n\t\t"+text);
                    if(cu != null){
                        //collect the class names
                        List<String> classNames = new ArrayList<>();
                        VoidVisitor<List<String>> classNameCollector = new ClassNameCollector();
                        classNameCollector.visit(cu, classNames);
                        System.out.println("Class Names: " + classNames);
                        String fileName = RQ1_OUTPUT_FILE + classNames.get(0) + ".java";
                        System.out.println(fileName);
                        try {
                            Files.write(Paths.get(fileName), cu.toString().getBytes());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    public static CompilationUnit getCompilationUnit(String code){
        try{
            CompilationUnit cu = StaticJavaParser.parse(code);
            return cu;
        }catch (Exception e){
            System.out.println("Exception: Not compilable");
        }
        return null;

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
