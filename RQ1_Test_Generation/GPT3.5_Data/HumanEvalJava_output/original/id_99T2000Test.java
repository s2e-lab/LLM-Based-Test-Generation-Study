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
        assertEquals(17, ClosestInteger.closestInteger("16.5"));
    }

    @Test
    void testClosestIntegerNegative() {
        assertEquals(-10, ClosestInteger.closestInteger("-10"));
        assertEquals(-15, ClosestInteger.closestInteger("-15.3"));
        assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
        assertEquals(-17, ClosestInteger.closestInteger("-16.5"));
    }

    @Test
    void testClosestIntegerZero() {
        assertEquals(0, ClosestInteger.closestInteger("0"));
    }

    @Test
    void testClosestIntegerEquidistant() {
        assertEquals(15, ClosestInteger.closestInteger("14.5"));
        assertEquals(-15, ClosestInteger.closestInteger("-14.5"));
    }
}