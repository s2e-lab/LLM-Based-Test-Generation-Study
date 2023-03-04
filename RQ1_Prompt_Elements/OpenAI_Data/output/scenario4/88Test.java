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

	@Test
	void testSortArray_emptyArray() {
		List<Object> array = new ArrayList<>();
		List<Object> expected = new ArrayList<>();
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_oneElementArray() {
		List<Object> array = new ArrayList<>();
		array.add(5);
		List<Object> expected = new ArrayList<>();
		expected.add(5);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_oddSumArray() {
		List<Object> array = new ArrayList<>();
		array.add(2);
		array.add(4);
		array.add(3);
		array.add(0);
		array.add(1);
		array.add(5);
		List<Object> expected = new ArrayList<>();
		expected.add(0);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_evenSumArray() {
		List<Object> array = new ArrayList<>();
		array.add(2);
		array.add(4);
		array.add(3);
		array.add(0);
		array.add(1);
		array.add(5);
		array.add(6);
		List<Object> expected = new ArrayList<>();
		expected.add(6);
		expected.add(5);
		expected.add(4);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(0);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_twoElementArray() {
		List<Object> array = new ArrayList<>();
		array.add(2);
		array.add(1);
		List<Object> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_oddSumArray2() {
		List<Object> array = new ArrayList<>();
		array.add(15);
		array.add(42);
		array.add(87);
		array.add(32);
		array.add(11);
		array.add(0);
		List<Object> expected = new ArrayList<>();
		expected.add(0);
		expected.add(11);
		expected.add(15);
		expected.add(32);
		expected.add(42);
		expected.add(87);
		assertEquals(expected, SortArray1.sortArray(array));
	}
	
	@Test
	void testSortArray_evenSumArray2() {
		List<Object> array = new ArrayList<>();
		array.add(21);
		array.add(14);
		array.add(23);
		array.add(11);
		List<Object> expected = new ArrayList<>();
		expected.add(23);
		expected.add(21);
		expected.add(14);
		expected.add(11);
		assertEquals(expected, SortArray1.sortArray(array));
	}
}