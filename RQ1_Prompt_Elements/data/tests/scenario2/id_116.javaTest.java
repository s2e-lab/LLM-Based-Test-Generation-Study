package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(1, 2, 4, 3, 5), scenario2.SortArray.sortArray(Arrays.asList(1, 5, 2, 3, 4)));
		assertEquals(Arrays.asList(-4, -2, -6, -5, -3), scenario2.SortArray.sortArray(Arrays.asList(-2, -3, -4, -5, -6)));
		assertEquals(Arrays.asList(0, 1, 2, 4, 3), scenario2.SortArray.sortArray(Arrays.asList(1, 0, 2, 3, 4)));
		assertEquals(Arrays.asList(), scenario2.SortArray.sortArray(Arrays.asList()));
		assertEquals(Arrays.asList(2, 2, 4, 4, 3, 3, 5, 5, 5, 7, 77), scenario2.SortArray.sortArray(Arrays.asList(2, 5, 77, 4, 5, 3, 5, 7, 2, 3, 4)));
		assertEquals(Arrays.asList(32, 3, 5, 6, 12, 44), scenario2.SortArray.sortArray(Arrays.asList(3, 6, 44, 12, 32, 5)));
		assertEquals(Arrays.asList(2, 4, 8, 16, 32), scenario2.SortArray.sortArray(Arrays.asList(2, 4, 8, 16, 32)));
		assertEquals(Arrays.asList(2, 4, 8, 16, 32), scenario2.SortArray.sortArray(Arrays.asList(2, 4, 8, 16, 32)));
		assertEquals(public static List<Object> sortArray(List<Object> arr) {, scenario2.SortArray.*/);
		
    }

}