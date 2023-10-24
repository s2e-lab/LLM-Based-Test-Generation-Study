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

    private static Logger logger = Logger.getLogger(ClassUtilTest.class.getName());

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars() throws Exception {
        String jarDir = "src/test/resources/jars";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars2() throws Exception {
        String jarDir = "src/test/resources/jars2";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars3() throws Exception {
        String jarDir = "src/test/resources/jars3";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars4() throws Exception {
        String jarDir = "src/test/resources/jars4";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars5() throws Exception {
        String jarDir = "src/test/resources/jars5";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars6() throws Exception {
        String jarDir = "src/test/resources/jars6";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars7() throws Exception {
        String jarDir = "src/test/resources/jars7";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars8() throws Exception {
        String jarDir = "src/test/resources/jars8";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars9() throws Exception {
        String jarDir = "src/test/resources/jars9";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars10() throws Exception {
        String jarDir = "src/test/resources/jars10";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars11() throws Exception {
        String jarDir = "src/test/resources/jars11";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars12() throws Exception {
        String jarDir = "src/test/resources/jars12";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars13() throws Exception {
        String jarDir = "src/test/resources/jars13";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    @Test
    void testGetClassLoaderFromJars14() throws Exception {
        String jarDir = "src/test/resources/jars14";
        ClassLoader classLoader = ClassUtil.getClassLoaderFrom