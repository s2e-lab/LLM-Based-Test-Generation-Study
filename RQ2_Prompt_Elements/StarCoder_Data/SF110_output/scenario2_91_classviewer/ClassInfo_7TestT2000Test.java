// ClassInfo_7Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfo_7Test {

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a null string.
     */
    @Test
    void testSrchMethods_1() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods(null);
        assertNull(tempArray);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is not in the array.
     */
    @Test
    void testSrchMethods_2() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("test");
        assertNull(tempArray);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_3() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("get");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("get", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_4() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("set");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("set", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_5() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("is");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("is", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_6() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("get");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("get", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_7() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("set");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("set", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_8() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("is");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("is", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_9() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("get");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("get", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_10() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("set");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("set", tempArray[0]);
    }
}

// ClassInfo_8Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfo_8Test {
		
    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a null string.
     */
    @Test
    void testSrchMethods_1() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods(null);
        assertNull(tempArray);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is not in the array.
     */
    @Test
    void testSrchMethods_2() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("test");
        assertNull(tempArray);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_3() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("get");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("get", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_4() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("set");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("set", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_5() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("is");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("is", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_6() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("get");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("get", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_7() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("set");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("set", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
     * <p>
     * It tests the method with a string that is in the array.
     */
    @Test
    void testSrchMethods_8() {
        ClassInfo classInfo = new ClassInfo();
        String[] tempArray = classInfo.srchMethods("is");
        assertNotNull(tempArray);
        assertEquals(1, tempArray.length);
        assertEquals("is", tempArray[0]);
    }

    /**
     * Tests the {@link ClassInfo#srchMethods(String)} method.
    