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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContext_4Test {

    /**
     * Test of getSessionAttr method, of class JVCRequestContext.
     */
    @Test
    void testGetSessionAttr() {
        System.out.println("getSessionAttr");
        String name = "";
        JVCRequestContext instance = new JVCRequestContext();
        Object expResult = null;
        Object result = instance.getSessionAttr(name);
        assertEquals(expResult, result);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttrNames()} method.
*/
class JVCRequestContext_3Test {
		
    /**
     * Test of getSessionAttrNames method, of class JVCRequestContext.
     */
    @Test
    void testGetSessionAttrNames() {
        System.out.println("getSessionAttrNames");
        JVCRequestContext instance = new JVCRequestContext();
        Enumeration<String> expResult = null;
        Enumeration<String> result = instance.getSessionAttrNames();
        assertEquals(expResult, result);
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
* It contains ten unit test cases for the {@link JVCRequestContext#setSessionAttr(String, Object)} method.
*/
class JVCRequestContext_2Test {
		
    /**
     * Test of setSessionAttr method, of class JVCRequestContext.
     */
    @Test
    void testSetSessionAttr() {
        System.out.println("setSessionAttr");
        String name = "";
        Object value = null;
        JVCRequestContext instance = new JVCRequestContext();
        instance.setSessionAttr(name, value);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttrNames()} method.
*/
class JVCRequestContext_1Test {
		
    /**
     * Test of getSessionAttrNames method, of class JVCRequestContext.
     */
    @Test
    void testGetSessionAttrNames() {
        System.out.println("getSessionAttrNames");
        JVCRequestContext instance = new JVCRequestContext();
        Enumeration<String> expResult = null;
        Enumeration<String> result = instance.getSessionAttrNames();
        assertEquals(expResult, result);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContext_0Test {
		
    /**
     * Test of getSessionAttr method, of class JVCRequestContext.
     */
    @Test
    void testGetSessionAttr() {
        System.out.println("getSessionAttr");
        String name = "";
        JVCRequestContext instance = new JVCRequestContext();
        Object expResult = null;
        Object result = instance.getSessionAttr(name);
        assertEquals(expResult, result);
    }
}

// JVCRequestContext.java
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
 * This class contains state information for processing an http request.
 * It wraps the standard HttpServletRequest, HttpServletResponse and HttpServlet
 * objects and provides convenience methods for accessing them.
 * <p>
 * It also provides access to the 'flash' which is a Map for storing temporary
 * key/value strings.  The scope of the flash is the current request or
 * the following request in the case of a redirect response.
 * <p>
 * It also contains some convenience methods for forming links and absolute paths.
 *
 * @author mike dooley
 */
public final class JVCRequestContext {

    /**
     * Convenience method
     *
     * @param name the name of the attribute to retrieve
     * @return the attribute associated with the indicated name or null
     * @see #setSessionAttr
     * @see #getSessionAttrNames
     */
    public Object getSessionAttr(String name) {
        if (request.getSession() == null)
            return null;
        return request.getSession().getAttribute(name);
    }

    /**
     * Convenience method
     *
     * @return an Enumeration of the names of all session attributes
     * @see #setSessionAttr
     * @see #getSessionAttr
     */
    public Enumeration<String> getSessionAttrNames() {
        if (request.getSession() == null)
            return null;
        return request.getSession().getAttributeNames();
    }

    /**
     * Convenience method
     *
     * @param name the name of the attribute to set
     * @param value the value of the attribute
     * @see #getSessionAttr
     * @see #getSessionAttrNames
     */
    public void setSessionAttr(String name, Object value) {
        if (request.getSession() != null)
            request.getSession().setAttribute(name, value);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttrNames()} method.
*/
class JVCRequestContext_1Test {
		
    /**
     * Test of getSessionAttrNames method, of class JVCRequestContext.
     */
    @Test
    void testGetSessionAttrNames() {
        System.out.println("getSessionAttrNames");
        JVCRequestContext instance = new JVCRequestContext();
        Enumeration<String> expResult = null;
        Enumeration<String> result = instance.getSessionAttrNames();
        assertEquals(expResult, result);
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
* Test class of {@link JVCRequestContext