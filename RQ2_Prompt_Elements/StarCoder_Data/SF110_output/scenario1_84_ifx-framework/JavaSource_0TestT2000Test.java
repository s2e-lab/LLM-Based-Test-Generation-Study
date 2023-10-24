// JavaSource_0Test.java
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
class JavaSource_0Test {

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_0() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_1() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("");
        assertFalse(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_2() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface(null);
        assertFalse(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_3() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_4() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_5() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable, java.lang.Runnable");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_6() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable, java.lang.Runnable, java.lang.Comparable");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_7() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable, java.lang.Runnable, java.lang.Comparable, java.lang.String");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_8() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable, java.lang.Runnable, java.lang.Comparable, java.lang.String, java.lang.Number");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_9() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable, java.lang.Runnable, java.lang.Comparable, java.lang.String, java.lang.Number, java.lang.Boolean");
        assertTrue(javaSource.hasInterface());
    }
}

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
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_1Test {
		
    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_0() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_1() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("");
        assertFalse(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_2() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface(null);
        assertFalse(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_3() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_4() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_5() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable, java.lang.Runnable");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_6() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable, java.lang.Runnable, java.lang.Comparable");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_7() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable, java.lang.Runnable, java.lang.Comparable, java.lang.String");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_8() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable, java.lang.Runnable, java.lang.Comparable, java.lang.String, java.lang.Number");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_9() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object, java.lang.Cloneable, java.io.Serializable, java.lang.Runnable, java.lang.Comparable, java.lang.String, java.lang.Number, java.lang.Boolean");
        assertTrue(javaSource.hasInterface());
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
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_2Test {
		
    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_0() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("java.lang.Object");
        assertTrue(javaSource.hasInterface());
    }

    /**
    * Test case for {@link JavaSource#hasInterface()} method.
    */
    @Test
    void test_hasInterface_1() {