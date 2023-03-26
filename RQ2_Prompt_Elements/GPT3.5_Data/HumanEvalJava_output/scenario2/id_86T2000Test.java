Here's the code for the `AntiShuffleTest` class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AntiShuffleTest {

    @Test
    void testAntiShuffleEmptyString() {
        String s = "";
        String expected = "";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleSingleWord() {
        String s = "hello";
        String expected = "ehllo";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleMultipleWords() {
        String s = "hello world";
        String expected = "ehllo dlorw";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleRepeatedWords() {
        String s = "hello hello";
        String expected = "ehllo ehllo";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleMixedCase() {
        String s = "Hello World";
        String expected = "Hllooe Wdlor";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShufflePunctuation() {
        String s = "hello, world!";
        String expected = "ehllo, dlrow!";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleNumbers() {
        String s = "12345";
        String expected = "12345";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleMixedCharacters() {
        String s = "h3llo w0rld";
        String expected = "h3llo dlorw0";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleLeadingSpaces() {
        String s = "  hello world";
        String expected = "  ehllo dlorw";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleTrailingSpaces() {
        String s = "hello world  ";
        String expected = "ehllo dlorw  ";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }
}
```

This test class contains ten test cases for the `antiShuffle` method of the `AntiShuffle` class. Each test case tests a different aspect of the method's behavior, such as handling empty strings, mixed case strings, and strings with punctuation. The `assertEquals` method is used to compare the expected output of the method with the actual output.