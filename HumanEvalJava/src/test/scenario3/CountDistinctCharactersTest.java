package scenario3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDistinctCharactersTest {

    @Test
    public void test() throws Exception {

        assertEquals(3, scenario3.CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
        assertEquals(4, scenario3.CountDistinctCharacters.countDistinctCharacters("Jerry"));
        assertEquals(0, scenario3.CountDistinctCharacters.countDistinctCharacters(""));
        assertEquals(5, scenario3.CountDistinctCharacters.countDistinctCharacters("abcde"));
        assertEquals(5, scenario3.CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
        assertEquals(1, scenario3.CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
        assertEquals(5, scenario3.CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));

    }

}