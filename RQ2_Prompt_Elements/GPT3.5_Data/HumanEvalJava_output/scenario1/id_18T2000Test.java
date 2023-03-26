Here's the completed code for the `HowManyTimesTest` class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HowManyTimes}.
 * It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
 */
class HowManyTimesTest {

    @Test
    void testEmptyString() {
        assertEquals(0, HowManyTimes.howManyTimes("", "a"));
    }

    @Test
    void testEmptySubstring() {
        assertEquals(0, HowManyTimes.howManyTimes("abc", ""));
    }

    @Test
    void testSubstringNotFound() {
        assertEquals(0, HowManyTimes.howManyTimes("abc", "d"));
    }

    @Test
    void testSubstringFoundOnce() {
        assertEquals(1, HowManyTimes.howManyTimes("abc", "b"));
    }

    @Test
    void testSubstringFoundMultipleTimes() {
        assertEquals(3, HowManyTimes.howManyTimes("abcbcb", "b"));
    }

    @Test
    void testSubstringAtBeginning() {
        assertEquals(1, HowManyTimes.howManyTimes("abc", "a"));
    }

    @Test
    void testSubstringAtEnd() {
        assertEquals(1, HowManyTimes.howManyTimes("abc", "c"));
    }

    @Test
    void testSubstringSameAsInputString() {
        assertEquals(1, HowManyTimes.howManyTimes("abc", "abc"));
    }

    @Test
    void testSubstringOverlapping() {
        assertEquals(2, HowManyTimes.howManyTimes("ababa", "aba"));
    }

    @Test
    void testSubstringWithSpaces() {
        assertEquals(2, HowManyTimes.howManyTimes("a b a b a", "a"));
    }
}
```

This class contains ten test cases for the `howManyTimes` method of the `HowManyTimes` class. Each test case is annotated with the `@Test` annotation, which tells JUnit to run it as a test. The `assertEquals` method is used to check that the actual result of the method matches the expected result.