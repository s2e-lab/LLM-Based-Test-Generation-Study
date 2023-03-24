Here's the completed `GreatestCommonDivisorTest` class with ten unit test cases for the `greatestCommonDivisor` method:

```
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link GreatestCommonDivisor}.
 * It contains ten unit test cases for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
 */
class GreatestCommonDivisorTest {

    @Test
    void testGcdOfTwoPrimes() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(3, 5);
        assertEquals(1, result);
    }

    @Test
    void testGcdOfTwoNumbersWithCommonFactor() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(25, 15);
        assertEquals(5, result);
    }

    @Test
    void testGcdOfTwoCoprimeNumbers() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(3, 7);
        assertEquals(1, result);
    }

    @Test
    void testGcdOfTwoNumbersWithMultipleCommonFactors() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(10, 15);
        assertEquals(5, result);
    }

    @Test
    void testGcdOfTwoNumbersWithCommonFactorGreaterThanOne() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(49, 14);
        assertEquals(7, result);
    }

    @Test
    void testGcdOfTwoNumbersWithCommonFactorAndMultipleFactors() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(144, 60);
        assertEquals(12, result);
    }

    @Test
    void testGcdOfTwoNegativeNumbers() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(-10, -15);
        assertEquals(5, result);
    }

    @Test
    void testGcdOfOneNegativeNumber() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(-10, 15);
        assertEquals(5, result);
    }

    @Test
    void testGcdOfZeroAndNonZeroNumber() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(0, 15);
        assertEquals(15, result);
    }

    @Test
    void testGcdOfZeroAndZero() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(0, 0);
        assertEquals(0, result);
    }
}
```