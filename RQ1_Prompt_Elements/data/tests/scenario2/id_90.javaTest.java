package scenario2;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextSmallestTest {

    @Test
    public void test() throws Exception{

        assertEquals(2, scenario2.NextSmallest.nextSmallest(Arrays.asList(1, 2, 3, 4, 5)));
		assertEquals(2, scenario2.NextSmallest.nextSmallest(Arrays.asList(5, 1, 4, 3, 2)));
		assertEquals(null, scenario2.NextSmallest.nextSmallest(Arrays.asList()));
		assertEquals(null, scenario2.NextSmallest.nextSmallest(Arrays.asList(1, 1)));
		assertEquals(1, scenario2.NextSmallest.nextSmallest(Arrays.asList(1, 1, 1, 1, 0)));
		assertEquals(null, scenario2.NextSmallest.nextSmallest(Arrays.asList(1, 1)));
		assertEquals(-35, scenario2.NextSmallest.nextSmallest(Arrays.asList(-35, 34, 12, -45)));
		
    }

}