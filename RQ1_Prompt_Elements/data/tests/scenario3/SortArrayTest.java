package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortArrayTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(1, 2, 4, 3, 5), scenario3.SortArray.sortArray(Arrays.asList(1, 5, 2, 3, 4)));
        assertEquals(Arrays.asList(0, 1, 2, 4, 3), scenario3.SortArray.sortArray(Arrays.asList(1, 0, 2, 3, 4)));
        assertEquals(Arrays.asList(), scenario3.SortArray.sortArray(Arrays.asList()));
        assertEquals(Arrays.asList(2, 2, 4, 4, 3, 3, 5, 5, 5, 7, 77), scenario3.SortArray.sortArray(Arrays.asList(2, 5, 77, 4, 5, 3, 5, 7, 2, 3, 4)));
        assertEquals(Arrays.asList(32, 3, 5, 6, 12, 44), scenario3.SortArray.sortArray(Arrays.asList(3, 6, 44, 12, 32, 5)));
        assertEquals(Arrays.asList(2, 4, 8, 16, 32), scenario3.SortArray.sortArray(Arrays.asList(2, 4, 8, 16, 32)));
        assertEquals(Arrays.asList(2, 4, 8, 16, 32), scenario3.SortArray.sortArray(Arrays.asList(2, 4, 8, 16, 32)));

    }

}