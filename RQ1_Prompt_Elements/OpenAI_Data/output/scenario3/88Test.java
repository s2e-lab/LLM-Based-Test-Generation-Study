// SortArray1Test.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {

	/**
	* Test case for {@link SortArray1#sortArray(List)} method.
	* It tests the case when the given array is empty.
	*/
	@Test
	void testSortArray_EmptyArray() {
		List<Object> array = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray1#sortArray(List)} method.
	* It tests the case when the given array has only one element.
	*/
	@Test
	void testSortArray_OneElementArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(5);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray1#sortArray(List)} method.
	* It tests the case when the given array has odd number of elements.
	*/
	@Test
	void testSortArray_OddNumberOfElementsArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(2);
		array.add(4);
		array.add(3);
		array.add(0);
		array.add(1);
		array.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray1#sortArray(List)} method.
	* It tests the case when the given array has even number of elements.
	*/
	@Test
	void testSortArray_EvenNumberOfElementsArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(2);
		array.add(4);
		array.add(3);
		array.add(0);
		array.add(1);
		array.add(5);
		array.add(6);
		List<Object> expected = new ArrayList<Object>();
		expected.add(6);
		expected.add(5);
		expected.add(4);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(0);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray1#sortArray(List)} method.
	* It tests the case when the given array has two elements.
	*/
	@Test
	void testSortArray_TwoElementsArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(2);
		array.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray1#sortArray(List)} method.
	* It tests the case when the given array has six elements.
	*/
	@Test
	void testSortArray_SixElementsArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(15);
		array.add(42);
		array.add(87);
		array.add(32);
		array.add(11);
		array.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(11);
		expected.add(15);
		expected.add(32);
		expected.add(42);
		expected.add(87);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortArray1#sortArray(List)} method.
	* It tests the case when the given array has four elements.
	*/
	@Test
	void testSortArray_FourElementsArray() {
		List<Object> array = new ArrayList<Object>();
		array.add(21);
		array.add(14);
		array.add(23);
		array.add(11);
		List<Object> expected = new ArrayList<Object>();
		expected.add(23);
		expected.add(21);
		expected.add(14);
		expected.add(11);
		List<Object> actual = SortArray1.sortArray(array);
		assertEquals(expected, actual);
	}
}