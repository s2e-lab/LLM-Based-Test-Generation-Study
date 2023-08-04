// FieldInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfo_1Test {

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a String field.
    */
    @Test
    void testIsValidValue_String() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("String");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("A"));
        fieldInfo.addValidValue(new ValueInfo("B"));
        fieldInfo.addValidValue(new ValueInfo("C"));
        assertTrue(fieldInfo.isValidValue("A"));
        assertTrue(fieldInfo.isValidValue("B"));
        assertTrue(fieldInfo.isValidValue("C"));
        assertFalse(fieldInfo.isValidValue("D"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a char field.
    */
    @Test
    void testIsValidValue_char() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("char");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("A"));
        fieldInfo.addValidValue(new ValueInfo("B"));
        fieldInfo.addValidValue(new ValueInfo("C"));
        assertTrue(fieldInfo.isValidValue("A"));
        assertTrue(fieldInfo.isValidValue("B"));
        assertTrue(fieldInfo.isValidValue("C"));
        assertFalse(fieldInfo.isValidValue("D"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a data field.
    */
    @Test
    void testIsValidValue_data() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("data");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("A"));
        fieldInfo.addValidValue(new ValueInfo("B"));
        fieldInfo.addValidValue(new ValueInfo("C"));
        assertTrue(fieldInfo.isValidValue("A"));
        assertTrue(fieldInfo.isValidValue("B"));
        assertTrue(fieldInfo.isValidValue("C"));
        assertFalse(fieldInfo.isValidValue("D"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a boolean field.
    */
    @Test
    void testIsValidValue_boolean() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("boolean");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("Y"));
        fieldInfo.addValidValue(new ValueInfo("N"));
        assertTrue(fieldInfo.isValidValue("Y"));
        assertTrue(fieldInfo.isValidValue("N"));
        assertFalse(fieldInfo.isValidValue("X"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a float field.
    */
    @Test
    void testIsValidValue_float() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("float");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("1.0"));
        fieldInfo.addValidValue(new ValueInfo("2.0"));
        fieldInfo.addValidValue(new ValueInfo("3.0"));
        assertTrue(fieldInfo.isValidValue("1.0"));
        assertTrue(fieldInfo.isValidValue("2.0"));
        assertTrue(fieldInfo.isValidValue("3.0"));
        assertFalse(fieldInfo.isValidValue("4.0"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a int field.
    */
    @Test
    void testIsValidValue_int() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("int");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("1"));
        fieldInfo.addValidValue(new ValueInfo("2"));
        fieldInfo.addValidValue(new ValueInfo("3"));
        assertTrue(fieldInfo.isValidValue("1"));
        assertTrue(fieldInfo.isValidValue("2"));
        assertTrue(fieldInfo.isValidValue("3"));
        assertFalse(fieldInfo.isValidValue("4"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a length field.
    */
    @Test
    void testIsValidValue_length() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("length");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("1"));
        fieldInfo.addValidValue(new ValueInfo("2"));
        fieldInfo.addValidValue(new ValueInfo("3"));
        assertTrue(fieldInfo.isValidValue("1"));
        assertTrue(fieldInfo.isValidValue("2"));
        assertTrue(fieldInfo.isValidValue("3"));
        assertFalse(fieldInfo.isValidValue("4"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a numInGroup field.
    */
    @Test
    void testIsValidValue_numInGroup() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("numInGroup");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("1"));
        fieldInfo.addValidValue(new ValueInfo("2"));
        fieldInfo.addValidValue(new ValueInfo("3"));
        assertTrue(fieldInfo.isValidValue("1"));
        assertTrue(fieldInfo.isValidValue("2"));
        assertTrue(fieldInfo.isValidValue("3"));
        assertFalse(fieldInfo.isValidValue("4"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a seqNum field.
    */
    @Test
    void testIsValidValue_seqNum() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("seqNum");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("1"));
        fieldInfo.addValidValue(new ValueInfo("2"));
        fieldInfo.addValidValue(new ValueInfo("3"));
        assertTrue(fieldInfo.isValidValue("1"));
        assertTrue(fieldInfo.isValidValue("2"));
        assertTrue(fieldInfo.isValidValue("3"));
        assertFalse(fieldInfo.isValidValue("4"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a tagNum field.
    */
    @Test
    void testIsValidValue_tagNum() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("tagNum");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("1"));
        fieldInfo.addValidValue(new ValueInfo("2"));
        fieldInfo.addValidValue(new ValueInfo("3"));
        assertTrue(fieldInfo.isValidValue("1"));
        assertTrue(fieldInfo.isValidValue("2"));
        assertTrue(fieldInfo.isValidValue("3"));
        assertFalse(fieldInfo.isValidValue("4"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a time field.
    */
    @Test
    void testIsValidValue_time() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("time");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("1"));
        fieldInfo.addValidValue(new ValueInfo("2"));
        fieldInfo.addValidValue(new ValueInfo("3"));
        assertTrue(fieldInfo.isValidValue("1"));
        assertTrue(fieldInfo.isValidValue("2"));
        assertTrue(fieldInfo.isValidValue("3"));
        assertFalse(fieldInfo.isValidValue("4"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a UTCTime field.
    */
    @Test
    void testIsValidValue_UTCTime() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.setDataType("UTCTime");
        fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
        fieldInfo.addValidValue(new ValueInfo("1"));
        fieldInfo.addValidValue(new ValueInfo("2"));
        fieldInfo.addValidValue(new ValueInfo("3"));
        assertTrue(fieldInfo.isValidValue("1"));
        assertTrue(fieldInfo.isValidValue("2"));
        assertTrue(fieldInfo.isValidValue("3"));
        assertFalse(fieldInfo.isValidValue("4"));
    }

    /**
    * Test case for {@link FieldInfo#isValidValue(String)}
    * when the field is a UT