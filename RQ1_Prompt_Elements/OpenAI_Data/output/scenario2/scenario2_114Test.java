// MinsubarraysumTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {

	/**
	* Test case 1.
	* The input is a list of integers {@code [-1, -2, -3, -4, -5]}.
	* The expected output is {@code 15}.
	*/
	@Test
	void testCase1() {
		List<Object> nums = List.of(-1, -2, -3, -4, -5);
		long expected = 15;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input is a list of integers {@code [1, 2, 3, 4, 5]}.
	* The expected output is {@code -15}.
	*/
	@Test
	void testCase2() {
		List<Object> nums = List.of(1, 2, 3, 4, 5);
		long expected = -15;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input is a list of integers {@code [1, 2, 3, 4, -5]}.
	* The expected output is {@code -5}.
	*/
	@Test
	void testCase3() {
		List<Object> nums = List.of(1, 2, 3, 4, -5);
		long expected = -5;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input is a list of integers {@code [1, 2, 3, -4, -5]}.
	* The expected output is {@code -6}.
	*/
	@Test
	void testCase4() {
		List<Object> nums = List.of(1, 2, 3, -4, -5);
		long expected = -6;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input is a list of integers {@code [1, 2, -3, -4, -5]}.
	* The expected output is {@code -9}.
	*/
	@Test
	void testCase5() {
		List<Object> nums = List.of(1, 2, -3, -4, -5);
		long expected = -9;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input is a list of integers {@code [1, -2, -3, -4, -5]}.
	* The expected output is {@code -15}.
	*/
	@Test
	void testCase6() {
		List<Object> nums = List.of(1, -2, -3, -4, -5);
		long expected = -15;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input is a list of integers {@code [-1, -2, -3, -4, 5]}.
	* The expected output is {@code -1}.
	*/
	@Test
	void testCase7() {
		List<Object> nums = List.of(-1, -2, -3, -4, 5);
		long expected = -1;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input is a list of integers {@code [-1, -2, -3, 4, 5]}.
	* The expected output is {@code -2}.
	*/
	@Test
	void testCase8() {
		List<Object> nums = List.of(-1, -2, -3, 4, 5);
		long expected = -2;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input is a list of integers {@code [-1, -2, 3, 4, 5]}.
	* The expected output is {@code -3}.
	*/
	@Test
	void testCase9() {
		List<Object> nums = List.of(-1, -2, 3, 4, 5);
		long expected = -3;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input is a list of integers {@code [-1, 2, 3, 4, 5]}.
	* The expected output is {@code -1}.
	*/
	@Test
	void testCase10() {
		List<Object> nums = List.of(-1, 2, 3, 4, 5);
		long expected = -1;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
}