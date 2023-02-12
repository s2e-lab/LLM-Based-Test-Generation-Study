package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class StrangeSortListTest {
    @Test
    void strangeSortListTest() {
        assertEquals(Arrays.asList(1, 4, 2, 3), StrangeSortList.strangeSortList(Arrays.asList(1, 2, 3, 4)));
        assertEquals(Arrays.asList(5, 9, 6, 8, 7), StrangeSortList.strangeSortList(Arrays.asList(5, 6, 7, 8, 9)));
        assertEquals(Arrays.asList(1, 5, 2, 4, 3), StrangeSortList.strangeSortList(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(Arrays.asList(1, 9, 5, 8, 6, 7), StrangeSortList.strangeSortList(Arrays.asList(5, 6, 7, 8, 9, 1)));
        assertEquals(Arrays.asList(5, 5, 5, 5), StrangeSortList.strangeSortList(Arrays.asList(5, 5, 5, 5)));
        assertEquals(Arrays.asList(), StrangeSortList.strangeSortList(Arrays.asList()));
        assertEquals(Arrays.asList(1, 8, 2, 7, 3, 6, 4, 5), StrangeSortList.strangeSortList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
        assertEquals(Arrays.asList(-5, 5, -5, 5, 0, 2, 2, 2), StrangeSortList.strangeSortList(Arrays.asList(0, 2, 2, 2, 5, 5, -5, -5)));
        assertEquals(Arrays.asList(111111), StrangeSortList.strangeSortList(Arrays.asList(111111)));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), StrangeSortList.strangeSortList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }
}