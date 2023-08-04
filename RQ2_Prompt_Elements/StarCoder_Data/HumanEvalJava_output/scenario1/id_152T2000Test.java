// CompareTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {

    @Test
    void testCompare() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(5);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(result, new ArrayList<>());
    }

    @Test
    void testCompare1() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(6);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(result, new ArrayList<>());
    }

    @Test
    void testCompare2() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(5);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(result, new ArrayList<>());
    }

    @Test
    void testCompare3() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(5);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(result, new ArrayList<>());
    }

    @Test
    void testCompare4() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(5);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(result, new ArrayList<>());
    }

    @Test
    void testCompare5() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(5);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(result, new ArrayList<>());
    }

    @Test
    void testCompare6() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(5);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(result, new ArrayList<>());
    }

    @Test
    void testCompare7() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(5);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(result, new ArrayList<>());
    }

    @Test
    void testCompare8() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(5);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(result, new ArrayList<>());
    }

    @Test
    void testCompare9() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(5);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(result, new ArrayList<>());
    }

    @Test
    void testCompare10() {
        List<Integer> game = new ArrayList<>();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        List<Integer> guess = new ArrayList<>();
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(5);
        List<Integer> result = Compare.compare(game, guess);
        assertEquals(result, new ArrayList<>());
    }
}
