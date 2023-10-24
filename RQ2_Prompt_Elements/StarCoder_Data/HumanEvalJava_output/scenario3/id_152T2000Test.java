// CompareTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {

    /**
     * Test case for {@link Compare#compare(List, List)} where the guesses are correct.
     */
    @Test
    void testCompare1() {
        List<Integer> game = List.of(1, 2, 3, 4, 5, 1);
        List<Integer> guess = List.of(1, 2, 3, 4, 2, -2);
        List<Integer> expected = List.of(0, 0, 0, 0, 3, 3);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)} where the guesses are correct.
     */
    @Test
    void testCompare2() {
        List<Integer> game = List.of(0, 0, 0, 0, 0, 0);
        List<Integer> guess = List.of(0, 0, 0, 0, 0, 0);
        List<Integer> expected = List.of(0, 0, 0, 0, 0, 0);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)} where the guesses are correct.
     */
    @Test
    void testCompare3() {
        List<Integer> game = List.of(1, 2, 3);
        List<Integer> guess = List.of(-1, -2, -3);
        List<Integer> expected = List.of(2, 4, 6);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)} where the guesses are correct.
     */
    @Test
    void testCompare4() {
        List<Integer> game = List.of(1, 2, 3, 5);
        List<Integer> guess = List.of(-1, 2, 3, 4);
        List<Integer> expected = List.of(2, 0, 0, 1);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)} where the guesses are correct.
     */
    @Test
    void testCompare5() {
        List<Integer> game = List.of(1, 2, 3, 4, 5, 1);
        List<Integer> guess = List.of(1, 2, 3, 4, 2, -2);
        List<Integer> expected = List.of(0, 0, 0, 0, 3, 3);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)} where the guesses are correct.
     */
    @Test
    void testCompare6() {
        List<Integer> game = List.of(0, 0, 0, 0, 0, 0);
        List<Integer> guess = List.of(0, 0, 0, 0, 0, 0);
        List<Integer> expected = List.of(0, 0, 0, 0, 0, 0);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)} where the guesses are correct.
     */
    @Test
    void testCompare7() {
        List<Integer> game = List.of(1, 2, 3);
        List<Integer> guess = List.of(-1, -2, -3);
        List<Integer> expected = List.of(2, 4, 6);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)} where the guesses are correct.
     */
    @Test
    void testCompare8() {
        List<Integer> game = List.of(1, 2, 3, 5);
        List<Integer> guess = List.of(-1, 2, 3, 4);
        List<Integer> expected = List.of(2, 0, 0, 1);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)} where the guesses are correct.
     */
    @Test
    void testCompare9() {
        List<Integer> game = List.of(1, 2, 3, 4, 5, 1);
        List<Integer> guess = List.of(1, 2, 3, 4, 2, -2);
        List<Integer> expected = List.of(0, 0, 0, 0, 3, 3);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)} where the guesses are correct.
     */
    @Test
    void testCompare10() {
        List<Integer> game = List.of(0, 0, 0, 0, 0, 0);
        List<Integer> guess = List.of(0, 0, 0, 0, 0, 0);
        List<Integer> expected = List.of(0, 0, 0, 0, 0, 0);
        assertEquals(expected, Compare.compare(game, guess));
    }
}
