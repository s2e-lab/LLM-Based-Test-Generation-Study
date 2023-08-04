// StringToMd5Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     *
     * The input string is "Hello world".
     * The expected output is "3e25960a79dbc69b674cd4ec67a72c62".
     */
    @Test
    void testStringToMd51() {
        String text = "Hello world";
        String expected = "3e25960a79dbc69b674cd4ec67a72c62";
        assertEquals(expected, StringToMd5.stringToMd5(text));
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     *
     * The input string is an empty string.
     * The expected output is null.
     */
    @Test
    void testStringToMd52() {
        String text = "";
        assertNull(StringToMd5.stringToMd5(text));
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     *
     * The input string is "A B C".
     * The expected output is "0ef78513b0cb8cef12743f5aeb35f888".
     */
    @Test
    void testStringToMd53() {
        String text = "A B C";
        String expected = "0ef78513b0cb8cef12743f5aeb35f888";
        assertEquals(expected, StringToMd5.stringToMd5(text));
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     *
     * The input string is "password".
     * The expected output is "5f4dcc3b5aa765d61d8327deb882cf99".
     */
    @Test
    void testStringToMd54() {
        String text = "password";
        String expected = "5f4dcc3b5aa765d61d8327deb882cf99";
        assertEquals(expected, StringToMd5.stringToMd5(text));
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     *
     * The input string is "123456789".
     * The expected output is "e10adc3949ba59abbe56e057f20f883e".
     */
    @Test
    void testStringToMd55() {
        String text = "123456789";
        String expected = "e10adc3949ba59abbe56e057f20f883e";
        assertEquals(expected, StringToMd5.stringToMd5(text));
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     *
     * The input string is "1234567890".
     * The expected output is "57edf4a22be3c955ac49da2e2107b67a".
     */
    @Test
    void testStringToMd56() {
        String text = "1234567890";
        String expected = "57edf4a22be3c955ac49da2e2107b67a";
        assertEquals(expected, StringToMd5.stringToMd5(text));
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     *
     * The input string is "12345678901234567890123456789012345678901234567890123456789012345678901234567890".
     * The expected output is "57edf4a22be3c955ac49da2e2107b67a".
     */
    @Test
    void testStringToMd57() {
        String text = "12345678901234567890123456789012345678901234567890123456789012345678901234567890";
        String expected = "57edf4a22be3c955ac49da2e2107b67a";
        assertEquals(expected, StringToMd5.stringToMd5(text));
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     *
     * The input string is "123456789012345678901234567890123456789012345678901234567890123456789012345678901".
     * The expected output is "57edf4a22be3c955ac49da2e2107b67a".
     */
    @Test
    void testStringToMd58() {
        String text = "123456789012345678901234567890123456789012345678901234567890123456789012345678901";
        String expected = "57edf4a22be3c955ac49da2e2107b67a";
        assertEquals(expected, StringToMd5.stringToMd5(text));
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     *
     * The input string is "1234567890123456789012345678901234567890123456789012345678901234567890123456789012".
     * The expected output is "57edf4a22be3c955ac49da2e2107b67a".
     */
    @Test
    void testStringToMd59() {
        String text = "1234567890123456789012345678901234567890123456789012345678901234567890123456789012";
        String expected = "57edf4a22be3c955ac49da2e2107b67a";
        assertEquals(expected, StringToMd5.stringToMd5(text));
    }

    /**
     * Test case for the {@link StringToMd5#stringToMd5(String)} method.
     *
     * The input string is "12345678901234567890123456789012345678901234567890123456789012345678901234567890123".
     * The expected output is "57edf4a22be3c955ac49da2e2107b67a".
     */
    @Test
    void testStringToMd510() {
        String text = "12345678901234567890123456789012345678901234567890123456789012345678901234567890123";
        String expected