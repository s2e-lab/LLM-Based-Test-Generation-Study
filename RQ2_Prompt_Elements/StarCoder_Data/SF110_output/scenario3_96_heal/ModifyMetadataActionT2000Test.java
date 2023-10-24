// ModifyMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyMetadataAction}.
* It contains ten unit test cases for the {@link ModifyMetadataAction#actionRequiresLogin()} method.
*/
class ModifyMetadataActionTest {

    /**
     * Test case for {@link ModifyMetadataAction#actionRequiresLogin()}
     * when the user is not logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsNotLoggedIn() {
        ModifyMetadataAction modifyMetadataAction = new ModifyMetadataAction();
        boolean result = modifyMetadataAction.actionRequiresLogin();
        assertTrue(result);
    }

    /**
     * Test case for {@link ModifyMetadataAction#actionRequiresLogin()}
     * when the user is logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsLoggedIn() {
        ModifyMetadataAction modifyMetadataAction = new ModifyMetadataAction();
        AuthenticationTools.setAuthenticatedUser("testUser");
        boolean result = modifyMetadataAction.actionRequiresLogin();
        assertFalse(result);
    }
}

// ModifyMetadataAction.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>An {@link Action} that saves the metadata from a form into
 * the session's {@link CompleteMetadataBean} by mapping {@link MetadataModifier}s
 * to forms.  The {@link MetadataModifier} which matches the form determines
 * the next {@link Action} to execute.</p>
 *
 * <p>The mapping is currently defined as:</p>
 *
 * <ul><li>'metadata' : {@link MetadataRecordModifier}
 * <li>'contextURL' : {@link ContextURLRecordModifier}
 * <li>'contributor' : {@link ContributorRecordModifier}
 * <li>'copyrightHolder' : {@link CopyrightHolderRecordModifier}
 * <li>'controlledVocabulary' : {@link ControlledVocabularyRecordModifier}
 * <li>'requirement' : {@link RequirementRecordModifier}
 * </ul>
 */
public class ModifyMetadataAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// ModifyMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyMetadataAction}.
* It contains ten unit test cases for the {@link ModifyMetadataAction#actionRequiresLogin()} method.
*/
class ModifyMetadataActionTest {
		
    /**
     * Test case for {@link ModifyMetadataAction#actionRequiresLogin()}
     * when the user is not logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsNotLoggedIn() {
        ModifyMetadataAction modifyMetadataAction = new ModifyMetadataAction();
        boolean result = modifyMetadataAction.actionRequiresLogin();
        assertTrue(result);
    }

    /**
     * Test case for {@link ModifyMetadataAction#actionRequiresLogin()}
     * when the user is logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsLoggedIn() {
        ModifyMetadataAction modifyMetadataAction = new ModifyMetadataAction();
        AuthenticationTools.setAuthenticatedUser("testUser");
        boolean result = modifyMetadataAction.actionRequiresLogin();
        assertFalse(result);
    }
}

// ModifyMetadataAction.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>An {@link Action} that saves the metadata from a form into
 * the session's {@link CompleteMetadataBean} by mapping {@link MetadataModifier}s
 * to forms.  The {@link MetadataModifier} which matches the form determines
 * the next {@link Action} to execute.</p>
 *
 * <p>The mapping is currently defined as:</p>
 *
 * <ul><li>'metadata' : {@link MetadataRecordModifier}
 * <li>'contextURL' : {@link ContextURLRecordModifier}
 * <li>'contributor' : {@link ContributorRecordModifier}
 * <li>'copyrightHolder' : {@link CopyrightHolderRecordModifier}
 * <li>'controlledVocabulary' : {@link ControlledVocabularyRecordModifier}
 * <li>'requirement' : {@link RequirementRecordModifier}
 * </ul>
 */
public class ModifyMetadataAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// ModifyMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyMetadataAction}.
* It contains ten unit test cases for the {@link ModifyMetadataAction#actionRequiresLogin()} method.
*/
class ModifyMetadataActionTest {
		
    /**
     * Test case for {@link ModifyMetadataAction#actionRequiresLogin()}
     * when the user is not logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsNotLoggedIn() {
        ModifyMetadataAction modifyMetadataAction = new ModifyMetadataAction();
        boolean result = modifyMetadataAction.actionRequiresLogin();
        assertTrue(result);
    }

    /**
     * Test case for {@link ModifyMetadataAction#actionRequiresLogin()}
     * when the user is logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsLoggedIn() {
        ModifyMetadataAction modifyMetadataAction = new ModifyMetadataAction();
        AuthenticationTools.setAuthenticatedUser("testUser");
        boolean result = modifyMetadataAction.actionRequiresLogin();
        assertFalse(result);
    }
}

// ModifyMetadataAction.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>An {@link Action} that saves the metadata from a form into
 * the session's {@link CompleteMetadataBean} by mapping {@link MetadataModifier}s
 * to forms.  The {@link MetadataModifier} which matches the form determines
 * the next {@link Action} to execute.</p>
 *
 * <p>The mapping is currently defined as:</p>
 *
 * <ul><li>'metadata' : {@link MetadataRecordModifier}
 * <li>'contextURL' : {@link ContextURLRecordModifier}
 * <li>'contributor' : {@link ContributorRecordModifier}
 * <li>'copyrightHolder' : {@link CopyrightHolderRecordModifier}
 * <li>'controlledVocabulary' : {@link ControlledVocabularyRecordModifier}
 * <li>'requirement' : {@link RequirementRecordModifier}
 * </ul>
 */
public class ModifyMetadataAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// ModifyMetadataActionTest.java
package org.heal.servlet.cataloger;

import