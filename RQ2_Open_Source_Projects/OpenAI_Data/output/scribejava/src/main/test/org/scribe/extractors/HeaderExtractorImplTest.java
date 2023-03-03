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
				request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample%2Fcallback%3Fx%3D5%26y%3D6\", oauth_signature=\"OAuth-Signature\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresent() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("Example");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample%2Fcallback%3Fx%3D5%26y%3D6\", oauth_signature=\"OAuth-Signature\", realm=\"Example\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndEmpty() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample%2Fcallback%3Fx%3D5%26y%3D6\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndNull() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm(null);
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample%2Fcallback%3Fx%3D5%26y%3D6\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndBlank() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm(" ");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample%2Fcallback%3Fx%3D5%26y%3D6\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndOnlySpaces() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("   ");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample%2Fcallback%3Fx%3D5%26y%3D6\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndOnlyTabs() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("\t\t\t");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample%2Fcallback%3Fx%3D5%26y%3D6\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndOnlyNewLines() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("\n\n\n");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample%2Fcallback%3Fx%3D5%26y%3D6\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndOnlyCarriageReturns() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm("\r\r\r");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample%2Fcallback%3Fx%3D5%26y%3D6\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndOnlySpacesTabsNewLinesAndCarriageReturns() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm(" \t\n\r");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample%2Fcallback%3Fx%3D5%26y%3D6\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
		@Test
		public void shouldIncludeRealmParameterIfPresentAndOnlySpacesTabsNewLinesAndCarriageReturnsAndOtherCharacters() {
				OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
				request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
				request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
				request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
				request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
				request.setRealm(" \t\n\r!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?`~");
				String header = extractor.extract(request);
				assertEquals("OAuth oauth_timestamp=\"123456\", oauth_consumer_key=\"AS%23%24%5E*%40%26\", oauth_callback=\"http%3A%2F%2Fexample%2Fcallback%3Fx%3D5%26y%3D6\", oauth_signature=\"OAuth-Signature\", realm=\"\"", header);
		}
		
}

// OAuthEncoder.java
package org.scribe.utils;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Encodes a string using <a href="http://oauth.net/core/1.0/#encoding_parameters">OAuth URL encoding</a>
 *
 * @author Pablo Fernandez
 */
public class OAuthEncoder {

    /**
     * Encodes a string using the OAuth url-encoding method.
     *
     * @param plain
     *            string to encode
     * @return encoded string
     */
    public static String encode(String plain) {
        String encoded = "";
        try {
            encoded = URLEncoder.encode(plain, "UTF-8");
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException(uee.getMessage(), uee);
        }
        StringBuilder buf = new StringBuilder(encoded.length());
        char focus;
        for (int i = 0; i < encoded.length(); i++) {
            focus = encoded.charAt(i);
            if (focus == '*') {
                buf.append("%2A");
            } else if (focus == '+') {
                buf.append("%20");
            } else if (focus == '%' && (i + 1) < encoded.length() && encoded.charAt(i + 1) == '7' && encoded.charAt(i + 2) == 'E') {
                buf.append('~');
                i += 2;
            } else {
                buf.append(focus);
            }
        }
        return buf.toString();
    }

    /**
     * Decodes a string using the OAuth url-encoding method.
     *
    