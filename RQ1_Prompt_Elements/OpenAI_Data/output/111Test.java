// HistogramTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Histogram}.
* It contains ten test cases for the {@link Histogram#histogram()} method.
*/
class HistogramTest {

    @Test
    void testHistogram() {
        String test = "";
        HashMap<String, Integer> map = new HashMap<>();
        assertEquals(map, Histogram.histogram(test));
        test = "a";
        map.put("a", 1);
        assertEquals(map, Histogram.histogram(test));
        test = "a a";
        map.put("a", 2);
        assertEquals(map, Histogram.histogram(test));
        test = "a a a";
        map.put("a", 3);
        assertEquals(map, Histogram.histogram(test));
        test = "a a a a";
        map.put("a", 4);
        assertEquals(map, Histogram.histogram(test));
        test = "a a a a a";
        map.put("a", 5);
        assertEquals(map, Histogram.histogram(test));
        test = "a a a a a a";
        map.put("a", 6);
        assertEquals(map, Histogram.histogram(test));
        test = "a a a a a a a";
        map.put("a", 7);
        assertEquals(map, Histogram.histogram(test));
        test = "a a a a a a a a";
        map.put("a", 8);
        assertEquals(map, Histogram.histogram(test));
        test = "a a a a a a a a a";
        map.put("a", 9);
        assertEquals(map, Histogram.histogram(test));
    }
}