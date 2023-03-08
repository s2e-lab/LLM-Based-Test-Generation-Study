package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitsumTest {

    @Test
    public void test() throws Exception {

        assertEquals(0, scenario2.Digitsum.digitSum(""));
        assertEquals(131, scenario2.Digitsum.digitSum("abAB"));
        assertEquals(67, scenario2.Digitsum.digitSum("abcCd"));
        assertEquals(69, scenario2.Digitsum.digitSum("helloE"));
        assertEquals(131, scenario2.Digitsum.digitSum("woArBld"));
        assertEquals(153, scenario2.Digitsum.digitSum("aAaaaXa"));
        assertEquals(151, scenario2.Digitsum.digitSum(" How are yOu?"));
        assertEquals(327, scenario2.Digitsum.digitSum("You arE Very Smart"));

    }

}