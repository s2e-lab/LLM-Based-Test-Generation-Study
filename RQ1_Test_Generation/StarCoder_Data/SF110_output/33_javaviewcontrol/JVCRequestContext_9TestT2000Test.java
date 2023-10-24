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
* It contains ten unit test cases for the {@link JVCRequestContext#getFlash(String)} method.
*/
class JVCRequestContext_9Test {

    /**
    * Test method for {@link JVCRequestContext#getFlash(String)}.
    */
    @Test
    void testGetFlash() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertNull(context.getFlash("foo"));
        context.setFlash("foo", "bar");
        assertEquals("bar", context.getFlash("foo"));
        context.setFlash("foo", "baz");
        assertEquals("baz", context.getFlash("foo"));
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_8Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParam(String)}.
    */
    @Test
    void testGetParam() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertNull(context.getParam("foo"));
        context.request.setAttribute("foo", "bar");
        assertEquals("bar", context.getParam("foo"));
        context.request.setAttribute("foo", "baz");
        assertEquals("baz", context.getParam("foo"));
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContext_7Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParamMap(String)}.
    */
    @Test
    void testGetParamMap() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        Map<String, String> m = context.getParamMap("foo");
        assertTrue(m.isEmpty());
        context.request.setAttribute("foo[bar]", "baz");
        m = context.getParamMap("foo");
        assertEquals(1, m.size());
        assertEquals("baz", m.get("bar"));
        context.request.setAttribute("foo[bar]", "baz2");
        m = context.getParamMap("foo");
        assertEquals(1, m.size());
        assertEquals("baz2", m.get("bar"));
    }
}

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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_6Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParamValues(String)}.
    */
    @Test
    void testGetParamValues() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        String[] a = context.getParamValues("foo");
        assertTrue(a.length == 0);
        context.request.setAttribute("foo", "bar");
        a = context.getParamValues("foo");
        assertEquals(1, a.length);
        assertEquals("bar", a[0]);
        context.request.setAttribute("foo", "baz");
        a = context.getParamValues("foo");
        assertEquals(1, a.length);
        assertEquals("baz", a[0]);
    }
}

// JVCRequestContext_5Test.java
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
class JVCRequestContext_5Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParamNames()}.
    */
    @Test
    void testGetParamNames() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        String[] a = context.getParamNames();
        assertTrue(a.length == 0);
        context.request.setAttribute("foo", "bar");
        a = context.getParamNames();
        assertEquals(1, a.length);
        assertEquals("foo", a[0]);
        context.request.setAttribute("foo2", "bar");
        a = context.getParamNames();
        assertEquals(2, a.length);
        assertEquals("foo", a[0]);
        assertEquals("foo2", a[1]);
    }
}

// JVCRequestContext_4Test.java
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
class JVCRequestContext_4Test {
		
    /**
    * Test method for {@link JVCRequestContext#getAttribute(String)}.
    */
    @Test
    void testGetAttribute() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertNull(context.getAttribute("foo"));
        context.request.setAttribute("foo", "bar");
        assertEquals("bar", context.getAttribute("foo"));
        context.request.setAttribute("foo", "baz");
        assertEquals("baz", context.getAttribute("foo"));
    }
}

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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContext_3Test {
		
    /**
    * Test method for {@link JVCRequestContext#getSessionAttr(String)}.
    */
    @Test
    void testGetSessionAttr() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertNull(context.getSessionAttr("foo"));
        context.request.getSession().setAttribute("foo", "bar");
        assertEquals("bar", context.getSessionAttr("foo"));
        context.request.getSession().setAttribute("foo", "baz");
        assertEquals("baz", context.getSessionAttr("foo"));
    }
}

// JVCRequestContext_2Test.java
package com.pmdesigns