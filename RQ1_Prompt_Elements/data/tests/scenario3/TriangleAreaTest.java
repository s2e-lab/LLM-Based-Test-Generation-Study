package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleAreaTest {

    @Test
    public void test() throws Exception {

        assertEquals(7.5, scenario3.TriangleArea.triangleArea(5, 3));
        assertEquals(2.0, scenario3.TriangleArea.triangleArea(2, 2));
        assertEquals(40.0, scenario3.TriangleArea.triangleArea(10, 8));

    }

}