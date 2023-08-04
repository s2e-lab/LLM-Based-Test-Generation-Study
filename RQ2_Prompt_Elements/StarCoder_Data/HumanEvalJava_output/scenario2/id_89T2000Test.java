// EncryptTest.java
package scenario2;


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
        assertEquals("bcde", Encrypt.encrypt("abc"));
        assertEquals("fghij", Encrypt.encrypt("def"));
        assertEquals("klmno", Encrypt.encrypt("ghi"));
        assertEquals("pqrstu", Encrypt.encrypt("jkl"));
        assertEquals("vwxyz", Encrypt.encrypt("mno"));
        assertEquals("bcdefghijklmnopqrstuvwxyz", Encrypt.encrypt("pqrstuvwxyz"));
        assertEquals("bcdefghijklmnopqrstuvwxyz", Encrypt.encrypt("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("bcdefghijklmnopqrstuvwxyz", Encrypt.encrypt("bcdefghijklmnopqrstuvwxyz"));
        assertEquals("bcdefghijklmnopqrstuvwxyz", Encrypt.encrypt("bcdefghijklmnopqrstuvwxyza"));
        assertEquals("bcdefghijklmnopqrstuvwxyz", Encrypt.encrypt("bcdefghijklmnopqrstuvwxyza"));
        assertEquals("bcdefghijklmnopqrstuvwxyz", Encrypt.encrypt("bcdefghijklmnopqrstuvwxyza"));
        assertEquals("bcdefghijklmnopqrstuvwxyz", Encrypt.encrypt("bcdefghijklmnopqrstuvwxyza"));
    }
}
