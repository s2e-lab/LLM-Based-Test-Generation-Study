package scenario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SelectWordsTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList("little"), scenario2.SelectWords.selectWords("Mary had a little lamb", 4));
		assertEquals(Arrays.asList("Mary", "lamb"), scenario2.SelectWords.selectWords("Mary had a little lamb", 3));
		assertEquals(Arrays.asList(), scenario2.SelectWords.selectWords("simple white space", 2));
		assertEquals(Arrays.asList("world"), scenario2.SelectWords.selectWords("Hello world", 4));
		assertEquals(Arrays.asList("Uncle"), scenario2.SelectWords.selectWords("Uncle sam", 3));
		assertEquals(Arrays.asList(), scenario2.SelectWords.selectWords("", 4));
		assertEquals(Arrays.asList("b", "c", "d", "f"), scenario2.SelectWords.selectWords("a b c d e f", 1));
		
    }

}