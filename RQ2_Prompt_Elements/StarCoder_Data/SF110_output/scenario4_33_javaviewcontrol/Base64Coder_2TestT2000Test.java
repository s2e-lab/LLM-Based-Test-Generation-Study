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
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 5);
        assertEquals("AQIDBAU=", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode2() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 10);
        assertEquals("AQIDBAUG", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode3() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 11);
        assertEquals("AQIDBAUGBw==", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode4() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 12);
        assertEquals("AQIDBAUGBwg=", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode5() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 13);
        assertEquals("AQIDBAUGBwgJ", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode6() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 14);
        assertEquals("AQIDBAUGBwgJCg==", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode7() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 15);
        assertEquals("AQIDBAUGBwgJCQg==", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode8() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 16);
        assertEquals("AQIDBAUGBwgJCQk=", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode9() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 17);
        assertEquals("AQIDBAUGBwgJCQkL", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode10() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 18);
        assertEquals("AQIDBAUGBwgJCQkLDA==", new String(out));
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64CoderTest {
		
    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 5);
        assertEquals("AQIDBAU=", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode2() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 10);
        assertEquals("AQIDBAUG", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
    @Test
    void testEncode3() throws Exception {
        byte[] in = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] out = Base64Coder.encode(in, 11);
        assertEquals("AQIDBAUGBw==", new String(out));
    }

    /**
    * Test case for {@link Base64Coder#encode(byte[], int)}.
    * It encodes a byte array into Base64 format.
    * No blanks or line breaks are inserted.
    * @throws Exception if an error occurs.
    */
   