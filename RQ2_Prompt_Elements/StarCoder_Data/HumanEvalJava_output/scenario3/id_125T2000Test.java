// SplitWordsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {

    /**
    * Test case for {@link SplitWords#splitWords(String)} where the string contains only letters.
    */
    @Test
    void testSplitWords_lettersOnly() {
        assertEquals(SplitWords.splitWords("Hello world!"), "Hello world!");
        assertEquals(SplitWords.splitWords("Hello,world!"), "Hello,world!");
        assertEquals(SplitWords.splitWords("abcdef"), 3);
    }

    /**
    * Test case for {@link SplitWords#splitWords(String)} where the string contains only letters and commas.
    */
    @Test
    void testSplitWords_lettersAndCommas() {
        assertEquals(SplitWords.splitWords("Hello world,!"), "Hello world,!");
        assertEquals(SplitWords.splitWords("Hello,Hello,world !"), "Hello,Hello,world !");
    }

    /**
    * Test case for {@link SplitWords#splitWords(String)} where the string contains only letters and whitespaces.
    */
    @Test
    void testSplitWords_lettersAndWhitespaces() {
        assertEquals(SplitWords.splitWords("Hello world!"), "Hello world!");
        assertEquals(SplitWords.splitWords("Hello,world!"), "Hello,world!");
        assertEquals(SplitWords.splitWords("Hello world,!"), "Hello world,!");
        assertEquals(SplitWords.splitWords("Hello,Hello,world !"), "Hello,Hello,world !");
    }

    /**
    * Test case for {@link SplitWords#splitWords(String)} where the string is empty.
    */
    @Test
    void testSplitWords_empty() {
        assertEquals(SplitWords.splitWords(""), 0);
    }
}
