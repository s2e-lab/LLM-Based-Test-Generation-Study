// IncrListTest.java
package scenario1;

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
	* Test case 1.
	* The input list is empty.
	* The expected result is an empty list.
	*/
	@Test
	void testIncrList_1() {
		List<Object> input = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains only one element.
	* The element is an integer.
	* The expected result is a list containing the incremented integer.
	*/
	@Test
	void testIncrList_2() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains only one element.
	* The element is not an integer.
	* The expected result is an empty list.
	*/
	@Test
	void testIncrList_3() {
		List<Object> input = new ArrayList<Object>();
		input.add("1");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains only one element.
	* The element is null.
	* The expected result is an empty list.
	*/
	@Test
	void testIncrList_4() {
		List<Object> input = new ArrayList<Object>();
		input.add(null);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains two elements.
	* The first element is an integer.
	* The second element is not an integer.
	* The expected result is a list containing the incremented integer.
	*/
	@Test
	void testIncrList_5() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add("1");
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains two elements.
	* The first element is not an integer.
	* The second element is an integer.
	* The expected result is a list containing the incremented integer.
	*/
	@Test
	void testIncrList_6() {
		List<Object> input = new ArrayList<Object>();
		input.add("1");
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains two elements.
	* The first element is an integer.
	* The second element is null.
	* The expected result is a list containing the incremented integer.
	*/
	@Test
	void testIncrList_7() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(null);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains two elements.
	* The first element is null.
	* The second element is an integer.
	* The expected result is a list containing the incremented integer.
	*/
	@Test
	void testIncrList_8() {
		List<Object> input = new ArrayList<Object>();
		input.add(null);
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains two elements.
	* The first element is an integer.
	* The second element is an integer.
	* The expected result is a list containing the two incremented integers.
	*/
	@Test
	void testIncrList_9() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains two elements.
	* The first element is not an integer.
	* The second element is not an integer.
	* The expected result is an empty list.
	*/
	@Test
	void testIncrList_10() {
		List<Object> input = new ArrayList<Object>();
		input.add("1");
		input.add("2");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
}