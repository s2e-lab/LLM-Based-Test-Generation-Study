// JMCAAnalyzerTest.java
package com.soops.CEN4010.JMCA;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAAnalyzer}.
* It contains ten unit test cases for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
*/
class JMCAAnalyzerTest {

    /**
    * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
    * It tests the case when the file does not parse correctly.
    */
    @Test
    void testAnalyzeFileNotParsedCorrectly() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = null;
        String result = analyzer.analyze(root);
        assertEquals("File did not parse correctly", result);
    }

    /**
    * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
    * It tests the case when the file does not contain any classes.
    */
    @Test
    void testAnalyzeFileContainsNoClasses() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode("CompilationUnit");
        String result = analyzer.analyze(root);
        assertEquals("File contains no classes", result);
    }

    /**
    * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
    * It tests the case when the file contains one class.
    */
    @Test
    void testAnalyzeFileContainsOneClass() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode("CompilationUnit");
        ASTNode classNode = new ASTNode("ClassDeclaration");
        classNode.setAttribute("name", "Test");
        root.add(classNode);
        String result = analyzer.analyze(root);
        assertEquals("Test", result);
    }

    /**
    * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
    * It tests the case when the file contains two classes.
    */
    @Test
    void testAnalyzeFileContainsTwoClasses() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode("CompilationUnit");
        ASTNode classNode1 = new ASTNode("ClassDeclaration");
        classNode1.setAttribute("name", "Test1");
        root.add(classNode1);
        ASTNode classNode2 = new ASTNode("ClassDeclaration");
        classNode2.setAttribute("name", "Test2");
        root.add(classNode2);
        String result = analyzer.analyze(root);
        assertEquals("Test1\nTest2", result);
    }

    /**
    * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
    * It tests the case when the file contains a class with no methods.
    */
    @Test
    void testAnalyzeFileContainsClassWithNoMethods() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode("CompilationUnit");
        ASTNode classNode = new ASTNode("ClassDeclaration");
        classNode.setAttribute("name", "Test");
        root.add(classNode);
        String result = analyzer.analyze(root);
        assertEquals("Test", result);
    }

    /**
    * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
    * It tests the case when the file contains a class with one method.
    */
    @Test
    void testAnalyzeFileContainsClassWithOneMethod() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode("CompilationUnit");
        ASTNode classNode = new ASTNode("ClassDeclaration");
        classNode.setAttribute("name", "Test");
        ASTNode methodNode = new ASTNode("MethodDeclaration");
        methodNode.setAttribute("name", "test");
        classNode.add(methodNode);
        root.add(classNode);
        String result = analyzer.analyze(root);
        assertEquals("Test\n\ttest", result);
    }

    /**
    * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
    * It tests the case when the file contains a class with two methods.
    */
    @Test
    void testAnalyzeFileContainsClassWithTwoMethods() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode("CompilationUnit");
        ASTNode classNode = new ASTNode("ClassDeclaration");
        classNode.setAttribute("name", "Test");
        ASTNode methodNode1 = new ASTNode("MethodDeclaration");
        methodNode1.setAttribute("name", "test1");
        classNode.add(methodNode1);
        ASTNode methodNode2 = new ASTNode("MethodDeclaration");
        methodNode2.setAttribute("name", "test2");
        classNode.add(methodNode2);
        root.add(classNode);
        String result = analyzer.analyze(root);
        assertEquals("Test\n\ttest1\n\ttest2", result);
    }

    /**
    * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
    * It tests the case when the file contains a class with a method with no statements.
    */
    @Test
    void testAnalyzeFileContainsClassWithMethodWithNoStatements() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode("CompilationUnit");
        ASTNode classNode = new ASTNode("ClassDeclaration");
        classNode.setAttribute("name", "Test");
        ASTNode methodNode = new ASTNode("MethodDeclaration");
        methodNode.setAttribute("name", "test");
        classNode.add(methodNode);
        root.add(classNode);
        String result = analyzer.analyze(root);
        assertEquals("Test\n\ttest", result);
    }

    /**
    * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
    * It tests the case when the file contains a class with a method with one statement.
    */
    @Test
    void testAnalyzeFileContainsClassWithMethodWithOneStatement() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode("CompilationUnit");
        ASTNode classNode = new ASTNode("ClassDeclaration");
        classNode.setAttribute("name", "Test");
        ASTNode methodNode = new ASTNode("MethodDeclaration");
        methodNode.setAttribute("name", "test");
        ASTNode statementNode = new ASTNode("Statement");
        methodNode.add(statementNode);
        classNode.add(methodNode);
        root.add(classNode);
        String result = analyzer.analyze(root);
        assertEquals("Test\n\ttest\n\t\tStatement", result);
    }

    /**
    * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
    * It tests the case when the file contains a class with a method with two statements.
    */
    @Test
    void testAnalyzeFileContainsClassWithMethodWithTwoStatements() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode("CompilationUnit");
        ASTNode classNode = new ASTNode("ClassDeclaration");
        classNode.setAttribute("name", "Test");
        ASTNode methodNode = new ASTNode("MethodDeclaration");
        methodNode.setAttribute("name", "test");
        ASTNode statementNode1 = new ASTNode("Statement");
        methodNode.add(statementNode1);
        ASTNode statementNode2 = new ASTNode("Statement");
        methodNode.add(statementNode2);
        classNode.add(methodNode);
        root.add(classNode);
        String result = analyzer.analyze(root);
        assertEquals("Test\n\ttest\n\t\tStatement\n\t\tStatement", result);
    }
}
