// CompareTest.java
package updated;

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
    void testCompareWithAllIncorrectGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(6, 7, 8, 9, 10, 2);
        List<Integer> expected = Arrays.asList(5, 5, 5, 5, 5, 1);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithAllCorrectGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0, 0);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithSomeCorrectGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 2, -2);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 3, 3);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithSomeIncorrectGuesses() {
        List<Integer> game = Arrays.asList(0, 5, 0, 0, 0, 4);
        List<Integer> guess = Arrays.asList(4, 1, 1, 0, 0, -2);
        List<Integer> expected = Arrays.asList(4, 4, 1, 0, 0, 6);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithNegativeNumbers() {
        List<Integer> game = Arrays.asList(-1, -2, -3);
        List<Integer> guess = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithDifferentLengthLists() {
        List<Integer> game = Arrays.asList(1, 2, 3, 5);
        List<Integer> guess = Arrays.asList(-1, 2, 3, 4, 5);
        List<Integer> expected = new ArrayList<>();
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
}