package scenario3;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SplitWordsTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList("Hello", "world!"), scenario3.SplitWords.splitWords("Hello world!"));
		assertEquals(Arrays.asList("Hello", "world!"), scenario3.SplitWords.splitWords("Hello,world!"));
		assertEquals(Arrays.asList("Hello", "world,!"), scenario3.SplitWords.splitWords("Hello world,!"));
		assertEquals(Arrays.asList("Hello,Hello,world", "!"), scenario3.SplitWords.splitWords("Hello,Hello,world !"));
		assertEquals(3, scenario3.SplitWords.splitWords("abcdef"));
		assertEquals(2, scenario3.SplitWords.splitWords("aaabb"));
		assertEquals(1, scenario3.SplitWords.splitWords("aaaBb"));
		assertEquals(0, scenario3.SplitWords.splitWords(""));
		
    }

}