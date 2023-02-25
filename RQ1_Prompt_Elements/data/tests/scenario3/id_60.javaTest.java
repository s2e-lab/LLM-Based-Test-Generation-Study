package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumToNTest {

    @Test
    public void test() throws Exception{

        assertEquals(15, scenario3.SumToN.sumToN(5));
		assertEquals(55, scenario3.SumToN.sumToN(10));
		assertEquals(1, scenario3.SumToN.sumToN(1));
		assertEquals(21, scenario3.SumToN.sumToN(6));
		assertEquals(66, scenario3.SumToN.sumToN(11));
		assertEquals(465, scenario3.SumToN.sumToN(30));
		assertEquals(5050, scenario3.SumToN.sumToN(100));
		
    }

}