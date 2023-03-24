// CountDistinctCharactersTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {

    @Test
    void testCountDistinctCharactersWithEmptyString() {
        int result = CountDistinctCharacters.countDistinctCharacters("");
        assertEquals(0, result);
    }

    @Test
    void testCountDistinctCharactersWithLowerCaseString() {
        int result = CountDistinctCharacters.countDistinctCharacters("abcde");
        assertEquals(5, result);
    }

    @Test
    void testCountDistinctCharactersWithUpperCaseString() {
        int result = CountDistinctCharacters.countDistinctCharacters("XYZ");
        assertEquals(3, result);
    }

    @Test
    void testCountDistinctCharactersWithMixedCaseString() {
        int result = CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE");
        assertEquals(5, result);
    }

    @Test
    void testCountDistinctCharactersWithRepeatedCharacters() {
        int result = CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa");
        assertEquals(1, result);
    }

    @Test
    void testCountDistinctCharactersWithSpaces() {
        int result = CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY");
        assertEquals(5, result);
    }

    @Test
    void testCountDistinctCharactersWithSpecialCharacters() {
        int result = CountDistinctCharacters.countDistinctCharacters("Hello, World!");
        assertEquals(10, result);
    }

    @Test
    void testCountDistinctCharactersWithNumbers() {
        int result = CountDistinctCharacters.countDistinctCharacters("1234567890");
        assertEquals(10, result);
    }

    @Test
    void testCountDistinctCharactersWithMixedCharacters() {
        int result = CountDistinctCharacters.countDistinctCharacters("a1B2c3D4e5F6g7H8i9J0");
        assertEquals(20, result);
    }

    @Test
    void testCountDistinctCharactersWithNullString() {
        assertThrows(NullPointerException.class, () -> {
            CountDistinctCharacters.countDistinctCharacters(null);
        });
    }
}