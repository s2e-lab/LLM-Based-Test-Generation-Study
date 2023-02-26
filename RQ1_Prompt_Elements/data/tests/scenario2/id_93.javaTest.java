package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {

    @Test
    public void test() throws Exception{

        assertEquals("tgst", scenario2.Encode.encode("TEST"));
		assertEquals("mWDCSKR", scenario2.Encode.encode("Mudasir"));
		assertEquals("ygs", scenario2.Encode.encode("YES"));
		assertEquals("tHKS KS C MGSSCGG", scenario2.Encode.encode("This is a message"));
		assertEquals("k dQnT kNqW wHcT Tq wRkTg", scenario2.Encode.encode("I DoNt KnOw WhAt tO WrItE"));
		
    }

}