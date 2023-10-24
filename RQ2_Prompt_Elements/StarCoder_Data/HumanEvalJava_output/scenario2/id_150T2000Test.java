// XOrYTest.java
package scenario2;


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
        assertEquals(1, XOrY.xOrY(1, 1, 2));
    }

    /**
    * Test case for {@link XOrY#xOrY(int, int, int)} with n = 2.
    */
    @Test
    void testXOrY2() {
        assertEquals(2, XOrY.xOrY(2, 1, 2));
    }

    /**
    * Test case for {@link XOrY#xOrY(int, int, int)} with n = 3.
    */
    @Test
    void testXOrY3() {
        assertEquals(1, XOrY.xOrY(3, 1, 2));
    }

    /**
    * Test case for {@link XOrY#xOrY(int, int, int)} with n = 4.
    */
    @Test
    void testXOrY4() {
        assertEquals(2, XOrY.xOrY(4, 1, 2));
    }

    /**
    * Test case for {@link XOrY#xOrY(int, int, int)} with n = 5.
    */
    @Test
    void testXOrY5() {
        assertEquals(1, XOrY.xOrY(5, 1, 2));
    }

    /**
    * Test case for {@link XOrY#xOrY(int, int, int)} with n = 6.
    */
    @Test
    void testXOrY6() {
        assertEquals(2, XOrY.xOrY(6, 1, 2));
    }

    /**
    * Test case for {@link XOrY#xOrY(int, int, int)} with n = 7.
    */
    @Test
    void testXOrY7() {
        assertEquals(1, XOrY.xOrY(7, 1, 2));
    }

    /**
    * Test case for {@link XOrY#xOrY(int, int, int)} with n = 8.
    */
    @Test
    void testXOrY8() {
        assertEquals(2, XOrY.xOrY(8, 1, 2));
    }

    /**
    * Test case for {@link XOrY#xOrY(int, int, int)} with n = 9.
    */
    @Test
    void testXOrY9() {
        assertEquals(1, XOrY.xOrY(9, 1, 2));
    }

    /**
    * Test case for {@link XOrY#xOrY(int, int, int)} with n = 10.
    */
    @Test
    void testXOrY10() {
        assertEquals(2, XOrY.xOrY(10, 1, 2));
    }
}
