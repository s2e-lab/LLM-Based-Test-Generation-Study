package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SelectWordsTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList("little"), scenario1.SelectWords.selectWords("Mary had a little lamb", 4));
		assertEquals(Arrays.asList("Mary", "lamb"), scenario1.SelectWords.selectWords("Mary had a little lamb", 3));
		assertEquals(Arrays.asList(), scenario1.SelectWords.selectWords("simple white space", 2));
		assertEquals(Arrays.asList("world"), scenario1.SelectWords.selectWords("Hello world", 4));
		assertEquals(Arrays.asList("Uncle"), scenario1.SelectWords.selectWords("Uncle sam", 3));
		assertEquals(Arrays.asList(), scenario1.SelectWords.selectWords("", 4));
		assertEquals(Arrays.asList("b", "c", "d", "f"), scenario1.SelectWords.selectWords("a b c d e f", 1));
		
    }

}