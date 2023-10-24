// StrlenTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {

    @Test
    void testStrlen() {
        assertEquals(0, Strlen.strlen(""));
        assertEquals(1, Strlen.strlen("a"));
        assertEquals(2, Strlen.strlen("ab"));
        assertEquals(3, Strlen.strlen("abc"));
        assertEquals(4, Strlen.strlen("abcd"));
        assertEquals(5, Strlen.strlen("abcde"));
        assertEquals(6, Strlen.strlen("abcdef"));
        assertEquals(7, Strlen.strlen("abcdefg"));
        assertEquals(8, Strlen.strlen("abcdefgh"));
        assertEquals(9, Strlen.strlen("abcdefghi"));
        assertEquals(10, Strlen.strlen("abcdefghij"));
    }
}
