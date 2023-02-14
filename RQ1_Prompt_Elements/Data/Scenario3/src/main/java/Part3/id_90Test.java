package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class NextSmallestTest {
    @Test
    public void testNextSmallest() {
        assertEquals(2, NextSmallest.nextSmallest(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(2, NextSmallest.nextSmallest(Arrays.asList(5, 1, 4, 3, 2)));
        assertEquals(null, NextSmallest.nextSmallest(Arrays.asList()));
        assertEquals(null, NextSmallest.nextSmallest(Arrays.asList(1, 1)));
        assertEquals(1, NextSmallest.nextSmallest(Arrays.asList(1, 1, 1, 1, 0)));
        assertEquals(null, NextSmallest.nextSmallest(Arrays.asList(1, 1)));
        assertEquals(-35, NextSmallest.nextSmallest(Arrays.asList(-35, 34, 12, -45)));
        assertEquals(null, NextSmallest.nextSmallest(Arrays.asList(1)));
        assertEquals(null, NextSmallest.nextSmallest(Arrays.asList(1, 1, 1, 1, 1)));
        assertEquals(null, NextSmallest.nextSmallest(Arrays.asList(1, 1, 1, 1, 1, 1)));
    }
}