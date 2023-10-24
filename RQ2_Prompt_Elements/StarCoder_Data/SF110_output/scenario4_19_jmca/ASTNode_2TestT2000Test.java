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
    * - type: "class"
    * - identity: "MyClass"
    * - parent: null
    * - children: 0
    */
    @Test
    void testCreateTree001() {
        ASTNode node = new ASTNode("class", "MyClass", null);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("class MyClass", tree.toString());
        assertEquals(0, tree.getChildCount());
    }

    /**
    * Test case number: 2
    * Test case values:
    * - type: "class"
    * - identity: "MyClass"
    * - parent: null
    * - children: 1
    */
    @Test
    void testCreateTree002() {
        ASTNode node = new ASTNode("class", "MyClass", null);
        ASTNode child = new ASTNode("method", "method1", node);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("class MyClass", tree.toString());
        assertEquals(1, tree.getChildCount());
        assertEquals("method method1", tree.getChildAt(0).toString());
    }

    /**
    * Test case number: 3
    * Test case values:
    * - type: "class"
    * - identity: "MyClass"
    * - parent: null
    * - children: 2
    */
    @Test
    void testCreateTree003() {
        ASTNode node = new ASTNode("class", "MyClass", null);
        ASTNode child1 = new ASTNode("method", "method1", node);
        ASTNode child2 = new ASTNode("method", "method2", node);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("class MyClass", tree.toString());
        assertEquals(2, tree.getChildCount());
        assertEquals("method method1", tree.getChildAt(0).toString());
        assertEquals("method method2", tree.getChildAt(1).toString());
    }

    /**
    * Test case number: 4
    * Test case values:
    * - type: "class"
    * - identity: "MyClass"
    * - parent: null
    * - children: 2
    */
    @Test
    void testCreateTree004() {
        ASTNode node = new ASTNode("class", "MyClass", null);
        ASTNode child1 = new ASTNode("method", "method1", node);
        ASTNode child2 = new ASTNode("method", "method2", node);
        ASTNode child11 = new ASTNode("method", "method11", child1);
        ASTNode child12 = new ASTNode("method", "method12", child1);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("class MyClass", tree.toString());
        assertEquals(2, tree.getChildCount());
        assertEquals("method method1", tree.getChildAt(0).toString());
        assertEquals("method method2", tree.getChildAt(1).toString());
        assertEquals(2, tree.getChildAt(0).getChildCount());
        assertEquals("method method11", tree.getChildAt(0).getChildAt(0).toString());
        assertEquals("method method12", tree.getChildAt(0).getChildAt(1).toString());
    }

    /**
    * Test case number: 5
    * Test case values:
    * - type: "class"
    * - identity: "MyClass"
    * - parent: null
    * - children: 2
    */
    @Test
    void testCreateTree005() {
        ASTNode node = new ASTNode("class", "MyClass", null);
        ASTNode child1 = new ASTNode("method", "method1", node);
        ASTNode child2 = new ASTNode("method", "method2", node);
        ASTNode child11 = new ASTNode("method", "method11", child1);
        ASTNode child12 = new ASTNode("method", "method12", child1);
        ASTNode child21 = new ASTNode("method", "method21", child2);
        ASTNode child22 = new ASTNode("method", "method22", child2);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("class MyClass", tree.toString());
        assertEquals(2, tree.getChildCount());
        assertEquals("method method1", tree.getChildAt(0).toString());
        assertEquals("method method2", tree.getChildAt(1).toString());
        assertEquals(2, tree.getChildAt(0).getChildCount());
        assertEquals("method method11", tree.getChildAt(0).getChildAt(0).toString());
        assertEquals("method method12", tree.getChildAt(0).getChildAt(1).toString());
        assertEquals(2, tree.getChildAt(1).getChildCount());
        assertEquals("method method21", tree.getChildAt(1).getChildAt(0).toString());
        assertEquals("method method22", tree.getChildAt(1).getChildAt(1).toString());
    }

    /**
    * Test case number: 6
    * Test case values:
    * - type: "class"
    * - identity: "MyClass"
    * - parent: null
    * - children: 2
    */
    @Test
    void testCreateTree006() {
        ASTNode node = new ASTNode("class", "MyClass", null);
        ASTNode child1 = new ASTNode("method", "method1", node);
        ASTNode child2 = new ASTNode("method", "method2", node);
        ASTNode child11 = new ASTNode("method", "method11", child1);
        ASTNode child12 = new ASTNode("method", "method12", child1);
        ASTNode child21 = new ASTNode("method", "method21", child2);
        ASTNode child22 = new ASTNode("method", "method22", child2);
        ASTNode child111 = new ASTNode("method", "method111", child11);
        ASTNode child112 = new ASTNode("method", "method112", child11);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("class MyClass", tree.toString());
        assertEquals(2, tree.getChildCount());
        assertEquals("method method1", tree.getChildAt(0).toString());
        assertEquals("method method2", tree.getChildAt(1).toString());
        assertEquals(2, tree.getChildAt(0).getChildCount());
        assertEquals("method method11", tree.getChildAt(0).getChildAt(0).toString());
        assertEquals("method method12", tree.getChildAt(0).getChildAt(1).toString());
        assertEquals(2, tree.getChildAt(1).getChildCount());
        assertEquals("method method21", tree.getChildAt(1).getChildAt(0).toString());
        assertEquals("method method22", tree.getChildAt(1).getChildAt(1).toString());
        assertEquals(2, tree.getChildAt(0).getChildAt(0).getChildCount());
        assertEquals("method method111", tree.getChildAt(0).getChildAt(0).getChildAt(0).toString());
        assertEquals("method method112", tree.getChildAt(0).getChildAt(0).getChildAt(1).toString());
    }

    /**
    * Test case number: 7
    * Test case values:
    * - type: "class"
    * - identity: "MyClass"
    * - parent: null
    * - children: 2
    */
    @Test
    void testCreateTree007() {
        ASTNode node = new ASTNode("class", "MyClass", null);
        ASTNode child1 = new ASTNode("method", "method1", node);
        ASTNode child2 = new ASTNode("method", "method2", node);
        ASTNode child11 = new ASTNode("method", "method11", child1);
        ASTNode child12 = new ASTNode("method", "method12", child1);
        ASTNode child21 = new ASTNode("method", "method21", child2);
        ASTNode child22 = new ASTNode("method", "method22", child2);
        ASTNode child111 = new ASTNode("method", "method111", child11);
        ASTNode child112 = new ASTNode("method", "method112", child11);
        ASTNode child221 = new ASTNode("method", "method221", child22);
        ASTNode child222 = new ASTNode("method", "method222", child22);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("class MyClass", tree.toString());
        assertEquals(2, tree.getChildCount());
        assertEquals("method method1", tree.getChildAt(0).toString());
        assertEquals("method method2", tree.getChildAt(1).toString());
        assertEquals(2, tree.getChildAt(0).getChildCount());
        assertEquals("method method11", tree.getChildAt(0).getChildAt(0).toString