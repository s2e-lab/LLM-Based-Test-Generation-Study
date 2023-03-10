// Base64Test0.java
package com.hf.sfm.crypt;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64}.
* It contains ten unit test cases for the {@link Base64#altBase64ToByteArray(String)} method.
*/
class Base64Test0 {

		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray0() {
				String s = "";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray1() {
				String s = "!";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray2() {
				String s = "\"";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray3() {
				String s = "#";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray4() {
				String s = "$";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray5() {
				String s = "%";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray6() {
				String s = "&";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray7() {
				String s = "'";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray8() {
				String s = "(";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray9() {
				String s = ")";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
}

// Base64Test1.java
package com.hf.sfm.crypt;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64}.
* It contains ten unit test cases for the {@link Base64#altBase64ToByteArray(String)} method.
*/
class Base64Test1 {
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray0() {
				String s = ",";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray1() {
				String s = "-";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray2() {
				String s = ".";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray3() {
				String s = ":";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray4() {
				String s = ";";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray5() {
				String s = "<";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray6() {
				String s = ">";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void testAltBase64ToByteArray7() {
				String s = "@";
				byte[] b = Base64.altBase64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case for the {@link Base64#altBase64ToByteArray(String)} method.
		*/
		@Test
		void