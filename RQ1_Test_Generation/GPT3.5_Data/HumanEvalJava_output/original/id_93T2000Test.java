// Here's the updated version of the EncodeTest class with ten unit test cases for the encode() method.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {

    @Test
    void testEncodeWithLowerCase() {
        String actual = Encode.encode("test");
        String expected = "TGST";
        assertEquals(expected, actual);
    }

    @Test
    void testEncodeWithMixedCase() {
        String actual = Encode.encode("This is a message");
        String expected = "tHKS KS C MGSSCGG";
        assertEquals(expected, actual);
    }

    @Test
    void testEncodeWithUpperCase() {
        String actual = Encode.encode("TEST");
        String expected = "tgst";
        assertEquals(expected, actual);
    }

    @Test
    void testEncodeWithMixedCaseAndNumbers() {
        String actual = Encode.encode("I DoNt KnOw WhAt tO WrItE 123");
        String expected = "k dQnT kNqW wHcT Tq wRkTg 123";
        assertEquals(expected, actual);
    }

    @Test
    void testEncodeWithOnlyVowels() {
        String actual = Encode.encode("aeiouAEIOU");
        String expected = "CGKMQcgkmq";
        assertEquals(expected, actual);
    }

    @Test
    void testEncodeWithNoVowels() {
        String actual = Encode.encode("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ");
        String expected = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        assertEquals(expected, actual);
    }

    @Test
    void testEncodeWithSingleCharacter() {
        String actual = Encode.encode("a");
        String expected = "C";
        assertEquals(expected, actual);
    }

    @Test
    void testEncodeWithEmptyString() {
        String actual = Encode.encode("");
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    void testEncodeWithSpecialCharacters() {
        String actual = Encode.encode("!@#$%^&*()_+-=[]{}|;':\",./<>?");
        String expected = "!@#$%^&*()_+-=[]{}|;':\",./<>?";
        assertEquals(expected, actual);
    }

    @Test
    void testEncodeWithUnicodeCharacters() {
        String actual = Encode.encode("こんにちは");
        String expected = "MqGqOEqI";
        assertEquals(expected, actual);
    }
}