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
    private static final String DEFAULT_USER_AGENT = "ScribeJava/1.3.5";

    private String url;
    private Verb verb;
    private ParameterList querystringParams;
    private ParameterList bodyParams;
    private Map<String, String> headers;
    private String payload = null;
    private String charset;
    private byte[] bytePayload = null;
    private boolean connectionKeepAlive = false;
    private boolean followRedirects = true;
    private boolean ignoreCloseExceptions = true;
    private int connectTimeout = 0;
    private int readTimeout = 0;
    private String userAgent = DEFAULT_USER_AGENT;
    private String accept = DEFAULT_ACCEPT;
    private String acceptEncoding = DEFAULT_ACCEPT_ENCODING;
    private String contentType = DEFAULT_CONTENT_TYPE;

    /**
     * Default constructor.
     *
     * @param verb Http verb/method
     * @param url resource URL
     */
    public OAuthRequest(Verb verb, String url) {
        this.verb = verb;
        this.url = url;
        this.querystringParams = new ParameterList();
        this.bodyParams = new ParameterList();
        this.headers = new HashMap<String, String>();
    }

    /**
     * Adds an OAuth parameter.
     *
     * @param key name of the parameter
     * @param value value of the parameter
     *
     * @throws IllegalArgumentException if the parameter is not an OAuth parameter
     */
    public void addOAuthParameter(String key, String value) {
        querystringParams.add(checkKey(key), value);
    }

    private String checkKey(String key) {
        if (key.startsWith(OAUTH_PREFIX) || key.equals(OAuthConstants.SCOPE)) {
            return key;
        } else {
            throw new IllegalArgumentException(String.format("OAuth parameters must either be '%s' or start with '%s'", OAuthConstants.SCOPE, OAUTH_PREFIX));
        }
    }

    /**
     * Returns the {@link ParameterList} with the query string parameters.
     *
     * @return the {@link ParameterList} with the query string parameters.
     */
    public ParameterList getQueryStringParams() {
        try {
            ParameterList oauthHeaderParams = new ParameterList();
            oauthHeaderParams.addAll(querystringParams);

            // Do not include the token in the OAuth Header
            oauthHeaderParams.removeAll(OAuthConstants.TOKEN);
            return oauthHeaderParams;
        } catch (Exception e) {
            return new ParameterList();
        }
    }

    /**
     * Returns the complete url (host + resource + encoded querystring parameters).
     *
     * @return the complete url.
     */
    public String getCompleteUrl() {
        return querystringParams.appendTo(url);
    }

    /**
     * Add an HTTP Header to the Request
     *
     * @param key the header name
     * @param value the header value
     */
    public void addHeader(String key, String value) {
        this.headers.put(key, value);
    }

    /**
     * Add a body Parameter (for POST/ PUT Requests)
     *
     * @param key the parameter name
     * @param value the parameter value
     */
    public void addBodyParameter(String key, String value) {
        this.bodyParams.add(key, value);
    }

    /**
     * Add a QueryString parameter
     *
     * @param key the parameter name
     * @param value the parameter value
     */
    public void addQuerystringParameter(String key, String value) {
        this.querystringParams.add(key, value);
    }

    /**
     * Add body payload.
     *
     * This method is used when the HTTP body is not a form-url-encoded string,
     * but another thing. Like for example XML.
     *
     * Note: The contents are not part of the OAuth signature
     *
     * @param payload the body of the request
     */
    public void addPayload(String payload) {
        this.payload = payload;
    }

    /**
     * Overloaded version for byte arrays
     *
     * @param payload
     */
    public void addPayload(byte[] payload) {
        this.bytePayload = payload.clone();
    }

    /**
     * Get a {@link ParameterList} with the body parameters.
     *
     * @return a {@link ParameterList} containing the body parameters.
     * @throws OAuthException if the request body is not x-www-form-urlencoded
     */
    public ParameterList getBodyParams() {
        try {
            if (bodyParams == null || bodyParams.isEmpty()) {
                if (!DEFAULT_CONTENT_TYPE.equals(getContentType())) {
                    throw new OAuthException("Body Parameters must be encoded as x-www-form-urlencoded if content type is not application/x-www-form-urlencoded");
                }
                ParameterList result = new ParameterList();
                for (String param : payload.split("&")) {
                    String pair[] = param.split("=");
                    if (pair.length == 2) {
                        result.add(URLDecoder.decode(pair[0], "UTF-8"), URLDecoder.decode(pair[1], "UTF-8"));
                    } else {
                        result.add(URLDecoder.decode(pair[0], "UTF-8"), "");
                    }
                }
                return result;
            } else {
                return bodyParams;
            }
        } catch (java.io.UnsupportedEncodingException uee) {
            throw new OAuthException("Could not decode body", uee);
        }
    }

    /**
     * Obtains a {@link ParameterList} of the query string parameters.
     *
     * @return a {@link ParameterList} containing the query string parameters.
     * @throws OAuthException if the request URL is not valid.
     */
    public ParameterList getQueryStringParams1() {
        try {
            ParameterList result = new ParameterList();
            String queryString = new URL(url).getQuery();
            if (queryString != null) {
                for (String param : queryString.split("&")) {
                    String pair[] = param.split("=");
                    if (pair.length == 2) {
                        result.add(URLDecoder.decode(pair[0], "UTF-8"), URLDecoder.decode(pair[1], "UTF-8"));
                    } else {
                        result.add(URLDecoder.decode(pair[0], "UTF-8"), "");
                    }
                }
            }
            result.addAll(querystringParams);
            return result;
        } catch (java.net.MalformedURLException mue) {
            throw new OAuthException("Malformed URL", mue);
        } catch (java.io.UnsupportedEncodingException uee) {
            throw new OAuthException("Could not decode", uee);
        }
    }

    /**
     * Returns the URL of the HTTP Request.
     *
     * @return the original URL of the HTTP Request
     */
    public String getUrl() {
        return url;
    }

    /**
     * Returns the URL without the port and the query string part.
     *
     * @return the OAuth-sanitized URL
     */
    public String getSanitizedUrl() {
        return url.replaceAll("\\?.*", "").replace("\\:\\d{4}", "");
    }

    /**
     * Returns the body of the request
     *
     * @return form encoded string
     * @throws OAuthException if the charset chosen is not supported
     */
    public String getBodyContents() {
        try {
            String body = new String(