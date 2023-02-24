package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class GetClosestVowelTest {
    @Test
    public void testGetClosestVowel() {
        assertEquals("u", GetClosestVowel.getClosestVowel("yogurt"));
        assertEquals("u", GetClosestVowel.getClosestVowel("full"));
        assertEquals("", GetClosestVowel.getClosestVowel("easy"));
        assertEquals("", GetClosestVowel.getClosestVowel("eAsy"));
        assertEquals("", GetClosestVowel.getClosestVowel("ali"));
        assertEquals("a", GetClosestVowel.getClosestVowel("bad"));
        assertEquals("o", GetClosestVowel.getClosestVowel("most"));
        assertEquals("", GetClosestVowel.getClosestVowel("ab"));
        assertEquals("", GetClosestVowel.getClosestVowel("ba"));
        assertEquals("", GetClosestVowel.getClosestVowel("quick"));
        assertEquals("i", GetClosestVowel.getClosestVowel("anime"));
        assertEquals("", GetClosestVowel.getClosestVowel("Asia"));
        assertEquals("o", GetClosestVowel.getClosestVowel("Above"));
    }
}