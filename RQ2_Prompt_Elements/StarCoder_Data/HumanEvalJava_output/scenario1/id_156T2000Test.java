// IntToMiniRomanTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains ten unit test cases for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {

    @Test
    void testIntToMiniRoman() {
        assertEquals("m", IntToMiniRoman.intToMiniRoman(1000));
        assertEquals("cm", IntToMiniRoman.intToMiniRoman(900));
        assertEquals("d", IntToMiniRoman.intToMiniRoman(500));
        assertEquals("cd", IntToMiniRoman.intToMiniRoman(400));
        assertEquals("c", IntToMiniRoman.intToMiniRoman(100));
        assertEquals("xc", IntToMiniRoman.intToMiniRoman(90));
        assertEquals("l", IntToMiniRoman.intToMiniRoman(50));
        assertEquals("xl", IntToMiniRoman.intToMiniRoman(40));
        assertEquals("x", IntToMiniRoman.intToMiniRoman(10));
        assertEquals("ix", IntToMiniRoman.intToMiniRoman(9));
        assertEquals("v", IntToMiniRoman.intToMiniRoman(5));
        assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
        assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
    }
}
