// DigitsumTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {

    /**
     * Test case for {@link Digitsum#digitSum(String)}
     * with an empty string.
     */
    @Test
    void testDigitSumEmptyString() {
        assertEquals(0, Digitsum.digitSum(""));
    }

    /**
     * Test case for {@link Digitsum#digitSum(String)}
     * with a string containing only upper case letters.
     */
    @Test
    void testDigitSumUpperCaseLetters() {
        assertEquals(131, Digitsum.digitSum("abAB"));
    }

    /**
     * Test case for {@link Digitsum#digitSum(String)}
     * with a string containing only lower case letters.
     */
    @Test
    void testDigitSumLowerCaseLetters() {
        assertEquals(67, Digitsum.digitSum("abcCd"));
    }

    /**
     * Test case for {@link Digitsum#digitSum(String)}
     * with a string containing both upper and lower case letters.
     */
    @Test
    void testDigitSumMixedCaseLetters() {
        assertEquals(153, Digitsum.digitSum("aAaaaXa"));
    }

    /**
     * Test case for {@link Digitsum#digitSum(String)}
     * with a string containing a space.
     */
    @Test
    void testDigitSumSpace() {
        assertEquals(151, Digitsum.digitSum(" How are yOu?"));
    }

    /**
     * Test case for {@link Digitsum#digitSum(String)}
     * with a string containing a punctuation mark.
     */
    @Test
    void testDigitSumPunctuation() {
        assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
    }
}
