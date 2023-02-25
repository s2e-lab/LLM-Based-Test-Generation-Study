package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordsInSentenceTest {

    @Test
    public void test() throws Exception{

        assertEquals("is", scenario1.WordsInSentence.wordsInSentence("This is a test"));
		assertEquals("go for", scenario1.WordsInSentence.wordsInSentence("lets go for swimming"));
		assertEquals("there is no place", scenario1.WordsInSentence.wordsInSentence("there is no place available here"));
		assertEquals("Hi am Hussein", scenario1.WordsInSentence.wordsInSentence("Hi I am Hussein"));
		assertEquals("go for it", scenario1.WordsInSentence.wordsInSentence("go for it"));
		assertEquals("", scenario1.WordsInSentence.wordsInSentence("here"));
		assertEquals("is", scenario1.WordsInSentence.wordsInSentence("here is"));
		
    }

}