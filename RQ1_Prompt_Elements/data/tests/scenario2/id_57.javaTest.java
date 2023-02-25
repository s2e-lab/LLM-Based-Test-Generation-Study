package scenario2;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MonotonicTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario2.Monotonic.monotonic(Arrays.asList(1, 2, 4, 10)));
		assertEquals(true, scenario2.Monotonic.monotonic(Arrays.asList(1, 2, 4, 20)));
		assertEquals(false, scenario2.Monotonic.monotonic(Arrays.asList(1, 20, 4, 10)));
		assertEquals(true, scenario2.Monotonic.monotonic(Arrays.asList(4, 1, 0, -10)));
		assertEquals(true, scenario2.Monotonic.monotonic(Arrays.asList(4, 1, 1, 0)));
		assertEquals(false, scenario2.Monotonic.monotonic(Arrays.asList(1, 2, 3, 2, 5, 60)));
		assertEquals(true, scenario2.Monotonic.monotonic(Arrays.asList(1, 2, 3, 4, 5, 60)));
		assertEquals(true, scenario2.Monotonic.monotonic(Arrays.asList(9, 9, 9, 9)));
		
    }

}