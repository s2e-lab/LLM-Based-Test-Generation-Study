// StrangeSortListTest.java
package scenario2;

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
	* Test case 1.
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	* Expected output: [1, 10, 2, 9, 3, 8, 4, 7, 5, 6]
	*/
	@Test
	void testCase1() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
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
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
	* Expected output: [1, 11, 2, 10, 3, 9, 4, 8, 5, 7, 6]
	*/
	@Test
	void testCase2() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(11);
		expected.add(2);
		expected.add(10);
		expected.add(3);
		expected.add(9);
		expected.add(4);
		expected.add(8);
		expected.add(5);
		expected.add(7);
		expected.add(6);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
	* Expected output: [1, 12, 2, 11, 3, 10, 4, 9, 5, 8, 6, 7]
	*/
	@Test
	void testCase3() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		input.add(12);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(12);
		expected.add(2);
		expected.add(11);
		expected.add(3);
		expected.add(10);
		expected.add(4);
		expected.add(9);
		expected.add(5);
		expected.add(8);
		expected.add(6);
		expected.add(7);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
	* Expected output: [1, 13, 2, 12, 3, 11, 4, 10, 5, 9, 6, 8, 7]
	*/
	@Test
	void testCase4() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		input.add(12);
		input.add(13);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(13);
		expected.add(2);
		expected.add(12);
		expected.add(3);
		expected.add(11);
		expected.add(4);
		expected.add(10);
		expected.add(5);
		expected.add(9);
		expected.add(6);
		expected.add(8);
		expected.add(7);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
	* Expected output: [1, 14, 2, 13, 3, 12, 4, 11, 5, 10, 6, 9, 7, 8]
	*/
	@Test
	void testCase5() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		input.add(12);
		input.add(13);
		input.add(14);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(14);
		expected.add(2);
		expected.add(13);
		expected.add(3);
		expected.add(12);
		expected.add(4);
		expected.add(11);
		expected.add(5);
		expected.add(10);
		expected.add(6);
		expected.add(9);
		expected.add(7);
		expected.add(8);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
	* Expected output: [1, 15, 2, 14, 3, 13, 4, 12, 5, 11, 6, 10, 7, 9, 8]
	*/
	@Test
	void testCase6() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		input.add(12);
		input.add(13);
		input.add(14);
		input.add(15);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(15);
		expected.add(2);
		expected.add(14);
		expected.add(3);
		expected.add(13);
		expected.add(4);
		expected.add(12);
		expected.add(5);
		expected.add(11);
		expected.add(6);
		expected.add(10);
		expected.add(7);
		expected.add(9);
		expected.add(8);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
	* Expected output: [1, 16, 2, 15, 3, 14, 4, 13, 5, 12, 6, 11, 7, 10, 8, 9]
	*/
	@Test
	void testCase7() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		input.add(12);
		input.add(13);
		input.add(14);
		input.add(15);
		input.add(16);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(16);
		expected.add(2);
		expected.add(15);
		expected.add(3);
		expected.add(14);
		expected.add(4);
		expected.add(13);
		expected.add(5);
		expected.add(12);
		expected.add(6);
		expected.add(11);
		expected.add(7);
		expected.add(10);
		expected.add(8);
		expected.add(9);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]
	* Expected output: [1, 17, 2, 16, 3, 15, 4, 14, 5, 13, 6, 12, 7, 11, 8, 10, 9]
	*/
	@Test
	void testCase8() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		input.add(12);
		input.add(13);
		input.add(14);
		input.add(15);
		input.add(16);
		input.add(17);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(17);
		expected.add(2);
		expected.add(16);
		expected.add(3);
		expected.add(15);
		expected.add(4);
		expected.add(14);
		expected.add(5);
		expected.add(13);
		expected.add(6);
		expected.add(12);
		expected.add(7);
		expected.add(11);
		expected.add(8);
		expected.add(10);
		expected.add(9);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
	* Expected output: [1, 18, 2, 17, 3, 16, 4, 15, 5, 14, 6, 13, 7, 12, 8, 11, 9, 10]
	*/
	@Test
	void testCase9() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		input.add(12);
		input.add(13);
		input.add(14);
		input.add(15);
		input.add(16);
		input.add(17);
		input.add(18);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(18);
		expected.add(2);
		expected.add(17);
		expected.add(3);
		expected.add(16);
		expected.add(4);
		expected.add(15);
		expected.add(5);
		expected.add(14);
		expected.add(6);
		expected.add(13);
		expected.add(7);
		expected.add(12);
		expected.add(8);
		expected.add(11);
		expected.add(9);
		expected.add(10);
		List<Object> actual = StrangeSortList.strangeSortList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
	* Expected output: [1, 19, 2, 18, 3, 17, 4, 16, 5, 15, 6, 14, 7, 13, 8, 12, 9, 11, 10]
	*/
	@Test
	void testCase10() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		input.add(12);
		input.add(13);
		input.add(14);
		input.add(15