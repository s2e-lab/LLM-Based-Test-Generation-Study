// XOrYTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 1.
     */
    @Test
    void testXOrY1() {
        assertEquals(12, XOrY.xOrY(1, 12, 13));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 2.
     */
    @Test
    void testXOrY2() {
        assertEquals(2, XOrY.xOrY(2, 12, 13));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 3.
     */
    @Test
    void testXOrY3() {
        assertEquals(13, XOrY.xOrY(3, 12, 13));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 4.
     */
    @Test
    void testXOrY4() {
        assertEquals(12, XOrY.xOrY(4, 12, 13));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 5.
     */
    @Test
    void testXOrY5() {
        assertEquals(13, XOrY.xOrY(5, 12, 13));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 6.
     */
    @Test
    void testXOrY6() {
        assertEquals(12, XOrY.xOrY(6, 12, 13));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 7.
     */
    @Test
    void testXOrY7() {
        assertEquals(13, XOrY.xOrY(7, 12, 13));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 8.
     */
    @Test
    void testXOrY8() {
        assertEquals(12, XOrY.xOrY(8, 12, 13));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 9.
     */
    @Test
    void testXOrY9() {
        assertEquals(13, XOrY.xOrY(9, 12, 13));
    }

    /**
     * Test case for {@link XOrY#xOrY(int, int, int)} with n = 10.
     */
    @Test
    void testXOrY10() {
        assertEquals(12, XOrY.xOrY(10, 12, 13));
    }
}
