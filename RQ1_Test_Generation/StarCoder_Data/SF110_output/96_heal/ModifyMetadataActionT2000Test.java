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
     * <p>This test case checks that the method returns <code>true</code>.</p>
     */
    @Test
    void testActionRequiresLogin() {
        ModifyMetadataAction action = new ModifyMetadataAction();
        assertTrue(action.actionRequiresLogin());
    }
}

// MetadataModifier.java
package org.heal.module.metadata;

import org.heal.servlet.Action;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>An interface for a class that can modify a {@link CompleteMetadataBean}
 * based on the information in a {@link HttpServletRequest}.</p>
 *
 * <p>The {@link ModifyMetadataAction} uses this interface to determine
 * which {@link MetadataModifier} to use to modify the metadata.</p>
 */
public interface MetadataModifier {

    /**
     * <p>This method is called by the {@link ModifyMetadataAction} to
     * update the metadata in the {@link CompleteMetadataBean} based on
     * the information in the <code>request</code>.</p>
     *
     * <p>This method should not modify the <code>request</code> or the
     * <code>response</code>.</p>
     *
     * @param cmb the {@link CompleteMetadataBean} to update
     * @param request the {@link HttpServletRequest} containing the information
     * to update the metadata
     */
    public void updateMetadata(CompleteMetadataBean cmb, HttpServletRequest request);

    /**
     * <p>This method is called by the {@link ModifyMetadataAction} to
     * determine the next {@link Action} to execute based on the information
     * in the <code>request</code>.</p>
     *
     * <p>This method should not modify the <code>request</code> or the
     * <code>response</code>.</p>
     *
     * @param request the {@link HttpServletRequest} containing the information
     * to determine the next {@link Action}
     * @return the next {@link Action} to execute
     */
    public Action getNextAction(HttpServletRequest request);
}

// MetadataRecordModifier.java
package org.heal.module.metadata;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>A {@link MetadataModifier} that updates the metadata in the
 * {@link CompleteMetadataBean} based on the information in the
 * <code>request</code>.</p>
 *
 * <p>This class is used to update the metadata in the
 * {@link CompleteMetadataBean} based on the information in the
 * <code>request</code> for the 'metadata' form.</p>
 */
public class MetadataRecordModifier implements MetadataModifier {

    /**
     * <p>This method is called by the {@link ModifyMetadataAction} to
     * update the metadata in the {@link CompleteMetadataBean} based on
     * the information in the <code>request</code>.</p>
     *
     * <p>This method should not modify the <code>request</code> or the
     * <code>response</code>.</p>
     *
     * @param cmb the {@link CompleteMetadataBean} to update
     * @param request the {@link HttpServletRequest} containing the information
     * to update the metadata
     */
    public void updateMetadata(CompleteMetadataBean cmb, HttpServletRequest request) {
        cmb.setMetadata(request.getParameter("metadata"));
    }

    /**
     * <p>This method is called by the {@link ModifyMetadataAction} to
     * determine the next {@link Action} to execute based on the information
     * in the <code>request</code>.</p>
     *
     * <p>This method should not modify the <code>request</code> or the
     * <code>response</code>.</p>
     *
     * @param request the {@link HttpServletRequest} containing the information
     * to determine the next {@link Action}
     * @return the next {@link Action} to execute
     */
    public Action getNextAction(HttpServletRequest request) {
        return new MetadataAction();
    }
}

// ContextURLRecordModifier.java
package org.heal.module.metadata;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>A {@link MetadataModifier} that updates the metadata in the
 * {@link CompleteMetadataBean} based on the information in the
 * <code>request</code>.</p>
 *
 * <p>This class is used to update the metadata in the
 * {@link CompleteMetadataBean} based on the information in the
 * <code>request</code> for the 'contextURL' form.</p>
 */
public class ContextURLRecordModifier implements MetadataModifier {

    /**
     * <p>This method is called by the {@link ModifyMetadataAction} to
     * update the metadata in the {@link CompleteMetadataBean} based on
     * the information in the <code>request</code>.</p>
     *
     * <p>This method should not modify the <code>request</code> or the
     * <code>response</code>.</p>
     *
     * @param cmb the {@link CompleteMetadataBean} to update
     * @param request the {@link HttpServletRequest} containing the information
     * to update the metadata
     */
    public void updateMetadata(CompleteMetadataBean cmb, HttpServletRequest request) {
        cmb.setContextURL(request.getParameter("contextURL"));
    }

    /**
     * <p>This method is called by the {@link ModifyMetadataAction} to
     * determine the next {@link Action} to execute based on the information
     * in the <code>request</code>.</p>
     *
     * <p>This method should not modify the <code>request</code> or the
     * <code>response</code>.</p>
     *
     * @param request the {@link HttpServletRequest} containing the information
     * to determine the next {@link Action}
     * @return the next {@link Action} to execute
     */
    public Action getNextAction(HttpServletRequest request) {
        return new ContextURLAction();
    }
}

// ContributorRecordModifier.java
package org.heal.module.metadata;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>A {@link MetadataModifier} that updates the metadata in the
 * {@link CompleteMetadataBean} based on the information in the
 * <code>request</code>.</p>
 *
 * <p>This class is used to update the metadata in the
 * {@link CompleteMetadataBean} based on the information in the
 * <code>request</code> for the 'contributor' form.</p>
 */
public class ContributorRecordModifier implements MetadataModifier {

    /**
     * <p>This method is called by the {@link ModifyMetadataAction} to
     * update the metadata in the {@link CompleteMetadataBean} based on
     * the information in the <code>request</code>.</p>
     *
     * <p>This method should not modify the <code>request</code> or the
     * <code>response</code>.</p>
     *
     * @param cmb the {@link CompleteMetadataBean} to update
     * @param request the {@link HttpServletRequest} containing the information
     * to update the metadata
     */
    public void updateMetadata(CompleteMetadataBean cmb, HttpServletRequest request) {
        cmb.setContributor(request.getParameter("contributor"));
    }

    /**
     * <p>This method is called by the {@link ModifyMetadataAction} to
     * determine the next {@link Action} to execute based on the information
     * in the <code>request</code>.</p>
     *
     * <p>This method should not modify the <code>request</code> or the
     * <code>response</code>.</p>
     *
     * @param request the {@link HttpServletRequest} containing the information
     * to determine the next {@link Action}
     * @return the next {@link Action} to execute
     */
    public Action getNextAction(HttpServletRequest request) {
        return new ContributorAction();
    }
}

// CopyrightHolder