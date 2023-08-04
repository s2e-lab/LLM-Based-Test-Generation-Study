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
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues() {
        System.out.println("getParamValues");
        String name = "";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_1() {
        System.out.println("getParamValues");
        String name = "foo";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_2() {
        System.out.println("getParamValues");
        String name = "foo[]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_3() {
        System.out.println("getParamValues");
        String name = "foo[bar]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_4() {
        System.out.println("getParamValues");
        String name = "foo[bar][]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_5() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_6() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_7() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_8() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux][]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_9() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux][quux]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_10() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux][quux][]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_11() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux][quux][corge]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_12() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux][quux][corge][]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_13() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux][quux][corge][grault]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_14() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux][quux][corge][grault][]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_15() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux][quux][corge][grault][garply]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_16() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux][quux][corge][grault][garply][]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_17() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux][quux][corge][grault][garply][waldo]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_18() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz][qux][quux][corge][grault][garply][waldo][]";
        JVCRequestContext instance = new JVCRequestContext_2();
        String[] expResult = null;
        String[] result = instance.getParamValues(name);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getParamValues method, of class JVCRequestContext.
     */
    @Test
    void testGetParamValues_19() {
        System.out.println("getParamValues");
        String name = "foo[bar][baz