// IsSortedTest.java
package scenario3;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

	/**
	* Test case for {@link IsSorted#isSorted(List)} method.
	* It tests the case when the list is empty.
	*/
	@Test
	void testIsSorted_EmptyList() {
		List<Object> lst = List.of();
		assertTrue(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case for {@link IsSorted#isSorted(List)} method.
	* It tests the case when the list has only one element.
	*/
	@Test
	void testIsSorted_OneElement() {
		List<Object> lst = List.of(1);
		assertTrue(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case for {@link IsSorted#isSorted(List)} method.
	* It tests the case when the list is sorted in ascending order.
	*/
	@Test
	void testIsSorted_SortedList() {
		List<Object> lst = List.of(1, 2, 3, 4, 5);
		assertTrue(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case for {@link IsSorted#isSorted(List)} method.
	* It tests the case when the list is not sorted in ascending order.
	*/
	@Test
	void testIsSorted_UnsortedList() {
		List<Object> lst = List.of(1, 3, 2, 4, 5);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case for {@link IsSorted#isSorted(List)} method.
	* It tests the case when the list has more than one duplicate of the same number.
	*/
	@Test
	void testIsSorted_DuplicateList() {
		List<Object> lst = List.of(1, 2, 2, 2, 3, 4);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case for {@link IsSorted#isSorted(List)} method.
	* It tests the case when the list has more than one duplicate of the same number.
	*/
	@Test
	void testIsSorted_DuplicateList2() {
		List<Object> lst = List.of(1, 2, 3, 3, 3, 4);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case for {@link IsSorted#isSorted(List)} method.
	* It tests the case when the list has more than one duplicate of the same number.
	*/
	@Test
	void testIsSorted_DuplicateList3() {
		List<Object> lst = List.of(1, 2, 2, 3, 3, 4);
		assertTrue(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case for {@link IsSorted#isSorted(List)} method.
	* It tests the case when the list is sorted in ascending order.
	*/
	@Test
	void testIsSorted_SortedList2() {
		List<Object> lst = List.of(1, 2, 3, 4);
		assertTrue(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case for {@link IsSorted#isSorted(List)} method.
	* It tests the case when the list is not sorted in ascending order.
	*/
	@Test
	void testIsSorted_UnsortedList2() {
		List<Object> lst = List.of(3, 2, 1);
		assertFalse(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case for {@link IsSorted#isSorted(List)} method.
	* It tests the case when the list is sorted in ascending order.
	*/
	@Test
	void testIsSorted_SortedList3() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7);
		assertTrue(IsSorted.isSorted(lst));
	}
	
	/**
	* Test case for {@link IsSorted#isSorted(List)} method.
	* It tests the case when the list is not sorted in ascending order.
	*/
	@Test
	void testIsSorted_UnsortedList3() {
		List<Object> lst = List.of(1, 3, 2, 4, 5, 6, 7);
		assertFalse(IsSorted.isSorted(lst));
	}
}