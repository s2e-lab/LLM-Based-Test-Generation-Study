package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Maximum1Test {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(-4, -3, 5), scenario1.Maximum1.maximum(Arrays.asList(-3, -4, 5), 3));
        assertEquals(Arrays.asList(4, 4), scenario1.Maximum1.maximum(Arrays.asList(4, -4, 4), 2));
        assertEquals(Arrays.asList(2), scenario1.Maximum1.maximum(Arrays.asList(-3, 2, 1, 2, -1, -2, 1), 1));
        assertEquals(Arrays.asList(2, 20, 123), scenario1.Maximum1.maximum(Arrays.asList(123, -123, 20, 0, 1, 2, -3), 3));
        assertEquals(Arrays.asList(0, 1, 2, 20), scenario1.Maximum1.maximum(Arrays.asList(-123, 20, 0, 1, 2, -3), 4));
        assertEquals(Arrays.asList(-13, -8, 0, 0, 3, 5, 15), scenario1.Maximum1.maximum(Arrays.asList(5, 15, 0, 3, -13, -8, 0), 7));
        assertEquals(Arrays.asList(3, 5), scenario1.Maximum1.maximum(Arrays.asList(-1, 0, 2, 5, 3, -10), 2));
        assertEquals(Arrays.asList(5), scenario1.Maximum1.maximum(Arrays.asList(1, 0, 5, -7), 1));
        assertEquals(Arrays.asList(-4, 4), scenario1.Maximum1.maximum(Arrays.asList(4, -4), 2));
        assertEquals(Arrays.asList(-10, 10), scenario1.Maximum1.maximum(Arrays.asList(-10, 10), 2));
        assertEquals(Arrays.asList(), scenario1.Maximum1.maximum(Arrays.asList(1, 2, 3, -23, 243, -400, 0), 0));

    }

}