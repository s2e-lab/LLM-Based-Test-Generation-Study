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