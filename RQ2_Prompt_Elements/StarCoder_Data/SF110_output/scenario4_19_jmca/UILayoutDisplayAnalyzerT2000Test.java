// UILayoutDisplayAnalyzerTest.java
package com.soops.CEN4010.JMCA;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UILayoutDisplayAnalyzer}.
* It contains ten unit test cases for the {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
*/
class UILayoutDisplayAnalyzerTest {

    /**
     * Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
     * It tests the display of a simple class with one method.
     */
    @Test
    void testAnalyze() {
        UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
        analyzer.setFileName("testAnalyze");
        ASTNode dummy = new ASTNode();
        String expected = "testAnalyze\n" +
                "  ClassDeclaration\n" +
                "    ClassBody\n" +
                "      MethodDeclaration\n" +
                "        Type: void\n" +
                "        Name: main\n" +
                "        FormalParameters\n" +
                "          FormalParameter\n" +
                "            Type: String[]\n" +
                "            Name: args\n" +
                "        Block\n" +
                "          BlockStatement\n" +
                "            ExpressionStatement\n" +
                "              MethodInvocation\n" +
                "                Name: System.out.println\n" +
                "                ActualParameters\n" +
                "                  StringLiteral\n" +
                "                    Value: Hello World!\n";
        String actual = analyzer.analyze(dummy);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
     * It tests the display of a simple class with one method.
     */
    @Test
    void testAnalyze2() {
        UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
        analyzer.setFileName("testAnalyze2");
        ASTNode dummy = new ASTNode();
        String expected = "testAnalyze2\n" +
                "  ClassDeclaration\n" +
                "    ClassBody\n" +
                "      MethodDeclaration\n" +
                "        Type: void\n" +
                "        Name: main\n" +
                "        FormalParameters\n" +
                "          FormalParameter\n" +
                "            Type: String[]\n" +
                "            Name: args\n" +
                "        Block\n" +
                "          BlockStatement\n" +
                "            ExpressionStatement\n" +
                "              MethodInvocation\n" +
                "                Name: System.out.println\n" +
                "                ActualParameters\n" +
                "                  StringLiteral\n" +
                "                    Value: Hello World!\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: i\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 0\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: j\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 1\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: k\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 2\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: l\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 3\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: m\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 4\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: n\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 5\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: o\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 6\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: p\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 7\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: q\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 8\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: r\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 9\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: s\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 10\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: t\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 11\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: u\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 12\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: v\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 13\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: w\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 14\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: x\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 15\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: y\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 16\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: z\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 17\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: a\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 18\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: b\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 19\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: c\n" +
                "              Initializer\n" +
                "                IntegerLiteral\n" +
                "                  Value: 20\n" +
                "          BlockStatement\n" +
                "            LocalVariableDeclaration\n" +
                "              Type: int\n" +
                "              Name: d\