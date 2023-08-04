// TriangleArea1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea1}.
* It contains ten unit test cases for the {@link TriangleArea1#triangleArea(int, int, int)} method.
*/
class TriangleArea1Test {

    /**
    * Test case for {@link TriangleArea1#triangleArea(int, int, int)} with three positive integers.
    */
    @Test
    void testTriangleArea1() {
        assertEquals(6.0, TriangleArea1.triangleArea(3, 4, 5));
        assertEquals(8.18, TriangleArea1.triangleArea(4, 8, 5));
        assertEquals(1.73, TriangleArea1.triangleArea(2, 2, 2));
        assertEquals(0.43, TriangleArea1.triangleArea(1, 1, 1));
    }

    /**
    * Test case for {@link TriangleArea1#triangleArea(int, int, int)} with three negative integers.
    */
    @Test
    void testTriangleArea2() {
        assertEquals(-1, TriangleArea1.triangleArea(-3, -4, -5));
        assertEquals(-1, TriangleArea1.triangleArea(-4, -8, -5));
        assertEquals(-1, TriangleArea1.triangleArea(-2, -2, -2));
        assertEquals(-1, TriangleArea1.triangleArea(-1, -1, -1));
    }

    /**
    * Test case for {@link TriangleArea1#triangleArea(int, int, int)} with three zeroes.
    */
    @Test
    void testTriangleArea3() {
        assertEquals(0.0, TriangleArea1.triangleArea(0, 0, 0));
        assertEquals(0.0, TriangleArea1.triangleArea(0, 0, 1));
        assertEquals(0.0, TriangleArea1.triangleArea(0, 1, 0));
        assertEquals(0.0, TriangleArea1.triangleArea(1, 0, 0));
    }

    /**
    * Test case for {@link TriangleArea1#triangleArea(int, int, int)} with three positive and negative integers.
    */
    @Test
    void testTriangleArea4() {
        assertEquals(-1, TriangleArea1.triangleArea(3, -4, 5));
        assertEquals(-1, TriangleArea1.triangleArea(-3, 4, -5));
        assertEquals(-1, TriangleArea1.triangleArea(3, -4, -5));
        assertEquals(-1, TriangleArea1.triangleArea(-3, -4, 5));
    }

    /**
    * Test case for {@link TriangleArea1#triangleArea(int, int, int)} with three positive and zero integers.
    */
    @Test
    void testTriangleArea5() {
        assertEquals(0.0, TriangleArea1.triangleArea(3, 0, 5));
        assertEquals(0.0, TriangleArea1.triangleArea(3, 5, 0));
        assertEquals(0.0, TriangleArea1.triangleArea(0, 3, 5));
        assertEquals(0.0, TriangleArea1.triangleArea(5, 3, 0));
    }

    /**
    * Test case for {@link TriangleArea1#triangleArea(int, int, int)} with three negative and zero integers.
    */
    @Test
    void testTriangleArea6() {
        assertEquals(0.0, TriangleArea1.triangleArea(-3, 0, -5));
        assertEquals(0.0, TriangleArea1.triangleArea(-3, -5, 0));
        assertEquals(0.0, TriangleArea1.triangleArea(0, -3, -5));
        assertEquals(0.0, TriangleArea1.triangleArea(-5, -3, 0));
    }

    /**
    * Test case for {@link TriangleArea1#triangleArea(int, int, int)} with three positive and one integers.
    */
    @Test
    void testTriangleArea7() {
        assertEquals(1.0, TriangleArea1.triangleArea(3, 1, 5));
        assertEquals(1.0, TriangleArea1.triangleArea(3, 5, 1));
        assertEquals(1.0, TriangleArea1.triangleArea(1, 3, 5));
        assertEquals(1.0, TriangleArea1.triangleArea(5, 3, 1));
    }

    /**
    * Test case for {@link TriangleArea1#triangleArea(int, int, int)} with three negative and one integers.
    */
    @Test
    void testTriangleArea8() {
        assertEquals(1.0, TriangleArea1.triangleArea(-3, 1, -5));
        assertEquals(1.0, TriangleArea1.triangleArea(-3, -5, 1));
        assertEquals(1.0, TriangleArea1.triangleArea(1, -3, -5));
        assertEquals(1.0, TriangleArea1.triangleArea(-5, -3, 1));
    }

    /**
    * Test case for {@link TriangleArea1#triangleArea(int, int, int)} with three positive and two integers.
    */
    @Test
    void testTriangleArea9() {
        assertEquals(2.0, TriangleArea1.triangleArea(3, 2, 5));
        assertEquals(2.0, TriangleArea1.triangleArea(3, 5, 2));
        assertEquals(2.0, TriangleArea1.triangleArea(2, 3, 5));
        assertEquals(2.0, TriangleArea1.triangleArea(5, 3, 2));
    }

    /**
    * Test case for {@link TriangleArea1#triangleArea(int, int, int)} with three negative and two integers.
    */
    @Test
    void testTriangleArea10() {
        assertEquals(2.0, TriangleArea1.triangleArea(-3, 2, -5));
        assertEquals(2.0, TriangleArea1.triangleArea(-3, -5, 2));
        assertEquals(2.0, TriangleArea1.triangleArea(2, -3, -5));
        assertEquals(2.0, TriangleArea1.triangleArea(-5, -3, 2));
    }
}
