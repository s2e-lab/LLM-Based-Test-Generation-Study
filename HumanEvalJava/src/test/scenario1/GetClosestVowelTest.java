package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetClosestVowelTest {

    @Test
    public void test() throws Exception {

        assertEquals("u", scenario1.GetClosestVowel.getClosestVowel("yogurt"));
        assertEquals("u", scenario1.GetClosestVowel.getClosestVowel("full"));
        assertEquals("", scenario1.GetClosestVowel.getClosestVowel("easy"));
        assertEquals("", scenario1.GetClosestVowel.getClosestVowel("eAsy"));
        assertEquals("", scenario1.GetClosestVowel.getClosestVowel("ali"));
        assertEquals("a", scenario1.GetClosestVowel.getClosestVowel("bad"));
        assertEquals("o", scenario1.GetClosestVowel.getClosestVowel("most"));
        assertEquals("", scenario1.GetClosestVowel.getClosestVowel("ab"));
        assertEquals("", scenario1.GetClosestVowel.getClosestVowel("ba"));
        assertEquals("", scenario1.GetClosestVowel.getClosestVowel("quick"));
        assertEquals("i", scenario1.GetClosestVowel.getClosestVowel("anime"));
        assertEquals("", scenario1.GetClosestVowel.getClosestVowel("Asia"));
        assertEquals("o", scenario1.GetClosestVowel.getClosestVowel("Above"));

    }

}