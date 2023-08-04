// WordsStringTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {

    /** Test case for the {@link WordsString#wordsString(String)} method with a string of words separated by commas. */
    @Test
    void testWordsString1() {
        String s = "Hi, my name is John";
        List<Object> expected = List.of("Hi", "my", "name", "is", "John");
        assertEquals(expected, WordsString.wordsString(s));
    }

    /** Test case for the {@link WordsString#wordsString(String)} method with a string of words separated by spaces. */
    @Test
    void testWordsString2() {
        String s = "One, two, three, four, five, six";
        List<Object> expected = List.of("One", "two", "three", "four", "five", "six");
        assertEquals(expected, WordsString.wordsString(s));
    }

    /** Test case for the {@link WordsString#wordsString(String)} method with a string of words separated by commas and spaces. */
    @Test
    void testWordsString3() {
        String s = "Hi, my name";
        List<Object> expected = List.of("Hi", "my", "name");
        assertEquals(expected, WordsString.wordsString(s));
    }

    /** Test case for the {@link WordsString#wordsString(String)} method with a string of words separated by commas and spaces. */
    @Test
    void testWordsString4() {
        String s = "One,, two, three, four, five, six,";
        List<Object> expected = List.of("One", "two", "three", "four", "five", "six");
        assertEquals(expected, WordsString.wordsString(s));
    }

    /** Test case for the {@link WordsString#wordsString(String)} method with an empty string. */
    @Test
    void testWordsString5() {
        String s = "";
        List<Object> expected = List.of();
        assertEquals(expected, WordsString.wordsString(s));
    }

    /** Test case for the {@link WordsString#wordsString(String)} method with a string of words separated by commas and spaces. */
    @Test
    void testWordsString6() {
        String s = "ahmed     , gamal";
        List<Object> expected = List.of("ahmed", "gamal");
        assertEquals(expected, WordsString.wordsString(s));
    }
}
