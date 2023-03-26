Here's the completed `ClosestIntegerTest` class with ten unit test cases for the `closestInteger` method:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClosestInteger}.
 * It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
 */
class ClosestIntegerTest {

    @Test
    void testClosestIntegerPositive() {
        assertEquals(5, ClosestInteger.closestInteger("4.6"));
    }

    @Test
    void testClosestIntegerNegative() {
        assertEquals(-5, ClosestInteger.closestInteger("-4.6"));
    }

    @Test
    void testClosestIntegerZero() {
        assertEquals(0, ClosestInteger.closestInteger("0"));
    }

    @Test
    void testClosestIntegerMaxValue() {
        assertEquals(Integer.MAX_VALUE, ClosestInteger.closestInteger(String.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    void testClosestIntegerMinValue() {
        assertEquals(Integer.MIN_VALUE, ClosestInteger.closestInteger(String.valueOf(Integer.MIN_VALUE)));
    }

    @Test
    void testClosestIntegerMaxDouble() {
        assertEquals(Integer.MAX_VALUE, ClosestInteger.closestInteger(String.valueOf(Double.MAX_VALUE)));
    }

    @Test
    void testClosestIntegerMinDouble() {
        assertEquals(Integer.MIN_VALUE, ClosestInteger.closestInteger(String.valueOf(-Double.MAX_VALUE)));
    }

    @Test
    void testClosestIntegerNaN() {
        assertEquals(0, ClosestInteger.closestInteger(String.valueOf(Double.NaN)));
    }

    @Test
    void testClosestIntegerPositiveInfinity() {
        assertEquals(Integer.MAX_VALUE, ClosestInteger.closestInteger(String.valueOf(Double.POSITIVE_INFINITY)));
    }

    @Test
    void testClosestIntegerNegativeInfinity() {
        assertEquals(Integer.MIN_VALUE, ClosestInteger.closestInteger(String.valueOf(Double.NEGATIVE_INFINITY)));
    }
}
```

These test cases cover a range of scenarios, including positive and negative values, zero, the maximum and minimum integer values, the maximum and minimum double values, NaN, positive and negative infinity.