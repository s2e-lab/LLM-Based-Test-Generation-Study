// StringToMd5Test.java
package scenario2;

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
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     * It tests the case when 'text' is an empty string.
     */
    @Test
    void testStringToMd5EmptyString() {
        String text = "";
        String expected = null;
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     * It tests the case when 'text' is a string with only one character.
     */
    @Test
    void testStringToMd5SingleCharacter() {
        String text = "a";
        String expected = "0cc175b9c0f1b6a831c399e269772661";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     * It tests the case when 'text' is a string with two characters.
     */
    @Test
    void testStringToMd5TwoCharacters() {
        String text = "ab";
        String expected = "187ef4436122d1cc2f40dc2b92f0eba0";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     * It tests the case when 'text' is a string with three characters.
     */
    @Test
    void testStringToMd5ThreeCharacters() {
        String text = "abc";
        String expected = "900150983cd24fb0d6963f7d28e17f72";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     * It tests the case when 'text' is a string with four characters.
     */
    @Test
    void testStringToMd5FourCharacters() {
        String text = "abcd";
        String expected = "e2fc714c4727ee9395f324cd2e7f331f";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     * It tests the case when 'text' is a string with five characters.
     */
    @Test
    void testStringToMd5FiveCharacters() {
        String text = "abcde";
        String expected = "ab56b4d92b40713acc5af89985d4b786";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     * It tests the case when 'text' is a string with six characters.
     */
    @Test
    void testStringToMd5SixCharacters() {
        String text = "abcdef";
        String expected = "e80b5017098950fc58aad83c8c14978e";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     * It tests the case when 'text' is a string with seven characters.
     */
    @Test
    void testStringToMd5SevenCharacters() {
        String text = "abcdefg";
        String expected = "d0364e317246d53d0481c790c80b6fe2";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     * It tests the case when 'text' is a string with eight characters.
     */
    @Test
    void testStringToMd5EightCharacters() {
        String text = "abcdefgh";
        String expected = "f96b697d7cb7938d525a2f31aaf161d0";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     * It tests the case when 'text' is a string with nine characters.
     */
    @Test
    void testStringToMd5NineCharacters() {
        String text = "abcdefghi";
        String expected = "c3fcd3d76192e4007dfb496cca67e13b";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     * It tests the case when 'text' is a string with ten characters.
     */
    @Test
    void testStringToMd5TenCharacters() {
        String text = "abcdefghij";
        String expected = "9b09ffa71b942fcb27635fbcd5b0e944";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }
}
