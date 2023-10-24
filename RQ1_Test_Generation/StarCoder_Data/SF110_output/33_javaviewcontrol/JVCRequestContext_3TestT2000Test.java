// JVCRequestContext_3Test.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_3Test {

    /**
    * Test method for {@link JVCRequestContext#getAttribute(String)}.
    * @throws Exception
    */
    @Test
    void testGetAttribute() throws Exception {
        // setup
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        HttpServlet servlet = new MockHttpServlet();
        Map<String, String> flash = new HashMap<String, String>();
        String controller = "controller";
        String action = "action";
        JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, controller, action);
        // test
        assertNull(context.getAttribute("foo"));
        context.setAttribute("foo", "bar");
        assertEquals("bar", context.getAttribute("foo"));
        context.setAttribute("foo", "baz");
        assertEquals("baz", context.getAttribute("foo"));
        context.setAttribute("foo", null);
        assertNull(context.getAttribute("foo"));
    }
}

// JVCRequestContext_2Test.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_2Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParam(String)}.
    * @throws Exception
    */
    @Test
    void testGetParam() throws Exception {
        // setup
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        HttpServlet servlet = new MockHttpServlet();
        Map<String, String> flash = new HashMap<String, String>();
        String controller = "controller";
        String action = "action";
        JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, controller, action);
        // test
        assertNull(context.getParam("foo"));
        request.setParameter("foo", "bar");
        assertEquals("bar", context.getParam("foo"));
        request.setParameter("foo", "baz");
        assertEquals("baz", context.getParam("foo"));
        request.setParameter("foo", null);
        assertNull(context.getParam("foo"));
    }
}

// JVCRequestContext_1Test.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContext_1Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParamMap(String)}.
    * @throws Exception
    */
    @Test
    void testGetParamMap() throws Exception {
        // setup
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        HttpServlet servlet = new MockHttpServlet();
        Map<String, String> flash = new HashMap<String, String>();
        String controller = "controller";
        String action = "action";
        JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, controller, action);
        // test
        Map<String, String> m = context.getParamMap("foo");
        assertEquals(0, m.size());
        request.setParameter("foo[bar]", "baz");
        m = context.getParamMap("foo");
        assertEquals(1, m.size());
        assertEquals("baz", m.get("bar"));
        request.setParameter("foo[bar]", "baz2");
        m = context.getParamMap("foo");
        assertEquals(1, m.size());
        assertEquals("baz2", m.get("bar"));
        request.setParameter("foo[bar2]", "baz");
        m = context.getParamMap("foo");
        assertEquals(2, m.size());
        assertEquals("baz2", m.get("bar"));
        assertEquals("baz", m.get("bar2"));
    }
}

// JVCRequestContext_0Test.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamNames()} method.
*/
class JVCRequestContext_0Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParamNames()}.
    * @throws Exception
    */
    @Test
    void testGetParamNames() throws Exception {
        // setup
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        HttpServlet servlet = new MockHttpServlet();
        Map<String, String> flash = new HashMap<String, String>();
        String controller = "controller";
        String action = "action";
        JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, controller, action);
        // test
        String[] names = context.getParamNames();
        assertEquals(0, names.length);
        request.setParameter("foo", "bar");
        names = context.getParamNames();
        assertEquals(1, names.length);
        assertEquals("foo", names[0]);
        request.setParameter("foo2", "bar");
        names = context.getParamNames();
        assertEquals(2, names.length);
        assertEquals("foo", names[0]);
        assertEquals("foo2", names[1]);
    }
}

// MockHttpServletRequest.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
* Mock implementation of {@link HttpServletRequest}.
* It is used to test the {@link JVCRequestContext} class.
*/
class MockHttpServletRequest implements HttpServletRequest {

    private Map<String, String[]> params = new HashMap<String, String[]>();
    private Map<String, Object> attrs = new HashMap<String, Object>();
    private Cookie[] cookies = new Cookie[0];
    private String method = "GET";
    private String scheme = "http";
    private String serverName = "localhost";
    private int serverPort = 80;
    private String contextPath = "/";
    private String servletPath = "/";
    private String queryString = "";
    private String contentType = null;
    private int contentLength = -1;

    /**
    * Sets the parameter value for the indicated key.
    * @param key  the key to use to store the parameter value
    * @param value  the parameter value
    */
    public void setParameter(String key, String value) {
        params.put(key, new String[] { value });
    }

    /**
    * Sets the parameter values for the indicated key.
    * @param key  the key to use to store the parameter values
    * @param values  the parameter values
    */
    public void setParameterValues(String key, String[] values) {
        params.put(key, values);
    }

    /**
    * Sets the attribute value for the indicated key.
    * @param key  the key to use to store the attribute value
    * @param value  the attribute value
    */
    public void setAttribute(String key, Object value) {
        attrs.put(key, value);
    }

    /**
    * Sets the cookie value for the indicated key.
    * @param key  the key to use to store the cookie value
    * @param value  the cookie value
    */
    public void setCookie(String key, String value) {
        Cookie c = new Cookie(key, value);
        cookies = new Cookie[] { c };
    }

    /**
    * Sets the request method.
    * @param method  the request method
    */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
    * Sets the request scheme.
    * @param scheme  the request scheme
    */
    public void set