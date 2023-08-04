// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {

    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode() throws IllegalArgumentException {
        String s = "YWJjZGVmZw==";
        byte[] expected = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode2() throws IllegalArgumentException {
        String s = "YWJjZGVmZw";
        byte[] expected = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode3() throws IllegalArgumentException {
        String s = "YWJjZGVmZ2g=";
        byte[] expected = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode4() throws IllegalArgumentException {
        String s = "YWJjZGVmZ2g";
        byte[] expected = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode5() throws IllegalArgumentException {
        String s = "YWJjZGVmZ2";
        byte[] expected = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode6() throws IllegalArgumentException {
        String s = "YWJjZGVmZ";
        byte[] expected = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode7() throws IllegalArgumentException {
        String s = "YWJjZGVm";
        byte[] expected = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode8() throws IllegalArgumentException {
        String s = "YWJjZGV";
        byte[] expected = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode9() throws IllegalArgumentException {
        String s = "YWJjZG";
        byte[] expected = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode10() throws IllegalArgumentException {
        String s = "YWJjZ";
        byte[] expected = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70 };
        byte[] actual = Base64Coder.decode(s);
        assertArrayEquals(expected, actual);
    }
}

// Base64Coder_6Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_6Test {
		
    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if