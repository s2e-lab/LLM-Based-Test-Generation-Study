// OAuthConfigTest.java
package org.scribe.model;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OAuthConfig}.
* It contains ten unit test cases for the {@link OAuthConfig#hasScope()} method.
*/
class OAuthConfigTest {

		private static final String API_KEY = "apiKey";
		private static final String API_SECRET = "apiSecret";
		private static final String CALLBACK = "callback";
		private static final SignatureType SIGNATURE_TYPE = SignatureType.Header;
		private static final String SCOPE = "scope";
		private static final OutputStream DEBUG_STREAM = new ByteArrayOutputStream();
		
		@Test
		public void testHasScope() {
				OAuthConfig config = new OAuthConfig(API_KEY, API_SECRET, CALLBACK, SIGNATURE_TYPE, SCOPE, DEBUG_STREAM);
				assertTrue(config.hasScope());
		}
		
		@Test
		public void testHasScope2() {
				OAuthConfig config = new OAuthConfig(API_KEY, API_SECRET, CALLBACK, SIGNATURE_TYPE, null, DEBUG_STREAM);
				assertFalse(config.hasScope());
		}
		
		@Test
		public void testHasScope3() {
				OAuthConfig config = new OAuthConfig(API_KEY, API_SECRET, CALLBACK, SIGNATURE_TYPE, "", DEBUG_STREAM);
				assertFalse(config.hasScope());
		}
		
		@Test
		public void testHasScope4() {
				OAuthConfig config = new OAuthConfig(API_KEY, API_SECRET, CALLBACK, SIGNATURE_TYPE, " ", DEBUG_STREAM);
				assertTrue(config.hasScope());
		}
		
		@Test
		public void testHasScope5() {
				OAuthConfig config = new OAuthConfig(API_KEY, API_SECRET, CALLBACK, SIGNATURE_TYPE, "scope1 scope2", DEBUG_STREAM);
				assertTrue(config.hasScope());
		}
		
		@Test
		public void testHasScope6() {
				OAuthConfig config = new OAuthConfig(API_KEY, API_SECRET, CALLBACK, SIGNATURE_TYPE, "scope1 scope2 ", DEBUG_STREAM);
				assertTrue(config.hasScope());
		}
		
		@Test
		public void testHasScope7() {
				OAuthConfig config = new OAuthConfig(API_KEY, API_SECRET, CALLBACK, SIGNATURE_TYPE, " scope1 scope2", DEBUG_STREAM);
				assertTrue(config.hasScope());
		}
		
		@Test
		public void testHasScope8() {
				OAuthConfig config = new OAuthConfig(API_KEY, API_SECRET, CALLBACK, SIGNATURE_TYPE, " scope1 scope2 ", DEBUG_STREAM);
				assertTrue(config.hasScope());
		}
		
		@Test
		public void testHasScope9() {
				OAuthConfig config = new OAuthConfig(API_KEY, API_SECRET, CALLBACK, SIGNATURE_TYPE, " scope1  scope2 ", DEBUG_STREAM);
				assertTrue(config.hasScope());
		}
		
		@Test
		public void testHasScope10() {
				OAuthConfig config = new OAuthConfig(API_KEY, API_SECRET, CALLBACK, SIGNATURE_TYPE, " scope1  scope2  ", DEBUG_STREAM);
				assertTrue(config.hasScope());
		}
}

// OAuthRequest.java
package org.scribe.model;

import java.io.*;
import java.net.*;
import java.util.*;

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

    private static final String AUTHORIZATION_HEADER = "Authorization";

    private static final String ACCEPT = "Accept";

    private static final String USER_AGENT = "User-Agent";

    private static final String X_ACCEPTED_OAUTH_SCOPES = "X-Accepted-OAuth-Scopes";

    private static final String X_OAUTH_ACCEPTED_SCOPES = "X-OAuth-Accepted-Scopes";

    private static final String X_ACCEPTED_OAUTH_SCOPES_HEADER = X_ACCEPTED_OAUTH_SCOPES + ": ";

    private static final String X_OAUTH_ACCEPTED_SCOPES_HEADER = X_OAUTH_ACCEPTED_SCOPES + ": ";

    private static final String ACCEPT_HEADER = ACCEPT + ": ";

    private static final String USER_AGENT_HEADER = USER_AGENT + ": ";

    private static final String CONTENT_LENGTH_HEADER = CONTENT_LENGTH + ": ";

    private static final String CONTENT_TYPE_HEADER = CONTENT_TYPE + ": ";

    private static final String ACCEPT_ENCODING_HEADER = ACCEPT_ENCODING + ": ";

    private static final String AUTHORIZATION_HEADER_NAME = AUTHORIZATION_HEADER + ": ";

    private static final String UTF8 = "UTF-8";

    private static final String HMAC_SHA1 = "HmacSHA1";

    private static final String RSA_SHA1 = "RSA-SHA1";

    private static final String PLAIN_TEXT = "PLAINTEXT";

    private static final String VERSION = "1.0";

    private static final String HEADER = "OAuth ";

    private static final String SCOPE_DELIMITER = ",";

    private static final String PARAM_SEPARATOR = "&";

    private static final String NAME_VALUE_SEPARATOR = "=";

    private static final String EQUALS = "=";

    private static final String QUESTIONMARK = "?";

    private static final String AMPERSAND = "&";

    private static final String COMMA = ",";

    private static final String COLON = ":";

    private static final String SPACE = " ";

    private static final String EMPTY_STRING = "";

    private static final String SLASH = "/";

    private static final String HTTP_SCHEME = "http";

    private static final String HTTPS_SCHEME = "https";

    private static final String HTTP_PORT = "80";

    private static final String HTTPS_PORT = "443";

    private static final String HTTP_POST = "POST";

    private static final String HTTP_GET = "GET";

    private static final String HTTP_DELETE = "DELETE";

    private static final String HTTP_PUT = "PUT";

    private static final String OAUTH_BODY_HASH = "oauth_body_hash";

    private static final String OAUTH_CALLBACK = "oauth_callback";

    private static final String OAUTH_CALLBACK_CONFIRMED = "oauth_callback_confirmed";

    private static final String OAUTH_CONSUMER_KEY = "oauth_consumer_key";

    private static final String OAUTH_NONCE = "oauth_nonce";

    private static final String OAUTH_SIGNATURE = "oauth_signature";

    private static final String OAUTH_SIGNATURE_METHOD = "oauth_signature_method";

    private static final String OAUTH_TIMESTAMP = "oauth_timestamp";

    private static final String OAUTH_TOKEN = "oauth_token";

    private static final String OAUTH_TOKEN_SECRET = "oauth_token_secret";

    private static final String OAUTH_VERIFIER = "oauth_verifier";

    private static final String OAUTH_VERSION = "oauth_version";

    private static final String OUT_OF_BAND = "oob";

    private static final String HMAC_SHA1_SIGNATURE_TYPE = "HMAC-SHA1";

    private static final String RSA_SHA1_SIGNATURE_TYPE = "RSA-SHA1";

    private static final String PLAINTEXT_SIGNATURE