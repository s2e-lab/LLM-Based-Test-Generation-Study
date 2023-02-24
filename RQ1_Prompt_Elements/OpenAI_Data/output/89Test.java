// EncryptTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Encrypt}.
* It contains ten test cases for the {@link Encrypt#encrypt()} method.
*/
class EncryptTest {


    @Test
    void testEncrypt() {
        assertEquals("bcd", Encrypt.encrypt("abc"));
        assertEquals("cde", Encrypt.encrypt("bcd"));
        assertEquals("def", Encrypt.encrypt("cde"));
        assertEquals("efg", Encrypt.encrypt("def"));
        assertEquals("fgh", Encrypt.encrypt("efg"));
        assertEquals("ghi", Encrypt.encrypt("fgh"));
        assertEquals("hij", Encrypt.encrypt("ghi"));
        assertEquals("ijk", Encrypt.encrypt("hij"));
        assertEquals("jkl", Encrypt.encrypt("ijk"));
        assertEquals("klm", Encrypt.encrypt("jkl"));
    }
}