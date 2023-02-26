package scenario2;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinsubarraysumTest {

    @Test
    public void test() throws Exception{

        assertEquals(1, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(2, 3, 4, 1, 2, 4)));
		assertEquals(-6, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(-1, -2, -3)));
		assertEquals(-14, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(-1, -2, -3, 2, -10)));
		assertEquals(-9999999999999999L, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(-9999999999999999L)));
		assertEquals(0, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(0, 10, 20, 1000000)));
		assertEquals(-6, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(-1, -2, -3, 10, -5)));
		assertEquals(-6, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(100, -1, -2, -3, 10, -5)));
		assertEquals(3, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(10, 11, 13, 8, 3, 4)));
		assertEquals(-33, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(100, -33, 32, -1, 0, -2)));
		assertEquals(-10, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(-10)));
		assertEquals(7, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(7)));
		assertEquals(-1, scenario2.Minsubarraysum.minsubarraysum(Arrays.asList(1, -1)));
		
    }

}