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
     * It tests the case when the ASTree is null.
     */
    @Test
    void testAnalyzeNullASTree() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        String result = analyzer.analyze(null);
        assertEquals("File did not parse correctly", result);
    }

    /**
     * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
     * It tests the case when the ASTree is empty.
     */
    @Test
    void testAnalyzeEmptyASTree() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode();
        String result = analyzer.analyze(root);
        assertEquals("File did not parse correctly", result);
    }

    /**
     * Test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
     * It tests the case when the ASTree is not empty.
     */
    @Test
    void testAnalyzeNonEmptyASTree() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode();
        ASTNode class1 = new ASTNode("class1");
        ASTNode class2 = new ASTNode("class2");
        ASTNode class3 = new ASTNode("class3");
        ASTNode class4 = new ASTNode("class4");
        ASTNode class5 = new ASTNode("class5");
        ASTNode class6 = new ASTNode("class6");
        ASTNode class7 = new ASTNode("class7");
        ASTNode class8 = new