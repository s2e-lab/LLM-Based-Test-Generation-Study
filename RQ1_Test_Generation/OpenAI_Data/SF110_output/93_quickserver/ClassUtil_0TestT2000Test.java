// ClassUtil_0Test.java
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
class ClassUtil_0Test {

		private static Logger logger = Logger.getLogger(ClassUtil_0Test.class.getName());
		
		@Test
		public void testLoadClass_0() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(1, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_1() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(2, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_2() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(2, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_3() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(2, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_4() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(2, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_5() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(2, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_6() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(2, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_7() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(2, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_8() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(2, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_9() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.