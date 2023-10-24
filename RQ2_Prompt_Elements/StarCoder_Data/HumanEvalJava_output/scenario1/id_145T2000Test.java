// OrderByPointsTest.java
package scenario1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OrderByPoints}.
* It contains ten unit test cases for the {@link OrderByPoints#orderByPoints(List)} method.
*/
class OrderByPointsTest {

    @Test
    void test1() {
        List<Object> nums = List.of(12, 10, 100, 1000, 10000);
        List<Object> expected = List.of(10000, 1000, 100, 10, 12);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void test2() {
        List<Object> nums = List.of(12, 10, 100, 1000, 10000, -10000);
        List<Object> expected = List.of(-10000, 10000, 1000, 100, 10, 12);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void test3() {
        List<Object> nums = List.of(12, 10, 100, 1000, 10000, -10000, -100000);
        List<Object> expected = List.of(-100000, -10000, 10000, 1000, 100, 10, 12);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void test4() {
        List<Object> nums = List.of(12, 10, 100, 1000, 10000, -10000, -100000, -1000000);
        List<Object> expected = List.of(-1000000, -100000, -10000, 10000, 1000, 100, 10, 12);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void test5() {
        List<Object> nums = List.of(12, 10, 100, 1000, 10000, -10000, -100000, -1000000, -10000000);
        List<Object> expected = List.of(-10000000, -1000000, -100000, -10000, 10000, 1000, 100, 10, 12);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void test6() {
        List<Object> nums = List.of(12, 10, 100, 1000, 10000, -10000, -100000, -1000000, -10000000, -100000000);
        List<Object> expected = List.of(-100000000, -10000000, -1000000, -100000, -10000, 10000, 1000, 100, 10, 12);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void test7() {
        List<Object> nums = List.of(12, 10, 100, 1000, 10000, -10000, -100000, -1000000, -10000000, -100000000, -1000000000);
        List<Object> expected = List.of(-1000000000, -100000000, -10000000, -1000000, -100000, -10000, 10000, 1000, 100, 10, 12);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void test8() {
        List<Object> nums = List.of(12, 10, 100, 1000, 10000, -10000, -100000, -1000000, -10000000, -100000000, -1000000000, -10000000000);
        List<Object> expected = List.of(-10000000000, -1000000000, -100000000, -10000000, -1000000, -100000, -10000, 10000, 1000, 100, 10, 12);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void test9() {
        List<Object> nums = List.of(12, 10, 100, 1000, 10000, -10000, -100000, -1000000, -10000000, -100000000, -1000000000, -10000000000, -100000000000);
        List<Object> expected = List.of(-100000000000, -10000000000, -1000000000, -100000000, -10000000, -1000000, -100000, -10000, 10000, 1000, 100, 10, 12);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void test10() {
        List<Object> nums = List.of(12, 10, 100, 1000, 10000, -10000, -100000, -1000000, -10000000, -100000000, -1000000000, -10000000000, -100000000000, -1000000000000);
        List<Object> expected = List.of(-1000000000000, -100000000000, -10000000000, -1000000000, -100000000, -10000000, -1000000, -100000, -10000, 10000, 1000, 100, 10, 12);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
}
