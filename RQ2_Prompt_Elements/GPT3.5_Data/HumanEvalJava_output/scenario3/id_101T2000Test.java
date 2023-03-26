Here's a possible implementation of the `wordsString` method:

```java
import java.util.ArrayList;
import java.util.List;

class WordsString {

    /**
     * * You will be given a string of words separated by commas or spaces. Your task is
     * to split the string into words and return an array of the words.
     *
     * For example:
     * wordsString("Hi, my name is John") == ["Hi", "my", "name", "is", "John"]
     * wordsString("One, two, three, four, five, six") == ["One", "two", "three", "four", "five", "six"]
     *
     * > wordsString("Hi, my name is John")
     * ["Hi", "my", "name", "is", "John"]
     * > wordsString("One, two, three, four, five, six")
     * ["One", "two", "three", "four", "five", "six"]
     * > wordsString("Hi, my name")
     * ["Hi", "my", "name"]
     * > wordsString("One,, two, three, four, five, six,")
     * ["One", "two", "three", "four", "five", "six"]
     * > wordsString("")
     * []
     * > wordsString("ahmed     , gamal")
     * ["ahmed", "gamal"]
     */
    public static List<String> wordsString(String s) {
        List<String> words = new ArrayList<>();
        String[] tokens = s.split("[,\\s]+");
        for (String token : tokens) {
            if (!token.isEmpty()) {
                words.add(token);
            }
        }
        return words;
    }
}
```

And here's a possible implementation of the `WordsStringTest` class:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {

    @Test
    void testEmptyString() {
        List<String> expected = Collections.emptyList();
        List<String> actual = WordsString.wordsString("");
        assertEquals(expected, actual);
    }

    @Test
    void testOneWord() {
        List<String> expected = Arrays.asList("Hello");
        List<String> actual = WordsString.wordsString("Hello");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWords() {
        List<String> expected = Arrays.asList("Hi", "my", "name", "is", "John");
        List<String> actual = WordsString.wordsString("Hi, my name is John");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithExtraSpaces() {
        List<String> expected = Arrays.asList("Hi", "my", "name", "is", "John");
        List<String> actual = WordsString.wordsString("Hi,   my   name   is   John");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithExtraCommas() {
        List<String> expected = Arrays.asList("One", "two", "three", "four", "five", "six");
        List<String> actual = WordsString.wordsString("One,, two, three, four, five, six,");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithExtraSpacesAndCommas() {
        List<String> expected = Arrays.asList("One", "two", "three", "four", "five", "six");
        List<String> actual = WordsString.wordsString("One, , two, three, four, five, six, ");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithOnlyCommas() {
        List<String> expected = Collections.emptyList();
        List<String> actual = WordsString.wordsString(",, , ,,");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithOnlySpaces() {
        List<String> expected = Collections.emptyList();
        List<String> actual = WordsString.wordsString("   ");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithMixedSpacesAndCommas() {
        List<String> expected = Arrays.asList("ahmed", "gamal");
        List<String> actual = WordsString.wordsString("ahmed     , gamal");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithMixedSpacesAndCommasAndQuotes() {
        List<String> expected = Arrays.asList("ahmed", "gamal", "ali");
        List<String> actual = WordsString.wordsString("ahmed     , gamal, \"ali\"");
        assertEquals(expected, actual);
    }
}
```