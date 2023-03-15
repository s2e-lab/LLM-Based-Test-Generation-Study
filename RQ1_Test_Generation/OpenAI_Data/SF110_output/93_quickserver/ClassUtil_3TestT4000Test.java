// ClassUtil_3Test.java
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
* It contains ten unit test cases for the {@link ClassUtil#getClassLoader(String)} method.
*/
class ClassUtil_3Test {

		private static Logger logger = Logger.getLogger(ClassUtil_3Test.class.getName());
		
		@Test
		public void testGetClassLoader_1() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("/home/akshath/quickserver/lib");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoader_2() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoader_3() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoader_4() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoader_5() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoader_6() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoader_7() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoader_8() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoader_9() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoader_10() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
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
		
		private static Logger logger = Logger.getLogger(ClassUtil_2Test.class.getName());
		
		@Test
		public void testGetClassLoaderFromJar_1() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJar_2() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJar_3() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJar_4() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJar_5() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJar_6() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJar_7() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJar_8() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJar_9() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJar_10() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("/home/akshath/quickserver/lib/quickserver-1.4.7.jar");
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
		
		private static Logger logger = Logger.getLogger(ClassUtil_1Test.class.getName());
		
		@Test
		public void testGetClassLoaderFromJars_1() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJars_2() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJars_3() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJars_4() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJars_5() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJars_6() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJars_7() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJars_8() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJars_9() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				assertNotNull(classLoader);
		}
		
		@Test
		public void testGetClassLoaderFromJars_10() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
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
		
		private static Logger logger = Logger.getLogger(ClassUtilTest.class.getName());
		
		@Test
		public void testLoadClass_1() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				String[] classNames = { "org.quickserver.net.server.QuickServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertNotNull(classHash);
		}
		
		@Test
		public void testLoadClass_2() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				String[] classNames = { "org.quickserver.net.server.QuickServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertNotNull(classHash);
		}
		
		@Test
		public void testLoadClass_3() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				String[] classNames = { "org.quickserver.net.server.QuickServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertNotNull(classHash);
		}
		
		@Test
		public void testLoadClass_4() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				String[] classNames = { "org.quickserver.net.server.QuickServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertNotNull(classHash);
		}
		
		@Test
		public void testLoadClass_5() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				String[] classNames = { "org.quickserver.net.server.QuickServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertNotNull(classHash);
		}
		
		@Test
		public void testLoadClass_6() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				String[] classNames = { "org.quickserver.net.server.QuickServer" };
				Map classHash = ClassUtil.loadClass(classLoader, classNames);
				assertNotNull(classHash);
		}
		
		@Test
		public void testLoadClass_7() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("/home/akshath/quickserver/lib");
				String[] classNames = { "org.quickserver.net.server.QuickServer" };
				Map classHash = ClassUt