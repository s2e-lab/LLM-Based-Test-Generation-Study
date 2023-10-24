// IntersectionTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains ten unit test cases for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {

    /**
     * Test case for the {@link Intersection#intersection(List, List)} method.
     */
    @Test
    void testIntersection() {
        List<Integer> interval1 = List.of(1, 3);
        List<Integer> interval2 = List.of(2, 4);
        assertEquals("YES", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 5);
        interval2 = List.of(2, 3);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 5);
        interval2 = List.of(6, 10);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 5);
        interval2 = List.of(4, 6);
        assertEquals("YES", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 5);
        interval2 = List.of(4, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 5);
        interval2 = List.of(5, 6);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 5);
        interval2 = List.of(1, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 5);
        interval2 = List.of(1, 6);
        assertEquals("YES", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 5);
        interval2 = List.of(0, 1);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 5);
        interval2 = List.of(0, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 5);
        interval2 = List.of(0, 6);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }
}
