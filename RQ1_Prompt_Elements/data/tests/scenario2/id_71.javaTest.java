package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleArea1Test {

    @Test
    public void test() throws Exception{

        assertEquals(6.0, scenario2.TriangleArea1.triangleArea(3, 4, 5));
		assertEquals(-1, scenario2.TriangleArea1.triangleArea(1, 2, 10));
		assertEquals(8.18, scenario2.TriangleArea1.triangleArea(4, 8, 5));
		assertEquals(1.73, scenario2.TriangleArea1.triangleArea(2, 2, 2));
		assertEquals(-1, scenario2.TriangleArea1.triangleArea(1, 2, 3));
		assertEquals(16.25, scenario2.TriangleArea1.triangleArea(10, 5, 7));
		assertEquals(-1, scenario2.TriangleArea1.triangleArea(2, 6, 3));
		assertEquals(0.43, scenario2.TriangleArea1.triangleArea(1, 1, 1));
		assertEquals(-1, scenario2.TriangleArea1.triangleArea(2, 2, 10));
		
    }

}