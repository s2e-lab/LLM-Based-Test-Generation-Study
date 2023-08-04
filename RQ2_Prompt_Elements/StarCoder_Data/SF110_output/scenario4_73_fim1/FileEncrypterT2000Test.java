// FileEncrypterTest.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import java.io.IOException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEncrypter}.
* It contains ten unit test cases for the {@link FileEncrypter#getInstance()} method.
*/
class FileEncrypterTest {

    /**
     * Test method for {@link FileEncrypter#getInstance()}.
     */
    @Test
    void testGetInstance() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstance();
        assertNotNull(fileEncrypter);
    }

    /**
     * Test method for {@link FileEncrypter#getInstanceInit(byte[])}.
     */
    @Test
    void testGetInstanceInit() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstanceInit(new byte[16]);
        assertNotNull(fileEncrypter);
    }

    /**
     * Test method for {@link FileEncrypter#encryptBlowfish(byte[])}.
     */
    @Test
    void testEncryptBlowfish() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstanceInit(new byte[16]);
        byte[] to_encrypt = new byte[16];
        byte[] encrypted = fileEncrypter.encryptBlowfish(to_encrypt);
        assertNotNull(encrypted);
    }

    /**
     * Test method for {@link FileEncrypter#decryptBlowfish(byte[])}.
     */
    @Test
    void testDecryptBlowfish() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstanceInit(new byte[16]);
        byte[] to_decrypt = new byte[16];
        byte[] decrypted = fileEncrypter.decryptBlowfish(to_decrypt);
        assertNotNull(decrypted);
    }

    /**
     * Test method for {@link FileEncrypter#fileEncrypt(File, File)}.
     */
    @Test
    void testFileEncrypt() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstanceInit(new byte[16]);
        File file = new File("src/test/resources/test.txt");
        File file2 = new File("src/test/resources/test.txt.enc");
        byte[] encrypted = fileEncrypter.fileEncrypt(file, file2);
        assertNotNull(encrypted);
    }

    /**
     * Test method for {@link FileEncrypter#fileDecrypt(byte[], File)}.
     */
    @Test
    void testFileDecrypt() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstanceInit(new byte[16]);
        File file = new File("src/test/resources/test.txt.enc");
        File file2 = new File("src/test/resources/test.txt.dec");
        byte[] encrypted = fileEncrypter.fileDecrypt(encrypted, file2);
        assertNotNull(encrypted);
    }
}
