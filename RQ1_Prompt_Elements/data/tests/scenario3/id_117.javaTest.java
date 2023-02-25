package scenario3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SelectWordsTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList("little"), scenario3.SelectWords.selectWords("Mary had a little lamb", 4));
		assertEquals(Arrays.asList("Mary", "lamb"), scenario3.SelectWords.selectWords("Mary had a little lamb", 3));
		assertEquals(Arrays.asList(), scenario3.SelectWords.selectWords("simple white space", 2));
		assertEquals(Arrays.asList("world"), scenario3.SelectWords.selectWords("Hello world", 4));
		assertEquals(Arrays.asList("Uncle"), scenario3.SelectWords.selectWords("Uncle sam", 3));
		assertEquals(Arrays.asList(), scenario3.SelectWords.selectWords("", 4));
		assertEquals(Arrays.asList("b", "c", "d", "f"), scenario3.SelectWords.selectWords("a b c d e f", 1));
		assertEquals(public static List<Object> selectWords(String s, int n) {, scenario3.SelectWords.*/);
		
    }

}