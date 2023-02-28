package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpecialFactorialTest {

    @Test
    public void test() throws Exception{

        assertEquals(288, scenario2.SpecialFactorial.specialFactorial(4));
		assertEquals(34560, scenario2.SpecialFactorial.specialFactorial(5));
		assertEquals(125411328000L, scenario2.SpecialFactorial.specialFactorial(7));
		assertEquals(1, scenario2.SpecialFactorial.specialFactorial(1));
		
    }

}