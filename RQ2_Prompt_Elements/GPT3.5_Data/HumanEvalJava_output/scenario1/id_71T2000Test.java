Here's the code for the TriangleArea1Test class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleArea1Test {

    @Test
    void testTriangleAreaValid() {
        assertEquals(6.0, TriangleArea1.triangleArea(3, 4, 5));
        assertEquals(12.0, TriangleArea1.triangleArea(5, 12, 13));
        assertEquals(24.0, TriangleArea1.triangleArea(7, 24, 25));
    }

    @Test
    void testTriangleAreaInvalid() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, 3));
        assertEquals(-1, TriangleArea1.triangleArea(2, 2, 4));
        assertEquals(-1, TriangleArea1.triangleArea(3, 4, 7));
    }

    @Test
    void testTriangleAreaZero() {
        assertEquals(-1, TriangleArea1.triangleArea(0, 0, 0));
    }

    @Test
    void testTriangleAreaNegative() {
        assertEquals(-1, TriangleArea1.triangleArea(-3, 4, 5));
        assertEquals(-1, TriangleArea1.triangleArea(5, -12, 13));
        assertEquals(-1, TriangleArea1.triangleArea(7, 24, -25));
    }

    @Test
    void testTriangleAreaMaxValue() {
        assertEquals(1.0E9, TriangleArea1.triangleArea(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void testTriangleAreaMinValue() {
        assertEquals(-1, TriangleArea1.triangleArea(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    void testTriangleAreaOverflow() {
        assertEquals(-1, TriangleArea1.triangleArea(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
    }

    @Test
    void testTriangleAreaUnderflow() {
        assertEquals(-1, TriangleArea1.triangleArea(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE + 1));
    }

    @Test
    void testTriangleAreaLargeNumbers() {
        assertEquals(1.0E9, TriangleArea1.triangleArea(333333333, 666666666, 750000000));
    }
}
```

This test class contains ten unit test cases for the `triangleArea` method of the `TriangleArea1` class. The test cases cover a range of scenarios, including valid and invalid input values, edge cases such as zero and negative values, and extreme values such as the maximum and minimum integer values. The test cases are annotated with `@Test` and use the `assertEquals` method to compare the expected result with the actual result returned by the `triangleArea` method.