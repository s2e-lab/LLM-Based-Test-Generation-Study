package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsEqualToSumEvenTest {

    @Test
    public void test() throws Exception{

        assertEquals(false, scenario3.IsEqualToSumEven.isEqualToSumEven(4));
		assertEquals(false, scenario3.IsEqualToSumEven.isEqualToSumEven(6));
		assertEquals(true, scenario3.IsEqualToSumEven.isEqualToSumEven(8));
		assertEquals(true, scenario3.IsEqualToSumEven.isEqualToSumEven(10));
		assertEquals(false, scenario3.IsEqualToSumEven.isEqualToSumEven(11));
		assertEquals(true, scenario3.IsEqualToSumEven.isEqualToSumEven(12));
		assertEquals(false, scenario3.IsEqualToSumEven.isEqualToSumEven(13));
		assertEquals(true, scenario3.IsEqualToSumEven.isEqualToSumEven(16));
		
    }

}