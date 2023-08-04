// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {

    /**
     * Test case for encoding a zero length array.
     */
    @Test
    void testEncodeZeroLength() {
        char[] result = Base64Coder.encode(new byte[0], 0);
        assertEquals(0, result.length);
    }

    /**
     * Test case for encoding a single byte array.
     */
    @Test
    void testEncodeOneByte() {
        char[] result = Base64Coder.encode(new byte[] { 1 }, 1);
        assertEquals(4, result.length);
        assertEquals('AQ==', new String(result));
    }

    /**
     * Test case for encoding a two byte array.
     */
    @Test
    void testEncodeTwoBytes() {
        char[] result = Base64Coder.encode(new byte[] { 1, 2 }, 2);
        assertEquals(4, result.length);
        assertEquals('AQI=', new String(result));
    }

    /**
     * Test case for encoding a three byte array.
     */
    @Test
    void testEncodeThreeBytes() {
        char[] result = Base64Coder.encode(new byte[] { 1, 2, 3 }, 3);
        assertEquals(4, result.length);
        assertEquals('AQID', new String(result));
    }

    /**
     * Test case for encoding a four byte array.
     */
    @Test
    void testEncodeFourBytes() {
        char[] result = Base64Coder.encode(new byte[] { 1, 2, 3, 4 }, 4);
        assertEquals(8, result.length);
        assertEquals('AQIDBA==', new String(result));
    }

    /**
     * Test case for encoding a five byte array.
     */
    @Test
    void testEncodeFiveBytes() {
        char[] result = Base64Coder.encode(new byte[] { 1, 2, 3, 4, 5 }, 5);
        assertEquals(8, result.length);
        assertEquals('AQIDBAU=', new String(result));
    }

    /**
     * Test case for encoding a six byte array.
     */
    @Test
    void testEncodeSixBytes() {
        char[] result = Base64Coder.encode(new byte[] { 1, 2, 3, 4, 5, 6 }, 6);
        assertEquals(8, result.length);
        assertEquals('AQIDBAUG', new String(result));
    }

    /**
     * Test case for encoding a seven byte array.
     */
    @Test
    void testEncodeSevenBytes() {
        char[] result = Base64Coder.encode(new byte[] { 1, 2, 3, 4, 5, 6, 7 }, 7);
        assertEquals(12, result.length);
        assertEquals('AQIDBAUGBwg=', new String(result));
    }

    /**
     * Test case for encoding an array of length eight.
     */
    @Test
    void testEncodeEightBytes() {
        char[] result = Base64Coder.encode(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 8);
        assertEquals(16, result.length);
        assertEquals('AQIDBAUGBwgJ', new String(result));
    }

    /**
     * Test case for encoding an array of length nine.
     */
    @Test
    void testEncodeNineBytes() {
        char[] result = Base64Coder.encode(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 9);
        assertEquals(16, result.length);
        assertEquals('AQIDBAUGBwgJCg==', new String(result));
    }

    /**
     * Test case for encoding an array of length ten.
     */
    @Test
    void testEncodeTenBytes() {
        char[] result = Base64Coder.encode(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 10);
        assertEquals(20, result.length);
        assertEquals('AQIDBAUGBwgJCg==', new String(result));
    }
}
