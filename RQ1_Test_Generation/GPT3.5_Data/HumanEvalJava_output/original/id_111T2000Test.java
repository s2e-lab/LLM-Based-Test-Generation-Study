// Here's the source code for the HistogramTest class:

package original;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Histogram}.
 * It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
 */
class HistogramTest {

    @Test
    void testEmptyString() {
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, Histogram.histogram(""));
    }

    @Test
    void testSingleLetter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        assertEquals(expected, Histogram.histogram("a"));
    }

    @Test
    void testAllDifferentLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);
        expected.put("d", 1);
        expected.put("g", 1);
        assertEquals(expected, Histogram.histogram("a b c d g"));
    }

    @Test
    void testAllSameLetter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("b", 4);
        assertEquals(expected, Histogram.histogram("b b b b"));
    }

    @Test
    void testMultipleLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a b b a"));
    }

    @Test
    void testMultipleLettersWithDifferentCounts() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a b c a b"));
    }

    @Test
    void testMultipleLettersWithSameCounts() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("r", 1);
        expected.put("t", 1);
        expected.put("g", 1);
        assertEquals(expected, Histogram.histogram("r t g"));
    }

    @Test
    void testMultipleSpaces() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a  b   b a"));
    }

    @Test
    void testLeadingAndTrailingSpaces() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("  a b b a  "));
    }

    @Test
    void testMixedCase() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("A b B a"));
    }
}