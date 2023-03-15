// DirtyNode_1Test.java
package map;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DirtyNode}.
* It contains ten unit test cases for the {@link DirtyNode#compareTo(Object)} method.
*/
class DirtyNode_1Test {

	/**
	* Test case 1 for {@link DirtyNode#compareTo(Object)}.
	* <p>
	* This test case tests the compareTo method with two nodes with the same score.
	* The expected result is that the method returns 0.
	*/
	@Test
	void testCompareTo_1() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setScore(1);
		node2.setScore(1);
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case 2 for {@link DirtyNode#compareTo(Object)}.
	* <p>
	* This test case tests the compareTo method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_2() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setScore(1);
		node2.setScore(2);
		assertEquals(-1, node1.compareTo(node2));
	}
	
	/**
	* Test case 3 for {@link DirtyNode#compareTo(Object)}.
	* <p>
	* This test case tests the compareTo method with two nodes with different scores.
	* The expected result is that the method returns 1.
	*/
	@Test
	void testCompareTo_3() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setScore(2);
		node2.setScore(1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 4 for {@link DirtyNode#compareTo(Object)}.
	* <p>
	* This test case tests the compareTo method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_4() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setScore(1);
		node2.setScore(2);
		assertEquals(-1, node1.compareTo(node2));
	}
	
	/**
	* Test case 5 for {@link DirtyNode#compareTo(Object)}.
	* <p>
	* This test case tests the compareTo method with two nodes with different scores.
	* The expected result is that the method returns 1.
	*/
	@Test
	void testCompareTo_5() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setScore(2);
		node2.setScore(1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 6 for {@link DirtyNode#compareTo(Object)}.
	* <p>
	* This test case tests the compareTo method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_6() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setScore(1);
		node2.setScore(2);
		assertEquals(-1, node1.compareTo(node2));
	}
	
	/**
	* Test case 7 for {@link DirtyNode#compareTo(Object)}.
	* <p>
	* This test case tests the compareTo method with two nodes with different scores.
	* The expected result is that the method returns 1.
	*/
	@Test
	void testCompareTo_7() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setScore(2);
		node2.setScore(1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 8 for {@link DirtyNode#compareTo(Object)}.
	* <p>
	* This test case tests the compareTo method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_8() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setScore(1);
		node2.setScore(2);
		assertEquals(-1, node1.compareTo(node2));
	}
	
	/**
	* Test case 9 for {@link DirtyNode#compareTo(Object)}.
	* <p>
	* This test case tests the compareTo method with two nodes with different scores.
	* The expected result is that the method returns 1.
	*/
	@Test
	void testCompareTo_9() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setScore(2);
		node2.setScore(1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 10 for {@link DirtyNode#compareTo(Object)}.
	* <p>
	* This test case tests the compareTo method with two nodes with different scores.
	* The expected result is that the method returns -1.
	*/
	@Test
	void testCompareTo_10() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setScore(1);
		node2.setScore(2);
		assertEquals(-1, node1.compareTo(node2));
	}
}

// DirtyNode_2Test.java
package map;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DirtyNode}.
* It contains ten unit test cases for the {@link DirtyNode#equals(Object)} method.
*/
class DirtyNode_2Test {
		
	/**
	* Test case 1 for {@link DirtyNode#equals(Object)}.
	* <p>
	* This test case tests the equals method with two nodes with the same coordinates.
	* The expected result is that the method returns true.
	*/
	@Test
	void testEquals_1() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setLocation(1, 1);
		node2.setLocation(1, 1);
		assertTrue(node1.equals(node2));
	}
	
	/**
	* Test case 2 for {@link DirtyNode#equals(Object)}.
	* <p>
	* This test case tests the equals method with two nodes with different coordinates.
	* The expected result is that the method returns false.
	*/
	@Test
	void testEquals_2() {
		DirtyNode node1 = new DirtyNode(0);
		DirtyNode node2 = new DirtyNode(0);
		node1.setLocation(1, 1);
		node2.setLocation(2, 2);
		assertFalse(node1.equals(node2));
	}
	
	/**
	* Test case 3 for {@link DirtyNode#equals(Object)}.
	* <p>
	* This test case tests the equals method with two nodes with different coordinates.
	* The expected result is that the method returns false.
	*/
	@