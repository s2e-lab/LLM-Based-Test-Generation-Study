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
        Map temp = new HashMap();
        temp.put("editContextURL", new EditContextURLAction());
        temp.put("editContributor", new EditContributorAction());
        temp.put("editCopyrightHolder", new EditCopyrightHolderAction());
        temp.put("editControlledVocab", new EditControlledVocabularyAction());
        temp.put("editRequirement", new EditRequirementAction());
        temp.put("editRelation", new RelationRecordModifier());
        temp.put("editMetametadataIdentifier", new MetametadataIdentifierRecordModifier());
        temp.put("editMetametadataContributor", new MetametadataContributorRecordModifier());
        temp.put("saveMetadata", new SaveMetadataAction());
        nextActionMap = Collections.unmodifiableMap(temp);
    }

    @Test
    void testGetNextAction() {
        MetadataRecordModifier mrm = new MetadataRecordModifier();
        // Test case 1: No "nextAction" parameter
        ServletRequest request = new MockServletRequest();
        Action ret = mrm.getNextAction(request);
        assertEquals(NEXT_ACTION_DEFAULT, ret);
        // Test case 2: "nextAction" parameter is not in the nextActionMap
        request = new MockServletRequest("nextAction", "notInMap");
        ret = mrm.getNextAction(request);
        assertEquals(NEXT_ACTION_DEFAULT, ret);
        // Test case 3: "nextAction" parameter is in the nextActionMap
        request = new MockServletRequest("nextAction", "editContextURL");
        ret = mrm.getNextAction(request);
        assertEquals(nextActionMap.get("editContextURL"), ret);
        // Test case 4: "nextAction" parameter is in the nextActionMap
        request = new MockServletRequest("nextAction", "editContributor");
        ret = mrm.getNextAction(request);
        assertEquals(nextActionMap.get("editContributor"), ret);
        // Test case 5: "nextAction" parameter is in the nextActionMap
        request = new MockServletRequest("nextAction", "editCopyrightHolder");
        ret = mrm.getNextAction(request);
        assertEquals(nextActionMap.get("editCopyrightHolder"), ret);
        // Test case 6: "nextAction" parameter is in the nextActionMap
        request = new MockServletRequest("nextAction", "editControlledVocab");
        ret = mrm.getNextAction(request);
        assertEquals(nextActionMap.get("editControlledVocab"), ret);
        // Test case 7: "nextAction" parameter is in the nextActionMap
        request = new MockServletRequest("nextAction", "editRequirement");
        ret = mrm.getNextAction(request);
        assertEquals(nextActionMap.get("editRequirement"), ret);
        // Test case 8: "nextAction" parameter is in the nextActionMap
        request = new MockServletRequest("nextAction", "editRelation");
        ret = mrm.getNextAction(request);
        assertEquals(nextActionMap.get("editRelation"), ret);
        // Test case 9: "nextAction" parameter is in the nextActionMap
        request = new MockServletRequest("nextAction", "editMetametadataIdentifier");
        ret = mrm.getNextAction(request);
        assertEquals(nextActionMap.get("editMetametadataIdentifier"), ret);
        // Test case 10: "nextAction" parameter is in the nextActionMap
        request = new MockServletRequest("nextAction", "editMetametadataContributor");
        ret = mrm.getNextAction(request);
        assertEquals(nextActionMap.get("editMetametadataContributor"), ret);
        // Test case 11: "nextAction" parameter is in the nextActionMap
        request = new MockServletRequest("nextAction", "saveMetadata");
        ret = mrm.getNextAction(request);
        assertEquals(nextActionMap.get("saveMetadata"), ret);
    }

    /**
     * Mock class of {@link ServletRequest}.
     */
    private static class MockServletRequest implements ServletRequest {

        private String nextAction;

        private String[] contextURLs;

        private String[] contributors;

        private String[] copyrightHolders;

        private String[] controlledVocab;

        private String[] copyrights;

        private String[] diseaseDiagnoses;

        private String[] formats;

        private String[] keywords;

        private String[] metametadataIdentifiers;

        private String[] metametadataContributors;

        private String[] relations;

        private String[] requirements;

        private String[] targetUserGroups;

        private String thumbnailLocation;

        private String thumbnailFileHeight;

        private String thumbnailFileWidth;

        private String[] mmIdentifiers;

        private String[] mmContributors;

        private MockServletRequest() {
        }

        private MockServletRequest(String nextAction, String nextActionValue) {
            this.nextAction = nextAction;
            this.contextURLs = new String[] { "contextURL1", "contextURL2" };
            this.contributors = new String[] { "contributor1", "contributor2" };
            this.copyrightHolders = new String[] { "copyrightHolder1", "copyrightHolder2" };
            this.controlledVocab = new String[] { "taxon1", "taxon2" };
            this.copyrights = new String[] { "copyright1", "copyright2" };
            this.diseaseDiagnoses = new String[] { "diseaseDiagnosis1", "diseaseDiagnosis2" };
            this.formats = new String[] { "format1", "format2" };
            this.keywords = new String[] { "keyword1", "keyword2" };
            this.metametadataIdentifiers = new String[] { "metametadataIdentifier1", "metametadataIdentifier2" };
            this.metametadataContributors = new String[] { "metametadataContributor1", "metametadataContributor2" };
            this.relations = new String[] { "relation1", "relation2" };
            this.requirements = new String[] { "requirement1", "requirement2" };
            this.targetUserGroups = new String[] { "targetUserGroup1", "targetUserGroup2" };
            this.thumbnailLocation = "thumbnailLocation";
            this.thumbnailFileHeight = "thumbnailFileHeight";
            this.thumbnailFileWidth = "thumbnailFileWidth";
            this.mmIdentifiers = new String[] { "metametadataIdentifier1", "metametadataIdentifier2" };
            this.mmContributors = new String[] { "metametadataContributor1", "metametadataContributor2" };
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
            if ("nextAction".equals(name)) {
                return nextAction;
            } else if ("contextURLs".equals(name)) {
                return contextURLs[0];
            } else if ("contributors".equals(name)) {
                return contributors[0];
            } else if ("copyrightHolders".equals(name)) {
                return copyrightHolders[0];
            } else if ("controlledVocab".equals(name)) {
                return controlledVocab[0];
            } else if ("copyrights".equals(name)) {
                return copyrights[0];
            } else if ("diseaseDiagnoses".equals(name)) {
                return diseaseDiagnoses[0];
            } else if ("formats".equals(name)) {
                return formats[0];
            } else if ("keywords".equals(name)) {
                return keywords[0];
            } else if ("metametadataIdentifiers".equals(name)) {
                return metametadataIdentifiers[0];
            } else if ("metametadataContributors".equals(name)) {
                return metametadataContributors[0];
            } else if ("relations".equals(name)) {
                return relations[0];
            } else if ("requirements".equals(name)) {
                return requirements[0];
            } else if ("targetUserGroups".equals(name)) {
                return targetUserGroups[0];
            } else if ("thumbnailLocation".equals(name)) {
                return thumbnailLocation;
            } else if ("thumbnailFileHeight".equals(name)) {
                return thumbnailFileHeight;
            } else if ("thumbnailFileWidth".equals(name)) {
                return thumbnailFileWidth;
            } else if ("mmIdentifiers".equals(name)) {
                return mmIdentifiers[0];
            } else if ("mmContributors".equals(name)) {
                return mmContributors[0];
            } else {
                return null;
            }
        }

        public Map getParameterMap() {
            return null;
        }

        public Enumeration getParameterNames()