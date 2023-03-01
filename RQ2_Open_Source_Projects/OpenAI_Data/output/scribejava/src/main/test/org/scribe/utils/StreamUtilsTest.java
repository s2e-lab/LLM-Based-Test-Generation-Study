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
        StringBuilder result = new StringBuilder();
        for (String key : params.keySet()) {
            if (result.length() > 0) {
                result.append("&");
            }
            result.append(percentEncode(key)).append("=").append(percentEncode(params.get(key)));
        }
        return result.toString();
    }

    /**
     * Returns a UTF-8 encoded String
     *
     * @param params parameters to be encoded
     * @return encoded string
     */
    public static String formURLEncodeList(List<Parameter> params) {
        StringBuilder result = new StringBuilder();
        for (Parameter param : params) {
            if (result.length() > 0) {
                result.append("&");
            }
            result.append(percentEncode(param.getKey