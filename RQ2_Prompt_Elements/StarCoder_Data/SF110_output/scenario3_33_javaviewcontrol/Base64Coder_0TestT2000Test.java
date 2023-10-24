// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {

    /**
     * Test case number: 0
     * Test case values: "any carnal pleasure."
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3VyZS4="
     */
    @Test
    void testEncodeString0() {
        String s = "any carnal pleasure.";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3VyZS4=", result);
    }

    /**
     * Test case number: 1
     * Test case values: "any carnal pleasure"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3VyZQ=="
     */
    @Test
    void testEncodeString1() {
        String s = "any carnal pleasure";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3VyZQ==", result);
    }

    /**
     * Test case number: 2
     * Test case values: "any carnal pleasur"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3Vy"
     */
    @Test
    void testEncodeString2() {
        String s = "any carnal pleasur";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3Vy", result);
    }

    /**
     * Test case number: 3
     * Test case values: "any carnal pleasu"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3U="
     */
    @Test
    void testEncodeString3() {
        String s = "any carnal pleasu";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3U=", result);
    }

    /**
     * Test case number: 4
     * Test case values: "any carnal pleas"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhcw=="
     */
    @Test
    void testEncodeString4() {
        String s = "any carnal pleas";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhcw==", result);
    }

    /**
     * Test case number: 5
     * Test case values: "any carnal pleasu"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3U="
     */
    @Test
    void testEncodeString5() {
        String s = "any carnal pleasu";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3U=", result);
    }

    /**
     * Test case number: 6
     * Test case values: "any carnal pleasur"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3Vy"
     */
    @Test
    void testEncodeString6() {
        String s = "any carnal pleasur";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3Vy", result);
    }

    /**
     * Test case number: 7
     * Test case values: "any carnal pleasure."
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3VyZS4="
     */
    @Test
    void testEncodeString7() {
        String s = "any carnal pleasure.";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3VyZS4=", result);
    }

    /**
     * Test case number: 8
     * Test case values: "any carnal pleasure"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3VyZQ=="
     */
    @Test
    void testEncodeString8() {
        String s = "any carnal pleasure";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3VyZQ==", result);
    }

    /**
     * Test case number: 9
     * Test case values: "any carnal pleasur"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3Vy"
     */
    @Test
    void testEncodeString9() {
        String s = "any carnal pleasur";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3Vy", result);
    }
}

// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_1Test {
		
    /**
     * Test case number: 0
     * Test case values: "any carnal pleasure."
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3VyZS4="
     */
    @Test
    void testEncodeString0() {
        String s = "any carnal pleasure.";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3VyZS4=", result);
    }

    /**
     * Test case number: 1
     * Test case values: "any carnal pleasure"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3VyZQ=="
     */
    @Test
    void testEncodeString1() {
        String s = "any carnal pleasure";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3VyZQ==", result);
    }

    /**
     * Test case number: 2
     * Test case values: "any carnal pleasur"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3Vy"
     */
    @Test
    void testEncodeString2() {
        String s = "any carnal pleasur";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3Vy", result);
    }

    /**
     * Test case number: 3
     * Test case values: "any carnal pleasu"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3U="
     */
    @Test
    void testEncodeString3() {
        String s = "any carnal pleasu";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3U=", result);
    }

    /**
     * Test case number: 4
     * Test case values: "any carnal pleas"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhcw=="
     */
    @Test
    void testEncodeString4() {
        String s = "any carnal pleas";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhcw==", result);
    }

    /**
     * Test case number: 5
     * Test case values: "any carnal pleasu"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3U="
     */
    @Test
    void testEncodeString5() {
        String s = "any carnal pleasu";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3U=", result);
    }

    /**
     * Test case number: 6
     * Test case values: "any carnal pleasur"
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3Vy"
     */
    @Test
    void testEncodeString6() {
        String s = "any carnal pleasur";
        String result = Base64Coder.encodeString(s);
        assertEquals("YW55IGNhcm5hbCBwbGVhc3Vy", result);
    }

    /**
     * Test case number: 7
     * Test case values: "any carnal pleasure."
     * Expected outcome: "YW55IGNhcm5hbCBwbGVhc3VyZS4="
     */
    @Test
    void testEncodeString7() {
       