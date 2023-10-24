// EncryptTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains ten unit test cases for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {

    /**
     * Test case for the {@link Encrypt#encrypt(String)} method.
     */
    @Test
    void testEncrypt() {
        assertEquals("lm", Encrypt.encrypt("hi"));
        assertEquals("ewhjklnop", Encrypt.encrypt("asdfghjkl"));
        assertEquals("kj", Encrypt.encrypt("gf"));
        assertEquals("ix", Encrypt.encrypt("et"));
        assertEquals("jeiajeaijeiak", Encrypt.encrypt("faewfawefaewg"));
        assertEquals("lippsqcjvmirh", Encrypt.encrypt("hellomyfriend"));
        assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
        assertEquals("e", Encrypt.encrypt("a"));
    }
}
