package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class HistogramTest {
    @Test
    public void testHistogram() {
        assertEquals(Histogram.histogram("a b c"), "{a=1, b=1, c=1}");
        assertEquals(Histogram.histogram("a b b a"), "{a=2, b=2}");
        assertEquals(Histogram.histogram("a b c a b"), "{a=2, b=2}");
        assertEquals(Histogram.histogram("b b b b a"), "{b=4}");
        assertEquals(Histogram.histogram(""), "{}");
        assertEquals(Histogram.histogram("a b b a"), "{a=2, b=2}");
        assertEquals(Histogram.histogram("a b c a b"), "{a=2, b=2}");
        assertEquals(Histogram.histogram("b b b b a"), "{b=4}");
        assertEquals(Histogram.histogram(""), "{}");
        assertEquals(Histogram.histogram("a"), "{a=1}");
    }
}