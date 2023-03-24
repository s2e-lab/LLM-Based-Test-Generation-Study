// Here's the updated code with the missing test cases added:

// RemoveVowels.java
package updated;

class RemoveVowels {

    /**
     * removeVowels is a function that takes string and returns string without vowels.
     *
     * > removeVowels("abcdef")
     * "bcdf"
     * > removeVowels("aaaaa")
     * ""
     * > removeVowels("aaBAA")
     * "B"
     * > removeVowels("zbcd")
     * "zbcd"
     * > removeVowels("")
     * ""
     * > removeVowels("abcdef\nghijklm")
     * "bcdf\nghjklm"
     * > removeVowels("fedcba")
     * "fdcb"
     * > removeVowels("eeeee")
     * ""
     * > removeVowels("acBAA")
     * "cB"
     * > removeVowels("EcBOO")
     * "cB"
     * > removeVowels("ybcd")
     * "ybcd"
     * > removeVowels("AEIOUaeiou")
     * ""
     * > removeVowels("1234567890")
     * "1234567890"
     * > removeVowels("!@#$%^&*()")
     * "!@#$%^&*()"
     * > removeVowels("Hello, World!")
     * "Hll, Wrld!"
     */
    public static String removeVowels(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                result += c;
            }
        }
        return result;
    }
}

// RemoveVowelsTest.java
package updated;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains thirteen unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {

    @Test
    void testRemoveVowels_basic() {
        assertEquals("bcdf", RemoveVowels.removeVowels("abcdef"));
        assertEquals("", RemoveVowels.removeVowels("aaaaa"));
        assertEquals("B", RemoveVowels.removeVowels("aaBAA"));
        assertEquals("zbcd", RemoveVowels.removeVowels("zbcd"));
        assertEquals("", RemoveVowels.removeVowels(""));
        assertEquals("bcdf\nghjklm", RemoveVowels.removeVowels("abcdef\nghijklm"));
        assertEquals("fdcb", RemoveVowels.removeVowels("fedcba"));
        assertEquals("", RemoveVowels.removeVowels("eeeee"));
        assertEquals("cB", RemoveVowels.removeVowels("acBAA"));
        assertEquals("cB", RemoveVowels.removeVowels("EcBOO"));
        assertEquals("ybcd", RemoveVowels.removeVowels("ybcd"));
    }

    @Test
    void testRemoveVowels_edgeCases() {
        assertEquals("", RemoveVowels.removeVowels("AEIOUaeiou"));
        assertEquals("1234567890", RemoveVowels.removeVowels("1234567890"));
        assertEquals("!@#$%^&*()", RemoveVowels.removeVowels("!@#$%^&*()"));
        assertEquals("Hll, Wrld!", RemoveVowels.removeVowels("Hello, World!"));
    }
}