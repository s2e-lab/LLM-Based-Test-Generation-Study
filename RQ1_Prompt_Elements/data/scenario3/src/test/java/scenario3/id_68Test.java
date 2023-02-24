package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class PluckTest {
    @Test
    public void testPluck() {
        assertEquals(Arrays.asList(2, 1), Pluck.pluck(Arrays.asList(4, 2, 3)));
        assertEquals(Arrays.asList(2, 1), Pluck.pluck(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(), Pluck.pluck(Arrays.asList()));
        assertEquals(Arrays.asList(0, 1), Pluck.pluck(Arrays.asList(5, 0, 3, 0, 4, 2)));
        assertEquals(Arrays.asList(0, 3), Pluck.pluck(Arrays.asList(1, 2, 3, 0, 5, 3)));
        assertEquals(Arrays.asList(4, 1), Pluck.pluck(Arrays.asList(5, 4, 8, 4, 8)));
        assertEquals(Arrays.asList(6, 1), Pluck.pluck(Arrays.asList(7, 6, 7, 1)));
        assertEquals(Arrays.asList(), Pluck.pluck(Arrays.asList(7, 9, 7, 1)));
        assertEquals(Arrays.asList(2, 1), Pluck.pluck(Arrays.asList(1, 2, 3, 0, 5, 3)));
        assertEquals(Arrays.asList(4, 1), Pluck.pluck(Arrays.asList(5, 4, 8, 4, 8)));
    }
}