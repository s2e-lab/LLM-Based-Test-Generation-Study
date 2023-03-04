// MinpathTest.java
package scenario3;

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

	@Test
	void testMinpath1() {
		List<List<Integer>> grid = new ArrayList<>();
		grid.add(new ArrayList<>(List.of(1, 2, 3)));
		grid.add(new ArrayList<>(List.of(4, 5, 6)));
		grid.add(new ArrayList<>(List.of(7, 8, 9)));
		assertEquals(List.of(1, 2, 1), Minpath.minpath(grid, 3));
	}
	
	@Test
	void testMinpath2() {
		List<List<Integer>> grid = new ArrayList<>();
		grid.add(new ArrayList<>(List.of(5, 9, 3)));
		grid.add(new ArrayList<>(List.of(4, 1, 6)));
		grid.add(new ArrayList<>(List.of(7, 8, 2)));
		assertEquals(List.of(1), Minpath.minpath(grid, 1));
	}
	
	@Test
	void testMinpath3() {
		List<List<Integer>> grid = new ArrayList<>();
		grid.add(new ArrayList<>(List.of(1, 2, 3, 4)));
		grid.add(new ArrayList<>(List.of(5, 6, 7, 8)));
		grid.add(new ArrayList<>(List.of(9, 10, 11, 12)));
		grid.add(new ArrayList<>(List.of(13, 14, 15, 16)));
		assertEquals(List.of(1, 2, 1, 2), Minpath.minpath(grid, 4));
	}
	
	@Test
	void testMinpath4() {
		List<List<Integer>> grid = new ArrayList<>();
		grid.add(new ArrayList<>(List.of(6, 4, 13, 10)));
		grid.add(new ArrayList<>(List.of(5, 7, 12, 1)));
		grid.add(new ArrayList<>(List.of(3, 16, 11, 15)));
		grid.add(new ArrayList<>(List.of(8, 14, 9, 2)));
		assertEquals(List.of(1, 10, 1, 10, 1, 10, 1), Minpath.minpath(grid, 7));
	}
	
	@Test
	void testMinpath5() {
		List<List<Integer>> grid = new ArrayList<>();
		grid.add(new ArrayList<>(List.of(8, 14, 9, 2)));
		grid.add(new ArrayList<>(List.of(6, 4, 13, 15)));
		grid.add(new ArrayList<>(List.of(5, 7, 1, 12)));
		grid.add(new ArrayList<>(List.of(3, 10, 11, 16)));
		assertEquals(List.of(1, 7, 1, 7, 1), Minpath.minpath(grid, 5));
	}
	
	@Test
	void testMinpath6() {
		List<List<Integer>> grid = new ArrayList<>();
		grid.add(new ArrayList<>(List.of(11, 8, 7, 2)));
		grid.add(new ArrayList<>(List.of(5, 16, 14, 4)));
		grid.add(new ArrayList<>(List.of(9, 3, 15, 6)));
		grid.add(new ArrayList<>(List.of(12, 13, 10, 1)));
		assertEquals(List.of(1, 6, 1, 6, 1, 6, 1, 6, 1), Minpath.minpath(grid, 9));
	}
	
	@Test
	void testMinpath7() {
		List<List<Integer>> grid = new ArrayList<>();
		grid.add(new ArrayList<>(List.of(12, 13, 10, 1)));
		grid.add(new ArrayList<>(List.of(9, 3, 15, 6)));
		grid.add(new ArrayList<>(List.of(5, 16, 14, 4)));
		grid.add(new ArrayList<>(List.of(11, 8, 7, 2)));
		assertEquals(List.of(1, 6, 1, 6, 1, 6, 1, 6, 1, 6), Minpath.minpath(grid, 12));
	}
	
	@Test
	void testMinpath8() {
		List<List<Integer>> grid = new ArrayList<>();
		grid.add(new ArrayList<>(List.of(2, 7, 4)));
		grid.add(new ArrayList<>(List.of(3, 1, 5)));
		grid.add(new ArrayList<>(List.of(6, 8, 9)));
		assertEquals(List.of(1, 3, 1, 3, 1, 3, 1, 3), Minpath.minpath(grid, 8));
	}
	
	@Test
	void testMinpath9() {
		List<List<Integer>> grid = new ArrayList<>();
		grid.add(new ArrayList<>(List.of(6, 1, 5)));
		grid.add(new ArrayList<>(List.of(3, 8, 9)));
		grid.add(new ArrayList<>(List.of(2, 7, 4)));
		assertEquals(List.of(1, 5, 1, 5, 1, 5, 1, 5), Minpath.minpath(grid, 8));
	}
	
	@Test
	void testMinpath10() {
		List<List<Integer>> grid = new ArrayList<>();
		grid.add(new ArrayList<>(List.of(1, 2)));
		grid.add(new ArrayList<>(List.of(3, 4)));
		assertEquals(List.of(1, 2, 1, 2, 1, 2, 1, 2, 1, 2), Minpath.minpath(grid, 10));
	}
}