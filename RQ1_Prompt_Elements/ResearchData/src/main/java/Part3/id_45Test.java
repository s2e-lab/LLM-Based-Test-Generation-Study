package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class TriangleAreaTest {
    @Test
    void testTriangleArea() {
        assertEquals(7.5, TriangleArea.triangleArea(5, 3));
        assertEquals(7.5, TriangleArea.triangleArea(5, 3));
        assertEquals(2.0, TriangleArea.triangleArea(2, 2));
        assertEquals(40.0, TriangleArea.triangleArea(10, 8));
        assertEquals(7.5, TriangleArea.triangleArea(5, 3));
        assertEquals(7.5, TriangleArea.triangleArea(5, 3));
        assertEquals(2.0, TriangleArea.triangleArea(2, 2));
        assertEquals(40.0, TriangleArea.triangleArea(10, 8));
        assertEquals(7.5, TriangleArea.triangleArea(5, 3));
        assertEquals(7.5, TriangleArea.triangleArea(5, 3));
        assertEquals(2.0, TriangleArea.triangleArea(2, 2));
        assertEquals(40.0, TriangleArea.triangleArea(10, 8));
    }
}