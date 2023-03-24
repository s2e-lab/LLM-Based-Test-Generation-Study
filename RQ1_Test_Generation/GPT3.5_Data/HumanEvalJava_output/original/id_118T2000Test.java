// GetClosestVowelTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link GetClosestVowel}.
 * It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
 */
class GetClosestVowelTest {

    @Test
    void testGetClosestVowel1() {
        String result = GetClosestVowel.getClosestVowel("yogurt");
        assertEquals("u", result);
    }

    @Test
    void testGetClosestVowel2() {
        String result = GetClosestVowel.getClosestVowel("full");
        assertEquals("u", result);
    }

    @Test
    void testGetClosestVowel3() {
        String result = GetClosestVowel.getClosestVowel("easy");
        assertEquals("", result);
    }

    @Test
    void testGetClosestVowel4() {
        String result = GetClosestVowel.getClosestVowel("eAsy");
        assertEquals("", result);
    }

    @Test
    void testGetClosestVowel5() {
        String result = GetClosestVowel.getClosestVowel("ali");
        assertEquals("", result);
    }

    @Test
    void testGetClosestVowel6() {
        String result = GetClosestVowel.getClosestVowel("bad");
        assertEquals("a", result);
    }

    @Test
    void testGetClosestVowel7() {
        String result = GetClosestVowel.getClosestVowel("most");
        assertEquals("o", result);
    }

    @Test
    void testGetClosestVowel8() {
        String result = GetClosestVowel.getClosestVowel("ab");
        assertEquals("", result);
    }

    @Test
    void testGetClosestVowel9() {
        String result = GetClosestVowel.getClosestVowel("ba");
        assertEquals("", result);
    }

    @Test
    void testGetClosestVowel10() {
        String result = GetClosestVowel.getClosestVowel("quick");
        assertEquals("", result);
    }

    @Test
    void testGetClosestVowel11() {
        String result = GetClosestVowel.getClosestVowel("anime");
        assertEquals("i", result);
    }

    @Test
    void testGetClosestVowel12() {
        String result = GetClosestVowel.getClosestVowel("Asia");
        assertEquals("", result);
    }

    @Test
    void testGetClosestVowel13() {
        String result = GetClosestVowel.getClosestVowel("Above");
        assertEquals("o", result);
    }
}