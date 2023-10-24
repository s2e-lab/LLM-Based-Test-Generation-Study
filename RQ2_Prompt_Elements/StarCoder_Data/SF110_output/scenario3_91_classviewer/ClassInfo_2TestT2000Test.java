// ClassInfo_2Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfo_2Test {

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 0.
     */
    @Test
    void testPrintMethods0() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(0);
        assertEquals(methods.length, 1);
        assertEquals(methods[0], "public void printMethods(int)");
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 1.
     */
    @Test
    void testPrintMethods1() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(1);
        assertEquals(methods.length, 2);
        assertEquals(methods[0], "public void printMethods(int)");
        assertEquals(methods[1], "public void printMethods(int)");
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 2.
     */
    @Test
    void testPrintMethods2() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(2);
        assertEquals(methods.length, 3);
        assertEquals(methods[0], "public void printMethods(int)");
        assertEquals(methods[1], "public void printMethods(int)");
        assertEquals(methods[2], "public void printMethods(int)");
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 3.
     */
    @Test
    void testPrintMethods3() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(3);
        assertEquals(methods.length, 4);
        assertEquals(methods[0], "public void printMethods(int)");
        assertEquals(methods[1], "public void printMethods(int)");
        assertEquals(methods[2], "public void printMethods(int)");
        assertEquals(methods[3], "public void printMethods(int)");
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 4.
     */
    @Test
    void testPrintMethods4() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(4);
        assertEquals(methods.length, 5);
        assertEquals(methods[0], "public void printMethods(int)");
        assertEquals(methods[1], "public void printMethods(int)");
        assertEquals(methods[2], "public void printMethods(int)");
        assertEquals(methods[3], "public void printMethods(int)");
        assertEquals(methods[4], "public void printMethods(int)");
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 5.
     */
    @Test
    void testPrintMethods5() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(5);
        assertEquals(methods.length, 6);
        assertEquals(methods[0], "public void printMethods(int)");
        assertEquals(methods[1], "public void printMethods(int)");
        assertEquals(methods[2], "public void printMethods(int)");
        assertEquals(methods[3], "public void printMethods(int)");
        assertEquals(methods[4], "public void printMethods(int)");
        assertEquals(methods[5], "public void printMethods(int)");
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 6.
     */
    @Test
    void testPrintMethods6() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(6);
        assertEquals(methods.length, 7);
        assertEquals(methods[0], "public void printMethods(int)");
        assertEquals(methods[1], "public void printMethods(int)");
        assertEquals(methods[2], "public void printMethods(int)");
        assertEquals(methods[3], "public void printMethods(int)");
        assertEquals(methods[4], "public void printMethods(int)");
        assertEquals(methods[5], "public void printMethods(int)");
        assertEquals(methods[6], "public void printMethods(int)");
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 7.
     */
    @Test
    void testPrintMethods7() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(7);
        assertEquals(methods.length, 8);
        assertEquals(methods[0], "public void printMethods(int)");
        assertEquals(methods[1], "public void printMethods(int)");
        assertEquals(methods[2], "public void printMethods(int)");
        assertEquals(methods[3], "public void printMethods(int)");
        assertEquals(methods[4], "public void printMethods(int)");
        assertEquals(methods[5], "public void printMethods(int)");
        assertEquals(methods[6], "public void printMethods(int)");
        assertEquals(methods[7], "public void printMethods(int)");
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 8.
     */
    @Test
    void testPrintMethods8() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(8);
        assertEquals(methods.length, 9);
        assertEquals(methods[0], "public void printMethods(int)");
        assertEquals(methods[1], "public void printMethods(int)");
        assertEquals(methods[2], "public void printMethods(int)");
        assertEquals(methods[3], "public void printMethods(int)");
        assertEquals(methods[4], "public void printMethods(int)");
        assertEquals(methods[5], "public void printMethods(int)");
        assertEquals(methods[6], "public void printMethods(int)");
        assertEquals(methods[7], "public void printMethods(int)");
        assertEquals(methods[8], "public void printMethods(int)");
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 9.
     */
    @Test
    void testPrintMethods9() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(9);
        assertEquals(methods.length, 10);
        assertEquals(methods[0], "public void printMethods(int)");
        assertEquals(methods[1], "public void printMethods(int)");
        assertEquals(methods[2], "public void printMethods(int)");
        assertEquals(methods[3], "public void printMethods(int)");
        assertEquals(methods[4], "public void printMethods(int)");
        assertEquals(methods[5], "public void printMethods(int)");
        assertEquals(methods[6], "public void printMethods(int)");
        assertEquals(methods[7], "public void printMethods(int)");
        assertEquals(methods[8], "public void printMethods(int)");
        assertEquals(methods[9], "public void printMethods(int)");
    }
}

// ClassInfo_Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfo_Test {
		
    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 0.
     */
    @Test
    void testPrintMethods0() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(0);
        assertEquals(methods.length, 1);
        assertEquals(methods[0], "public void printMethods(int)");
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 1.
     */
    @Test
    void testPrintMethods1() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(1);
        assertEquals(methods.length, 2);
        assertEquals(methods[