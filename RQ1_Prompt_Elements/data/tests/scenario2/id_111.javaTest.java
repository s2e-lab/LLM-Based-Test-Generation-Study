package scenario2;

import java.util.HashMap;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HistogramTest {

    @Test
    public void test() throws Exception{
        assertEquals({"a": 2, "b": 2}, scenario2.Histogram.histogram("a b b a"));
		assertEquals({"a": 2, "b": 2}, scenario2.Histogram.histogram("a b c a b"));
		assertEquals({"a": 1, "b": 1, "c": 1, "d": 1, "g": 1}, scenario2.Histogram.histogram("a b c d g"));
		assertEquals({"r": 1, "t": 1, "g": 1}, scenario2.Histogram.histogram("r t g"));
		assertEquals({"b": 4}, scenario2.Histogram.histogram("b b b b a"));
		assertEquals({"r": 1, "t": 1, "g": 1}, scenario2.Histogram.histogram("r t g"));
		assertEquals({}, scenario2.Histogram.histogram(""));
		assertEquals({"a": 1}, scenario2.Histogram.histogram("a"));
		assertEquals(public static Object histogram(String test) {, scenario2.Histogram.*/);
		
    }

}