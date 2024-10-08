// IntersectionTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains ten unit test cases for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {

    /**
     * Test case for {@link Intersection#intersection(List, List)}.
     */
    @Test
    void testIntersection() {
        List<Integer> interval1 = List.of(1, 2);
        List<Integer> interval2 = List.of(2, 3);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        interval1 = List.of(-1, 1);
        interval2 = List.of(0, 4);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        interval1 = List.of(-3, -1);
        interval2 = List.of(-5, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));

        interval1 = List.of(-2, 2);
        interval2 = List.of(-4, 0);
        assertEquals("YES", Intersection.intersection(interval1, interval2));

        interval1 = List.of(-11, 2);
        interval2 = List.of(-1, -1);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 2);
        interval2 = List.of(3, 5);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        interval1 = List.of(1, 2);
        interval2 = List.of(1, 2);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        interval1 = List.of(-2, -2);
        interval2 = List.of(-3, -2);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
}
