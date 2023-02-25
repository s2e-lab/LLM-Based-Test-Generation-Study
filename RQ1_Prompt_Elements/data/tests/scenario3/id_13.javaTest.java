package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    public void test() throws Exception{

        assertEquals(1, scenario3.GreatestCommonDivisor.greatestCommonDivisor(3, 5));
		assertEquals(5, scenario3.GreatestCommonDivisor.greatestCommonDivisor(25, 15));
		assertEquals(1, scenario3.GreatestCommonDivisor.greatestCommonDivisor(3, 7));
		assertEquals(5, scenario3.GreatestCommonDivisor.greatestCommonDivisor(10, 15));
		assertEquals(7, scenario3.GreatestCommonDivisor.greatestCommonDivisor(49, 14));
		assertEquals(12, scenario3.GreatestCommonDivisor.greatestCommonDivisor(144, 60));
		
    }

}