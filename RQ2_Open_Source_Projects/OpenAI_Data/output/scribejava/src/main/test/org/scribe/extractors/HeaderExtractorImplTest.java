// HeaderExtractorImplTest.java
package org.scribe.extractors;

import java.util.*;
import org.scribe.exceptions.*;
import org.scribe.model.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderExtractorImpl}.
* It contains ten unit test cases for the {@link HeaderExtractorImpl#extract(OAuthRequest)} method.
*/
class HeaderExtractorImplTest {

		private HeaderExtractorImpl extractor = new HeaderExtractorImpl();
		
		@Test
		public void shouldThrowExceptionIfRequestIsNull() {
				OAuthRequest request = null;
				assertThrows(OAuthParametersMissingException.class, () -> {
						extractor.extract(request);
				});
		}
		
		@Test
		public void shouldThrowExceptionIfRequestHasNoOAuthParams() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				assertThrows(OAuthParametersMissingException.class, () -> {
						extractor.extract(request);
				});
		}
		
		@Test
		public void shouldReturnCorrectHeader() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresent() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("Example");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\", realm=\"Example\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndEmpty() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndNull() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm(null);
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndBlank() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm(" ");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndTab() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("\t");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndNewline() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("\n");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndCarriageReturn() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("\r");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndFormFeed() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("\f");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndBackspace() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("\b");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndVerticalTab() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("\u000B");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndBackspace2() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("\u0008");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample.com%3Fhello%3Dthere\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndBackspace3() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, OAuthEncoder.encode("http://example.com?hello=there"));
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("\u0008");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"