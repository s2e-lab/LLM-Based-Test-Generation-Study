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

// OAuthEncoderTest2.java
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
class OAuthEncoderTest2 {
		
		@Test
		void testEncode1() {
				String plain = "";
				String expected = "";
				String actual = OAuthEncoder.encode(plain);
				assertEquals(expected, actual);
		}
		
		@Test
		void testEncode2() {
				String plain = "abc";
				String expected = "abc";
				String actual = OAuthEncoder.encode(plain);
				assertEquals(expected, actual);
		}
		
		@Test
		void testEncode3() {
				String plain = "abc def";
				String expected = "abc%20def";
				String actual = OAuthEncoder.encode(plain);
				assertEquals(expected, actual);
		}
		
		@Test
		void testEncode4() {
				String plain = "abc+def";
				String expected = "abc%20def";
				String actual = OAuthEncoder.encode(plain);
				assertEquals(expected, actual);
		}
		
		@Test
		void testEncode5() {
				String plain = "abc*def";
				String expected = "abc%2Adef";
				String actual = OAuthEncoder.encode(plain);
				assertEquals(expected, actual);
		}
		
		@Test
		void testEncode6() {
				String plain = "abc~def";
				String expected = "abc%7Edef";
				String actual = OAuthEncoder.encode(plain);
				assertEquals(expected, actual);
		}
		
		@Test
		void testEncode7() {
				String plain = "abc%def";
				String expected = "abc%25def";
				String actual = OAuthEncoder.encode(plain);
				assertEquals(expected, actual);
		}
		
		@Test
		void testEncode8() {
				String plain = "abc%20def";
				String expected = "abc%2520def";
				String actual = OAuthEncoder.encode(plain);
				assertEquals(expected, actual);
		}
		
		@Test
		void testEncode9() {
				String plain = "abc%2Bdef";
				String expected = "abc%252Bdef";
				String actual = OAuthEncoder.encode(plain);
				assertEquals(expected, actual);
		}
		
		@Test
		void testEncode10() {
				String plain = "abc%2Adef";
				String expected = "abc%252Adef";
				String actual = OAuthEncoder.encode(plain);
				assertEquals(expected, actual);
		}
}

// OAuthRequest.java
package org.scribe.model;

import java.io.*;
import java.net.*;
import java.util.*;
import org.scribe.exceptions.*;
import org.scribe.utils.*;

/**
 * Represents an OAuth HttpRequest
 *
 * @author Pablo Fernandez
 */
public class OAuthRequest {

    private static final String OAUTH_PREFIX = "oauth_";
    private static final String CONTENT_LENGTH = "Content-Length";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String ACCEPT_ENCODING = "Accept-Encoding";
    private static final String USER_AGENT = "User-Agent";
    private static final String ACCEPT = "Accept";
    private static final String AUTHORIZATION = "Authorization";
    private static final String X_ACCEPT = "X-Accept";
    private static final String DEFAULT_CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String DEFAULT_ACCEPT = "*/*";
    private static final String DEFAULT_ACCEPT_ENCODING = "gzip, deflate";
    private static final String DEFAULT_USER_AG