package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HistogramTest {

    @Test
    public void test() throws Exception {

        assertEquals(Map.of("a", 2, "b", 2), scenario3.Histogram.histogram("a b b a"));
        assertEquals(Map.of("a", 2, "b", 2), scenario3.Histogram.histogram("a b c a b"));
        assertEquals(Map.of("a", 1, "b", 1, "c", 1, "d", 1, "g", 1), scenario3.Histogram.histogram("a b c d g"));
        assertEquals(Map.of("r", 1, "t", 1, "g", 1), scenario3.Histogram.histogram("r t g"));
        assertEquals(Map.of("b", 4), scenario3.Histogram.histogram("b b b b a"));
        assertEquals(Map.of("r", 1, "t", 1, "g", 1), scenario3.Histogram.histogram("r t g"));
        assertEquals(Map.of(), scenario3.Histogram.histogram(""));
        assertEquals(Map.of("a", 1), scenario3.Histogram.histogram("a"));

    }

}