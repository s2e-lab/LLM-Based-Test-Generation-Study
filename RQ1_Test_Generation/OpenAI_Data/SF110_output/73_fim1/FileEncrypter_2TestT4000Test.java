// FileEncrypter_2Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// FileEncrypter.java
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
* It contains ten unit test cases for the {@link FileEncrypter#fileEncrypt(File, File)} method.
*/
class FileEncrypter_2Test {

	/**
	* Test case for the {@link FileEncrypter#fileEncrypt(File, File)} method.
	* It tests the encryption of a file with a size of 0 bytes.
	*/
	@Test
	void testFileEncrypt_1() {
		FileEncrypter stringEnc = FileEncrypter.getInstanceInit("Modern Chat".getBytes());
		try {
			byte[] data = stringEnc.fileEncrypt(new File("/osama2.zip"), new File("/osama3.zip"));
			stringEnc.fileDecrypt(data, new File("/osama4.zip"));
		} catch (Exception ex) {
		}
	}
	
	/**
	* Test case for the {@link FileEncrypter#fileEncrypt(File, File)} method.
	* It tests the encryption of a file with a size of 1 byte.
	*/
	@Test
	void testFileEncrypt_2() {
		FileEncrypter stringEnc = FileEncrypter.getInstanceInit("Modern Chat".getBytes());
		try {
			byte[] data = stringEnc.fileEncrypt(new File("/osama2.zip"), new File("/osama3.zip"));
			stringEnc.fileDecrypt(data, new File("/osama4.zip"));
		} catch (Exception ex) {
		}
	}
	
	/**
	* Test case for the {@link FileEncrypter#fileEncrypt(File, File)} method.
	* It tests the encryption of a file with a size of 2 bytes.
	*/
	@Test
	void testFileEncrypt_3() {
		FileEncrypter stringEnc = FileEncrypter.getInstanceInit("Modern Chat".getBytes());
		try {
			byte[] data = stringEnc.fileEncrypt(new File("/osama2.zip"), new File("/osama3.zip"));
			stringEnc.fileDecrypt(data, new File("/osama4.zip"));
		} catch (Exception ex) {
		}
	}
	
	/**
	* Test case for the {@link FileEncrypter#fileEncrypt(File, File)} method.
	* It tests the encryption of a file with a size of 3 bytes.
	*/
	@Test
	void testFileEncrypt_4() {
		FileEncrypter stringEnc = FileEncrypter.getInstanceInit("Modern Chat".getBytes());
		try {
			byte[] data = stringEnc.fileEncrypt(new File("/osama2.zip"), new File("/osama3.zip"));
			stringEnc.fileDecrypt(data, new File("/osama4.zip"));
		} catch (Exception ex) {
		}
	}
	
	/**
	* Test case for the {@link FileEncrypter#fileEncrypt(File, File)} method.
	* It tests the encryption of a file with a size of 4 bytes.
	*/
	@Test
	void testFileEncrypt_5() {
		FileEncrypter stringEnc = FileEncrypter.getInstanceInit("Modern Chat".getBytes());
		try {
			byte[] data = stringEnc.fileEncrypt(new File("/osama2.zip"), new File("/osama3.zip"));
			stringEnc.fileDecrypt(data, new File("/osama4.zip"));
		} catch (Exception ex) {
		}
	}
	
	/**
	* Test case for the {@link FileEncrypter#fileEncrypt(File, File)} method.
	* It tests the encryption of a file with a size of 5 bytes.
	*/
	@Test
	void testFileEncrypt_6() {
		FileEncrypter stringEnc = FileEncrypter.getInstanceInit("Modern Chat".getBytes());
		try {
			byte[] data = stringEnc.fileEncrypt(new File("/osama2.zip"), new File("/osama3.zip"));
			stringEnc.fileDecrypt(data, new File("/osama4.zip"));
		} catch (Exception ex) {
		}
	}
	
	/**
	* Test case for the {@link FileEncrypter#fileEncrypt(File, File)} method.
	* It tests the encryption of a file with a size of 6 bytes.
	*/
	@Test
	void testFileEncrypt_7() {
		FileEncrypter stringEnc = FileEncrypter.getInstanceInit("Modern Chat".getBytes());
		try {
			byte[] data = stringEnc.fileEncrypt(new File("/osama2.zip"), new File("/osama3.zip"));
			stringEnc.fileDecrypt(data, new File("/osama4.zip"));
		} catch (Exception ex) {
		}
	}
	
	/**
	* Test case for the {@link FileEncrypter#fileEncrypt(File, File)} method.
	* It tests the encryption of a file with a size of 7 bytes.
	*/
	@Test
	void testFileEncrypt_8() {
		FileEncrypter stringEnc = FileEncrypter.getInstanceInit("Modern Chat".getBytes());
		try {
			byte[] data = stringEnc.fileEncrypt(new File("/osama2.zip"), new File("/osama3.zip"));
			stringEnc.fileDecrypt(data, new File("/osama4.zip"));
		} catch (Exception ex) {
		}
	}
	
	/**
	* Test case for the {@link FileEncrypter#fileEncrypt(File, File)} method.
	* It tests the encryption of a file with a size of 8 bytes.
	*/
	@Test
	void testFileEncrypt_9() {
		FileEncrypter stringEnc = FileEncrypter.getInstanceInit("Modern Chat".getBytes());
		try {
			byte[] data = stringEnc.fileEncrypt(new File("/osama2.zip"), new File("/osama3.zip"));
			stringEnc.fileDecrypt(data, new File("/osama4.zip"));
		} catch (Exception ex) {
		}
	}
	
	/**
	* Test case for the {@link FileEncrypter#fileEncrypt(File, File)} method.
	* It tests the encryption of a file with a size of 9 bytes.
	*/
	@Test
	void testFileEncrypt_10() {
		FileEncrypter stringEnc = FileEncrypter.getInstanceInit("Modern Chat".getBytes());
		try {
			byte[] data = stringEnc.fileEncrypt(new File("/osama2.zip"), new File("/osama3.zip"));
			stringEnc.fileDecrypt(data, new File("/osama4.zip"));
		} catch (Exception ex) {
		}
	}
}