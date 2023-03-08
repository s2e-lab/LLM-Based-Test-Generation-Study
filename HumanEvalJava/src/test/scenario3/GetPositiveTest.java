package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetPositiveTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(2, 5, 6), scenario3.GetPositive.getPositive(Arrays.asList(-1, 2, -4, 5, 6)));
        assertEquals(Arrays.asList(5, 3, 2, 3, 9, 123, 1), scenario3.GetPositive.getPositive(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10)));
        assertEquals(Arrays.asList(4, 5, 6), scenario3.GetPositive.getPositive(Arrays.asList(-1, -2, 4, 5, 6)));
        assertEquals(Arrays.asList(5, 3, 2, 3, 3, 9, 123, 1), scenario3.GetPositive.getPositive(Arrays.asList(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10)));
        assertEquals(Arrays.asList(), scenario3.GetPositive.getPositive(Arrays.asList(-1, -2)));
        assertEquals(Arrays.asList(), scenario3.GetPositive.getPositive(Arrays.asList()));

    }

}