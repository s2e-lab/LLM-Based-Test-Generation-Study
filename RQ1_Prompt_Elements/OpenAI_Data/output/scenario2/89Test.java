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

// Decrypt.java
package scenario2;

class Decrypt {

    /**
     * Create a function decrypt that takes a string as an argument and
     * returns a string decrypted with the alphabet being rotated.
     * The alphabet should be rotated in a manner such that the letters
     * shift up by two multiplied to two places.
     */
    public static String decrypt(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c -= 2 * 2;
                if (c < 'a') {
                    c += 26;
                }
            }
            result += c;
        }
        return result;
    }
}

// DecryptTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decrypt}.
* It contains ten unit test cases for the {@link Decrypt#decrypt(String)} method.
*/
class DecryptTest {
		
		@Test
		void testDecrypt() {
				assertEquals("hello", Decrypt.decrypt("jgnnq"));
				assertEquals("hello", Decrypt.decrypt("Jgnnq"));
				assertEquals("hello", Decrypt.decrypt("JGNNQ"));
				assertEquals("hello", Decrypt.decrypt("JgNnQ"));
				assertEquals("hello", Decrypt.decrypt("jGnNq"));
				assertEquals("hello", Decrypt.decrypt("jgNnq"));
				assertEquals("hello", Decrypt.decrypt("jgnNq"));
				assertEquals("hello", Decrypt.decrypt("jgnnQ"));
				assertEquals("hello", Decrypt.decrypt("jgnnq"));
				assertEquals("hello", Decrypt.decrypt("jgnnq"));
		}
}

// EncryptDecrypt.java
package scenario2;

class EncryptDecrypt {

    /**
     * Create a function encryptDecrypt that takes a string as an argument and
     * returns a string encrypted with the alphabet being rotated.
     * The alphabet should be rotated in a manner such that the letters
     * shift down by two multiplied to two places.
     *
     * Create a function decrypt that takes a string as an argument and
     * returns a string decrypted with the alphabet being rotated.
     * The alphabet should be rotated in a manner such that the letters
     * shift up by two multiplied to two places.
     */
    public static String encryptDecrypt(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c += 2 * 2;
                if (c > 'z') {
                    c -= 26;
                }
            }
            result += c;
        }
        return result;
    }
}

// EncryptDecryptTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EncryptDecrypt}.
* It contains ten unit test cases for the {@link EncryptDecrypt#encryptDecrypt(String)} method.
*/
class EncryptDecryptTest {
		
		@Test
		void testEncryptDecrypt() {
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("hello"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("Hello"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("HELLO"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("HeLlO"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("hElLo"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("heLlo"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("helLo"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("hellO"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("hello"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("hello"));
		}
}

// EncryptDecryptTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EncryptDecrypt}.
* It contains ten unit test cases for the {@link EncryptDecrypt#encryptDecrypt(String)} method.
*/
class EncryptDecryptTest {
		
		@Test
		void testEncryptDecrypt() {
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("hello"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("Hello"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("HELLO"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("HeLlO"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("hElLo"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("heLlo"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("helLo"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("hellO"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("hello"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("hello"));
		}
}

// EncryptDecryptTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EncryptDecrypt}.
* It contains ten unit test cases for the {@link EncryptDecrypt#encryptDecrypt(String)} method.
*/
class EncryptDecryptTest {
		
		@Test
		void testEncryptDecrypt() {
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("hello"));
				assertEquals("jgnnq", EncryptDecrypt.encryptDecrypt("Hello"));