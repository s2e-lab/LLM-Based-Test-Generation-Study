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
    * Test case for {@link JVCDispatcher#getRC()} method.
    * It tests the method when the request context is null.
    */
    @Test
    void testGetRCWhenNull() {
        JVCRequestContext rc = JVCDispatcher.getRC();
        assertNull(rc);
    }

    /**
    * Test case for {@link JVCDispatcher#getRC()} method.
    * It tests the method when the request context is not null.
    */
    @Test
    void testGetRCWhenNotNull() {
        JVCRequestContext rc = new JVCRequestContext();
        JVCDispatcher.setRC(rc);
        JVCRequestContext rc2 = JVCDispatcher.getRC();
        assertEquals(rc, rc2);
    }
}

// JVCDispatcher.java
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

/**
 * JVC request dispatching servlet
 *
 * @author mike dooley
 */
public class JVCDispatcher extends HttpServlet {

    private Map<String, Class> generatorClasses;

    private String pkgPrefix;

    public static final String PKG_PREFIX_KEY = "pkg_prefix";

    private static Class requestContextClass;

    private static Class classNotFound;

    private Destroyable application;

    private static final boolean TRACE = false;

    private static ThreadLocal<JVCRequestContext> ctxHolder = new ThreadLocal<JVCRequestContext>() {

        protected synchronized JVCRequestContext initialValue() {
            return null;
        }
    };

    /**
     * Return the thread local request context
     * @return the JVCRequestContext associated with the current thread or null
     */
    public static JVCRequestContext getRC() {
        return ctxHolder.get();
    }

    /**
     * Get the package prefix (from config) so we know the fully qualified
     * name of page generators and controllers.  Also create and instance
     * of the Application object.
     */
    public void init() {
        pkgPrefix = getInitParameter(PKG_PREFIX_KEY);
        if (pkgPrefix == null) {
            throw new IllegalArgumentException("Missing package prefix");
        }
        generatorClasses = new HashMap<String, Class>();
        String[] names = getServletConfig().getInitParameterNames();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (name.startsWith(pkgPrefix)) {
                String className = getInitParameter(name);
                try {
                    Class clazz = Class.forName(className);
                    generatorClasses.put(name, clazz);
                } catch (ClassNotFoundException e) {
                    throw new IllegalArgumentException("Invalid class name: " + className);
                }
            }
        }
        try {
            application = (Destroyable) Class.forName(pkgPrefix + "Application").newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid class name: " + pkgPrefix + "Application");
        }
    }

    /**
     * Notify the Application that its shutdown time.
     */
    public void destroy() {
        application.destroy();
    }

    /**
     * Handle a GET request. Called by servlet container.
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        handleRequest(request, response);
    }

    /**
     * Handle a POST request. Called by servlet container.
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        handleRequest(request, response);
    }

    /**
     * Private implementation to handle a GET or POST request by invoking the appropriate
     * PageGenerator and Controller objects, or by serving static content.
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    private void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String path = request.getPathInfo();
        if (path == null) {
            path = "";
        }
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        if (path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }
        if (path.length() == 0) {
            path = "index";
        }
        String[] pathParts = path.split("/");
        if (pathParts.length == 0) {
            pathParts = new String[] { "index" };
        }
        String generatorName = pathParts[0];
        String[] generatorArgs = new String[pathParts.length - 1];
        System.arraycopy(pathParts, 1, generatorArgs, 0, generatorArgs.length);
        Class generatorClass = generatorClasses.get(generatorName);
        if (generatorClass == null) {
            throw new ServletException("Invalid generator name: " + generatorName);
        }
        JVCRequestContext rc = getRC();
        if (rc == null) {
            rc = new JVCRequestContext();
            setRC(rc);
        }
        rc.setGeneratorArgs(generatorArgs);
        rc.setGeneratorName(generatorName);
        rc.setGeneratorClass(generatorClass);
        rc.setRequest(request);
        rc.setResponse(response);
        rc.setFlash(getFlash(request, response));
        try {
            if (TRACE) {
                System.out.println("JVCDispatcher: " + generatorName + " " + Arrays.asList(generatorArgs));
            }
            Constructor constructor = generatorClass.getConstructor(new Class[] { JVCRequestContext.class });
            JVCGenerator generator = (JVCGenerator) constructor.newInstance(new Object[] { rc });
            generator.generate();
        } catch (NoSuchMethodException e) {
            throw new ServletException("Invalid generator class: " + generatorClass.getName());
        } catch (InvocationTargetException e) {
            Throwable t = e.getTargetException();
            if (t instanceof ServletException) {
                throw (ServletException) t;
            } else if (t instanceof IOException) {
                throw (IOException) t;
            } else {
                throw new ServletException(t);
            }
        } catch (Exception e) {
            throw new ServletException(e);
        } finally {
            setRC(null);
        }
    }

    /**
     * Copy an input stream to an output stream.
     */
    private void copy(InputStream in, OutputStream out) throws IOException {
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
    }

    /**
     * Append a package string to a prefix if the prefix isn't empty
     */
    private static String appendPkg(String prefix, String pkg) {
        if (prefix == null || prefix.length() == 0) {
            return pkg;
        } else {
            return prefix + "." + pkg;
        }
    }

    private static final String FLASH_COOKIE = "jvc_flash";

    /**
     * Look for a 'flash cookie' in the request.  If found deserialize it, clear the cookie
     * and return it, otherwise just return an empty Map.
     * @see #makeFlashCookie
     * @see #serializeMap
     * @see #deserializeMap
     */
    private static Map<String, String> getFlash(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookie.getName().equals(FLASH_COOKIE)) {
                    String value = cookie.getValue();
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    return deserializeMap(value);
                }
            }
        }
        return new HashMap<String, String>();
    }

    /**
     * Serialize the indicated map and return it in a 'flash cookie'
     * @see #getFlash
     * @see #serializeMap
     * @see #deserializeMap
     */
    private static Cookie makeFlashCookie(Map<String, String> map) {
        String value = serializeMap(map);
        Cookie cookie = new Cookie(FLASH_COOKIE, value);
        cookie.setMaxAge(60 * 60 * 24 * 365);
        return cookie;
    }

    /**
     * Return a string representation of the map.
     * This method encodes the map by writing its keys and values
     * separated by the 0 character (the end of the list is indicated
     * by an empty key) and then base64 encoding this string.
     * @see #get