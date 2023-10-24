// WordsInSentenceTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains ten unit test cases for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {

    /**
     * Test case for the {@link WordsInSentence#wordsInSentence(String)} method.
     */
    @Test
    void testWordsInSentence() {
        assertEquals("a", WordsInSentence.wordsInSentence("a"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("b a"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a b a"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("b a a"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a b a"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a b a a"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a b a"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence.wordsInSentence("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a b"));
        assertEquals("a b", WordsInSentence