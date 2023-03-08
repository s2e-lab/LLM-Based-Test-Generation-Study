package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortArray1Test {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(), scenario1.SortArray1.sortArray(Arrays.asList()));
        assertEquals(Arrays.asList(5), scenario1.SortArray1.sortArray(Arrays.asList(5)));
        assertEquals(Arrays.asList(0, 1, 2, 3, 4, 5), scenario1.SortArray1.sortArray(Arrays.asList(2, 4, 3, 0, 1, 5)));
        assertEquals(Arrays.asList(6, 5, 4, 3, 2, 1, 0), scenario1.SortArray1.sortArray(Arrays.asList(2, 4, 3, 0, 1, 5, 6)));
        assertEquals(Arrays.asList(1, 2), scenario1.SortArray1.sortArray(Arrays.asList(2, 1)));
        assertEquals(Arrays.asList(0, 11, 15, 32, 42, 87), scenario1.SortArray1.sortArray(Arrays.asList(15, 42, 87, 32, 11, 0)));
        assertEquals(Arrays.asList(23, 21, 14, 11), scenario1.SortArray1.sortArray(Arrays.asList(21, 14, 23, 11)));

    }

}