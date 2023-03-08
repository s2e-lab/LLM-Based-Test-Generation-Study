package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetClosestVowelTest {

    @Test
    public void test() throws Exception {

        assertEquals("u", scenario2.GetClosestVowel.getClosestVowel("yogurt"));
        assertEquals("u", scenario2.GetClosestVowel.getClosestVowel("full"));
        assertEquals("", scenario2.GetClosestVowel.getClosestVowel("easy"));
        assertEquals("", scenario2.GetClosestVowel.getClosestVowel("eAsy"));
        assertEquals("", scenario2.GetClosestVowel.getClosestVowel("ali"));
        assertEquals("a", scenario2.GetClosestVowel.getClosestVowel("bad"));
        assertEquals("o", scenario2.GetClosestVowel.getClosestVowel("most"));
        assertEquals("", scenario2.GetClosestVowel.getClosestVowel("ab"));
        assertEquals("", scenario2.GetClosestVowel.getClosestVowel("ba"));
        assertEquals("", scenario2.GetClosestVowel.getClosestVowel("quick"));
        assertEquals("i", scenario2.GetClosestVowel.getClosestVowel("anime"));
        assertEquals("", scenario2.GetClosestVowel.getClosestVowel("Asia"));
        assertEquals("o", scenario2.GetClosestVowel.getClosestVowel("Above"));

    }

}