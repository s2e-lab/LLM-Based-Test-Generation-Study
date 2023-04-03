// HistogramTest.java
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
        Map<String, Integer> actual = Histogram.histogram("");
        assertEquals(expected, actual);
    }
    
    @Test
    void testSingleLetter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        Map<String, Integer> actual = Histogram.histogram("a");
        assertEquals(expected, actual);
    }
    
    @Test
    void testMultipleLettersWithSameCount() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        Map<String, Integer> actual = Histogram.histogram("a b b a");
        assertEquals(expected, actual);
    }
    
    @Test
    void testMultipleLettersWithDifferentCount() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        Map<String, Integer> actual = Histogram.histogram("a b c a b");
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllLettersWithSameCount() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);
        expected.put("d", 1);
        expected.put("g", 1);
        Map<String, Integer> actual = Histogram.histogram("a b c d g");
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllLettersWithDifferentCount() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("r", 1);
        expected.put("t", 1);
        expected.put("g", 1);
        Map<String, Integer> actual = Histogram.histogram("r t g");
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllSameLetter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("b", 4);
        Map<String, Integer> actual = Histogram.histogram("b b b b a");
        assertEquals(expected, actual);
    }
    
    @Test
    void testNullString() {
        Map<String, Integer> expected = new HashMap<>();
        Map<String, Integer> actual = Histogram.histogram(null);
        assertEquals(expected, actual);
    }
    
    @Test
    void testStringWithSpaces() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        Map<String, Integer> actual = Histogram.histogram("a b c a b");
        assertEquals(expected, actual);
    }
    
    @Test
    void testStringWithTabs() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        Map<String, Integer> actual = Histogram.histogram("a\tb\tc\ta\tb");
        assertEquals(expected, actual);
    }
}