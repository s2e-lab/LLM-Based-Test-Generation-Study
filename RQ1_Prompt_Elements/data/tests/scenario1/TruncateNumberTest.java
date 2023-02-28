package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TruncateNumberTest {

    @Test
    public void test() throws Exception{

        assertEquals(0.5, scenario1.TruncateNumber.truncateNumber(3.5));
		assertEquals(0.33, scenario1.TruncateNumber.truncateNumber(1.33));
		assertEquals(0.456, scenario1.TruncateNumber.truncateNumber(123.456));
		
    }

}