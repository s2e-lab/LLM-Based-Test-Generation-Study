// CanArrangeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {

	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array contains duplicate values.
	*/
	@Test
	void testCanArrange_DuplicateValues() {
		List<Object> arr = List.of(1, 2, 4, 3, 5, 3);
		int expected = 3;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array is empty.
	*/
	@Test
	void testCanArrange_EmptyArray() {
		List<Object> arr = List.of();
		int expected = -1;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array contains only one element.
	*/
	@Test
	void testCanArrange_OneElement() {
		List<Object> arr = List.of(1);
		int expected = -1;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array contains only two elements.
	*/
	@Test
	void testCanArrange_TwoElements() {
		List<Object> arr = List.of(1, 2);
		int expected = -1;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array contains only three elements.
	*/
	@Test
	void testCanArrange_ThreeElements() {
		List<Object> arr = List.of(1, 2, 3);
		int expected = -1;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array contains only four elements.
	*/
	@Test
	void testCanArrange_FourElements() {
		List<Object> arr = List.of(1, 2, 4, 3);
		int expected = 3;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array contains only five elements.
	*/
	@Test
	void testCanArrange_FiveElements() {
		List<Object> arr = List.of(1, 2, 4, 3, 5);
		int expected = 3;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array contains only six elements.
	*/
	@Test
	void testCanArrange_SixElements() {
		List<Object> arr = List.of(1, 2, 4, 5, 6, 7);
		int expected = -1;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array contains only seven elements.
	*/
	@Test
	void testCanArrange_SevenElements() {
		List<Object> arr = List.of(1, 4, 2, 5, 6, 7, 8);
		int expected = 2;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array contains only eight elements.
	*/
	@Test
	void testCanArrange_EightElements() {
		List<Object> arr = List.of(4, 8, 5, 7, 3, 6, 2, 1);
		int expected = 4;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array contains only nine elements.
	*/
	@Test
	void testCanArrange_NineElements() {
		List<Object> arr = List.of(4, 8, 5, 7, 3, 6, 2, 1, 9);
		int expected = 4;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* It tests the case when the given array contains only ten elements.
	*/
	@Test
	void testCanArrange_TenElements() {
		List<Object> arr = List.of(4, 8, 5, 7, 3, 6, 2, 1, 9, 10);
		int expected = 4;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
}