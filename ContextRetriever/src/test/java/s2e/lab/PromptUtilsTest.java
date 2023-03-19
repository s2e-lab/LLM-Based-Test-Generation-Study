package s2e.lab;

import com.github.javaparser.ParseProblemException;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import org.junit.jupiter.api.Test;
import s2e.lab.searcher.JavaSearcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static s2e.lab.TestPromptCreator.SF100_EVOSUITE;

public class PromptUtilsTest {

    @Test
    void testPrimaryClassIsFirst() {
        CompilationUnit cu = StaticJavaParser.parse("package s2e.lab;\nclass PromptUtils {}\nclass PromptUtilsTest {} ");
        ClassOrInterfaceDeclaration primaryClass = PromptUtils.getPrimaryClass(cu);
        assertEquals("PromptUtils", primaryClass.getNameAsString());
    }


    @Test
    void testPrimaryPublicClass() throws FileNotFoundException {
        String path = PromptUtils.class.getClassLoader().getResource("Example1.java").getPath();
        CompilationUnit cu = StaticJavaParser.parse(new File(path));
        ClassOrInterfaceDeclaration primaryClass = PromptUtils.getPrimaryClass(cu);
        assertEquals("Example1", primaryClass.getNameAsString());
    }

    @Test
    void testGetTestableMethods() throws FileNotFoundException {
        CompilationUnit cu = StaticJavaParser.parse("package s2e.lab;\n" +
                "class PromptUtils {\n" +
                "\tpublic String testableMethod1(int n) {}\n" +
                "\tpublic String testableMethod2(Integer a, int n) {}\n" +
                "\tpublic void nonTestableMethod1(Integer a, int n) {}\n" +
                "\tpublic Void nonTestableMethod2(Integer a, int n) {}\n" +
                "\tprotected String nonTestableMethod3(Integer a, int n) {}\n" +
                "\tpublic static List testableMethod3(Integer a, int n) {}\n" +
                "\tpublic List getName() {}\n" +
                "\tpublic void setName() {}\n" +
                "\tpublic String toString() {}\n" +
                "\tpublic void setNewRecord(boolean isNewRecord) { this.isNewRecord = isNewRecord; }\n" +
                "\tpublic boolean isNewRecord() { return this.isNewRecord; }\n" +
                "\tpublic Boolean getNewRecord() { return this.isNewRecord; }\n" +
                "}\nclass PromptUtilsTest {} ");
        List<String> testableMethods = PromptUtils.getTestableMethods(PromptUtils.getPrimaryClass(cu), false).stream().map(m -> m.getSignature().toString()).collect(Collectors.toList());
        assertEquals(3, testableMethods.size());
        assertEquals("testableMethod1(int)", testableMethods.get(0));
        assertEquals("testableMethod2(Integer, int)", testableMethods.get(1));
        assertEquals("testableMethod3(Integer, int)", testableMethods.get(2));
    }


    @Test
    void testGetTestableMethodsFromPublicClass() throws FileNotFoundException {
        CompilationUnit cu = StaticJavaParser.parse("package s2e.lab;\n" +
                "class PromptUtils {\n" +
                "\tpublic String testableMethod1(int n) {}\n" +
                "\tpublic String testableMethod2(Integer a, int n) {}\n" +
                "\tpublic void nonTestableMethod1(Integer a, int n) {}\n" +
                "\tpublic Void nonTestableMethod2(Integer a, int n) {}\n" +
                "\tprotected String nonTestableMethod3(Integer a, int n) {}\n" +
                "\tpublic static List testableMethod3(Integer a, int n) {}\n" +
                "\tpublic List getName() {}\n" +
                "\tpublic void setName() {}\n" +
                "\tpublic String toString() {}\n" +
                "\tpublic void setNewRecord(boolean isNewRecord) { this.isNewRecord = isNewRecord; }\n" +
                "\tpublic boolean isNewRecord() { return this.isNewRecord; }\n" +
                "\tpublic Boolean getNewRecord() { return this.isNewRecord; }\n" +
                "}\nclass PromptUtilsTest {} ");
        List<String> testableMethods = PromptUtils.getTestableMethods(PromptUtils.getPrimaryClass(cu), true).stream().map(m -> m.getSignature().toString()).collect(Collectors.toList());
        assertEquals(0, testableMethods.size());

    }


    @Test
    public void testHasGoodJavadoc() throws IOException {

        List<File> projectList = JavaSearcher.getProjectList(SF100_EVOSUITE);
        for (File project : projectList) {
//            System.out.println(project.getName());
            List<File> javaFiles = JavaSearcher.findJavaFiles(project);


            for (File javaFile : javaFiles) {
                // is it a test class?
                if (javaFile.getPath().toLowerCase().contains("/test/")) continue;
                try {
                    CompilationUnit cu = StaticJavaParser.parse(javaFile);
                    // get the class declaration
                    ClassOrInterfaceDeclaration classDeclaration = PromptUtils.getPrimaryClass(cu);
                    // Sometimes a Java file contains just a single enumeration or something else other than a class
                    // getPrimaryClass(...) will return null in this case
                    if (classDeclaration != null) {
                        // collect the testable method's names (only if the class is also testable)
                        List<MethodDeclaration> testableMethods = PromptUtils.getTestableMethods(classDeclaration, true);
                        for (MethodDeclaration m : testableMethods) {
                            if (!PromptUtils.hasGoodJavadoc(m) && m.getJavadoc().isPresent()) {
                                System.out.println(m.getJavadoc().isPresent() ? m.getJavadoc().get().toText() : "<MISSING>");
                                System.out.println(m.getDeclarationAsString(true, true, true));
                                System.out.println("--------------------------------------------------");
                            }
                        }
                    }
                } catch (ParseProblemException e) {
                    System.err.println("Parsing error for Java File " + javaFile.getName());
                }

            }
        }
    }

}