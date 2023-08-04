// SplitWordsTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {

    /**
     * Test case for the {@link SplitWords#splitWords(String)} method.
     * It tests the case when the text contains whitespaces.
     */
    @Test
    void testSplitWords1() {
        String txt = "Hello World";
        Object expected = Arrays.asList("Hello", "World");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    /**
     * Test case for the {@link SplitWords#splitWords(String)} method.
     * It tests the case when the text contains commas.
     */
    @Test
    void testSplitWords2() {
        String txt = "Hello,World";
        Object expected = Arrays.asList("Hello", "World");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    /**
     * Test case for the {@link SplitWords#splitWords(String)} method.
     * It tests the case when the text contains no whitespaces and no commas.
     */
    @Test
    void testSplitWords3() {
        String txt = "Hello";
        Object expected = 1;
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    /**
     * Test case for the {@link SplitWords#splitWords(String)} method.
     * It tests the case when the text contains whitespaces and commas.
     */
    @Test
    void testSplitWords4() {
        String txt = "Hello, World";
        Object expected = Arrays.asList("Hello", "World");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    /**
     * Test case for the {@link SplitWords#splitWords(String)} method.
     * It tests the case when the text contains whitespaces and commas.
     */
    @Test
    void testSplitWords5() {
        String txt = "Hello, World,";
        Object expected = Arrays.asList("Hello", "World");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    /**
     * Test case for the {@link SplitWords#splitWords(String)} method.
     * It tests the case when the text contains whitespaces and commas.
     */
    @Test
    void testSplitWords6() {
        String txt = "Hello, World, ";
        Object expected = Arrays.asList("Hello", "World");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    /**
     * Test case for the {@link SplitWords#splitWords(String)} method.
     * It tests the case when the text contains whitespaces and commas.
     */
    @Test
    void testSplitWords7() {
        String txt = "Hello, World,  ";
        Object expected = Arrays.asList("Hello", "World");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    /**
     * Test case for the {@link SplitWords#splitWords(String)} method.
     * It tests the case when the text contains whitespaces and commas.
     */
    @Test
    void testSplitWords8() {
        String txt = "Hello, World,   ";
        Object expected = Arrays.asList("Hello", "World");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    /**
     * Test case for the {@link SplitWords#splitWords(String)} method.
     * It tests the case when the text contains whitespaces and commas.
     */
    @Test
    void testSplitWords9() {
        String txt = "Hello, World,    ";
        Object expected = Arrays.asList("Hello", "World");
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    /**
     * Test case for the {@link SplitWords#splitWords(String)} method.
     * It tests the case when the text contains whitespaces and commas.
     */
    @Test
    void testSplitWords10() {
        String txt = "Hello, World,     ";
        Object expected = Arrays.asList("Hello", "World");
        assertEquals(expected, SplitWords.splitWords(txt));
    }
}
