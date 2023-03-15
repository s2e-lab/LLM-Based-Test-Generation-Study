// ClassUtil_2Test.java
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
* It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJar(String)} method.
*/
class ClassUtil_2Test {

		@Test
		void testGetClassLoaderFromJar_1() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/Desktop/test.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJar_2() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/Desktop/test.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJar_3() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/Desktop/test.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJar_4() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/Desktop/test.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJar_5() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/Desktop/test.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJar_6() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/Desktop/test.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJar_7() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/Desktop/test.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJar_8() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/Desktop/test.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJar_9() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/Desktop/test.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJar_10() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/Desktop/test.jar");
				assertNotNull(classLoader);
		}
}

// ClassUtil_1Test.java
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
class ClassUtil_1Test {
		
		@Test
		void testGetClassLoaderFromJars_1() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJars_2() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJars_3() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJars_4() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJars_5() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJars_6() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJars_7() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJars_8() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJars_9() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				assertNotNull(classLoader);
		}
		
		@Test
		void testGetClassLoaderFromJars_10() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				assertNotNull(classLoader);
		}
}

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
* It contains ten unit test cases for the {@link ClassUtil#loadClass(ClassLoader, String[])} method.
*/
class ClassUtilTest {
		
		@Test
		void testLoadClass_1() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				String[] classNames = {"org.quickserver.util.ClassUtil"};
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertNotNull(classHash);
		}
		
		@Test
		void testLoadClass_2() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/Desktop/test");
				String[] classNames = {"org.quickserver.util.ClassUtil"};
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertNotNull(classHash);
		}
		
		@Test