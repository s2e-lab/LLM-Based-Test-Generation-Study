package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveVowelsTest {

    @Test
    public void test() throws Exception{

        assertEquals("bcdf", scenario2.RemoveVowels.removeVowels("abcdef"));
		assertEquals("", scenario2.RemoveVowels.removeVowels("aaaaa"));
		assertEquals("B", scenario2.RemoveVowels.removeVowels("aaBAA"));
		assertEquals("zbcd", scenario2.RemoveVowels.removeVowels("zbcd"));
		assertEquals("", scenario2.RemoveVowels.removeVowels(""));
		assertEquals("bcdf\nghjklm", scenario2.RemoveVowels.removeVowels("abcdef\nghijklm"));
		assertEquals("fdcb", scenario2.RemoveVowels.removeVowels("fedcba"));
		assertEquals("", scenario2.RemoveVowels.removeVowels("eeeee"));
		assertEquals("cB", scenario2.RemoveVowels.removeVowels("acBAA"));
		assertEquals("cB", scenario2.RemoveVowels.removeVowels("EcBOO"));
		assertEquals("ybcd", scenario2.RemoveVowels.removeVowels("ybcd"));
		
    }

}