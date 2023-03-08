package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SplitWordsTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList("Hello", "world!"), scenario1.SplitWords.splitWords("Hello world!"));
        assertEquals(Arrays.asList("Hello", "world!"), scenario1.SplitWords.splitWords("Hello,world!"));
        assertEquals(Arrays.asList("Hello", "world,!"), scenario1.SplitWords.splitWords("Hello world,!"));
        assertEquals(Arrays.asList("Hello,Hello,world", "!"), scenario1.SplitWords.splitWords("Hello,Hello,world !"));
        assertEquals(3, scenario1.SplitWords.splitWords("abcdef"));
        assertEquals(2, scenario1.SplitWords.splitWords("aaabb"));
        assertEquals(1, scenario1.SplitWords.splitWords("aaaBb"));
        assertEquals(0, scenario1.SplitWords.splitWords(""));

    }

}