package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HexKeyTest {

    @Test
    public void test() throws Exception{

        assertEquals(1, scenario2.HexKey.hexKey("AB"));
		assertEquals(2, scenario2.HexKey.hexKey("1077E"));
		assertEquals(4, scenario2.HexKey.hexKey("ABED1A33"));
		assertEquals(2, scenario2.HexKey.hexKey("2020"));
		assertEquals(6, scenario2.HexKey.hexKey("123456789ABCDEF0"));
		assertEquals(12, scenario2.HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
		assertEquals(0, scenario2.HexKey.hexKey(Arrays.asList()));
		
    }

}