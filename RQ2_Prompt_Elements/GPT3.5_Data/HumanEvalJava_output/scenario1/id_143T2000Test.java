Here's the code for the test class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordsInSentenceTest {

    @Test
    void testEmptyString() {
        String sentence = "";
        String expected = "";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testNoPrimeWords() {
        String sentence = "This sentence has no prime words";
        String expected = "";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testOnePrimeWord() {
        String sentence = "The quick brown fox jumps over the 7";
        String expected = "7";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testMultiplePrimeWords() {
        String sentence = "The quick brown 2 jumps over the 7";
        String expected = "2 7";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testAllPrimeWords() {
        String sentence = "2 3 5 7 11";
        String expected = "2 3 5 7 11";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedWords() {
        String sentence = "The quick brown 2 jumps over the 3 lazy dogs";
        String expected = "2 3";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleWord() {
        String sentence = "prime";
        String expected = "";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testTwoWords() {
        String sentence = "prime numbers";
        String expected = "";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testLongSentence() {
        String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ut magna eget nunc bibendum malesuada. Nulla facilisi. Sed euismod, sapien vel bibendum bibendum, velit sapien bibendum sapien, vel bibendum sapien sapien vel sapien. Sed vel sapien sapien.";
        String expected = "ipsum dolor amet adipiscing eget malesuada facilisi euismod sapien sapien sapien sapien";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testSpecialCharacters() {
        String sentence = "The quick brown fox jumps over the 7!";
        String expected = "7!";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }
}
```