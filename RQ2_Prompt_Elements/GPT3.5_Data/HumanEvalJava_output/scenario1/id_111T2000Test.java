// HistogramTest.java
package scenario1;

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
    void testSingleWord() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 1);
        assertEquals(expected, Histogram.histogram("hello"));
    }
    
    @Test
    void testMultipleWords() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        assertEquals(expected, Histogram.histogram("hello world hello"));
    }
    
    @Test
    void testMultipleWordsWithPunctuation() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        assertEquals(expected, Histogram.histogram("hello, world! hello"));
    }
    
    @Test
    void testMultipleWordsWithNumbers() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        expected.put("123", 1);
        assertEquals(expected, Histogram.histogram("hello world hello 123"));
    }
    
    @Test
    void testMultipleWordsWithMixedCase() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        assertEquals(expected, Histogram.histogram("Hello world HELLO"));
    }
    
    @Test
    void testMultipleWordsWithLeadingAndTrailingSpaces() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        assertEquals(expected, Histogram.histogram("  hello world hello  "));
    }
    
    @Test
    void testMultipleWordsWithTabDelimiter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        assertEquals(expected, Histogram.histogram("hello\tworld\thello"));
    }
    
    @Test
    void testMultipleWordsWithNewLineDelimiter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        assertEquals(expected, Histogram.histogram("hello\nworld\nhello"));
    }
}