// ASTNode_0Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#compareTo(Object)} method.
*/
class ASTNode_0Test {

    /**
    * Test case number: 0
    * Test case values: null
    * Expected test result: 1
    */
    @Test
    void test0() {
        ASTNode node = new ASTNode();
        node.setType("null");
        node.setIdentity("null");
        node.setList(null);
        ASTNode node2 = new ASTNode();
        node2.setType("null");
        node2.setIdentity("null");
        node2.setList(null);
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }

    /**
    * Test case number: 1
    * Test case values: null, null
    * Expected test result: 0
    */
    @Test
    void test1() {
        ASTNode node = new ASTNode();
        node.setType("null");
        node.setIdentity("null");
        node.setList(null);
        ASTNode node2 = new ASTNode();
        node2.setType("null");
        node2.setIdentity("null");
        node2.setList(null);
        int result = node.compareTo(node2);
        assertEquals(0, result);
    }

    /**
    * Test case number: 2
    * Test case values: null, not null
    * Expected test result: 1
    */
    @Test
    void test2() {
        ASTNode node = new ASTNode();
        node.setType("null");
        node.setIdentity("null");
        node.setList(null);
        ASTNode node2 = new ASTNode();
        node2.setType("not null");
        node2.setIdentity("not null");
        node2.setList(new ArrayList<ASTNode>());
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }

    /**
    * Test case number: 3
    * Test case values: not null, null
    * Expected test result: 1
    */
    @Test
    void test3() {
        ASTNode node = new ASTNode();
        node.setType("not null");
        node.setIdentity("not null");
        node.setList(new ArrayList<ASTNode>());
        ASTNode node2 = new ASTNode();
        node2.setType("null");
        node2.setIdentity("null");
        node2.setList(null);
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }

    /**
    * Test case number: 4
    * Test case values: not null, not null
    * Expected test result: 1
    */
    @Test
    void test4() {
        ASTNode node = new ASTNode();
        node.setType("not null");
        node.setIdentity("not null");
        node.setList(new ArrayList<ASTNode>());
        ASTNode node2 = new ASTNode();
        node2.setType("not null");
        node2.setIdentity("not null");
        node2.setList(new ArrayList<ASTNode>());
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }

    /**
    * Test case number: 5
    * Test case values: not null, not null
    * Expected test result: 1
    */
    @Test
    void test5() {
        ASTNode node = new ASTNode();
        node.setType("not null");
        node.setIdentity("not null");
        node.setList(new ArrayList<ASTNode>());
        ASTNode node2 = new ASTNode();
        node2.setType("not null");
        node2.setIdentity("not null");
        node2.setList(new ArrayList<ASTNode>());
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }

    /**
    * Test case number: 6
    * Test case values: not null, not null
    * Expected test result: 1
    */
    @Test
    void test6() {
        ASTNode node = new ASTNode();
        node.setType("not null");
        node.setIdentity("not null");
        node.setList(new ArrayList<ASTNode>());
        ASTNode node2 = new ASTNode();
        node2.setType("not null");
        node2.setIdentity("not null");
        node2.setList(new ArrayList<ASTNode>());
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }

    /**
    * Test case number: 7
    * Test case values: not null, not null
    * Expected test result: 1
    */
    @Test
    void test7() {
        ASTNode node = new ASTNode();
        node.setType("not null");
        node.setIdentity("not null");
        node.setList(new ArrayList<ASTNode>());
        ASTNode node2 = new ASTNode();
        node2.setType("not null");
        node2.setIdentity("not null");
        node2.setList(new ArrayList<ASTNode>());
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }

    /**
    * Test case number: 8
    * Test case values: not null, not null
    * Expected test result: 1
    */
    @Test
    void test8() {
        ASTNode node = new ASTNode();
        node.setType("not null");
        node.setIdentity("not null");
        node.setList(new ArrayList<ASTNode>());
        ASTNode node2 = new ASTNode();
        node2.setType("not null");
        node2.setIdentity("not null");
        node2.setList(new ArrayList<ASTNode>());
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }

    /**
    * Test case number: 9
    * Test case values: not null, not null
    * Expected test result: 1
    */
    @Test
    void test9() {
        ASTNode node = new ASTNode();
        node.setType("not null");
        node.setIdentity("not null");
        node.setList(new ArrayList<ASTNode>());
        ASTNode node2 = new ASTNode();
        node2.setType("not null");
        node2.setIdentity("not null");
        node2.setList(new ArrayList<ASTNode>());
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }
}

// ASTNode_1Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#compareTo(Object)} method.
*/
class ASTNode_1Test {
		
    /**
    * Test case number: 0
    * Test case values: null
    * Expected test result: 1
    */
    @Test
    void test0() {
        ASTNode node = new ASTNode();
        node.setType("null");
        node.setIdentity("null");
        node.setList(null);
        ASTNode node2 = new ASTNode();
        node2.setType("null");
        node2.setIdentity("null");
        node2.setList(null);
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }

    /**
    * Test case number: 1
    * Test case values: null, null
    * Expected test result: 0
    */
    @Test
    void test1() {
        ASTNode node = new ASTNode();
        node.setType("null");
        node.setIdentity("null");
        node.setList(null);
        ASTNode node2 = new ASTNode();
        node2.setType("null");
        node2.setIdentity("null");
        node2.setList(null);
        int result = node.compareTo(node2);
        assertEquals(0, result);
    }

    /**
    * Test case number: 2
    * Test case values: null, not null
    * Expected test result: 1
    */
    @Test
    void test2() {
        ASTNode node = new ASTNode();
        node.setType("null");
        node.setIdentity("null");
        node.setList(null);
        ASTNode node2 = new ASTNode();
        node2.setType("not null");
        node2.setIdentity("not null");
        node2.setList(new ArrayList<ASTNode>());
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }

    /**
    * Test case number: 3
    * Test case values: not null, null
    * Expected test result: 1
    */
    @Test
    void test3() {
        ASTNode node = new ASTNode();
        node.setType("not null");
        node.setIdentity("not null");
        node.setList(new ArrayList<ASTNode>());
        ASTNode node2 = new ASTNode();
        node2.setType("null");
        node2.setIdentity("null");
        node2.setList(null);
        int result = node.compareTo(node2);
        assertEquals(1, result);
    }

    /**