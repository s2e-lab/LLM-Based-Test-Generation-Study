package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class WordsInSentenceTest {
    @Test
    void testWordsInSentence() {
        assertEquals("is", WordsInSentence.wordsInSentence("This is a test"));
        assertEquals("go for", WordsInSentence.wordsInSentence("lets go for swimming"));
        assertEquals("there is no place", WordsInSentence.wordsInSentence("there is no place available here"));
        assertEquals("Hi am Hussein", WordsInSentence.wordsInSentence("Hi I am Hussein"));
        assertEquals("go for it", WordsInSentence.wordsInSentence("go for it"));
        assertEquals("", WordsInSentence.wordsInSentence("here"));
        assertEquals("is", WordsInSentence.wordsInSentence("here is"));
        assertEquals("", WordsInSentence.wordsInSentence(""));
        assertEquals("", WordsInSentence.wordsInSentence(" "));
        assertEquals("", WordsInSentence.wordsInSentence("  "));
    }
}