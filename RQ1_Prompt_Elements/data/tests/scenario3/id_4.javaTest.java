package scenario3;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeanAbsoluteDeviationTest {

    @Test
    public void test() throws Exception{

        assertEquals(0.6666666666666666, scenario3.MeanAbsoluteDeviation.meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0)));
		assertEquals(1.0, scenario3.MeanAbsoluteDeviation.meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0, 4.0)));
		assertEquals(1.2, scenario3.MeanAbsoluteDeviation.meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0)));
		
    }

}