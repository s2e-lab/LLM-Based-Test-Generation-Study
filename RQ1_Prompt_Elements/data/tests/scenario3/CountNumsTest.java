package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountNumsTest {

    @Test
    public void test() throws Exception {

        assertEquals(0, scenario3.CountNums.countNums(Arrays.asList()));
        assertEquals(0, scenario3.CountNums.countNums(Arrays.asList(-1, -2, 0)));
        assertEquals(6, scenario3.CountNums.countNums(Arrays.asList(1, 1, 2, -2, 3, 4, 5)));
        assertEquals(5, scenario3.CountNums.countNums(Arrays.asList(1, 6, 9, -6, 0, 1, 5)));
        assertEquals(4, scenario3.CountNums.countNums(Arrays.asList(1, 100, 98, -7, 1, -1)));
        assertEquals(5, scenario3.CountNums.countNums(Arrays.asList(12, 23, 34, -45, -56, 0)));
        assertEquals(1, scenario3.CountNums.countNums(Arrays.asList(0, 1)));
        assertEquals(1, scenario3.CountNums.countNums(Arrays.asList(1)));

    }

}