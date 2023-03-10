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