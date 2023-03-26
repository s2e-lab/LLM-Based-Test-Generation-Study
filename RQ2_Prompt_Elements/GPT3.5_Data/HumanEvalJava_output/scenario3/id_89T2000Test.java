// Here's the source code for Encrypt.java

package scenario3;

class Encrypt {

    /**
     * Create a function encrypt that takes a string as an argument and
     * returns a string encrypted with the alphabet being rotated.
     * The alphabet should be rotated in a manner such that the letters
     * shift down by two multiplied to two places.
     * For example:
     * encrypt('hi') returns 'lm'
     * encrypt('asdfghjkl') returns 'ewhjklnop'
     * encrypt('gf') returns 'kj'
     * encrypt('et') returns 'ix'
     *
     * > encrypt("hi")
     * "lm"
     * > encrypt("asdfghjkl")
     * "ewhjklnop"
     * > encrypt("gf")
     * "kj"
     * > encrypt("et")
     * "ix"
     * > encrypt("faewfawefaewg")
     * "jeiajeaijeiak"
     * > encrypt("hellomyfriend")
     * "lippsqcjvmirh"
     * > encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh")
     * "hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl"
     * > encrypt("a")
     * "e"
     */
    public static String encrypt(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                int shift = 2 * 2;
                char shifted = (char) (c + shift);
                if (shifted > 'z') {
                    shifted = (char) ('a' + (shifted - 'z' - 1));
                }
                sb.append(shifted);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// Here's the source code for EncryptTest.java

package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains ten unit test cases for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {

    @Test
    void testEncryptHi() {
        String result = Encrypt.encrypt("hi");
        assertEquals("lm", result);
    }

    @Test
    void testEncryptAsdfghjkl() {
        String result = Encrypt.encrypt("asdfghjkl");
        assertEquals("ewhjklnop", result);
    }

    @Test
    void testEncryptGf() {
        String result = Encrypt.encrypt("gf");
        assertEquals("kj", result);
    }

    @Test
    void testEncryptEt() {
        String result = Encrypt.encrypt("et");
        assertEquals("ix", result);
    }

    @Test
    void testEncryptFaewfawefaewg() {
        String result = Encrypt.encrypt("faewfawefaewg");
        assertEquals("jeiajeaijeiak", result);
    }

    @Test
    void testEncryptHellomyfriend() {
        String result = Encrypt.encrypt("hellomyfriend");
        assertEquals("lippsqcjvmirh", result);
    }

    @Test
    void testEncryptDxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh() {
        String result = Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh");
        assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", result);
    }

    @Test
    void testEncryptA() {
        String result = Encrypt.encrypt("a");
        assertEquals("e", result);
    }

    @Test
    void testEncryptEmptyString() {
        String result = Encrypt.encrypt("");
        assertEquals("", result);
    }

    @Test
    void testEncryptNull() {
        assertThrows(NullPointerException.class, () -> {
            Encrypt.encrypt(null);
        });
    }
}