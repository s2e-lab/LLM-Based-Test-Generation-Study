// WordsInSentenceTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains ten unit test cases for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {

    /**
    * Test case for {@link WordsInSentence#wordsInSentence(String)} with parameter sentence = "This is a test".
    */
    @Test
    void testWordsInSentence01() {
        String sentence = "This is a test";
        String expected = "is";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link WordsInSentence#wordsInSentence(String)} with parameter sentence = "lets go for swimming".
    */
    @Test
    void testWordsInSentence02() {
        String sentence = "lets go for swimming";
        String expected = "go for";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link WordsInSentence#wordsInSentence(String)} with parameter sentence = "there is no place available here".
    */
    @Test
    void testWordsInSentence03() {
        String sentence = "there is no place available here";
        String expected = "there is no place";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link WordsInSentence#wordsInSentence(String)} with parameter sentence = "Hi I am Hussein".
    */
    @Test
    void testWordsInSentence04() {
        String sentence = "Hi I am Hussein";
        String expected = "Hi am Hussein";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link WordsInSentence#wordsInSentence(String)} with parameter sentence = "go for it".
    */
    @Test
    void testWordsInSentence05() {
        String sentence = "go for it";
        String expected = "go for it";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link WordsInSentence#wordsInSentence(String)} with parameter sentence = "here".
    */
    @Test
    void testWordsInSentence06() {
        String sentence = "here";
        String expected = "";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link WordsInSentence#wordsInSentence(String)} with parameter sentence = "here is".
    */
    @Test
    void testWordsInSentence07() {
        String sentence = "here is";
        String expected = "is";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link WordsInSentence#wordsInSentence(String)} with parameter sentence = "here is a".
    */
    @Test
    void testWordsInSentence08() {
        String sentence = "here is a";
        String expected = "is a";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link WordsInSentence#wordsInSentence(String)} with parameter sentence = "here is a test".
    */
    @Test
    void testWordsInSentence09() {
        String sentence = "here is a test";
        String expected = "is a";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link WordsInSentence#wordsInSentence(String)} with parameter sentence = "here is a test case".
    */
    @Test
    void testWordsInSentence10() {
        String sentence = "here is a test case";
        String expected = "is a";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }
}
