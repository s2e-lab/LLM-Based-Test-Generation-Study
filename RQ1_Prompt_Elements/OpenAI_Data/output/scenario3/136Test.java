// LargestSmallestIntegersTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

	/**
	* Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
	* It tests the method with a list of integers.
	* The expected result is a list of two integers, where the first integer is the largest of negative integers,
	* and the second integer is the smallest of positive integers.
	* If there is no negative or positive integers, return them as None.
	*/
	@Test
	void testLargestSmallestIntegers() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(2);
		lst.add(4);
		lst.add(1);
		lst.add(3);
		lst.add(5);
		lst.add(7);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(1);
		List<Integer> actual = LargestSmallestIntegers.largestSmallestIntegers(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
	* It tests the method with an empty list.
	* The expected result is a list of two integers, where the first integer is the largest of negative integers,
	* and the second integer is the smallest of positive integers.
	* If there is no negative or positive integers, return them as None.
	*/
	@Test
	void testLargestSmallestIntegersEmptyList() {
		List<Object> lst = new ArrayList<Object>();
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(null);
		List<Integer> actual = LargestSmallestIntegers.largestSmallestIntegers(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
	* It tests the method with a list of one integer.
	* The expected result is a list of two integers, where the first integer is the largest of negative integers,
	* and the second integer is the smallest of positive integers.
	* If there is no negative or positive integers, return them as None.
	*/
	@Test
	void testLargestSmallestIntegersOneInteger() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(0);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(null);
		List<Integer> actual = LargestSmallestIntegers.largestSmallestIntegers(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
	* It tests the method with a list of integers.
	* The expected result is a list of two integers, where the first integer is the largest of negative integers,
	* and the second integer is the smallest of positive integers.
	* If there is no negative or positive integers, return them as None.
	*/
	@Test
	void testLargestSmallestIntegers2() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(2);
		lst.add(4);
		lst.add(1);
		lst.add(3);
		lst.add(5);
		lst.add(7);
		lst.add(0);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(1);
		List<Integer> actual = LargestSmallestIntegers.largestSmallestIntegers(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
	* It tests the method with a list of integers.
	* The expected result is a list of two integers, where the first integer is the largest of negative integers,
	* and the second integer is the smallest of positive integers.
	* If there is no negative or positive integers, return them as None.
	*/
	@Test
	void testLargestSmallestIntegers3() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(3);
		lst.add(2);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(-2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-2);
		expected.add(1);
		List<Integer> actual = LargestSmallestIntegers.largestSmallestIntegers(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
	* It tests the method with a list of integers.
	* The expected result is a list of two integers, where the first integer is the largest of negative integers,
	* and the second integer is the smallest of positive integers.
	* If there is no negative or positive integers, return them as None.
	*/
	@Test
	void testLargestSmallestIntegers4() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(4);
		lst.add(5);
		lst.add(3);
		lst.add(6);
		lst.add(2);
		lst.add(7);
		lst.add(-7);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-7);
		expected.add(2);
		List<Integer> actual = LargestSmallestIntegers.largestSmallestIntegers(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
	* It tests the method with a list of integers.
	* The expected result is a list of two integers, where the first integer is the largest of negative integers,
	* and the second integer is the smallest of positive integers.
	* If there is no negative or positive integers, return them as None.
	*/
	@Test
	void testLargestSmallestIntegers5() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(7);
		lst.add(3);
		lst.add(8);
		lst.add(4);
		lst.add(9);
		lst.add(2);
		lst.add(5);
		lst.add(-9);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-9);
		expected.add(2);
		List<Integer> actual = LargestSmallestIntegers.largestSmallestIntegers(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
	* It tests the method with a list of integers.
	* The expected result is a list of two integers, where the first integer is the largest of negative integers,
	* and the second integer is the smallest of positive integers.
	* If there is no negative or positive integers, return them as None.
	*/
	@Test
	void testLargestSmallestIntegers6() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(-3);
		lst.add(-5);
		lst.add(-6);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-1);
	