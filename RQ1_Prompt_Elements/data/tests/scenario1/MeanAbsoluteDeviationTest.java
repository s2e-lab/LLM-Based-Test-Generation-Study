package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeanAbsoluteDeviationTest {

    @Test
    public void test() throws Exception {

        assertEquals(0.6666666666666666, scenario1.MeanAbsoluteDeviation.meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0)));
        assertEquals(1.0, scenario1.MeanAbsoluteDeviation.meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0, 4.0)));
        assertEquals(1.2, scenario1.MeanAbsoluteDeviation.meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0)));

    }

}