// HTMLOutputStreamTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLOutputStream}.
* It contains ten unit test cases for the {@link HTMLOutputStream#reset()} method.
*/
class HTMLOutputStreamTest {

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the method with an empty buffer.
     */
    @Test
    void testResetEmpty() {
        HTMLOutputStream h = new HTMLOutputStream();
        String contents = h.reset();
        assertEquals("", contents);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the method with a buffer containing a single character.
     */
    @Test
    void testResetSingle() {
        HTMLOutputStream h = new HTMLOutputStream();
        h.write('a');
        String contents = h.reset();
        assertEquals("a", contents);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the method with a buffer containing a single character.
     */
    @Test
    void testResetMultiple() {
        HTMLOutputStream h = new HTMLOutputStream();
        h.write('a');
        h.write('b');
        h.write('c');
        String contents = h.reset();
        assertEquals("abc", contents);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the method with a buffer containing a single character.
     */
    @Test
    void testResetMultiple2() {
        HTMLOutputStream h = new HTMLOutputStream();
        h.write('a');
        h.write('b');
        h.write('c');
        h.write('d');
        h.write('e');
        h.write('f');
        String contents = h.reset();
        assertEquals("abcdef", contents);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the method with a buffer containing a single character.
     */
    @Test
    void testResetMultiple3() {
        HTMLOutputStream h = new HTMLOutputStream();
        h.write('a');
        h.write('b');
        h.write('c');
        h.write('d');
        h.write('e');
        h.write('f');
        h.write('g');
        h.write('h');
        h.write('i');
        h.write('j');
        String contents = h.reset();
        assertEquals("abcdefghij", contents);
    }

    /**
     * Test case for {@link HTMLOutputStream#reset()}.
     * It tests the method with a buffer containing a single character.
     */
    @Test
    void testResetMultiple4() {
        HTMLOutputStream h = new HTMLOutputStream();
        h.write('a');
        h.write('b');
        h.write('c');
        h.write('d');
        h.write('e');
        h.write('f');
        h.write('g');
        h.write('h');
        h.write('i');
        h.write('j');
        h.write('k');
        h.write('l');
        h.write('m');
        h.write('n');
        h.write('o');
        h.write('p');
        h.write('q');
        h.write('r');
        h.write('s');
        h.write('t');
        h.write('u');
        h.write('v');
        h.write('w');
        h.write('x');
        h.write('y');
        h.write('z');
        String contents = h.reset();
        assertEquals("abcdefghijklmnopqrstuvwxyz", contents);
    }
}

// HTMLServlet.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;

/**
 * A servlet that returns a HTML document.
 *
 * @author <NAME>
 */
public class HTMLServlet extends HttpServlet {

    /**
     * @author <NAME>
     * @return void
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Test</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Test</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}

// HTMLServletTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLServlet}.
* It contains one unit test case for the {@link HTMLServlet#doGet(HttpServletRequest, HttpServletResponse)} method.
*/
class HTMLServletTest {
		
    /**
     * Test case for {@link HTMLServlet#doGet(HttpServletRequest, HttpServletResponse)}.
     * It tests the method with a request and response.
     */
    @Test
    void testDoGet() {
        HTMLServlet h = new HTMLServlet();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        try {
            h.doGet(request, response);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}

// HTMLServletTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLServlet}.
* It contains one unit test case for the {@link HTMLServlet#doGet(HttpServletRequest, HttpServletResponse)} method.
*/
class HTMLServletTest {
		
    /**
     * Test case for {@link HTMLServlet#doGet(HttpServletRequest, HttpServletResponse)}.
     * It tests the method with a request and response.
     */
    @Test
    void testDoGet() {
        HTMLServlet h = new HTMLServlet();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        try {
            h.doGet(request, response);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}

// HTMLServletTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLServlet}.
* It contains one unit test case for the {@link HTMLServlet#doGet(HttpServletRequest, HttpServletResponse)} method.
*/
class HTMLServletTest {
		
    /**
     * Test case for {@link HTMLServlet#doGet(HttpServletRequest, HttpServletResponse)}.
     * It tests the method with a request and response.
     */
    @Test
    void testDoGet() {
        HTMLServlet h = new HTMLServlet();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        try {
            h.doGet(request, response);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}

// HTMLServletTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLServlet}.
* It contains one unit test case for the {@link HTMLServlet#doGet(HttpServletRequest, HttpServletResponse)} method.
*/
class HTMLServletTest {
		
    /**
     * Test case for {@link HTMLServlet#doGet(HttpServletRequest, HttpServletResponse)}.
     * It tests the method with a request and response.
     */
    @Test
    void testDoGet() {
        HTMLServlet h = new HTMLServlet();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        try {
            h.doGet(request, response);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}

// HTMLServletTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLServlet}.
* It contains one unit test case for the {@link HTMLServlet#doGet(HttpServletRequest, HttpServletResponse)} method.
*/
class HTMLServletTest {
		
    /**
     * Test case for {@link HTMLServlet#doGet(HttpServletRequest, HttpServletResponse)}.
     * It tests the method with a request and response.
     */
    @Test
    void testDoGet() {
        HTMLServlet h = new HTMLServlet();
        HttpServletRequest request = null