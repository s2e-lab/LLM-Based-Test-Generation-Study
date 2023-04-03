// CompareTest.java
package original;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link Compare}.
 * It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
 */
class CompareTest {

    @Test
    void testCompareWithEqualLists() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0, 0);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithDifferentLists() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 2, -2);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 3, 3);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithAllZeros() {
        List<Integer> game = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> guess = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0, 0);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithNegativeNumbers() {
        List<Integer> game = Arrays.asList(1, 2, 3);
        List<Integer> guess = Arrays.asList(-1, -2, -3);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithMixedNumbers() {
        List<Integer> game = Arrays.asList(1, 2, 3, 5);
        List<Integer> guess = Arrays.asList(-1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(2, 0, 0, 1);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithEmptyLists() {
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithDifferentListSizes() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 2);
        List<Integer> expected = null;
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithNullLists() {
        List<Integer> game = null;
        List<Integer> guess = null;
        List<Integer> expected = null;
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithOneNullList() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = null;
        List<Integer> expected = null;
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithOneEmptyList() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = new ArrayList<>();
        List<Integer> expected = null;
        assertEquals(expected, Compare.compare(game, guess));
    }
}