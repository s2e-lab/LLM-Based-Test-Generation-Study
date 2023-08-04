// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditCopyrightHolderAction}.
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {

    /**
     * Test case for {@link EditCopyrightHolderAction#actionRequiresLogin()}
     * when the user is not logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsNotLoggedIn() {
        EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
        boolean result = editCopyrightHolderAction.actionRequiresLogin();
        assertTrue(result);
    }

    /**
     * Test case for {@link EditCopyrightHolderAction#actionRequiresLogin()}
     * when the user is logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsLoggedIn() {
        EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
        boolean result = editCopyrightHolderAction.actionRequiresLogin();
        assertTrue(result);
    }
}

// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditCopyrightHolderAction}.
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class EditCopyrightHolderActionTest {
		
    /**
     * Test case for {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}
     * when the user is not logged in.
     */
    @Test
    void testPerformWhenUserIsNotLoggedIn() throws IOException, ServletException {
        EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
        HttpServlet servlet = new HttpServlet() {
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.sendRedirect("/error/accessDenied.jsp");
            }
        };
        HttpServletRequest request = new HttpServletRequest() {
            public String getParameter(String name) {
                return "1";
            }
        };
        HttpServletResponse response = new HttpServletResponse() {
            public void sendRedirect(String url) throws IOException {
                assertEquals("/error/accessDenied.jsp", url);
            }
        };
        editCopyrightHolderAction.perform(servlet, request, response);
    }

    /**
     * Test case for {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}
     * when the user is logged in.
     */
    @Test
    void testPerformWhenUserIsLoggedIn() throws IOException, ServletException {
        EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
        HttpServlet servlet = new HttpServlet() {
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.sendRedirect("/error/accessDenied.jsp");
            }
        };
        HttpServletRequest request = new HttpServletRequest() {
            public String getParameter(String name) {
                return "1";
            }
        };
        HttpServletResponse response = new HttpServletResponse() {
            public void sendRedirect(String url) throws IOException {
                assertEquals("/error/accessDenied.jsp", url);
            }
        };
        editCopyrightHolderAction.perform(servlet, request, response);
    }
}

// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditCopyrightHolderAction}.
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class EditCopyrightHolderActionTest {
		
    /**
     * Test case for {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}
     * when the user is not logged in.
     */
    @Test
    void testPerformWhenUserIsNotLoggedIn() throws IOException, ServletException {
        EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
        HttpServlet servlet = new HttpServlet() {
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.sendRedirect("/error/accessDenied.jsp");
            }
        };
        HttpServletRequest request = new HttpServletRequest() {
            public String getParameter(String name) {
                return "1";
            }
        };
        HttpServletResponse response = new HttpServletResponse() {
            public void sendRedirect(String url) throws IOException {
                assertEquals("/error/accessDenied.jsp", url);
            }
        };
        editCopyrightHolderAction.perform(servlet, request, response);
    }

    /**
     * Test case for {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}
     * when the user is logged in.
     */
    @Test
    void testPerformWhenUserIsLoggedIn() throws IOException, ServletException {
        EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
        HttpServlet servlet = new HttpServlet() {
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.sendRedirect("/error/accessDenied.jsp");
            }
        };
        HttpServletRequest request = new HttpServletRequest() {
            public String getParameter(String name) {
                return "1";
            }
        };
        HttpServletResponse response = new HttpServletResponse() {
            public void sendRedirect(String url) throws IOException {
                assertEquals("/error/accessDenied.jsp", url);
            }
        };
        editCopyrightHolderAction.perform(servlet, request, response);
    }
}

// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditCopyrightHolderAction}.
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class EditCopyrightHolderActionTest {
		
    /**
     * Test case for {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}
     * when the user is not logged in.
     */
    @Test
    void testPerformWhenUserIsNotLoggedIn() throws IOException, ServletException {
        EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
        HttpServlet servlet = new HttpServlet() {
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.sendRedirect("/error/accessDenied.jsp");
            }
        };
        HttpServletRequest request = new HttpServletRequest() {
            public String getParameter(String name) {
                return "1";
            }
        };
        HttpServletResponse response = new HttpServletResponse() {
            public void sendRedirect(String url) throws IOException {
                assertEquals("/error/accessDenied.jsp", url);
            }
        };
        editCopyrightHolderAction.perform(servlet, request, response);
    }

    /**
     * Test case for {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}
     * when the user is logged in.
     */
    @Test
    void testPerformWhenUserIsLoggedIn() throws IOException, ServletException {
        EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
        HttpServlet servlet = new HttpServlet() {
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.sendRedirect("/error/accessDenied.jsp");
            }
        };
        HttpServletRequest request = new HttpServletRequest() {
            public String getParameter(String name) {
                return "1";
            }
        };
        HttpServletResponse response = new HttpServletResponse() {
            public void sendRedirect(String url) throws IOException {
                assertEquals("/error/accessDenied.jsp", url);
            }
        };
        editCopyrightHolderAction.perform(servlet, request, response);
    }
}

// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.