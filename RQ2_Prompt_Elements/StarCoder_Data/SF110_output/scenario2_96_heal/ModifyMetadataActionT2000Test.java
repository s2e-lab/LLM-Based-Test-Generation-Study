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

// MetadataRecordModifier.java
package org.heal.module.metadata;

import org.heal.module.metadata.MetadataRecord;
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
 * to forms.</p>
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
public class MetadataRecordModifier implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// MetadataRecordModifierTest.java
package org.heal.module.metadata;

import org.heal.module.metadata.MetadataRecord;
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
* Test class of {@link MetadataRecordModifier}.
* It contains ten unit test cases for the {@link MetadataRecordModifier#actionRequiresLogin()} method.
*/
class MetadataRecordModifierTest {
		
    /**
     * Test case for {@link MetadataRecordModifier#actionRequiresLogin()}
     * when the user is not logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsNotLoggedIn() {
        MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
        boolean result = metadataRecordModifier.actionRequiresLogin();
        assertTrue(result);
    }

    /**
     * Test case for {@link MetadataRecordModifier#actionRequiresLogin()}
     * when the user is logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsLoggedIn() {
        MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
        AuthenticationTools.setAuthenticatedUser("testUser");
        boolean result = metadataRecordModifier.actionRequiresLogin();
        assertFalse(result);
    }
}

// ContextURLRecordModifier.java
package org.heal.module.metadata;

import org.heal.module.metadata.MetadataRecord;
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
 * to forms.</p>
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
public class ContextURLRecordModifier implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// ContextURLRecordModifierTest.java
package org.heal.module.metadata;

import org.heal.module.metadata.MetadataRecord;
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
* Test class of {@link ContextURLRecordModifier}.
* It contains ten unit test cases for the {@link ContextURLRecordModifier#actionRequiresLogin()} method.
*/
class ContextURLRecordModifierTest {
		
    /**
     * Test case for {@link ContextURLRecordModifier#actionRequiresLogin()}
     * when the user is not logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsNotLoggedIn() {
        ContextURLRecordModifier contextURLRecordModifier = new ContextURLRecordModifier();
        boolean result = contextURLRecordModifier.actionRequiresLogin();
        assertTrue(result);
    }

    /**
     * Test case for {@link ContextURLRecordModifier#actionRequiresLogin()}
     * when the user is logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsLoggedIn() {
        ContextURLRecordModifier contextURLRecordModifier = new ContextURLRecordModifier();
        AuthenticationTools.setAuthenticatedUser("testUser");
        boolean result = contextURLRecordModifier.actionRequiresLogin();
        assertFalse(result);
    }
}

// ContributorRecordModifier.java
package org.heal.module.metadata;

import org.heal.module.metadata.MetadataRecord;
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
 * to forms.</p>
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
public class ContributorRecordModifier implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// ContributorRecordModifierTest.java
package org.heal.module.metadata;

import org.heal.module.metadata.MetadataRecord;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;