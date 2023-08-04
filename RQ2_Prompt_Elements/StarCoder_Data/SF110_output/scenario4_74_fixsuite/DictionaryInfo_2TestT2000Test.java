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
    * Test method for {@link DictionaryInfo#getComponent(int)}.
    */
    @Test
    void testGetComponent() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIXT.1.1");
        ComponentInfo componentInfo = new ComponentInfo(1, "StandardHeader", 8, 8, 0, 0);
        dictionaryInfo.addComponent(componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent(1));
    }
}

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
    * Test method for {@link DictionaryInfo#getComponent(String)}.
    */
    @Test
    void testGetComponent() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIXT.1.1");
        ComponentInfo componentInfo = new ComponentInfo(1, "StandardHeader", 8, 8, 0, 0);
        dictionaryInfo.addComponent(componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent("StandardHeader"));
    }
}

// DictionaryInfo_4Test.java
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
class DictionaryInfo_4Test {
		
    /**
    * Test method for {@link DictionaryInfo#getField(int)}.
    */
    @Test
    void testGetField() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIXT.1.1");
        FieldInfo fieldInfo = new FieldInfo(8, "BeginString", 8, 0, "FIX.4.2", "FIX.4.2", "BeginString", "BeginString", "BeginString", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX.4.2", "FIX