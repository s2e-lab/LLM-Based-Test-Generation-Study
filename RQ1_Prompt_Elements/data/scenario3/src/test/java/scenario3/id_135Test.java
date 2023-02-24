package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CanArrangeTest {
    @Test
    void testCanArrange() {
        assertEquals(3, CanArrange.canArrange(Arrays.asList(1, 2, 4, 3, 5)));
        assertEquals(-1, CanArrange.canArrange(Arrays.asList(1, 2, 3)));
        assertEquals(2, CanArrange.canArrange(Arrays.asList(1, 2, 4, 5)));
        assertEquals(4, CanArrange.canArrange(Arrays.asList(1, 4, 2, 5, 6, 7, 8, 9, 10)));
        assertEquals(-1, CanArrange.canArrange(Arrays.asList(4, 8, 5, 7, 3)));
        assertEquals(-1, CanArrange.canArrange(Arrays.asList()));
        assertEquals(2, CanArrange.canArrange(Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10)));
        assertEquals(4, CanArrange.canArrange(Arrays.asList(1, 4, 2, 5, 6, 7, 8, 9, 10)));
        assertEquals(-1, CanArrange.canArrange(Arrays.asList(4, 8, 5, 7, 3)));
        assertEquals(-1, CanArrange.canArrange(Arrays.asList()));
    }
}