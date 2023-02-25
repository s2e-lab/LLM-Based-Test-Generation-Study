package scenario2;

import java.util.Arrays;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SplitWordsTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList("Hello", "world!"), scenario2.SplitWords.splitWords("Hello world!"));
		assertEquals(Arrays.asList("Hello", "world!"), scenario2.SplitWords.splitWords("Hello,world!"));
		assertEquals(Arrays.asList("Hello", "world,!"), scenario2.SplitWords.splitWords("Hello world,!"));
		assertEquals(Arrays.asList("Hello,Hello,world", "!"), scenario2.SplitWords.splitWords("Hello,Hello,world !"));
		assertEquals(3, scenario2.SplitWords.splitWords("abcdef"));
		assertEquals(2, scenario2.SplitWords.splitWords("aaabb"));
		assertEquals(1, scenario2.SplitWords.splitWords("aaaBb"));
		assertEquals(0, scenario2.SplitWords.splitWords(""));
		assertEquals(public static Object splitWords(String txt) {, scenario2.SplitWords.*/);
		
    }

}