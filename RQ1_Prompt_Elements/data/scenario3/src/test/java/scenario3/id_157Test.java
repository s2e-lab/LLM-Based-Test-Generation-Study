package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class RightAngleTriangleTest {
    @Test
    public void testRightAngleTriangle() {
        assertEquals(true, RightAngleTriangle.rightAngleTriangle(3, 4, 5));
        assertEquals(false, RightAngleTriangle.rightAngleTriangle(1, 2, 3));
        assertEquals(true, RightAngleTriangle.rightAngleTriangle(10, 6, 8));
        assertEquals(false, RightAngleTriangle.rightAngleTriangle(2, 2, 2));
        assertEquals(true, RightAngleTriangle.rightAngleTriangle(7, 24, 25));
        assertEquals(false, RightAngleTriangle.rightAngleTriangle(10, 5, 7));
        assertEquals(true, RightAngleTriangle.rightAngleTriangle(5, 12, 13));
        assertEquals(true, RightAngleTriangle.rightAngleTriangle(15, 8, 17));
        assertEquals(true, RightAngleTriangle.rightAngleTriangle(48, 55, 73));
        assertEquals(false, RightAngleTriangle.rightAngleTriangle(1, 1, 1));
        assertEquals(false, RightAngleTriangle.rightAngleTriangle(2, 2, 10));
    }
}