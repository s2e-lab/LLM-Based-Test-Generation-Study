package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SameCharsTest {

    @Test
    public void test() throws Exception{

        assertEquals(false, scenario2.SameChars.sameChars("abcd", "dddddddabce"));
		assertEquals(true, scenario2.SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc"));
		assertEquals(true, scenario2.SameChars.sameChars("abcd", "dddddddabc"));
		assertEquals(true, scenario2.SameChars.sameChars("dddddddabc", "abcd"));
		assertEquals(false, scenario2.SameChars.sameChars("eabcd", "dddddddabc"));
		assertEquals(false, scenario2.SameChars.sameChars("abcd", "dddddddabcf"));
		assertEquals(false, scenario2.SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddddabc"));
		assertEquals(false, scenario2.SameChars.sameChars("aabb", "aaccc"));
		
    }

}