// OAuthEncoderTest1.java
package org.scribe.utils;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;
import org.scribe.exceptions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OAuthEncoder}.
* It contains ten unit test cases for the {@link OAuthEncoder#decode(String)} method.
*/
class OAuthEncoderTest1 {

		@Test
		void testDecode1() {
				String encoded = "";
				String expected = "";
				String actual = OAuthEncoder.decode(encoded);
				assertEquals(expected, actual);
		}
		
		@Test
		void testDecode2() {
				String encoded = "abc";
				String expected = "abc";
				String actual = OAuthEncoder.decode(encoded);
				assertEquals(expected, actual);
		}
		
		@Test
		void testDecode3() {
				String encoded = "abc%20def";
				String expected = "abc def";
				String actual = OAuthEncoder.decode(encoded);
				assertEquals(expected, actual);
		}
		
		@Test
		void testDecode4() {
				String encoded = "abc%2Bdef";
				String expected = "abc+def";
				String actual = OAuthEncoder.decode(encoded);
				assertEquals(expected, actual);
		}
		
		@Test
		void testDecode5() {
				String encoded = "abc%2Adef";
				String expected = "abc*def";
				String actual = OAuthEncoder.decode(encoded);
				assertEquals(expected, actual);
		}
		
		@Test
		void testDecode6() {
				String encoded = "abc%7Edef";
				String expected = "abc~def";
				String actual = OAuthEncoder.decode(encoded);
				assertEquals(expected, actual);
		}
		
		@Test
		void testDecode7() {
				String encoded = "abc%25def";
				String expected = "abc%def";
				String actual = OAuthEncoder.decode(encoded);
				assertEquals(expected, actual);
		}
		
		@Test
		void testDecode8() {
				String encoded = "abc%2520def";
				String expected = "abc%20def";
				String actual = OAuthEncoder.decode(encoded);
				assertEquals(expected, actual);
		}
		
		@Test
		void testDecode9() {
				String encoded = "abc%252Bdef";
				String expected = "abc%2Bdef";
				String actual = OAuthEncoder.decode(encoded);
				assertEquals(expected, actual);
		}
		
		@Test
		void testDecode10() {
				String encoded = "abc%252Adef";
				String expected = "abc%2Adef";
				String actual = OAuthEncoder.decode(encoded);
				assertEquals(expected, actual);
		}
}