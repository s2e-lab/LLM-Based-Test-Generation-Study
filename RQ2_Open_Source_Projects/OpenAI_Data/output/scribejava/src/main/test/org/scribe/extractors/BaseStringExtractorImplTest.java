// BaseStringExtractorImplTest.java
package org.scribe.extractors;

import org.scribe.exceptions.*;
import org.scribe.model.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BaseStringExtractorImpl}.
* It contains ten unit test cases for the {@link BaseStringExtractorImpl#extract(OAuthRequest)} method.
*/
class BaseStringExtractorImplTest {

	private BaseStringExtractorImpl extractor = new BaseStringExtractorImpl();
	
	@Test
	void shouldThrowExceptionIfRequestIsNull() {
		assertThrows(OAuthParametersMissingException.class, () -> {
			extractor.extract(null);
		});
	}
	
	@Test
	void shouldThrowExceptionIfRequestHasNoOAuthParameters() {
		OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
		assertThrows(OAuthParametersMissingException.class, () -> {
			extractor.extract(request);
		});
	}
	
	@Test
	void shouldReturnCorrectBaseString() {
		OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com");
		request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
		request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
		String expected = "GET&http%3A%2F%2Fexample.com&" + OAuthEncoder.encode("callback") + "%3Dhttp%253A%252F%252Fexample%252Fcallback%253Fx%253D5%2526y%253D6%26" + OAuthEncoder.encode("consumer_key") + "%3DAS%2523%2524%255E%252A%2540%2526%26" + OAuthEncoder.encode("oauth_signature") + "%3DOAuth-Signature%26" + OAuthEncoder.encode("oauth_timestamp") + "%3D123456";
		String actual = extractor.extract(request);
		assertEquals(expected, actual);
	}
	
	@Test
	void shouldIncludeQueryStringParametersInBaseString() {
		OAuthRequest request = new OAuthRequest(Verb.GET, "http://example.com?q=1");
		request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
		request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
		String expected = "GET&http%3A%2F%2Fexample.com&" + OAuthEncoder.encode("callback") + "%3Dhttp%253A%252F%252Fexample%252Fcallback%253Fx%253D5%2526y%253D6%26" + OAuthEncoder.encode("consumer_key") + "%3DAS%2523%2524%255E%252A%2540%2526%26" + OAuthEncoder.encode("oauth_signature") + "%3DOAuth-Signature%26" + OAuthEncoder.encode("oauth_timestamp") + "%3D123456%26q%3D1";
		String actual = extractor.extract(request);
		assertEquals(expected, actual);
	}
	
	@Test
	void shouldIncludeBodyParametersInBaseString() {
		OAuthRequest request = new OAuthRequest(Verb.POST, "http://example.com");
		request.addBodyParameter("q", "1");
		request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
		request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
		String expected = "POST&http%3A%2F%2Fexample.com&" + OAuthEncoder.encode("callback") + "%3Dhttp%253A%252F%252Fexample%252Fcallback%253Fx%253D5%2526y%253D6%26" + OAuthEncoder.encode("consumer_key") + "%3DAS%2523%2524%255E%252A%2540%2526%26" + OAuthEncoder.encode("oauth_signature") + "%3DOAuth-Signature%26" + OAuthEncoder.encode("oauth_timestamp") + "%3D123456%26q%3D1";
		String actual = extractor.extract(request);
		assertEquals(expected, actual);
	}
	
	@Test
	void shouldIncludeQueryStringParametersAndBodyParametersInBaseString() {
		OAuthRequest request = new OAuthRequest(Verb.POST, "http://example.com?q=1");
		request.addBodyParameter("q", "2");
		request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
		request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
		String expected = "POST&http%3A%2F%2Fexample.com&" + OAuthEncoder.encode("callback") + "%3Dhttp%253A%252F%252Fexample%252Fcallback%253Fx%253D5%2526y%253D6%26" + OAuthEncoder.encode("consumer_key") + "%3DAS%2523%2524%255E%252A%2540%2526%26" + OAuthEncoder.encode("oauth_signature") + "%3DOAuth-Signature%26" + OAuthEncoder.encode("oauth_timestamp") + "%3D123456%26q%3D1%26q%3D2";
		String actual = extractor.extract(request);
		assertEquals(expected, actual);
	}
	
	@Test
	void shouldIncludeQueryStringParametersAndBodyParametersInBaseStringAndSortThem() {
		OAuthRequest request = new OAuthRequest(Verb.POST, "http://example.com?q=1");
		request.addBodyParameter("q", "2");
		request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
		request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
		String expected = "POST&http%3A%2F%2Fexample.com&" + OAuthEncoder.encode("callback") + "%3Dhttp%253A%252F%252Fexample%252Fcallback%253Fx%253D5%2526y%253D6%26" + OAuthEncoder.encode("consumer_key") + "%3DAS%2523%2524%255E%252A%2540%2526%26" + OAuthEncoder.encode("oauth_signature") + "%3DOAuth-Signature%26" + OAuthEncoder.encode("oauth_timestamp") + "%3D123456%26q%3D1%26q%3D2";
		String actual = extractor.extract(request);
		assertEquals(expected, actual);
	}
	
	@Test
	void shouldIncludeQueryStringParametersAndBodyParametersInBaseStringAndSortThemAndEncodeThem() {
		OAuthRequest request = new OAuthRequest(Verb.POST, "http://example.com?q=1");
		request.addBodyParameter("q", "2");
		request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
		request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
		String expected = "POST&http%3A%2F%2Fexample.com&" + OAuthEncoder.encode("callback") + "%3Dhttp%253A%252F%252Fexample%252Fcallback%253Fx%253D5%2526y%253D6%26" + OAuthEncoder.encode("consumer_key") + "%3DAS%2523%2524%255E%252A%2540%2526%26" + OAuthEncoder.encode("oauth_signature") + "%3DOAuth-Signature%26" + OAuthEncoder.encode("oauth_timestamp") + "%3D123456%26q%3D1%26q%3D2";
		String actual = extractor.extract(request);
		assertEquals(expected, actual);
	}
	
	@Test
	void shouldIncludeQueryStringParametersAndBodyParametersInBaseStringAndSortThemAndEncodeThemAndConcatenateThem() {
		OAuthRequest request = new OAuthRequest(Verb.POST, "http://example.com?q=1");
		request.addBodyParameter("q", "2");
		request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
		request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
		String expected = "POST&http%3A%2F%2Fexample.com&" + OAuthEncoder.encode("callback") + "%3Dhttp%253A%252F%252Fexample%252Fcallback%253Fx%253D5%2526y%253D6%26" + OAuthEncoder.encode("consumer_key") + "%3DAS%2523%2524%255E%252A%2540%2526%26" + OAuthEncoder.encode("oauth_signature") + "%3DOAuth-Signature%26" + OAuthEncoder.encode("oauth_timestamp") + "%3D123456%26q%3D1%26q%3D2";
		String actual = extractor.extract(request);
		assertEquals(expected, actual);
	}
	
	@Test
	void shouldIncludeQueryStringParametersAndBodyParametersInBaseStringAndSortThemAndEncodeThemAndConcatenateThemAndReturnThem() {
		OAuthRequest request = new OAuthRequest(Verb.POST, "http://example.com?q=1");
		request.addBodyParameter("q", "2");
		request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
		request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
		String expected = "POST&http%3A%2F%2Fexample.com&" + OAuthEncoder.encode("callback") + "%3Dhttp%253A%252F%252Fexample%252Fcallback%253Fx%253D5%2526y%253D6%26" + OAuthEncoder.encode("consumer_key") + "%3DAS%2523%2524%255E%252A%2540%2526%26" + OAuthEncoder.encode("oauth_signature") + "%3DOAuth-Signature%26" + OAuthEncoder.encode("oauth_timestamp") + "%3D123456%26q%3D1%26q%3D2";
		String actual = extractor.extract(request);
		assertEquals(expected, actual);
	}
	
	@Test
	void shouldIncludeQueryStringParametersAndBodyParametersInBaseStringAndSortThemAndEncodeThemAndConcatenateThemAndReturnThemAndFinish() {
		OAuthRequest request = new OAuthRequest(Verb.POST, "http://example.com?q=1");
		request.addBodyParameter("q", "2");
		request.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		request.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		request.addOAuthParameter(OAuthConstants.CALLBACK, "http://example/callback?x=5&y=6");
		request.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
		String expected = "POST&http%3A%2F%2Fexample.com&" + OAuthEncoder.encode("callback") + "%3Dhttp%253A%252F%252Fexample%252Fcallback%253Fx%253D5%2526y%253D6%26" + OAuthEncoder.encode("consumer_key") + "%3DAS%2523%2524%255E%252A%2540%2526%26" + OAuthEncoder.encode("oauth_signature") + "%3DOAuth-Signature%26" + OAuthEncoder.encode("oauth_timestamp") + "%3D123456%26q%3D1%26q%3D2";
		String actual = extractor.extract(request);
		assertEquals(expected, actual);
	}
	
}

// OAuthEncoder.java
package org.scribe.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Encodes strings using UTF-8 encoding scheme.
 *
 * @author Pablo Fernandez
 */
public class OAuthEncoder {

    private OAuthEncoder() {
    }

    /**
     * Encodes a string using the UTF-8 scheme.
     *
     * @param plain
     *            string to be encoded
     * @return encoded string
     */
    public static String encode(String plain) {
        try {
            return URLEncoder.encode(plain, "UTF-8");
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException("Unsupported encoding", uee);
        }
    }

    /**
     * Decodes a string using the UTF-8 scheme.
     *
     * @param encoded
     *            string to be decoded
     * @return decoded string
     */
    public static String decode(String encoded) {
        try {
            return URLDecoder.decode(encoded, "UTF-8");
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException("Unsupported encoding", uee);
        }
    }
}

// OAuthEncoderTest.java
package org.scribe.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OAuthEncoder}.
* It contains ten unit test cases for the {@link OAuthEncoder#encode(String)} method.
*/
class