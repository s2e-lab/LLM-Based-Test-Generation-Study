package scenario2;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BelowZeroTest {

    @Test
    public void test() throws Exception{

        assertEquals(false, scenario2.BelowZero.belowZero(Arrays.asList(1, 2, 3)));
		assertEquals(true, scenario2.BelowZero.belowZero(Arrays.asList(1, 2, -4, 5)));
		assertEquals(false, scenario2.BelowZero.belowZero(Arrays.asList()));
		assertEquals(false, scenario2.BelowZero.belowZero(Arrays.asList(1, 2, -3, 1, 2, -3)));
		assertEquals(true, scenario2.BelowZero.belowZero(Arrays.asList(1, 2, -4, 5, 6)));
		assertEquals(false, scenario2.BelowZero.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4)));
		assertEquals(true, scenario2.BelowZero.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5)));
		assertEquals(true, scenario2.BelowZero.belowZero(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4)));
		
    }

}