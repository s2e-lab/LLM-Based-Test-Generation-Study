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
	* It tests the method with an empty list.
	*/
	@Test
	void testCountNums_EmptyList() {
		List<Object> arr = List.of();
		int expected = 0;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list containing only negative numbers.
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
	* It tests the method with a list containing positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers() {
		List<Object> arr = List.of(1, 1, 2, -2, 3, 4, 5);
		int expected = 6;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list containing positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers2() {
		List<Object> arr = List.of(1, 6, 9, -6, 0, 1, 5);
		int expected = 5;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list containing positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers3() {
		List<Object> arr = List.of(1, 100, 98, -7, 1, -1);
		int expected = 4;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list containing positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers4() {
		List<Object> arr = List.of(12, 23, 34, -45, -56, 0);
		int expected = 5;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list containing positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers5() {
		List<Object> arr = List.of(0, 1);
		int expected = 1;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list containing positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers6() {
		List<Object> arr = List.of(1);
		int expected = 1;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list containing positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers7() {
		List<Object> arr = List.of(1, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
		int expected = 0;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list containing positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers8() {
		List<Object> arr = List.of(1, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int expected = 10;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list containing positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers9() {
		List<Object> arr = List.of(1, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
		int expected = 10;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list containing positive and negative numbers.
	*/
	@Test
	void testCountNums_PositiveAndNegativeNumbers10() {
		List<Object> arr = List.of(1, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int expected = 20;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
}