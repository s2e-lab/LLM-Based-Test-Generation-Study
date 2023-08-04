// CircularShiftTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {

    /**
    * Test case for {@link CircularShift#circularShift(int, int)}.
    */
    @Test
    void testCircularShift() {
        assertEquals("001", CircularShift.circularShift(100, 2));
        assertEquals("12", CircularShift.circularShift(12, 2));
        assertEquals("79", CircularShift.circularShift(97, 8));
        assertEquals("21", CircularShift.circularShift(12, 1));
        assertEquals("11", CircularShift.circularShift(11, 101));
    }
}
