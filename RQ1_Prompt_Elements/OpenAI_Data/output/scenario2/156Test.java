// IntToMiniRomanTest.java
package scenario2;


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