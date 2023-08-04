// StringEncrypter_1Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// StringEncrypter.java
// -----------------------------------------------------------------------------
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains ten unit test cases for the {@link StringEncrypter#encrypt(String)} method.
*/
class StringEncrypter_1Test {

    /**
    * Test case for {@link StringEncrypter#encrypt(String)} method.
    */
    @Test
    void testEncrypt() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String encryptedString = stringEncrypter.encrypt("Hello World");
        assertEquals("Hello World", encryptedString);
    }
}

// StringEncrypter_2Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// StringEncrypter.java
// -----------------------------------------------------------------------------
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains ten unit test cases for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypter_2Test {
		
    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    */
    @Test
    void testDecrypt() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String decryptedString = stringEncrypter.decrypt("Hello World");
        assertEquals("Hello World", decryptedString);
    }
}

// StringEncrypter_3Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// StringEncrypter.java
// -----------------------------------------------------------------------------
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains ten unit test cases for the {@link StringEncrypter#encrypt(String)} method.
*/
class StringEncrypter_3Test {
		
    /**
    * Test case for {@link StringEncrypter#encrypt(String)} method.
    */
    @Test
    void testEncrypt() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String encryptedString = stringEncrypter.encrypt("Hello World");
        assertEquals("Hello World", encryptedString);
    }
}

// StringEncrypter_4Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// StringEncrypter.java
// -----------------------------------------------------------------------------
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains ten unit test cases for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypter_4Test {
		
    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    */
    @Test
    void testDecrypt() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String decryptedString = stringEncrypter.decrypt("Hello World");
        assertEquals("Hello World", decryptedString);
    }
}

// StringEncrypter_5Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// StringEncrypter.java
// -----------------------------------------------------------------------------
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains ten unit test cases for the {@link StringEncrypter#encrypt(String)} method.
*/
class StringEncrypter_5Test {
		
    /**
    * Test case for {@link StringEncrypter#encrypt(String)} method.
    */
    @Test
    void testEncrypt() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String encryptedString = stringEncrypter.encrypt("Hello World");
        assertEquals("Hello World", encryptedString);
    }
}

// StringEncrypter_6Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// StringEncrypter.java
// -----------------------------------------------------------------------------
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains ten unit test cases for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypter_6Test {
		
    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    */
    @Test
    void testDecrypt() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String decryptedString = stringEncrypter.decrypt("Hello World");
        assertEquals("Hello World", decryptedString);
    }
}

// StringEncrypter_7Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// StringEncrypter.java
// -----------------------------------------------------------------------------
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains ten unit test cases for the {@link StringEncrypter#encrypt(String)} method.
*/
class StringEncrypter_7Test {
		
    /**
    * Test case for {@link StringEncrypter#encrypt(String)} method.
    */
    @Test
    void testEncrypt() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String encryptedString = stringEncrypter.encrypt("Hello World");
        assertEquals("Hello World", encryptedString);
    }
}

// StringEncrypter_8Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// StringEncrypter.java
// -----------------------------------------------------------------------------
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains ten unit test cases for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypter_8Test {
		
    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    */
    @Test
    void testDecrypt() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String decryptedString = stringEncrypter.decrypt("Hello World");
        assertEquals("Hello World", decryptedString);
    }
}

// StringEncrypter_9Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// StringEncrypter.java
// -----------------------------------------------------------------------------
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of