// DigitsumTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
    
    @Test
    void testEmptyString() {
        assertEquals(0, Digitsum.digitSum(""));
    }
    
    @Test
    void testOnlyLowerCase() {
        assertEquals(0, Digitsum.digitSum("abcde"));
    }
    
    @Test
    void testOnlyUpperCase() {
        assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
    }
    
    @Test
    void testMixedCase() {
        assertEquals(131, Digitsum.digitSum("woArBld"));
    }
    
    @Test
    void testMixedCaseWithNumbers() {
        assertEquals(153, Digitsum.digitSum("aAaaaXa"));
    }
    
    @Test
    void testMixedCaseWithSpaces() {
        assertEquals(151, Digitsum.digitSum(" How are yOu?"));
    }
    
    @Test
    void testOnlyNumbers() {
        assertEquals(0, Digitsum.digitSum("12345"));
    }
    
    @Test
    void testSpecialCharacters() {
        assertEquals(0, Digitsum.digitSum("!@#$%"));
    }
    
    @Test
    void testMixedCaseWithSpecialCharacters() {
        assertEquals(131, Digitsum.digitSum("woArBld!@#$%"));
    }
    
    @Test
    void testUpperCaseWithSpecialCharacters() {
        assertEquals(131, Digitsum.digitSum("woArBld!@#$%ABCD"));
    }
}