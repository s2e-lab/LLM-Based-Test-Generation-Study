// DoubleTheDifferenceTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with an empty list.
	*/
	@Test
	void testDoubleTheDifference_EmptyList() {
		List<Object> lst = List.of();
		assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only one element.
	*/
	@Test
	void testDoubleTheDifference_OneElement() {
		List<Object> lst = List.of(5);
		assertEquals(25, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only two elements.
	*/
	@Test
	void testDoubleTheDifference_TwoElements() {
		List<Object> lst = List.of(5, 4);
		assertEquals(25, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only three elements.
	*/
	@Test
	void testDoubleTheDifference_ThreeElements() {
		List<Object> lst = List.of(5, 4, 3);
		assertEquals(34, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only four elements.
	*/
	@Test
	void testDoubleTheDifference_FourElements() {
		List<Object> lst = List.of(5, 4, 3, 2);
		assertEquals(34, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only five elements.
	*/
	@Test
	void testDoubleTheDifference_FiveElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1);
		assertEquals(55, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only six elements.
	*/
	@Test
	void testDoubleTheDifference_SixElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1, 0);
		assertEquals(55, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only seven elements.
	*/
	@Test
	void testDoubleTheDifference_SevenElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1, 0, -1);
		assertEquals(55, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only eight elements.
	*/
	@Test
	void testDoubleTheDifference_EightElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1, 0, -1, -2);
		assertEquals(55, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only nine elements.
	*/
	@Test
	void testDoubleTheDifference_NineElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1, 0, -1, -2, -3);
		assertEquals(55, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only ten elements.
	*/
	@Test
	void testDoubleTheDifference_TenElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1, 0, -1, -2, -3, -4);
		assertEquals(55, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only eleven elements.
	*/
	@Test
	void testDoubleTheDifference_ElevenElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5);
		assertEquals(55, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only twelve elements.
	*/
	@Test
	void testDoubleTheDifference_TwelveElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6);
		assertEquals(55, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only thirteen elements.
	*/
	@Test
	void testDoubleTheDifference_ThirteenElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7);
		assertEquals(55, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only fourteen elements.
	*/
	@Test
	void testDoubleTheDifference_FourteenElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8);
		assertEquals(55, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only fifteen elements.
	*/
	@Test
	void testDoubleTheDifference_FifteenElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9);
		assertEquals(55, DoubleTheDifference.doubleTheDifference(lst));
	}
	
	/**
	* Test case for {@link DoubleTheDifference#doubleTheDifference(List)} method.
	* It tests the method with a list containing only sixteen elements.
	*/
	@Test
	void testDoubleTheDifference_SixteenElements() {
		List<Object> lst = List.of(5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9