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
				String encoded = "abcdefghijklmnopqrstuvwxyz";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("abcdefghijklmnopqrstuvwxyz", result);
		}
		
		@Test
		public void testDecode2() throws Exception {
				String encoded = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", result);
		}
		
		@Test
		public void testDecode3() throws Exception {
				String encoded = "0123456789";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("0123456789", result);
		}
		
		@Test
		public void testDecode4() throws Exception {
				String encoded = "!%40%23%24%25%5E%26*()-_%3D%2B%5B%7B%5D%7D%5C%7C%3B%3A'%22%2C%3C.%3E%2F%3F";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?", result);
		}
		
		@Test
		public void testDecode5() throws Exception {
				String encoded = "%20";
				String result = OAuthEncoder.decode(encoded);
				assertEquals(" ", result);
		}
		
		@Test
		public void testDecode6() throws Exception {
				String encoded = "~";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("~", result);
		}
		
		@Test
		public void testDecode7() throws Exception {
				String encoded = "%2A";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("*", result);
		}
		
		@Test
		public void testDecode8() throws Exception {
				String encoded = "%20";
				String result = OAuthEncoder.decode(encoded);
				assertEquals(" ", result);
		}
		
		@Test
		public void testDecode9() throws Exception {
				String encoded = "~";
				String result = OAuthEncoder.decode(encoded);
				assertEquals("~", result);
		}
}

// OAuthRequest.java
package org.scribe.model;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;
import org.scribe.exceptions.*;
import org.scribe.utils.*;

/**
 * Represents an OAuth HttpRequest
 *
 * @author Pablo Fernandez
 */
public class OAuthRequest {

    private static final String OAUTH_PREFIX = "oauth_";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_LENGTH = "Content-Length";
    private static final String ACCEPT_ENCODING = "Accept-Encoding";
    private static final String USER_AGENT = "User-Agent";
    private static final String ACCEPT = "Accept";
    private static final String AUTHORIZATION = "Authorization";
    private static final String WWW_AUTHENTICATE = "WWW-Authenticate";
    private static final String X_AUTH_MODE = "x_auth_mode";
    private static final String X_VERIFY_CREDENTIALS_AUTHORIZATION = "X-Verify-Credentials-Authorization";
    private static final String X_AUTH_SERVICE_PROVIDER = "X-Auth-Service-Provider";
    private static final String X_VERIFY_CREDENTIALS_AUTHORIZATION_HTTP_METHOD = "X-Verify-Credentials-Authorization-HTTP-Method";
    private static final String X_AUTH_SERVICE_PROVIDER_HTTP_METHOD = "X-Auth-Service-Provider-HTTP-Method";
    private static final String X_AUTH_SERVICE_PROVIDER_URL = "X-Auth-Service-Provider-URL";
    private static final String X_AUTH_SERVICE_PROVIDER_BODY_HASH = "X-Auth-Service-Provider-Body-Hash";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS = "X-Auth-Service-Provider-Headers";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH = "X-Auth-Service-Provider-Headers-Hash";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM = "X-Auth-Service-Provider-Headers-Hash-Algorithm";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE = "SHA-256";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_1 = "SHA-1";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_MD5 = "MD5";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_256 = "SHA-256";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_512 = "SHA-512";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_384 = "SHA-384";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_224 = "SHA-224";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_224 = "SHA3-224";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_256 = "SHA3-256";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_384 = "SHA3-384";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512 = "SHA3-512";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_224 = "SHA3-512/224";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_256 = "SHA3-512/256";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_384 = "SHA3-512/384";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512 = "SHA3-512/512";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_224 = "SHA3-512/512/224";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_256 = "SHA3-512/512/256";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_384 = "SHA3-512/512/384";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512 = "SHA3-512/512/512";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_224 = "SHA3-512/512/512/224";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_256 = "SHA3-512/512/512/256";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_384 = "SHA3-512/512/512/384";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_512 = "SHA3-512/512/512/512";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_512_224 = "SHA3-512/512/512/512/224";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_512_256 = "SHA3-512/512/512/512/256";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_512_384 = "SHA3-512/512/512/512/384";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_512_512 = "SHA3-512/512/512/512/512";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_512_512_224 = "SHA3-512/512/512/512/512/224";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_512_512_256 = "SHA3-512/512/512/512/512/256";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_512_512_384 = "SHA3-512/512/512/512/512/384";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_512_512_512 = "SHA3-512/512/512/512/512/512";
    private static final String X_AUTH_SERVICE_PROVIDER_HEADERS_HASH_ALGORITHM_VALUE_SHA_3_512_512_512_512_512_512_224 = "SHA3-512/512/512/512/512/512/224";
    private static final String X_AUTH_