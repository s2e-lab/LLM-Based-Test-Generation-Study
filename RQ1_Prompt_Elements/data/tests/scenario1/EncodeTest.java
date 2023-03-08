package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncodeTest {

    @Test
    public void test() throws Exception {

        assertEquals("tgst", scenario1.Encode.encode("TEST"));
        assertEquals("mWDCSKR", scenario1.Encode.encode("Mudasir"));
        assertEquals("ygs", scenario1.Encode.encode("YES"));
        assertEquals("tHKS KS C MGSSCGG", scenario1.Encode.encode("This is a message"));
        assertEquals("k dQnT kNqW wHcT Tq wRkTg", scenario1.Encode.encode("I DoNt KnOw WhAt tO WrItE"));

    }

}