Here's the code for the SelectWordsTest class with ten unit test cases for the selectWords method:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SelectWords}.
 * It contains ten unit test cases for the {@link SelectWords#selectWords(String, int)} method.
 */
class SelectWordsTest {

    @Test
    void testSelectWordsWithEmptyString() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("", 2);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithNoWordsWithNConsonants() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("hello world", 4);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithOneWordWithNConsonants() {
        List<Object> expected = Arrays.asList("world");
        List<Object> actual = SelectWords.selectWords("hello world", 5);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithMultipleWordsWithNConsonants() {
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = SelectWords.selectWords("hello world", 2);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithAllWordsWithNConsonants() {
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = SelectWords.selectWords("hello world", 1);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithNoConsonants() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("aeiou", 2);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithAllConsonants() {
        List<Object> expected = Arrays.asList("xyz", "qwrty");
        List<Object> actual = SelectWords.selectWords("xyz qwrty", 5);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithMixedConsonantsAndVowels() {
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = SelectWords.selectWords("hello world", 3);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithUpperCaseConsonants() {
        List<Object> expected = Arrays.asList("WORLD");
        List<Object> actual = SelectWords.selectWords("HELLO WORLD", 5);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithMixedCaseConsonantsAndVowels() {
        List<Object> expected = Arrays.asList("Hello", "World");
        List<Object> actual = SelectWords.selectWords("Hello World", 3);
        assertEquals(expected, actual);
    }
}
```