// Base64Test3.java
package com.hf.sfm.crypt;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64}.
* It contains ten unit test cases for the {@link Base64#byteArrayToBase64(byte[])} method.
*/
class Base64Test3 {

		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the case when the input byte array is empty.
		*/
		@Test
		void testByteArrayToBase64_Empty() {
				byte[] input = new byte[0];
				String expected = "";
				String actual = Base64.byteArrayToBase64(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the case when the input byte array contains only one byte.
		*/
		@Test
		void testByteArrayToBase64_OneByte() {
				byte[] input = new byte[] {0x00};
				String expected = "AA==";
				String actual = Base64.byteArrayToBase64(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the case when the input byte array contains only two bytes.
		*/
		@Test
		void testByteArrayToBase64_TwoBytes() {
				byte[] input = new byte[] {0x00, 0x00};
				String expected = "AAA=";
				String actual = Base64.byteArrayToBase64(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the case when the input byte array contains only three bytes.
		*/
		@Test
		void testByteArrayToBase64_ThreeBytes() {
				byte[] input = new byte[] {0x00, 0x00, 0x00};
				String expected = "AAAA";
				String actual = Base64.byteArrayToBase64(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the case when the input byte array contains four bytes.
		*/
		@Test
		void testByteArrayToBase64_FourBytes() {
				byte[] input = new byte[] {0x00, 0x00, 0x00, 0x00};
				String expected = "AAAAAA==";
				String actual = Base64.byteArrayToBase64(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the case when the input byte array contains five bytes.
		*/
		@Test
		void testByteArrayToBase64_FiveBytes() {
				byte[] input = new byte[] {0x00, 0x00, 0x00, 0x00, 0x00};
				String expected = "AAAAAAA=";
				String actual = Base64.byteArrayToBase64(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the case when the input byte array contains six bytes.
		*/
		@Test
		void testByteArrayToBase64_SixBytes() {
				byte[] input = new byte[] {0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
				String expected = "AAAAAAAA";
				String actual = Base64.byteArrayToBase64(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the case when the input byte array contains seven bytes.
		*/
		@Test
		void testByteArrayToBase64_SevenBytes() {
				byte[] input = new byte[] {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
				String expected = "AAAAAAAAAA==";
				String actual = Base64.byteArrayToBase64(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the case when the input byte array contains eight bytes.
		*/
		@Test
		void testByteArrayToBase64_EightBytes() {
				byte[] input = new byte[] {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
				String expected = "AAAAAAAAAAA=";
				String actual = Base64.byteArrayToBase64(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the case when the input byte array contains nine bytes.
		*/
		@Test
		void testByteArrayToBase64_NineBytes() {
				byte[] input = new byte[] {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
				String expected = "AAAAAAAAAAAA";
				String actual = Base64.byteArrayToBase64(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the case when the input byte array contains ten bytes.
		*/
		@Test
		void testByteArrayToBase64_TenBytes() {
				byte[] input = new byte[] {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
				String expected = "AAAAAAAAAAAAAA==";
				String actual = Base64.byteArrayToBase64(input);
				assertEquals(expected, actual);
		}
}

// Base64Test4.java
package com.hf.sfm.crypt;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64}.
* It contains ten unit test cases for the {@link Base64#base64ToByteArray(String)} method.
*/
class Base64Test4 {
		
		/**
		* Test case for {@link Base64#base64ToByteArray(String)} method.
		* It tests the case when the input string is empty.
		*/
		@Test
		void testBase64ToByteArray_Empty() {
				String input = "";
				byte[] expected = new byte[0];
				byte[] actual = Base64.base64ToByteArray(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Base64#base64ToByteArray(String)} method.
		* It tests the case when the input string contains only one byte.
		*/
		@Test
		void testBase64ToByteArray_OneByte() {
				String input = "AA==";
				byte[] expected = new byte[] {0x00};
				byte[] actual = Base64.base64ToByteArray(