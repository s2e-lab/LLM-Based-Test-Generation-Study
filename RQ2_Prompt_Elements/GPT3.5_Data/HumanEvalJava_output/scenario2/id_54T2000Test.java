Here's the source code for the `SameCharsTest` class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SameCharsTest {

    @Test
    void testSameCharsWithSameWords() {
        assertTrue(SameChars.sameChars("hello", "hello"));
    }

    @Test
    void testSameCharsWithDifferentWords() {
        assertFalse(SameChars.sameChars("hello", "world"));
    }

    @Test
    void testSameCharsWithEmptyStrings() {
        assertTrue(SameChars.sameChars("", ""));
    }

    @Test
    void testSameCharsWithOneEmptyString() {
        assertFalse(SameChars.sameChars("hello", ""));
    }

    @Test
    void testSameCharsWithOneLetterWords() {
        assertTrue(SameChars.sameChars("a", "a"));
    }

    @Test
    void testSameCharsWithOneLetterWordsDifferent() {
        assertFalse(SameChars.sameChars("a", "b"));
    }

    @Test
    void testSameCharsWithMixedCaseWords() {
        assertTrue(SameChars.sameChars("Hello", "hElLo"));
    }

    @Test
    void testSameCharsWithPunctuation() {
        assertTrue(SameChars.sameChars("hello, world!", "dlrow !olleh,"));
    }

    @Test
    void testSameCharsWithNumbers() {
        assertTrue(SameChars.sameChars("12345", "54321"));
    }

    @Test
    void testSameCharsWithSpecialCharacters() {
        assertTrue(SameChars.sameChars("!@#$%", "%$#@!"));
    }
}
```

This class contains ten test methods that test the `sameChars` method of the `SameChars` class with different inputs. Each test method uses the `assertTrue` or `assertFalse` method to assert whether the `sameChars` method returns the expected result.