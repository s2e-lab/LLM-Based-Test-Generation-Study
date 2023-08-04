// StringToMd5Test.java
package original;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {

    /**
     * Test case for an empty string.
     */
    @Test
    void testEmptyString() {
        assertEquals(null, StringToMd5.stringToMd5(""));
    }

    /**
     * Test case for a string with only one character.
     */
    @Test
    void testSingleCharacter() {
        assertEquals("00000000000000000000000000000000", StringToMd5.stringToMd5("A"));
    }

    /**
     * Test case for a string with only two characters.
     */
    @Test
    void testTwoCharacters() {
        assertEquals("0ef78513b0cb8cef12743f5aeb35f888", StringToMd5.stringToMd5("A B"));
    }

    /**
     * Test case for a string with only three characters.
     */
    @Test
    void testThreeCharacters() {
        assertEquals("0ef78513b0cb8cef12743f5aeb35f888", StringToMd5.stringToMd5("A B C"));
    }

    /**
     * Test case for a string with only four characters.
     */
    @Test
    void testFourCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only five characters.
     */
    @Test
    void testFiveCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only six characters.
     */
    @Test
    void testSixCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only seven characters.
     */
    @Test
    void testSevenCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only eight characters.
     */
    @Test
    void testEightCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only nine characters.
     */
    @Test
    void testNineCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only ten characters.
     */
    @Test
    void testTenCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only eleven characters.
     */
    @Test
    void testElevenCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only twelve characters.
     */
    @Test
    void testTwelveCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only thirteen characters.
     */
    @Test
    void testThirteenCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only fourteen characters.
     */
    @Test
    void testFourteenCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only fifteen characters.
     */
    @Test
    void testFifteenCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only sixteen characters.
     */
    @Test
    void testSixteenCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only seventeen characters.
     */
    @Test
    void testSeventeenCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only eighteen characters.
     */
    @Test
    void testEighteenCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only nineteen characters.
     */
    @Test
    void testNineteenCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only twenty characters.
     */
    @Test
    void testTwentyCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only twenty-one characters.
     */
    @Test
    void testTwentyOneCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only twenty-two characters.
     */
    @Test
    void testTwentyTwoCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only twenty-three characters.
     */
    @Test
    void testTwentyThreeCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only twenty-four characters.
     */
    @Test
    void testTwentyFourCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only twenty-five characters.
     */
    @Test
    void testTwentyFiveCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only twenty-six characters.
     */
    @Test
    void testTwentySixCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
    }

    /**
     * Test case for a string with only twenty-seven characters.
     */
    @Test
    void testTwentySevenCharacters() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd