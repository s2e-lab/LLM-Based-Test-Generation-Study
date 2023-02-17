package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SortArray1Test {
    @Test
    void testSortArray() {
        assertEquals(new ArrayList<Object>(), SortArray1.sortArray(new ArrayList<Object>()));
        assertEquals(new ArrayList<Object>(Arrays.asList(5)), SortArray1.sortArray(new ArrayList<Object>(Arrays.asList(5))));
        assertEquals(new ArrayList<Object>(Arrays.asList(0, 1, 2, 3, 4, 5)), SortArray1.sortArray(new ArrayList<Object>(Arrays.asList(2, 4, 3, 0, 1, 5))));
        assertEquals(new ArrayList<Object>(Arrays.asList(6, 5, 4, 3, 2, 1, 0)), SortArray1.sortArray(new ArrayList<Object>(Arrays.asList(2, 4, 3, 0, 1, 5, 6))));
        assertEquals(new ArrayList<Object>(Arrays.asList(1, 2)), SortArray1.sortArray(new ArrayList<Object>(Arrays.asList(2, 1))));
        assertEquals(new ArrayList<Object>(Arrays.asList(0, 11, 15, 32, 42, 87)), SortArray1.sortArray(new ArrayList<Object>(Arrays.asList(15, 42, 87, 32, 11, 0))));
        assertEquals(new ArrayList<Object>(Arrays.asList(23, 21, 14, 11)), SortArray1.sortArray(new ArrayList<Object>(Arrays.asList(21, 14, 23, 11))));
    }
}