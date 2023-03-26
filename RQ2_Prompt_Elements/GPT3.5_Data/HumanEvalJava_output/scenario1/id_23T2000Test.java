Here's the completed code for the `StrlenTest` class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Strlen}.
 * It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
 */
class StrlenTest {

    @Test
    void testEmptyString() {
        assertEquals(0, Strlen.strlen(""));
    }

    @Test
    void testSingleCharacterString() {
        assertEquals(1, Strlen.strlen("a"));
    }

    @Test
    void testMultipleCharacterString() {
        assertEquals(5, Strlen.strlen("hello"));
    }

    @Test
    void testStringWithSpaces() {
        assertEquals(11, Strlen.strlen("hello world"));
    }

    @Test
    void testStringWithSpecialCharacters() {
        assertEquals(6, Strlen.strlen("héllo!"));
    }

    @Test
    void testStringWithNumbers() {
        assertEquals(4, Strlen.strlen("1234"));
    }

    @Test
    void testStringWithTabs() {
        assertEquals(6, Strlen.strlen("hello\t"));
    }

    @Test
    void testStringWithNewlines() {
        assertEquals(6, Strlen.strlen("hello\n"));
    }

    @Test
    void testStringWithCarriageReturns() {
        assertEquals(6, Strlen.strlen("hello\r"));
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> Strlen.strlen(null));
    }
}
```

This class contains ten test methods, each of which tests a different aspect of the `Strlen.strlen()` method. The first nine tests check various types of input strings, while the last test checks that the method correctly throws a `NullPointerException` when given a `null` input.