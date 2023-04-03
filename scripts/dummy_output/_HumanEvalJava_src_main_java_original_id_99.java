// ClosestIntegerTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClosestInteger}.
 * It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
 */
class ClosestIntegerTest {

    @Test
    void testClosestIntegerPositive() {
        assertEquals(10, ClosestInteger.closestInteger("10"));
        assertEquals(15, ClosestInteger.closestInteger("15.3"));
        assertEquals(16, ClosestInteger.closestInteger("15.5"));
        assertEquals(20, ClosestInteger.closestInteger("19.6"));
        assertEquals(21, ClosestInteger.closestInteger("20.5"));
    }

    @Test
    void testClosestIntegerNegative() {
        assertEquals(-10, ClosestInteger.closestInteger("-10"));
        assertEquals(-15, ClosestInteger.closestInteger("-15.3"));
        assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
        assertEquals(-20, ClosestInteger.closestInteger("-19.6"));
        assertEquals(-21, ClosestInteger.closestInteger("-20.5"));
    }

    @Test
    void testClosestIntegerZero() {
        assertEquals(0, ClosestInteger.closestInteger("0"));
    }

    @Test
    void testClosestIntegerLargeNumber() {
        assertEquals(2147483647, ClosestInteger.closestInteger("2147483647.5"));
        assertEquals(-2147483648, ClosestInteger.closestInteger("-2147483647.5"));
    }

    @Test
    void testClosestIntegerInvalidInput() {
        assertThrows(NumberFormatException.class, () -> ClosestInteger.closestInteger("abc"));
        assertThrows(NumberFormatException.class, () -> ClosestInteger.closestInteger(""));
    }
} 