// SortedListSumTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that contains duplicates.
	* The expected result is a list of strings in sorted order.
	*/
	@Test
	void testSortedListSum_1() {
		List<String> lst = new ArrayList<String>();
		lst.add("aa");
		lst.add("a");
		lst.add("aaa");
		List<Object> expected = new ArrayList<Object>();
		expected.add("aa");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that contains duplicates.
	* The expected result is a list of strings in sorted order.
	*/
	@Test
	void testSortedListSum_2() {
		List<String> lst = new ArrayList<String>();
		lst.add("ab");
		lst.add("a");
		lst.add("aaa");
		lst.add("cd");
		List<Object> expected = new ArrayList<Object>();
		expected.add("ab");
		expected.add("cd");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that contains duplicates.
	* The expected result is a list of strings in sorted order.
	*/
	@Test
	void testSortedListSum_3() {
		List<String> lst = new ArrayList<String>();
		lst.add("d");
		lst.add("b");
		lst.add("c");
		lst.add("a");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that contains duplicates.
	* The expected result is a list of strings in sorted order.
	*/
	@Test
	void testSortedListSum_4() {
		List<String> lst = new ArrayList<String>();
		lst.add("d");
		lst.add("dcba");
		lst.add("abcd");
		lst.add("a");
		List<Object> expected = new ArrayList<Object>();
		expected.add("abcd");
		expected.add("dcba");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that contains duplicates.
	* The expected result is a list of strings in sorted order.
	*/
	@Test
	void testSortedListSum_5() {
		List<String> lst = new ArrayList<String>();
		lst.add("AI");
		lst.add("ai");
		lst.add("au");
		List<Object> expected = new ArrayList<Object>();
		expected.add("AI");
		expected.add("ai");
		expected.add("au");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that contains duplicates.
	* The expected result is a list of strings in sorted order.
	*/
	@Test
	void testSortedListSum_6() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("b");
		lst.add("b");
		lst.add("c");
		lst.add("c");
		lst.add("a");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that contains duplicates.
	* The expected result is a list of strings in sorted order.
	*/
	@Test
	void testSortedListSum_7() {
		List<String> lst = new ArrayList<String>();
		lst.add("aaaa");
		lst.add("bbbb");
		lst.add("dd");
		lst.add("cc");
		List<Object> expected = new ArrayList<Object>();
		expected.add("cc");
		expected.add("dd");
		expected.add("aaaa");
		expected.add("bbbb");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that contains duplicates.
	* The expected result is a list of strings in sorted order.
	*/
	@Test
	void testSortedListSum_8() {
		List<String> lst = new ArrayList<String>();
		lst.add("school");
		lst.add("AI");
		lst.add("asdf");
		lst.add("b");
		List<Object> expected = new ArrayList<Object>();
		expected.add("AI");
		expected.add("asdf");
		expected.add("school");
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* It tests the method with a list of strings that contains duplicates.
	* The expected result is a list of strings in sorted order.
	*/
	@Test
	void testSortedListSum_9() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("d");
		lst.add("e");
		lst.add("f");
		lst.add("g");
		lst.add("h");
		lst.add("i");
		lst.add("j");
		lst.add("k");
		lst.add("l");
		lst.add("m");
		lst.add("n");
		lst.add("o");
		lst.add("p");
		lst.add("q");
		lst.add("r");
		lst.add("s");
		lst.add("t");
		lst.add("u");
		lst.add("v");
		lst.add("w");
		lst.add("x");
		lst.add("y");
		lst.add("z");
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("b");
		expected.add("c");
		expected