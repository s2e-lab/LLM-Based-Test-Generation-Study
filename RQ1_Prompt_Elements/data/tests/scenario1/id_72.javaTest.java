package scenario1;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WillItFlyTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario1.WillItFly.willItFly(Arrays.asList(3, 2, 3), 9));
		assertEquals(false, scenario1.WillItFly.willItFly(Arrays.asList(1, 2), 5));
		assertEquals(true, scenario1.WillItFly.willItFly(Arrays.asList(3), 5));
		assertEquals(false, scenario1.WillItFly.willItFly(Arrays.asList(3, 2, 3), 1));
		assertEquals(false, scenario1.WillItFly.willItFly(Arrays.asList(1, 2, 3), 6));
		assertEquals(true, scenario1.WillItFly.willItFly(Arrays.asList(5), 5));
		
    }

}