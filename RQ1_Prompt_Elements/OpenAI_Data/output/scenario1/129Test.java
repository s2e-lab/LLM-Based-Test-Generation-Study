// MinpathTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minpath}.
* It contains ten unit test cases for the {@link Minpath#minpath(List, int)} method.
*/
class MinpathTest {

	/**
	* Test case 1.
	* The input grid is empty.
	* The expected output is an empty list.
	*/
	@Test
	void testCase1() {
		List<List<Integer>> grid = new ArrayList<>();
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input grid is a 1x1 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase2() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row = new ArrayList<>();
		row.add(1);
		grid.add(row);
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input grid is a 2x2 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase3() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		grid.add(row1);
		grid.add(row2);
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input grid is a 3x3 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase4() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input grid is a 4x4 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase5() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		List<Integer> row4 = new ArrayList<>();
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		grid.add(row4);
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input grid is a 5x5 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase6() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		List<Integer> row4 = new ArrayList<>();
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		List<Integer> row5 = new ArrayList<>();
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		grid.add(row4);
		grid.add(row5);
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input grid is a 6x6 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase7() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		List<Integer> row4 = new ArrayList<>();
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		List<Integer> row5 = new ArrayList<>();
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		List<Integer> row6 = new ArrayList<>();
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		grid.add(row4);
		grid.add(row5);
		grid.add(row6);
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input grid is a 7x7 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase8() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		List<Integer> row4 = new ArrayList<>();
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		List<Integer> row5 = new ArrayList<>();
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		List<Integer> row6 = new ArrayList<>();
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		List<Integer> row7 = new ArrayList<>();
		row7.add(1);
		row7.add(1);
		row7.add(1);
		row7.add(1);
		row7.add(1);
		row7.add(1);
		row7.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		grid.add(row4);
		grid.add(row5);
		grid.add(row6);
		grid.add(row7);
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input grid is a 8x8 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase9() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);
		List<Integer> row4 = new ArrayList<>();
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		row4.add(1);
		List<Integer> row5 = new ArrayList<>();
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		row5.add(1);
		List<Integer> row6 = new ArrayList<>();
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		row6.add(1);
		List<Integer> row7 = new ArrayList<>();
		row7.add(1);
		row7.add(1);
		row7.add(1);
		row7.add(1);
		row7.add(1);
		row7.add(1);
		row7.add(1);
		row7.add(1);
		List<Integer> row8 = new ArrayList<>();
		row8.add(1);
		row8.add(1);
		row8.add(1);
		row8.add(1);
		row8.add(1);
		row