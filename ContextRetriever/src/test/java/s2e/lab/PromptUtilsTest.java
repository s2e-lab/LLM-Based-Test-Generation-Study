package s2e.lab;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
                "}\nclass PromptUtilsTest {} ");
        List<String> testableMethods = PromptUtils.getTestableMethodSignatures(PromptUtils.getPrimaryClass(cu));
        assertEquals(3, testableMethods.size());
        assertEquals("testableMethod1(int)", testableMethods.get(0));
        assertEquals("testableMethod2(Integer, int)", testableMethods.get(1));
        assertEquals("testableMethod3(Integer, int)", testableMethods.get(2));
    }
}