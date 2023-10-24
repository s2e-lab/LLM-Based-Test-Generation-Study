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
    * Test method for {@link JVCRequestContext#getParamValues(String)}.
    */
    @Test
    void testGetParamValues() {
        // Arrange
        final String name = "name";
        final String value = "value";
        final String[] values = {value};
        final Map<String, String[]> params = new HashMap<>();
        params.put(name, values);
        final HttpServletRequest request = new MockHttpServletRequest(params);
        final JVCRequestContext context = new JVCRequestContext(request);

        // Act
        final String[] result = context.getParamValues(name);

        // Assert
        assertArrayEquals(values, result);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_3Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParamValues(String)}.
    */
    @Test
    void testGetParamValues() {
        // Arrange
        final String name = "name";
        final String value = "value";
        final String[] values = {value};
        final Map<String, String[]> params = new HashMap<>();
        params.put(name, values);
        final HttpServletRequest request = new MockHttpServletRequest(params);
        final JVCRequestContext context = new JVCRequestContext(request);

        // Act
        final String[] result = context.getParamValues(name);

        // Assert
        assertArrayEquals(values, result);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_4Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParamValues(String)}.
    */
    @Test
    void testGetParamValues() {
        // Arrange
        final String name = "name";
        final String value = "value";
        final String[] values = {value};
        final Map<String, String[]> params = new HashMap<>();
        params.put(name, values);
        final HttpServletRequest request = new MockHttpServletRequest(params);
        final JVCRequestContext context = new JVCRequestContext(request);

        // Act
        final String[] result = context.getParamValues(name);

        // Assert
        assertArrayEquals(values, result);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_5Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParamValues(String)}.
    */
    @Test
    void testGetParamValues() {
        // Arrange
        final String name = "name";
        final String value = "value";
        final String[] values = {value};
        final Map<String, String[]> params = new HashMap<>();
        params.put(name, values);
        final HttpServletRequest request = new MockHttpServletRequest(params);
        final JVCRequestContext context = new JVCRequestContext(request);

        // Act
        final String[] result = context.getParamValues(name);

        // Assert
        assertArrayEquals(values, result);
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
        // Arrange
        final String name = "name";
        final String value = "value";
        final String[] values = {value};
        final Map<String, String[]> params = new HashMap<>();
        params.put(name, values);
        final HttpServletRequest request = new MockHttpServletRequest(params);
        final JVCRequestContext context = new JVCRequestContext(request);

        // Act
        final String[] result = context.getParamValues(name);

        // Assert
        assertArrayEquals(values, result);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_7Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParamValues(String)}.
    */
    @Test
    void testGetParamValues() {
        // Arrange
        final String name = "name";
        final String value = "value";
        final String[] values = {value};
        final Map<String, String[]> params = new HashMap<>();
        params.put(name, values);
        final HttpServletRequest request = new MockHttpServletRequest(params);
        final JVCRequestContext context = new JVCRequestContext(request);

        // Act
        final String[] result = context.getParamValues(name);

        // Assert
        assertArrayEquals(values, result);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_8Test {
		
    /**
    * Test method for {@link JVCRequestContext#getParamValues(String)}.
    */
    @Test
    void testGetParamValues() {
        // Arrange
        final String name = "name";
        final String value = "value";
        final String[] values = {value};
        final Map<String, String[]> params = new HashMap<>();
        params.put(name, values);
        final HttpServletRequest request = new MockHttpServletRequest(params);
        final JVCRequestContext context = new JVCRequestContext(request);

        // Act
        final String[] result = context.getParamValues(name);

        // Assert
        assertArrayEquals(values, result);
    }
}

// J