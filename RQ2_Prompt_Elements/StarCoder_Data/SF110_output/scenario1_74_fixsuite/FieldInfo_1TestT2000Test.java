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

    @Test
    void testIsValidValue_1() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertTrue(fieldInfo.isValidValue("Y"));
    }

    @Test
    void testIsValidValue_2() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertTrue(fieldInfo.isValidValue("N"));
    }

    @Test
    void testIsValidValue_3() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue("A"));
    }

    @Test
    void testIsValidValue_4() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue(""));
    }

    @Test
    void testIsValidValue_5() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue(null));
    }

    @Test
    void testIsValidValue_6() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue(" "));
    }

    @Test
    void testIsValidValue_7() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue("y"));
    }

    @Test
    void testIsValidValue_8() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue("n"));
    }

    @Test
    void testIsValidValue_9() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue("Y "));
    }

    @Test
    void testIsValidValue_10() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue("N "));
    }
}

// FieldInfo_2Test.java
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
class FieldInfo_2Test {
		
    @Test
    void testIsValidValue_1() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertTrue(fieldInfo.isValidValue("Y"));
    }

    @Test
    void testIsValidValue_2() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertTrue(fieldInfo.isValidValue("N"));
    }

    @Test
    void testIsValidValue_3() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue("A"));
    }

    @Test
    void testIsValidValue_4() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue(""));
    }

    @Test
    void testIsValidValue_5() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue(null));
    }

    @Test
    void testIsValidValue_6() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue(" "));
    }

    @Test
    void testIsValidValue_7() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue("y"));
    }

    @Test
    void testIsValidValue_8() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue("n"));
    }

    @Test
    void testIsValidValue_9() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue("Y "));
    }

    @Test
    void testIsValidValue_10() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.isValidValue("N "));
    }
}

// FieldInfo_3Test.java
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
class FieldInfo_3Test {
		
    @Test
    void testIsValidValue_1() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertTrue(fieldInfo.isValidValue("Y"));
    }

    @Test
    void testIsValidValue_2() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertTrue(fieldInfo.isValidValue("N"));
    }

    @Test
    void testIsValidValue_3() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.validValues = new TreeMap<String, String>();
        fieldInfo.validValues.put("Y", "Y");
        fieldInfo.validValues.put("N", "N");
        assertFalse(fieldInfo.