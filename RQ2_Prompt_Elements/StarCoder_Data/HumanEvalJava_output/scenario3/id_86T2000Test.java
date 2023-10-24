// AntiShuffleTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {

    /**
     * Test case for the {@link AntiShuffle#antiShuffle(String)} method.
     *
     * <p>Test Case:
     * <li>Input: "Hi"
     * <li>Expected Output: "Hi"
     */
    @Test
    void testAntiShuffle1() {
        String s = "Hi";
        String expected = "Hi";
        assertEquals(expected, AntiShuffle.antiShuffle(s));
    }

    /**
     * Test case for the {@link AntiShuffle#antiShuffle(String)} method.
     *
     * <p>Test Case:
     * <li>Input: "hello"
     * <li>Expected Output: "ehllo"
     */
    @Test
    void testAntiShuffle2() {
        String s = "hello";
        String expected = "ehllo";
        assertEquals(expected, AntiShuffle.antiShuffle(s));
    }

    /**
     * Test case for the {@link AntiShuffle#antiShuffle(String)} method.
     *
     * <p>Test Case:
     * <li>Input: "number"
     * <li>Expected Output: "bemnru"
     */
    @Test
    void testAntiShuffle3() {
        String s = "number";
        String expected = "bemnru";
        assertEquals(expected, AntiShuffle.antiShuffle(s));
    }

    /**
     * Test case for the {@link AntiShuffle#antiShuffle(String)} method.
     *
     * <p>Test Case:
     * <li>Input: "abcd"
     * <li>Expected Output: "abcd"
     */
    @Test
    void testAntiShuffle4() {
        String s = "abcd";
        String expected = "abcd";
        assertEquals(expected, AntiShuffle.antiShuffle(s));
    }

    /**
     * Test case for the {@link AntiShuffle#antiShuffle(String)} method.
     *
     * <p>Test Case:
     * <li>Input: "Hello World!!!"
     * <li>Expected Output: "Hello !!!Wdlor"
     */
    @Test
    void testAntiShuffle5() {
        String s = "Hello World!!!";
        String expected = "Hello !!!Wdlor";
        assertEquals(expected, AntiShuffle.antiShuffle(s));
    }

    /**
     * Test case for the {@link AntiShuffle#antiShuffle(String)} method.
     *
     * <p>Test Case:
     * <li>Input: ""
     * <li>Expected Output: ""
     */
    @Test
    void testAntiShuffle6() {
        String s = "";
        String expected = "";
        assertEquals(expected, AntiShuffle.antiShuffle(s));
    }

    /**
     * Test case for the {@link AntiShuffle#antiShuffle(String)} method.
     *
     * <p>Test Case:
     * <li>Input: "Hi. My name is Mister Robot. How are you?"
     * <li>Expected Output: ".Hi My aemn is Meirst .Rboot How aer ?ouy"
     */
    @Test
    void testAntiShuffle7() {
        String s = "Hi. My name is Mister Robot. How are you?";
        String expected = ".Hi My aemn is Meirst .Rboot How aer ?ouy";
        assertEquals(expected, AntiShuffle.antiShuffle(s));
    }

    /**
     * Test case for the {@link AntiShuffle#antiShuffle(String)} method.
     *
     * <p>Test Case:
     * <li>Input: "Hi. My name is Mister Robot. How are you? I am fine."
     * <li>Expected Output: ".Hi My aemn is Meirst .Rboot How aer ?ouy I amf"
     */
    @Test
    void testAntiShuffle8() {
        String s = "Hi. My name is Mister Robot. How are you? I am fine.";
        String expected = ".Hi My aemn is Meirst .Rboot How aer ?ouy I amf";
        assertEquals(expected, AntiShuffle.antiShuffle(s));
    }

    /**
     * Test case for the {@link AntiShuffle#antiShuffle(String)} method.
     *
     * <p>Test Case:
     * <li>Input: "Hi. My name is Mister Robot. How are you? I am fine. Thank you."
     * <li>Expected Output: ".Hi My aemn is Meirst .Rboot How aer ?ouy I amf .Tkyou"
     */
    @Test
    void testAntiShuffle9() {
        String s = "Hi. My name is Mister Robot. How are you? I am fine. Thank you.";
        String expected = ".Hi My aemn is Meirst .Rboot How aer ?ouy I amf .Tkyou";
        assertEquals(expected, AntiShuffle.antiShuffle(s));
    }

    /**
     * Test case for the {@link AntiShuffle#antiShuffle(String)} method.
     *
     * <p>Test Case:
     * <li>Input: "Hi. My name is Mister Robot. How are you? I am fine. Thank you. I am fine."
     * <li>Expected Output: ".Hi My aemn is Meirst .Rboot How aer ?ouy I amf .Tkyou I amf"
     */
    @Test
    void testAntiShuffle10() {
        String s = "Hi. My name is Mister Robot. How are you? I am fine. Thank you. I am fine.";
        String expected = ".Hi My aemn is Meirst .Rboot How aer ?ouy I amf .Tkyou I amf";
        assertEquals(expected, AntiShuffle.antiShuffle(s));
    }
}
