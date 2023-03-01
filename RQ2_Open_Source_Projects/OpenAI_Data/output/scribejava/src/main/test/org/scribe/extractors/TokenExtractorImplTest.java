// TokenExtractorImplTest.java
package org.scribe.extractors;

import java.util.regex.*;
import org.scribe.exceptions.*;
import org.scribe.model.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TokenExtractorImpl}.
* It contains ten unit test cases for the {@link TokenExtractorImpl#extract(String)} method.
*/
class TokenExtractorImplTest {

		private TokenExtractorImpl tokenExtractorImpl;
		
		public TokenExtractorImplTest() {
			tokenExtractorImpl = new TokenExtractorImpl();
		}
		
		@Test
		public void testExtract() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractorImpl.extract(response);
			assertEquals("hh5s93j4hdidpola", token.getToken());
			assertEquals("hdhd0244k9j7ao03", token.getSecret());
			assertEquals(response, token.getRawResponse());
		}
		
		@Test
		public void testExtractWithEmptyResponse() {
			String response = "";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithNullResponse() {
			String response = null;
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithResponseWithoutToken() {
			String response = "oauth_token_secret=hdhd0244k9j7ao03";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithResponseWithoutSecret() {
			String response = "oauth_token=hh5s93j4hdidpola";
			assertThrows(OAuthException.class, () -> {
				tokenExtractorImpl.extract(response);
			});
		}
		
		@Test
		public void testExtractWithResponseWithTokenAndSecret() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola";
			Token token = tokenExtractorImpl.extract(response);
			assertEquals("hh5s93j4hdidpola", token.getToken());
			assertEquals("hdhd0244k9j7ao03", token.getSecret());
			assertEquals(response, token.getRawResponse());
		}
		
		@Test
		public void testExtractWithResponseWithSecretAndToken() {
			String response = "oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractorImpl.extract(response);
			assertEquals("hh5s93j4hdidpola", token.getToken());
			assertEquals("hdhd0244k9j7ao03", token.getSecret());
			assertEquals(response, token.getRawResponse());
		}
		
		@Test
		public void testExtractWithResponseWithTokenAndSecretAndOtherParameters() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractorImpl.extract(response);
			assertEquals("hh5s93j4hdidpola", token.getToken());
			assertEquals("hdhd0244k9j7ao03", token.getSecret());
			assertEquals(response, token.getRawResponse());
		}
		
		@Test
		public void testExtractWithResponseWithTokenAndSecretAndOtherParametersAndOtherParameters() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractorImpl.extract(response);
			assertEquals("hh5s93j4hdidpola", token.getToken());
			assertEquals("hdhd0244k9j7ao03", token.getSecret());
			assertEquals(response, token.getRawResponse());
		}
		
		@Test
		public void testExtractWithResponseWithTokenAndSecretAndOtherParametersAndOtherParametersAndOtherParameters() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractorImpl.extract(response);
			assertEquals("hh5s93j4hdidpola", token.getToken());
			assertEquals("hdhd0244k9j7ao03", token.getSecret());
			assertEquals(response, token.getRawResponse());
		}
		
		@Test
		public void testExtractWithResponseWithTokenAndSecretAndOtherParametersAndOtherParametersAndOtherParametersAndOtherParameters() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03";
			Token token = tokenExtractorImpl.extract(response);
			assertEquals("hh5s93j4hdidpola", token.getToken());
			assertEquals("hdhd0244k9j7ao03", token.getSecret());
			assertEquals(response, token.getRawResponse());
		}
		
		@Test
		public void testExtractWithResponseWithTokenAndSecretAndOtherParametersAndOtherParametersAndOtherParametersAndOtherParametersAndOtherParameters() {
			String response = "oauth_token=hh5s93j4hdidpola&oauth_token_secret=hdhd0244k9j7ao03&oauth_token=hh5s93j4h