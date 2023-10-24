// ClassInfo_4Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#printInterfaces()} method.
*/
class ClassInfo_4Test {

    /**
    * Test case for {@link ClassInfo#printInterfaces()}.
    * It tests the method with a class that has no interfaces.
    */
    @Test
    void testPrintInterfaces_0() {
        ClassInfo ci = new ClassInfo(java.lang.Object.class);
        String[] data = ci.printInterfaces();
        assertNull(data);
    }

    /**
    * Test case for {@link ClassInfo#printInterfaces()}.
    * It tests the method with a class that has interfaces.
    */
    @Test
    void testPrintInterfaces_1() {
        ClassInfo ci = new ClassInfo(java.lang.Runnable.class);
        String[] data = ci.printInterfaces();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("java.lang.Runnable", data[0]);
    }

    /**
    * Test case for {@link ClassInfo#printInterfaces()}.
    * It tests the method with a class that has interfaces.
    */
    @Test
    void testPrintInterfaces_2() {
        ClassInfo ci = new ClassInfo(java.util.ArrayList.class);
        String[] data = ci.printInterfaces();
        assertNotNull(data);
        assertEquals(2, data.length);
        assertEquals("java.util.Collection", data[0]);
        assertEquals("java.util.List", data[1]);
    }

    /**
    * Test case for {@link ClassInfo#printInterfaces()}.
    * It tests the method with a class that has interfaces.
    */
    @Test
    void testPrintInterfaces_3() {
        ClassInfo ci = new ClassInfo(java.util.Vector.class);
        String[] data = ci.printInterfaces();
        assertNotNull(data);
        assertEquals(2, data.length);
        assertEquals("java.util.Collection", data[0]);
        assertEquals("java.util.List", data[1]);
    }

    /**
    * Test case for {@link ClassInfo#printInterfaces()}.
    * It tests the method with a class that has interfaces.
    */
    @Test
    void testPrintInterfaces_4() {
        ClassInfo ci = new ClassInfo(java.util.Hashtable.class);
        String[] data = ci.printInterfaces();
        assertNotNull(data);
        assertEquals(2, data.length);
        assertEquals("java.util.Dictionary", data[0]);
        assertEquals("java.lang.Cloneable", data[1]);
    }

    /**
    * Test case for {@link ClassInfo#printInterfaces()}.
    * It tests the method with a class that has interfaces.
    */
    @Test
    void testPrintInterfaces_5() {
        ClassInfo ci = new ClassInfo(java.util.Properties.class);
        String[] data = ci.printInterfaces();
        assertNotNull(data);
        assertEquals(2, data.length);
        assertEquals("java.util.Dictionary", data[0]);
        assertEquals("java.lang.Cloneable", data[1]);
    }

    /**
    * Test case for {@link ClassInfo#printInterfaces()}.
    * It tests the method with a class that has interfaces.
    */
    @Test
    void testPrintInterfaces_6() {
        ClassInfo ci = new ClassInfo(java.util.Stack.class);
        String[] data = ci.printInterfaces();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("java.util.List", data[0]);
    }

    /**
    * Test case for {@link ClassInfo#printInterfaces()}.
    * It tests the method with a class that has interfaces.
    */
    @Test
    void testPrintInterfaces_7() {
        ClassInfo ci = new ClassInfo(java.util.LinkedList.class);
        String[] data = ci.printInterfaces();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("java.util.List", data[0]);
    }

    /**
    * Test case for {@link ClassInfo#printInterfaces()}.
    * It tests the method with a class that has interfaces.
    */
    @Test
    void testPrintInterfaces_8() {
        ClassInfo ci = new ClassInfo(java.util.Set.class);
        String[] data = ci.printInterfaces();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("java.util.Collection", data[0]);
    }

    /**
    * Test case for {@link ClassInfo#printInterfaces()}.
    * It tests the method with a class that has interfaces.
    */
    @Test
    void testPrintInterfaces_9() {
        ClassInfo ci = new ClassInfo(java.util.HashSet.class);
        String[] data = ci.printInterfaces();
        assertNotNull(data);
        assertEquals(2, data.length);
        assertEquals("java.util.Set", data[0]);
        assertEquals("java.util.Collection", data[1]);
    }
}
