// FindMaxTest.java
package scenario2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {

    /**
     * Test case for the {@link FindMax#findMax(List)} method.
     * It tests the method with a list of words that have different lengths.
     */
    @Test
    void testFindMaxWithDifferentLengths() {
        List<String> words = List.of("abc", "abcd", "abcde", "abcdef");
        assertEquals("abcdef", FindMax.findMax(words));
    }

    /**
     * Test case for the {@link FindMax#findMax(List)} method.
     * It tests the method with a list of words that have the same length.
     */
    @Test
    void testFindMaxWithSameLengths() {
        List<String> words = List.of("abc", "abcd", "abcde", "abcdef");
        assertEquals("abc", FindMax.findMax(words));
    }

    /**
     * Test case for the {@link FindMax#findMax(List)} method.
     * It tests the method with a list of words that have the same length and
     * the same number of unique characters.
     */
    @Test
    void testFindMaxWithSameLengthsAndSameUnique() {
        List<String> words = List.of("abc", "abcd", "abcde", "abcdef");
        assertEquals("abc", FindMax.findMax(words));
    }

    /**
     * Test case for the {@link FindMax#findMax(List)} method.
     * It tests the method with a list of words that have the same length and
     * different number of unique characters.
     */
    @Test
    void testFindMaxWithSameLengthsAndDifferentUnique() {
        List<String> words = List.of("abc", "abcd", "abcde", "abcdef");
        assertEquals("abcde", FindMax.findMax(words));
    }

    /**
     * Test case for the {@link FindMax#findMax(List)} method.
     * It tests the method with a list of words that have different lengths and
     * different number of unique characters.
     */
    @Test
    void testFindMaxWithDifferentLengthsAndDifferentUnique() {
        List<String> words = List.of("abc", "abcd", "abcde", "abcdef");
        assertEquals("abcdef", FindMax.findMax(words));
    }

    /**
     * Test case for the {@link FindMax#findMax(List)} method.
     * It tests the method with a list of words that have different lengths and
     * different number of unique characters.
     */
    @Test
    void testFindMaxWithEmptyList() {
        List<String> words = List.of();
        assertNull(FindMax.findMax(words));
    }

    /**
     * Test case for the {@link FindMax#findMax(List)} method.
     * It tests the method with a list of words that have different lengths and
     * different number of unique characters.
     */
    @Test
    void testFindMaxWithNullList() {
        assertNull(FindMax.findMax(null));
    }
}
