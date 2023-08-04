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
        assertEquals("<a href=\"/foo\">bar</a>", context.makeLink("bar", "/foo"));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String)}.
    */
    @Test
    void testMakeLink2() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\">bar</a>", context.makeLink("bar", "/foo"));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String)}.
    */
    @Test
    void testMakeLink3() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\">bar</a>", context.makeLink("bar", "/foo"));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String)}.
    */
    @Test
    void testMakeLink4() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\">bar</a>", context.makeLink("bar", "/foo"));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String)}.
    */
    @Test
    void testMakeLink5() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\">bar</a>", context.makeLink("bar", "/foo"));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String)}.
    */
    @Test
    void testMakeLink6() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\">bar</a>", context.makeLink("bar", "/foo"));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String)}.
    */
    @Test
    void testMakeLink7() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\">bar</a>", context.makeLink("bar", "/foo"));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String)}.
    */
    @Test
    void testMakeLink8() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\">bar</a>", context.makeLink("bar", "/foo"));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String)}.
    */
    @Test
    void testMakeLink9() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\">bar</a>", context.makeLink("bar", "/foo"));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String)}.
    */
    @Test
    void testMakeLink10() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\">bar</a>", context.makeLink("bar", "/foo"));
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
        assertEquals("<a href=\"/foo\" class=\"bar\">baz</a>", context.makeLink("baz", "/foo", "class=\"bar\""));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
    */
    @Test
    void testMakeLink2() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\" class=\"bar\">baz</a>", context.makeLink("baz", "/foo", "class=\"bar\""));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
    */
    @Test
    void testMakeLink3() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\" class=\"bar\">baz</a>", context.makeLink("baz", "/foo", "class=\"bar\""));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
    */
    @Test
    void testMakeLink4() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\" class=\"bar\">baz</a>", context.makeLink("baz", "/foo", "class=\"bar\""));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
    */
    @Test
    void testMakeLink5() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\" class=\"bar\">baz</a>", context.makeLink("baz", "/foo", "class=\"bar\""));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
    */
    @Test
    void testMakeLink6() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\" class=\"bar\">baz</a>", context.makeLink("baz", "/foo", "class=\"bar\""));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
    */
    @Test
    void testMakeLink7() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\" class=\"bar\">baz</a>", context.makeLink("baz", "/foo", "class=\"bar\""));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
    */
    @Test
    void testMakeLink8() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\" class=\"bar\">baz</a>", context.makeLink("baz", "/foo", "class=\"bar\""));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
    */
    @Test
    void testMakeLink9() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\" class=\"bar\">baz</a>", context.makeLink("baz", "/foo", "class=\"bar\""));
    }

    /**
    * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
    */
    @Test
    void testMakeLink10() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertEquals("<a href=\"/foo\" class=\"bar\">baz</a>", context.makeLink("baz", "/foo", "class=\"bar\""));
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
import org.apache.commons.file