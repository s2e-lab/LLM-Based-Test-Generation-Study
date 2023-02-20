package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class FibfibTest {
    @Test
    void testFibfib() {
        assertEquals(0, Fibfib.fibfib(1));
        assertEquals(1, Fibfib.fibfib(2));
        assertEquals(4, Fibfib.fibfib(5));
        assertEquals(24, Fibfib.fibfib(8));
        assertEquals(81, Fibfib.fibfib(10));
        assertEquals(274, Fibfib.fibfib(12));
        assertEquals(927, Fibfib.fibfib(14));
        assertEquals(3066, Fibfib.fibfib(16));
        assertEquals(10164, Fibfib.fibfib(18));
        assertEquals(33461, Fibfib.fibfib(20));
    }
}