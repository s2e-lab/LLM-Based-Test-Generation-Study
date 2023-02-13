import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitor;
import searcher.JavaSearcher;
import visitors.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Extractor {

    private static final String FILE_PATH = "EvoSuiteBenchmark/1_tullibee/src/main/java/com/ib/client/Contract.java";
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Collect method names
         */
        CompilationUnit cu = StaticJavaParser.parse(new File(FILE_PATH));
        List<String> methodNames = new ArrayList<>();;
        VoidVisitor<List<String>> methodNameCollector = new MethodNameCollector();
        methodNameCollector.visit(cu, methodNames);
        methodNames.forEach(System.out::println);
        /*
        Collect class names
         */
        List<String> className = new ArrayList<>();
        VoidVisitor<List<String>> classNameVisitor = new ClassNameCollector();
        classNameVisitor.visit(cu,className);
        className.forEach(n->System.out.println("Class name collected: "+n));
        /*
        Collect extended class names (If any)
         */
        List<String> extendsName = new ArrayList<>();
        VoidVisitor<List<String>> extendsVisitor = new ExtendedNameCollector();
        extendsVisitor.visit(cu,extendsName);
        extendsName.forEach(n->System.out.println("Extended name collected: "+n));
        /*
        Collect implemented class names (If any)
         */
        List<String> implementsName = new ArrayList<>();
        VoidVisitor<List<String>> implementsVisitor = new ImplementedNameCollector();
        implementsVisitor.visit(cu,implementsName);
        implementsName.forEach(n->System.out.println("Implemented name collected: "+n));
        /*
        Collect field names (If any)
         */
        List<String> fieldNames = new ArrayList<>();
        VoidVisitor<List<String>> fieldNameCollector = new fieldNameCollector();
        fieldNameCollector.visit(cu, fieldNames);
        fieldNames.forEach(n->System.out.println("Field name collected: "+n));
        /*
        Collect package names (If any)
         */
        List<String> packageName = new ArrayList<>();
        VoidVisitor<List<String>> packageNameVisitor = new PackageNameCollector();
        packageNameVisitor.visit(cu,packageName);
        packageName.forEach(n->System.out.println("Package name collected: "+n));

        /*
        Collect variable names (If any)
         */
        List<String> variableNames = new ArrayList<>();
        VoidVisitor<List<String>> variableNameCollector = new VarNameCollector();
        variableNameCollector.visit(cu, variableNames);
        variableNames.forEach(n->System.out.println("Variable name collected: "+n));
        /*
        Collect JavaDoc (If any)
         */
        List<String> JavaDocComments = new ArrayList<>();
        VoidVisitor<List<String>> JavaDocCollector = new JavaDocCollector();
        JavaDocCollector.visit(cu, JavaDocComments);
        JavaDocComments.forEach(n->System.out.println("JavaDoc collected: "+n));


        File projectDirectory = new File("EvoSuiteBenchmark/1_tullibee/src/");
        List<File> javaFiles = JavaSearcher.findJavaFiles(projectDirectory);
        for (File javaFile : javaFiles) {
            System.out.println(javaFile.getAbsolutePath());
        }

    }
}
