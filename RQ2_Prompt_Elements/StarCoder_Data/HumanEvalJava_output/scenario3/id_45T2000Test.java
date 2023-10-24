// TriangleAreaTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {

    /**
     * Test case for triangleArea(5, 3).
     */
    @Test
    void testTriangleArea1() {
        assertEquals(7.5, TriangleArea.triangleArea(5, 3));
    }

    /**
     * Test case for triangleArea(2, 2).
     */
    @Test
    void testTriangleArea2() {
        assertEquals(2.0, TriangleArea.triangleArea(2, 2));
    }

    /**
     * Test case for triangleArea(10, 8).
     */
    @Test
    void testTriangleArea3() {
        assertEquals(40.0, TriangleArea.triangleArea(10, 8));
    }

    /**
     * Test case for triangleArea(10, 0).
     */
    @Test
    void testTriangleArea4() {
        assertEquals(0.0, TriangleArea.triangleArea(10, 0));
    }

    /**
     * Test case for triangleArea(0, 10).
     */
    @Test
    void testTriangleArea5() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 10));
    }

    /**
     * Test case for triangleArea(0, 0).
     */
    @Test
    void testTriangleArea6() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 0));
    }

    /**
     * Test case for triangleArea(-1, 3).
     */
    @Test
    void testTriangleArea7() {
        assertEquals(0.0, TriangleArea.triangleArea(-1, 3));
    }

    /**
     * Test case for triangleArea(3, -1).
     */
    @Test
    void testTriangleArea8() {
        assertEquals(0.0, TriangleArea.triangleArea(3, -1));
    }

    /**
     * Test case for triangleArea(-1, -1).
     */
    @Test
    void testTriangleArea9() {
        assertEquals(0.0, TriangleArea.triangleArea(-1, -1));
    }

    /**
     * Test case for triangleArea(3, 0).
     */
    @Test
    void testTriangleArea10() {
        assertEquals(0.0, TriangleArea.triangleArea(3, 0));
    }
}
