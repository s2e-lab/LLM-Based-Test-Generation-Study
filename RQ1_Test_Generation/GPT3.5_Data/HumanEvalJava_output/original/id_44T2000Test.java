// ChangeBaseTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ChangeBase}.
 * It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
 */
class ChangeBaseTest {

    @Test
    void testChangeBaseWithBaseLessThan2() {
        assertThrows(IllegalArgumentException.class, () -> ChangeBase.changeBase(8, 1));
    }

    @Test
    void testChangeBaseWithBaseGreaterThan9() {
        assertThrows(IllegalArgumentException.class, () -> ChangeBase.changeBase(8, 10));
    }

    @Test
    void testChangeBaseWithXEqualTo0() {
        assertEquals("0", ChangeBase.changeBase(0, 2));
    }

    @Test
    void testChangeBaseWithXEqualTo1() {
        assertEquals("1", ChangeBase.changeBase(1, 2));
    }

    @Test
    void testChangeBaseWithXGreaterThanBase() {
        assertEquals("1000", ChangeBase.changeBase(8, 2));
    }

    @Test
    void testChangeBaseWithXLessThanBase() {
        assertEquals("2", ChangeBase.changeBase(2, 3));
    }

    @Test
    void testChangeBaseWithXEqualToBase() {
        assertEquals("10", ChangeBase.changeBase(2, 2));
    }

    @Test
    void testChangeBaseWithXEqualToBaseMinus1() {
        assertEquals("11", ChangeBase.changeBase(2, 3));
    }

    @Test
    void testChangeBaseWithXEqualToBasePlus1() {
        assertEquals("100", ChangeBase.changeBase(3, 2));
    }

    @Test
    void testChangeBaseWithXEqualToMaxIntValue() {
        assertEquals("1111111111111111111111111111111", ChangeBase.changeBase(Integer.MAX_VALUE, 2));
    }
} 

// ChangeBase.java
package updated;

class ChangeBase {

    /**
     * Change numerical base of input number x to base.
     * return string representation after the conversion.
     * base numbers are less than 10.
     *
     * > changeBase(8, 3)
     * "22"
     * > changeBase(8, 2)
     * "1000"
     * > changeBase(7, 2)
     * "111"
     * > changeBase(8, 3)
     * "22"
     * > changeBase(9, 3)
     * "100"
     * > changeBase(234, 2)
     * "11101010"
     * > changeBase(16, 2)
     * "10000"
     * > changeBase(8, 2)
     * "1000"
     * > changeBase(7, 2)
     * "111"
     * > changeBase(2, 3)
     * "2"
     * > changeBase(3, 4)
     * "3"
     * > changeBase(4, 5)
     * "4"
     * > changeBase(5, 6)
     * "5"
     * > changeBase(6, 7)
     * "6"
     * > changeBase(7, 8)
     * "7"
     */
    public static String changeBase(int x, int base) {
        if (base < 2 || base > 9) {
            throw new IllegalArgumentException("Base must be between 2 and 9");
        }
        if (x == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (x > 0) {
            result.insert(0, x % base);
            x = x / base;
        }
        return result.toString();
    }
}