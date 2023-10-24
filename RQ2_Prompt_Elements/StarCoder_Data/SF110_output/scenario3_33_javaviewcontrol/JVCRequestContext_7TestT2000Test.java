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
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "/test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink2() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink3() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "/test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink4() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink5() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "/test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink6() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink7() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "/test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink8() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink9() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "/test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink10() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "test");
        assertEquals(expResult, result);
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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_8Test {
		
    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "/test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink2() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink3() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "/test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink4() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink5() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "/test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink6() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink7() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "/test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink8() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "test");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JVCRequestContext#makeLink(String, String)}
     *
     * @throws java.lang.Exception
     */
    @Test
    void testMakeLink9() throws Exception {
        JVCRequestContext instance = new JVCRequestContext();
        String expResult = "<a href=\"/test\">test</a>";
        String result = instance.makeLink("test", "/test");
        assertEquals(expResult, result);
   