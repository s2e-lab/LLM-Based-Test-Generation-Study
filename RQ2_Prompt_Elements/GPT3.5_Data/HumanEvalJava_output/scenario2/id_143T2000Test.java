Here's the source code for the test class:

```
package scenario2;

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
    void testOneWord() {
        String sentence = "hello";
        String expected = "";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testTwoWords() {
        String sentence = "hello world";
        String expected = "world";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testThreeWords() {
        String sentence = "the cat sat";
        String expected = "the sat";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testFourWords() {
        String sentence = "the quick brown fox";
        String expected = "the fox";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testFiveWords() {
        String sentence = "the quick brown fox jumps";
        String expected = "the fox";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testSixWords() {
        String sentence = "the quick brown fox jumps over";
        String expected = "the fox over";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testSevenWords() {
        String sentence = "the quick brown fox jumps over the";
        String expected = "the fox over";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testEightWords() {
        String sentence = "the quick brown fox jumps over the lazy";
        String expected = "the fox over";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testNineWords() {
        String sentence = "the quick brown fox jumps over the lazy dog";
        String expected = "the fox dog";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testTenWords() {
        String sentence = "the quick brown fox jumps over the lazy dog and";
        String expected = "the fox dog";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }
}
```

This test class contains ten test cases that cover different scenarios for the `wordsInSentence` method. Each test case has a descriptive name that explains what it's testing. The `@Test` annotation is used to mark each test method, and the `assertEquals` method is used to compare the expected result with the actual result returned by the `wordsInSentence` method.