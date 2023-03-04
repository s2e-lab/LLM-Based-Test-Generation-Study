// DigitsumTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {

	@Test
	void testDigitSum_emptyString() {
		assertEquals(0, Digitsum.digitSum(""));
	}
	
	@Test
	void testDigitSum_abAB() {
		assertEquals(131, Digitsum.digitSum("abAB"));
	}
	
	@Test
	void testDigitSum_abcCd() {
		assertEquals(67, Digitsum.digitSum("abcCd"));
	}
	
	@Test
	void testDigitSum_helloE() {
		assertEquals(69, Digitsum.digitSum("helloE"));
	}
	
	@Test
	void testDigitSum_woArBld() {
		assertEquals(131, Digitsum.digitSum("woArBld"));
	}
	
	@Test
	void testDigitSum_aAaaaXa() {
		assertEquals(153, Digitsum.digitSum("aAaaaXa"));
	}
	
	@Test
	void testDigitSum_HowAreYou() {
		assertEquals(151, Digitsum.digitSum(" How are yOu?"));
	}
	
	@Test
	void testDigitSum_YouAreVerySmart() {
		assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
	}
	
	@Test
	void testDigitSum_allUpperCase() {
		assertEquals(846, Digitsum.digitSum("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
	
	@Test
	void testDigitSum_allLowerCase() {
		assertEquals(0, Digitsum.digitSum("abcdefghijklmnopqrstuvwxyz"));
	}
}