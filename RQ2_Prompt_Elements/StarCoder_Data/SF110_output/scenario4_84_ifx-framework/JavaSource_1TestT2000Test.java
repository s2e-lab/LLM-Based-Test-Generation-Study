// JavaSource_1Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_1Test {

    /**
    * Test method for {@link JavaSource#hasSuperClass()}.
    */
    @Test
    void testHasSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("java.lang.Object");
        assertTrue(javaSource.hasSuperClass());
    }
}

// JavaSource_2Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_2Test {
		
    /**
    * Test method for {@link JavaSource#hasSuperClass()}.
    */
    @Test
    void testHasSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("");
        assertFalse(javaSource.hasSuperClass());
    }
}

// JavaSource_3Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_3Test {
		
    /**
    * Test method for {@link JavaSource#hasSuperClass()}.
    */
    @Test
    void testHasSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass(null);
        assertFalse(javaSource.hasSuperClass());
    }
}

// JavaSource_4Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_4Test {
		
    /**
    * Test method for {@link JavaSource#hasInterface()}.
    */
    @Test
    void testHasInterface() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object");
        assertTrue(javaSource.hasInterface());
    }
}

// JavaSource_5Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_5Test {
		
    /**
    * Test method for {@link JavaSource#hasInterface()}.
    */
    @Test
    void testHasInterface() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("");
        assertFalse(javaSource.hasInterface());
    }
}

// JavaSource_6Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_6Test {
		
    /**
    * Test method for {@link JavaSource#hasInterface()}.
    */
    @Test
    void testHasInterface() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface(null);
        assertFalse(javaSource.hasInterface());
    }
}

// JavaSource_7Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#getPackageName()} method.
*/
class JavaSource_7Test {
		
    /**
    * Test method for {@link JavaSource#getPackageName()}.
    */
    @Test
    void testGetPackageName() {
        JavaSource javaSource = new JavaSource();
        javaSource.setPackageName("org.ifx.tools");
        assertEquals("org.ifx.tools", javaSource.getPackageName());
    }
}

// JavaSource_8Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#getPackageName()} method.
*/
class JavaSource_8Test {
		
    /**
    * Test method for {@link JavaSource#getPackageName()}.
    */
    @Test
    void testGetPackageName() {
        JavaSource javaSource = new JavaSource();
        javaSource.setPackageName("");
        assertEquals("", javaSource.getPackageName());
    }
}

// JavaSource_9Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#getPackageName()} method.
*/
class JavaSource_9Test {
		
    /**
    * Test method for {@link JavaSource#getPackageName()}.
    */
    @Test
    void testGetPackageName() {
        JavaSource javaSource = new JavaSource();
        javaSource.setPackageName(null);
        assertEquals("", javaSource.getPackageName());
    }
}

// JavaSource_10Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#getClassJavadocs()} method.
*/
class JavaSource_10Test {
		
    /**
    * Test method for {@link JavaSource#getClassJavadocs()}.
    */
    @Test
    void testGetClassJavadocs() {
        JavaSource javaSource = new JavaSource();
        javaSource.setClassJavadocs("/**\n * This is a test class.\n */");
        assertEquals("/**\n * This is a test class.\n */", javaSource.getClassJavadocs());
    }
}

// JavaSource_11Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#getClassJavadocs()} method.
*/
class JavaSource_11Test {
		
    /**
    * Test method for {@link JavaSource#getClassJavadocs()}.
    */
    @Test
    void testGetClassJavadocs() {
        JavaSource javaSource = new JavaSource();
        javaSource.setClassJavadocs("");
        assertEquals("", javaSource.getClassJavadocs());
    }
}

// JavaSource_12Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
