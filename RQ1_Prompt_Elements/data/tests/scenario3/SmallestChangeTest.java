package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestChangeTest {

    @Test
    public void test() throws Exception {

        assertEquals(4, scenario3.SmallestChange.smallestChange(Arrays.asList(1, 2, 3, 5, 4, 7, 9, 6)));
        assertEquals(1, scenario3.SmallestChange.smallestChange(Arrays.asList(1, 2, 3, 4, 3, 2, 2)));
        assertEquals(1, scenario3.SmallestChange.smallestChange(Arrays.asList(1, 4, 2)));
        assertEquals(1, scenario3.SmallestChange.smallestChange(Arrays.asList(1, 4, 4, 2)));
        assertEquals(0, scenario3.SmallestChange.smallestChange(Arrays.asList(1, 2, 3, 2, 1)));
        assertEquals(0, scenario3.SmallestChange.smallestChange(Arrays.asList(3, 1, 1, 3)));
        assertEquals(0, scenario3.SmallestChange.smallestChange(Arrays.asList(1)));
        assertEquals(1, scenario3.SmallestChange.smallestChange(Arrays.asList(0, 1)));

    }

}