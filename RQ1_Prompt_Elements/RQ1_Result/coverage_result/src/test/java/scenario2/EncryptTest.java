// EncryptTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Encrypt}.
 * It contains ten unit test cases for the {@link Encrypt#encrypt(String)} method.
 */
class EncryptTest {

    @Test
    void testEncrypt() {
        assertEquals("jgnnq", Encrypt.encrypt("hello"));
        assertEquals("jgnnq", Encrypt.encrypt("Hello"));
        assertEquals("jgnnq", Encrypt.encrypt("HELLO"));
        assertEquals("jgnnq", Encrypt.encrypt("HeLlO"));
        assertEquals("jgnnq", Encrypt.encrypt("hElLo"));
        assertEquals("jgnnq", Encrypt.encrypt("heLlo"));
        assertEquals("jgnnq", Encrypt.encrypt("helLo"));
        assertEquals("jgnnq", Encrypt.encrypt("hellO"));
        assertEquals("jgnnq", Encrypt.encrypt("hello"));
        assertEquals("jgnnq", Encrypt.encrypt("hello"));
    }
}
