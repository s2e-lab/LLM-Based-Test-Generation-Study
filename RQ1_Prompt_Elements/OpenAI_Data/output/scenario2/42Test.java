// IncrListTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {

	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list is empty.
	 */
	@Test
	void testIncrList_EmptyList() {
		List<Object> input = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_Negative() {
		List<Object> input = new ArrayList<Object>();
		input.add(-1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_Zero() {
		List<Object> input = new ArrayList<Object>();
		input.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_Max() {
		List<Object> input = new ArrayList<Object>();
		input.add(Integer.MAX_VALUE);
		List<Object> expected = new ArrayList<Object>();
		expected.add(Integer.MAX_VALUE);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_Min() {
		List<Object> input = new ArrayList<Object>();
		input.add(Integer.MIN_VALUE);
		List<Object> expected = new ArrayList<Object>();
		expected.add(Integer.MIN_VALUE);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_String() {
		List<Object> input = new ArrayList<Object>();
		input.add("1");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_Null() {
		List<Object> input = new ArrayList<Object>();
		input.add(null);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_Object() {
		List<Object> input = new ArrayList<Object>();
		input.add(new Object());
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_Array() {
		List<Object> input = new ArrayList<Object>();
		input.add(new int[] {1, 2, 3});
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_List() {
		List<Object> input = new ArrayList<Object>();
		input.add(new ArrayList<Object>());
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_IncrList() {
		List<Object> input = new ArrayList<Object>();
		input.add(new IncrList());
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_IncrListTest() {
		List<Object> input = new ArrayList<Object>();
		input.add(new IncrListTest());
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIncrList_OneElement_IncrListTest_Null() {
		List<Object> input = new ArrayList<Object>();
		input.add(null);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link IncrList#incrList(List)} method.
	 * It tests the case when the input list contains only one element.
	 */
	@Test
	void testIn