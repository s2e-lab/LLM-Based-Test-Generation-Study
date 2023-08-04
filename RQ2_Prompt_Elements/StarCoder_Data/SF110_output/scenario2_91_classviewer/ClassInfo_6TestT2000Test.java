// ClassInfo_6Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_6Test {

    /**
    * Test case for {@link ClassInfo#getData(Class[])}.
    * It tests the method with an array of Class objects.
    */
    @Test
    void getData() {
        Class[] m = new Class[10];
        m[0] = String.class;
        m[1] = Integer.class;
        m[2] = JButton.class;
        m[3] = JFrame.class;
        m[4] = JTextArea.class;
        m[5] = JScrollPane.class;
        m[6] = JList.class;
        m[7] = JComboBox.class;
        m[8] = JMenuBar.class;
        m[9] = JMenu.class;
        String[] StringData = ClassInfo.getData(m);
        String[] expected = {"java.lang.String", "java.lang.Integer", "javax.swing.JButton", "javax.swing.JFrame", "javax.swing.JTextArea", "javax.swing.JScrollPane", "javax.swing.JList", "javax.swing.JComboBox", "javax.swing.JMenuBar", "javax.swing.JMenu"};
        assertArrayEquals(expected, StringData);
    }
}
