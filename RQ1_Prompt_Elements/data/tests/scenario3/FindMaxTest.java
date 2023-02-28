package scenario3;

import java.util.*;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {

    @Test
    public void test() throws Exception{

        assertEquals("string", scenario3.FindMax.findMax(Arrays.asList("name", "of", "string")));
		assertEquals("enam", scenario3.FindMax.findMax(Arrays.asList("name", "enam", "game")));
		assertEquals("aaaaaaa", scenario3.FindMax.findMax(Arrays.asList("aaaaaaa", "bb", "cc")));
		assertEquals("abc", scenario3.FindMax.findMax(Arrays.asList("abc", "cba")));
		assertEquals("footbott", scenario3.FindMax.findMax(Arrays.asList("play", "this", "game", "of", "footbott")));
		assertEquals("gonna", scenario3.FindMax.findMax(Arrays.asList("we", "are", "gonna", "rock")));
		assertEquals("nation", scenario3.FindMax.findMax(Arrays.asList("we", "are", "a", "mad", "nation")));
		assertEquals("this", scenario3.FindMax.findMax(Arrays.asList("this", "is", "a", "prrk")));
		assertEquals("b", scenario3.FindMax.findMax(Arrays.asList("b")));
		assertEquals("play", scenario3.FindMax.findMax(Arrays.asList("play", "play", "play")));
		
    }

}