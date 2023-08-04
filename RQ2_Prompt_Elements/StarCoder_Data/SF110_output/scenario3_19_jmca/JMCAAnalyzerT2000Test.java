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
     * Test case for {@link JMCAAnalyzer#analyze(ASTNode)}.
     * It tests the case when the ASTree is empty.
     */
    @Test
    void testAnalyzeEmptyASTree() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode();
        String expected = "";
        String actual = analyzer.analyze(root);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link JMCAAnalyzer#analyze(ASTNode)}.
     * It tests the case when the ASTree is not empty.
     */
    @Test
    void testAnalyzeNonEmptyASTree() {
        JMCAAnalyzer analyzer = new JMCAAnalyzer();
        ASTNode root = new ASTNode();
        ASTNode node1 = new ASTNode();
        ASTNode node2 = new ASTNode();
        ASTNode node3 = new ASTNode();
        ASTNode node4 = new ASTNode();
        ASTNode node5 = new ASTNode();
        ASTNode node6 = new ASTNode();
        ASTNode node7 = new ASTNode();
        ASTNode node8 = new ASTNode();
        ASTNode node9 = new ASTNode();
        ASTNode node10 = new ASTNode();
        ASTNode node11 = new ASTNode();
        ASTNode node12 = new ASTNode();
        ASTNode node13 = new ASTNode();
        ASTNode node14 = new ASTNode();
        ASTNode node15 = new ASTNode();
        ASTNode node16 = new ASTNode();
        ASTNode node17 = new ASTNode();
        ASTNode node18 = new ASTNode();
        ASTNode node19 = new ASTNode();
        ASTNode node20 = new ASTNode();
        ASTNode node21 = new ASTNode();
        ASTNode node22 = new ASTNode();
        ASTNode node23 = new ASTNode();
        ASTNode node24 = new ASTNode();
        ASTNode node25 = new ASTNode();
        ASTNode node26 = new ASTNode();
        ASTNode node27 = new ASTNode();
        ASTNode node28 = new ASTNode();
        ASTNode node29 = new ASTNode();
        ASTNode node30 = new ASTNode();
        ASTNode node31 = new ASTNode();
        ASTNode node32 = new ASTNode();
        ASTNode node33 = new ASTNode();
        ASTNode node34 = new ASTNode();
        ASTNode node35 = new ASTNode();
        ASTNode node36 = new ASTNode();
        ASTNode node37 = new ASTNode();
        ASTNode node38 = new ASTNode();
        ASTNode node39 = new ASTNode();
        ASTNode node40 = new ASTNode();
        ASTNode node41 = new ASTNode();
        ASTNode node42 = new ASTNode();
        ASTNode node43 = new ASTNode();
        ASTNode node44 = new ASTNode();
        ASTNode node45 = new ASTNode();
        ASTNode node46 = new ASTNode();
        ASTNode node47 = new ASTNode();
        ASTNode node48 = new ASTNode();
        ASTNode node49 = new ASTNode();
        ASTNode node50 = new ASTNode();
        ASTNode node51 = new ASTNode();
        ASTNode node52 = new ASTNode();
        ASTNode node53 = new ASTNode();
        ASTNode node54 = new ASTNode();
        ASTNode node55 = new ASTNode();
        ASTNode node56 = new ASTNode();
        ASTNode node57 = new ASTNode();
        ASTNode node58 = new ASTNode();
        ASTNode node59 = new ASTNode();
        ASTNode node60 = new ASTNode();
        ASTNode node61 = new ASTNode();
        ASTNode node62 = new ASTNode();
        ASTNode node63 = new ASTNode();
        ASTNode node64 = new ASTNode();
        ASTNode node65 = new ASTNode();
        ASTNode node66 = new ASTNode();
        ASTNode node67 = new ASTNode();
        ASTNode node68 = new ASTNode();
        ASTNode node69 = new ASTNode();
        ASTNode node70 = new ASTNode();
        ASTNode node71 = new ASTNode();
        ASTNode node72 = new ASTNode();
        ASTNode node73 = new ASTNode();
        ASTNode node74 = new ASTNode();
        ASTNode node75 = new ASTNode();
        ASTNode node76 = new ASTNode();
        ASTNode node77 = new ASTNode();
        ASTNode node78 = new ASTNode();
        ASTNode node79 = new ASTNode();
        ASTNode node80 = new ASTNode();
        ASTNode node81 = new ASTNode();
        ASTNode node82 = new ASTNode();
        ASTNode node83 = new ASTNode();
        ASTNode node84 = new ASTNode();
        ASTNode node85 = new ASTNode();
        ASTNode node86 = new ASTNode();
        ASTNode node87 = new ASTNode();
        ASTNode node88 = new ASTNode();
        ASTNode node89 = new ASTNode();
        ASTNode node90 = new ASTNode();
        ASTNode node91 = new ASTNode();
        ASTNode node92 = new ASTNode();
        ASTNode node93 = new ASTNode();
        ASTNode node94 = new ASTNode();
        ASTNode node95 = new ASTNode();
        ASTNode node96 = new ASTNode();
        ASTNode node97 = new ASTNode();
        ASTNode node98 = new ASTNode();
        ASTNode node99 = new ASTNode();
        ASTNode node100 = new ASTNode();
        ASTNode node101 = new ASTNode();
        ASTNode node102 = new ASTNode();
        ASTNode node103 = new ASTNode();
        ASTNode node104 = new ASTNode();
        ASTNode node105 = new ASTNode();
        ASTNode node106 = new ASTNode();
        ASTNode node107 = new ASTNode();
        ASTNode node108 = new ASTNode();
        ASTNode node109 = new ASTNode();
        ASTNode node110 = new ASTNode();
        ASTNode node111 = new ASTNode();
        ASTNode node112 = new ASTNode();
        ASTNode node113 = new ASTNode();
        ASTNode node114 = new ASTNode();
        ASTNode node115 = new ASTNode();
        ASTNode node116 = new ASTNode();
        ASTNode node117 = new ASTNode();
        ASTNode node118 = new ASTNode();
        ASTNode node119 = new ASTNode();
        ASTNode node120 = new ASTNode();
        ASTNode node121 = new ASTNode();
        ASTNode node122 = new ASTNode();
        ASTNode node123 = new ASTNode();
        ASTNode node124 = new ASTNode();
        ASTNode node125 = new ASTNode();
        ASTNode node126 = new ASTNode();
        ASTNode node127 = new ASTNode();
        ASTNode node128 = new ASTNode();
        ASTNode node129 = new ASTNode();
        ASTNode node130 = new ASTNode();
        ASTNode node131 = new ASTNode();
        ASTNode node132 = new ASTNode();
        ASTNode node133 = new ASTNode();
        ASTNode node134 = new ASTNode();
        ASTNode node135 = new ASTNode();
        ASTNode node136 = new ASTNode();
        ASTNode node137 = new ASTNode();
        ASTNode node138 = new ASTNode();
        ASTNode node139 = new ASTNode();
        ASTNode node140 = new ASTNode();
        ASTNode node141 = new ASTNode();
        ASTNode node142 = new ASTNode();
        ASTNode node143 = new ASTNode();
        ASTNode node144 = new ASTNode();
        ASTNode node145 = new ASTNode();
        ASTNode node146 = new ASTNode();
        ASTNode node147 = new ASTNode();
        ASTNode node148 = new ASTNode();
        ASTNode node149 = new ASTNode();
        ASTNode node150 = new ASTNode();
        ASTNode node151 = new ASTNode();
        ASTNode node152 = new ASTNode();
        ASTNode node153 = new ASTNode();
        ASTNode node154 = new ASTNode();
        ASTNode node155 = new ASTNode();
        ASTNode node156 = new ASTNode();
        ASTNode node157 = new ASTNode();
        ASTNode node158 = new ASTNode();
        ASTNode node159 = new ASTNode();
        ASTNode node160 = new ASTNode();
        ASTNode node161 = new ASTNode();
        ASTNode node162 = new ASTNode();
        AST