package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PluckTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(2, 1), scenario3.Pluck.pluck(Arrays.asList(4, 2, 3)));
        assertEquals(Arrays.asList(2, 1), scenario3.Pluck.pluck(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(), scenario3.Pluck.pluck(Arrays.asList()));
        assertEquals(Arrays.asList(0, 1), scenario3.Pluck.pluck(Arrays.asList(5, 0, 3, 0, 4, 2)));
        assertEquals(Arrays.asList(0, 3), scenario3.Pluck.pluck(Arrays.asList(1, 2, 3, 0, 5, 3)));
        assertEquals(Arrays.asList(4, 1), scenario3.Pluck.pluck(Arrays.asList(5, 4, 8, 4, 8)));
        assertEquals(Arrays.asList(6, 1), scenario3.Pluck.pluck(Arrays.asList(7, 6, 7, 1)));
        assertEquals(Arrays.asList(), scenario3.Pluck.pluck(Arrays.asList(7, 9, 7, 1)));

    }

}