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
* It contains ten unit test cases for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_0Test {

    @Test
    void getParam_0() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setAttribute("param", "value");
        String expResult = "value";
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_1() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setParameter("param", "value");
        String expResult = "value";
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_2() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_3() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setAttribute("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_4() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setParameter("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_5() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setAttribute("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_6() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setParameter("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_7() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setAttribute("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_8() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setParameter("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_9() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setAttribute("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_1Test {
		
    @Test
    void getParam_0() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setAttribute("param", "value");
        String expResult = "value";
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_1() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setParameter("param", "value");
        String expResult = "value";
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_2() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_3() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setAttribute("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_4() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setParameter("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_5() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setAttribute("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_6() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setParameter("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_7() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setAttribute("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_8() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setParameter("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_9() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setAttribute("param", "value");
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_2Test {
		
    @Test
    void getParam_0() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setAttribute("param", "value");
        String expResult = "value";
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_1() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.setParameter("param", "value");
        String expResult = "value";
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_2() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        String expResult = BINARY_VALUE;
        String result = instance.getParam("param");
        assertEquals(expResult, result);
    }

    @Test
    void getParam_3() {
        JVCRequestContext instance = new JVCRequestContext();
        instance.request = new MockHttpServletRequest();
        instance.request.