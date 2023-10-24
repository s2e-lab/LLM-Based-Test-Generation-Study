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
     * It tests the method with a directory that does not exist.
     */
    @Test
    void testGetClassLoaderFromJarsWithNonExistentDir() {
        logger.fine("Testing getClassLoaderFromJars with non-existent dir");
        try {
            ClassUtil.getClassLoaderFromJars("non-existent-dir");
            fail("Should throw an exception");
        } catch (Exception e) {
            logger.fine("Got expected exception: " + e);
        }
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the method with a directory that contains no jars.
     */
    @Test
    void testGetClassLoaderFromJarsWithEmptyDir() {
        logger.fine("Testing getClassLoaderFromJars with empty dir");
        try {
            ClassUtil.getClassLoaderFromJars("src/test/resources/empty-dir");
            fail("Should throw an exception");
        } catch (Exception e) {
            logger.fine("Got expected exception: " + e);
        }
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the method with a directory that contains a jar.
     */
    @Test
    void testGetClassLoaderFromJarsWithSingleJar() {
        logger.fine("Testing getClassLoaderFromJars with single jar");
        try {
            ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/single-jar");
            assertNotNull(classLoader);
        } catch (Exception e) {
            fail("Should not throw an exception");
        }
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the method with a directory that contains multiple jars.
     */
    @Test
    void testGetClassLoaderFromJarsWithMultipleJars() {
        logger.fine("Testing getClassLoaderFromJars with multiple jars");
        try {
            ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/multiple-jars");
            assertNotNull(classLoader);
        } catch (Exception e) {
            fail("Should not throw an exception");
        }
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the method with a directory that contains a jar and a directory.
     */
    @Test
    void testGetClassLoaderFromJarsWithJarAndDir() {
        logger.fine("Testing getClassLoaderFromJars with jar and dir");
        try {
            ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jar-and-dir");
            assertNotNull(classLoader);
        } catch (Exception e) {
            fail("Should not throw an exception");
        }
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the method with a directory that contains a jar and a directory.
     */
    @Test
    void testGetClassLoaderFromJarsWithJarAndDirAndNonJar() {
        logger.fine("Testing getClassLoaderFromJars with jar and dir and non-jar");
        try {
            ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jar-and-dir-and-non-jar");
            assertNotNull(classLoader);
        } catch (Exception e) {
            fail("Should not throw an exception");
        }
    }

    /**
     * Tests the {@link ClassUtil#getClassLoaderFromJars(String)} method.
     * It tests the method with a directory that contains a jar and a directory.
     */
    @Test
    void testGetClassLoaderFromJarsWithJarAndDirAndNonJarAndEmptyDir() {
        logger.fine("Testing getClassLoaderFromJars with jar and dir and non-jar and empty dir");
        try {
            ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("src/test/resources/jar-and-dir-and-non-jar-and-empty-dir");
            assertNotNull(classLoader);
        } catch (Exception e) {
            fail("Should not throw an exception");
        }
    }
}
