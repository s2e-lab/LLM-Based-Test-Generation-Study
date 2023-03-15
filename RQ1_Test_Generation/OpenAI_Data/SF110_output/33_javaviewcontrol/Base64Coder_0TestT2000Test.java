// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {

		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "Man".
		*/
		@Test
		void testEncodeString_0() {
				String input = "Man";
				String expected = "TWFu";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "Ma".
		*/
		@Test
		void testEncodeString_1() {
				String input = "Ma";
				String expected = "TWE=";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "M".
		*/
		@Test
		void testEncodeString_2() {
				String input = "M";
				String expected = "TQ==";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "Man is all".
		*/
		@Test
		void testEncodeString_3() {
				String input = "Man is all";
				String expected = "TWFuIGlzIGFsbA==";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "any carnal pleasure.".
		*/
		@Test
		void testEncodeString_4() {
				String input = "any carnal pleasure.";
				String expected = "YW55IGNhcm5hbCBwbGVhc3VyZS4=";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "any carnal pleasure".
		*/
		@Test
		void testEncodeString_5() {
				String input = "any carnal pleasure";
				String expected = "YW55IGNhcm5hbCBwbGVhc3VyZQ==";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "any carnal pleasur".
		*/
		@Test
		void testEncodeString_6() {
				String input = "any carnal pleasur";
				String expected = "YW55IGNhcm5hbCBwbGVhc3Vy";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "any carnal pleasu".
		*/
		@Test
		void testEncodeString_7() {
				String input = "any carnal pleasu";
				String expected = "YW55IGNhcm5hbCBwbGVhc3U=";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "any carnal pleas".
		*/
		@Test
		void testEncodeString_8() {
				String input = "any carnal pleas";
				String expected = "YW55IGNhcm5hbCBwbGVhcw==";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "pleasure.".
		*/
		@Test
		void testEncodeString_9() {
				String input = "pleasure.";
				String expected = "cGxlYXN1cmUu";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
}
// end class Base64Coder_0Test

// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_1Test {
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "TWFu".
		*/
		@Test
		void testDecodeString_0() {
				String input = "TWFu";
				String expected = "Man";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "TWE=".
		*/
		@Test
		void testDecodeString_1() {
				String input = "TWE=";
				String expected = "Ma";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "TQ==".
		*/
		@Test
		void testDecodeString_2() {
				String input = "TQ==";
				String expected = "M";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "TWFuIGlzIGFsbA==".
		*/
		@Test
		void testDecodeString_3() {
				String input = "TWFuIGlzIGFsbA==";
			