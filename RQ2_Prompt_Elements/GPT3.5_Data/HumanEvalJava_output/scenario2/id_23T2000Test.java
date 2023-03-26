Here's the code for the StrlenTest class:

```
package scenario2;

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
        assertEquals(7, Strlen.strlen("héllo!"));
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

This test class contains ten unit test cases for the `Strlen.strlen()` method. Each test case tests a different aspect of the method's behavior, such as handling empty strings, strings with special characters, and null strings. The `@Test` annotation is used to mark each test method, and the `assertEquals()` method is used to check the expected result against the actual result returned by the `Strlen.strlen()` method. The `assertThrows()` method is used to test that the method correctly throws a `NullPointerException` when given a null string.