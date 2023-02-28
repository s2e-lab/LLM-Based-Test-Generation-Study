package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RightAngleTriangleTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario2.RightAngleTriangle.rightAngleTriangle(3, 4, 5));
		assertEquals(false, scenario2.RightAngleTriangle.rightAngleTriangle(1, 2, 3));
		assertEquals(true, scenario2.RightAngleTriangle.rightAngleTriangle(10, 6, 8));
		assertEquals(false, scenario2.RightAngleTriangle.rightAngleTriangle(2, 2, 2));
		assertEquals(true, scenario2.RightAngleTriangle.rightAngleTriangle(7, 24, 25));
		assertEquals(false, scenario2.RightAngleTriangle.rightAngleTriangle(10, 5, 7));
		assertEquals(true, scenario2.RightAngleTriangle.rightAngleTriangle(5, 12, 13));
		assertEquals(true, scenario2.RightAngleTriangle.rightAngleTriangle(15, 8, 17));
		assertEquals(true, scenario2.RightAngleTriangle.rightAngleTriangle(48, 55, 73));
		assertEquals(false, scenario2.RightAngleTriangle.rightAngleTriangle(1, 1, 1));
		assertEquals(false, scenario2.RightAngleTriangle.rightAngleTriangle(2, 2, 10));
		
    }

}