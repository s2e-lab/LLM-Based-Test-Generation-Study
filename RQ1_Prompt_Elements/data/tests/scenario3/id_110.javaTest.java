package scenario3;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExchangeTest {

    @Test
    public void test() throws Exception{
        assertEquals("YES", scenario3.Exchange.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 3, 4)));
		assertEquals("NO", scenario3.Exchange.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 5, 3, 4)));
		assertEquals("YES", scenario3.Exchange.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(2, 1, 4, 3)));
		assertEquals("YES", scenario3.Exchange.exchange(Arrays.asList(5, 7, 3), Arrays.asList(2, 6, 4)));
		assertEquals("NO", scenario3.Exchange.exchange(Arrays.asList(5, 7, 3), Arrays.asList(2, 6, 3)));
		assertEquals("NO", scenario3.Exchange.exchange(Arrays.asList(3, 2, 6, 1, 8, 9), Arrays.asList(3, 5, 5, 1, 1, 1)));
		assertEquals("YES", scenario3.Exchange.exchange(Arrays.asList(100, 200), Arrays.asList(200, 200)));
		assertEquals(public static String exchange(List<Integer> lst1, List<Integer> lst2) {, scenario3.Exchange.*/);
		
    }

}