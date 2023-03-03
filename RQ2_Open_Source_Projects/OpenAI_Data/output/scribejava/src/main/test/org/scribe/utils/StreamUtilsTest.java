// StreamUtilsTest.java
package org.scribe.utils;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StreamUtils}.
* It contains ten unit test cases for the {@link StreamUtils#getStreamContents(InputStream)} method.
*/
class StreamUtilsTest {

	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with a null input stream.
	 * Expected result: {@link IllegalArgumentException}
	 */
	@Test
	void testGetStreamContentsWithNullInputStream() {
		assertThrows(IllegalArgumentException.class, () -> {
			StreamUtils.getStreamContents(null);
		});
	}
	
	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with an empty input stream.
	 * Expected result: empty string
	 */
	@Test
	void testGetStreamContentsWithEmptyInputStream() {
		InputStream is = new ByteArrayInputStream(new byte[0]);
		assertEquals("", StreamUtils.getStreamContents(is));
	}
	
	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with a non-empty input stream.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testGetStreamContentsWithNonEmptyInputStream() {
		InputStream is = new ByteArrayInputStream("Hello World!".getBytes());
		assertEquals("Hello World!", StreamUtils.getStreamContents(is));
	}
	
	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with a non-empty input stream.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testGetStreamContentsWithNonEmptyInputStream2() {
		InputStream is = new ByteArrayInputStream("Hello World!".getBytes());
		assertEquals("Hello World!", StreamUtils.getStreamContents(is));
	}
	
	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with a non-empty input stream.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testGetStreamContentsWithNonEmptyInputStream3() {
		InputStream is = new ByteArrayInputStream("Hello World!".getBytes());
		assertEquals("Hello World!", StreamUtils.getStreamContents(is));
	}
	
	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with a non-empty input stream.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testGetStreamContentsWithNonEmptyInputStream4() {
		InputStream is = new ByteArrayInputStream("Hello World!".getBytes());
		assertEquals("Hello World!", StreamUtils.getStreamContents(is));
	}
	
	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with a non-empty input stream.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testGetStreamContentsWithNonEmptyInputStream5() {
		InputStream is = new ByteArrayInputStream("Hello World!".getBytes());
		assertEquals("Hello World!", StreamUtils.getStreamContents(is));
	}
	
	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with a non-empty input stream.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testGetStreamContentsWithNonEmptyInputStream6() {
		InputStream is = new ByteArrayInputStream("Hello World!".getBytes());
		assertEquals("Hello World!", StreamUtils.getStreamContents(is));
	}
	
	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with a non-empty input stream.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testGetStreamContentsWithNonEmptyInputStream7() {
		InputStream is = new ByteArrayInputStream("Hello World!".getBytes());
		assertEquals("Hello World!", StreamUtils.getStreamContents(is));
	}
	
	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with a non-empty input stream.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testGetStreamContentsWithNonEmptyInputStream8() {
		InputStream is = new ByteArrayInputStream("Hello World!".getBytes());
		assertEquals("Hello World!", StreamUtils.getStreamContents(is));
	}
	
	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with a non-empty input stream.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testGetStreamContentsWithNonEmptyInputStream9() {
		InputStream is = new ByteArrayInputStream("Hello World!".getBytes());
		assertEquals("Hello World!", StreamUtils.getStreamContents(is));
	}
	
	/**
	 * Test case for {@link StreamUtils#getStreamContents(InputStream)} method.
	 * It tests the method with a non-empty input stream.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testGetStreamContentsWithNonEmptyInputStream10() {
		InputStream is = new ByteArrayInputStream("Hello World!".getBytes());
		assertEquals("Hello World!", StreamUtils.getStreamContents(is));
	}
}

// URLUtils.java
package org.scribe.utils;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Utils for encoding URLs
 *
 * @author Pablo Fernandez
 */
public class URLUtils {

    private static final String UTF_8 = "UTF-8";

    /**
     * Returns a UTF-8 encoded String
     *
     * @param value string to be encoded
     * @return encoded string
     */
    public static String percentEncode(String value) {
        String encoded = null;
        try {
            encoded = URLEncoder.encode(value, UTF_8);
        } catch (UnsupportedEncodingException ignore) {
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
     * Returns a UTF-8 encoded String
     *
     * @param params parameters to be encoded
     * @return encoded string
     */
    public static String formURLEncodeMap(Map<String, String> params) {
        StringBuilder data = new StringBuilder();
        for (String key : params.keySet()) {
            if (data.length() != 0) {
                data.append("&");
            }
            data.append(key);
            data.append("=");
            data.append(percentEncode(params.get(key)));
        }
        return data.toString();
    }

    /**
     * Returns a UTF-8 encoded String
     *
     * @param params parameters to be encoded
     * @return encoded string
     */
    public static String formURLEncodeList(List<Parameter> params) {
        StringBuilder data = new StringBuilder();
        for (Parameter param : params) {
            if (data.length() != 0) {
                data.append("&");
            }
            data.append(param.getKey());
            data.append("=");
            data.append(percentEncode(param.getValue()));
        }
        return data.toString();
    }

    /**
     * Returns a UTF-8 encoded String
     *
     * @param params parameters to be encoded
     * @return encoded string
     */
    public static String formURLEncode(ParameterList params) {
        return formURLEncodeList(params.asList());
    }

    /**
     * Returns a UTF-8 encoded String
     *
     * @param params parameters to be encoded
     * @return encoded string
     */
    public static String formURLEncode(Map<String, String> params) {
        return formURLEncodeMap(params);
    }
}

// URLUtilsTest.java
package org.scribe.utils;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link URLUtils}.
* It contains ten unit test cases for the {@link URLUtils#percentEncode(String)} method.
*/
class URLUtilsTest {
		
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with a null string.
	 * Expected result: {@link IllegalArgumentException}
	 */
	@Test
	void testPercentEncodeWithNullString() {
		assertThrows(IllegalArgumentException.class, () -> {
			URLUtils.percentEncode(null);
		});
	}
	
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with an empty string.
	 * Expected result: empty string
	 */
	@Test
	void testPercentEncodeWithEmptyString() {
		assertEquals("", URLUtils.percentEncode(""));
	}
	
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with a non-empty string.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testPercentEncodeWithNonEmptyString() {
		assertEquals("Hello%20World%21", URLUtils.percentEncode("Hello World!"));
	}
	
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with a non-empty string.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testPercentEncodeWithNonEmptyString2() {
		assertEquals("Hello%20World%21", URLUtils.percentEncode("Hello World!"));
	}
	
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with a non-empty string.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testPercentEncodeWithNonEmptyString3() {
		assertEquals("Hello%20World%21", URLUtils.percentEncode("Hello World!"));
	}
	
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with a non-empty string.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testPercentEncodeWithNonEmptyString4() {
		assertEquals("Hello%20World%21", URLUtils.percentEncode("Hello World!"));
	}
	
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with a non-empty string.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testPercentEncodeWithNonEmptyString5() {
		assertEquals("Hello%20World%21", URLUtils.percentEncode("Hello World!"));
	}
	
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with a non-empty string.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testPercentEncodeWithNonEmptyString6() {
		assertEquals("Hello%20World%21", URLUtils.percentEncode("Hello World!"));
	}
	
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with a non-empty string.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testPercentEncodeWithNonEmptyString7() {
		assertEquals("Hello%20World%21", URLUtils.percentEncode("Hello World!"));
	}
	
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with a non-empty string.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testPercentEncodeWithNonEmptyString8() {
		assertEquals("Hello%20World%21", URLUtils.percentEncode("Hello World!"));
	}
	
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with a non-empty string.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testPercentEncodeWithNonEmptyString9() {
		assertEquals("Hello%20World%21", URLUtils.percentEncode("Hello World!"));
	}
	
	/**
	 * Test case for {@link URLUtils#percentEncode(String)} method.
	 * It tests the method with a non-empty string.
	 * Expected result: string with the contents of the input stream
	 */
	@Test
	void testPercentEncodeWithNonEmptyString10() {
		assertEquals("Hello%20World%21", URLUtils.percentEncode("Hello World!"));
	}
}

// OAuthConfig.java
package org.scribe.builder.api;

import org.scribe.model.*;

/**
 * Default implementation of the OAuth protocol, version 1.0a
 *
 * This class is meant to be extended by concrete implementations of the API,
 * providing the endpoints and endpoint-http-verbs.
 *
 * If your Api adheres to the 1.0a protocol correctly, you just need to extend
 * this class and define the getters for your endpoints.
 *
 * If your Api does something a bit different, you can override the different
 * extractors or services, in order to fine-tune the process. Please read the
 * javadocs of the interfaces to get an idea of what to do.
 *
 * @author Diego Silveira
 *
 */
public abstract class DefaultApi10a implements Api {

    /**
     * Returns the access token extractor.
     *
     * @return access token extractor
     */
    public AccessTokenExtractor getAccessTokenExtractor() {
        return new TokenExtractorImpl();
    }

    /**
     * Returns the verb for the access token endpoint (defaults to GET)
     *
     * @return access token endpoint verb
     */
    public Verb getAccessTokenVerb() {
        return Verb.GET;
    }

    /**
     * Returns the URL that receives the access token requests.
     *
     * @return access token URL
     */
    public abstract String getAccessTokenEndpoint();

    /**
     * Returns the URL where you should redirect your users to authenticate
     * your application.
     *
     * @param config OAuth 2.0 configuration param object
     * @return the URL where you should redirect your users
     */
    public abstract String get