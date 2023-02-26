// SortArrayTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {

	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testSortArray() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(5);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(4);
		expected.add(3);
		expected.add(5);
		assertEquals(expected, SortArray.sortArray(arr));
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the method with a list of negative integers.
	*/
	@Test
	void testSortArrayNegative() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(-2);
		arr.add(-3);
		arr.add(-4);
		arr.add(-5);
		arr.add(-6);
		List<Object> expected = new ArrayList<Object>();
		expected.add(-4);
		expected.add(-2);
		expected.add(-6);
		expected.add(-5);
		expected.add(-3);
		assertEquals(expected, SortArray.sortArray(arr));
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the method with a list of integers containing zero.
	*/
	@Test
	void testSortArrayZero() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(0);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(1);
		expected.add(2);
		expected.add(4);
		expected.add(3);
		assertEquals(expected, SortArray.sortArray(arr));
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the method with an empty list.
	*/
	@Test
	void testSortArrayEmpty() {
		List<Object> arr = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, SortArray.sortArray(arr));
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the method with a list of integers containing duplicates.
	*/
	@Test
	void testSortArrayDuplicates() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(2);
		arr.add(5);
		arr.add(77);
		arr.add(4);
		arr.add(5);
		arr.add(3);
		arr.add(5);
		arr.add(7);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(2);
		expected.add(4);
		expected.add(4);
		expected.add(3);
		expected.add(3);
		expected.add(5);
		expected.add(5);
		expected.add(5);
		expected.add(7);
		expected.add(77);
		assertEquals(expected, SortArray.sortArray(arr));
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the method with a list of integers containing duplicates.
	*/
	@Test
	void testSortArrayDuplicates2() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(3);
		arr.add(6);
		arr.add(44);
		arr.add(12);
		arr.add(32);
		arr.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(32);
		expected.add(3);
		expected.add(5);
		expected.add(6);
		expected.add(12);
		expected.add(44);
		assertEquals(expected, SortArray.sortArray(arr));
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the method with a list of integers containing duplicates.
	*/
	@Test
	void testSortArrayDuplicates3() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(2);
		arr.add(4);
		arr.add(8);
		arr.add(16);
		arr.add(32);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(4);
		expected.add(8);
		expected.add(16);
		expected.add(32);
		assertEquals(expected, SortArray.sortArray(arr));
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the method with a list of integers containing duplicates.
	*/
	@Test
	void testSortArrayDuplicates4() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(2);
		arr.add(4);
		arr.add(8);
		arr.add(16);
		arr.add(32);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(4);
		expected.add(8);
		expected.add(16);
		expected.add(32);
		assertEquals(expected, SortArray.sortArray(arr));
	}
	
	/**
	* Test case for {@link SortArray#sortArray(List)} method.
	* It tests the method with a list of integers containing duplicates.
	*/
	@Test
	void testSortArrayDuplicates5() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(2);
		arr.add(4);
		arr.add(8);
		arr.add(16);
		arr.add(32);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(4);
		expected.add(8);
		expected.add(16);
		expected.add(32);
		assertEquals(expected, SortArray.sortArray(arr));
	}
}