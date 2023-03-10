// OAuthEncoderTest0.java
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
* It contains ten unit test cases for the {@link OAuthEncoder#encode(String)} method.
*/
class OAuthEncoderTest0 {

		@Test
		public void testEncode0() throws Exception {
				String plain = "";
				String result = OAuthEncoder.encode(plain);
				assertEquals("", result);
		}
		
		@Test
		public void testEncode1() throws Exception {
				String plain = "abcdefghijklmnopqrstuvwxyz";
				String result = OAuthEncoder.encode(plain);
				assertEquals("abcdefghijklmnopqrstuvwxyz", result);
		}
		
		@Test
		public void testEncode2() throws Exception {
				String plain = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String result = OAuthEncoder.encode(plain);
				assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", result);
		}
		
		@Test
		public void testEncode3() throws Exception {
				String plain = "0123456789";
				String result = OAuthEncoder.encode(plain);
				assertEquals("0123456789", result);
		}
		
		@Test
		public void testEncode4() throws Exception {
				String plain = "!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
				String result = OAuthEncoder.encode(plain);
				assertEquals("!%40%23%24%25%5E%26*()-_%3D%2B%5B%7B%5D%7D%5C%7C%3B%3A'%22%2C%3C.%3E%2F%3F", result);
		}
		
		@Test
		public void testEncode5() throws Exception {
				String plain = " ";
				String result = OAuthEncoder.encode(plain);
				assertEquals("%20", result);
		}
		
		@Test
		public void testEncode6() throws Exception {
				String plain = "~";
				String result = OAuthEncoder.encode(plain);
				assertEquals("~", result);
		}
		
		@Test
		public void testEncode7() throws Exception {
				String plain = "*";
				String result = OAuthEncoder.encode(plain);
				assertEquals("%2A", result);
		}
		
		@Test
		public void testEncode8() throws Exception {
				String plain = "+";
				String result = OAuthEncoder.encode(plain);
				assertEquals("%20", result);
		}
		
		@Test
		public void testEncode9() throws Exception {
				String plain = "%7E";
				String result = OAuthEncoder.encode(plain);
				assertEquals("~", result);
		}
}