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

class MiniRomanToInt {

    public static int miniRomanToInt(String miniRoman) {
        int result = 0;
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
        for (int i = 0; i < symbols.length; i++) {
            while (miniRoman.startsWith(symbols[i])) {
                result += values[i];
                miniRoman = miniRoman.substring(symbols[i].length());
            }
        }
        return result;
    }
}

// MiniRomanToIntTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MiniRomanToInt}.
* It contains ten unit test cases for the {@link MiniRomanToInt#miniRomanToInt(String)} method.
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

class RomanToInt {

    public static int romanToInt(String roman) {
        int result = 0;
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
        for (int i = 0; i < symbols.length; i++) {
            while (roman.startsWith(symbols[i])) {
                result += values[i];
                roman = roman.substring(symbols[i].length());
            }
        }
        return result;
    }
}

// RomanToIntTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RomanToInt}.
* It contains ten unit test cases for the {@link RomanToInt#romanToInt(String)} method.
*/
class RomanToIntTest {
		
		@Test
		void testRomanToInt() {
				assertEquals(1, RomanToInt.romanToInt("i"));
				assertEquals(2, RomanToInt.romanToInt("ii"));
				assertEquals(3, RomanToInt.romanToInt("iii"));
				assertEquals(4, RomanToInt.romanToInt("iv"));
				assertEquals(5, RomanToInt.romanToInt("v"));
				assertEquals(6, RomanToInt.romanToInt("vi"));
				assertEquals(7, RomanToInt.romanToInt("vii"));
				assertEquals(8, RomanToInt.romanToInt("viii"));
				assertEquals(9, RomanToInt.romanToInt("ix"));
				assertEquals(10, RomanToInt.romanToInt("x"));
		}
}

// RomanToMiniRoman.java
package scenario1;

class RomanToMiniRoman {

    public static String romanToMiniRoman(String roman) {
        String result = "";
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
        for (int i = 0; i < symbols.length; i++) {
            while (roman.startsWith(symbols[i])) {
                result += symbols[i];
                roman = roman.substring(symbols[i].length());
            }
        }
        return result;
    }
}

// RomanToMiniRomanTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RomanToMiniRoman}.
* It contains ten unit test cases for the {@link RomanToMiniRoman#romanToMiniRoman(String)} method.
*/
class RomanToMiniRomanTest {
		
		@Test
		void testRomanToMiniRoman() {
				assertEquals("i", RomanToMiniRoman.romanToMiniRoman("i"));
				assertEquals("ii", RomanToMiniRoman.romanToMiniRoman("ii"));
				assertEquals("iii", RomanToMiniRoman.romanToMiniRoman("iii"));
				assertEquals("iv", RomanToMiniRoman.romanToMiniRoman("iv"));
				assertEquals("v", RomanToMiniRoman.romanToMiniRoman("v"));
				assertEquals("vi", RomanToMiniRoman.romanToMiniRoman("vi"));
				assertEquals("vii", RomanToMiniRoman.romanToMiniRoman("vii"));
				assertEquals("viii", RomanToMiniRoman.romanToMiniRoman("viii"));
				assertEquals("ix", RomanToMiniRoman.romanToMiniRoman("ix"));
				assertEquals("x", RomanToMiniRoman.romanToMiniRoman("x"));
		}
}