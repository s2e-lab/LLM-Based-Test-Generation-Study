package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpecialFactorialTest {

    @Test
    public void test() throws Exception{

        assertEquals(288, scenario3.SpecialFactorial.specialFactorial(4));
		assertEquals(34560, scenario3.SpecialFactorial.specialFactorial(5));
		assertEquals(125411328000L, scenario3.SpecialFactorial.specialFactorial(7));
		assertEquals(1, scenario3.SpecialFactorial.specialFactorial(1));
		
    }

}