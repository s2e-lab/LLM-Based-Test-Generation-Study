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
        assertEquals("u", GetClosestVowel.getClosestVowel("yogurt"));
    }
    
    @Test
    void testGetClosestVowel2() {
        assertEquals("U", GetClosestVowel.getClosestVowel("FULL"));
    }
    
    @Test
    void testGetClosestVowel3() {
        assertEquals("", GetClosestVowel.getClosestVowel("quick"));
    }
    
    @Test
    void testGetClosestVowel4() {
        assertEquals("", GetClosestVowel.getClosestVowel("ab"));
    }
    
    @Test
    void testGetClosestVowel5() {
        assertEquals("", GetClosestVowel.getClosestVowel("eAsy"));
    }
    
    @Test
    void testGetClosestVowel6() {
        assertEquals("", GetClosestVowel.getClosestVowel("ali"));
    }
    
    @Test
    void testGetClosestVowel7() {
        assertEquals("a", GetClosestVowel.getClosestVowel("bad"));
    }
    
    @Test
    void testGetClosestVowel8() {
        assertEquals("o", GetClosestVowel.getClosestVowel("most"));
    }
    
    @Test
    void testGetClosestVowel9() {
        assertEquals("", GetClosestVowel.getClosestVowel("ba"));
    }
    
    @Test
    void testGetClosestVowel10() {
        assertEquals("i", GetClosestVowel.getClosestVowel("anime"));
    }
    
    @Test
    void testGetClosestVowel11() {
        assertEquals("", GetClosestVowel.getClosestVowel("Asia"));
    }
    
    @Test
    void testGetClosestVowel12() {
        assertEquals("o", GetClosestVowel.getClosestVowel("Above"));
    }
}