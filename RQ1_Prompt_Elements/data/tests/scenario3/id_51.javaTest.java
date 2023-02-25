package scenario3;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveVowelsTest {

    @Test
    public void test() throws Exception{
        assertEquals("bcdf", scenario3.RemoveVowels.removeVowels("abcdef"));
		assertEquals("", scenario3.RemoveVowels.removeVowels("aaaaa"));
		assertEquals("B", scenario3.RemoveVowels.removeVowels("aaBAA"));
		assertEquals("zbcd", scenario3.RemoveVowels.removeVowels("zbcd"));
		assertEquals("", scenario3.RemoveVowels.removeVowels(""));
		assertEquals("bcdf\nghjklm", scenario3.RemoveVowels.removeVowels("abcdef\nghijklm"));
		assertEquals("fdcb", scenario3.RemoveVowels.removeVowels("fedcba"));
		assertEquals("", scenario3.RemoveVowels.removeVowels("eeeee"));
		assertEquals("cB", scenario3.RemoveVowels.removeVowels("acBAA"));
		assertEquals("cB", scenario3.RemoveVowels.removeVowels("EcBOO"));
		assertEquals("ybcd", scenario3.RemoveVowels.removeVowels("ybcd"));
		assertEquals(public static String removeVowels(String text) {, scenario3.RemoveVowels.*/);
		
    }

}