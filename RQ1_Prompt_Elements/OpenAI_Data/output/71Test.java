// TriangleArea1Test.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link TriangleArea1}.
* It contains ten test cases for the {@link TriangleArea1#triangleArea()} method.
*/
class TriangleArea1Test {


    @Test
    void testTriangleArea1() {
        assertEquals(6.0, TriangleArea1.triangleArea(3, 4, 5));
    }

    @Test
    void testTriangleArea2() {
        assertEquals(6.0, TriangleArea1.triangleArea(3, 5, 4));
    }

    @Test
    void testTriangleArea3() {
        assertEquals(6.0, TriangleArea1.triangleArea(4, 3, 5));
    }

    @Test
    void testTriangleArea4() {
        assertEquals(6.0, TriangleArea1.triangleArea(4, 5, 3));
    }

    @Test
    void testTriangleArea5() {
        assertEquals(6.0, TriangleArea1.triangleArea(5, 3, 4));
    }

    @Test
    void testTriangleArea6() {
        assertEquals(6.0, TriangleArea1.triangleArea(5, 4, 3));
    }

    @Test
    void testTriangleArea7() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 1, 3));
    }

    @Test
    void testTriangleArea8() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 3, 1));
    }

    @Test
    void testTriangleArea9() {
        assertEquals(-1, TriangleArea1.triangleArea(3, 1, 1));
    }

    @Test
    void testTriangleArea10() {
        assertEquals(-1, TriangleArea1.triangleArea(0, 0, 0));
    }
}