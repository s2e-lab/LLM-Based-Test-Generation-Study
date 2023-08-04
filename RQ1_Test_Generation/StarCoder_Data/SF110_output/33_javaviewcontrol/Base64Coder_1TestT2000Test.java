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
    * Test case 1.
    */
    @Test
    void testEncode01() {
        byte[] in = { 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AA==", new String(out));
    }

    /**
    * Test case 2.
    */
    @Test
    void testEncode02() {
        byte[] in = { 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAA=", new String(out));
    }

    /**
    * Test case 3.
    */
    @Test
    void testEncode03() {
        byte[] in = { 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 4.
    */
    @Test
    void testEncode04() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 5.
    */
    @Test
    void testEncode05() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 6.
    */
    @Test
    void testEncode06() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 7.
    */
    @Test
    void testEncode07() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 8.
    */
    @Test
    void testEncode08() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 9.
    */
    @Test
    void testEncode09() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 10.
    */
    @Test
    void testEncode10() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }
}
// end class Base64Coder_1Test


// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_2Test {
		
    /**
    * Test case 1.
    */
    @Test
    void testEncode01() {
        byte[] in = { 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AA==", new String(out));
    }

    /**
    * Test case 2.
    */
    @Test
    void testEncode02() {
        byte[] in = { 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAA=", new String(out));
    }

    /**
    * Test case 3.
    */
    @Test
    void testEncode03() {
        byte[] in = { 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 4.
    */
    @Test
    void testEncode04() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 5.
    */
    @Test
    void testEncode05() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 6.
    */
    @Test
    void testEncode06() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 7.
    */
    @Test
    void testEncode07() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 8.
    */
    @Test
    void testEncode08() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 9.
    */
    @Test
    void testEncode09() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }

    /**
    * Test case 10.
    */
    @Test
    void testEncode10() {
        byte[] in = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        char[] out = Base64Coder.encode(in);
        assertEquals("AAAA", new String(out));
    }
}
// end class Base64Coder_2Test


// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_3Test {
		
    /**
    * Test case 1.
    */
    @Test
    void testEncode01() {
        byte[] in