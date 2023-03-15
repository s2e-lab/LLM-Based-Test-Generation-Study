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
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(1, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_1() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(2, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_2() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.gui.QSAdmin" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(3, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_3() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(3, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_4() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(3, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_5() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(3, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_6() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(3, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_7() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(3, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_8() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(3, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
		@Test
		public void testLoadClass_9() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				String[] classNames = { "org.quickserver.net.qsadmin.CommandHandler", "org.quickserver.net.qsadmin.QSAdminServer", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin", "org.quickserver.net.qsadmin.gui.QSAdmin" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertEquals(3, classHash.size());
				assertEquals(classNames[0], classHash.keySet().iterator().next());
		}
		
}

// JarFileList.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;

/**
 * A utility class to list jar files.
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class JarFileList implements FilenameFilter {
    private static Logger logger = Logger.getLogger(JarFileList.class.getName());

    public boolean accept(File dir, String name) {
        if (name.endsWith(".jar")) {
            return true;
        } else {
            return false;
        }
    }
}

// JarFileList_0Test.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JarFileList}.
* It contains ten unit test cases for the {@link JarFileList#accept(File, String)} method.
*/
class JarFileList_0Test {
		
		private static Logger logger = Logger.getLogger(JarFileList_0Test.class.getName());
		
		@Test
		public void testAccept_0() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
		@Test
		public void testAccept_1() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
		@Test
		public void testAccept_2() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
		@Test
		public void testAccept_3() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
		@Test
		public void testAccept_4() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
		@Test
		public void testAccept_5() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
		@Test
		public void testAccept_6() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
		@Test
		public void testAccept_7() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
		@Test
		public void testAccept_8() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
		@Test
		public void testAccept_9() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
}

// JarFileList_1Test.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JarFileList}.
* It contains ten unit test cases for the {@link JarFileList#accept(File, String)} method.
*/
class JarFileList_1Test {
		
		private static Logger logger = Logger.getLogger(JarFileList_1Test.class.getName());
		
		@Test
		public void testAccept_0() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
		@Test
		public void testAccept_1() throws Exception {
				JarFileList jarFileList = new JarFileList();
				File dir = new File("lib");
				String name = "quickserver.jar";
				boolean result = jarFileList.accept(dir, name);
				assertEquals(true, result);
		}
		
		@Test
		public void testAccept