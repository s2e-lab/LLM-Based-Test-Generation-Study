package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntToMiniRomanTest {

    @Test
    public void test() throws Exception {

        assertEquals("xix", scenario3.IntToMiniRoman.intToMiniRoman(19));
        assertEquals("clii", scenario3.IntToMiniRoman.intToMiniRoman(152));
        assertEquals("ccli", scenario3.IntToMiniRoman.intToMiniRoman(251));
        assertEquals("cdxxvi", scenario3.IntToMiniRoman.intToMiniRoman(426));
        assertEquals("d", scenario3.IntToMiniRoman.intToMiniRoman(500));
        assertEquals("i", scenario3.IntToMiniRoman.intToMiniRoman(1));
        assertEquals("iv", scenario3.IntToMiniRoman.intToMiniRoman(4));
        assertEquals("xliii", scenario3.IntToMiniRoman.intToMiniRoman(43));
        assertEquals("xc", scenario3.IntToMiniRoman.intToMiniRoman(90));
        assertEquals("xciv", scenario3.IntToMiniRoman.intToMiniRoman(94));
        assertEquals("dxxxii", scenario3.IntToMiniRoman.intToMiniRoman(532));
        assertEquals("cm", scenario3.IntToMiniRoman.intToMiniRoman(900));
        assertEquals("cmxciv", scenario3.IntToMiniRoman.intToMiniRoman(994));
        assertEquals("m", scenario3.IntToMiniRoman.intToMiniRoman(1000));

    }

}