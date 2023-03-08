package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleArea1Test {

    @Test
    public void test() throws Exception {

        assertEquals(6.0, scenario1.TriangleArea1.triangleArea(3, 4, 5));
        assertEquals(-1, scenario1.TriangleArea1.triangleArea(1, 2, 10));
        assertEquals(8.18, scenario1.TriangleArea1.triangleArea(4, 8, 5));
        assertEquals(1.73, scenario1.TriangleArea1.triangleArea(2, 2, 2));
        assertEquals(-1, scenario1.TriangleArea1.triangleArea(1, 2, 3));
        assertEquals(16.25, scenario1.TriangleArea1.triangleArea(10, 5, 7));
        assertEquals(-1, scenario1.TriangleArea1.triangleArea(2, 6, 3));
        assertEquals(0.43, scenario1.TriangleArea1.triangleArea(1, 1, 1));
        assertEquals(-1, scenario1.TriangleArea1.triangleArea(2, 2, 10));

    }

}