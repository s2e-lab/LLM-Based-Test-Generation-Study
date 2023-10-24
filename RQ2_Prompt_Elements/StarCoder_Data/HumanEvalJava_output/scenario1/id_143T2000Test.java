// WordsInSentenceTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains ten unit test cases for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {

    @Test
    void testWordsInSentence() {
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World!"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World?"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World."));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World,"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World;"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World:"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World-"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World_"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World/"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World\\"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World\""));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World'"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World("));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World)"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World["));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World]"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World{"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World}"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World<"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World>"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World|"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World*"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World+"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World="));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World$"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World#"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World@"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World%"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World^"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World&"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World~"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World`"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence("Hello World"));
        assertEquals("Hello World", WordsInSentence.wordsInSentence