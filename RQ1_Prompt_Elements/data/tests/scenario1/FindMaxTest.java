package scenario1;

import java.util.*;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {

    @Test
    public void test() throws Exception{

        assertEquals("string", scenario1.FindMax.findMax(Arrays.asList("name", "of", "string")));
		assertEquals("enam", scenario1.FindMax.findMax(Arrays.asList("name", "enam", "game")));
		assertEquals("aaaaaaa", scenario1.FindMax.findMax(Arrays.asList("aaaaaaa", "bb", "cc")));
		assertEquals("abc", scenario1.FindMax.findMax(Arrays.asList("abc", "cba")));
		assertEquals("footbott", scenario1.FindMax.findMax(Arrays.asList("play", "this", "game", "of", "footbott")));
		assertEquals("gonna", scenario1.FindMax.findMax(Arrays.asList("we", "are", "gonna", "rock")));
		assertEquals("nation", scenario1.FindMax.findMax(Arrays.asList("we", "are", "a", "mad", "nation")));
		assertEquals("this", scenario1.FindMax.findMax(Arrays.asList("this", "is", "a", "prrk")));
		assertEquals("b", scenario1.FindMax.findMax(Arrays.asList("b")));
		assertEquals("play", scenario1.FindMax.findMax(Arrays.asList("play", "play", "play")));
		
    }

}