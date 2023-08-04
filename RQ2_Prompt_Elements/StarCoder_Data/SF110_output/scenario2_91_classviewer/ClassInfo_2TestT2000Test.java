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
    void printMethods_0() {
        ClassInfo c = new ClassInfo();
        String[] data = c.printMethods(0);
        String[] expected = {"public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)"};
        assertArrayEquals(expected, data);
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 1.
     */
    @Test
    void printMethods_1() {
        ClassInfo c = new ClassInfo();
        String[] data = c.printMethods(1);
        String[] expected = {"public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)"};
        assertArrayEquals(expected, data);
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 2.
     */
    @Test
    void printMethods_2() {
        ClassInfo c = new ClassInfo();
        String[] data = c.printMethods(2);
        String[] expected = {"public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)"};
        assertArrayEquals(expected, data);
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 3.
     */
    @Test
    void printMethods_3() {
        ClassInfo c = new ClassInfo();
        String[] data = c.printMethods(3);
        String[] expected = {"public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)"};
        assertArrayEquals(expected, data);
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 4.
     */
    @Test
    void printMethods_4() {
        ClassInfo c = new ClassInfo();
        String[] data = c.printMethods(4);
        String[] expected = {"public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)"};
        assertArrayEquals(expected, data);
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 5.
     */
    @Test
    void printMethods_5() {
        ClassInfo c = new ClassInfo();
        String[] data = c.printMethods(5);
        String[] expected = {"public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)"};
        assertArrayEquals(expected, data);
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 6.
     */
    @Test
    void printMethods_6() {
        ClassInfo c = new ClassInfo();
        String[] data = c.printMethods(6);
        String[] expected = {"public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)", "public void com.jstevh.viewer.ClassInfo.printMethods(int)"};
        assertArrayEquals(expected, data);
    }

    /**
     * Test case for {@link ClassInfo#printMethods(int)}.
     * <p>
     * This test case tests the method with a parameter of 7.
     */
    @Test
    void printMethods_7() {
        ClassInfo c = new ClassInfo();
        String