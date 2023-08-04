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

    @Test
    void testPrintMethods() {
        ClassInfo classInfo = new ClassInfo();
        String[] data = classInfo.printMethods(0);
        assertEquals(null, data);
    }
}
