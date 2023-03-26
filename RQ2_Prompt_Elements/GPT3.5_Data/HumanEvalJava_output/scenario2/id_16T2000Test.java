Here's the code for the CountDistinctCharactersTest class with ten unit test cases for the countDistinctCharacters method:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountDistinctCharactersTest {

    @Test
    void testEmptyString() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaa"));
    }

    @Test
    void testAllDifferentCharacters() {
        assertEquals(26, CountDistinctCharacters.countDistinctCharacters("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void testMixedCase() {
        assertEquals(26, CountDistinctCharacters.countDistinctCharacters("aBcDeFgHiJkLmNoPqRsTuVwXyZ"));
    }

    @Test
    void testWithSpaces() {
        assertEquals(4, CountDistinctCharacters.countDistinctCharacters("a b c d"));
    }

    @Test
    void testWithNumbers() {
        assertEquals(10, CountDistinctCharacters.countDistinctCharacters("1234567890"));
    }

    @Test
    void testWithSpecialCharacters() {
        assertEquals(6, CountDistinctCharacters.countDistinctCharacters("!@#$%^&*()"));
    }

    @Test
    void testWithMixedCharacters() {
        assertEquals(10, CountDistinctCharacters.countDistinctCharacters("a1b2c3d4e5"));
    }

    @Test
    void testWithNullString() {
        assertThrows(NullPointerException.class, () -> CountDistinctCharacters.countDistinctCharacters(null));
    }
}
```