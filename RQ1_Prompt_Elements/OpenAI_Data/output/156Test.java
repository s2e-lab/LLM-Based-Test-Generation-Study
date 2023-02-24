// IntToMiniRomanTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link IntToMiniRoman}.
 * It contains ten test cases for the {@link scenario1.IntToMiniRoman#intToMiniRoman()} method.
 */
class IntToMiniRomanTest {
		


    @Test
    void testIntToMiniRoman() {
        assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
        assertEquals("ii", IntToMiniRoman.intToMiniRoman(2));
        assertEquals("iii", IntToMiniRoman.intToMiniRoman(3));
        assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
        assertEquals("v", IntToMiniRoman.intToMiniRoman(5));
        assertEquals("vi", IntToMiniRoman.intToMiniRoman(6));
        assertEquals("vii", IntToMiniRoman.intToMiniRoman(7));
        assertEquals("viii", IntToMiniRoman.intToMiniRoman(8));
        assertEquals("ix", IntToMiniRoman.intToMiniRoman(9));
        assertEquals("x", IntToMiniRoman.intToMiniRoman(10));
    }
}

// MiniRomanToInt.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class MiniRomanToInt {

    public static int miniRomanToInt(String roman) {
        int result = 0;
        String[] symbols = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        for (int i = 0; i < symbols.length; i++) {
            while (roman.startsWith(symbols[i])) {
                result += values[i];
                roman = roman.substring(symbols[i].length());
            }
        }
        return result;
    }
}

// MiniRomanToIntTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link MiniRomanToInt}.
 * It contains ten test cases for the {@link scenario1.MiniRomanToInt#miniRomanToInt()} method.
 */
class MiniRomanToIntTest {

    @Test
    void testMiniRomanToInt() {
        assertEquals(1, MiniRomanToInt.miniRomanToInt("i"));
        assertEquals(2, MiniRomanToInt.miniRomanToInt("ii"));
        assertEquals(3, MiniRomanToInt.miniRomanToInt("iii"));
        assertEquals(4, MiniRomanToInt.miniRomanToInt("iv"));
        assertEquals(5, MiniRomanToInt.miniRomanToInt("v"));
        assertEquals(6, MiniRomanToInt.miniRomanToInt("vi"));
        assertEquals(7, MiniRomanToInt.miniRomanToInt("vii"));
        assertEquals(8, MiniRomanToInt.miniRomanToInt("viii"));
        assertEquals(9, MiniRomanToInt.miniRomanToInt("ix"));
        assertEquals(10, MiniRomanToInt.miniRomanToInt("x"));
    }
}

// RomanToInt.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class RomanToInt {

    public static int romanToInt(String roman) {
        int result = 0;
        String[] symbols = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        for (int i = 0; i < symbols.length; i++) {
            while (roman.startsWith(symbols[i])) {
                result += values[i];
                roman = roman.substring(sy