// CountDistinctCharactersTest.java
package scenario2;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string is null.
     */
    @Test
    void testCountDistinctCharacters_NullString() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters(null));
    }

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string is empty.
     */
    @Test
    void testCountDistinctCharacters_EmptyString() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
    }

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string consists of only one character.
     */
    @Test
    void testCountDistinctCharacters_StringWithOneCharacter() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
    }

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string consists of two characters.
     */
    @Test
    void testCountDistinctCharacters_StringWithTwoCharacters() {
        assertEquals(2, CountDistinctCharacters.countDistinctCharacters("ab"));
    }

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string consists of three characters.
     */
    @Test
    void testCountDistinctCharacters_StringWithThreeCharacters() {
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("abc"));
    }

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string consists of four characters.
     */
    @Test
    void testCountDistinctCharacters_StringWithFourCharacters() {
        assertEquals(4, CountDistinctCharacters.countDistinctCharacters("abcd"));
    }

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string consists of five characters.
     */
    @Test
    void testCountDistinctCharacters_StringWithFiveCharacters() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
    }

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string consists of six characters.
     */
    @Test
    void testCountDistinctCharacters_StringWithSixCharacters() {
        assertEquals(6, CountDistinctCharacters.countDistinctCharacters("abcdef"));
    }

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string consists of seven characters.
     */
    @Test
    void testCountDistinctCharacters_StringWithSevenCharacters() {
        assertEquals(7, CountDistinctCharacters.countDistinctCharacters("abcdefg"));
    }

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string consists of eight characters.
     */
    @Test
    void testCountDistinctCharacters_StringWithEightCharacters() {
        assertEquals(8, CountDistinctCharacters.countDistinctCharacters("abcdefgh"));
    }

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string consists of nine characters.
     */
    @Test
    void testCountDistinctCharacters_StringWithNineCharacters() {
        assertEquals(9, CountDistinctCharacters.countDistinctCharacters("abcdefghi"));
    }

    /**
     * Test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
     * It tests the case when the string consists of ten characters.
     */
    @Test
    void testCountDistinctCharacters_StringWithTenCharacters() {
        assertEquals(10, CountDistinctCharacters.countDistinctCharacters("abcdefghij"));
    }
}
