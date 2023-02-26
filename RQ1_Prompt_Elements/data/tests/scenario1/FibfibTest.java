package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibfibTest {

    @Test
    public void test() throws Exception{

        assertEquals(1, scenario1.Fibfib.fibfib(2));
		assertEquals(0, scenario1.Fibfib.fibfib(1));
		assertEquals(4, scenario1.Fibfib.fibfib(5));
		assertEquals(24, scenario1.Fibfib.fibfib(8));
		assertEquals(81, scenario1.Fibfib.fibfib(10));
		assertEquals(274, scenario1.Fibfib.fibfib(12));
		assertEquals(927, scenario1.Fibfib.fibfib(14));
		
    }

}