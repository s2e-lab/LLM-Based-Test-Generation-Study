package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SplitWordsTest {
    @Test
    public void testSplitWords() {
        assertEquals(SplitWords.splitWords("Hello world!"), Arrays.asList("Hello", "world!"));
        assertEquals(SplitWords.splitWords("Hello,world!"), Arrays.asList("Hello", "world!"));
        assertEquals(SplitWords.splitWords("Hello world,!"), Arrays.asList("Hello", "world,!"));
        assertEquals(SplitWords.splitWords("Hello,Hello,world !"), Arrays.asList("Hello,Hello,world", "!"));
        assertEquals(SplitWords.splitWords("abcdef"), 3);
        assertEquals(SplitWords.splitWords("aaabb"), 2);
        assertEquals(SplitWords.splitWords("aaaBb"), 1);
        assertEquals(SplitWords.splitWords(""), 0);
        assertEquals(SplitWords.splitWords("a"), 1);
        assertEquals(SplitWords.splitWords("b"), 0);
    }
}