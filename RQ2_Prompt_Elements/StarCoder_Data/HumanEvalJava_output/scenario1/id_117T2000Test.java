// SelectWordsTest.java
package scenario1;

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
    void testSelectWords() {
        List<Object> expected = new ArrayList<>();
        expected.add("a");
        expected.add("e");
        expected.add("i");
        expected.add("o");
        expected.add("u");
        expected.add("A");
        expected.add("E");
        expected.add("I");
        expected.add("O");
        expected.add("U");
        assertEquals(expected, SelectWords.selectWords("a e i o u A E I O U", 1));
    }

    @Test
    void testSelectWords2() {
        List<Object> expected = new ArrayList<>();
        expected.add("a");
        expected.add("e");
        expected.add("i");
        expected.add("o");
        expected.add("u");
        expected.add("A");
        expected.add("E");
        expected.add("I");
        expected.add("O");
        expected.add("U");
        assertEquals(expected, SelectWords.selectWords("a e i o u A E I O U", 2));
    }

    @Test
    void testSelectWords3() {
        List<Object> expected = new ArrayList<>();
        expected.add("a");
        expected.add("e");
        expected.add("i");
        expected.add("o");
        expected.add("u");
        expected.add("A");
        expected.add("E");
        expected.add("I");
        expected.add("O");
        expected.add("U");
        assertEquals(expected, SelectWords.selectWords("a e i o u A E I O U", 3));
    }

    @Test
    void testSelectWords4() {
        List<Object> expected = new ArrayList<>();
        expected.add("a");
        expected.add("e");
        expected.add("i");
        expected.add("o");
        expected.add("u");
        expected.add("A");
        expected.add("E");
        expected.add("I");
        expected.add("O");
        expected.add("U");
        assertEquals(expected, SelectWords.selectWords("a e i o u A E I O U", 4));
    }

    @Test
    void testSelectWords5() {
        List<Object> expected = new ArrayList<>();
        expected.add("a");
        expected.add("e");
        expected.add("i");
        expected.add("o");
        expected.add("u");
        expected.add("A");
        expected.add("E");
        expected.add("I");
        expected.add("O");
        expected.add("U");
        assertEquals(expected, SelectWords.selectWords("a e i o u A E I O U", 5));
    }

    @Test
    void testSelectWords6() {
        List<Object> expected = new ArrayList<>();
        expected.add("a");
        expected.add("e");
        expected.add("i");
        expected.add("o");
        expected.add("u");
        expected.add("A");
        expected.add("E");
        expected.add("I");
        expected.add("O");
        expected.add("U");
        assertEquals(expected, SelectWords.selectWords("a e i o u A E I O U", 6));
    }

    @Test
    void testSelectWords7() {
        List<Object> expected = new ArrayList<>();
        expected.add("a");
        expected.add("e");
        expected.add("i");
        expected.add("o");
        expected.add("u");
        expected.add("A");
        expected.add("E");
        expected.add("I");
        expected.add("O");
        expected.add("U");
        assertEquals(expected, SelectWords.selectWords("a e i o u A E I O U", 7));
    }

    @Test
    void testSelectWords8() {
        List<Object> expected = new ArrayList<>();
        expected.add("a");
        expected.add("e");
        expected.add("i");
        expected.add("o");
        expected.add("u");
        expected.add("A");
        expected.add("E");
        expected.add("I");
        expected.add("O");
        expected.add("U");
        assertEquals(expected, SelectWords.selectWords("a e i o u A E I O U", 8));
    }

    @Test
    void testSelectWords9() {
        List<Object> expected = new ArrayList<>();
        expected.add("a");
        expected.add("e");
        expected.add("i");
        expected.add("o");
        expected.add("u");
        expected.add("A");
        expected.add("E");
        expected.add("I");
        expected.add("O");
        expected.add("U");
        assertEquals(expected, SelectWords.selectWords("a e i o u A E I O U", 9));
    }

    @Test
    void testSelectWords10() {
        List<Object> expected = new ArrayList<>();
        expected.add("a");
        expected.add("e");
        expected.add("i");
        expected.add("o");
        expected.add("u");
        expected.add("A");
        expected.add("E");
        expected.add("I");
        expected.add("O");
        expected.add("U");
        assertEquals(expected, SelectWords.selectWords("a e i o u A E I O U", 10));
    }
}
