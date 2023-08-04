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
     * Test of getAttribute method, of class JVCRequestContext.
     */
    @Test
    void testGetAttribute() {
        System.out.println("getAttribute");
        String name = "";
        JVCRequestContext instance = new JVCRequestContext_3();
        Object expResult = null;
        Object result = instance.getAttribute(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_2Test {
		
    /**
     * Test of getAttribute method, of class JVCRequestContext.
     */
    @Test
    void testGetAttribute() {
        System.out.println("getAttribute");
        String name = "";
        JVCRequestContext instance = new JVCRequestContext_2();
        Object expResult = null;
        Object result = instance.getAttribute(name);
        assertEquals(expResult, result);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_1Test {
		
    /**
     * Test of getAttribute method, of class JVCRequestContext.
     */
    @Test
    void testGetAttribute() {
        System.out.println("getAttribute");
        String name = "";
        JVCRequestContext instance = new JVCRequestContext_1();
        Object expResult = null;
        Object result = instance.getAttribute(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_0Test {
		
    /**
     * Test of getAttribute method, of class JVCRequestContext.
     */
    @Test
    void testGetAttribute() {
        System.out.println("getAttribute");
        String name = "";
        JVCRequestContext instance = new JVCRequestContext_0();
        Object expResult = null;
        Object result = instance.getAttribute(name);
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
     * @param name which attribute to get
     * @return the attribute value or null if there is no attribute corresponding to the indicated key.
     * If the attribute corresponds to a file upload field then the return value will be a byte array
     */
    public Object getAttribute(String name) {
        Object value = null;
        if (request.getAttribute(name) != null) {
            value = request.getAttribute(name);
        } else if (request.getParameter(name) != null) {
            value = request.getParameter(name);
        } else if (request instanceof MultipartHttpServletRequest) {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            if (multipartRequest.getFile(name) != null) {
                value = multipartRequest.getFile(name).getBytes();
            }
        }
        return value;
    }
}

// JVCRequestContext_3.java
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
     * @param name which attribute to get
     * @return the attribute value or null if there is no attribute corresponding to the indicated key.
     * If the attribute corresponds to a file upload field then the return value will be a byte array
     */
    public Object getAttribute(String name) {
        Object value = null;
        if (request.getAttribute(name) != null) {
            value = request.getAttribute(name);
        } else if (request.getParameter(name) != null) {
            value = request.getParameter(name);
        } else if (request instanceof MultipartHttpServletRequest) {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            if (multipartRequest.getFile(name) != null) {
                value = multipartRequest.getFile(name).getBytes();
            }
        }
        return value;
    }
}

// JVCRequestContext_2.java
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
     * @param name which attribute to get
     * @return the attribute value or null if there is no attribute corresponding to the indicated key.
     * If the attribute corresponds to a file upload field then the return value will be a byte array
     */
    public Object getAttribute(String name) {
        Object value = null;
        if (request.getAttribute(name)