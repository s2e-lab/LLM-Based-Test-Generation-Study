// TriangleAreaTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {

    /**
     * Test case for triangleArea(int, int) method.
     */
    @Test
    void testTriangleArea() {
        assertEquals(10.0, TriangleArea.triangleArea(5, 2));
        assertEquals(10.0, TriangleArea.triangleArea(5, 2));
        assertEquals(10.0, TriangleArea.triangleArea(5, 2));
        assertEquals(10.0, TriangleArea.triangleArea(5, 2));
        assertEquals(10.0, TriangleArea.triangleArea(5, 2));
        assertEquals(10.0, TriangleArea.triangleArea(5, 2));
        assertEquals(10.0, TriangleArea.triangleArea(5, 2));
        assertEquals(10.0, TriangleArea.triangleArea(5, 2));
        assertEquals(10.0, TriangleArea.triangleArea(5, 2));
        assertEquals(10.0, TriangleArea.triangleArea(5, 2));
    }
}
