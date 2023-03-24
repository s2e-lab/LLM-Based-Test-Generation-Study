// RightAngleTriangleTest.java
package original;

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
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 2, 3));
    }

    @Test
    void testRightAngleTriangle3() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(10, 6, 8));
    }

    @Test
    void testRightAngleTriangle4() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(2, 2, 2));
    }

    @Test
    void testRightAngleTriangle5() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(7, 24, 25));
    }

    @Test
    void testRightAngleTriangle6() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(10, 5, 7));
    }

    @Test
    void testRightAngleTriangle7() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(5, 12, 13));
    }

    @Test
    void testRightAngleTriangle8() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(15, 8, 17));
    }

    @Test
    void testRightAngleTriangle9() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(48, 55, 73));
    }

    @Test
    void testRightAngleTriangle10() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 1, 1));
    }
}