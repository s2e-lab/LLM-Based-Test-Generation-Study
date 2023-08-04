// ChangeBaseTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number from base 10 to base 2.
     */
    @Test
    void testChangeBase1() {
        assertEquals("11110100101", ChangeBase.changeBase(1234, 2));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number from base 10 to base 8.
     */
    @Test
    void testChangeBase2() {
        assertEquals("1734", ChangeBase.changeBase(1234, 8));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number from base 10 to base 16.
     */
    @Test
    void testChangeBase3() {
        assertEquals("4D2", ChangeBase.changeBase(1234, 16));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number from base 10 to base 36.
     */
    @Test
    void testChangeBase4() {
        assertEquals("1234", ChangeBase.changeBase(1234, 36));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number from base 10 to base 10.
     */
    @Test
    void testChangeBase5() {
        assertEquals("1234", ChangeBase.changeBase(1234, 10));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number from base 10 to base 1.
     */
    @Test
    void testChangeBase6() {
        assertEquals("1234", ChangeBase.changeBase(1234, 1));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number from base 10 to base 0.
     */
    @Test
    void testChangeBase7() {
        assertEquals("1234", ChangeBase.changeBase(1234, 0));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number from base 10 to base -1.
     */
    @Test
    void testChangeBase8() {
        assertEquals("1234", ChangeBase.changeBase(1234, -1));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number from base 10 to base -2.
     */
    @Test
    void testChangeBase9() {
        assertEquals("1234", ChangeBase.changeBase(1234, -2));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number from base 10 to base -3.
     */
    @Test
    void testChangeBase10() {
        assertEquals("1234", ChangeBase.changeBase(1234, -3));
    }
}
