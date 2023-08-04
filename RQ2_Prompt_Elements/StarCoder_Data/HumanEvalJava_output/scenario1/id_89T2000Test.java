// EncryptTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains ten unit test cases for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {

    /**
    * Test case for {@link Encrypt#encrypt(String)} where the input string is "abc".
    */
    @Test
    void testEncrypt1() {
        String s = "abc";
        String expected = "cde";
        assertEquals(expected, Encrypt.encrypt(s));
    }

    /**
    * Test case for {@link Encrypt#encrypt(String)} where the input string is "xyz".
    */
    @Test
    void testEncrypt2() {
        String s = "xyz";
        String expected = "zab";
        assertEquals(expected, Encrypt.encrypt(s));
    }

    /**
    * Test case for {@link Encrypt#encrypt(String)} where the input string is "hello".
    */
    @Test
    void testEncrypt3() {
        String s = "hello";
        String expected = "ifmmp";
        assertEquals(expected, Encrypt.encrypt(s));
    }

    /**
    * Test case for {@link Encrypt#encrypt(String)} where the input string is "world".
    */
    @Test
    void testEncrypt4() {
        String s = "world";
        String expected = "ppqqrrss";
        assertEquals(expected, Encrypt.encrypt(s));
    }

    /**
    * Test case for {@link Encrypt#encrypt(String)} where the input string is "1234567890".
    */
    @Test
    void testEncrypt5() {
        String s = "1234567890";
        String expected = "2468103579";
        assertEquals(expected, Encrypt.encrypt(s));
    }

    /**
    * Test case for {@link Encrypt#encrypt(String)} where the input string is "12345678901234567890".
    */
    @Test
    void testEncrypt6() {
        String s = "12345678901234567890";
        String expected = "24681035791234567890";
        assertEquals(expected, Encrypt.encrypt(s));
    }

    /**
    * Test case for {@link Encrypt#encrypt(String)} where the input string is "123456789012345678901234567890".
    */
    @Test
    void testEncrypt7() {
        String s = "123456789012345678901234567890";
        String expected = "246810357912345678901234567890";
        assertEquals(expected, Encrypt.encrypt(s));
    }

    /**
    * Test case for {@link Encrypt#encrypt(String)} where the input string is "1234567890123456789012345678901234567890".
    */
    @Test
    void testEncrypt8() {
        String s = "1234567890123456789012345678901234567890";
        String expected = "2468103579123456789012345678901234567890";
        assertEquals(expected, Encrypt.encrypt(s));
    }

    /**
    * Test case for {@link Encrypt#encrypt(String)} where the input string is "12345678901234567890123456789012345678901234567890".
    */
    @Test
    void testEncrypt9() {
        String s = "12345678901234567890123456789012345678901234567890";
        String expected = "24681035791234567890123456789012345678901234567890";
        assertEquals(expected, Encrypt.encrypt(s));
    }

    /**
    * Test case for {@link Encrypt#encrypt(String)} where the input string is "123456789012345678901234567890123456789012345678901234567890".
    */
    @Test
    void testEncrypt10() {
        String s = "123456789012345678901234567890123456789012345678901234567890";
        String expected = "246810357912345678901234567890123456789012345678901234567890";
        assertEquals(expected, Encrypt.encrypt(s));
    }
}
