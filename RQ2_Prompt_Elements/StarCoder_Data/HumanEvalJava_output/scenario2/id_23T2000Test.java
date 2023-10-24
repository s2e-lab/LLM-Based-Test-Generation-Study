// StrlenTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {

    /**
     * Test case for the {@link Strlen#strlen(String)} method.
     * It tests the length of a string with a length of 0.
     */
    @Test
    void testStrlen0() {
        assertEquals(0, Strlen.strlen(""));
    }

    /**
     * Test case for the {@link Strlen#strlen(String)} method.
     * It tests the length of a string with a length of 1.
     */
    @Test
    void testStrlen1() {
        assertEquals(1, Strlen.strlen("a"));
    }

    /**
     * Test case for the {@link Strlen#strlen(String)} method.
     * It tests the length of a string with a length of 2.
     */
    @Test
    void testStrlen2() {
        assertEquals(2, Strlen.strlen("ab"));
    }

    /**
     * Test case for the {@link Strlen#strlen(String)} method.
     * It tests the length of a string with a length of 3.
     */
    @Test
    void testStrlen3() {
        assertEquals(3, Strlen.strlen("abc"));
    }

    /**
     * Test case for the {@link Strlen#strlen(String)} method.
     * It tests the length of a string with a length of 4.
     */
    @Test
    void testStrlen4() {
        assertEquals(4, Strlen.strlen("abcd"));
    }

    /**
     * Test case for the {@link Strlen#strlen(String)} method.
     * It tests the length of a string with a length of 5.
     */
    @Test
    void testStrlen5() {
        assertEquals(5, Strlen.strlen("abcde"));
    }

    /**
     * Test case for the {@link Strlen#strlen(String)} method.
     * It tests the length of a string with a length of 6.
     */
    @Test
    void testStrlen6() {
        assertEquals(6, Strlen.strlen("abcdef"));
    }

    /**
     * Test case for the {@link Strlen#strlen(String)} method.
     * It tests the length of a string with a length of 7.
     */
    @Test
    void testStrlen7() {
        assertEquals(7, Strlen.strlen("abcdefg"));
    }

    /**
     * Test case for the {@link Strlen#strlen(String)} method.
     * It tests the length of a string with a length of 8.
     */
    @Test
    void testStrlen8() {
        assertEquals(8, Strlen.strlen("abcdefgh"));
    }

    /**
     * Test case for the {@link Strlen#strlen(String)} method.
     * It tests the length of a string with a length of 9.
     */
    @Test
    void testStrlen9() {
        assertEquals(9, Strlen.strlen("abcdefghi"));
    }
}
