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
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity1", null);
        assertEquals(0, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_0() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type2", "identity1", null);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_1() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity2", null);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_2() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity1", null);
        ASTNode node3 = new ASTNode("type2", "identity1", null);
        node1.addChild(node3);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_3() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity1", null);
        ASTNode node3 = new ASTNode("type1", "identity2", null);
        node1.addChild(node3);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_4() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity1", null);
        ASTNode node3 = new ASTNode("type1", "identity1", null);
        ASTNode node4 = new ASTNode("type2", "identity1", null);
        node1.addChild(node3);
        node1.addChild(node4);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_5() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity1", null);
        ASTNode node3 = new ASTNode("type1", "identity1", null);
        ASTNode node4 = new ASTNode("type1", "identity2", null);
        node1.addChild(node3);
        node1.addChild(node4);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_6() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity1", null);
        ASTNode node3 = new ASTNode("type1", "identity1", null);
        ASTNode node4 = new ASTNode("type1", "identity1", null);
        ASTNode node5 = new ASTNode("type2", "identity1", null);
        node1.addChild(node3);
        node1.addChild(node4);
        node1.addChild(node5);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_7() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity1", null);
        ASTNode node3 = new ASTNode("type1", "identity1", null);
        ASTNode node4 = new ASTNode("type1", "identity1", null);
        ASTNode node5 = new ASTNode("type1", "identity2", null);
        node1.addChild(node3);
        node1.addChild(node4);
        node1.addChild(node5);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_8() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity1", null);
        ASTNode node3 = new ASTNode("type1", "identity1", null);
        ASTNode node4 = new ASTNode("type1", "identity1", null);
        ASTNode node5 = new ASTNode("type1", "identity1", null);
        ASTNode node6 = new ASTNode("type2", "identity1", null);
        node1.addChild(node3);
        node1.addChild(node4);
        node1.addChild(node5);
        node1.addChild(node6);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_9() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity1", null);
        ASTNode node3 = new ASTNode("type1", "identity1", null);
        ASTNode node4 = new ASTNode("type1", "identity1", null);
        ASTNode node5 = new ASTNode("type1", "identity1", null);
        ASTNode node6 = new ASTNode("type1", "identity2", null);
        node1.addChild(node3);
        node1.addChild(node4);
        node1.addChild(node5);
        node1.addChild(node6);
        assertEquals(1, node1.compareTo(node2));
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
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity1", null);
        assertEquals(0, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_0() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type2", "identity1", null);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_1() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity2", null);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_2() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1", "identity1", null);
        ASTNode node3 = new ASTNode("type2", "identity1", null);
        node1.addChild(node3);
        assertEquals(1, node1.compareTo(node2));
    }

    /**
     * Test method for {@link ASTNode#compareTo(Object)}.
     */
    @Test
    void testCompareTo_3() {
        ASTNode node1 = new ASTNode("type1", "identity1", null);
        ASTNode node2 = new ASTNode("type1