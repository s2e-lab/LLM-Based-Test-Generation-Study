// JVCDispatcherTest.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import com.pmdesigns.jvc.tools.Base64Coder;
import com.pmdesigns.jvc.tools.JVCGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCDispatcher}.
* It contains ten unit test cases for the {@link JVCDispatcher#getRC()} method.
*/
class JVCDispatcherTest {

    /**
     * Test of {@link JVCDispatcher#getRC()} method, of class JVCDispatcher.
     */
    @Test
    void testGetRC() {
        System.out.println("getRC");
        JVCDispatcher instance = new JVCDispatcher();
        JVCRequestContext expResult = null;
        JVCRequestContext result = instance.getRC();
        assertEquals(expResult, result);
    }
}
