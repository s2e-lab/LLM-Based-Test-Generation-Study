package scenario1;

import java.util.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommonTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(1, 5, 653), scenario1.Common.common(Arrays.asList(1, 4, 3, 34, 653, 2, 5), Arrays.asList(5, 7, 1, 5, 9, 653, 121)));
		assertEquals(Arrays.asList(2, 3), scenario1.Common.common(Arrays.asList(5, 3, 2, 8), Arrays.asList(3, 2)));
		assertEquals(Arrays.asList(2, 3, 4), scenario1.Common.common(Arrays.asList(4, 3, 2, 8), Arrays.asList(3, 2, 4)));
		assertEquals(Arrays.asList(), scenario1.Common.common(Arrays.asList(4, 3, 2, 8), Arrays.asList()));
		assertEquals(public static List<Object> common(List<Integer> l1, List<Object> l2) {, scenario1.Common.*/);
		
    }

}