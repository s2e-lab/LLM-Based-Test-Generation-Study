package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestSmallestIntegersTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(null, 1), scenario1.LargestSmallestIntegers.largestSmallestIntegers(Arrays.asList(2, 4, 1, 3, 5, 7)));
        assertEquals(Arrays.asList(null, 1), scenario1.LargestSmallestIntegers.largestSmallestIntegers(Arrays.asList(2, 4, 1, 3, 5, 7, 0)));
        assertEquals(Arrays.asList(-2, 1), scenario1.LargestSmallestIntegers.largestSmallestIntegers(Arrays.asList(1, 3, 2, 4, 5, 6, -2)));
        assertEquals(Arrays.asList(-7, 2), scenario1.LargestSmallestIntegers.largestSmallestIntegers(Arrays.asList(4, 5, 3, 6, 2, 7, -7)));
        assertEquals(Arrays.asList(-9, 2), scenario1.LargestSmallestIntegers.largestSmallestIntegers(Arrays.asList(7, 3, 8, 4, 9, 2, 5, -9)));
        assertEquals(Arrays.asList(null, null), scenario1.LargestSmallestIntegers.largestSmallestIntegers(Arrays.asList()));
        assertEquals(Arrays.asList(null, null), scenario1.LargestSmallestIntegers.largestSmallestIntegers(Arrays.asList(0)));
        assertEquals(Arrays.asList(-1, null), scenario1.LargestSmallestIntegers.largestSmallestIntegers(Arrays.asList(-1, -3, -5, -6)));
        assertEquals(Arrays.asList(-1, null), scenario1.LargestSmallestIntegers.largestSmallestIntegers(Arrays.asList(-1, -3, -5, -6, 0)));
        assertEquals(Arrays.asList(-3, 1), scenario1.LargestSmallestIntegers.largestSmallestIntegers(Arrays.asList(-6, -4, -4, -3, 1)));
        assertEquals(Arrays.asList(-3, 1), scenario1.LargestSmallestIntegers.largestSmallestIntegers(Arrays.asList(-6, -4, -4, -3, -100, 1)));

    }

}