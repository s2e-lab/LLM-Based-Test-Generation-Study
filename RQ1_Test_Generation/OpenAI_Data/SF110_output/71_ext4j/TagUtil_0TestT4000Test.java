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
		String url = "relative/url/with/path";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testIsAbsoluteUrl_6() {
		String url = "relative/url/with/path/";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertFalse(result);
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
		String url = "http://absolute/url/with/path";
		boolean result = TagUtil.isAbsoluteUrl(url);
		assertTrue(result);
	}
	
	/**
	 * Test case for {@link TagUtil#isAbsoluteUrl(String)}.
	 * It tests the case that the given URL is an absolute URL.
	 */
	@Test
	void testIsAbsoluteUrl_10() {
		String url = "http://absolute/url/with/path/";
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
		String url = "relative/url/with/path";
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertEquals("relative/url/with/path", result);
	}
	
	/**
	 * Test case for {@link TagUtil#resolveUrl(String, String, PageContext)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testResolveUrl_6() {
		String url = "relative/url/with/path/";
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertEquals("relative/url/with/path/", result);
	}
	
	/**
	 * Test case for {@link TagUtil#resolveUrl(String, String, PageContext)}.
	 * It tests the case that the given URL is an absolute URL.
	 */
	@Test
	void testResolveUrl_7() {
		String url = "http://absolute/url";
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertEquals("http://absolute/url", result);
	}
	
	/**
	 * Test case for {@link TagUtil#resolveUrl(String, String, PageContext)}.
	 * It tests the case that the given URL is an absolute URL.
	 */
	@Test
	void testResolveUrl_8() {
		String url = "http://absolute/url/";
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertEquals("http://absolute/url/", result);
	}
	
	/**
	 * Test case for {@link TagUtil#resolveUrl(String, String, PageContext)}.
	 * It tests the case that the given URL is an absolute URL.
	 */
	@Test
	void testResolveUrl_9() {
		String url = "http://absolute/url/with/path";
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertEquals("http://absolute/url/with/path", result);
	}
	
	/**
	 * Test case for {@link TagUtil#resolveUrl(String, String, PageContext)}.
	 * It tests the case that the given URL is an absolute URL.
	 */
	@Test
	void testResolveUrl_10() {
		String url = "http://absolute/url/with/path/";
		String context = null;
		PageContext pageContext = null;
		String result = TagUtil.resolveUrl(url, context, pageContext);
		assertEquals("http://absolute/url/with/path/", result);
	}
}

// TagUtil_2Test.java
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
* It contains ten unit test cases for the {@link TagUtil#rewriteURL(String, PageContext)} method.
*/
class TagUtil_2Test {
		
	/**
	 * Test case for {@link TagUtil#rewriteURL(String, PageContext)}.
	 * It tests the case that the given URL is null.
	 */
	@Test
	void testRewriteURL_0() {
		String url = null;
		PageContext pageContext = null;
		String result = TagUtil.rewriteURL(url, pageContext);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link TagUtil#rewriteURL(String, PageContext)}.
	 * It tests the case that the given URL is empty.
	 */
	@Test
	void testRewriteURL_1() {
		String url = "";
		PageContext pageContext = null;
		String result = TagUtil.rewriteURL(url, pageContext);
		assertEquals("", result);
	}
	
	/**
	 * Test case for {@link TagUtil#rewriteURL(String, PageContext)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testRewriteURL_2() {
		String url = "relative";
		PageContext pageContext = null;
		String result = TagUtil.rewriteURL(url, pageContext);
		assertEquals("relative", result);
	}
	
	/**
	 * Test case for {@link TagUtil#rewriteURL(String, PageContext)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testRewriteURL_3() {
		String url = "relative/url";
		PageContext pageContext = null;
		String result = TagUtil.rewriteURL(url, pageContext);
		assertEquals("relative/url", result);
	}
	
	/**
	 * Test case for {@link TagUtil#rewriteURL(String, PageContext)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testRewriteURL_4() {
		String url = "relative/url/";
		PageContext pageContext = null;
		String result = TagUtil.rewriteURL(url, pageContext);
		assertEquals("relative/url/", result);
	}
	
	/**
	 * Test case for {@link TagUtil#rewriteURL(String, PageContext)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testRewriteURL_5() {
		String url = "relative/url/with/path";
		PageContext pageContext = null;
		String result = TagUtil.rewriteURL(url, pageContext);
		assertEquals("relative/url/with/path", result);
	}
	
	/**
	 * Test case for {@link TagUtil#rewriteURL(String, PageContext)}.
	 * It tests the case that the given URL is a relative URL.
	 */
	@Test
	void testRewriteURL_6() {
		String url = "relative/url/with/path/";
		PageContext pageContext = null;
		String result = TagUtil.rewriteURL(url, pageContext);
		assertEquals("relative/url/with/path/", result);
	}
	
	/**
	 * Test case for {@link TagUtil#rewriteURL(String, PageContext)}.
	 * It tests the case that the given URL is an absolute URL.
	 */
	@Test
	void testRewriteURL_7() {
		String url = "http://absolute/url";
		PageContext pageContext = null;
		String result = TagUtil.rewriteURL(url, pageContext);
		assertEquals("http://absolute/url", result);
	}
	
	/**
	 * Test case for {@link TagUtil#rewriteURL(String, PageContext)}.
	 * It tests