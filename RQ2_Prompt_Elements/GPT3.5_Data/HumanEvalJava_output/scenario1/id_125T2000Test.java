Here's the completed SplitWordsTest class:

```
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {

    @Test
    void testSplitWordsWithSpaces() {
        String txt = "Hello world";
        Object expected = Arrays.asList("Hello", "world");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    @Test
    void testSplitWordsWithCommas() {
        String txt = "apple,banana,orange";
        Object expected = Arrays.asList("apple", "banana", "orange");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    @Test
    void testSplitWordsWithNoSpacesOrCommas() {
        String txt = "Hello";
        Object expected = 0;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    @Test
    void testSplitWordsWithEmptyString() {
        String txt = "";
        Object expected = 0;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    @Test
    void testSplitWordsWithNullString() {
        String txt = null;
        assertThrows(NullPointerException.class, () -> {
            SplitWords.splitWords(txt);
        });
    }

    @Test
    void testSplitWordsWithNumbers() {
        String txt = "123 456";
        Object expected = Arrays.asList("123", "456");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    @Test
    void testSplitWordsWithSpecialCharacters() {
        String txt = "!@#$%^&*()_+";
        Object expected = 0;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    @Test
    void testSplitWordsWithMixedCharacters() {
        String txt = "Hello,123 world!@#";
        Object expected = Arrays.asList("Hello", "123", "world!@#");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    @Test
    void testSplitWordsWithUpperCase() {
        String txt = "HELLO WORLD";
        Object expected = Arrays.asList("HELLO", "WORLD");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    @Test
    void testSplitWordsWithLowerCase() {
        String txt = "hello world";
        Object expected = Arrays.asList("hello", "world");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
}
```