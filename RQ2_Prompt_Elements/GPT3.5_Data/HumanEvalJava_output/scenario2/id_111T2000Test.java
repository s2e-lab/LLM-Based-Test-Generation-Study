// HistogramTest.java
package scenario2;

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
    void testNullString() {
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, Histogram.histogram(null));
    }
    
    @Test
    void testSingleLetter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        assertEquals(expected, Histogram.histogram("a"));
    }
    
    @Test
    void testMultipleLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a b a b"));
    }
    
    @Test
    void testMultipleLettersWithDifferentCounts() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 3);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a b a b a"));
    }
    
    @Test
    void testMultipleLettersWithSameCounts() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a b a b"));
    }
    
    @Test
    void testMultipleLettersWithSameCountsAndDifferentLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 2);
        assertEquals(expected, Histogram.histogram("a b c a b c"));
    }
    
    @Test
    void testMultipleLettersWithSameCountsAndSameLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 2);
        assertEquals(expected, Histogram.histogram("a b c a b c"));
    }
    
    @Test
    void testMultipleLettersWithDifferentCountsAndDifferentLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 3);
        expected.put("b", 2);
        expected.put("c", 1);
        assertEquals(expected, Histogram.histogram("a b a c a b"));
    }
    
    @Test
    void testMultipleLettersWithDifferentCountsAndSameLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 3);
        expected.put("b", 2);
        expected.put("c", 1);
        assertEquals(expected, Histogram.histogram("a b a c a b"));
    }
}