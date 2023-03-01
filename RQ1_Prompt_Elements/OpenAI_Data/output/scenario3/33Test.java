// SortThirdTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {

	/**
	* Test case 1.
	* The input list is [1, 2, 3].
	* The expected output is [1, 2, 3].
	*/
	@Test
	void test1() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	/**
	* Test case 2.
	* The input list is [5, 6, 3, 4, 8, 9, 2].
	* The expected output is [2, 6, 3, 4, 8, 9, 5].
	*/
	@Test
	void test2() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		l.add(8);
		l.add(9);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(6);
		expected.add(3);
		expected.add(4);
		expected.add(8);
		expected.add(9);
		expected.add(5);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	/**
	* Test case 3.
	* The input list is [1, 2, 3].
	* The expected output is [1, 2, 3].
	*/
	@Test
	void test3() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	/**
	* Test case 4.
	* The input list is [5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10].
	* The expected output is [1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10].
	*/
	@Test
	void test4() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(-5);
		l.add(2);
		l.add(-3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		l.add(1);
		l.add(-10);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		expected.add(-5);
		expected.add(2);
		expected.add(-3);
		expected.add(3);
		expected.add(5);
		expected.add(0);
		expected.add(123);
		expected.add(9);
		expected.add(-10);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	/**
	* Test case 5.
	* The input list is [5, 8, -12, 4, 23, 2, 3, 11, 12, -10].
	* The expected output is [-10, 8, -12, 3, 23, 2, 4, 11, 12, 5].
	*/
	@Test
	void test5() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(8);
		l.add(-12);
		l.add(4);
		l.add(23);
		l.add(2);
		l.add(3);
		l.add(11);
		l.add(12);
		l.add(-10);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-10);
		expected.add(8);
		expected.add(-12);
		expected.add(3);
		expected.add(23);
		expected.add(2);
		expected.add(4);
		expected.add(11);
		expected.add(12);
		expected.add(5);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	/**
	* Test case 6.
	* The input list is [5, 6, 3, 4, 8, 9, 2].
	* The expected output is [2, 6, 3, 4, 8, 9, 5].
	*/
	@Test
	void test6() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		l.add(8);
		l.add(9);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(6);
		expected.add(3);
		expected.add(4);
		expected.add(8);
		expected.add(9);
		expected.add(5);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	/**
	* Test case 7.
	* The input list is [5, 8, 3, 4, 6, 9, 2].
	* The expected output is [2, 8, 3, 4, 6, 9, 5].
	*/
	@Test
	void test7() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(8);
		l.add(3);
		l.add(4);
		l.add(6);
		l.add(9);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(8);
		expected.add(3);
		expected.add(4);
		expected.add(6);
		expected.add(9);
		expected.add(5);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	/**
	* Test case 8.
	* The input list is [5, 6, 9, 4, 8, 3, 2].
	* The expected output is [2, 6, 9, 4, 8, 3, 5].
	*/
	@Test
	void test8() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(9);
		l.add(4);
		l.add(8);
		l.add(3);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(6);
		expected.add(9);
		expected.add(4);
		expected.add(8);
		expected.add(3);
		expected.add(5);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	/**
	* Test case 9.
	* The input list is [5, 6, 3, 4, 8, 9, 2, 1].
	* The expected output is [2, 6, 3, 4, 8, 9, 5, 1].
	*/
	@Test
	void test9() {
		List<