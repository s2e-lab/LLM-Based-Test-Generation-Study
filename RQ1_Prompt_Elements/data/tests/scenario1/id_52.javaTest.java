package scenario1;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BelowThresholdTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario1.BelowThreshold.belowThreshold(Arrays.asList(1, 2, 4, 10), 100));
		assertEquals(false, scenario1.BelowThreshold.belowThreshold(Arrays.asList(1, 20, 4, 10), 5));
		assertEquals(true, scenario1.BelowThreshold.belowThreshold(Arrays.asList(1, 20, 4, 10), 21));
		assertEquals(true, scenario1.BelowThreshold.belowThreshold(Arrays.asList(1, 20, 4, 10), 22));
		assertEquals(true, scenario1.BelowThreshold.belowThreshold(Arrays.asList(1, 8, 4, 10), 11));
		assertEquals(false, scenario1.BelowThreshold.belowThreshold(Arrays.asList(1, 8, 4, 10), 10));
		
    }

}