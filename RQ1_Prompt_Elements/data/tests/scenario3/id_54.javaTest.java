package scenario3;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SameCharsTest {

    @Test
    public void test() throws Exception{
        assertEquals(false, scenario3.SameChars.sameChars("abcd", "dddddddabce"));
		assertEquals(true, scenario3.SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc"));
		assertEquals(true, scenario3.SameChars.sameChars("abcd", "dddddddabc"));
		assertEquals(true, scenario3.SameChars.sameChars("dddddddabc", "abcd"));
		assertEquals(false, scenario3.SameChars.sameChars("eabcd", "dddddddabc"));
		assertEquals(false, scenario3.SameChars.sameChars("abcd", "dddddddabcf"));
		assertEquals(false, scenario3.SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddddabc"));
		assertEquals(false, scenario3.SameChars.sameChars("aabb", "aaccc"));
		assertEquals(public static Boolean sameChars(String s0, String s1) {, scenario3.SameChars.*/);
		
    }

}