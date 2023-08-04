// ClassUtilTest.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassUtil}.
* It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
*/
class ClassUtilTest {

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the case when the directory passed as parameter
     * contains only one jar file.
     */
    @Test
    void testGetClassLoaderFromJars1() throws Exception {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jars");
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the case when the directory passed as parameter
     * contains multiple jar files.
     */
    @Test
    void testGetClassLoaderFromJars2() throws Exception {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jars2");
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the case when the directory passed as parameter
     * contains no jar files.
     */
    @Test
    void testGetClassLoaderFromJars3() throws Exception {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jars3");
        assertNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the case when the directory passed as parameter
     * contains a jar file with a name that is not a valid class name.
     */
    @Test
    void testGetClassLoaderFromJars4() throws Exception {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jars4");
        assertNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the case when the directory passed as parameter
     * contains a jar file with a name that is not a valid class name.
     */
    @Test
    void testGetClassLoaderFromJars5() throws Exception {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jars5");
        assertNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the case when the directory passed as parameter
     * contains a jar file with a name that is not a valid class name.
     */
    @Test
    void testGetClassLoaderFromJars6() throws Exception {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jars6");
        assertNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the case when the directory passed as parameter
     * contains a jar file with a name that is not a valid class name.
     */
    @Test
    void testGetClassLoaderFromJars7() throws Exception {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jars7");
        assertNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the case when the directory passed as parameter
     * contains a jar file with a name that is not a valid class name.
     */
    @Test
    void testGetClassLoaderFromJars8() throws Exception {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jars8");
        assertNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the case when the directory passed as parameter
     * contains a jar file with a name that is not a valid class name.
     */
    @Test
    void testGetClassLoaderFromJars9() throws Exception {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jars9");
        assertNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the case when the directory passed as parameter
     * contains a jar file with a name that is not a valid class name.
     */
    @Test
    void testGetClassLoaderFromJars10() throws Exception {
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jars10");
        assertNull(classLoader);
    }
}
