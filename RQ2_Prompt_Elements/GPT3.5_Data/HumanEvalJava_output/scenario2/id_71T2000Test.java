Here's the source code for the TriangleArea1Test class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleArea1Test {

    @Test
    void testValidTriangle1() {
        assertEquals(6.0, TriangleArea1.triangleArea(3, 4, 5));
    }

    @Test
    void testValidTriangle2() {
        assertEquals(6.0, TriangleArea1.triangleArea(5, 4, 3));
    }

    @Test
    void testValidTriangle3() {
        assertEquals(6.0, TriangleArea1.triangleArea(4, 5, 3));
    }

    @Test
    void testValidTriangle4() {
        assertEquals(6.0, TriangleArea1.triangleArea(3, 5, 4));
    }

    @Test
    void testInvalidTriangle1() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, 3));
    }

    @Test
    void testInvalidTriangle2() {
        assertEquals(-1, TriangleArea1.triangleArea(2, 3, 1));
    }

    @Test
    void testInvalidTriangle3() {
        assertEquals(-1, TriangleArea1.triangleArea(3, 1, 2));
    }

    @Test
    void testInvalidTriangle4() {
        assertEquals(-1, TriangleArea1.triangleArea(0, 0, 0));
    }

    @Test
    void testInvalidTriangle5() {
        assertEquals(-1, TriangleArea1.triangleArea(-1, -2, -3));
    }

    @Test
    void testInvalidTriangle6() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, -3));
    }
}
```

This test class contains ten unit test cases for the `TriangleArea1.triangleArea(int, int, int)` method. The first four test cases are for valid triangles, and the last six test cases are for invalid triangles. Each test case uses the `assertEquals` method to compare the expected result with the actual result returned by the `triangleArea` method.