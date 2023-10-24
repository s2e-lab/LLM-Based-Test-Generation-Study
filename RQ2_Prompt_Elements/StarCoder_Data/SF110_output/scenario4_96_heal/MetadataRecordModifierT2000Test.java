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

    private static final Map nextActionMap;

    private static final Action NEXT_ACTION_DEFAULT = new EditMetadataAction();

    static {
        nextActionMap = new HashMap();
        nextActionMap.put("editMetadata", new EditMetadataAction());
        nextActionMap.put("saveMetadata", new SaveMetadataAction());
        nextActionMap.put("cancelMetadata", new CancelMetadataAction());
    }

    @Test
    void testGetNextAction() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = null;
        Action action = modifier.getNextAction(request);
        assertEquals(NEXT_ACTION_DEFAULT, action);

        request = new MockServletRequest("editMetadata");
        action = modifier.getNextAction(request);
        assertEquals(nextActionMap.get("editMetadata"), action);

        request = new MockServletRequest("saveMetadata");
        action = modifier.getNextAction(request);
        assertEquals(nextActionMap.get("saveMetadata"), action);

        request = new MockServletRequest("cancelMetadata");
        action = modifier.getNextAction(request);
        assertEquals(nextActionMap.get("cancelMetadata"), action);

        request = new MockServletRequest("invalidAction");
        action = modifier.getNextAction(request);
        assertEquals(NEXT_ACTION_DEFAULT, action);
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

    private Map parameterMap;

    public MockServletRequest(String action) {
        parameterMap = new HashMap();
        parameterMap.put("action", action);
    }

    public Object getAttribute(String name) {
        return null;
    }

    public Enumeration getAttributeNames() {
        return null;
    }

    public String getCharacterEncoding() {
        return null;
    }

    public int getContentLength() {
        return 0;
    }

    public String getContentType() {
        return null;
    }

    public ServletInputStream getInputStream() {
        return null;
    }

    public String getLocalAddr() {
        return null;
    }

    public String getLocalName() {
        return null;
    }

    public int getLocalPort() {
        return 0;
    }

    public Locale getLocale() {
        return null;
    }

    public Enumeration getLocales() {
        return null;
    }

    public String getParameter(String name) {
        return (String) parameterMap.get(name);
    }

    public Map getParameterMap() {
        return parameterMap;
    }

    public Enumeration getParameterNames() {
        return parameterMap.keys();
    }

    public String[] getParameterValues(String name) {
        return (String[]) parameterMap.get(name);
    }

    public String getProtocol() {
        return null;
    }

    public BufferedReader getReader() {
        return null;
    }

    public String getRealPath(String path) {
        return null;
    }

    public String getRemoteAddr() {
        return null;
    }

    public String getRemoteHost() {
        return null;
    }

    public int getRemotePort() {
        return 0;
    }

    public RequestDispatcher getRequestDispatcher(String path) {
        return null;
    }

    public String getScheme() {
        return null;
    }

    public String getServerName() {
        return null;
    }

    public int getServerPort() {
        return 0;
    }

    public boolean isSecure() {
        return false;
    }

    public void removeAttribute(String name) {
    }

    public void setAttribute(String name, Object o) {
    }

    public void setCharacterEncoding(String env) {
    }
}

// EditMetadataAction.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;

/**
 * <p>An {@link Action} which will take the user to the edit metadata page.</p>
 */
class EditMetadataAction implements Action {

    public String execute() {
        return "editMetadata";
    }
}

// SaveMetadataAction.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;

/**
 * <p>An {@link Action} which will save the metadata from the form.</p>
 */
class SaveMetadataAction implements Action {

    public String execute() {
        return "saveMetadata";
    }
}

// CancelMetadataAction.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;

/**
 * <p>An {@link Action} which will cancel the metadata from the form.</p>
 */
class CancelMetadataAction implements Action {

    public String execute() {
        return "cancelMetadata";
    }
}

// MetadataRecordModifier.java
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

/**
 * <p>A {@link MetadataModifier} which fills the basic metadata information
 * from a <code>ServletRequest</code> into a {@link CompleteMetadataBean}.</p>
 */
public class MetadataRecordModifier implements MetadataModifier {

    private static final Map nextActionMap;

    private static final Action NEXT_ACTION_DEFAULT = new EditMetadataAction();

    static {
        nextActionMap = new HashMap();
        nextActionMap.put("editMetadata", new EditMetadataAction());
        nextActionMap.put("saveMetadata", new SaveMetadataAction());
        nextActionMap.put("cancelMetadata", new CancelMetadataAction());
    }

    public MetadataRecordModifier() {
    }

    public void updateMetadata(CompleteMetadataBean cmb, ServletRequest request) {
        String action = request.getParameter("action");
        if (action == null) {
            action = "editMetadata";
        }
        cmb.setAction(action);

        String title = request.getParameter("title");
        if (title != null) {
            cmb.setTitle(title);
        }

        String description = request.getParameter("description");
        if (description != null) {
            cmb.setDescription(description);
        }

        String publisher = request.getParameter("publisher");
        if (publisher != null) {
            cmb.setPublisher(publisher);
        }

        String language = request.getParameter("language");
        if (language != null) {
            cmb.setLanguage(language);
        }

        String rights = request.getParameter("rights");
        if (rights != null) {
            cmb.setRights(rights);
        }

        String rightsHolder = request.getParameter("rightsHolder");
        if (rightsHolder != null) {
            cmb.setRightsHolder(rightsHolder);
        }

        String license = request.getParameter("license");
        if (license != null) {
            cmb.setLicense(license);
        }

        String licenseVersion = request.getParameter("licenseVersion");
        if (licenseVersion != null) {
            cmb.setLicenseVersion(licenseVersion);
        }

        String licenseUrl = request.getParameter("licenseUrl");
        if (licenseUrl != null) {
            cmb.setLicenseUrl(licenseUrl);
        }

        String version = request.getParameter("version");
        if (version != null) {
            cmb.setVersion(version);
        }

        String revisionDate = request.getParameter("revisionDate");
        if (revisionDate != null) {
            cmb.setRevisionDate(DateTools.parseDate(revision