// Here's the generated source code for the SelectWordsTest class:

package generated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import original.SelectWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SelectWordsTest {

    @Test
    void testSelectWordsWithEmptyString() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("", 4);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithNoMatchingWords() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("simple white space", 2);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithOneMatchingWord() {
        List<Object> expected = Arrays.asList("little");
        List<Object> actual = SelectWords.selectWords("Mary had a little lamb", 4);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithMultipleMatchingWords() {
        List<Object> expected = Arrays.asList("Mary", "lamb");
        List<Object> actual = SelectWords.selectWords("Mary had a little lamb", 3);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithMatchingWordAtBeginning() {
        List<Object> expected = Arrays.asList("Uncle");
        List<Object> actual = SelectWords.selectWords("Uncle sam", 3);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithMatchingWordAtEnd() {
        List<Object> expected = Arrays.asList("world");
        List<Object> actual = SelectWords.selectWords("Hello world", 4);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithMatchingWordsInMiddle() {
        List<Object> expected = Arrays.asList("b", "c", "d", "f");
        List<Object> actual = SelectWords.selectWords("a b c d e f", 1);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithAllWordsMatching() {
        List<Object> expected = Arrays.asList("Mary", "had", "a", "little", "lamb");
        List<Object> actual = SelectWords.selectWords("Mary had a little lamb", 2);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithNoConsonants() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("aeiou AEIOU", 2);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithAllConsonants() {
        List<Object> expected = Arrays.asList("rhythm");
        List<Object> actual = SelectWords.selectWords("rhythm is a difficult word", 6);
        assertEquals(expected, actual);
    }
}