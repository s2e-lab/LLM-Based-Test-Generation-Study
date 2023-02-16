package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class TestCompare {
    @Test
    public void testCompare() {
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        game.add(1);

        guess.add(1);
        guess.add(2);
        guess.add(3);
        guess.add(4);
        guess.add(2);
        guess.add(-2);

        result.add(0);
        result.add(0);
        result.add(0);
        result.add(0);
        result.add(3);
        result.add(3);

        assertEquals(result, Compare.compare(game, guess));
    }
}