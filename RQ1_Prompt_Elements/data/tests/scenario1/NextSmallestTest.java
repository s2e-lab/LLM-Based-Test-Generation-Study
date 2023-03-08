package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextSmallestTest {

    @Test
    public void test() throws Exception {

        assertEquals(2, scenario1.NextSmallest.nextSmallest(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(2, scenario1.NextSmallest.nextSmallest(Arrays.asList(5, 1, 4, 3, 2)));
        assertEquals(null, scenario1.NextSmallest.nextSmallest(Arrays.asList()));
        assertEquals(null, scenario1.NextSmallest.nextSmallest(Arrays.asList(1, 1)));
        assertEquals(1, scenario1.NextSmallest.nextSmallest(Arrays.asList(1, 1, 1, 1, 0)));
        assertEquals(null, scenario1.NextSmallest.nextSmallest(Arrays.asList(1, 1)));
        assertEquals(-35, scenario1.NextSmallest.nextSmallest(Arrays.asList(-35, 34, 12, -45)));

    }

}