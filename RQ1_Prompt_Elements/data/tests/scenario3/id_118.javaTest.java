package scenario3;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetClosestVowelTest {

    @Test
    public void test() throws Exception{
        assertEquals("u", scenario3.GetClosestVowel.getClosestVowel("yogurt"));
		assertEquals("u", scenario3.GetClosestVowel.getClosestVowel("full"));
		assertEquals("", scenario3.GetClosestVowel.getClosestVowel("easy"));
		assertEquals("", scenario3.GetClosestVowel.getClosestVowel("eAsy"));
		assertEquals("", scenario3.GetClosestVowel.getClosestVowel("ali"));
		assertEquals("a", scenario3.GetClosestVowel.getClosestVowel("bad"));
		assertEquals("o", scenario3.GetClosestVowel.getClosestVowel("most"));
		assertEquals("", scenario3.GetClosestVowel.getClosestVowel("ab"));
		assertEquals("", scenario3.GetClosestVowel.getClosestVowel("ba"));
		assertEquals("", scenario3.GetClosestVowel.getClosestVowel("quick"));
		assertEquals("i", scenario3.GetClosestVowel.getClosestVowel("anime"));
		assertEquals("", scenario3.GetClosestVowel.getClosestVowel("Asia"));
		assertEquals("o", scenario3.GetClosestVowel.getClosestVowel("Above"));
		assertEquals(public static String getClosestVowel(String word) {, scenario3.GetClosestVowel.*/);
		
    }

}