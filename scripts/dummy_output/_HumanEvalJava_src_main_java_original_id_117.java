// SelectWordsTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains ten unit test cases for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {
    
    @Test
    void testSelectWordsWithOneMatch() {
        List<String> expected = new ArrayList<>();
        expected.add("little");
        assertEquals(expected, SelectWords.selectWords("Mary had a little lamb", 4));
    }
    
    @Test
    void testSelectWordsWithMultipleMatches() {
        List<String> expected = new ArrayList<>();
        expected.add("Mary");
        expected.add("lamb");
        assertEquals(expected, SelectWords.selectWords("Mary had a little lamb", 3));
    }
    
    @Test
    void testSelectWordsWithNoMatches() {
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SelectWords.selectWords("simple white space", 2));
    }
    
    @Test
    void testSelectWordsWithOneMatchAtEnd() {
        List<String> expected = new ArrayList<>();
        expected.add("world");
        assertEquals(expected, SelectWords.selectWords("Hello world", 4));
    }
    
    @Test
    void testSelectWordsWithOneMatchAtBeginning() {
        List<String> expected = new ArrayList<>();
        expected.add("Uncle");
        assertEquals(expected, SelectWords.selectWords("Uncle sam", 3));
    }
    
    @Test
    void testSelectWordsWithEmptyString() {
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SelectWords.selectWords("", 4));
    }
    
    @Test
    void testSelectWordsWithSingleLetterWords() {
        List<String> expected = new ArrayList<>();
        expected.add("b");
        expected.add("c");
        expected.add("d");
        expected.add("f");
        assertEquals(expected, SelectWords.selectWords("a b c d e f", 1));
    }
    
    @Test
    void testSelectWordsWithAllWordsMatching() {
        List<String> expected = new ArrayList<>();
        expected.add("Mary");
        expected.add("had");
        expected.add("a");
        expected.add("little");
        expected.add("lamb");
        assertEquals(expected, SelectWords.selectWords("Mary had a little lamb", 2));
    }
    
    @Test
    void testSelectWordsWithAllWordsMatchingAndEmptyString() {
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SelectWords.selectWords("", 2));
    }
    
    @Test
    void testSelectWordsWithAllWordsMatchingAndSingleLetterWords() {
        List<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        expected.add("d");
        expected.add("e");
        expected.add("f");
        assertEquals(expected, SelectWords.selectWords("a b c d e f", 0));
    }
}