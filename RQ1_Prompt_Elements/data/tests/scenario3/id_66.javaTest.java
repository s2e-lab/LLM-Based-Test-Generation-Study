package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitsumTest {

    @Test
    public void test() throws Exception{

        assertEquals(0, scenario3.Digitsum.digitSum(""));
		assertEquals(131, scenario3.Digitsum.digitSum("abAB"));
		assertEquals(67, scenario3.Digitsum.digitSum("abcCd"));
		assertEquals(69, scenario3.Digitsum.digitSum("helloE"));
		assertEquals(131, scenario3.Digitsum.digitSum("woArBld"));
		assertEquals(153, scenario3.Digitsum.digitSum("aAaaaXa"));
		assertEquals(151, scenario3.Digitsum.digitSum(" How are yOu?"));
		assertEquals(327, scenario3.Digitsum.digitSum("You arE Very Smart"));
		
    }

}