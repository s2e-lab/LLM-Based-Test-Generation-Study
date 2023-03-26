// CompareTest.java
package scenario2;

import java.util.ArrayList;
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
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareAllIncorrectGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> expected = Arrays.asList(4, 2, 0, 2, 4);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareSomeCorrectGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess = Arrays.asList(1, 3, 3, 2, 5);
        List<Integer> expected = Arrays.asList(0, 1, 0, 2, 0);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareSomeIncorrectGuesses() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess = Arrays.asList(2, 4, 3, 2, 6);
        List<Integer> expected = Arrays.asList(1, 2, 0, 2, 1);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareEmptyLists() {
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }

    @Test
    void testCompareDifferentListSizes() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4);
        assertThrows(IllegalArgumentException.class, () -> Compare.compare(game, guess));
    }

    @Test
    void testCompareNullLists() {
        List<Integer> game = null;
        List<Integer> guess = null;
        assertThrows(NullPointerException.class, () -> Compare.compare(game, guess));
    }

    @Test
    void testCompareNullGameList() {
        List<Integer> game = null;
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 5);
        assertThrows(NullPointerException.class, () -> Compare.compare(game, guess));
    }

    @Test
    void testCompareNullGuessList() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> guess = null;
        assertThrows(NullPointerException.class, () -> Compare.compare(game, guess));
    }

    @Test
    void testCompareLargeLists() {
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            game.add(i);
            guess.add(i + 1);
        }
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            expected.add(1);
        }
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(expected, result);
    }
}