// IntersectionTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains ten unit test cases for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {

    @Test
    void testIntersection1() {
        List<Integer> interval1 = List.of(1, 5);
        List<Integer> interval2 = List.of(6, 10);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection2() {
        List<Integer> interval1 = List.of(1, 5);
        List<Integer> interval2 = List.of(2, 3);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection3() {
        List<Integer> interval1 = List.of(1, 5);
        List<Integer> interval2 = List.of(4, 8);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection4() {
        List<Integer> interval1 = List.of(1, 5);
        List<Integer> interval2 = List.of(4, 6);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection5() {
        List<Integer> interval1 = List.of(1, 5);
        List<Integer> interval2 = List.of(6, 8);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection6() {
        List<Integer> interval1 = List.of(1, 5);
        List<Integer> interval2 = List.of(2, 4);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection7() {
        List<Integer> interval1 = List.of(1, 5);
        List<Integer> interval2 = List.of(3, 4);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection8() {
        List<Integer> interval1 = List.of(1, 5);
        List<Integer> interval2 = List.of(2, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection9() {
        List<Integer> interval1 = List.of(1, 5);
        List<Integer> interval2 = List.of(1, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection10() {
        List<Integer> interval1 = List.of(1, 5);
        List<Integer> interval2 = List.of(1, 6);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }
}
