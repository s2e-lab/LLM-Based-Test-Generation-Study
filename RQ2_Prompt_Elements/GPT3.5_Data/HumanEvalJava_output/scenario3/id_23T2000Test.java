// Strlen.java
package scenario3;

class Strlen {

    /**
     * Return length of given string
     *
     * > strlen("")
     * 0
     * > strlen("abc")
     * 3
     * > strlen("")
     * 0
     * > strlen("x")
     * 1
     * > strlen("asdasnakj")
     * 9
     */
    public static int strlen(String string) {
        return string.length();
    }
}

// StrlenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {
    @Test
    void testEmptyString() {
        assertEquals(0, Strlen.strlen(""));
    }

    @Test
    void testSingleCharacterString() {
        assertEquals(1, Strlen.strlen("x"));
    }

    @Test
    void testMultipleCharacterString() {
        assertEquals(3, Strlen.strlen("abc"));
    }

    @Test
    void testLongString() {
        assertEquals(9, Strlen.strlen("asdasnakj"));
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> Strlen.strlen(null));
    }

    @Test
    void testUnicodeString() {
        assertEquals(4, Strlen.strlen("日本語"));
    }

    @Test
    void testWhitespaceString() {
        assertEquals(5, Strlen.strlen("  \t\n\r\f"));
    }

    @Test
    void testTabString() {
        assertEquals(1, Strlen.strlen("\t"));
    }

    @Test
    void testNewlineString() {
        assertEquals(1, Strlen.strlen("\n"));
    }

    @Test
    void testCarriageReturnString() {
        assertEquals(1, Strlen.strlen("\r"));
    }
}