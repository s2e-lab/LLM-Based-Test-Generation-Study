package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrangeSortListTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(1, 4, 2, 3), scenario3.StrangeSortList.strangeSortList(Arrays.asList(1, 2, 3, 4)));
		assertEquals(Arrays.asList(5, 9, 6, 8, 7), scenario3.StrangeSortList.strangeSortList(Arrays.asList(5, 6, 7, 8, 9)));
		assertEquals(Arrays.asList(1, 5, 2, 4, 3), scenario3.StrangeSortList.strangeSortList(Arrays.asList(1, 2, 3, 4, 5)));
		assertEquals(Arrays.asList(1, 9, 5, 8, 6, 7), scenario3.StrangeSortList.strangeSortList(Arrays.asList(5, 6, 7, 8, 9, 1)));
		assertEquals(Arrays.asList(5, 5, 5, 5), scenario3.StrangeSortList.strangeSortList(Arrays.asList(5, 5, 5, 5)));
		assertEquals(Arrays.asList(), scenario3.StrangeSortList.strangeSortList(Arrays.asList()));
		assertEquals(Arrays.asList(1, 8, 2, 7, 3, 6, 4, 5), scenario3.StrangeSortList.strangeSortList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
		assertEquals(Arrays.asList(-5, 5, -5, 5, 0, 2, 2, 2), scenario3.StrangeSortList.strangeSortList(Arrays.asList(0, 2, 2, 2, 5, 5, -5, -5)));
		assertEquals(Arrays.asList(111111), scenario3.StrangeSortList.strangeSortList(Arrays.asList(111111)));
		
    }

}