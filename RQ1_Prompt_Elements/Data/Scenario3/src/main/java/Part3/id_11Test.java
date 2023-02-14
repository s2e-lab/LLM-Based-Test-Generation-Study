package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class StringXorTest {
    @Test
    void stringXorTest() {
        assertEquals("100", StringXor.stringXor("010", "110"));
        assertEquals("010010", StringXor.stringXor("111000", "101010"));
        assertEquals("0", StringXor.stringXor("1", "1"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
    }
}