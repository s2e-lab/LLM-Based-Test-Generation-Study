// GetOddCollatzTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {

	/**
	* Test case 1.
	* The input is 5.
	* The expected output is [1, 5].
	*/
	@Test
	void testCase1() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(5);
		assertEquals(expected, GetOddCollatz.getOddCollatz(5));
	}
	
	/**
	* Test case 2.
	* The input is 14.
	* The expected output is [1, 5, 7, 11, 13, 17].
	*/
	@Test
	void testCase2() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		assertEquals(expected, GetOddCollatz.getOddCollatz(14));
	}
	
	/**
	* Test case 3.
	* The input is 5.
	* The expected output is [1, 5].
	*/
	@Test
	void testCase3() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(5);
		assertEquals(expected, GetOddCollatz.getOddCollatz(5));
	}
	
	/**
	* Test case 4.
	* The input is 12.
	* The expected output is [1, 3, 5].
	*/
	@Test
	void testCase4() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		assertEquals(expected, GetOddCollatz.getOddCollatz(12));
	}
	
	/**
	* Test case 5.
	* The input is 1.
	* The expected output is [1].
	*/
	@Test
	void testCase5() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(1));
	}
	
	/**
	* Test case 6.
	* The input is 2.
	* The expected output is [1].
	*/
	@Test
	void testCase6() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(2));
	}
	
	/**
	* Test case 7.
	* The input is 3.
	* The expected output is [1, 3].
	*/
	@Test
	void testCase7() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		assertEquals(expected, GetOddCollatz.getOddCollatz(3));
	}
	
	/**
	* Test case 8.
	* The input is 4.
	* The expected output is [1].
	*/
	@Test
	void testCase8() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(4));
	}
	
	/**
	* Test case 9.
	* The input is 5.
	* The expected output is [1, 5].
	*/
	@Test
	void testCase9() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(5);
		assertEquals(expected, GetOddCollatz.getOddCollatz(5));
	}
	
	/**
	* Test case 10.
	* The input is 6.
	* The expected output is [1].
	*/
	@Test
	void testCase10() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		assertEquals(expected, GetOddCollatz.getOddCollatz(6));
	}
}