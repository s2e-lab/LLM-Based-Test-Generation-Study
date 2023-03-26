Here's the source code for the TriangleAreaTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link TriangleArea}.
 * It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
 */
class TriangleAreaTest {

    @Test
    void testTriangleAreaWithPositiveValues() {
        assertEquals(10.0, TriangleArea.triangleArea(5, 4));
    }

    @Test
    void testTriangleAreaWithZeroValues() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 0));
    }

    @Test
    void testTriangleAreaWithNegativeValues() {
        assertEquals(-10.0, TriangleArea.triangleArea(-5, 4));
    }

    @Test
    void testTriangleAreaWithLargeValues() {
        assertEquals(500000000.0, TriangleArea.triangleArea(100000000, 10));
    }

    @Test
    void testTriangleAreaWithSmallValues() {
        assertEquals(0.00005, TriangleArea.triangleArea(0.01, 0.01));
    }

    @Test
    void testTriangleAreaWithDecimalValues() {
        assertEquals(2.5, TriangleArea.triangleArea(1, 5));
    }

    @Test
    void testTriangleAreaWithMaxValues() {
        assertEquals(Double.MAX_VALUE, TriangleArea.triangleArea(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void testTriangleAreaWithMinValues() {
        assertEquals(Double.MIN_VALUE, TriangleArea.triangleArea(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    void testTriangleAreaWithOneZeroValue() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 5));
    }

    @Test
    void testTriangleAreaWithTwoZeroValues() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 0));
    }
}
```

This test class contains ten unit test cases for the `triangleArea` method of the `TriangleArea` class. The test cases cover a range of scenarios, including positive and negative values, zero values, large and small values, decimal values, and extreme values. The `assertEquals` method is used to compare the expected result with the actual result returned by the `triangleArea` method.