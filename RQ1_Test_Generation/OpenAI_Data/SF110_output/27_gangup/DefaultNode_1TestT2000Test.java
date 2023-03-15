// DefaultNode_1Test.java
package map;

import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNode}.
* It contains ten unit test cases for the {@link DefaultNode#compareTo(Object)} method.
*/
class DefaultNode_1Test {

	/**
	* Test case 1 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with the same score.
	* The expected result is that the method returns 0.
	*/
	@Test
	void testCompareTo_1() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(1);
		node2.setScore(1);
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case 2 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_2() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(1);
		node2.setScore(2);
		assertEquals(-1, node1.compareTo(node2));
	}
	
	/**
	* Test case 3 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns 1.
	*/
	@Test
	void testCompareTo_3() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(2);
		node2.setScore(1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 4 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_4() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(1);
		node2.setScore(2);
		assertEquals(-1, node1.compareTo(node2));
	}
	
	/**
	* Test case 5 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns 1.
	*/
	@Test
	void testCompareTo_5() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(2);
		node2.setScore(1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 6 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_6() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(1);
		node2.setScore(2);
		assertEquals(-1, node1.compareTo(node2));
	}
	
	/**
	* Test case 7 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns 1.
	*/
	@Test
	void testCompareTo_7() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(2);
		node2.setScore(1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 8 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_8() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(1);
		node2.setScore(2);
		assertEquals(-1, node1.compareTo(node2));
	}
	
	/**
	* Test case 9 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns 1.
	*/
	@Test
	void testCompareTo_9() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(2);
		node2.setScore(1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 10 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_10() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(1);
		node2.setScore(2);
		assertEquals(-1, node1.compareTo(node2));
	}
}

// DefaultNode_2Test.java
package map;

import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNode}.
* It contains ten unit test cases for the {@link DefaultNode#compareTo(Object)} method.
*/
class DefaultNode_2Test {
		
	/**
	* Test case 1 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with the same score.
	* The expected result is that the method returns 0.
	*/
	@Test
	void testCompareTo_1() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(1);
		node2.setScore(1);
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case 2 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_2() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(1);
		node2.setScore(2);
		assertEquals(-1, node1.compareTo(node2));
	}
	
	/**
	* Test case 3 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns 1.
	*/
	@Test
	void testCompareTo_3() {
		DefaultNode node1 = new DefaultNode();
		DefaultNode node2 = new DefaultNode();
		node1.setScore(2);
		node2.setScore(1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 4 for {@link DefaultNode#compareTo(Object)}.
	* This test case tests the method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_4() {
		DefaultNode node1 = new