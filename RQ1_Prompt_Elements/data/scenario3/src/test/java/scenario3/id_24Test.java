package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class LargestDivisorTest {
    @Test
    void testLargestDivisor() {
        assertEquals(5, LargestDivisor.largestDivisor(15));
        assertEquals(1, LargestDivisor.largestDivisor(3));
        assertEquals(1, LargestDivisor.largestDivisor(7));
        assertEquals(5, LargestDivisor.largestDivisor(10));
        assertEquals(50, LargestDivisor.largestDivisor(100));
        assertEquals(7, LargestDivisor.largestDivisor(49));
        assertEquals(1, LargestDivisor.largestDivisor(1));
        assertEquals(2, LargestDivisor.largestDivisor(2));
        assertEquals(3, LargestDivisor.largestDivisor(3));
        assertEquals(4, LargestDivisor.largestDivisor(4));
    }
}