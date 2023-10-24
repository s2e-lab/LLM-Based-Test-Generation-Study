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
     * Test case for the {@link ClassInfo#printInterfaces()} method.
     * <p>
     * This test case tests the {@link ClassInfo#printInterfaces()} method.
     *
     * @throws Exception
     */
    @Test
    void testPrintInterfaces() throws Exception {
        ClassInfo ci = new ClassInfo();
        Class c = Class.forName("com.jstevh.viewer.ClassInfo");
        String[] data = ci.printInterfaces();
        String[] expected = {"java.lang.Cloneable", "java.io.Serializable"};
        assertArrayEquals(expected, data);
    }
}
