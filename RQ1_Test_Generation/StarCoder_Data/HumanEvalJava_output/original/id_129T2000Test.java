// MinpathTest.java
package original;

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
    * Test case number: 1
    * Test case values: [[1, 2, 3], [4, 5, 6], [7, 8, 9]], k = 3
    * Expected output (Post-state): [1, 2, 1]
    */
    @Test
    void test1() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>());
        grid.get(0).add(1);
        grid.get(0).add(2);
        grid.get(0).add(3);
        grid.add(new ArrayList<>());
        grid.get(1).add(4);
        grid.get(1).add(5);
        grid.get(1).add(6);
        grid.add(new ArrayList<>());
        grid.get(2).add(7);
        grid.get(2).add(8);
        grid.get(2).add(9);
        int k = 3;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Minpath.minpath(grid, k));
    }

    /**
    * Test case number: 2
    * Test case values: [[5, 9, 3], [4, 1, 6], [7, 8, 2]], k = 1
    * Expected output (Post-state): [1]
    */
    @Test
    void test2() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>());
        grid.get(0).add(5);
        grid.get(0).add(9);
        grid.get(0).add(3);
        grid.add(new ArrayList<>());
        grid.get(1).add(4);
        grid.get(1).add(1);
        grid.get(1).add(6);
        grid.add(new ArrayList<>());
        grid.get(2).add(7);
        grid.get(2).add(8);
        grid.get(2).add(2);
        int k = 1;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, Minpath.minpath(grid, k));
    }

    /**
    * Test case number: 3
    * Test case values: [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]], k = 4
    * Expected output (Post-state): [1, 2, 1, 2]
    */
    @Test
    void test3() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>());
        grid.get(0).add(1);
        grid.get(0).add(2);
        grid.get(0).add(3);
        grid.get(0).add(4);
        grid.add(new ArrayList<>());
        grid.get(1).add(5);
        grid.get(1).add(6);
        grid.get(1).add(7);
        grid.get(1).add(8);
        grid.add(new ArrayList<>());
        grid.get(2).add(9);
        grid.get(2).add(10);
        grid.get(2).add(11);
        grid.get(2).add(12);
        grid.add(new ArrayList<>());
        grid.get(3).add(13);
        grid.get(3).add(14);
        grid.get(3).add(15);
        grid.get(3).add(16);
        int k = 4;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(1);
        expected.add(2);
        assertEquals(expected, Minpath.minpath(grid, k));
    }

    /**
    * Test case number: 4
    * Test case values: [[6, 4, 13, 10], [5, 7, 12, 1], [3, 16, 11, 15], [8, 14, 9, 2]], k = 7
    * Expected output (Post-state): [1, 10, 1, 10, 1, 10, 1]
    */
    @Test
    void test4() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>());
        grid.get(0).add(6);
        grid.get(0).add(4);
        grid.get(0).add(13);
        grid.get(0).add(10);
        grid.add(new ArrayList<>());
        grid.get(1).add(5);
        grid.get(1).add(7);
        grid.get(1).add(12);
        grid.get(1).add(1);
        grid.add(new ArrayList<>());
        grid.get(2).add(3);
        grid.get(2).add(16);
        grid.get(2).add(11);
        grid.get(2).add(15);
        grid.add(new ArrayList<>());
        grid.get(3).add(8);
        grid.get(3).add(14);
        grid.get(3).add(9);
        grid.get(3).add(2);
        int k = 7;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(10);
        expected.add(1);
        expected.add(10);
        expected.add(1);
        expected.add(10);
        expected.add(1);
        assertEquals(expected, Minpath.minpath(grid, k));
    }

    /**
    * Test case number: 5
    * Test case values: [[8, 14, 9, 2], [6, 4, 13, 15], [5, 7, 1, 12], [3, 10, 11, 16]], k = 5
    * Expected output (Post-state): [1, 7, 1, 7, 1]
    */
    @Test
    void test5() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>());
        grid.get(0).add(8);
        grid.get(0).add(14);
        grid.get(0).add(9);
        grid.get(0).add(2);
        grid.add(new ArrayList<>());
        grid.get(1).add(6);
        grid.get(1).add(4);
        grid.get(1).add(13);
        grid.get(1).add(15);
        grid.add(new ArrayList<>());
        grid.get(2).add(5);
        grid.get(2).add(7);
        grid.get(2).add(1);
        grid.get(2).add(12);
        grid.add(new ArrayList<>());
        grid.get(3).add(3);
        grid.get(3).add(10);
        grid.get(3).add(11);
        grid.get(3).add(16);
        int k = 5;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(7);
        expected.add(1);
        expected.add(7);
        expected.add(1);
        assertEquals(expected, Minpath.minpath(grid, k));
    }

    /**
    * Test case number: 6
    * Test case values: [[11, 8, 7, 2], [5, 16, 14, 4], [9, 3, 15, 6], [12, 13, 10, 1]], k = 9
    * Expected output (Post-state): [1, 6, 1, 6, 1, 6, 1, 6, 1]
    */
    @Test
    void test6() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>());
        grid.get(0).add(11);
        grid.get(0).add(8);
        grid.get(0).add(7);
        grid.get(0).add(2);
        grid.add(new ArrayList<>());
        grid.get(1).add(5);
        grid.get(1).add(16);
        grid.get(1).add(14);
        grid.get