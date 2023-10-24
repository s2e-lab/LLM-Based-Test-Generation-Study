// EncodeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {

    /**
     * Test case for {@link Encode#encode(String)}
     * with the message "test".
     */
    @Test
    void testEncode1() {
        String message = "test";
        String expected = "TGST";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Encode#encode(String)}
     * with the message "This is a message".
     */
    @Test
    void testEncode2() {
        String message = "This is a message";
        String expected = "tHKS KS C MGSSCGG";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Encode#encode(String)}
     * with the message "TEST".
     */
    @Test
    void testEncode3() {
        String message = "TEST";
        String expected = "tgst";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Encode#encode(String)}
     * with the message "Mudasir".
     */
    @Test
    void testEncode4() {
        String message = "Mudasir";
        String expected = "mWDCSKR";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Encode#encode(String)}
     * with the message "YES".
     */
    @Test
    void testEncode5() {
        String message = "YES";
        String expected = "ygs";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Encode#encode(String)}
     * with the message "This is a message".
     */
    @Test
    void testEncode6() {
        String message = "This is a message";
        String expected = "tHKS KS C MGSSCGG";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Encode#encode(String)}
     * with the message "I DoNt KnOw WhAt tO WrItE".
     */
    @Test
    void testEncode7() {
        String message = "I DoNt KnOw WhAt tO WrItE";
        String expected = "k dQnT kNqW wHcT Tq wRkTg";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Encode#encode(String)}
     * with the message "This is a message".
     */
    @Test
    void testEncode8() {
        String message = "This is a message";
        String expected = "tHKS KS C MGSSCGG";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Encode#encode(String)}
     * with the message "This is a message".
     */
    @Test
    void testEncode9() {
        String message = "This is a message";
        String expected = "tHKS KS C MGSSCGG";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Encode#encode(String)}
     * with the message "This is a message".
     */
    @Test
    void testEncode10() {
        String message = "This is a message";
        String expected = "tHKS KS C MGSSCGG";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }
}
