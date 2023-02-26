package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringXorTest {

    @Test
    public void test() throws Exception{

        assertEquals("100", scenario3.StringXor.stringXor("010", "110"));
		assertEquals("010010", scenario3.StringXor.stringXor("111000", "101010"));
		assertEquals("0", scenario3.StringXor.stringXor("1", "1"));
		assertEquals("0101", scenario3.StringXor.stringXor("0101", "0000"));
		
    }

}