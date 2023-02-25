package scenario2;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {

    @Test
    public void test() throws Exception{
        assertEquals("string", scenario2.FindMax.findMax(Arrays.asList("name", "of", "string")));
		assertEquals("enam", scenario2.FindMax.findMax(Arrays.asList("name", "enam", "game")));
		assertEquals("aaaaaaa", scenario2.FindMax.findMax(Arrays.asList("aaaaaaa", "bb", "cc")));
		assertEquals("abc", scenario2.FindMax.findMax(Arrays.asList("abc", "cba")));
		assertEquals("footbott", scenario2.FindMax.findMax(Arrays.asList("play", "this", "game", "of", "footbott")));
		assertEquals("gonna", scenario2.FindMax.findMax(Arrays.asList("we", "are", "gonna", "rock")));
		assertEquals("nation", scenario2.FindMax.findMax(Arrays.asList("we", "are", "a", "mad", "nation")));
		assertEquals("this", scenario2.FindMax.findMax(Arrays.asList("this", "is", "a", "prrk")));
		assertEquals("b", scenario2.FindMax.findMax(Arrays.asList("b")));
		assertEquals("play", scenario2.FindMax.findMax(Arrays.asList("play", "play", "play")));
		assertEquals(public static String findMax(List<String> words) {, scenario2.FindMax.*/);
		
    }

}