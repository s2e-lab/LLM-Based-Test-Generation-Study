// ChangeBaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase1() {
        assertEquals("1000", ChangeBase.changeBase(8, 2));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 3.
     */
    @Test
    void testChangeBase2() {
        assertEquals("22", ChangeBase.changeBase(8, 3));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase3() {
        assertEquals("111", ChangeBase.changeBase(7, 2));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 3.
     */
    @Test
    void testChangeBase4() {
        assertEquals("22", ChangeBase.changeBase(8, 3));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 3.
     */
    @Test
    void testChangeBase5() {
        assertEquals("100", ChangeBase.changeBase(9, 3));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase6() {
        assertEquals("11101010", ChangeBase.changeBase(234, 2));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase7() {
        assertEquals("10000", ChangeBase.changeBase(16, 2));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase8() {
        assertEquals("1000", ChangeBase.changeBase(8, 2));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase9() {
        assertEquals("111", ChangeBase.changeBase(7, 2));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase10() {
        assertEquals("2", ChangeBase.changeBase(2, 3));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase11() {
        assertEquals("3", ChangeBase.changeBase(3, 4));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase12() {
        assertEquals("4", ChangeBase.changeBase(4, 5));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase13() {
        assertEquals("5", ChangeBase.changeBase(5, 6));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase14() {
        assertEquals("6", ChangeBase.changeBase(6, 7));
    }

    /**
     * Test case for {@link ChangeBase#changeBase(int, int)}.
     * It tests the conversion of a number in base 10 to base 2.
     */
    @Test
    void testChangeBase15() {
        assertEquals("7", ChangeBase.changeBase(7, 8));
    }
}
