package scenario2;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountDistinctCharactersTest {

    @Test
    public void test() throws Exception{

        assertEquals(3, scenario2.CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
		assertEquals(4, scenario2.CountDistinctCharacters.countDistinctCharacters("Jerry"));
		assertEquals(0, scenario2.CountDistinctCharacters.countDistinctCharacters(""));
		assertEquals(5, scenario2.CountDistinctCharacters.countDistinctCharacters("abcde"));
		assertEquals(5, scenario2.CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
		assertEquals(1, scenario2.CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
		assertEquals(5, scenario2.CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
		
    }

}