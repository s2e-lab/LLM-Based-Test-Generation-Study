// StrlenTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is empty.
    */
    @Test
    void testStrlenEmptyString() {
        assertEquals(0, Strlen.strlen(""));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "abc".
    */
    @Test
    void testStrlenStringAbc() {
        assertEquals(3, Strlen.strlen("abc"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "x".
    */
    @Test
    void testStrlenStringX() {
        assertEquals(1, Strlen.strlen("x"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "asdasnakj".
    */
    @Test
    void testStrlenStringAsdasnakj() {
        assertEquals(9, Strlen.strlen("asdasnakj"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "1234567890".
    */
    @Test
    void testStrlenString1234567890() {
        assertEquals(10, Strlen.strlen("1234567890"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "12345678901234567890".
    */
    @Test
    void testStrlenString12345678901234567890() {
        assertEquals(20, Strlen.strlen("12345678901234567890"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "123456789012345678901234567890".
    */
    @Test
    void testStrlenString123456789012345678901234567890() {
        assertEquals(30, Strlen.strlen("123456789012345678901234567890"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "1234567890123456789012345678901234567890".
    */
    @Test
    void testStrlenString1234567890123456789012345678901234567890() {
        assertEquals(40, Strlen.strlen("1234567890123456789012345678901234567890"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "12345678901234567890123456789012345678901234567890".
    */
    @Test
    void testStrlenString12345678901234567890123456789012345678901234567890() {
        assertEquals(50, Strlen.strlen("12345678901234567890123456789012345678901234567890"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "123456789012345678901234567890123456789012345678901234567890".
    */
    @Test
    void testStrlenString123456789012345678901234567890123456789012345678901234567890() {
        assertEquals(60, Strlen.strlen("123456789012345678901234567890123456789012345678901234567890"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "1234567890123456789012345678901234567890123456789012345678901234567890".
    */
    @Test
    void testStrlenString1234567890123456789012345678901234567890123456789012345678901234567890() {
        assertEquals(70, Strlen.strlen("1234567890123456789012345678901234567890123456789012345678901234567890"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "12345678901234567890123456789012345678901234567890123456789012345678901234567890".
    */
    @Test
    void testStrlenString12345678901234567890123456789012345678901234567890123456789012345678901234567890() {
        assertEquals(80, Strlen.strlen("12345678901234567890123456789012345678901234567890123456789012345678901234567890"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)} where the given string is "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890".
    */
    @Test
    void testStrlenString123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890() {
        assertEquals(90, Strlen.strlen("123456789012345678901234567890123456789012345678901234567890123456789012345678