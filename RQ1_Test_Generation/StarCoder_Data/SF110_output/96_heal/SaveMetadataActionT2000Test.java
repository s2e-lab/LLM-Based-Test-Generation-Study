// SaveMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SaveMetadataAction}.
* It contains ten unit test cases for the {@link SaveMetadataAction#actionRequiresLogin()} method.
*/
class SaveMetadataActionTest {

    /**
     * Test method for {@link SaveMetadataAction#actionRequiresLogin()}.
     */
    @Test
    void testActionRequiresLogin() {
        final SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertTrue(saveMetadataAction.actionRequiresLogin());
    }
}

// SaveMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SaveMetadataAction}.
* It contains ten unit test cases for the {@link SaveMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class SaveMetadataActionTest {
		
    /**
     * Test method for {@link SaveMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}.
     */
    @Test
    void testPerform() throws IOException, ServletException {
        final SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        final HttpServlet servlet = new HttpServlet() {
            public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // We skip the usual authentication-checking stuff since this
                // already should've been done by ModifyMetadataAction
                final CompleteMetadataBean metadata = (CompleteMetadataBean) request.getSession().getAttribute("metadata");
                // This shouldn't be necessary, but it won't hurt to check
                if (null == metadata) {
                    response.sendRedirect("/error/accessDenied.jsp");
                    return;
                }
                // Makes a best effort to prevent the session metadata object from
                // being changed and then having a stale edit metadata form submitted,
                // which would save bad data
                final String metadataId = metadata.getMetadataId();
                final String formMetadataId = request.getParameter("metadataId");
                if (!(null == metadataId && 0 == formMetadataId.length()) && !formMetadataId.equals(metadataId)) {
                    request.setAttribute("reason", "Session metadataId doesn't match metadataId submitted with form.");
                    RequestDispatcher rd = request.getRequestDispatcher("/error/accessDenied.jsp");
                    rd.forward(request, response);
                    return;
                }
                final MetadataDAO metadataServices = (MetadataDAO) getServletContext().getAttribute("MetadataDAO");
                scrubMetadata(metadata);
                try {
                    metadataServices.saveEditMetadataForm(metadata);
                } catch (SQLException e) {
                    throw new ServletException(e);
                }
                if (null == metadataId) {
                    // This is a new record, so we add it to the approval queue
                    final QueueDAO queueManager = (QueueDAO) getServletContext().getAttribute("QueueDAO");
                    queueManager.enqueue(QueueDAO.TYPE_APPROVAL, metadata.getMetadataId());
                }
                request.getSession().setAttribute("metadata", null);
                response.sendRedirect("showMetadata?metadataId=" + metadata.getMetadataId());
            }
        };
        final HttpServletRequest request = new HttpServletRequest() {
            public String getParameter(String name) {
                return "1";
            }
        };
        final HttpServletResponse response = new HttpServletResponse() {
            public void sendRedirect(String location) {
                // do nothing
            }
        };
        saveMetadataAction.perform(servlet, request, response);
    }

    /**
     * Since we have been using negative numbers to give unique id's to
     * complicated metadata information, this method will turn all those
     * negative ids back to <code>null</code> values so that the metadata
     * gets saved correctly.
     *
     * @param cmb The {@link CompleteMetadataBean} to scrub.
     */
    private void scrubMetadata(CompleteMetadataBean cmb) {
        // scrubs Context URLs
        for (Iterator iter = cmb.getContextURLs().iterator(); iter.hasNext(); ) {
            final ContextURLBean cub = (ContextURLBean) iter.next();
            final String cubId = cub.getContextURLId();
            if (null != cubId && 0 > Integer.parseInt(cubId)) {
                cub.setContextURLId(null);
            }
        }
        // scrubs Contributors
        for (Iterator iter = cmb.getContributorList().iterator(); iter.hasNext(); ) {
            final ContributorBean cb = (ContributorBean) iter.next();
            final String cbId = cb.getContributorId();
            if (null != cbId && 0 > Integer.parseInt(cbId)) {
                cb.setContributorId(null);
            }
        }
        // scrubs Controlled Vocab
        for (Iterator iterOne = cmb.getTaxonPaths().iterator(); iterOne.hasNext(); ) {
            final TaxonPathBean tpb = (TaxonPathBean) iterOne.next();
            final String tpbId = tpb.getTaxonPathId();
            if (null != tpbId && 0 > Integer.parseInt(tpbId)) {
                tpb.setTaxonPathId(null);
            }
            for (Iterator iterTwo = tpb.getTaxons().iterator(); iterTwo.hasNext(); ) {
                final TaxonBean tb = (TaxonBean) iterTwo.next();
                final String tbId = tb.getTaxonId();
                if (null != tbId && 0 > Integer.parseInt(tbId)) {
                    tb.setTaxonId(null);
                }
            }
        }
        // scrubs Copyright holders
        for (Iterator iter = cmb.getCopyrightHolders().iterator(); iter.hasNext(); ) {
            final CopyrightHolderBean chb = (CopyrightHolderBean) iter.next();
            final String chbId = chb.getCopyrightHolderId();
            if (null != chbId && 0 > Integer.parseInt(chbId)) {
                chb.setCopyrightHolderId(null);
            }
        }
        // scrubs metametadata identifiers
        for (Object o : cmb.getMetametadataIdentifiers()) {
            final MetametadataIdentifierBean mib = (MetametadataIdentifierBean) o;
            final String mibId = mib.getMetametadataIdentifierId();
            if (null != mibId && 0 > Integer.parseInt(mibId)) {
                mib.setMetametadataIdentifierId(null);
            }
        }
        // scrubs metametadata contributors
        for (Object o : cmb.getMetametadataContributors()) {
            final MetametadataContributorBean mcb = (MetametadataContributorBean) o;
            final String mcbId = mcb.getMetametadataContributorId();
            if (null != mcbId && 0 > Integer.parseInt(mcbId)) {
                mcb.setMetametadataContributorId(null);
            }
        }
        // scrubs requirements
        for (Iterator iter = cmb.getRequirements().iterator(); iter.hasNext(); ) {
            final RequirementBean rb = (RequirementBean) iter.next();
            final String rbId = rb.getRequirementId();
            if (null != rbId && 0 > Integer.parseInt(rbId)) {
                rb.setRequirementId(null);
            }
        }
        // scrubs relations
        for (Iterator iter = cmb.getRelations().iterator(); iter.hasNext(); ) {
            final RelationBean rb = (RelationBean) iter.next();
            final String rbId = rb.getRelationId();
            if (null != rbId && 0 > Integer.parseInt(rbId)) {
                rb.setRelationId(null);
            }
        }
    }
}

// SaveMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.RequirementBean;
import org.he