package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    public void test() throws Exception{

        assertEquals(5, scenario1.Digits.digits(5));
		assertEquals(5, scenario1.Digits.digits(54));
		assertEquals(1, scenario1.Digits.digits(120));
		assertEquals(5, scenario1.Digits.digits(5014));
		assertEquals(315, scenario1.Digits.digits(98765));
		assertEquals(2625, scenario1.Digits.digits(5576543));
		assertEquals(0, scenario1.Digits.digits(2468));
		
    }

}