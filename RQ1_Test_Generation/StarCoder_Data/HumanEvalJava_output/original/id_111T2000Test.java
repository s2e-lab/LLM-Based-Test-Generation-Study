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

    /** Test case for {@link Histogram#histogram(String)} where the string is null. */
    @Test
    void testHistogramNull() {
        assertNull(Histogram.histogram(null));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is empty. */
    @Test
    void testHistogramEmpty() {
        Map<String, Integer> map = new HashMap<>();
        assertEquals(map, Histogram.histogram(""));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word. */
    @Test
    void testHistogramSingleWord() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        assertEquals(map, Histogram.histogram("a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters3() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters4() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters5() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters6() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters7() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters8() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters9() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters10() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters11() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters12() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters13() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters14() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters15() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters16() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters17() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters18() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters19() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters20() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters21() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        assertEquals(map, Histogram.histogram("a a a a a a a a a a a a a a a a a a a a a a"));
    }

    /** Test case for {@link Histogram#histogram(String)} where the string is a single word with repeated letters. */
    @Test
    void testHistogramSingleWordRepeatedLetters22() {
       