package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class IntToMiniRomanTest {
    @Test
    void intToMiniRomanTest() {
        assertEquals("xix", IntToMiniRoman.intToMiniRoman(19));
        assertEquals("clii", IntToMiniRoman.intToMiniRoman(152));
        assertEquals("cdxxvi", IntToMiniRoman.intToMiniRoman(426));
        assertEquals("d", IntToMiniRoman.intToMiniRoman(500));
        assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
        assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
        assertEquals("xliii", IntToMiniRoman.intToMiniRoman(43));
        assertEquals("xc", IntToMiniRoman.intToMiniRoman(90));
        assertEquals("xciv", IntToMiniRoman.intToMiniRoman(94));
        assertEquals("dxxxii", IntToMiniRoman.intToMiniRoman(532));
        assertEquals("cm", IntToMiniRoman.intToMiniRoman(900));
        assertEquals("cmxciv", IntToMiniRoman.intToMiniRoman(994));
        assertEquals("m", IntToMiniRoman.intToMiniRoman(1000));
    }
}