package scenario1;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxFillTest {

    @Test
    public void test() throws Exception{

        assertEquals(6, scenario1.MaxFill.maxFill(Arrays.asList(Arrays.asList(0, 0, 1, 0), Arrays.asList(0, 1, 0, 0), Arrays.asList(1, 1, 1, 1)), 1));
		assertEquals(5, scenario1.MaxFill.maxFill(Arrays.asList(Arrays.asList(0, 0, 1, 1), Arrays.asList(0, 0, 0, 0), Arrays.asList(1, 1, 1, 1), Arrays.asList(0, 1, 1, 1)), 2));
		assertEquals(0, scenario1.MaxFill.maxFill(Arrays.asList(Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 0)), 5));
		assertEquals(4, scenario1.MaxFill.maxFill(Arrays.asList(Arrays.asList(1, 1, 1, 1), Arrays.asList(1, 1, 1, 1)), 2));
		assertEquals(2, scenario1.MaxFill.maxFill(Arrays.asList(Arrays.asList(1, 1, 1, 1), Arrays.asList(1, 1, 1, 1)), 9));
		
    }

}