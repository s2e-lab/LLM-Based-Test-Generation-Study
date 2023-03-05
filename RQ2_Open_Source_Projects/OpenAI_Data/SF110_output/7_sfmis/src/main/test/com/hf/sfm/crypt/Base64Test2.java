// Base64Test2.java
package com.hf.sfm.crypt;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64}.
* It contains ten unit test cases for the {@link Base64#byteArrayToAltBase64(byte[])} method.
*/
class Base64Test2 {

		/**
		* Test case for {@link Base64#byteArrayToAltBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToAltBase64() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
				String s = Base64.byteArrayToAltBase64(b);
				assertEquals("AAECAwQFBgcICQ==", s);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToAltBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToAltBase64_2() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				String s = Base64.byteArrayToAltBase64(b);
				assertEquals("AAECAwQFBgcICQo=", s);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToAltBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToAltBase64_3() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
				String s = Base64.byteArrayToAltBase64(b);
				assertEquals("AAECAwQFBgcICQoL", s);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToAltBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToAltBase64_4() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
				String s = Base64.byteArrayToAltBase64(b);
				assertEquals("AAECAwQFBgcICQoLDA==", s);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToAltBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToAltBase64_5() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
				String s = Base64.byteArrayToAltBase64(b);
				assertEquals("AAECAwQFBgcICQoLDA0=", s);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToAltBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToAltBase64_6() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
				String s = Base64.byteArrayToAltBase64(b);
				assertEquals("AAECAwQFBgcICQoLDA0O", s);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToAltBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToAltBase64_7() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
				String s = Base64.byteArrayToAltBase64(b);
				assertEquals("AAECAwQFBgcICQoLDA0OEA==", s);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToAltBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToAltBase64_8() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
				String s = Base64.byteArrayToAltBase64(b);
				assertEquals("AAECAwQFBgcICQoLDA0OEBAR", s);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToAltBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToAltBase64_9() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
				String s = Base64.byteArrayToAltBase64(b);
				assertEquals("AAECAwQFBgcICQoLDA0OEBESEg==", s);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToAltBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToAltBase64_10() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
				String s = Base64.byteArrayToAltBase64(b);
				assertEquals("AAECAwQFBgcICQoLDA0OEBESEhIU", s);
		}
}

// Base64Test.java
package com.hf.sfm.crypt;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64}.
* It contains ten unit test cases for the {@link Base64#byteArrayToBase64(byte[])} method.
*/
class Base64Test {
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToBase64() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
				String s = Base64.byteArrayToBase64(b);
				assertEquals("AAECAwQFBgcICQ==", s);
		}
		
		/**
		* Test case for {@link Base64#byteArrayToBase64(byte[])} method.
		* It tests the conversion of a byte array to a base64 string.
		*/
		@Test
		void testByteArrayToBase64_2() {
				byte[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				String s = Base64.byteArrayToBase64(b);
				assertEquals("AAECAwQFBgcJCg==", s);
		}
		
		/**
		* Test case for {@link Base64#byteArrayTo