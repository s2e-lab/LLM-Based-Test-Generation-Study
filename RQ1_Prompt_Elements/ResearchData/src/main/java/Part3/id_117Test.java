package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SelectWordsTest {
    @Test
    public void testSelectWords() {
        assertEquals(SelectWords.selectWords("Mary had a little lamb", 4), Arrays.asList("little"));
        assertEquals(SelectWords.selectWords("Mary had a little lamb", 3), Arrays.asList("Mary", "lamb"));
        assertEquals(SelectWords.selectWords("simple white space", 2), Arrays.asList());
        assertEquals(SelectWords.selectWords("Hello world", 4), Arrays.asList("world"));
        assertEquals(SelectWords.selectWords("Uncle sam", 3), Arrays.asList("Uncle"));
        assertEquals(SelectWords.selectWords("", 4), Arrays.asList());
        assertEquals(SelectWords.selectWords("a b c d e f", 1), Arrays.asList("b", "c", "d", "f"));
        assertEquals(SelectWords.selectWords("a b c d e f", 0), Arrays.asList("a", "e"));
        assertEquals(SelectWords.selectWords("a b c d e f", 2), Arrays.asList("b", "c", "d", "f"));
        assertEquals(SelectWords.selectWords("a b c d e f", 3), Arrays.asList());
    }
}