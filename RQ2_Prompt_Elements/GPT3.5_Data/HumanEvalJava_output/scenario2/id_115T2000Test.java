// MaxFillTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {

    @Test
    void testMaxFillWithSingleWell() {
        List<List<Integer>> grid = Arrays.asList(Arrays.asList(1, 1, 1));
        int capacity = 2;
        int expected = 2;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithMultipleWells() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 1),
            Arrays.asList(0, 1, 0),
            Arrays.asList(1, 1, 1)
        );
        int capacity = 2;
        int expected = 4;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithAllWellsEmpty() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(0, 0, 0),
            Arrays.asList(0, 0, 0),
            Arrays.asList(0, 0, 0)
        );
        int capacity = 2;
        int expected = 0;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithAllWellsFull() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 1, 1),
            Arrays.asList(1, 1, 1),
            Arrays.asList(1, 1, 1)
        );
        int capacity = 2;
        int expected = 5;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithCapacityGreaterThanWellSize() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 1, 1),
            Arrays.asList(1, 1, 1),
            Arrays.asList(1, 1, 1)
        );
        int capacity = 10;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithCapacityEqualToWellSize() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 1, 1),
            Arrays.asList(1, 1, 1),
            Arrays.asList(1, 1, 1)
        );
        int capacity = 3;
        int expected = 3;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithEmptyGrid() {
        List<List<Integer>> grid = Arrays.asList();
        int capacity = 2;
        int expected = 0;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithSingleRow() {
        List<List<Integer>> grid = Arrays.asList(Arrays.asList(1, 0, 1, 1, 0));
        int capacity = 2;
        int expected = 3;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithSingleColumn() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(0),
            Arrays.asList(1),
            Arrays.asList(1),
            Arrays.asList(0)
        );
        int capacity = 2;
        int expected = 3;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithLargeGrid() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 1, 1, 0, 1, 0, 1, 1, 0),
            Arrays.asList(0, 1, 0, 1, 1, 0, 1, 0, 1, 1),
            Arrays.asList(1, 1, 1, 0, 1, 1, 0, 1, 0, 1),
            Arrays.asList(0, 1, 1, 1, 0, 1, 1, 0, 1, 0),
            Arrays.asList(1, 0, 1, 0, 1, 1, 0, 1, 1, 1),
            Arrays.asList(0, 1, 0, 1, 0, 1, 1, 1, 0, 1),
            Arrays.asList(1, 1, 1, 0, 1, 0, 1, 1, 1, 0),
            Arrays.asList(0, 1, 1, 1, 0, 1, 0, 1, 0, 1),
            Arrays.asList(1, 0, 1, 0, 1, 0, 1, 0, 1, 1),
            Arrays.asList(0, 1, 0, 1, 0, 1, 0, 1, 0, 1)
        );
        int capacity = 3;
        int expected = 20;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
}