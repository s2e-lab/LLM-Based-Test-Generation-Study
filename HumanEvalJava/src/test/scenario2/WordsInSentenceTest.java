package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsInSentenceTest {

    @Test
    public void test() throws Exception {

        assertEquals("is", scenario2.WordsInSentence.wordsInSentence("This is a test"));
        assertEquals("go for", scenario2.WordsInSentence.wordsInSentence("lets go for swimming"));
        assertEquals("there is no place", scenario2.WordsInSentence.wordsInSentence("there is no place available here"));
        assertEquals("Hi am Hussein", scenario2.WordsInSentence.wordsInSentence("Hi I am Hussein"));
        assertEquals("go for it", scenario2.WordsInSentence.wordsInSentence("go for it"));
        assertEquals("", scenario2.WordsInSentence.wordsInSentence("here"));
        assertEquals("is", scenario2.WordsInSentence.wordsInSentence("here is"));

    }

}