// OrderByPointsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OrderByPoints}.
* It contains ten unit test cases for the {@link OrderByPoints#orderByPoints(List)} method.
*/
class OrderByPointsTest {

    /**
     * Test case for {@link OrderByPoints#orderByPoints(List)}
     * with an empty list.
     */
    @Test
    void testOrderByPointsWithEmptyList() {
        List<Object> nums = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    /**
     * Test case for {@link OrderByPoints#orderByPoints(List)}
     * with a list of integers.
     */
    @Test
    void testOrderByPointsWithList() {
        List<Object> nums = List.of(1, 11, -1, -11, -12);
        List<Object> expected = List.of(-1, -11, 1, -12, 11);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    /**
     * Test case for {@link OrderByPoints#orderByPoints(List)}
     * with a list of integers.
     */
    @Test
    void testOrderByPointsWithList2() {
        List<Object> nums = List.of(1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46);
        List<Object> expected = List.of(0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    /**
     * Test case for {@link OrderByPoints#orderByPoints(List)}
     * with a list of integers.
     */
    @Test
    void testOrderByPointsWithList3() {
        List<Object> nums = List.of(1, -11, -32, 43, 54, -98, 2, -3);
        List<Object> expected = List.of(-3, -32, -98, -11, 1, 2, 43, 54);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    /**
     * Test case for {@link OrderByPoints#orderByPoints(List)}
     * with a list of integers.
     */
    @Test
    void testOrderByPointsWithList4() {
        List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Object> expected = List.of(1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    /**
     * Test case for {@link OrderByPoints#orderByPoints(List)}
     * with a list of integers.
     */
    @Test
    void testOrderByPointsWithList5() {
        List<Object> nums = List.of(0, 6, 6, -76, -21, 23, 4);
        List<Object> expected = List.of(-76, -21, 0, 4, 23, 6, 6);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
}
