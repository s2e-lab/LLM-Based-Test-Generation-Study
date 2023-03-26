// CompareTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {

    @Test
    void testCompareAllCorrectGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareAllIncorrectGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(6, 7, 8, 9, 10, 2);
        List<Integer> expected = Arrays.asList(5, 5, 5, 5, 5, 1);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareSomeCorrectGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 2, -2);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 3, 3);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareAllZeros() {
        List<Integer> game = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> guess = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareAllNegatives() {
        List<Integer> game = Arrays.asList(-1, -2, -3, -4, -5, -1);
        List<Integer> guess = Arrays.asList(-1, -2, -3, -4, -5, -1);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareSomeNegatives() {
        List<Integer> game = Arrays.asList(1, 2, 3);
        List<Integer> guess = Arrays.asList(-1, -2, -3);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareSomeNegativesAndPositives() {
        List<Integer> game = Arrays.asList(1, 2, 3, 5);
        List<Integer> guess = Arrays.asList(-1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(2, 0, 0, 1);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareEmptyLists() {
        List<Integer> game = Arrays.asList();
        List<Integer> guess = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareDifferentLengthLists() {
        List<Integer> game = Arrays.asList(1, 2, 3);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4);
        assertThrows(IllegalArgumentException.class, () -> Compare.compare(game, guess));
    }

    @Test
    void testCompareNullLists() {
        assertThrows(NullPointerException.class, () -> Compare.compare(null, null));
    }
}