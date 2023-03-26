// FlipCase.java
package scenario3;

class FlipCase {

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     *
     * > flipCase("Hello")
     * "hELLO"
     * > flipCase("")
     * ""
     * > flipCase("Hello!")
     * "hELLO!"
     * > flipCase("These violent delights have violent ends")
     * "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"
     */
    public static String flipCase(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            }
        }
        return new String(chars);
    }
}

// FlipCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
    
    @Test
    void testEmptyString() {
        String result = FlipCase.flipCase("");
        assertEquals("", result);
    }
    
    @Test
    void testAllUppercase() {
        String result = FlipCase.flipCase("HELLO");
        assertEquals("hello", result);
    }
    
    @Test
    void testAllLowercase() {
        String result = FlipCase.flipCase("hello");
        assertEquals("HELLO", result);
    }
    
    @Test
    void testMixedCase() {
        String result = FlipCase.flipCase("HeLLo");
        assertEquals("hEllO", result);
    }
    
    @Test
    void testWithSpaces() {
        String result = FlipCase.flipCase("These violent delights have violent ends");
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", result);
    }
    
    @Test
    void testWithNumbers() {
        String result = FlipCase.flipCase("12345");
        assertEquals("12345", result);
    }
    
    @Test
    void testWithSpecialCharacters() {
        String result = FlipCase.flipCase("!@#$%^&*()");
        assertEquals("!@#$%^&*()", result);
    }
    
    @Test
    void testWithMixedCharacters() {
        String result = FlipCase.flipCase("Hello! How are you?");
        assertEquals("hELLO! hOW ARE YOU?", result);
    }
    
    @Test
    void testWithUnicodeCharacters() {
        String result = FlipCase.flipCase("こんにちは");
        assertEquals("こんにちは", result);
    }
    
    @Test
    void testWithNullString() {
        String result = FlipCase.flipCase(null);
        assertNull(result);
    }
}