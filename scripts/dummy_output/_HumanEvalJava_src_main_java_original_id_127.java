// IntersectionTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Intersection}.
 * It contains ten unit test cases for the {@link Intersection#intersection(int[], int[])} method.
 */
class IntersectionTest {

    @Test
    void testIntersectionNo() {
        int[] interval1 = {1, 2};
        int[] interval2 = {2, 3};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo2() {
        int[] interval1 = {-1, 1};
        int[] interval2 = {0, 4};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionYes() {
        int[] interval1 = {-3, -1};
        int[] interval2 = {-5, 5};
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionYes2() {
        int[] interval1 = {-2, 2};
        int[] interval2 = {-4, 0};
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo3() {
        int[] interval1 = {-11, 2};
        int[] interval2 = {-1, -1};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo4() {
        int[] interval1 = {1, 2};
        int[] interval2 = {3, 5};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo5() {
        int[] interval1 = {1, 2};
        int[] interval2 = {1, 2};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo6() {
        int[] interval1 = {-2, -2};
        int[] interval2 = {-3, -2};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionYes3() {
        int[] interval1 = {2, 5};
        int[] interval2 = {3, 7};
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionNo7() {
        int[] interval1 = {2, 5};
        int[] interval2 = {6, 7};
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
}