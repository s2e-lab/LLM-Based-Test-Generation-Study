// ASTNode_2Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#createTree()} method.
*/
class ASTNode_2Test {

    /**
    * Test case number: 1
    * Test case values:
    * -
    */
    @Test
    void testCreateTree001() {
        ASTNode_2 astNode = new ASTNode_2();
        ArrayList<ASTNode_2> list = new ArrayList<ASTNode_2>();
        ASTNode_2 node = new ASTNode_2();
        list.add(node);
        astNode.list = list;
        DefaultMutableTreeNode result = astNode.createTree();
        assertNotNull(result);
    }

    /**
    * Test case number: 2
    * Test case values:
    * -
    */
    @Test
    void testCreateTree002() {
        ASTNode_2 astNode = new ASTNode_2();
        ArrayList<ASTNode_2> list = new ArrayList<ASTNode_2>();
        ASTNode_2 node = new ASTNode_2();
        ASTNode_2 node2 = new ASTNode_2();
        list.add(node);
        list.add(node2);
        astNode.list = list;
        DefaultMutableTreeNode result = astNode.createTree();
        assertNotNull(result);
    }

    /**
    * Test case number: 3
    * Test case values:
    * -
    */
    @Test
    void testCreateTree003() {
        ASTNode_2 astNode = new ASTNode_2();
        ArrayList<ASTNode_2> list = new ArrayList<ASTNode_2>();
        ASTNode_2 node = new ASTNode_2();
        ASTNode_2 node2 = new ASTNode_2();
        ASTNode_2 node3 = new ASTNode_2();
        list.add(node);
        list.add(node2);
        list.add(node3);
        astNode.list = list;
        DefaultMutableTreeNode result = astNode.createTree();
        assertNotNull(result);
    }

    /**
    * Test case number: 4
    * Test case values:
    * -
    */
    @Test
    void testCreateTree004() {
        ASTNode_2 astNode = new ASTNode_2();
        ArrayList<ASTNode_2> list = new ArrayList<ASTNode_2>();
        ASTNode_2 node = new ASTNode_2();
        ASTNode_2 node2 = new ASTNode_2();
        ASTNode_2 node3 = new ASTNode_2();
        ASTNode_2 node4 = new ASTNode_2();
        list.add(node);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        astNode.list = list;
        DefaultMutableTreeNode result = astNode.createTree();
        assertNotNull(result);
    }

    /**
    * Test case number: 5
    * Test case values:
    * -
    */
    @Test
    void testCreateTree005() {
        ASTNode_2 astNode = new ASTNode_2();
        ArrayList<ASTNode_2> list = new ArrayList<ASTNode_2>();
        ASTNode_2 node = new ASTNode_2();
        ASTNode_2 node2 = new ASTNode_2();
        ASTNode_2 node3 = new ASTNode_2();
        ASTNode_2 node4 = new ASTNode_2();
        ASTNode_2 node5 = new ASTNode_2();
        list.add(node);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.add(node5);
        astNode.list = list;
        DefaultMutableTreeNode result = astNode.createTree();
        assertNotNull(result);
    }

    /**
    * Test case number: 6
    * Test case values:
    * -
    */
    @Test
    void testCreateTree006() {
        ASTNode_2 astNode = new ASTNode_2();
        ArrayList<ASTNode_2> list = new ArrayList<ASTNode_2>();
        ASTNode_2 node = new ASTNode_2();
        ASTNode_2 node2 = new ASTNode_2();
        ASTNode_2 node3 = new ASTNode_2();
        ASTNode_2 node4 = new ASTNode_2();
        ASTNode_2 node5 = new ASTNode_2();
        ASTNode_2 node6 = new ASTNode_2();
        list.add(node);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.add(node5);
        list.add(node6);
        astNode.list = list;
        DefaultMutableTreeNode result = astNode.createTree();
        assertNotNull(result);
    }

    /**
    * Test case number: 7
    * Test case values:
    * -
    */
    @Test
    void testCreateTree007() {
        ASTNode_2 astNode = new ASTNode_2();
        ArrayList<ASTNode_2> list = new ArrayList<ASTNode_2>();
        ASTNode_2 node = new ASTNode_2();
        ASTNode_2 node2 = new ASTNode_2();
        ASTNode_2 node3 = new ASTNode_2();
        ASTNode_2 node4 = new ASTNode_2();
        ASTNode_2 node5 = new ASTNode_2();
        ASTNode_2 node6 = new ASTNode_2();
        ASTNode_2 node7 = new ASTNode_2();
        list.add(node);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.add(node5);
        list.add(node6);
        list.add(node7);
        astNode.list = list;
        DefaultMutableTreeNode result = astNode.createTree();
        assertNotNull(result);
    }

    /**
    * Test case number: 8
    * Test case values:
    * -
    */
    @Test
    void testCreateTree008() {
        ASTNode_2 astNode = new ASTNode_2();
        ArrayList<ASTNode_2> list = new ArrayList<ASTNode_2>();
        ASTNode_2 node = new ASTNode_2();
        ASTNode_2 node2 = new ASTNode_2();
        ASTNode_2 node3 = new ASTNode_2();
        ASTNode_2 node4 = new ASTNode_2();
        ASTNode_2 node5 = new ASTNode_2();
        ASTNode_2 node6 = new ASTNode_2();
        ASTNode_2 node7 = new ASTNode_2();
        ASTNode_2 node8 = new ASTNode_2();
        list.add(node);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.add(node5);
        list.add(node6);
        list.add(node7);
        list.add(node8);
        astNode.list = list;
        DefaultMutableTreeNode result = astNode.createTree();
        assertNotNull(result);
    }

    /**
    * Test case number: 9
    * Test case values:
    * -
    */
    @Test
    void testCreateTree009() {
        ASTNode_2 astNode = new ASTNode_2();
        ArrayList<ASTNode_2> list = new ArrayList<ASTNode_2>();
        ASTNode_2 node = new ASTNode_2();
        ASTNode_2 node2 = new ASTNode_2();
        ASTNode_2 node3 = new ASTNode_2();
        ASTNode_2 node4 = new ASTNode_2();
        ASTNode_2 node5 = new ASTNode_2();
        ASTNode_2 node6 = new ASTNode_2();
        ASTNode_2 node7 = new ASTNode_2();
        ASTNode_2 node8 = new ASTNode_2();
        ASTNode_2 node9 = new ASTNode_2();
        list.add(node);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.add(node5);
        list.add(node6);
        list.add(node7);
        list.add(node8);
        list.add(node9);
        astNode.list = list;
        DefaultMutableTreeNode result = astNode.createTree();
        assertNotNull(result);
    }

    /**
    * Test case number: 10
    * Test case values:
    * -
    */
    @Test
    void testCreateTree010() {
        ASTNode_2 astNode = new ASTNode_2();
        ArrayList<ASTNode_2> list = new ArrayList<ASTNode_2>();
        ASTNode_2 node = new ASTNode_2();
        ASTNode_2 node2 = new ASTNode_2();
        ASTNode_2 node3 = new ASTNode_2();
        ASTNode_2 node4 = new ASTNode_2();
        ASTNode_2 node5 = new ASTNode_2();
        ASTNode_2 node6 = new ASTNode_2();
        ASTNode_2 node7 = new ASTNode_2();
        ASTNode_2 node8 = new ASTNode_2();
        ASTNode_2 node9 = new ASTNode_2