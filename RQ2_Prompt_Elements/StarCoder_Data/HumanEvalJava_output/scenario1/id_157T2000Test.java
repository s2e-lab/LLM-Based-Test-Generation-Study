// RightAngleTriangleTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains ten unit test cases for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {

    @Test
    void testRightAngleTriangle1() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(3, 4, 5));
    }

    @Test
    void testRightAngleTriangle2() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 4, 6));
    }

    @Test
    void testRightAngleTriangle3() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 4, 2));
    }

    @Test
    void testRightAngleTriangle4() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 4, 1));
    }

    @Test
    void testRightAngleTriangle5() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 4, 0));
    }

    @Test
    void testRightAngleTriangle6() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 4, -1));
    }

    @Test
    void testRightAngleTriangle7() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 4, -2));
    }

    @Test
    void testRightAngleTriangle8() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 4, -3));
    }

    @Test
    void testRightAngleTriangle9() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 4, -4));
    }

    @Test
    void testRightAngleTriangle10() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 4, -5));
    }
}
