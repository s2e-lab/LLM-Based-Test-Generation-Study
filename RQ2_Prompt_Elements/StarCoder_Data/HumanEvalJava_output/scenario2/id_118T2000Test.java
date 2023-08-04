// GetClosestVowelTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {

    /**
     * Test case for the {@link GetClosestVowel#getClosestVowel(String)} method.
     */
    @Test
    void testGetClosestVowel() {
        assertEquals("a", GetClosestVowel.getClosestVowel("a"));
        assertEquals("a", GetClosestVowel.getClosestVowel("aa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("ab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("ba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaaba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabaa"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabba"));
        assertEquals("a", GetClosestVowel.getClosestVowel("abbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaab"));
        assertEquals("a", GetClosestVowel.get