// PasswordTest.java
package httpanalyzer;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Password}.
* It contains ten unit test cases for the {@link Password#crypt(String, String)} method.
*/
class PasswordTest {

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "ab";
        String expResult = "ab$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt2() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt3() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt4() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt5() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt6() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt7() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt8() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt9() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt10() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt11() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt12() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt13() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt14() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt15() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt16() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt17() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt18() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
        String result = Password.crypt(strpw, strsalt);
        assertEquals(expResult, result);
    }

    /**
     * Test of crypt method, of class Password.
     */
    @Test
    void testCrypt19() {
        System.out.println("crypt");
        String strpw = "password";
        String strsalt = "AB";
        String expResult = "AB$10$12345678901234567890";
       