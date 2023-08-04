// RightAngleTriangleTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains ten unit test cases for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {

    /**
     * Test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
     * It tests the case when the three sides form a right-angled triangle.
     */
    @Test
    void testRightAngleTriangleTrue() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(3, 4, 5));
    }

    /**
     * Test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
     * It tests the case when the three sides do not form a right-angled triangle.
     */
    @Test
    void testRightAngleTriangleFalse() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 2, 3));
    }

    /**
     * Test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
     * It tests the case when the three sides form a right-angled triangle.
     */
    @Test
    void testRightAngleTriangleTrue1() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(10, 6, 8));
    }

    /**
     * Test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
     * It tests the case when the three sides do not form a right-angled triangle.
     */
    @Test
    void testRightAngleTriangleFalse1() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(2, 2, 2));
    }

    /**
     * Test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
     * It tests the case when the three sides form a right-angled triangle.
     */
    @Test
    void testRightAngleTriangleTrue2() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(7, 24, 25));
    }

    /**
     * Test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
     * It tests the case when the three sides do not form a right-angled triangle.
     */
    @Test
    void testRightAngleTriangleFalse2() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(10, 5, 7));
    }

    /**
     * Test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
     * It tests the case when the three sides form a right-angled triangle.
     */
    @Test
    void testRightAngleTriangleTrue3() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(5, 12, 13));
    }

    /**
     * Test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
     * It tests the case when the three sides do not form a right-angled triangle.
     */
    @Test
    void testRightAngleTriangleFalse3() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(15, 8, 17));
    }

    /**
     * Test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
     * It tests the case when the three sides form a right-angled triangle.
     */
    @Test
    void testRightAngleTriangleTrue4() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(48, 55, 73));
    }

    /**
     * Test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
     * It tests the case when the three sides do not form a right-angled triangle.
     */
    @Test
    void testRightAngleTriangleFalse4() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 1, 1));
    }

    /**
     * Test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
     * It tests the case when the three sides do not form a right-angled triangle.
     */
    @Test
    void testRightAngleTriangleFalse5() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(2, 2, 10));
    }
}
