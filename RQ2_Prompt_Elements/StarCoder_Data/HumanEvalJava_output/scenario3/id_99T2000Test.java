// ClosestIntegerTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {

    /**
     * Test case for {@link ClosestInteger#closestInteger(String)}.
     */
    @Test
    void testClosestInteger() {
        assertEquals(10, ClosestInteger.closestInteger("10"));
        assertEquals(15, ClosestInteger.closestInteger("14.5"));
        assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
        assertEquals(15, ClosestInteger.closestInteger("15.3"));
        assertEquals(0, ClosestInteger.closestInteger("0"));
    }
}
