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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_2Test {

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to a single value.
    */
    @Test
    void testGetParamValues_1() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        requestContext.setParam("name", "value");
        String[] values = requestContext.getParamValues("name");
        assertEquals(1, values.length);
        assertEquals("value", values[0]);
    }

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to multiple values.
    */
    @Test
    void testGetParamValues_2() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        requestContext.setParam("name", "value1");
        requestContext.setParam("name", "value2");
        String[] values = requestContext.getParamValues("name");
        assertEquals(2, values.length);
        assertEquals("value1", values[0]);
        assertEquals("value2", values[1]);
    }

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to no values.
    */
    @Test
    void testGetParamValues_3() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        String[] values = requestContext.getParamValues("name");
        assertEquals(0, values.length);
    }

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to a single value.
    */
    @Test
    void testGetParamValues_4() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        requestContext.setParam("name", "value");
        String[] values = requestContext.getParamValues("name");
        assertEquals(1, values.length);
        assertEquals("value", values[0]);
    }

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to multiple values.
    */
    @Test
    void testGetParamValues_5() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        requestContext.setParam("name", "value1");
        requestContext.setParam("name", "value2");
        String[] values = requestContext.getParamValues("name");
        assertEquals(2, values.length);
        assertEquals("value1", values[0]);
        assertEquals("value2", values[1]);
    }

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to no values.
    */
    @Test
    void testGetParamValues_6() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        String[] values = requestContext.getParamValues("name");
        assertEquals(0, values.length);
    }

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to a single value.
    */
    @Test
    void testGetParamValues_7() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        requestContext.setParam("name", "value");
        String[] values = requestContext.getParamValues("name");
        assertEquals(1, values.length);
        assertEquals("value", values[0]);
    }

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to multiple values.
    */
    @Test
    void testGetParamValues_8() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        requestContext.setParam("name", "value1");
        requestContext.setParam("name", "value2");
        String[] values = requestContext.getParamValues("name");
        assertEquals(2, values.length);
        assertEquals("value1", values[0]);
        assertEquals("value2", values[1]);
    }

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to no values.
    */
    @Test
    void testGetParamValues_9() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        String[] values = requestContext.getParamValues("name");
        assertEquals(0, values.length);
    }

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to a single value.
    */
    @Test
    void testGetParamValues_10() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        requestContext.setParam("name", "value");
        String[] values = requestContext.getParamValues("name");
        assertEquals(1, values.length);
        assertEquals("value", values[0]);
    }

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to multiple values.
    */
    @Test
    void testGetParamValues_11() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        requestContext.setParam("name", "value1");
        requestContext.setParam("name", "value2");
        String[] values = requestContext.getParamValues("name");
        assertEquals(2, values.length);
        assertEquals("value1", values[0]);
        assertEquals("value2", values[1]);
    }

    /**
    * Test case for {@link JVCRequestContext#getParamValues(String)} method.
    * It tests the method with a parameter name that maps to no values.
    */
    @Test
    void testGetParamValues_12() {
        JVCRequestContext requestContext = new JVCRequestContext_2();
        String[] values = requestContext.getParamValues("name");
        assertEquals(0, values.length);
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
public class JVCRequestContext_2 extends JVCRequestContext {

    /**
    * Convenience method. Use this if you expect a parameter name
    * to map to multiple values.
    *
    * @param name the name of the parameter(s) to get
    * @return an array of paramter values corresponding to the indicated name
    * @see #getParam
    * @see #getParamMap
    * @see #getParamNames
    */
    public String[] getParamValues(String name) {
        return super.getParamValues(name);
    }
}

// JVCRequestContext_1.java
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
public class JVCRequestContext_1 extends JVCRequestContext {

    /**
    * Convenience method. Use this if you expect a parameter name
    * to map to multiple values.
    *
    * @param name the name of the parameter(s) to get
    * @return an array of paramter values corresponding to the indicated name
    * @see #getParam
    * @see #getParamMap
    * @see #getParamNames
    */
    public String[] getParamValues(String name) {