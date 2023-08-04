// MinpathTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minpath}.
* It contains ten unit test cases for the {@link Minpath#minpath(List, int)} method.
*/
class MinpathTest {

    /**
    * Test case number: 1
    * Test case values: [[1, 2, 3], [4, 5, 6], [7, 8, 9]], k = 3
    * Expected result: [1, 2, 1]
    */
    @Test
    void test1() {
        List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        int k = 3;
        List<Integer> expected = List.of(1, 2, 1);
        List<Integer> result = Minpath.minpath(grid, k);
        assertEquals(expected, result);
    }

    /**
    * Test case number: 2
    * Test case values: [[5, 9, 3], [4, 1, 6], [7, 8, 2]], k = 1
    * Expected result: [1]
    */
    @Test
    void test2() {
        List<List<Integer>> grid = List.of(List.of(5, 9, 3), List.of(4, 1, 6), List.of(7, 8, 2));
        int k = 1;
        List<Integer> expected = List.of(1);
        List<Integer> result = Minpath.minpath(grid, k);
        assertEquals(expected, result);
    }

    /**
    * Test case number: 3
    * Test case values: [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]], k = 4
    * Expected result: [1, 2, 1, 2]
    */
    @Test
    void test3() {
        List<List<Integer>> grid = List.of(List.of(1, 2, 3, 4), List.of(5, 6, 7, 8), List.of(9, 10, 11, 12), List.of(13, 14, 15, 16));
        int k = 4;
        List<Integer> expected = List.of(1, 2, 1, 2);
        List<Integer> result = Minpath.minpath(grid, k);
        assertEquals(expected, result);
    }

    /**
    * Test case number: 4
    * Test case values: [[6, 4, 13, 10], [5, 7, 12, 1], [3, 16, 11, 15], [8, 14, 9, 2]], k = 7
    * Expected result: [1, 10, 1, 10, 1, 10, 1]
    */
    @Test
    void test4() {
        List<List<Integer>> grid = List.of(List.of(6, 4, 13, 10), List.of(5, 7, 12, 1), List.of(3, 16, 11, 15), List.of(8, 14, 9, 2));
        int k = 7;
        List<Integer> expected = List.of(1, 10, 1, 10, 1, 10, 1);
        List<Integer> result = Minpath.minpath(grid, k);
        assertEquals(expected, result);
    }

    /**
    * Test case number: 5
    * Test case values: [[8, 14, 9, 2], [6, 4, 13, 15], [5, 7, 1, 12], [3, 10, 11, 16]], k = 5
    * Expected result: [1, 7, 1, 7, 1]
    */
    @Test
    void test5() {
        List<List<Integer>> grid = List.of(List.of(8, 14, 9, 2), List.of(6, 4, 13, 15), List.of(5, 7, 1, 12), List.of(3, 10, 11, 16));
        int k = 5;
        List<Integer> expected = List.of(1, 7, 1, 7, 1);
        List<Integer> result = Minpath.minpath(grid, k);
        assertEquals(expected, result);
    }

    /**
    * Test case number: 6
    * Test case values: [[11, 8, 7, 2], [5, 16, 14, 4], [9, 3, 15, 6], [12, 13, 10, 1]], k = 9
    * Expected result: [1, 6, 1, 6, 1, 6, 1, 6, 1]
    */
    @Test
    void test6() {
        List<List<Integer>> grid = List.of(List.of(11, 8, 7, 2), List.of(5, 16, 14, 4), List.of(9, 3, 15, 6), List.of(12, 13, 10, 1));
        int k = 9;
        List<Integer> expected = List.of(1, 6, 1, 6, 1, 6, 1, 6, 1);
        List<Integer> result = Minpath.minpath(grid, k);
        assertEquals(expected, result);
    }

    /**
    * Test case number: 7
    * Test case values: [[12, 13, 10, 1], [9, 3, 15, 6], [5, 16, 14, 4], [11, 8, 7, 2]], k = 12
    * Expected result: [1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6]
    */
    @Test
    void test7() {
        List<List<Integer>> grid = List.of(List.of(12, 13, 10, 1), List.of(9, 3, 15, 6), List.of(5, 16, 14, 4), List.of(11, 8, 7, 2));
        int k = 12;
        List<Integer> expected = List.of(1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6);
        List<Integer> result = Minpath.minpath(grid, k);
        assertEquals(expected, result);
    }

    /**
    * Test case number: 8
    * Test case values: [[2, 7, 4], [3, 1, 5], [6, 8, 9]], k = 8
    * Expected result: [1, 3, 1, 3, 1, 3, 1, 3]
    */
    @Test
    void test8() {
        List<List<Integer>> grid = List.of(List.of(2, 7, 4), List.of(3, 1, 5), List.of(6, 8, 9));
        int k = 8;
        List<Integer> expected = List.of(1, 3, 1, 3, 1, 3, 1, 3);
        List<Integer> result = Minpath.minpath(grid, k);
        assertEquals(expected, result);
    }

    /**
    * Test case number: 9
    * Test case values: [[6, 1, 5], [3, 8, 9], [2, 7, 4]], k = 8
    * Expected result: [1, 5, 1, 5, 1, 5, 1, 5]
    */
    @Test
    void test9() {
        List<List<Integer>> grid = List.of(List.of(6, 1, 5), List.of(3, 8, 9), List.of(2, 7, 4));
        int k = 8;
        List<Integer> expected = List.of(1, 5, 1, 