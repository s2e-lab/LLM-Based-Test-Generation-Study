// TruncateNumberTest.java
package original;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link TruncateNumber}.
 * It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(double)} method.
 */
class TruncateNumberTest {

    @Test
    void testTruncateNumberWithPositiveNumber() {
        double result = TruncateNumber.truncateNumber(3.5);
        assertEquals(0.5, result);
    }

    @Test
    void testTruncateNumberWithNegativeNumber() {
        double result = TruncateNumber.truncateNumber(-3.5);
        assertEquals(0.5, result);
    }

    @Test
    void testTruncateNumberWithZero() {
        double result = TruncateNumber.truncateNumber(0);
        assertEquals(0, result);
    }

    @Test
    void testTruncateNumberWithInteger() {
        double result = TruncateNumber.truncateNumber(5);
        assertEquals(0, result);
    }

    @Test
    void testTruncateNumberWithLargeNumber() {
        double result = TruncateNumber.truncateNumber(123.456);
        assertEquals(0.456, result);
    }

    @Test
    void testTruncateNumberWithSmallNumber() {
        double result = TruncateNumber.truncateNumber(0.001);
        assertEquals(0.001, result);
    }

    @Test
    void testTruncateNumberWithNegativeSmallNumber() {
        double result = TruncateNumber.truncateNumber(-0.001);
        assertEquals(0.001, result);
    }

    @Test
    void testTruncateNumberWithNegativeLargeNumber() {
        double result = TruncateNumber.truncateNumber(-123.456);
        assertEquals(0.456, result);
    }

    @Test
    void testTruncateNumberWithMaxValue() {
        double result = TruncateNumber.truncateNumber(Double.MAX_VALUE);
        assertEquals(0.9999999995343387, result);
    }

    @Test
    void testTruncateNumberWithMinValue() {
        double result = TruncateNumber.truncateNumber(Double.MIN_VALUE);
        assertEquals(4.9E-324, result);
    }
}