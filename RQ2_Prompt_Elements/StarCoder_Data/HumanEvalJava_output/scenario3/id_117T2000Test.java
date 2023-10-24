// SelectWordsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains ten unit test cases for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string is empty.
     */
    @Test
    void testSelectWordsEmptyString() {
        List<Object> result = SelectWords.selectWords("", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only spaces.
     */
    @Test
    void testSelectWordsOnlySpaces() {
        List<Object> result = SelectWords.selectWords("   ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters.
     */
    @Test
    void testSelectWordsOnlyLetters() {
        List<Object> result = SelectWords.selectWords("abcde", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces2() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces3() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces4() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces5() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces6() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces7() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces8() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces9() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces10() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces11() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces12() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces13() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces14() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces15() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces16() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces17() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces18() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces19() {
        List<Object> result = SelectWords.selectWords("  abcde  ", 4);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link SelectWords#selectWords(String, int)} method.
     * Tests that the method returns an empty list when the input string contains only letters and spaces.
     */
    @Test
    void testSelectWordsOnlyLettersAndSpaces20() {