// JVCRequestContext_6Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains ten unit test cases for the {@link JVCRequestContext#absPath(String)} method.
*/
class JVCRequestContext_6Test {

    /**
    * Test method for {@link JVCRequestContext#absPath(String)}.
    */
    @Test
    void testAbsPath() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("/foo", context.absPath("/foo"));
        assertEquals("/foo", context.absPath("foo"));
        assertEquals("/foo", context.absPath("/foo/"));
        assertEquals("/foo", context.absPath("foo/"));
        assertEquals("/foo/bar", context.absPath("/foo/bar"));
        assertEquals("/foo/bar", context.absPath("foo/bar"));
        assertEquals("/foo/bar", context.absPath("/foo/bar/"));
        assertEquals("/foo/bar", context.absPath("foo/bar/"));
        assertEquals("/foo/bar/baz", context.absPath("/foo/bar/baz"));
        assertEquals("/foo/bar/baz", context.absPath("foo/bar/baz"));
        assertEquals("/foo/bar/baz", context.absPath("/foo/bar/baz/"));
        assertEquals("/foo/bar/baz", context.absPath("foo/bar/baz/"));
    }
}

// JVCRequestContext_7Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_7Test {
		
    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String)}.
    */
    @Test
    void testMakeLink() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href='/foo'>bar</a>", context.makeLink("bar", "/foo"));
        assertEquals("<a href='/foo'>bar</a>", context.makeLink("bar", "foo"));
        assertEquals("<a href='/foo'>bar</a>", context.makeLink("bar", "/foo/"));
        assertEquals("<a href='/foo'>bar</a>", context.makeLink("bar", "foo/"));
        assertEquals("<a href='/foo/bar'>baz</a>", context.makeLink("baz", "/foo/bar"));
        assertEquals("<a href='/foo/bar'>baz</a>", context.makeLink("baz", "foo/bar"));
        assertEquals("<a href='/foo/bar'>baz</a>", context.makeLink("baz", "/foo/bar/"));
        assertEquals("<a href='/foo/bar'>baz</a>", context.makeLink("baz", "foo/bar/"));
        assertEquals("<a href='/foo/bar/baz'>qux</a>", context.makeLink("qux", "/foo/bar/baz"));
        assertEquals("<a href='/foo/bar/baz'>qux</a>", context.makeLink("qux", "foo/bar/baz"));
        assertEquals("<a href='/foo/bar/baz'>qux</a>", context.makeLink("qux", "/foo/bar/baz/"));
        assertEquals("<a href='/foo/bar/baz'>qux</a>", context.makeLink("qux", "foo/bar/baz/"));
    }
}

// JVCRequestContext_8Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContext_8Test {
		
    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
    */
    @Test
    void testMakeLink() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href='/foo' class='bar'>baz</a>", context.makeLink("baz", "/foo", "class='bar'"));
        assertEquals("<a href='/foo' class='bar'>baz</a>", context.makeLink("baz", "foo", "class='bar'"));
        assertEquals("<a href='/foo' class='bar'>baz</a>", context.makeLink("baz", "/foo/", "class='bar'"));
        assertEquals("<a href='/foo' class='bar'>baz</a>", context.makeLink("baz", "foo/", "class='bar'"));
        assertEquals("<a href='/foo/bar' class='baz'>qux</a>", context.makeLink("qux", "/foo/bar", "class='baz'"));
        assertEquals("<a href='/foo/bar' class='baz'>qux</a>", context.makeLink("qux", "foo/bar", "class='baz'"));
        assertEquals("<a href='/foo/bar' class='baz'>qux</a>", context.makeLink("qux", "/foo/bar/", "class='baz'"));
        assertEquals("<a href='/foo/bar' class='baz'>qux</a>", context.makeLink("qux", "foo/bar/", "class='baz'"));
        assertEquals("<a href='/foo/bar/baz' class='qux'>quux</a>", context.makeLink("quux", "/foo/bar/baz", "class='qux'"));
        assertEquals("<a href='/foo/bar/baz' class='qux'>quux</a>", context.makeLink("quux", "foo/bar/baz", "class='qux'"));
        assertEquals("<a href='/foo/bar/baz' class='qux'>quux</a>", context.makeLink("quux", "/foo/bar/baz/", "class='qux'"));
        assertEquals("<a href='/foo/bar/baz' class='qux'>quux</a>", context.makeLink("quux", "foo/bar/baz/", "class='qux'"));
    }
}

// JVCRequestContext_9Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains ten unit test cases for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContext_9Test {
		
    /**
    * Test method for {@link JVCRequestContext#getCookie(String)}.
    */
    @Test
    void testGetCookie() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertNull(context.getCookie(null));
        assertNull(context.getCookie(""));
        assertNull(context.getCookie("foo"));
        Cookie cookie = new Cookie("foo", "bar");
        context.setCookie(cookie);
        assertEquals(cookie, context.getCookie("foo"));
    }
}

// JVCRequestContext_10Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains ten unit test cases for the {@link JVCRequestContext#getCookieNames()} method.
*/
class JVCRequestContext_10Test {
		
    /**
    * Test method for {@link JVCRequestContext#getCookieNames()}.
    */
    @Test
   