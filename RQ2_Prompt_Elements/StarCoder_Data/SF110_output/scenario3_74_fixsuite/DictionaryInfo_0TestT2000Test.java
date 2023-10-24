// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {

    /**
     * Test case for {@link DictionaryInfo#getField(int)}
     */
    @Test
    void testGetField() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo_0();
        FieldInfo fieldInfo = dictionaryInfo.getField(1);
        assertEquals(1, fieldInfo.getTag());
        assertEquals("BeginString", fieldInfo.getName());
        assertEquals("8", fieldInfo.getType());
        assertEquals("FIX.4.0", fieldInfo.getVersion());
        assertEquals("BeginString", fieldInfo.getDescription());
        assertEquals("The first field of every message. Identifies beginning of new message and protocol version.", fieldInfo.getComment());
        assertEquals("Y", fieldInfo.isRequired());
        assertEquals("Y", fieldInfo.isRepeating());
        assertEquals("Y", fieldInfo.isDeprecated());
        assertEquals("Y", fieldInfo.isInternal());
        assertEquals("Y", fieldInfo.isConstant());
        assertEquals("Y", fieldInfo.isSystem());
        assertEquals("Y", fieldInfo.isSession());
        assertEquals("Y", fieldInfo.isUser());
        assertEquals("Y", fieldInfo.isRequest());
        assertEquals("Y", fieldInfo.isResponse());
        assertEquals("Y", fieldInfo.isTarget());
        assertEquals("Y", fieldInfo.isSender());
        assertEquals("Y", fieldInfo.isTargetOptional());
        assertEquals("Y", fieldInfo.isSenderOptional());
        assertEquals("Y", fieldInfo.isBody());
        assertEquals("Y", fieldInfo.isTrailer());
        assertEquals("Y", fieldInfo.isHeader());
        assertEquals("Y", fieldInfo.isGroup());
        assertEquals("Y", fieldInfo.isComponent());
        assertEquals("Y", fieldInfo.isSubcomponent());
        assertEquals("Y", fieldInfo.isComposite());
        assertEquals("Y", fieldInfo.isField());
        assertEquals("Y", fieldInfo.isMessage());
        assertEquals("Y", fieldInfo.isComponentGroup());
        assertEquals("Y", fieldInfo.isComponentField());
        assertEquals("Y", fieldInfo.isComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentMessage());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupField());
        assertEquals("Y", fieldInfo.isComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupComponentGroupMessage());
        assertEquals("Y", fieldInfo