package scenario2;


import original.WordsInSentence;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordsInSentenceTest {
    @Test
	public void test1() throws Exception {
		assertEquals("is", scenario2.WordsInSentence.wordsInSentence("This is a test"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("go for", scenario2.WordsInSentence.wordsInSentence("lets go for swimming"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("there is no place", scenario2.WordsInSentence.wordsInSentence("there is no place available here"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("Hi am Hussein", scenario2.WordsInSentence.wordsInSentence("Hi I am Hussein"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("go for it", scenario2.WordsInSentence.wordsInSentence("go for it"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("", scenario2.WordsInSentence.wordsInSentence("here"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("is", scenario2.WordsInSentence.wordsInSentence("here is"));
	}

	
}