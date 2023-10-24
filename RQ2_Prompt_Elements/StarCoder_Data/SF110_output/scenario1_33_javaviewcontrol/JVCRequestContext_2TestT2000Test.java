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

    @Test
    void getParamValues_1() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("name");
        assertEquals(1, paramValues.length);
        assertEquals("value", paramValues[0]);
    }

    @Test
    void getParamValues_2() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value1");
        jvcRequestContext.request.addParameter("name", "value2");
        String[] paramValues = jvcRequestContext.getParamValues("name");
        assertEquals(2, paramValues.length);
        assertEquals("value1", paramValues[0]);
        assertEquals("value2", paramValues[1]);
    }

    @Test
    void getParamValues_3() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        String[] paramValues = jvcRequestContext.getParamValues("name");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_4() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("name1");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_5() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues(null);
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_6() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_7() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues(" ");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_8() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("  ");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_9() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("  name  ");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_10() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("  name  ");
        assertEquals(0, paramValues.length);
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
		
    @Test
    void getParamValues_1() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("name");
        assertEquals(1, paramValues.length);
        assertEquals("value", paramValues[0]);
    }

    @Test
    void getParamValues_2() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value1");
        jvcRequestContext.request.addParameter("name", "value2");
        String[] paramValues = jvcRequestContext.getParamValues("name");
        assertEquals(2, paramValues.length);
        assertEquals("value1", paramValues[0]);
        assertEquals("value2", paramValues[1]);
    }

    @Test
    void getParamValues_3() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        String[] paramValues = jvcRequestContext.getParamValues("name");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_4() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("name1");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_5() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues(null);
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_6() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_7() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues(" ");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_8() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("  ");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_9() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("  name  ");
        assertEquals(0, paramValues.length);
    }

    @Test
    void getParamValues_10() {
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        jvcRequestContext.request = new MockHttpServletRequest();
        jvcRequestContext.request.addParameter("name", "value");
        String[] paramValues = jvcRequestContext.getParamValues("  name  ");
        assertEquals(0, paramValues.length);
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
		
    @Test
    void getParamValues_1() {
        J