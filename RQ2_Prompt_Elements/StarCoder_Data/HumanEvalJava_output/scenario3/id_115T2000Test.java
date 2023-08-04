// MaxFillTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {

    /**
    * Test case number: 1
    * Test case values: [[0, 0, 1, 0], [0, 1, 0, 0], [1, 1, 1, 1]], 1
    */
    @Test
    void testMaxFill01() {
        List<List<Integer>> grid = List.of(List.of(0, 0, 1, 0), List.of(0, 1, 0, 0), List.of(1, 1, 1, 1));
        int capacity = 1;
        int expected = 6;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 2
    * Test case values: [[0, 0, 1, 1], [0, 0, 0, 0], [1, 1, 1, 1], [0, 1, 1, 1]], 2
    */
    @Test
    void testMaxFill02() {
        List<List<Integer>> grid = List.of(List.of(0, 0, 1, 1), List.of(0, 0, 0, 0), List.of(1, 1, 1, 1), List.of(0, 1, 1, 1));
        int capacity = 2;
        int expected = 5;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 3
    * Test case values: [[0, 0, 0], [0, 0, 0]], 5
    */
    @Test
    void testMaxFill03() {
        List<List<Integer>> grid = List.of(List.of(0, 0, 0), List.of(0, 0, 0));
        int capacity = 5;
        int expected = 0;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 4
    * Test case values: [[1, 1, 1, 1], [1, 1, 1, 1]], 2
    */
    @Test
    void testMaxFill04() {
        List<List<Integer>> grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
        int capacity = 2;
        int expected = 4;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 5
    * Test case values: [[1, 1, 1, 1], [1, 1, 1, 1]], 9
    */
    @Test
    void testMaxFill05() {
        List<List<Integer>> grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
        int capacity = 9;
        int expected = 2;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 6
    * Test case values: [[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0