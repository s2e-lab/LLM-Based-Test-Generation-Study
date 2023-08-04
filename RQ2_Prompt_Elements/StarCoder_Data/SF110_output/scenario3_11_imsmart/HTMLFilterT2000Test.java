// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {

    /**
     * Test case for {@link HTMLFilter#filter(String)} method.
     */
    @Test
    void testFilter() {
        assertEquals("Hello World", HTMLFilter.filter("Hello World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello&World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello<World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello>World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\"World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello'World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello/World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\\World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\nWorld"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\rWorld"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\tWorld"));
    }
}

// HTMLFilter.java
package com.imsmart.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class HTMLFilter
 */
public class HTMLFilter implements Filter {

    /**
     * Default constructor. 
     */
    public HTMLFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		// pass the request along the filter chain
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String message = req.getParameter("message");
		message = HTMLFilter.filter(message);
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

// HTMLFilterTest.java
package com.imsmart.servlet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
		
    /**
     * Test case for {@link HTMLFilter#filter(String)} method.
     */
    @Test
    void testFilter() {
        assertEquals("Hello World", HTMLFilter.filter("Hello World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello&World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello<World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello>World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\"World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello'World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello/World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\\World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\nWorld"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\rWorld"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\tWorld"));
    }
}

// HTMLFilter.java
package com.imsmart.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class HTMLFilter
 */
public class HTMLFilter implements Filter {

    /**
     * Default constructor. 
     */
    public HTMLFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		// pass the request along the filter chain
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String message = req.getParameter("message");
		message = HTMLFilter.filter(message);
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

// HTMLFilterTest.java
package com.imsmart.servlet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
		
    /**
     * Test case for {@link HTMLFilter#filter(String)} method.
     */
    @Test
    void testFilter() {
        assertEquals("Hello World", HTMLFilter.filter("Hello World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello&World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello<World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello>World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\"World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello'World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello/World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\\World"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\nWorld"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\rWorld"));
        assertEquals("Hello World", HTMLFilter.filter("Hello\tWorld"));
    }
}

// HTMLFilter.java
package com.imsmart.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class HTMLFilter
 */
public class HTMLFilter implements Filter {

    /**
     * Default constructor. 
     */
    public HTMLFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		// pass the request along the filter chain
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String message = req.getParameter("message");
		message = HTMLFilter.filter(message);
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

// HTMLFilterTest.java
package com.imsmart.servlet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
		
    /**
     * Test case for {@link HTMLFilter#filter(String)} method.
     */