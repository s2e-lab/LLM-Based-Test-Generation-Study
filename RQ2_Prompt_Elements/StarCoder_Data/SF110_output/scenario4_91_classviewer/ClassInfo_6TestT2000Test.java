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
    * Test case for {@link ClassInfo#getData(Class[])} method.
    * It tests the method with an array of Class objects.
    */
    @Test
    void getData_ClassArray() {
        Class[] c = new Class[10];
        c[0] = String.class;
        c[1] = Integer.class;
        c[2] = Double.class;
        c[3] = Float.class;
        c[4] = Long.class;
        c[5] = Short.class;
        c[6] = Byte.class;
        c[7] = Character.class;
        c[8] = Boolean.class;
        c[9] = Object.class;
        String[] s = ClassInfo.getData(c);
        assertEquals(10, s.length);
        assertEquals("class java.lang.String", s[0]);
        assertEquals("class java.lang.Integer", s[1]);
        assertEquals("class java.lang.Double", s[2]);
        assertEquals("class java.lang.Float", s[3]);
        assertEquals("class java.lang.Long", s[4]);
        assertEquals("class java.lang.Short", s[5]);
        assertEquals("class java.lang.Byte", s[6]);
        assertEquals("class java.lang.Character", s[7]);
        assertEquals("class java.lang.Boolean", s[8]);
        assertEquals("class java.lang.Object", s[9]);
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
* It contains ten unit test cases for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_7Test {
		
    /**
    * Test case for {@link ClassInfo#getData(Member[])} method.
    * It tests the method with an array of Member objects.
    */
    @Test
    void getData_MemberArray() {
        Member[] m = new Member[10];
        m[0] = String.class.getConstructors()[0];
        m[1] = Integer.class.getConstructors()[0];
        m[2] = Double.class.getConstructors()[0];
        m[3] = Float.class.getConstructors()[0];
        m[4] = Long.class.getConstructors()[0];
        m[5] = Short.class.getConstructors()[0];
        m[6] = Byte.class.getConstructors()[0];
        m[7] = Character.class.getConstructors()[0];
        m[8] = Boolean.class.getConstructors()[0];
        m[9] = Object.class.getConstructors()[0];
        String[] s = ClassInfo.getData(m);
        assertEquals(10, s.length);
        assertEquals("public java.lang.String()", s[0]);
        assertEquals("public java.lang.Integer()", s[1]);
        assertEquals("public java.lang.Double()", s[2]);
        assertEquals("public java.lang.Float()", s[3]);
        assertEquals("public java.lang.Long()", s[4]);
        assertEquals("public java.lang.Short()", s[5]);
        assertEquals("public java.lang.Byte()", s[6]);
        assertEquals("public java.lang.Character()", s[7]);
        assertEquals("public java.lang.Boolean()", s[8]);
        assertEquals("public java.lang.Object()", s[9]);
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
* It contains ten unit test cases for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_8Test {
		
    /**
    * Test case for {@link ClassInfo#getData(Class[])} method.
    * It tests the method with an array of Class objects.
    */
    @Test
    void getData_ClassArray() {
        Class[] c = new Class[10];
        c[0] = String.class;
        c[1] = Integer.class;
        c[2] = Double.class;
        c[3] = Float.class;
        c[4] = Long.class;
        c[5] = Short.class;
        c[6] = Byte.class;
        c[7] = Character.class;
        c[8] = Boolean.class;
        c[9] = Object.class;
        String[] s = ClassInfo.getData(c);
        assertEquals(10, s.length);
        assertEquals("class java.lang.String", s[0]);
        assertEquals("class java.lang.Integer", s[1]);
        assertEquals("class java.lang.Double", s[2]);
        assertEquals("class java.lang.Float", s[3]);
        assertEquals("class java.lang.Long", s[4]);
        assertEquals("class java.lang.Short", s[5]);
        assertEquals("class java.lang.Byte", s[6]);
        assertEquals("class java.lang.Character", s[7]);
        assertEquals("class java.lang.Boolean", s[8]);
        assertEquals("class java.lang.Object", s[9]);
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
* It contains ten unit test cases for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_9Test {
		
    /**
    * Test case for {@link ClassInfo#getData(Member[])} method.
    * It tests the method with an array of Member objects.
    */
    @Test
    void getData_MemberArray() {
        Member[] m = new Member[10];
        m[0] = String.class.getConstructors()[0];
        m[1] = Integer.class.getConstructors()[0];
        m[2] = Double.class.getConstructors()[0];
        m[3] = Float.class.getConstructors()[0];
        m[4] = Long.class.getConstructors()[0];
        m[5] = Short.class.getConstructors()[0];
        m[6] = Byte.class.getConstructors()[0];
        m[7] = Character.class.getConstructors()[0];
        m[8] = Boolean.class.getConstructors()[0];
        m[9] = Object.class.getConstructors()[0];
        String[] s = ClassInfo.getData(m);
        assertEquals(10, s.length);
        assertEquals("public java.lang.String()", s[0]);
        assertEquals("public java.lang.Integer()", s[1]);
        assertEquals("public java.lang.Double()", s[2]);
        assertEquals("public java.lang.Float()", s[3]);
        assertEquals("public java.lang.Long()", s[4]);
        assertEquals("public java.lang.Short()", s[5]);
        assertEquals("public java.lang.Byte()", s[6]);
        assertEquals("public java.lang.Character()", s[7]);
        assertEquals("public java.lang.Boolean()", s[8]);
        assertEquals("public java.lang.Object()", s[9]);
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
* It contains ten unit test cases for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_10Test {
		
    /**
    * Test case for {@link ClassInfo#getData(Class[])} method.
    * It tests the method with an array of Class objects.
    */
    @Test
    void getData_ClassArray() {
       