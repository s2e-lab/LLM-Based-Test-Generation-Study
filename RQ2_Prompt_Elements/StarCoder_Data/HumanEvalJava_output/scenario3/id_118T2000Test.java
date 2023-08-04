// GetClosestVowelTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {

    /**
    * Test case for {@link GetClosestVowel#getClosestVowel(String)} where the given string contains
    * English letter only.
    */
    @Test
    void testGetClosestVowel() {
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
