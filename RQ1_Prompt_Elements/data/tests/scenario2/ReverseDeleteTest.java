package scenario2;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseDeleteTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList("bcd", false), scenario2.ReverseDelete.reverseDelete("abcde", "ae"));
		assertEquals(Arrays.asList("acdef", false), scenario2.ReverseDelete.reverseDelete("abcdef", "b"));
		assertEquals(Arrays.asList("cdedc", true), scenario2.ReverseDelete.reverseDelete("abcdedcba", "ab"));
		assertEquals(Arrays.asList("dik", false), scenario2.ReverseDelete.reverseDelete("dwik", "w"));
		assertEquals(Arrays.asList("", true), scenario2.ReverseDelete.reverseDelete("a", "a"));
		assertEquals(Arrays.asList("abcdedcba", true), scenario2.ReverseDelete.reverseDelete("abcdedcba", ""));
		assertEquals(Arrays.asList("abcdedcba", true), scenario2.ReverseDelete.reverseDelete("abcdedcba", "v"));
		assertEquals(Arrays.asList("abba", true), scenario2.ReverseDelete.reverseDelete("vabba", "v"));
		assertEquals(Arrays.asList("", true), scenario2.ReverseDelete.reverseDelete("mamma", "mia"));
		
    }

}