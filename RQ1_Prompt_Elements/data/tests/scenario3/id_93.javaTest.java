package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {

    @Test
    public void test() throws Exception{

        assertEquals("tgst", scenario3.Encode.encode("TEST"));
		assertEquals("mWDCSKR", scenario3.Encode.encode("Mudasir"));
		assertEquals("ygs", scenario3.Encode.encode("YES"));
		assertEquals("tHKS KS C MGSSCGG", scenario3.Encode.encode("This is a message"));
		assertEquals("k dQnT kNqW wHcT Tq wRkTg", scenario3.Encode.encode("I DoNt KnOw WhAt tO WrItE"));
		
    }

}