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
    * Test method for {@link ASTNode#getTree(String)}.
    */
    @Test
    void testGetTree() {
        ASTNode rootNode = ASTNode.getTree("ASTNode_1.ser");
        assertNotNull(rootNode);
        assertEquals("Program", rootNode.getType());
        assertEquals("Program", rootNode.getIdentity());
        assertEquals(1, rootNode.list.size());
        assertEquals("Class", rootNode.list.get(0).getType());
        assertEquals("Class", rootNode.list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.size());
        assertEquals("Method", rootNode.list.get(0).list.get(0).getType());
        assertEquals("main", rootNode.list.get(0).list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.get(0).list.size());
        assertEquals("Block", rootNode.list.get(0).list.get(0).list.get(0).getType());
        assertEquals("Block", rootNode.list.get(0).list.get(0).list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.get(0).list.get(0).list.size());
        assertEquals("Statement", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).getType());
        assertEquals("Statement", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.size());
        assertEquals("Assignment", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getType());
        assertEquals("Assignment", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.size());
        assertEquals("Expression", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getType());
        assertEquals("Expression", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.size());
        assertEquals("Variable", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getType());
        assertEquals("x", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.size());
        assertEquals("Literal", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getType());
        assertEquals("1", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.size());
        assertEquals("Expression", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getType());
        assertEquals("Expression", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.size());
        assertEquals("Variable", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getType());
        assertEquals("y", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.size());
        assertEquals("Literal", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getType());
        assertEquals("2", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.size());
        assertEquals("Expression", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getType());
        assertEquals("Expression", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getIdentity());
        assertEquals(1, rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.size());
        assertEquals("Variable", rootNode.list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).list.get(0).getType());
        assertEquals("z", rootNode.list.get(0).list.get(0).list.get(0).