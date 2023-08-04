// DictionaryInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {

    /**
     * Test case for {@link DictionaryInfo#getComponent(String)}
     *
     * @throws Exception
     */
    @Test
    void testGetComponent() throws Exception {
        DictionaryInfo dictionaryInfo = new DictionaryInfo_3();
        ComponentInfo componentInfo = dictionaryInfo.getComponent("Instrument");
        assertNotNull(componentInfo);
        assertEquals("Instrument", componentInfo.getName());
        assertEquals("Instrument", componentInfo.getAbbrName());
        assertEquals("Instrument", componentInfo.getCategory());
        assertEquals("Instrument", componentInfo.getAbbrCategory());
        assertEquals("Instrument", componentInfo.getSection());
        assertEquals("Instrument", componentInfo.getAbbrSection());
        assertEquals("Instrument", componentInfo.getSectionName());
        assertEquals("Instrument", componentInfo.getAbbrSectionName());
        assertEquals("Instrument", componentInfo.getSectionAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategory());
        assertEquals("Instrument", componentInfo.getAbbrSectionCategory());
        assertEquals("Instrument", componentInfo.getSectionAbbrCategory());
        assertEquals("Instrument", componentInfo.getSectionCategoryName());
        assertEquals("Instrument", componentInfo.getAbbrSectionCategoryName());
        assertEquals("Instrument", componentInfo.getSectionCategoryAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySection());
        assertEquals("Instrument", componentInfo.getAbbrSectionCategorySection());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionName());
        assertEquals("Instrument", componentInfo.getAbbrSectionCategorySectionName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySectionNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrNameAbbrName());
        assertEquals("Instrument", componentInfo.getSectionCategorySection