package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class EncodeTest {
    @Test
    public void testEncode() {
        assertEquals("TGST", Encode.encode("test"));
        assertEquals("tHKS KS C MGSSCGG", Encode.encode("This is a message"));
        assertEquals("TGST", Encode.encode("TEST"));
        assertEquals("mWDCSKR", Encode.encode("Mudasir"));
        assertEquals("ygs", Encode.encode("YES"));
        assertEquals("tHKS KS C MGSSCGG", Encode.encode("This is a message"));
        assertEquals("k dQnT kNqW wHcT Tq wRkTg", Encode.encode("I DoNt KnOw WhAt tO WrItE"));
        assertEquals("", Encode.encode(""));
        assertEquals(" ", Encode.encode(" "));
        assertEquals("1", Encode.encode("1"));
    }
}