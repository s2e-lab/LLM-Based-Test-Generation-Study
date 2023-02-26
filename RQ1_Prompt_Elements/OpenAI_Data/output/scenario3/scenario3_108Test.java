// CountNumsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {

	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the case when the input array is empty.
	*/
	@Test
	void testCountNums_EmptyArray() {
		List<Object> arr = List.of();
		int expected = 0;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the case when the input array contains only negative numbers.
	*/
	@Test
	void testCountNums_NegativeNumbers() {
		List<Object> arr = List.of(-1, -2, 0);
		int expected = 0;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the case when the input array contains only positive numbers.
	*/
	@Test
	void testCountNums_PositiveNumbers() {
		List<Object> arr = List.of(1, 1, 2, -2, 3, 4, 5);
		int expected = 6;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the case when the input array contains positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers() {
		List<Object> arr = List.of(1, 6, 9, -6, 0, 1, 5);
		int expected = 5;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the case when the input array contains positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers2() {
		List<Object> arr = List.of(1, 100, 98, -7, 1, -1);
		int expected = 4;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the case when the input array contains positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers3() {
		List<Object> arr = List.of(12, 23, 34, -45, -56, 0);
		int expected = 5;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the case when the input array contains two numbers.
	*/
	@Test
	void testCountNums_TwoNumbers() {
		List<Object> arr = List.of(0, 1);
		int expected = 1;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the case when the input array contains one number.
	*/
	@Test
	void testCountNums_OneNumber() {
		List<Object> arr = List.of(1);
		int expected = 1;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the case when the input array contains one number.
	*/
	@Test
	void testCountNums_OneNumber2() {
		List<Object> arr = List.of(-1);
		int expected = 0;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the case when the input array contains one number.
	*/
	@Test
	void testCountNums_OneNumber3() {
		List<Object> arr = List.of(0);
		int expected = 0;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
}