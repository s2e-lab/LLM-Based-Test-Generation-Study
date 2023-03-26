Here's the source code for the FindMaxTest class:

```
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {

    @Test
    void testFindMaxWithNullList() {
        assertNull(FindMax.findMax(null));
    }

    @Test
    void testFindMaxWithEmptyList() {
        assertNull(FindMax.findMax(Arrays.asList()));
    }

    @Test
    void testFindMaxWithOneWord() {
        List<String> words = Arrays.asList("hello");
        assertEquals("hello", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWords() {
        List<String> words = Arrays.asList("hello", "world", "java", "programming");
        assertEquals("programming", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndSameUniqueChars() {
        List<String> words = Arrays.asList("hello", "world", "java", "programming", "python");
        assertEquals("programming", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndSameUniqueCharsAndSameLexOrder() {
        List<String> words = Arrays.asList("hello", "world", "java", "programming", "python", "pear");
        assertEquals("pear", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndSameUniqueCharsAndDifferentLexOrder() {
        List<String> words = Arrays.asList("hello", "world", "java", "programming", "pear", "python");
        assertEquals("pear", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndAllSameUniqueChars() {
        List<String> words = Arrays.asList("hello", "world", "java", "programming", "pear", "python", "qwerty");
        assertEquals("programming", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndAllDifferentUniqueChars() {
        List<String> words = Arrays.asList("hello", "world", "java", "programming", "pear", "python", "qwerty", "zxcvbnm");
        assertEquals("zxcvbnm", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndOneEmptyWord() {
        List<String> words = Arrays.asList("hello", "world", "", "programming", "pear", "python", "qwerty", "zxcvbnm");
        assertEquals("programming", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndAllEmptyWords() {
        List<String> words = Arrays.asList("", "", "", "", "");
        assertEquals("", FindMax.findMax(words));
    }
}
```

This test class contains ten unit test cases for the `findMax` method of the `FindMax` class. The test cases cover different scenarios, such as null or empty input lists, lists with one or multiple words, words with different numbers of unique characters, and words with the same number of unique characters but different lexicographical order. The `assertEquals` method is used to compare the expected output with the actual output of the `findMax` method.