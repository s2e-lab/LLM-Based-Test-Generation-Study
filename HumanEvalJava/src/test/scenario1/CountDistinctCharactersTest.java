package scenario1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDistinctCharactersTest {

    @Test
    public void test() throws Exception {

        assertEquals(3, scenario1.CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
        assertEquals(4, scenario1.CountDistinctCharacters.countDistinctCharacters("Jerry"));
        assertEquals(0, scenario1.CountDistinctCharacters.countDistinctCharacters(""));
        assertEquals(5, scenario1.CountDistinctCharacters.countDistinctCharacters("abcde"));
        assertEquals(5, scenario1.CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
        assertEquals(1, scenario1.CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
        assertEquals(5, scenario1.CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));

    }

}