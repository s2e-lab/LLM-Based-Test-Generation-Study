// ClassInfo_3Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_3Test {

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has no public constructors.
     */
    @Test
    void testPrintConstructors_0() {
        ClassInfo ci = new ClassInfo();
        ci.c = String.class;
        String[] data = ci.printConstructors();
        assertNull(data);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_1() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_2() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_3() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_4() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_5() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_6() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_7() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_8() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_9() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }
}

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
* It contains ten unit test cases for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_4Test {
		
    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has no public constructors.
     */
    @Test
    void testPrintConstructors_0() {
        ClassInfo ci = new ClassInfo();
        ci.c = String.class;
        String[] data = ci.printConstructors();
        assertNull(data);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_1() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_2() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_3() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_4() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_5() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.class;
        String[] data = ci.printConstructors();
        assertNotNull(data);
        assertEquals(1, data.length);
        assertEquals("public javax.swing.JFrame()", data[0]);
    }

    /**
     * Test case for {@link ClassInfo#printConstructors()} method.
     * <p>
     * This test case tests the method with a class that has public constructors.
     */
    @Test
    void testPrintConstructors_6() {
        ClassInfo ci = new ClassInfo();
        ci.c = JFrame.