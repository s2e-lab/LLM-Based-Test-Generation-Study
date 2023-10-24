// ASTNode_1Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#getTree(String)} method.
*/
class ASTNode_1Test {

    /**
    * Test case number: 1
    * Test case values: "ASTNode_1.txt"
    * Expected test result: <br>
    * <pre>
    * ASTNode_1
    *   ASTNode_2
    *     ASTNode_3
    *       ASTNode_4
    *         ASTNode_5
    *           ASTNode_6
    *             ASTNode_7
    *               ASTNode_8
    *                 ASTNode_9
    *                   ASTNode_10
    * </pre>
    */
    @Test
    void testGetTree_1() {
        String filename = "ASTNode_1.txt";
        ASTNode root = ASTNode.getTree(filename);
        assertNotNull(root);
        assertEquals("ASTNode_1", root.getType());
        assertEquals("ASTNode_1", root.getIdentity());
        assertEquals(0, root.compareTo(root));
        assertEquals(0, root.compareTo(root.getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent()));
        assertEquals(0, root.compareTo(root.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent