// XOrYTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {

    @Test
    void testXOrY1() {
        assertEquals(1, XOrY.xOrY(1, 1, 0));
    }

    @Test
    void testXOrY2() {
        assertEquals(0, XOrY.xOrY(2, 1, 0));
    }

    @Test
    void testXOrY3() {
        assertEquals(1, XOrY.xOrY(3, 1, 0));
    }

    @Test
    void testXOrY4() {
        assertEquals(0, XOrY.xOrY(4, 1, 0));
    }

    @Test
    void testXOrY5() {
        assertEquals(1, XOrY.xOrY(5, 1, 0));
    }

    @Test
    void testXOrY6() {
        assertEquals(0, XOrY.xOrY(6, 1, 0));
    }

    @Test
    void testXOrY7() {
        assertEquals(1, XOrY.xOrY(7, 1, 0));
    }

    @Test
    void testXOrY8() {
        assertEquals(0, XOrY.xOrY(8, 1, 0));
    }

    @Test
    void testXOrY9() {
        assertEquals(1, XOrY.xOrY(9, 1, 0));
    }

    @Test
    void testXOrY10() {
        assertEquals(0, XOrY.xOrY(10, 1, 0));
    }
}
