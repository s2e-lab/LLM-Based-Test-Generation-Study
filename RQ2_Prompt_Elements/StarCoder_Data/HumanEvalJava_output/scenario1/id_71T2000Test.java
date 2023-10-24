// TriangleArea1Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea1}.
* It contains ten unit test cases for the {@link TriangleArea1#triangleArea(int, int, int)} method.
*/
class TriangleArea1Test {

    @Test
    void testTriangleArea1() {
        assertEquals(1.7320508075688772, TriangleArea1.triangleArea(3, 4, 5));
    }

    @Test
    void testTriangleArea2() {
        assertEquals(2.0, TriangleArea1.triangleArea(3, 4, 4));
    }

    @Test
    void testTriangleArea3() {
        assertEquals(2.449489742783178, TriangleArea1.triangleArea(3, 4, 3));
    }

    @Test
    void testTriangleArea4() {
        assertEquals(2.8284271247461903, TriangleArea1.triangleArea(3, 4, 2));
    }

    @Test
    void testTriangleArea5() {
        assertEquals(3.1622776601683795, TriangleArea1.triangleArea(3, 4, 1));
    }

    @Test
    void testTriangleArea6() {
        assertEquals(3.4641016151377544, TriangleArea1.triangleArea(3, 4, 0));
    }

    @Test
    void testTriangleArea7() {
        assertEquals(-1, TriangleArea1.triangleArea(3, 4, -1));
    }

    @Test
    void testTriangleArea8() {
        assertEquals(-1, TriangleArea1.triangleArea(3, 4, -2));
    }

    @Test
    void testTriangleArea9() {
        assertEquals(-1, TriangleArea1.triangleArea(3, 4, -3));
    }

    @Test
    void testTriangleArea10() {
        assertEquals(-1, TriangleArea1.triangleArea(3, 4, -4));
    }
}
