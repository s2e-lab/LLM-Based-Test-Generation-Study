// CompareTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Compare}.
 * It contains ten test cases for the {@link scenario1.Compare#compare()} method.
 */
class CompareTest {
		


    @Test
    void testCompare() {
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        result.add(0);
        result.add(0);
        result.add(0);
        result.add(0);
        assertEquals(result, Compare.compare(game, guess));

        game.clear();
        guess.clear();
        result.clear();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        guess.add(4);
        guess.add(3);
        guess.add(2);
        guess.add(1);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(0);
        assertEquals(result, Compare.compare(game, guess));

        game.clear();
        guess.clear();
        result.clear();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(5);
        result.add(0);
        result.add(0);
        result.add(0);
        result.add(1);
        assertEquals(result, Compare.compare(game, guess));

        game.clear();
        guess.clear();
        result.clear();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(0);
        result.add(0);
        result.add(0);
        result.add(0);
        result.add(4);
        assertEquals(result, Compare.compare(game, guess));

        game.clear();
        guess.clear();
        result.clear();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(6);
        result.add(0);
        result.add(0);
        result.add(0);
        result.add(2);
        assertEquals(result, Compare.compare(game, guess));

        game.clear();
        guess.clear();
        result.clear();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(7);
        result.add(0);
        result.add(0);
        result.add(0);
        result.add(3);
        assertEquals(result, Compare.compare(game, guess));

        game.clear();
        guess.clear();
        result.clear();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(8);
        result.add(0);
        result.add(0);
        result.add(0);
        result.add(4);
        assertEquals(result, Compare.compare(game, guess));

        game.clear();
        guess.clear();
        result.clear();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        guess.add(1);
        guess.add(2);
        guess.add