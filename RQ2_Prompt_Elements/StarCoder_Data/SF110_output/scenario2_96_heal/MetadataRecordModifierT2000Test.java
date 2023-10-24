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
     * when the <code>nextAction</code> parameter is <code>null</code>.
     */
    @Test
    void testGetNextActionNull() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction(null);
        assertEquals(Action.NEXT_ACTION_DEFAULT, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>""</code>.
     */
    @Test
    void testGetNextActionEmpty() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("");
        assertEquals(Action.NEXT_ACTION_DEFAULT, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"save"</code>.
     */
    @Test
    void testGetNextActionSave() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("save");
        assertEquals(Action.NEXT_ACTION_SAVE, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndNew"</code>.
     */
    @Test
    void testGetNextActionSaveAndNew() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndNew");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_NEW, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndEdit"</code>.
     */
    @Test
    void testGetNextActionSaveAndEdit() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndEdit");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_EDIT, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndList"</code>.
     */
    @Test
    void testGetNextActionSaveAndList() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndList");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_LIST, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndList"</code>.
     */
    @Test
    void testGetNextActionSaveAndList2() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndList2");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_LIST, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndList"</code>.
     */
    @Test
    void testGetNextActionSaveAndList3() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndList3");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_LIST, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndList"</code>.
     */
    @Test
    void testGetNextActionSaveAndList4() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndList4");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_LIST, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndList"</code>.
     */
    @Test
    void testGetNextActionSaveAndList5() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndList5");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_LIST, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndList"</code>.
     */
    @Test
    void testGetNextActionSaveAndList6() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndList6");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_LIST, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndList"</code>.
     */
    @Test
    void testGetNextActionSaveAndList7() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndList7");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_LIST, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndList"</code>.
     */
    @Test
    void testGetNextActionSaveAndList8() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndList8");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_LIST, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndList"</code>.
     */
    @Test
    void testGetNextActionSaveAndList9() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndList9");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_LIST, ret);
    }

    /**
     * Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)}
     * when the <code>nextAction</code> parameter is <code>"saveAndList"</code>.
     */
    @Test
    void testGetNextActionSaveAndList10() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action ret = modifier.getNextAction("saveAndList10");
        assertEquals(Action.NEXT_ACTION_SAVE_AND_LIST, ret);
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
     * when the <code>nextAction</code> parameter is <code>null</code>.
     */
    @Test
    void testGetNextActionNull() {