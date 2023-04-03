// CircularShiftTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CircularShift}.
 * It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
 */
class CircularShiftTest {

    @Test
    void testCircularShiftWithPositiveShift() {
        assertEquals("001", CircularShift.circularShift(100, 2));
        assertEquals("12", CircularShift.circularShift(12, 2));
        assertEquals("79", CircularShift.circularShift(97, 8));
        assertEquals("21", CircularShift.circularShift(12, 1));
    }

    @Test
    void testCircularShiftWithShiftGreaterThanNumberOfDigits() {
        assertEquals("11", CircularShift.circularShift(11, 101));
        assertEquals("321", CircularShift.circularShift(123, 4));
    }

    @Test
    void testCircularShiftWithNegativeShift() {
        assertEquals("001", CircularShift.circularShift(100, -2));
        assertEquals("12", CircularShift.circularShift(12, -2));
        assertEquals("79", CircularShift.circularShift(97, -8));
        assertEquals("21", CircularShift.circularShift(12, -1));
    }

    @Test
    void testCircularShiftWithShiftEqualToZero() {
        assertEquals("100", CircularShift.circularShift(100, 0));
        assertEquals("12", CircularShift.circularShift(12, 0));
        assertEquals("97", CircularShift.circularShift(97, 0));
    }

    @Test
    void testCircularShiftWithMaxIntegerValue() {
        assertEquals("2147483647", CircularShift.circularShift(Integer.MAX_VALUE, 1));
        assertEquals("2147483647", CircularShift.circularShift(Integer.MAX_VALUE, 10));
        assertEquals("2147483647", CircularShift.circularShift(Integer.MAX_VALUE, -1));
        assertEquals("2147483647", CircularShift.circularShift(Integer.MAX_VALUE, -10));
    }

    @Test
    void testCircularShiftWithMinIntegerValue() {
        assertEquals("-2147483648", CircularShift.circularShift(Integer.MIN_VALUE, 1));
        assertEquals("-2147483648", CircularShift.circularShift(Integer.MIN_VALUE, 10));
        assertEquals("-2147483648", CircularShift.circularShift(Integer.MIN_VALUE, -1));
        assertEquals("-2147483648", CircularShift.circularShift(Integer.MIN_VALUE, -10));
    }
} 