package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class HexKeyTest {
    @Test
    public void testHexKey() {
        assertEquals(1, HexKey.hexKey("AB"));
        assertEquals(2, HexKey.hexKey("1077E"));
        assertEquals(4, HexKey.hexKey("ABED1A33"));
        assertEquals(2, HexKey.hexKey("2020"));
        assertEquals(6, HexKey.hexKey("123456789ABCDEF0"));
        assertEquals(12, HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
        assertEquals(0, HexKey.hexKey(""));
        assertEquals(0, HexKey.hexKey("ABCDEF"));
        assertEquals(0, HexKey.hexKey("123456789"));
        assertEquals(0, HexKey.hexKey("ABCDEF123456789"));
    }
}