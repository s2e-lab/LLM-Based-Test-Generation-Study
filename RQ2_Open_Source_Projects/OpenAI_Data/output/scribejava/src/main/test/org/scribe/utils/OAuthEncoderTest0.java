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
				String plain = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~";
				String result = OAuthEncoder.encode(plain);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~", result);
		}
		
		@Test
		public void testEncode2() throws Exception {
				String plain = "!#$&'()*+,/:;=?@[]";
				String result = OAuthEncoder.encode(plain);
				assertEquals("%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D", result);
		}
		
		@Test
		public void testEncode3() throws Exception {
				String plain = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]";
				String result = OAuthEncoder.encode(plain);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D", result);
		}
		
		@Test
		public void testEncode4() throws Exception {
				String plain = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]%";
				String result = OAuthEncoder.encode(plain);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25", result);
		}
		
		@Test
		public void testEncode5() throws Exception {
				String plain = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]% ";
				String result = OAuthEncoder.encode(plain);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25%20", result);
		}
		
		@Test
		public void testEncode6() throws Exception {
				String plain = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]% \"";
				String result = OAuthEncoder.encode(plain);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25%20%22", result);
		}
		
		@Test
		public void testEncode7() throws Exception {
				String plain = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]% \"#";
				String result = OAuthEncoder.encode(plain);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25%20%22%23", result);
		}
		
		@Test
		public void testEncode8() throws Exception {
				String plain = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]% \"#$%";
				String result = OAuthEncoder.encode(plain);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25%20%22%23%24%25", result);
		}
		
		@Test
		public void testEncode9() throws Exception {
				String plain = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]% \"#$%&";
				String result = OAuthEncoder.encode(plain);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25%20%22%23%24%25%26", result);
		}
		
}

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
		public void testDecode0() throws Exception {
				String encoded = "";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("", result);
		}
		
		@Test
		public void testDecode1() throws Exception {
				String encoded = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~", result);
		}
		
		@Test
		public void testDecode2() throws Exception {
				String encoded = "%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("!#$&'()*+,/:;=?@[]", result);
		}
		
		@Test
		public void testDecode3() throws Exception {
				String encoded = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]", result);
		}
		
		@Test
		public void testDecode4() throws Exception {
				String encoded = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]%", result);
		}
		
		@Test
		public void testDecode5() throws Exception {
				String encoded = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25%20";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]% ", result);
		}
		
		@Test
		public void testDecode6() throws Exception {
				String encoded = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25%20%22";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]% \"", result);
		}
		
		@Test
		public void testDecode7() throws Exception {
				String encoded = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25%20%22%23";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]% \"#", result);
		}
		
		@Test
		public void testDecode8() throws Exception {
				String encoded = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25%20%22%23%24%25";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]% \"#$%", result);
		}
		
		@Test
		public void testDecode9() throws Exception {
				String encoded = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~%21%23%24%26%27%28%29%2A%2B%2C%2F%3A%3B%3D%3F%40%5B%5D%25%20%22%23%24%25%26";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~!#$&'()*+,/:;=?@[]% \"#$%&", result);
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
    private static final String PROXY_AUTHORIZATION = "Proxy-Authorization";
    private static final String WWW_AUTHENTICATE = "WWW-Authenticate";
    private static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";
    private