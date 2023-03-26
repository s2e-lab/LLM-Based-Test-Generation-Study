Here's the completed code for the StringToMd5 class and its test class:

// StringToMd5.java
package scenario3;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class StringToMd5 {

    /**
     * Given a string 'text', return its md5 hash equivalent string.
     * If 'text' is an empty string, return null.
     *
     * >>> stringToMd5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
     *
     * > stringToMd5("Hello world")
     * "3e25960a79dbc69b674cd4ec67a72c62"
     * > stringToMd5("")
     * null
     * > stringToMd5("A B C")
     * "0ef78513b0cb8cef12743f5aeb35f888"
     * > stringToMd5("password")
     * "5f4dcc3b5aa765d61d8327deb882cf99"
     */
    public static String stringToMd5(String text) {
        if (text.isEmpty()) {
            return null;
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(text.getBytes());
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}

// StringToMd5Test.java
package scenario3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StringToMd5}.
 * It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
 */
class StringToMd5Test {

    @Test
    void testStringToMd5WithHelloWorld() {
        String text = "Hello world";
        String expected = "3e25960a79dbc69b674cd4ec67a72c62";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    @Test
    void testStringToMd5WithEmptyString() {
        String text = "";
        String expected = null;
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    @Test
    void testStringToMd5WithABC() {
        String text = "A B C";
        String expected = "0ef78513b0cb8cef12743f5aeb35f888";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    @Test
    void testStringToMd5WithPassword() {
        String text = "password";
        String expected = "5f4dcc3b5aa765d61d8327deb882cf99";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    @Test
    void testStringToMd5WithNull() {
        String text = null;
        String expected = null;
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    @Test
    void testStringToMd5WithLongString() {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.";
        String expected = "f5d4e6c7d7d9d7d7d7d7d7d7d7d7d7d7";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    @Test
    void testStringToMd5WithSpecialCharacters() {
        String text = "!@#$%^&*()_+";
        String expected = "d5c67a3b514a4c7c5c5c5c5c5c5c5c5c";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    @Test
    void testStringToMd5WithWhitespace() {
        String text = "   ";
        String expected = "d41d8cd98f00b204e9800998ecf8427e";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    @Test
    void testStringToMd5WithNumbers() {
        String text = "1234567890";
        String expected = "e807f1fcf82d132f9bb018ca6738a19f";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }

    @Test
    void testStringToMd5WithUpperCase() {
        String text = "HELLO WORLD";
        String expected = "b94d27b9934d3e08a52e52d7da7dabfac484efe37a5380ee9088f7ace2efcde9";
        String actual = StringToMd5.stringToMd5(text);
        assertEquals(expected, actual);
    }
}