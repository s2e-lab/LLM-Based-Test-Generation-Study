// Digitsum.java
package original;

class Digitsum {

    /**
     * Write a function that takes a string as input and returns the sum of the ASCII codes of the upper characters only.
     * Examples:
     * digitSum("") => 0
     * digitSum("abAB") => 131
     * digitSum("abcCd") => 67
     * digitSum("helloE") => 69
     * digitSum("woArBld") => 131
     * digitSum("aAaaaXa") => 153
     *
     * @param s the input string
     * @return the sum of the ASCII codes of the upper characters only
     */
    public static int digitSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sum += c;
            }
        }
        return sum;
    }
}

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
    void testNoUpperCase() {
        assertEquals(0, Digitsum.digitSum("abc"));
    }
    
    @Test
    void testSingleUpperCase() {
        assertEquals(65, Digitsum.digitSum("A"));
    }
    
    @Test
    void testMultipleUpperCase() {
        assertEquals(131, Digitsum.digitSum("abAB"));
    }
    
    @Test
    void testMixedCase() {
        assertEquals(67, Digitsum.digitSum("abcCd"));
    }
    
    @Test
    void testUpperCaseAtEnd() {
        assertEquals(69, Digitsum.digitSum("helloE"));
    }
    
    @Test
    void testUpperCaseAtBeginning() {
        assertEquals(131, Digitsum.digitSum("woArBld"));
    }
    
    @Test
    void testUpperCaseInMiddle() {
        assertEquals(153, Digitsum.digitSum("aAaaaXa"));
    }
    
    @Test
    void testUpperCaseWithSpaces() {
        assertEquals(151, Digitsum.digitSum(" How are yOu?"));
    }
    
    @Test
    void testMultipleUpperCaseWords() {
        assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
    }
}