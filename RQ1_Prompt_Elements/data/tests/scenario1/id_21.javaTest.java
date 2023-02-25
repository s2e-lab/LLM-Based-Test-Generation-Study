package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RescaleToUnitTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0), scenario1.RescaleToUnit.rescaleToUnit(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0)));
		assertEquals(Arrays.asList(0.0, 1.0), scenario1.RescaleToUnit.rescaleToUnit(Arrays.asList(2.0, 49.9)));
		assertEquals(Arrays.asList(1.0, 0.0), scenario1.RescaleToUnit.rescaleToUnit(Arrays.asList(100.0, 49.9)));
		assertEquals(Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0), scenario1.RescaleToUnit.rescaleToUnit(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0)));
		assertEquals(Arrays.asList(0.25, 0.0, 1.0, 0.5, 0.75), scenario1.RescaleToUnit.rescaleToUnit(Arrays.asList(2.0, 1.0, 5.0, 3.0, 4.0)));
		assertEquals(Arrays.asList(0.25, 0.0, 1.0, 0.5, 0.75), scenario1.RescaleToUnit.rescaleToUnit(Arrays.asList(12.0, 11.0, 15.0, 13.0, 14.0)));
		assertEquals(public static List<Double> rescaleToUnit(List<Double> numbers) {, scenario1.RescaleToUnit.*/);
		
    }

}