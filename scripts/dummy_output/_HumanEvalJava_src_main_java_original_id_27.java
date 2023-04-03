// FlipCaseTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
    
    @Test
    void testEmptyString() {
        assertEquals("", FlipCase.flipCase(""));
    }
    
    @Test
    void testAllUppercase() {
        assertEquals("hELLO", FlipCase.flipCase("Hello"));
    }
    
    @Test
    void testAllLowercase() {
        assertEquals("HELLO", FlipCase.flipCase("hello"));
    }
    
    @Test
    void testMixedCase() {
        assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
    }
    
    @Test
    void testNonAlphabeticCharacters() {
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
    }
    
    @Test
    void testNumbers() {
        assertEquals("12345", FlipCase.flipCase("12345"));
    }
    
    @Test
    void testSpecialCharacters() {
        assertEquals("!@#$%", FlipCase.flipCase("!@#$%"));
    }
    
    @Test
    void testWhitespace() {
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
    }
    
    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> FlipCase.flipCase(null));
    }
    
    @Test
    void testPerformance() {
        String longString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        longString = longString.repeat(100000);
        long startTime = System.currentTimeMillis();
        FlipCase.flipCase(longString);
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime < 1000);
    }
}