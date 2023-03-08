package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringXorTest {

    @Test
    public void test() throws Exception {

        assertEquals("100", scenario1.StringXor.stringXor("010", "110"));
        assertEquals("010010", scenario1.StringXor.stringXor("111000", "101010"));
        assertEquals("0", scenario1.StringXor.stringXor("1", "1"));
        assertEquals("0101", scenario1.StringXor.stringXor("0101", "0000"));

    }

}