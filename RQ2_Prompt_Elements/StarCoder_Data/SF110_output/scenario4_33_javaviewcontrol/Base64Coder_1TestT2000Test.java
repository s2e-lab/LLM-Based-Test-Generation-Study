// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_1Test {

    /**
    * Test case for {@link Base64Coder#encode(byte[])}.
    */
    @Test
    void testEncode() {
        byte[] testArray = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] expectedResult = { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' };
        char[] actualResult = Base64Coder.encode(testArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[])}.
    */
    @Test
    void testEncode_1() {
        byte[] testArray = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 };
        char[] expectedResult = { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'B' };
        char[] actualResult = Base64Coder.encode(testArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[])}.
    */
    @Test
    void testEncode_2() {
        byte[] testArray = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02 };
        char[] expectedResult = { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'C' };
        char[] actualResult = Base64Coder.encode(testArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[])}.
    */
    @Test
    void testEncode_3() {
        byte[] testArray = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x03 };
        char[] expectedResult = { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'D' };
        char[] actualResult = Base64Coder.encode(testArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[])}.
    */
    @Test
    void testEncode_4() {
        byte[] testArray = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x04 };
        char[] expectedResult = { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'E' };
        char[] actualResult = Base64Coder.encode(testArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[])}.
    */
    @Test
    void testEncode_5() {
        byte[] testArray = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x05 };
        char[] expectedResult = { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'F' };
        char[] actualResult = Base64Coder.encode(testArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[])}.
    */
    @Test
    void testEncode_6() {
        byte[] testArray = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x06 };
        char[] expectedResult = { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'G' };
        char[] actualResult = Base64Coder.encode(testArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[])}.
    */
    @Test
    void testEncode_7() {
        byte[] testArray = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x07 };
        char[] expectedResult = { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'H' };
        char[] actualResult = Base64Coder.encode(testArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[])}.
    */
    @Test
    void testEncode_8() {
        byte[] testArray = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x08 };
        char[] expectedResult = { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'I' };
        char[] actualResult = Base64Coder.encode(testArray);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[])}.
    */
    @Test
    void testEncode_9()