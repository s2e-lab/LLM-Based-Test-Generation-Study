// CompareTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {

    /**
     * Test case for {@link Compare#compare(List, List)}.
     */
    @Test
    void testCompare() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        game.add(1);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(2);
        guess.add(-2);
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(3);
        expected.add(3);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)}.
     */
    @Test
    void testCompare2() {
        List<Integer> game = new ArrayList<>();
        game.add(0);
        game.add(0);
        game.add(0);
        game.add(0);
        game.add(0);
        game.add(0);
        List<Integer> guess = new ArrayList<>();
        guess.add(0);
        guess.add(0);
        guess.add(0);
        guess.add(0);
        guess.add(0);
        guess.add(0);
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)}.
     */
    @Test
    void testCompare3() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        guess.add(-1);
        guess.add(-2);
        guess.add(-3);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)}.
     */
    @Test
    void testCompare4() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(-1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(0);
        expected.add(0);
        expected.add(1);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)}.
     */
    @Test
    void testCompare5() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        game.add(1);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(2);
        guess.add(-2);
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(3);
        expected.add(3);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)}.
     */
    @Test
    void testCompare6() {
        List<Integer> game = new ArrayList<>();
        game.add(0);
        game.add(5);
        game.add(0);
        game.add(0);
        game.add(0);
        game.add(4);
        List<Integer> guess = new ArrayList<>();
        guess.add(4);
        guess.add(1);
        guess.add(1);
        guess.add(0);
        guess.add(0);
        guess.add(-2);
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(4);
        expected.add(1);
        expected.add(0);
        expected.add(0);
        expected.add(6);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)}.
     */
    @Test
    void testCompare7() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        game.add(1);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(2);
        guess.add(-2);
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(3);
        expected.add(3);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)}.
     */
    @Test
    void testCompare8() {
        List<Integer> game = new ArrayList<>();
        game.add(0);
        game.add(0);
        game.add(0);
        game.add(0);
        game.add(0);
        game.add(0);
        List<Integer> guess = new ArrayList<>();
        guess.add(0);
        guess.add(0);
        guess.add(0);
        guess.add(0);
        guess.add(0);
        guess.add(0);
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)}.
     */
    @Test
    void testCompare9() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        List<Integer> guess = new ArrayList<>();
        guess.add(-1);
        guess.add(-2);
        guess.add(-3);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        assertEquals(expected, Compare.compare(game, guess));
    }

    /**
     * Test case for {@link Compare#compare(List, List)}.
     */
    @Test
    void testCompare10() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(-1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(0);
        expected.add(0);
        expected.add(1);
        assertEquals(expected, Compare.compare(game, guess));
    }
}
