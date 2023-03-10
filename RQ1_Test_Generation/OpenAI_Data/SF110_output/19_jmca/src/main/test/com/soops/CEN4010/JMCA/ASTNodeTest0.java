// ASTNodeTest0.java
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
class ASTNodeTest0 {

	/**
	* Test case 1 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity.
	*/
	@Test
	void testCompareTo1() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type1", "identity1", null);
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case 2 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type but different identity.
	*/
	@Test
	void testCompareTo2() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type1", "identity2", null);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 3 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same identity but different type.
	*/
	@Test
	void testCompareTo3() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type2", "identity1", null);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 4 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have different type and identity.
	*/
	@Test
	void testCompareTo4() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type2", "identity2", null);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 5 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the first node has a child.
	*/
	@Test
	void testCompareTo5() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type1", "identity1", null);
		ASTNode node3 = new ASTNode("type3", "identity3", null);
		node1.addChild(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 6 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the second node has a child.
	*/
	@Test
	void testCompareTo6() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type1", "identity1", null);
		ASTNode node3 = new ASTNode("type3", "identity3", null);
		node2.addChild(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 7 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the first node has a child with different type and identity.
	*/
	@Test
	void testCompareTo7() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type1", "identity1", null);
		ASTNode node3 = new ASTNode("type3", "identity3", null);
		ASTNode node4 = new ASTNode("type4", "identity4", null);
		node1.addChild(node3);
		node2.addChild(node4);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 8 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the first node has a child with different type and the second node has a child with different identity.
	*/
	@Test
	void testCompareTo8() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type1", "identity1", null);
		ASTNode node3 = new ASTNode("type3", "identity3", null);
		ASTNode node4 = new ASTNode("type4", "identity4", null);
		node1.addChild(node3);
		node2.addChild(node4);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 9 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the first node has a child with different identity and the second node has a child with different type.
	*/
	@Test
	void testCompareTo9() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type1", "identity1", null);
		ASTNode node3 = new ASTNode("type3", "identity3", null);
		ASTNode node4 = new ASTNode("type4", "identity4", null);
		node1.addChild(node3);
		node2.addChild(node4);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 10 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the first node has a child with different type and identity and the second node has a child with different type and identity.
	*/
	@Test
	void testCompareTo10() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type1", "identity1", null);
		ASTNode node3 = new ASTNode("type3", "identity3", null);
		ASTNode node4 = new ASTNode("type4", "identity4", null);
		node1.addChild(node3);
		node2.addChild(node4);
		assertEquals(1, node1.compareTo(node2));
	}
}

// ASTNodeTest1.java
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
class ASTNodeTest1 {
		
	/**
	* Test case 1 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity.
	*/
	@Test
	void testCompareTo1() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type1", "identity1", null);
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case 2 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type but different identity.
	*/
	@Test
	void testCompareTo2() {
		ASTNode node1 = new ASTNode("type1", "identity1", null);
		ASTNode node2 = new ASTNode("type1", "ident