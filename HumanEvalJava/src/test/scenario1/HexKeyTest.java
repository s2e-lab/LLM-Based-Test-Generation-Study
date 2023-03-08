package scenario1;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HexKeyTest {

    @Test
    public void test() throws Exception {

        assertEquals(1, scenario1.HexKey.hexKey("AB"));
        assertEquals(2, scenario1.HexKey.hexKey("1077E"));
        assertEquals(4, scenario1.HexKey.hexKey("ABED1A33"));
        assertEquals(2, scenario1.HexKey.hexKey("2020"));
        assertEquals(6, scenario1.HexKey.hexKey("123456789ABCDEF0"));
        assertEquals(12, scenario1.HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
        assertEquals(0, scenario1.HexKey.hexKey(Arrays.asList()));

    }

}