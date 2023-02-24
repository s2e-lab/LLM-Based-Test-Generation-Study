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
 * It contains ten test cases for the {@link scenario1.TriangleArea1#triangleArea()} method.
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

// TriangleArea2.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class TriangleArea2 {

    public static Number triangleArea(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1;
        }
        double p = (a + b + c) / 2.0;
        return Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100.0) / 100.0;
    }
}

// TriangleArea2Test.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link TriangleArea2}.
 * It contains ten test cases for the {@link scenario2.TriangleArea2#triangleArea()} method.
 */
class TriangleArea2Test {

    @Test
    void testTriangleArea1() {
        assertEquals(6.0, TriangleArea2.triangleArea(3, 4, 5));
    }

    @Test
    void testTriangleArea2() {
        assertEquals(6.0, TriangleArea2.triangleArea(3, 5, 4));
    }

    @Test
    void testTriangleArea3() {
        assertEquals(6.0, TriangleArea2.triangleArea(4, 3, 5));
    }

    @Test
    void testTriangleArea4() {
        assertEquals(6.0, TriangleArea2.triangleArea(4, 5, 3));
    }

    @Test
    void testTriangleArea5() {
        assertEquals(6.0, TriangleArea2.triangleArea(5, 3, 4));
    }

    @Test
    void testTriangleArea6() {
        assertEquals(6.0, TriangleArea2.triangleArea(5, 4, 3));
    }

    @Test
    void testTriangleArea7() {
        assertEquals(-1, TriangleArea2.triangleArea(1, 1, 3));
    }

    @Test
    void testTriangleArea8() {
        assertEquals(-1, TriangleArea2.triangleArea(1, 3, 1));
    }

    @Test
    void