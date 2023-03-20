package s2e.lab;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitor;
import s2e.lab.searcher.JavaSearcher;
import s2e.lab.visitors.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Extractor {


    public static void main(String[] args) throws IOException {

        File projectDirectory = new File("../EvoSuiteBenchmark/1_tullibee/src/main");
        List<File> javaFiles = JavaSearcher.findJavaFiles(projectDirectory);
        HashMap<File, CompilationUnit> javaFileCompilationUnitHashMap = new HashMap<>();

        for (File javaFile : javaFiles) {
            CompilationUnit cu = StaticJavaParser.parse(javaFile.getAbsoluteFile());
            javaFileCompilationUnitHashMap.putIfAbsent(javaFile, cu);
        }


        //print the results for each file
        for (File javaFile : javaFileCompilationUnitHashMap.keySet()) {
            System.out.println("File: " + javaFile.getName());


            //collect the package names
            List<String> packageNames = new ArrayList<>();
            VoidVisitor<List<String>> packageNameCollector = new PackageNameCollector();
            packageNameCollector.visit(javaFileCompilationUnitHashMap.get(javaFile), packageNames);
            System.out.println("Package Names: " + packageNames);

            //collect the import names
            List<String> importNames = new ArrayList<>();
            javaFileCompilationUnitHashMap.get(javaFile).getImports().forEach(i -> importNames.add(i.getNameAsString()));
            importNames.forEach(System.out::println);

            //collect the class names
            List<String> classNames = new ArrayList<>();
            VoidVisitor<List<String>> classNameCollector = new ClassNameCollector();
            classNameCollector.visit(javaFileCompilationUnitHashMap.get(javaFile), classNames);
            System.out.println("Class Names: " + classNames);

            //collect the field names
            List<String> fieldNames = new ArrayList<>();
            VoidVisitor<List<String>> fieldNameCollector = new FieldNameCollector();
            fieldNameCollector.visit(javaFileCompilationUnitHashMap.get(javaFile), fieldNames);
            System.out.println("Field Names: " + fieldNames);

            //collect the variable names
            List<String> varNames = new ArrayList<>();
            VoidVisitor<List<String>> varNameCollector = new VarNameCollector();
            varNameCollector.visit(javaFileCompilationUnitHashMap.get(javaFile), varNames);
            System.out.println("Variable Names: " + varNames);

            //collect the javadoc comments
            List<String> javadocComments = new ArrayList<>();
            VoidVisitor<List<String>> javadocCollector = new JavaDocCollector();
            javadocCollector.visit(javaFileCompilationUnitHashMap.get(javaFile), javadocComments);
            System.out.println("Javadoc Comments: " + javadocComments);

            //collect the method names
            List<String> methodNames = new ArrayList<>();
            VoidVisitor<List<String>> methodNameCollector = new MethodsCollector();
            methodNameCollector.visit(javaFileCompilationUnitHashMap.get(javaFile), methodNames);
            System.out.println("Method Names: " + methodNames);

            //collect extended class names
            List<String> extendedClassNames = new ArrayList<>();
            VoidVisitor<List<String>> extendedClassNameCollector = new ExtendedNameCollector();
            extendedClassNameCollector.visit(javaFileCompilationUnitHashMap.get(javaFile), extendedClassNames);
            System.out.println("Extended Class Names: " + extendedClassNames);

            //collect implemented interface names
            List<String> implementedInterfaceNames = new ArrayList<>();
            VoidVisitor<List<String>> implementedInterfaceNameCollector = new ImplementedNameCollector();
            implementedInterfaceNameCollector.visit(javaFileCompilationUnitHashMap.get(javaFile), implementedInterfaceNames);
            System.out.println("Implemented Interface Names: " + implementedInterfaceNames);


        }
    }
}
