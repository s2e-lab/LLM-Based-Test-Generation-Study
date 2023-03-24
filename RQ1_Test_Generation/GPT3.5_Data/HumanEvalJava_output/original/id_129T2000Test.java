// MinpathTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
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
        grid.add(Arrays.asList(1, 2, 3));
        grid.add(Arrays.asList(4, 5, 6));
        grid.add(Arrays.asList(7, 8, 9));
        List<Integer> expected = Arrays.asList(1, 2, 1);
        List<Integer> actual = Minpath.minpath(grid, 3);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath2() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(5, 9, 3));
        grid.add(Arrays.asList(4, 1, 6));
        grid.add(Arrays.asList(7, 8, 2));
        List<Integer> expected = Collections.singletonList(1);
        List<Integer> actual = Minpath.minpath(grid, 1);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath3() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 2, 3, 4));
        grid.add(Arrays.asList(5, 6, 7, 8));
        grid.add(Arrays.asList(9, 10, 11, 12));
        grid.add(Arrays.asList(13, 14, 15, 16));
        List<Integer> expected = Arrays.asList(1, 2, 1, 2);
        List<Integer> actual = Minpath.minpath(grid, 4);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath4() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(6, 4, 13, 10));
        grid.add(Arrays.asList(5, 7, 12, 1));
        grid.add(Arrays.asList(3, 16, 11, 15));
        grid.add(Arrays.asList(8, 14, 9, 2));
        List<Integer> expected = Arrays.asList(1, 10, 1, 10, 1, 10, 1);
        List<Integer> actual = Minpath.minpath(grid, 7);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath5() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(8, 14, 9, 2));
        grid.add(Arrays.asList(6, 4, 13, 15));
        grid.add(Arrays.asList(5, 7, 1, 12));
        grid.add(Arrays.asList(3, 10, 11, 16));
        List<Integer> expected = Arrays.asList(1, 7, 1, 7, 1);
        List<Integer> actual = Minpath.minpath(grid, 5);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath6() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(11, 8, 7, 2));
        grid.add(Arrays.asList(5, 16, 14, 4));
        grid.add(Arrays.asList(9, 3, 15, 6));
        grid.add(Arrays.asList(12, 13, 10, 1));
        List<Integer> expected = Arrays.asList(1, 6, 1, 6, 1, 6, 1, 6, 1);
        List<Integer> actual = Minpath.minpath(grid, 9);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath7() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(12, 13, 10, 1));
        grid.add(Arrays.asList(9, 3, 15, 6));
        grid.add(Arrays.asList(5, 16, 14, 4));
        grid.add(Arrays.asList(11, 8, 7, 2));
        List<Integer> expected = Arrays.asList(1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6);
        List<Integer> actual = Minpath.minpath(grid, 12);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath8() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(2, 7));
        grid.add(Arrays.asList(3, 4));
        List<Integer> expected = Arrays.asList(1, 2, 1, 2, 1, 2, 1, 2);
        List<Integer> actual = Minpath.minpath(grid, 10);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath9() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 3));
        grid.add(Arrays.asList(3, 2));
        List<Integer> expected = Arrays.asList(1, 3, 1, 3, 1, 3, 1, 3, 1, 3);
        List<Integer> actual = Minpath.minpath(grid, 10);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath10() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 2));
        grid.add(Arrays.asList(3, 4));
        List<Integer> expected = Arrays.asList(1, 2, 1, 2, 1, 2, 1, 2, 1, 2);
        List<Integer> actual = Minpath.minpath(grid, 10);
        assertEquals(expected, actual);
    }
}