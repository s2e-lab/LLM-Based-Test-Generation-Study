// CountUpperTest.java
package original;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link CountUpper}.
 * It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
 */
class CountUpperTest {

    @Test
    void testEmptyString() {
        assertEquals(0, CountUpper.countUpper(""));
    }

    @Test
    void testNoUppercaseVowels() {
        assertEquals(0, CountUpper.countUpper("abcdefg"));
    }

    @Test
    void testNoEvenIndices() {
        assertEquals(0, CountUpper.countUpper("dBBE"));
    }

    @Test
    void testOneUppercaseVowel() {
        assertEquals(1, CountUpper.countUpper("aBCdEf"));
    }

    @Test
    void testTwoUppercaseVowels() {
        assertEquals(2, CountUpper.countUpper("aBCDEfGI"));
    }

    @Test
    void testAllUppercaseVowels() {
        assertEquals(3, CountUpper.countUpper("AEIOUaeiouAEIOU"));
    }

    @Test
    void testAllUppercaseConsonants() {
        assertEquals(0, CountUpper.countUpper("BCDFGHJKLMNPQRSTVWXYZ"));
    }

    @Test
    void testMixedCaseVowels() {
        assertEquals(2, CountUpper.countUpper("aBCdEFGi"));
    }

    @Test
    void testMixedCaseConsonants() {
        assertEquals(0, CountUpper.countUpper("bCDFgHjKLmNPqRstVwXyz"));
    }

    @Test
    void testSpecialCharacters() {
        assertEquals(0, CountUpper.countUpper("!@#$%^&*()_+-=[]{}|;':\",./<>?\\"));
    }
}