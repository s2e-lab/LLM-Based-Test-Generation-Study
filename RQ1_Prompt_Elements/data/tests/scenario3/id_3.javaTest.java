package scenario3;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BelowZeroTest {

    @Test
    public void test() throws Exception{
        assertEquals(False, scenario3.BelowZero.belowZero(Arrays.asList(1, 2, 3)));
		assertEquals(True, scenario3.BelowZero.belowZero(Arrays.asList(1, 2, -4, 5)));
		assertEquals(false, scenario3.BelowZero.belowZero(Arrays.asList()));
		assertEquals(false, scenario3.BelowZero.belowZero(Arrays.asList(1, 2, -3, 1, 2, -3)));
		assertEquals(true, scenario3.BelowZero.belowZero(Arrays.asList(1, 2, -4, 5, 6)));
		assertEquals(false, scenario3.BelowZero.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4)));
		assertEquals(true, scenario3.BelowZero.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5)));
		assertEquals(true, scenario3.BelowZero.belowZero(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4)));
		assertEquals(public static Boolean belowZero(List<Object> operations) {, scenario3.BelowZero.*/);
		
    }

}