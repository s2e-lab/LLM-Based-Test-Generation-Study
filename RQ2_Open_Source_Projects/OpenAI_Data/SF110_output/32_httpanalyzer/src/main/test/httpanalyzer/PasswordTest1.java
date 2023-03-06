// PasswordTest1.java
package httpanalyzer;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Password}.
* It contains ten unit test cases for the {@link Password#hashMD5(String)} method.
*/
class PasswordTest1 {

	/**
	* Test case for {@link Password#hashMD5(String)} method.
	* It tests the method with a null string.
	*/
	@Test
	void testHashMD5_NullString() {
		String baseString = null;
		String expResult = null;
		String result = Password.hashMD5(baseString);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#hashMD5(String)} method.
	* It tests the method with an empty string.
	*/
	@Test
	void testHashMD5_EmptyString() {
		String baseString = "";
		String expResult = "d41d8cd98f00b204e9800998ecf8427e";
		String result = Password.hashMD5(baseString);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#hashMD5(String)} method.
	* It tests the method with a string containing only spaces.
	*/
	@Test
	void testHashMD5_SpacesString() {
		String baseString = "   ";
		String expResult = "7215ee9c7d9dc229d2921a40e899ec5f";
		String result = Password.hashMD5(baseString);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#hashMD5(String)} method.
	* It tests the method with a string containing only tabs.
	*/
	@Test
	void testHashMD5_TabsString() {
		String baseString = "\t\t\t";
		String expResult = "7215ee9c7d9dc229d2921a40e899ec5f";
		String result = Password.hashMD5(baseString);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#hashMD5(String)} method.
	* It tests the method with a string containing only new lines.
	*/
	@Test
	void testHashMD5_NewLinesString() {
		String baseString = "\n\n\n";
		String expResult = "7215ee9c7d9dc229d2921a40e899ec5f";
		String result = Password.hashMD5(baseString);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#hashMD5(String)} method.
	* It tests the method with a string containing only carriage returns.
	*/
	@Test
	void testHashMD5_CarriageReturnsString() {
		String baseString = "\r\r\r";
		String expResult = "7215ee9c7d9dc229d2921a40e899ec5f";
		String result = Password.hashMD5(baseString);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#hashMD5(String)} method.
	* It tests the method with a string containing only spaces, tabs, new lines and carriage returns.
	*/
	@Test
	void testHashMD5_SpacesTabsNewLinesCarriageReturnsString() {
		String baseString = " \t\n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r\t \n\r