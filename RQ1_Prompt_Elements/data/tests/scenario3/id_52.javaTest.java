package scenario3;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BelowThresholdTest {

    @Test
    public void test() throws Exception{
        assertEquals(true, scenario3.BelowThreshold.belowThreshold(Arrays.asList(1, 2, 4, 10), 100));
		assertEquals(false, scenario3.BelowThreshold.belowThreshold(Arrays.asList(1, 20, 4, 10), 5));
		assertEquals(true, scenario3.BelowThreshold.belowThreshold(Arrays.asList(1, 20, 4, 10), 21));
		assertEquals(true, scenario3.BelowThreshold.belowThreshold(Arrays.asList(1, 20, 4, 10), 22));
		assertEquals(true, scenario3.BelowThreshold.belowThreshold(Arrays.asList(1, 8, 4, 10), 11));
		assertEquals(false, scenario3.BelowThreshold.belowThreshold(Arrays.asList(1, 8, 4, 10), 10));
		assertEquals(public static Boolean belowThreshold(List<Integer> l, int t) {, scenario3.BelowThreshold.*/);
		
    }

}