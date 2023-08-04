// CountDistinctCharactersTest.java
package scenario1;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {

    @Test
    void testCountDistinctCharacters() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
        assertEquals(2, CountDistinctCharacters.countDistinctCharacters("ab"));
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("abc"));
        assertEquals(4, CountDistinctCharacters.countDistinctCharacters("abcd"));
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
        assertEquals(6, CountDistinctCharacters.countDistinctCharacters("abcdef"));
        assertEquals(7, CountDistinctCharacters.countDistinctCharacters("abcdefg"));
        assertEquals(8, CountDistinctCharacters.countDistinctCharacters("abcdefgh"));
        assertEquals(9, CountDistinctCharacters.countDistinctCharacters("abcdefghi"));
        assertEquals(10, CountDistinctCharacters.countDistinctCharacters("abcdefghij"));
    }
}
