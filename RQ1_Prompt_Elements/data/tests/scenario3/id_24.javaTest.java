package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestDivisorTest {

    @Test
    public void test() throws Exception{

        assertEquals(5, scenario3.LargestDivisor.largestDivisor(15));
		assertEquals(1, scenario3.LargestDivisor.largestDivisor(3));
		assertEquals(1, scenario3.LargestDivisor.largestDivisor(7));
		assertEquals(5, scenario3.LargestDivisor.largestDivisor(10));
		assertEquals(50, scenario3.LargestDivisor.largestDivisor(100));
		assertEquals(7, scenario3.LargestDivisor.largestDivisor(49));
		
    }

}