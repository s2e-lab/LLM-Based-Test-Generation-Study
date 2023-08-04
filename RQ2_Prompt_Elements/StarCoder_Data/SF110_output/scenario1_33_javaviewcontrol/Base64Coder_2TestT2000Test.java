// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {

    @Test
    void testEncode() {
        byte[] in = new byte[0];
        char[] out = Base64Coder.encode(in, in.length);
        assertEquals(0, out.length);
        in = new byte[] { 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AA==", new String(out));
        in = new byte[] { 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAA=", new String(out));
        in = new byte[] { 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        out = Base64Coder.encode(in, in.length);
        assertEquals("AAAA", new String(out));
        in = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,