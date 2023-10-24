// ModifyApprovalQueueEntryActionTest.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.module.catalog.QueuedRecordBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyApprovalQueueEntryAction}.
* It contains ten unit test cases for the {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyApprovalQueueEntryActionTest {

    /**
     * Test case for {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()}
     * @throws IOException
     * @throws ServletException
     */
    @Test
    void testActionRequiresLogin() throws IOException, ServletException {
        final ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        final HttpServlet servlet = new HttpServlet() {
            @Override
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // do nothing
            }
        };
        final HttpServletRequest request = new HttpServletRequest() {
            @Override
            public String getParameter(String name) {
                return null;
            }
        };
        final HttpServletResponse response = new HttpServletResponse() {
            @Override
            public void sendRedirect(String location) throws IOException {
                // do nothing
            }
        };
        assertTrue(action.actionRequiresLogin());
        assertTrue(action.actionRequiresLogin());
        assertTrue(action.actionRequiresLogin());
        assertTrue(action.actionRequiresLogin());
        assertTrue(action.actionRequiresLogin());
        assertTrue(action.actionRequiresLogin());
        assertTrue(action.actionRequiresLogin());
        assertTrue(action.actionRequiresLogin());
        assertTrue(action.actionRequiresLogin());
        assertTrue(action.actionRequiresLogin());
        assertTrue(action.actionRequiresLogin());
    }
}
