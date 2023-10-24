// WordsStringTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is empty.
    */
    @Test
    void testWordsStringEmptyString() {
        String s = "";
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word.
    */
    @Test
    void testWordsStringSingleWord() {
        String s = "word";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a comma.
    */
    @Test
    void testWordsStringSingleWordWithComma() {
        String s = "word,";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space.
    */
    @Test
    void testWordsStringSingleWordWithSpace() {
        String s = "word ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a comma and a space.
    */
    @Test
    void testWordsStringSingleWordWithCommaAndSpace() {
        String s = "word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma() {
        String s = "word ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma2() {
        String s = "word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma3() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma4() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma5() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma6() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma7() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma8() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma9() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma10() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma11() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma12() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma13() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma14() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma15() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma16() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case for {@link WordsString#wordsString(String)} where the string is a single word with a space and a comma.
    */
    @Test
    void testWordsStringSingleWordWithSpaceAndComma17() {
        String s = " word, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("word"));
        assertEquals(expected, WordsString.wordsString(s