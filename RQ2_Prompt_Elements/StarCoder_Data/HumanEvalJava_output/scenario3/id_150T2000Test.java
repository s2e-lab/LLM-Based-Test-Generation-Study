// XOrYTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 7, x = 34, y = 12.
     */
    @Test
    void testXOrY1() {
        assertEquals(34, XOrY.xOrY(7, 34, 12));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 15, x = 8, y = 5.
     */
    @Test
    void testXOrY2() {
        assertEquals(5, XOrY.xOrY(15, 8, 5));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 3, x = 33, y = 5212.
     */
    @Test
    void testXOrY3() {
        assertEquals(33, XOrY.xOrY(3, 33, 5212));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 1259, x = 3, y = 52.
     */
    @Test
    void testXOrY4() {
        assertEquals(3, XOrY.xOrY(1259, 3, 52));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 7919, x = -1, y = 12.
     */
    @Test
    void testXOrY5() {
        assertEquals(-1, XOrY.xOrY(7919, -1, 12));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 3609, x = 1245, y = 583.
     */
    @Test
    void testXOrY6() {
        assertEquals(583, XOrY.xOrY(3609, 1245, 583));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 91, x = 56, y = 129.
     */
    @Test
    void testXOrY7() {
        assertEquals(129, XOrY.xOrY(91, 56, 129));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 6, x = 34, y = 1234.
     */
    @Test
    void testXOrY8() {
        assertEquals(1234, XOrY.xOrY(6, 34, 1234));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 1, x = 2, y = 0.
     */
    @Test
    void testXOrY9() {
        assertEquals(0, XOrY.xOrY(1, 2, 0));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 2, x = 2, y = 0.
     */
    @Test
    void testXOrY10() {
        assertEquals(2, XOrY.xOrY(2, 2, 0));
    }
}
