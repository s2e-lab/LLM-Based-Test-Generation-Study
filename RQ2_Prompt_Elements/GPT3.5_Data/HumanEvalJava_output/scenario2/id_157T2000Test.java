// RightAngleTriangleTest.java
package scenario2;

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
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 3, 3));
    }

    @Test
    void testRightAngleTriangle3() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 2, 3));
    }

    @Test
    void testRightAngleTriangle4() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(5, 3, 4));
    }

    @Test
    void testRightAngleTriangle5() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(0, 0, 0));
    }

    @Test
    void testRightAngleTriangle6() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(-1, -2, -3));
    }

    @Test
    void testRightAngleTriangle7() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 2, 4));
    }

    @Test
    void testRightAngleTriangle8() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(6, 8, 10));
    }

    @Test
    void testRightAngleTriangle9() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(7, 8, 9));
    }

    @Test
    void testRightAngleTriangle10() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(12, 16, 20));
    }
}