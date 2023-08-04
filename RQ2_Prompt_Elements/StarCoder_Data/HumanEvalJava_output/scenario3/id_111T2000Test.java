// HistogramTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {

    /**
     * Test case for the {@link Histogram#histogram(String)} method.
     */
    @Test
    void histogramTest() {
        assertEquals(histogram("a b b a"), "{a=2, b=2}");
        assertEquals(histogram("a b c a b"), "{a=2, b=2}");
        assertEquals(histogram("a b c d g"), "{a=1, b=1, c=1, d=1, g=1}");
        assertEquals(histogram("r t g"), "{r=1, t=1, g=1}");
        assertEquals(histogram("b b b b a"), "{b=4}");
        assertEquals(histogram("r t g"), "{r=1, t=1, g=1}");
        assertEquals(histogram(""), "{}");
        assertEquals(histogram("a"), "{a=1}");
    }
}
