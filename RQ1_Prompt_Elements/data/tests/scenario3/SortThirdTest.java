package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortThirdTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(1, 2, 3), scenario3.SortThird.sortThird(Arrays.asList(1, 2, 3)));
		assertEquals(Arrays.asList(2, 6, 3, 4, 8, 9, 5), scenario3.SortThird.sortThird(Arrays.asList(5, 6, 3, 4, 8, 9, 2)));
		assertEquals(Arrays.asList(1, 2, 3), scenario3.SortThird.sortThird(Arrays.asList(1, 2, 3)));
		assertEquals(Arrays.asList(1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10), scenario3.SortThird.sortThird(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10)));
		assertEquals(Arrays.asList(-10, 8, -12, 3, 23, 2, 4, 11, 12, 5), scenario3.SortThird.sortThird(Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10)));
		assertEquals(Arrays.asList(2, 6, 3, 4, 8, 9, 5), scenario3.SortThird.sortThird(Arrays.asList(5, 6, 3, 4, 8, 9, 2)));
		assertEquals(Arrays.asList(2, 8, 3, 4, 6, 9, 5), scenario3.SortThird.sortThird(Arrays.asList(5, 8, 3, 4, 6, 9, 2)));
		assertEquals(Arrays.asList(2, 6, 9, 4, 8, 3, 5), scenario3.SortThird.sortThird(Arrays.asList(5, 6, 9, 4, 8, 3, 2)));
		assertEquals(Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1), scenario3.SortThird.sortThird(Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1)));
		
    }

}