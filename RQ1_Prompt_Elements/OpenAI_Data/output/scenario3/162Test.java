// StringToMd5Test.java
package scenario3;

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

	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5() {
		assertEquals("3e25960a79dbc69b674cd4ec67a72c62", StringToMd5.stringToMd5("Hello world"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns null when the given string is empty.
	*/
	@Test
	void testStringToMd5EmptyString() {
		assertEquals(null, StringToMd5.stringToMd5(""));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5ABC() {
		assertEquals("0ef78513b0cb8cef12743f5aeb35f888", StringToMd5.stringToMd5("A B C"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5Password() {
		assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd512345() {
		assertEquals("827ccb0eea8a706c4c34a16891f84e7b", StringToMd5.stringToMd5("12345"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5Qwerty() {
		assertEquals("d8578edf8458ce06fbc5bb76a58c5ca4", StringToMd5.stringToMd5("qwerty"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5Iloveyou() {
		assertEquals("5d41402abc4b2a76b9719d911017c592", StringToMd5.stringToMd5("iloveyou"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5Princess() {
		assertEquals("b3b3f7c9d4e9b2deeb5c2a7d4f4ba395", StringToMd5.stringToMd5("princess"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5Rockyou() {
		assertEquals("c4e7f0f552c7ec8d6d61c8b779c4a3d1", StringToMd5.stringToMd5("rockyou"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5123456() {
		assertEquals("e10adc3949ba59abbe56e057f20f883e", StringToMd5.stringToMd5("123456"));
	}
}