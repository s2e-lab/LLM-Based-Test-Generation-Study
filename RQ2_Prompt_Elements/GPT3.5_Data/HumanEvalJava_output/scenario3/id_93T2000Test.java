// Here's the source code for the Encode class that implements the encode() method as described in the comments.

// Encode.java
package scenario3;

class Encode {

    /**
     * * Write a function that takes a message, and encodes in such a
     * way that it swaps case of all letters, replaces all vowels in
     * the message with the letter that appears 2 places ahead of that
     * vowel in the english alphabet.
     * Assume only letters.
     *
     * Examples:
     * >>> encode('test')
     * 'TGST'
     * >>> encode('This is a message')
     * 'tHKS KS C MGSSCGG'
     *
     * > encode("TEST")
     * "tgst"
     * > encode("Mudasir")
     * "mWDCSKR"
     * > encode("YES")
     * "ygs"
     * > encode("This is a message")
     * "tHKS KS C MGSSCGG"
     * > encode("I DoNt KnOw WhAt tO WrItE")
     * "k dQnT kNqW wHcT Tq wRkTg"
     */
    public static String encode(String message) {
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    sb.append(Character.toLowerCase(c));
                } else {
                    sb.append(Character.toUpperCase(c));
                }
                if (isVowel(c)) {
                    sb.append(getNextLetter(c, 2));
                } else {
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    private static char getNextLetter(char c, int n) {
        int next = (int) c + n;
        if (Character.isUpperCase(c)) {
            if (next > (int) 'Z') {
                next = next - 26;
            }
        } else {
            if (next > (int) 'z') {
                next = next - 26;
            }
        }
        return (char) next;
    }
}

// And here's the source code for the EncodeTest class that contains ten unit test cases for the encode() method.

// EncodeTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {

    @Test
    void testEncode1() {
        String message = "test";
        String expected = "TGST";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    void testEncode2() {
        String message = "This is a message";
        String expected = "tHKS KS C MGSSCGG";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    void testEncode3() {
        String message = "TEST";
        String expected = "tgst";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    void testEncode4() {
        String message = "Mudasir";
        String expected = "mWDCSKR";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    void testEncode5() {
        String message = "YES";
        String expected = "ygs";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    void testEncode6() {
        String message = "This is a message";
        String expected = "tHKS KS C MGSSCGG";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    void testEncode7() {
        String message = "I DoNt KnOw WhAt tO WrItE";
        String expected = "k dQnT kNqW wHcT Tq wRkTg";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    void testEncode8() {
        String message = "Hello World";
        String expected = "hELLO wORLD";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    void testEncode9() {
        String message = "aBcDeFgHiJkLmNoPqRsTuVwXyZ";
        String expected = "AbCdEfGhIjKlMnOpQrStUvWxYz";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    void testEncode10() {
        String message = "The quick brown fox jumps over the lazy dog";
        String expected = "tHE QUICK BRoWN FoX JUMpS ovEr tHE LAzY DoG";
        String actual = Encode.encode(message);
        assertEquals(expected, actual);
    }
}