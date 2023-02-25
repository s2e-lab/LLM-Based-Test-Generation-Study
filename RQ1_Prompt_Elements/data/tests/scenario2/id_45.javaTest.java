package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

    @Test
    public void test() throws Exception{

        assertEquals(7.5, scenario2.TriangleArea.triangleArea(5, 3));
		assertEquals(2.0, scenario2.TriangleArea.triangleArea(2, 2));
		assertEquals(40.0, scenario2.TriangleArea.triangleArea(10, 8));
		
    }

}