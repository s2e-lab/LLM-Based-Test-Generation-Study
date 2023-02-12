package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CountDistinctCharactersTest {
    @Test
    void testCountDistinctCharacters() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
    }
}