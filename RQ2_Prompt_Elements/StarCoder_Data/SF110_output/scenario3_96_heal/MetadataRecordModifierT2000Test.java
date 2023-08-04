// MetadataRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.CopyrightTextBean;
import org.heal.module.metadata.DiseaseDiagnosisBean;
import org.heal.module.metadata.FormatBean;
import org.heal.module.metadata.KeywordBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.ThumbnailBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.servlet.Action;
import org.heal.util.DateTools;
import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MetadataRecordModifier}.
* It contains ten unit test cases for the {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
*/
class MetadataRecordModifierTest {

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>ServletRequest</code> contains a <code>"nextAction"</code>
     * parameter with a value of <code>"save"</code>.
     */
    @Test
    void test_getNextAction_save() {
        // Arrange
        ServletRequest request = new MockServletRequest();
        request.setParameter("nextAction", "save");
        MetadataRecordModifier modifier = new MetadataRecordModifier();

        // Act
        Action result = modifier.getNextAction(request);

        // Assert
        assertEquals(Action.SAVE, result);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>ServletRequest</code> contains a <code>"nextAction"</code>
     * parameter with a value of <code>"saveAndNext"</code>.
     */
    @Test
    void test_getNextAction_saveAndNext() {
        // Arrange
        ServletRequest request = new MockServletRequest();
        request.setParameter("nextAction", "saveAndNext");
        MetadataRecordModifier modifier = new MetadataRecordModifier();

        // Act
        Action result = modifier.getNextAction(request);

        // Assert
        assertEquals(Action.SAVE_AND_NEXT, result);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>ServletRequest</code> contains a <code>"nextAction"</code>
     * parameter with a value of <code>"saveAndNew"</code>.
     */
    @Test
    void test_getNextAction_saveAndNew() {
        // Arrange
        ServletRequest request = new MockServletRequest();
        request.setParameter("nextAction", "saveAndNew");
        MetadataRecordModifier modifier = new MetadataRecordModifier();

        // Act
        Action result = modifier.getNextAction(request);

        // Assert
        assertEquals(Action.SAVE_AND_NEW, result);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>ServletRequest</code> contains a <code>"nextAction"</code>
     * parameter with a value of <code>"saveAndNew"</code>.
     */
    @Test
    void test_getNextAction_saveAndNew_null() {
        // Arrange
        ServletRequest request = new MockServletRequest();
        MetadataRecordModifier modifier = new MetadataRecordModifier();

        // Act
        Action result = modifier.getNextAction(request);

        // Assert
        assertEquals(Action.SAVE_AND_NEW, result);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>ServletRequest</code> contains a <code>"nextAction"</code>
     * parameter with a value of <code>"saveAndNew"</code>.
     */
    @Test
    void test_getNextAction_saveAndNew_empty() {
        // Arrange
        ServletRequest request = new MockServletRequest();
        request.setParameter("nextAction", "");
        MetadataRecordModifier modifier = new MetadataRecordModifier();

        // Act
        Action result = modifier.getNextAction(request);

        // Assert
        assertEquals(Action.SAVE_AND_NEW, result);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>ServletRequest</code> contains a <code>"nextAction"</code>
     * parameter with a value of <code>"saveAndNew"</code>.
     */
    @Test
    void test_getNextAction_saveAndNew_invalid() {
        // Arrange
        ServletRequest request = new MockServletRequest();
        request.setParameter("nextAction", "invalid");
        MetadataRecordModifier modifier = new MetadataRecordModifier();

        // Act
        Action result = modifier.getNextAction(request);

        // Assert
        assertEquals(Action.SAVE_AND_NEW, result);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>ServletRequest</code> contains no <code>"nextAction"</code>
     * parameter.
     */
    @Test
    void test_getNextAction_null() {
        // Arrange
        ServletRequest request = new MockServletRequest();
        MetadataRecordModifier modifier = new MetadataRecordModifier();

        // Act
        Action result = modifier.getNextAction(request);

        // Assert
        assertEquals(Action.SAVE_AND_NEW, result);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>ServletRequest</code> contains no <code>"nextAction"</code>
     * parameter.
     */
    @Test
    void test_getNextAction_empty() {
        // Arrange
        ServletRequest request = new MockServletRequest();
        request.setParameter("nextAction", "");
        MetadataRecordModifier modifier = new MetadataRecordModifier();

        // Act
        Action result = modifier.getNextAction(request);

        // Assert
        assertEquals(Action.SAVE_AND_NEW, result);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>ServletRequest</code> contains no <code>"nextAction"</code>
     * parameter.
     */
    @Test
    void test_getNextAction_invalid() {
        // Arrange
        ServletRequest request = new MockServletRequest();
        request.setParameter("nextAction", "invalid");
        MetadataRecordModifier modifier = new MetadataRecordModifier();

        // Act
        Action result = modifier.getNextAction(request);

        // Assert
        assertEquals(Action.SAVE_AND_NEW, result);
    }
}

// MockServletRequest.java
package org.heal.servlet.cataloger;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>A mock implementation of {@link ServletRequest} for testing purposes.</p>
 */
class MockServletRequest implements ServletRequest {

    /**
     * <p>The parameters of the request.</p>
     */
    private Map<String, String[]> parameters = new HashMap<String, String[]>();

    /**
     * <p>Adds a parameter to the request.</p>
     *
     * @param name The name of the parameter.
     * @param value The value of the parameter.
     */
    public void addParameter(String name, String value) {
        String[] values = parameters.get(name);
        if (values == null) {
            values = new String[1];
            values[0] = value;
        } else {
            String[] newValues = new String[values.length + 1];
            System.arraycopy(values, 0, newValues, 0, values.length);
            newValues[values.length] = value;
            values = newValues;
        }
        parameters.put(name, values);
    }

    /**
     * <p>Returns the parameter names of the request.</p>
     *
     * @return The parameter names of the request.
     */
    public Enumeration<String> getParameterNames() {
        return Collections.enumeration(parameters.keySet());
    }

    /**
     * <p>Returns the parameter values of the request.</p>
     *
     * @param name The name of the parameter.
     * @return The parameter values of the request.
     */
    public String[] getParameterValues(String name) {
        return parameters.get(name);
    }

    /**
     * <p>Returns the parameter map of the request.</p>
     *
     * @return The parameter map of the request.
     */
    public Map<String, String[]> getParameterMap() {
        return parameters;
    }

    /**
     * <p>Returns the request as a {@link HttpServletRequest}.</p>
     *
     * @return The request as a {@link HttpServletRequest}.
     */
    public HttpServletRequest getHttpServletRequest() {
        return null;
    }
}

// MetadataRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.CopyrightTextBean;
import org.heal.module.metadata.DiseaseDiagnosisBean;
import org.heal.module.metadata.FormatBean;
import org.heal.module.metadata.KeywordBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.ThumbnailBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org