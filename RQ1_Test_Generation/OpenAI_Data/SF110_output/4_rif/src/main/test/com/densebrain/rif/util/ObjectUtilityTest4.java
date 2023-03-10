// ObjectUtilityTest4.java
package com.densebrain.rif.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.axis2.util.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectUtility}.
* It contains ten unit test cases for the {@link ObjectUtility#decodeString(String)} method.
*/
class ObjectUtilityTest4 {

	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a null string.
	*/
	@Test
	void testDecodeString_NullString() {
		assertThrows(NullPointerException.class, () -> {
			ObjectUtility.decodeString(null);
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with an empty string.
	*/
	@Test
	void testDecodeString_EmptyString() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString("");
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a string that contains only spaces.
	*/
	@Test
	void testDecodeString_StringWithSpaces() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString("   ");
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a string that contains only tabs.
	*/
	@Test
	void testDecodeString_StringWithTabs() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString("\t\t\t");
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a string that contains only new lines.
	*/
	@Test
	void testDecodeString_StringWithNewLines() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString("\n\n\n");
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a string that contains only carriage returns.
	*/
	@Test
	void testDecodeString_StringWithCarriageReturns() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString("\r\r\r");
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a string that contains only spaces, tabs, new lines and carriage returns.
	*/
	@Test
	void testDecodeString_StringWithSpacesTabsNewLinesAndCarriageReturns() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString(" \t\n\r\t\n\r ");
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a string that contains only spaces, tabs, new lines, carriage returns and alphanumeric characters.
	*/
	@Test
	void testDecodeString_StringWithSpacesTabsNewLinesCarriageReturnsAndAlphanumericCharacters() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString(" \t\n\r\t\n\r abc123 \t\n\r\t\n\r ");
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a string that contains only spaces, tabs, new lines, carriage returns, alphanumeric characters and special characters.
	*/
	@Test
	void testDecodeString_StringWithSpacesTabsNewLinesCarriageReturnsAlphanumericCharactersAndSpecialCharacters() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString(" \t\n\r\t\n\r abc123 \t\n\r\t\n\r !@#$%^&*()_+-=[]{}\\|;:'\",.<>/?`~ ");
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a string that contains only spaces, tabs, new lines, carriage returns, alphanumeric characters, special characters and base64 characters.
	*/
	@Test
	void testDecodeString_StringWithSpacesTabsNewLinesCarriageReturnsAlphanumericCharactersSpecialCharactersAndBase64Characters() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString(" \t\n\r\t\n\r abc123 \t\n\r\t\n\r !@#$%^&*()_+-=[]{}\\|;:'\",.<>/?`~ ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/ ");
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a string that contains only spaces, tabs, new lines, carriage returns, alphanumeric characters, special characters, base64 characters and padding characters.
	*/
	@Test
	void testDecodeString_StringWithSpacesTabsNewLinesCarriageReturnsAlphanumericCharactersSpecialCharactersBase64CharactersAndPaddingCharacters() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString(" \t\n\r\t\n\r abc123 \t\n\r\t\n\r !@#$%^&*()_+-=[]{}\\|;:'\",.<>/?`~ ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/ = ");
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a string that contains only spaces, tabs, new lines, carriage returns, alphanumeric characters, special characters, base64 characters, padding characters and invalid characters.
	*/
	@Test
	void testDecodeString_StringWithSpacesTabsNewLinesCarriageReturnsAlphanumericCharactersSpecialCharactersBase64CharactersPaddingCharactersAndInvalidCharacters() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString(" \t\n\r\t\n\r abc123 \t\n\r\t\n\r !@#$%^&*()_+-=[]{}\\|;:'\",.<>/?`~ ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/ = !@#$%^&*()_+-=[]{}\\|;:'\",.<>/?`~ ");
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#decodeString(String)} method.
	* It tests the method with a string that contains only spaces, tabs, new lines, carriage returns, alphanumeric characters, special characters, base64 characters, padding characters, invalid characters and valid characters.
	*/
	@Test
	void testDecodeString_StringWithSpacesTabsNewLinesCarriageReturnsAlphanumericCharactersSpecialCharactersBase64CharactersPaddingCharactersInvalidCharactersAndValidCharacters() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.decodeString(" \t\n\r\t\n\r abc123 \t\n\r\t\n\r !@#$%^&*()_+-=[]{}\\|;:'\",.<>/?`~ ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/ = !@#$%^&*()