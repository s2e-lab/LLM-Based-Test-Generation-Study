// CountDistinctCharactersTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link CountDistinctCharacters}.
 * It contains ten test cases for the {@link scenario1.CountDistinctCharacters#countDistinctCharacters()} method.
 */
class CountDistinctCharactersTest {
		


    @Test
    void testCountDistinctCharacters() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("A"));
        assertEquals(2, CountDistinctCharacters.countDistinctCharacters("ab"));
        assertEquals(2, CountDistinctCharacters.countDistinctCharacters("aB"));
        assertEquals(2, CountDistinctCharacters.countDistinctCharacters("Ab"));
        assertEquals(2, CountDistinctCharacters.countDistinctCharacters("AB"));
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("abc"));
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("aBc"));
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("abC"));
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("aBC"));
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("Abc"));
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("AbC"));
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("ABc"));
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("ABC"));
    }
}