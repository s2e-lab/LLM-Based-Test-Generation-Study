// ShowApprovalQueueActionTest.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ShowApprovalQueueAction}.
* It contains ten unit test cases for the {@link ShowApprovalQueueAction#actionRequiresLogin()} method.
*/
class ShowApprovalQueueActionTest {

    /**
     * Test case for {@link ShowApprovalQueueAction#actionRequiresLogin()}
     * when the user is not logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsNotLoggedIn() {
        ShowApprovalQueueAction action = new ShowApprovalQueueAction();
        boolean result = action.actionRequiresLogin();
        assertTrue(result);
    }

    /**
     * Test case for {@link ShowApprovalQueueAction#actionRequiresLogin()}
     * when the user is logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsLoggedIn() {
        ShowApprovalQueueAction action = new ShowApprovalQueueAction();
        AuthenticationTools.setLoggedInUser("testUser");
        boolean result = action.actionRequiresLogin();
        assertFalse(result);
    }
}

// ShowApprovalQueueAction.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * An {@link org.heal.servlet.Action} which fetches the information needed to
 * display the approval queue.
 *
 * @author <NAME> (<A HREF="mailto:schaefer@lib.med.utah.edu">schaefer@lib.med.utah.edu</A>)
 */
public class ShowApprovalQueueAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }

    /**
     * Fetches the information needed to display the approval queue.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<QueueDAO> queue = QueueDAO.getQueue();
        request.setAttribute("queue", queue);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/approver/approvalQueue.jsp");
        dispatcher.forward(request, response);
    }
}

// ApprovalQueueServlet.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * A servlet which displays the approval queue.
 *
 * @author <NAME> (<A HREF="mailto:schaefer@lib.med.utah.edu">schaefer@lib.med.utah.edu</A>)
 */
public class ApprovalQueueServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Action action = new ShowApprovalQueueAction();
        action.process(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

// ApprovalQueueServletTest.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApprovalQueueServlet}.
* It contains ten unit test cases for the {@link ApprovalQueueServlet#doGet(HttpServletRequest, HttpServletResponse)} method.
*/
class ApprovalQueueServletTest {
		
    /**
     * Test case for {@link ApprovalQueueServlet#doGet(HttpServletRequest, HttpServletResponse)}
     * when the user is not logged in.
     */
    @Test
    void testDoGetWhenUserIsNotLoggedIn() throws ServletException, IOException {
        ApprovalQueueServlet servlet = new ApprovalQueueServlet();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        servlet.doGet(request, response);
    }

    /**
     * Test case for {@link ApprovalQueueServlet#doGet(HttpServletRequest, HttpServletResponse)}
     * when the user is logged in.
     */
    @Test
    void testDoGetWhenUserIsLoggedIn() throws ServletException, IOException {
        ApprovalQueueServlet servlet = new ApprovalQueueServlet();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        AuthenticationTools.setLoggedInUser("testUser");
        servlet.doGet(request, response);
    }
}

// ApprovalQueueServlet.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * A servlet which displays the approval queue.
 *
 * @author <NAME> (<A HREF="mailto:schaefer@lib.med.utah.edu">schaefer@lib.med.utah.edu</A>)
 */
public class ApprovalQueueServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Action action = new ShowApprovalQueueAction();
        action.process(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @