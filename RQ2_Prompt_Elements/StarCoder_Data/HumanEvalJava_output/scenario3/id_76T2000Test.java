// IsSimplePowerTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)}.
    */
    @Test
    void testIsSimplePower() {
        assertEquals(true, IsSimplePower.isSimplePower(1, 4));
        assertEquals(true, IsSimplePower.isSimplePower(2, 2));
        assertEquals(true, IsSimplePower.isSimplePower(8, 2));
        assertEquals(false, IsSimplePower.isSimplePower(3, 2));
        assertEquals(false, IsSimplePower.isSimplePower(3, 1));
        assertEquals(false, IsSimplePower.isSimplePower(5, 3));
        assertEquals(true, IsSimplePower.isSimplePower(16, 2));
        assertEquals(false, IsSimplePower.isSimplePower(143214, 16));
        assertEquals(true, IsSimplePower.isSimplePower(4, 2));
        assertEquals(true, IsSimplePower.isSimplePower(9, 3));
        assertEquals(true, IsSimplePower.isSimplePower(16, 4));
        assertEquals(false, IsSimplePower.isSimplePower(24, 2));
        assertEquals(false, IsSimplePower.isSimplePower(128, 4));
        assertEquals(false, IsSimplePower.isSimplePower(12, 6));
        assertEquals(true, IsSimplePower.isSimplePower(1, 1));
        assertEquals(true, IsSimplePower.isSimplePower(1, 12));
    }
}
