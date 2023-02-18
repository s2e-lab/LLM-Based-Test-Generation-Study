package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CountUpToTest {
    @Test
    void testCountUpTo() {
        assertEquals(CountUpTo.countUpTo(5), Arrays.asList(2, 3));
        assertEquals(CountUpTo.countUpTo(6), Arrays.asList(2, 3, 5));
        assertEquals(CountUpTo.countUpTo(7), Arrays.asList(2, 3, 5));
        assertEquals(CountUpTo.countUpTo(10), Arrays.asList(2, 3, 5, 7));
        assertEquals(CountUpTo.countUpTo(0), Arrays.asList());
        assertEquals(CountUpTo.countUpTo(22), Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        assertEquals(CountUpTo.countUpTo(1), Arrays.asList());
        assertEquals(CountUpTo.countUpTo(18), Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        assertEquals(CountUpTo.countUpTo(47), Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43));
        assertEquals(CountUpTo.countUpTo(101), Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
    }
}