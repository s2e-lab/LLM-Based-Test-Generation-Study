// StrangeSortListTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {

	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of four integers.
	*/
	@Test
	void testStrangeSortList_1() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(4);
		expected.add(2);
		expected.add(3);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of five integers.
	*/
	@Test
	void testStrangeSortList_2() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		List<Object> expected = new ArrayList<Object>();
		expected.add(5);
		expected.add(9);
		expected.add(6);
		expected.add(8);
		expected.add(7);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of five integers.
	*/
	@Test
	void testStrangeSortList_3() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(5);
		expected.add(2);
		expected.add(4);
		expected.add(3);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of six integers.
	*/
	@Test
	void testStrangeSortList_4() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(9);
		expected.add(5);
		expected.add(8);
		expected.add(6);
		expected.add(7);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of four integers.
	*/
	@Test
	void testStrangeSortList_5() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(5);
		lst.add(5);
		lst.add(5);
		lst.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(5);
		expected.add(5);
		expected.add(5);
		expected.add(5);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with an empty list.
	*/
	@Test
	void testStrangeSortList_6() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of eight integers.
	*/
	@Test
	void testStrangeSortList_7() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(8);
		expected.add(2);
		expected.add(7);
		expected.add(3);
		expected.add(6);
		expected.add(4);
		expected.add(5);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of eight integers.
	*/
	@Test
	void testStrangeSortList_8() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(0);
		lst.add(2);
		lst.add(2);
		lst.add(2);
		lst.add(5);
		lst.add(5);
		lst.add(-5);
		lst.add(-5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(-5);
		expected.add(5);
		expected.add(-5);
		expected.add(5);
		expected.add(0);
		expected.add(2);
		expected.add(2);
		expected.add(2);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of one integer.
	*/
	@Test
	void testStrangeSortList_9() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(111111);
		List<Object> expected = new ArrayList<Object>();
		expected.add(111111);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of one integer.
	*/
	@Test
	void testStrangeSortList_10() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		lst.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(10);
		expected.add(2);
		expected.add(9);
		expected.add(3);
		expected.add(8);
		expected.add(4);
		expected.add(7);
		expected.add(5);
		expected.add(6);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
}