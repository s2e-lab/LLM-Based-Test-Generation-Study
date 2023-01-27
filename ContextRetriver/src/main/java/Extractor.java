import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitor;
import visitors.MethodNameCollector;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Extractor {

    private static final String FILE_PATH = "/Users/lsiddiqsunny/Documents/Notre Dame/Research/Deep-Context-Aware-CodeGeneration/EvoSuiteBenchmark/1_tullibee/src/main/java/com/ib/client/Contract.java";
    public static void main(String[] args) throws FileNotFoundException {
        CompilationUnit cu = StaticJavaParser.parse(new File(FILE_PATH));
        List<String> methodNames = new ArrayList<>();
        VoidVisitor<List<String>> methodNameCollector = new MethodNameCollector();
        methodNameCollector.visit(cu, methodNames);
        methodNames.forEach(System.out::println);


        /*
        Tasks:
        1. Extract class names after extends and implements (Possible hints: https://stackoverflow.com/questions/43829321/getting-names-of-inherited-classes-in-javaparser)
        2. Extract methods and variable names (Already done for methods, need to do for variables)
        3. Extract JavaDoc (Extract comments and then filter out the ones that are JavaDoc)
         */
    }
}
