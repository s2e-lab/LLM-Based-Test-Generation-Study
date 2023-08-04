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

    @Test
    void testPrintConstructors() {
        ClassInfo ci = new ClassInfo();
        String[] data = ci.printConstructors();
        assertEquals(data[0], "public com.jstevh.viewer.ClassInfo_3Test()");
        assertEquals(data[1], "public com.jstevh.viewer.ClassInfo_3Test(java.lang.String)");
        assertEquals(data[2], "public com.jstevh.viewer.ClassInfo_3Test(java.lang.String,java.lang.String)");
        assertEquals(data[3], "public com.jstevh.viewer.ClassInfo_3Test(java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[4], "public com.jstevh.viewer.ClassInfo_3Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[5], "public com.jstevh.viewer.ClassInfo_3Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[6], "public com.jstevh.viewer.ClassInfo_3Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[7], "public com.jstevh.viewer.ClassInfo_3Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[8], "public com.jstevh.viewer.ClassInfo_3Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[9], "public com.jstevh.viewer.ClassInfo_3Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
    }
}

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
* It contains ten unit test cases for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_2Test {
		
    @Test
    void testPrintConstructors() {
        ClassInfo ci = new ClassInfo();
        String[] data = ci.printConstructors();
        assertEquals(data[0], "public com.jstevh.viewer.ClassInfo_2Test()");
        assertEquals(data[1], "public com.jstevh.viewer.ClassInfo_2Test(java.lang.String)");
        assertEquals(data[2], "public com.jstevh.viewer.ClassInfo_2Test(java.lang.String,java.lang.String)");
        assertEquals(data[3], "public com.jstevh.viewer.ClassInfo_2Test(java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[4], "public com.jstevh.viewer.ClassInfo_2Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[5], "public com.jstevh.viewer.ClassInfo_2Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[6], "public com.jstevh.viewer.ClassInfo_2Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[7], "public com.jstevh.viewer.ClassInfo_2Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[8], "public com.jstevh.viewer.ClassInfo_2Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[9], "public com.jstevh.viewer.ClassInfo_2Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
    }
}

// ClassInfo_1Test.java
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
class ClassInfo_1Test {
		
    @Test
    void testPrintConstructors() {
        ClassInfo ci = new ClassInfo();
        String[] data = ci.printConstructors();
        assertEquals(data[0], "public com.jstevh.viewer.ClassInfo_1Test()");
        assertEquals(data[1], "public com.jstevh.viewer.ClassInfo_1Test(java.lang.String)");
        assertEquals(data[2], "public com.jstevh.viewer.ClassInfo_1Test(java.lang.String,java.lang.String)");
        assertEquals(data[3], "public com.jstevh.viewer.ClassInfo_1Test(java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[4], "public com.jstevh.viewer.ClassInfo_1Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[5], "public com.jstevh.viewer.ClassInfo_1Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[6], "public com.jstevh.viewer.ClassInfo_1Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[7], "public com.jstevh.viewer.ClassInfo_1Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[8], "public com.jstevh.viewer.ClassInfo_1Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
        assertEquals(data[9], "public com.jstevh.viewer.ClassInfo_1Test(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
    }
}

// ClassInfo_0Test.java
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
