// AntiShuffleTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link AntiShuffle}.
 * It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
 */
class AntiShuffleTest {

    @Test
    void testEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSingleWord() {
        String input = "Hi";
        String expectedOutput = "Hi";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSingleWordSorted() {
        String input = "hello";
        String expectedOutput = "ehllo";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMultipleWords() {
        String input = "Hello World!!!";
        String expectedOutput = "Hello !!!Wdlor";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMultipleWordsSorted() {
        String input = "Hi. My name is Mister Robot. How are you?";
        String expectedOutput = ".Hi My aemn is Meirst .Rboot How aer ?ouy";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testAllCharactersSame() {
        String input = "aaaaa";
        String expectedOutput = "aaaaa";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testAllCharactersDifferent() {
        String input = "abcde";
        String expectedOutput = "abcde";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMixedCase() {
        String input = "HeLLo WoRLd";
        String expectedOutput = "HLWdoo eLLr";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testNumbers() {
        String input = "12345";
        String expectedOutput = "12345";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSpecialCharacters() {
        String input = "!@#$%";
        String expectedOutput = "!@#$%";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }
}