// CountUpperTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {

    /** Test case for an empty string. */
    @Test
    void testEmptyString() {
        assertEquals(0, CountUpper.countUpper(""));
    }

    /** Test case for a string with no uppercase vowels. */
    @Test
    void testNoVowels() {
        assertEquals(0, CountUpper.countUpper("abcdefg"));
    }

    /** Test case for a string with only uppercase vowels. */
    @Test
    void testOnlyVowels() {
        assertEquals(2, CountUpper.countUpper("EEEE"));
    }

    /** Test case for a string with some uppercase vowels. */
    @Test
    void testSomeVowels() {
        assertEquals(1, CountUpper.countUpper("aBCdEf"));
    }

    /** Test case for a string with all uppercase vowels. */
    @Test
    void testAllVowels() {
        assertEquals(4, CountUpper.countUpper("AEIOU"));
    }

    /** Test case for a string with all lowercase vowels. */
    @Test
    void testAllLowercaseVowels() {
        assertEquals(0, CountUpper.countUpper("aeiou"));
    }

    /** Test case for a string with all lowercase vowels. */
    @Test
    void testAllLowercaseVowels2() {
        assertEquals(0, CountUpper.countUpper("aeiouAEIOU"));
    }

    /** Test case for a string with all lowercase vowels. */
    @Test
    void testAllLowercaseVowels3() {
        assertEquals(0, CountUpper.countUpper("aeiouAEIOUaeiou"));
    }

    /** Test case for a string with all lowercase vowels. */
    @Test
    void testAllLowercaseVowels4() {
        assertEquals(0, CountUpper.countUpper("aeiouAEIOUaeiouAEIOU"));
    }

    /** Test case for a string with all lowercase vowels. */
    @Test
    void testAllLowercaseVowels5() {
        assertEquals(0, CountUpper.countUpper("aeiouAEIOUaeiouAEIOUaeiou"));
    }

    /** Test case for a string with all lowercase vowels. */
    @Test
    void testAllLowercaseVowels6() {
        assertEquals(0, CountUpper.countUpper("aeiouAEIOUaeiouAEIOUaeiouAEIOU"));
    }

    /** Test case for a string with all lowercase vowels. */
    @Test
    void testAllLowercaseVowels7() {
        assertEquals(0, CountUpper.countUpper("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiou"));
    }

    /** Test case for a string with all lowercase vowels. */
    @Test
    void testAllLowercaseVowels8() {
        assertEquals(0, CountUpper.countUpper("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU"));
    }

    /** Test case for a string with all lowercase vowels. */
    @Test
    void testAllLowercaseVowels9() {
        assertEquals(0, CountUpper.countUpper("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiou"));
    }

    /** Test case for a string with all lowercase vowels. */
    @Test
    void testAllLowercaseVowels10() {
        assertEquals(0, CountUpper.countUpper("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU"));
    }
}
