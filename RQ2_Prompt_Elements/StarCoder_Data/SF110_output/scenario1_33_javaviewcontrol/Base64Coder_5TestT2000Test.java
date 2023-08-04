// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {

    @Test
    void testDecode() {
        char[] in = "YWJjZGVmZw==".toCharArray();
        byte[] out = Base64Coder.decode(in);
        assertEquals(6, out.length);
        assertEquals(74, out[0]);
        assertEquals(101, out[1]);
        assertEquals(108, out[2]);
        assertEquals(108, out[3]);
        assertEquals(111, out[4]);
        assertEquals(32, out[5]);
    }

    @Test
    void testDecode2() {
        char[] in = "YWJjZGVmZ2g=".toCharArray();
        byte[] out = Base64Coder.decode(in);
        assertEquals(7, out.length);
        assertEquals(74, out[0]);
        assertEquals(101, out[1]);
        assertEquals(108, out[2]);
        assertEquals(108, out[3]);
        assertEquals(111, out[4]);
        assertEquals(32, out[5]);
        assertEquals(102, out[6]);
    }

    @Test
    void testDecode3() {
        char[] in = "YWJjZGVmZ2hp".toCharArray();
        byte[] out = Base64Coder.decode(in);
        assertEquals(6, out.length);
        assertEquals(74, out[0]);
        assertEquals(101, out[1]);
        assertEquals(108, out[2]);
        assertEquals(108, out[3]);
        assertEquals(111, out[4]);
        assertEquals(32, out[5]);
    }

    @Test
    void testDecode4() {
        char[] in = "YWJjZGVmZ2hpag==".toCharArray();
        byte[] out = Base64Coder.decode(in);
        assertEquals(7, out.length);
        assertEquals(74, out[0]);
        assertEquals(101, out[1]);
        assertEquals(108, out[2]);
        assertEquals(108, out[3]);
        assertEquals(111, out[4]);
        assertEquals(32, out[5]);
        assertEquals(98, out[6]);
    }

    @Test
    void testDecode5() {
        char[] in = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXow".toCharArray();
        byte[] out = Base64Coder.decode(in);
        assertEquals(16, out.length);
        assertEquals(74, out[0]);
        assertEquals(101, out[1]);
        assertEquals(108, out[2]);
        assertEquals(108, out[3]);
        assertEquals(111, out[4]);
        assertEquals(32, out[5]);
        assertEquals(98, out[6]);
        assertEquals(111, out[7]);
        assertEquals(111, out[8]);
        assertEquals(107, out[9]);
        assertEquals(115, out[10]);
        assertEquals(116, out[11]);
        assertEquals(114, out[12]);
        assertEquals(105, out[13]);
        assertEquals(110, out[14]);
        assertEquals(103, out[15]);
    }

    @Test
    void testDecode6() {
        char[] in = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXo=".toCharArray();
        byte[] out = Base64Coder.decode(in);
        assertEquals(15, out.length);
        assertEquals(74, out[0]);
        assertEquals(101, out[1]);
        assertEquals(108, out[2]);
        assertEquals(108, out[3]);
        assertEquals(111, out[4]);
        assertEquals(32, out[5]);
        assertEquals(98, out[6]);
        assertEquals(111, out[7]);
        assertEquals(111, out[8]);
        assertEquals(107, out[9]);
        assertEquals(115, out[10]);
        assertEquals(116, out[11]);
        assertEquals(114, out[12]);
        assertEquals(105, out[13]);
        assertEquals(110, out[14]);
    }

    @Test
    void testDecode7() {
        char[] in = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXo=".toCharArray();
        byte[] out = Base64Coder.decode(in);
        assertEquals(15, out.length);
        assertEquals(74, out[0]);
        assertEquals(101, out[1]);
        assertEquals(108, out[2]);
        assertEquals(108, out[3]);
        assertEquals(111, out[4]);
        assertEquals(32, out[5]);
        assertEquals(98, out[6]);
        assertEquals(111, out[7]);
        assertEquals(111, out[8]);
        assertEquals(107, out[9]);
        assertEquals(115, out[10]);
        assertEquals(116, out[11]);
        assertEquals(114, out[12]);
        assertEquals(105, out[13]);
        assertEquals(110, out[14]);
    }

    @Test
    void testDecode8() {
        char[] in = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXo=".toCharArray();
        byte[] out = Base64Coder.decode(in);
        assertEquals(15, out.length);
        assertEquals(74, out[0]);
        assertEquals(101, out[1]);
        assertEquals(108, out[2]);
        assertEquals(108, out[3]);
        assertEquals(111, out[4]);
        assertEquals(32, out[5]);
        assertEquals(98, out[6]);
        assertEquals(111, out[7]);
        assertEquals(111, out[8]);
        assertEquals(107, out[9]);
        assertEquals(115, out[10]);
        assertEquals(116, out[11]);
        assertEquals(114, out[12]);
        assertEquals(105, out[13]);
        assertEquals(110, out[14]);
    }

    @Test
    void testDecode9() {
        char[] in = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXo=".toCharArray();
        byte[] out = Base64Coder.decode(in);
        assertEquals(15, out.length);
        assertEquals(74, out[0]);
        assertEquals(101, out[1]);
        assertEquals(108, out[2]);
        assertEquals(108, out[3]);
        assertEquals(111, out[4]);
        assertEquals(32, out[5]);
        assertEquals(98, out[6]);
        assertEquals(111, out[7]);
        assertEquals(111, out[8]);
        assertEquals(107, out[9]);
        assertEquals(115, out[10]);
        assertEquals(116, out[11]);
        assertEquals(114, out[12]);
        assertEquals(105, out[13]);
        assertEquals(110, out[14]);
    }

    @Test
    void testDecode10() {
        char[] in = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXo=".toCharArray();
        byte[] out = Base64Coder.decode(in);
        assertEquals(15, out.length);
        assertEquals(74, out[0]);
        assertEquals(101, out[1]);
        assertEquals(108, out[2]);
        assertEquals(108, out[3]);
        assertEquals(111, out[4]);
        assertEquals(32, out[5]);
        assertEquals(98, out[6]);
        assertEquals(111, out[7]);
        assertEquals(111, out[8]);
        assertEquals(107, out[9]);
        assertEquals(115, out[10]);
        assertEquals(116, out[11]);
        assertEquals(114, out[12]);
        assertEquals(105, out[13]);
        assertEquals(110, out[14]);
    }
}
