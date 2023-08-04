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
    * Test case for {@link ClassInfo#printInterfaces()} method.
    * It tests whether the method returns an array of strings that contain the interfaces for
    * the class. The data is pulled from the c private Class object.
    * <p>
    * This method calls  {@link #getData(java.lang.Class[])} method for constructors.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void printInterfaces() throws Exception {
        ClassInfo classInfo = new ClassInfo();
        String[] interfaces = classInfo.printInterfaces();
        assertEquals(1, interfaces.length);
        assertEquals("java.awt.WindowConstants", interfaces[0]);
    }
}

// ClassInfo_5Test.java
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
class ClassInfo_5Test {
		
    /**
    * Test case for {@link ClassInfo#printConstructors()} method.
    * It tests whether the method returns an array of strings that contain the public constructors for
    * the class. The data is pulled from the c private Class object.
    * <p>
    * This method calls  {@link #getData(java.lang.Class[])} method for constructors.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void printConstructors() throws Exception {
        ClassInfo classInfo = new ClassInfo();
        String[] constructors = classInfo.printConstructors();
        assertEquals(1, constructors.length);
        assertEquals("java.awt.WindowConstants()", constructors[0]);
    }
}

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
* It contains ten unit test cases for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_6Test {
		
    /**
    * Test case for {@link ClassInfo#printMethods()} method.
    * It tests whether the method returns an array of strings that contain the public methods for
    * the class. The data is pulled from the c private Class object.
    * <p>
    * This method calls  {@link #getData(java.lang.Class[])} method for constructors.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void printMethods() throws Exception {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods();
        assertEquals(1, methods.length);
        assertEquals("java.awt.WindowConstants.class", methods[0]);
    }
}

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
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfo_7Test {
		
    /**
    * Test case for {@link ClassInfo#printMethods(int)} method.
    * It tests whether the method returns an array of strings that contain the public methods for
    * the class excluding inherited methods. The data is pulled from
    * the c private Class object.
    * <p>
    * This method calls  {@link #getData(java.lang.Class[])} method for constructors.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void printMethods() throws Exception {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(ClassInfo.NO_INHERITED_METHODS);
        assertEquals(1, methods.length);
        assertEquals("java.awt.WindowConstants.class", methods[0]);
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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfo_8Test {
		
    /**
    * Test case for {@link ClassInfo#printFields()} method.
    * It tests whether the method returns an array of strings that contain the public fields for
    * the class. The data is pulled from the c private Class object.
    * <p>
    * This method always returns immediately.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void printFields() throws Exception {
        ClassInfo classInfo = new ClassInfo();
        String[] fields = classInfo.printFields();
        assertEquals(1, fields.length);
        assertEquals("java.awt.WindowConstants.class", fields[0]);
    }
}

// ClassInfo_9Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#getClassName()} method.
*/
class ClassInfo_9Test {
		
    /**
    * Test case for {@link ClassInfo#getClassName()} method.
    * It tests whether the method returns the name of the class.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getClassName() throws Exception {
        ClassInfo classInfo = new ClassInfo();
        String className = classInfo.getClassName();
        assertEquals("java.awt.WindowConstants", className);
    }
}

// ClassInfo_10Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#getClassPackage()} method.
*/
class ClassInfo_10Test {
		
    /**
    * Test case for {@link ClassInfo#getClassPackage()} method.
    * It tests whether the method returns the package of the class.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getClassPackage() throws Exception {
        ClassInfo classInfo = new ClassInfo();
        String classPackage = classInfo.getClassPackage();
        assertEquals("java.awt", classPackage);
    }
}

// ClassInfo_11Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#getSuperClassName()} method.
*/
class ClassInfo_11Test {
		
    /**
    * Test case for {@link ClassInfo#getSuperClassName()} method.
    * It tests whether the method returns the name of the super class.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getSuperClassName() throws Exception {
        ClassInfo classInfo = new ClassInfo();
        String superClassName = classInfo.getSuperClassName();
        assertEquals("java.lang.Object", superClassName);
    }
}

// ClassInfo_12Test.java
package