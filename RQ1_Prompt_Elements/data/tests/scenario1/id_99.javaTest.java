package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClosestIntegerTest {

    @Test
    public void test() throws Exception{

        assertEquals(10, scenario1.ClosestInteger.closestInteger("10"));
		assertEquals(15, scenario1.ClosestInteger.closestInteger("14.5"));
		assertEquals(-16, scenario1.ClosestInteger.closestInteger("-15.5"));
		assertEquals(15, scenario1.ClosestInteger.closestInteger("15.3"));
		assertEquals(0, scenario1.ClosestInteger.closestInteger("0"));
		
    }

}