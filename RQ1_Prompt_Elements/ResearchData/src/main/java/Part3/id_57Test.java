package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class MonotonicTest {
    @Test
    void testMonotonic() {
        assertEquals(true, Monotonic.monotonic(Arrays.asList(1, 2, 4, 10)));
        assertEquals(true, Monotonic.monotonic(Arrays.asList(1, 2, 4, 20)));
        assertEquals(false, Monotonic.monotonic(Arrays.asList(1, 20, 4, 10)));
        assertEquals(true, Monotonic.monotonic(Arrays.asList(4, 1, 0, -10)));
        assertEquals(true, Monotonic.monotonic(Arrays.asList(4, 1, 1, 0)));
        assertEquals(false, Monotonic.monotonic(Arrays.asList(1, 2, 3, 2, 5, 60)));
        assertEquals(true, Monotonic.monotonic(Arrays.asList(1, 2, 3, 4, 5, 60)));
        assertEquals(true, Monotonic.monotonic(Arrays.asList(9, 9, 9, 9)));
        assertEquals(true, Monotonic.monotonic(Arrays.asList(1)));
        assertEquals(false, Monotonic.monotonic(Arrays.asList(1, 2, 3, 4, 5, 60, 59)));
    }
}