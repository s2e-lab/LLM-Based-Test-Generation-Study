// TagUtil_0Test.java
package net.sourceforge.ext4j.taglib.bo;

import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.PageContext;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TagUtil}.
* It contains ten unit test cases for the {@link TagUtil#isAbsoluteUrl(String)} method.
*/
class TagUtil_0Test {

	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is null.
	 */
	@Test
	void testIsAbsoluteUrl_0() {
		String url = null;
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is empty.
	 */
	@Test
	void testIsAbsoluteUrl_1() {
		String url = "";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testIsAbsoluteUrl_2() {
		String url = "relative";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testIsAbsoluteUrl_3() {
		String url = "relative/url";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testIsAbsoluteUrl_4() {
		String url = "relative/url/";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testIsAbsoluteUrl_5() {
		String url = "relative/url/with/slash";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is an absolute URL.
	 */
	@Test
	void testIsAbsoluteUrl_6() {
		String url = "http://absolute";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertTrue(result);
	}
	
	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is an absolute URL.
	 */
	@Test
	void testIsAbsoluteUrl_7() {
		String url = "http://absolute/url";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertTrue(result);
	}
	
	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is an absolute URL.
	 */
	@Test
	void testIsAbsoluteUrl_8() {
		String url = "http://absolute/url/";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertTrue(result);
	}
	
	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is an absolute URL.
	 */
	@Test
	void testIsAbsoluteUrl_9() {
		String url = "http://absolute/url/with/slash";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertTrue(result);
	}
	
}

// TagUtil_1Test.java
package net.sourceforge.ext4j.taglib.bo;

import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.PageContext;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TagUtil}.
* It contains ten unit test cases for the {@link TagUtil#resolveUrl(String, String, PageContext)} method.
*/
class TagUtil_1Test {
		
	/**
	 * Test case for {@link TagUtil#resolveUrl(String, String, PageContext)}.
	 * It tests the case that the given URL is null.
	 */
	@Test
	void testResolveUrl_0() {
		String url = null;
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link TagUtil#resolveUrl(String, String, PageContext)}.
	 * It tests the case that the given URL is empty.
	 */
	@Test
	void testResolveUrl_1() {
		String url = "";
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertEquals("", result);
	}
	
	/**
	 * Test case for {@link TagUtil#resolveUrl(String, String, PageContext)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testResolveUrl_2() {
		String url = "relative";
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertEquals("relative", result);
	}
	
	/**
	 * Test case for {@link TagUtil#resolveUrl(String, String, PageContext)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testResolveUrl_3() {
		String url = "relative/url";
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertEquals("relative/url", result);
	}
	
	/**
	 * Test case for {@link TagUtil#resolveUrl(String, String, PageContext)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testResolveUrl_4() {
		String url = "relative/url/";
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertEquals("relative/url/", result);
	}
	
	/**
	 * Test case for {@link TagUtil#resolveUrl(String, String, PageContext)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testResolveUrl_5() {
		String url = "relative/url/with/slash";
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertEquals("relative/url/with/slash", result);