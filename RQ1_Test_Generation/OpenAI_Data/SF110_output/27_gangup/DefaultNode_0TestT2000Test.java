// DefaultNode_0Test.java
package map;

import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNode}.
* It contains ten unit test cases for the {@link DefaultNode#getChildNode(int)} method.
*/
class DefaultNode_0Test {

	/**
	* Test case 1 for {@link DefaultNode#getChildNode(int)}.
	* The test case tests the method with a valid index.
	* The expected result is that the method returns the correct child node.
	*/
	@Test
	void testGetChildNode_1() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		assertEquals(child, node.getChildNode(0));
	}
	
	/**
	* Test case 2 for {@link DefaultNode#getChildNode(int)}.
	* The test case tests the method with an invalid index.
	* The expected result is that the method throws an IndexOutOfBoundsException.
	*/
	@Test
	void testGetChildNode_2() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		assertThrows(IndexOutOfBoundsException.class, () -> node.getChildNode(1));
	}
	
	/**
	* Test case 3 for {@link DefaultNode#getChildNode(int)}.
	* The test case tests the method with a negative index.
	* The expected result is that the method throws an IndexOutOfBoundsException.
	*/
	@Test
	void testGetChildNode_3() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		assertThrows(IndexOutOfBoundsException.class, () -> node.getChildNode(-1));
	}
	
	/**
	* Test case 4 for {@link DefaultNode#getChildNode(int)}.
	* The test case tests the method with an index that is too large.
	* The expected result is that the method throws an IndexOutOfBoundsException.
	*/
	@Test
	void testGetChildNode_4() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		assertThrows(IndexOutOfBoundsException.class, () -> node.getChildNode(2));
	}
	
	/**
	* Test case 5 for {@link DefaultNode#getChildNode(int)}.
	* The test case tests the method with an index that is too large.
	* The expected result is that the method throws an IndexOutOfBoundsException.
	*/
	@Test
	void testGetChildNode_5() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		assertThrows(IndexOutOfBoundsException.class, () -> node.getChildNode(Integer.MAX_VALUE));
	}
	
	/**
	* Test case 6 for {@link DefaultNode#getChildNode(int)}.
	* The test case tests the method with an index that is too large.
	* The expected result is that the method throws an IndexOutOfBoundsException.
	*/
	@Test
	void testGetChildNode_6() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		assertThrows(IndexOutOfBoundsException.class, () -> node.getChildNode(Integer.MIN_VALUE));
	}
	
	/**
	* Test case 7 for {@link DefaultNode#getChildNode(int)}.
	* The test case tests the method with an index that is too large.
	* The expected result is that the method throws an IndexOutOfBoundsException.
	*/
	@Test
	void testGetChildNode_7() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		assertThrows(IndexOutOfBoundsException.class, () -> node.getChildNode(Integer.MAX_VALUE - 1));
	}
	
	/**
	* Test case 8 for {@link DefaultNode#getChildNode(int)}.
	* The test case tests the method with an index that is too large.
	* The expected result is that the method throws an IndexOutOfBoundsException.
	*/
	@Test
	void testGetChildNode_8() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		assertThrows(IndexOutOfBoundsException.class, () -> node.getChildNode(Integer.MIN_VALUE + 1));
	}
	
	/**
	* Test case 9 for {@link DefaultNode#getChildNode(int)}.
	* The test case tests the method with an index that is too large.
	* The expected result is that the method throws an IndexOutOfBoundsException.
	*/
	@Test
	void testGetChildNode_9() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		assertThrows(IndexOutOfBoundsException.class, () -> node.getChildNode(Integer.MAX_VALUE / 2));
	}
	
	/**
	* Test case 10 for {@link DefaultNode#getChildNode(int)}.
	* The test case tests the method with an index that is too large.
	* The expected result is that the method throws an IndexOutOfBoundsException.
	*/
	@Test
	void testGetChildNode_10() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		assertThrows(IndexOutOfBoundsException.class, () -> node.getChildNode(Integer.MIN_VALUE / 2));
	}
}

// DefaultNode_1Test.java
package map;

import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNode}.
* It contains ten unit test cases for the {@link DefaultNode#setChildNode(int, Node)} method.
*/
class DefaultNode_1Test {
		
	/**
	* Test case 1 for {@link DefaultNode#setChildNode(int, Node)}.
	* The test case tests the method with a valid index.
	* The expected result is that the method sets the correct child node.
	*/
	@Test
	void testSetChildNode_1() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		DefaultNode child2 = new DefaultNode();
		node.setChildNode(0, child2);
		assertEquals(child2, node.getChildNode(0));
	}
	
	/**
	* Test case 2 for {@link DefaultNode#setChildNode(int, Node)}.
	* The test case tests the method with an invalid index.
	* The expected result is that the method throws an IndexOutOfBoundsException.
	*/
	@Test
	void testSetChildNode_2() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		DefaultNode child2 = new DefaultNode();
		assertThrows(IndexOutOfBoundsException.class, () -> node.setChildNode(1, child2));
	}
	
	/**
	* Test case 3 for {@link DefaultNode#setChildNode(int, Node)}.
	* The test case tests the method with an invalid index.
	* The expected result is that the method throws an IndexOutOfBoundsException.
	*/
	@Test
	void testSetChildNode_3() {
		DefaultNode node = new DefaultNode();
		DefaultNode child = new DefaultNode();
		node.addChildNode(child);
		DefaultNode child2 = new DefaultNode();
		assertThrows(IndexOutOfBoundsException.class, () -> node.setChildNode(-1, child2));
	}
	
	/**
	*