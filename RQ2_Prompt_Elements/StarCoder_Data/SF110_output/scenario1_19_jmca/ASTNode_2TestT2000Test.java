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
    * - list: empty
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test1() {
        ArrayList<ASTNode> list = new ArrayList<ASTNode>();
        ASTNode node = new ASTNode(list);
        assertEquals("ASTNode", node.toString());
    }

    /**
    * Test case number: 2
    * Test case values:
    * - list: "ASTNode"
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test2() {
        ArrayList<ASTNode> list = new ArrayList<ASTNode>();
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        ASTNode node = new ASTNode(list);
        assertEquals("ASTNode", node.toString());
    }

    /**
    * Test case number: 3
    * Test case values:
    * - list: "ASTNode", "ASTNode"
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test3() {
        ArrayList<ASTNode> list = new ArrayList<ASTNode>();
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        ASTNode node = new ASTNode(list);
        assertEquals("ASTNode", node.toString());
    }

    /**
    * Test case number: 4
    * Test case values:
    * - list: "ASTNode", "ASTNode", "ASTNode"
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test4() {
        ArrayList<ASTNode> list = new ArrayList<ASTNode>();
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        ASTNode node = new ASTNode(list);
        assertEquals("ASTNode", node.toString());
    }

    /**
    * Test case number: 5
    * Test case values:
    * - list: "ASTNode", "ASTNode", "ASTNode", "ASTNode"
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test5() {
        ArrayList<ASTNode> list = new ArrayList<ASTNode>();
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        ASTNode node = new ASTNode(list);
        assertEquals("ASTNode", node.toString());
    }

    /**
    * Test case number: 6
    * Test case values:
    * - list: "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode"
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test6() {
        ArrayList<ASTNode> list = new ArrayList<ASTNode>();
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        ASTNode node = new ASTNode(list);
        assertEquals("ASTNode", node.toString());
    }

    /**
    * Test case number: 7
    * Test case values:
    * - list: "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode"
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test7() {
        ArrayList<ASTNode> list = new ArrayList<ASTNode>();
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        ASTNode node = new ASTNode(list);
        assertEquals("ASTNode", node.toString());
    }

    /**
    * Test case number: 8
    * Test case values:
    * - list: "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode"
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test8() {
        ArrayList<ASTNode> list = new ArrayList<ASTNode>();
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        ASTNode node = new ASTNode(list);
        assertEquals("ASTNode", node.toString());
    }

    /**
    * Test case number: 9
    * Test case values:
    * - list: "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode"
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test9() {
        ArrayList<ASTNode> list = new ArrayList<ASTNode>();
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        ASTNode node = new ASTNode(list);
        assertEquals("ASTNode", node.toString());
    }

    /**
    * Test case number: 10
    * Test case values:
    * - list: "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode", "ASTNode"
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test10() {
        ArrayList<ASTNode> list = new ArrayList<ASTNode>();
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        list.add(new ASTNode(new ArrayList<ASTNode>()));
        ASTNode node = new ASTNode(list);
        assertEquals("ASTNode", node.toString());
    }
}

// ASTNode_3Test.java
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
class ASTNode_3Test {
		
    /**
    * Test case number: 1
    * Test case values:
    * - list: empty
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test1() {
        ArrayList<ASTNode> list = new ArrayList<ASTNode>();
        ASTNode node = new ASTNode(list);
        assertEquals("ASTNode", node.toString());
    }

    /**
    * Test case number: 2
    * Test case values:
    * - list: "ASTNode"
    * Expected result:
    * - node: "ASTNode"
    */
    @Test
    void test2() {
        ArrayList<ASTNode> list =