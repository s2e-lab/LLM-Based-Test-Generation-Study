// EncryptTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains ten unit test cases for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {

    /**
     * Test case for {@link Encrypt#encrypt(String)}
     * with the argument "hi".
     */
    @Test
    void testEncryptHi() {
        assertEquals("lm", Encrypt.encrypt("hi"));
    }

    /**
     * Test case for {@link Encrypt#encrypt(String)}
     * with the argument "asdfghjkl".
     */
    @Test
    void testEncryptAsdfghjkl() {
        assertEquals("ewhjklnop", Encrypt.encrypt("asdfghjkl"));
    }

    /**
     * Test case for {@link Encrypt#encrypt(String)}
     * with the argument "gf".
     */
    @Test
    void testEncryptGf() {
        assertEquals("kj", Encrypt.encrypt("gf"));
    }

    /**
     * Test case for {@link Encrypt#encrypt(String)}
     * with the argument "et".
     */
    @Test
    void testEncryptEt() {
        assertEquals("ix", Encrypt.encrypt("et"));
    }

    /**
     * Test case for {@link Encrypt#encrypt(String)}
     * with the argument "faewfawefaewg".
     */
    @Test
    void testEncryptFaewfawefaewg() {
        assertEquals("jeiajeaijeiak", Encrypt.encrypt("faewfawefaewg"));
    }

    /**
     * Test case for {@link Encrypt#encrypt(String)}
     * with the argument "hellomyfriend".
     */
    @Test
    void testEncryptHellomyfriend() {
        assertEquals("lippsqcjvmirh", Encrypt.encrypt("hellomyfriend"));
    }

    /**
     * Test case for {@link Encrypt#encrypt(String)}
     * with the argument "dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh".
     */
    @Test
    void testEncryptDxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh() {
        assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
    }

    /**
     * Test case for {@link Encrypt#encrypt(String)}
     * with the argument "a".
     */
    @Test
    void testEncryptA() {
        assertEquals("e", Encrypt.encrypt("a"));
    }
}
