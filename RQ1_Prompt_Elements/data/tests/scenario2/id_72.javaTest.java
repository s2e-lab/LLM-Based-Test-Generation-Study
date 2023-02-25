package scenario2;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WillItFlyTest {

    @Test
    public void test() throws Exception{
        assertEquals(true, scenario2.WillItFly.willItFly(Arrays.asList(3, 2, 3), 9));
		assertEquals(false, scenario2.WillItFly.willItFly(Arrays.asList(1, 2), 5));
		assertEquals(true, scenario2.WillItFly.willItFly(Arrays.asList(3), 5));
		assertEquals(false, scenario2.WillItFly.willItFly(Arrays.asList(3, 2, 3), 1));
		assertEquals(false, scenario2.WillItFly.willItFly(Arrays.asList(1, 2, 3), 6));
		assertEquals(true, scenario2.WillItFly.willItFly(Arrays.asList(5), 5));
		assertEquals(public static Boolean willItFly(List<Integer> q, int w) {, scenario2.WillItFly.*/);
		
    }

}