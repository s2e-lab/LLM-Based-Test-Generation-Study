// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {

    /**
     * Test case for the {@link Base64Coder#decode(String)} method.
     * It decodes a valid Base64 encoded string.
     */
    @Test
    void testDecode() {
        String s = "YWJjZGVmZw==";
        byte[] expected = { 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
     * Test case for the {@link Base64Coder#decode(String)} method.
     * It decodes a valid Base64 encoded string.
     */
    @Test
    void testDecode2() {
        String s = "YWJjZGVmZw";
        byte[] expected = { 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
     * Test case for the {@link Base64Coder#decode(String)} method.
     * It decodes a valid Base64 encoded string.
     */
    @Test
    void testDecode3() {
        String s = "YWJjZGVmZ2g=";
        byte[] expected = { 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 103, 10 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
     * Test case for the {@link Base64Coder#decode(String)} method.
     * It decodes a valid Base64 encoded string.
     */
    @Test
    void testDecode4() {
        String s = "YWJjZGVmZ2g";
        byte[] expected = { 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 103 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
     * Test case for the {@link Base64Coder#decode(String)} method.
     * It decodes a valid Base64 encoded string.
     */
    @Test
    void testDecode5() {
        String s = "YWJjZGVmZ2";
        byte[] expected = { 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 102 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
     * Test case for the {@link Base64Coder#decode(String)} method.
     * It decodes a valid Base64 encoded string.
     */
    @Test
    void testDecode6() {
        String s = "YWJjZGVmZ";
        byte[] expected = { 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 101 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
     * Test case for the {@link Base64Coder#decode(String)} method.
     * It decodes a valid Base64 encoded string.
     */
    @Test
    void testDecode7() {
        String s = "YWJjZGVm";
        byte[] expected = { 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 100 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
     * Test case for the {@link Base64Coder#decode(String)} method.
     * It decodes a valid Base64 encoded string.
     */
    @Test
    void testDecode8() {
        String s = "YWJjZGV";
        byte[] expected = { 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 99 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
     * Test case for the {@link Base64Coder#decode(String)} method.
     * It decodes a valid Base64 encoded string.
     */
    @Test
    void testDecode9() {
        String s = "YWJjZG";
        byte[] expected = { 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 98 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
     * Test case for the {@link Base64Coder#decode(String)} method.
     * It decodes a valid Base64 encoded string.
     */