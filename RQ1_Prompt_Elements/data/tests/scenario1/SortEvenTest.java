package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortEvenTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(1, 2, 3), scenario1.SortEven.sortEven(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(3, 6, 5, 4), scenario1.SortEven.sortEven(Arrays.asList(5, 6, 3, 4)));
        assertEquals(Arrays.asList(1, 2, 3), scenario1.SortEven.sortEven(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123), scenario1.SortEven.sortEven(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10)));
        assertEquals(Arrays.asList(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10), scenario1.SortEven.sortEven(Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10)));

    }

}