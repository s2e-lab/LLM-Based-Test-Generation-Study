// Here's the generated code for the OrderByPointsTest class:

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderByPointsTest {

    @Test
    void testOrderByPoints() {
        List<Object> nums = Arrays.asList(1, 11, -1, -11, -12);
        List<Object> expected = Arrays.asList(-1, -11, 1, -12, 11);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = Arrays.asList(1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46);
        expected = Arrays.asList(0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = Collections.emptyList();
        expected = Collections.emptyList();
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = Arrays.asList(1, -11, -32, 43, 54, -98, 2, -3);
        expected = Arrays.asList(-3, -32, -98, -11, 1, 2, 43, 54);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        expected = Arrays.asList(1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = Arrays.asList(0, 6, 6, -76, -21, 23, 4);
        expected = Arrays.asList(-76, -21, 0, 4, 23, 6, 6);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = Arrays.asList(0, 0, 0, 0, 0);
        expected = Arrays.asList(0, 0, 0, 0, 0);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = Arrays.asList(1, 10, 100, 1000, 10000);
        expected = Arrays.asList(1, 10, 100, 1000, 10000);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = Arrays.asList(-1, -10, -100, -1000, -10000);
        expected = Arrays.asList(-1, -10, -100, -1000, -10000);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));

        nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -11);
        expected = Arrays.asList(-11, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
}