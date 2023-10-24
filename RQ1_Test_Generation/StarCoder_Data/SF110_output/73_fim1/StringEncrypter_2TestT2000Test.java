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
    * It tests the decrypt method with a null argument.
    */
    @Test
    void testDecrypt_1() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String str = null;
        String expected = null;
        String actual = stringEncrypter.decrypt(str);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    * It tests the decrypt method with an empty argument.
    */
    @Test
    void testDecrypt_2() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String str = "";
        String expected = "";
        String actual = stringEncrypter.decrypt(str);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    * It tests the decrypt method with a valid argument.
    */
    @Test
    void testDecrypt_3() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String str = "1234567890";
        String expected = "1234567890";
        String actual = stringEncrypter.decrypt(str);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    * It tests the decrypt method with a valid argument.
    */
    @Test
    void testDecrypt_4() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String str = "1234567890";
        String expected = "1234567890";
        String actual = stringEncrypter.decrypt(str);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    * It tests the decrypt method with a valid argument.
    */
    @Test
    void testDecrypt_5() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String str = "1234567890";
        String expected = "1234567890";
        String actual = stringEncrypter.decrypt(str);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    * It tests the decrypt method with a valid argument.
    */
    @Test
    void testDecrypt_6() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String str = "1234567890";
        String expected = "1234567890";
        String actual = stringEncrypter.decrypt(str);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    * It tests the decrypt method with a valid argument.
    */
    @Test
    void testDecrypt_7() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String str = "1234567890";
        String expected = "1234567890";
        String actual = stringEncrypter.decrypt(str);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    * It tests the decrypt method with a valid argument.
    */
    @Test
    void testDecrypt_8() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String str = "1234567890";
        String expected = "1234567890";
        String actual = stringEncrypter.decrypt(str);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    * It tests the decrypt method with a valid argument.
    */
    @Test
    void testDecrypt_9() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String str = "1234567890";
        String expected = "1234567890";
        String actual = stringEncrypter.decrypt(str);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringEncrypter#decrypt(String)} method.
    * It tests the decrypt method with a valid argument.
    */
    @Test
    void testDecrypt_10() {
        StringEncrypter stringEncrypter = StringEncrypter.getInstance("FIM");
        String str = "1234567890";
        String expected = "1234567890";
        String actual = stringEncrypter.decrypt(str);
        assertEquals(expected, actual);
    }
}
