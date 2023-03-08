package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntToMiniRomanTest {

    @Test
    public void test() throws Exception {

        assertEquals("xix", scenario1.IntToMiniRoman.intToMiniRoman(19));
        assertEquals("clii", scenario1.IntToMiniRoman.intToMiniRoman(152));
        assertEquals("ccli", scenario1.IntToMiniRoman.intToMiniRoman(251));
        assertEquals("cdxxvi", scenario1.IntToMiniRoman.intToMiniRoman(426));
        assertEquals("d", scenario1.IntToMiniRoman.intToMiniRoman(500));
        assertEquals("i", scenario1.IntToMiniRoman.intToMiniRoman(1));
        assertEquals("iv", scenario1.IntToMiniRoman.intToMiniRoman(4));
        assertEquals("xliii", scenario1.IntToMiniRoman.intToMiniRoman(43));
        assertEquals("xc", scenario1.IntToMiniRoman.intToMiniRoman(90));
        assertEquals("xciv", scenario1.IntToMiniRoman.intToMiniRoman(94));
        assertEquals("dxxxii", scenario1.IntToMiniRoman.intToMiniRoman(532));
        assertEquals("cm", scenario1.IntToMiniRoman.intToMiniRoman(900));
        assertEquals("cmxciv", scenario1.IntToMiniRoman.intToMiniRoman(994));
        assertEquals("m", scenario1.IntToMiniRoman.intToMiniRoman(1000));

    }

}