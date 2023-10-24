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
     * <p>Test case for {@link ModifyMetadataAction#actionRequiresLogin()}.</p>
     *
     * <p>It tests that the method returns <code>true</code>.</p>
     */
    @Test
    void testActionRequiresLogin() {
        ModifyMetadataAction modifyMetadataAction = new ModifyMetadataAction();
        assertTrue(modifyMetadataAction.actionRequiresLogin());
    }
}

// MetadataModifier.java
package org.heal.module.metadata;

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
 * <p>An interface for a class that can modify a {@link CompleteMetadataBean}
 * by saving the modifications from a form into the bean.</p>
 *
 * <p>The {@link MetadataModifier}s are used by the {@link ModifyMetadataAction}
 * to save the modifications from a form into the {@link CompleteMetadataBean}.</p>
 */
public interface MetadataModifier {

    /**
     * <p>This method saves the modifications from the <code>request</code> into
     * the <code>metadata</code>.</p>
     *
     * <p>It returns the next {@link Action} to execute.</p>
     */
    public Action modify(CompleteMetadataBean metadata, HttpServletRequest request);
}

// MetadataRecordModifier.java
package org.heal.module.metadata;

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
 * <p>A {@link MetadataModifier} that saves the metadata from a form into
 * the session's {@link CompleteMetadataBean} by mapping {@link MetadataModifier}s
 * to forms.</p>
 *
 * <p>The {@link MetadataModifier} which matches the form determines
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
public class MetadataRecordModifier implements MetadataModifier {

    /**
     * <p>This method saves the modifications from the <code>request</code> into
     * the <code>metadata</code>.</p>
     *
     * <p>It returns the next {@link Action} to execute.</p>
     */
    public Action modify(CompleteMetadataBean metadata, HttpServletRequest request) {
        String metadataValue = request.getParameter("metadata");
        if (metadataValue != null) {
            metadata.setMetadata(metadataValue);
        }
        return new MetadataAction();
    }
}

// ContextURLRecordModifier.java
package org.heal.module.metadata;

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
 * <p>A {@link MetadataModifier} that saves the metadata from a form into
 * the session's {@link CompleteMetadataBean} by mapping {@link MetadataModifier}s
 * to forms.</p>
 *
 * <p>The {@link MetadataModifier} which matches the form determines
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
public class ContextURLRecordModifier implements MetadataModifier {

    /**
     * <p>This method saves the modifications from the <code>request</code> into
     * the <code>metadata</code>.</p>
     *
     * <p>It returns the next {@link Action} to execute.</p>
     */
    public Action modify(CompleteMetadataBean metadata, HttpServletRequest request) {
        String contextURLValue = request.getParameter("contextURL");
        if (contextURLValue != null) {
            metadata.setContextURL(contextURLValue);
        }
        return new ContextURLAction();
    }
}

// ContributorRecordModifier.java
package org.heal.module.metadata;

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
 * <p>A {@link MetadataModifier} that saves the metadata from a form into
 * the session's {@link CompleteMetadataBean} by mapping {@link MetadataModifier}s
 * to forms.</p>
 *
 * <p>The {@link MetadataModifier} which matches the form determines
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
public class ContributorRecordModifier implements MetadataModifier {

    /**
     * <p>This method saves the modifications from the <code>request</code> into
     * the <code>metadata</code>.</p>
     *
     * <p>It returns the next {@link Action} to execute.</p>
     */
    public Action modify(CompleteMetadataBean metadata, HttpServletRequest request) {
        String contributorValue = request.getParameter("contributor");
        if (contributorValue != null) {
            metadata.setContributor(contributorValue);
        }
        return new ContributorAction();
    }
}

// CopyrightHolderRecordModifier.java
package org.heal.module.metadata;

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
 * <p>A {@link MetadataModifier} that saves the metadata from a form into
 * the session's {@link CompleteMetadataBean} by mapping {@link MetadataModifier}s
 * to forms.</p>
 *
 * <p>The {@link MetadataModifier} which matches the form determines
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
public class CopyrightHolderRecordModifier implements MetadataModifier {

    /**
     * <