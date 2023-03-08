package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderByPointsTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(-1, -11, 1, -12, 11), scenario2.OrderByPoints.orderByPoints(Arrays.asList(1, 11, -1, -11, -12)));
        assertEquals(Arrays.asList(0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457), scenario2.OrderByPoints.orderByPoints(Arrays.asList(1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46)));
        assertEquals(Arrays.asList(), scenario2.OrderByPoints.orderByPoints(Arrays.asList()));
        assertEquals(Arrays.asList(-3, -32, -98, -11, 1, 2, 43, 54), scenario2.OrderByPoints.orderByPoints(Arrays.asList(1, -11, -32, 43, 54, -98, 2, -3)));
        assertEquals(Arrays.asList(1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9), scenario2.OrderByPoints.orderByPoints(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)));
        assertEquals(Arrays.asList(-76, -21, 0, 4, 23, 6, 6), scenario2.OrderByPoints.orderByPoints(Arrays.asList(0, 6, 6, -76, -21, 23, 4)));

    }

}