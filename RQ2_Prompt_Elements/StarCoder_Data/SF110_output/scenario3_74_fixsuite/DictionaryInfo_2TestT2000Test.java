// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {

    /**
     * Test case for {@link DictionaryInfo#getComponent(int)}
     *
     * @throws Exception
     */
    @Test
    void getComponent() throws Exception {
        DictionaryInfo dictionaryInfo = new DictionaryInfo_2();
        ComponentInfo componentInfo = dictionaryInfo.getComponent(1);
        assertEquals(1, componentInfo.getId());
        assertEquals("StandardHeader", componentInfo.getName());
        assertEquals("StandardHeader", componentInfo.getAbbrName());
        assertEquals("StandardHeader", componentInfo.getFullName());
        assertEquals("FIX.4.2", componentInfo.getVersion());
        assertEquals("FIXT.1.1", componentInfo.getSinceVersion());
        assertEquals("FIX.4.2", componentInfo.getDeprecatedVersion());
        assertEquals("FIX.4.2", componentInfo.getEndString());
        assertEquals("FIX.4.2", componentInfo.getDeprecatedString());
        assertEquals("FIX.4.2", componentInfo.getRemovedString());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getGroups().size());
        assertEquals(1, componentInfo.getMessages().size());
        assertEquals(1, componentInfo.getComponents().size());
        assertEquals(1, componentInfo.getEnums().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1, componentInfo.getFields().size());
        assertEquals(1