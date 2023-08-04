// StringToMd5Test.java
package scenario1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {

    @Test
    void testStringToMd5() {
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", StringToMd5.stringToMd5(""));
        assertEquals("0cc175b9c0f1b6a831c399e269772661", StringToMd5.stringToMd5("a"));
        assertEquals("900150983cd24fb0d6963f7d28e17f72", StringToMd5.stringToMd5("abc"));
        assertEquals("f96b697d7cb7938d525a2f31aaf161d0", StringToMd5.stringToMd5("message digest"));
        assertEquals("c3fcd3d76192e4007dfb496cca67e13b", StringToMd5.stringToMd5("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("d174ab98d277d9f5a5611c2c9f419d9f", StringToMd5.stringToMd5("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"));
        assertEquals("57edf4a22be3c955ac49da2e2107b67a", StringToMd5.stringToMd5("12345678901234567890123456789012345678901234567890123456789012345678901234567890"));
        assertEquals("761c457bf73b14d27e9e9265c46f4b4d", StringToMd5.stringToMd5("The quick brown fox jumps over the lazy dog"));
        assertEquals("8e959b75dae313da8cf4f72814fc143f", StringToMd5.stringToMd5("The quick brown fox jumps over the lazy cog"));
    }
}
