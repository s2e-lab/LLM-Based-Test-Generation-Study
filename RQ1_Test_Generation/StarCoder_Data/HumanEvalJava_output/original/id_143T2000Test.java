// WordsInSentenceTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains ten unit test cases for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {

    /**
    * Test case number: 1
    * Test case values: "This is a test"
    */
    @Test
    void test1() {
        String expected = "is";
        String actual = WordsInSentence.wordsInSentence("This is a test");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 2
    * Test case values: "lets go for swimming"
    */
    @Test
    void test2() {
        String expected = "go for";
        String actual = WordsInSentence.wordsInSentence("lets go for swimming");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 3
    * Test case values: "there is no place available here"
    */
    @Test
    void test3() {
        String expected = "there is no place";
        String actual = WordsInSentence.wordsInSentence("there is no place available here");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 4
    * Test case values: "Hi I am Hussein"
    */
    @Test
    void test4() {
        String expected = "Hi am Hussein";
        String actual = WordsInSentence.wordsInSentence("Hi I am Hussein");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 5
    * Test case values: "go for it"
    */
    @Test
    void test5() {
        String expected = "go for it";
        String actual = WordsInSentence.wordsInSentence("go for it");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 6
    * Test case values: "here"
    */
    @Test
    void test6() {
        String expected = "";
        String actual = WordsInSentence.wordsInSentence("here");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 7
    * Test case values: "here is"
    */
    @Test
    void test7() {
        String expected = "is";
        String actual = WordsInSentence.wordsInSentence("here is");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 8
    * Test case values: "here is a"
    */
    @Test
    void test8() {
        String expected = "is a";
        String actual = WordsInSentence.wordsInSentence("here is a");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 9
    * Test case values: "here is a test"
    */
    @Test
    void test9() {
        String expected = "is a test";
        String actual = WordsInSentence.wordsInSentence("here is a test");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 10
    * Test case values: "here is a test of"
    */
    @Test
    void test10() {
        String expected = "is a test of";
        String actual = WordsInSentence.wordsInSentence("here is a test of");
        assertEquals(expected, actual);
    }
}
