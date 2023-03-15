// MyString_9Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#getSystemInfo(String)} method.
*/
class MyString_9Test {

	@Test
	void testGetSystemInfo() {
		String version = "1.4.5";
		String result = MyString.getSystemInfo(version);
		assertNotNull(result);
		assertTrue(result.contains("QuickServer v"+version+" is being used."));
		assertTrue(result.contains("Java VM v"+System.getProperty("java.version")+" is being used."));
		assertTrue(result.contains("Operating System: "+System.getProperty("os.name")+" "+System.getProperty("os.version")));
		assertTrue(result.contains("Current working directory: "+System.getProperty("user.dir")));
		assertTrue(result.contains("Class/s loaded from: "+new MyString().getClass().getProtectionDomain().getCodeSource().getLocation()));
		assertTrue(result.contains("Total memory currently available: "+MyString.getMemInfo(Runtime.getRuntime().totalMemory())));
		assertTrue(result.contains("Memory currently in use: "+MyString.getMemInfo(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())));
		assertTrue(result.contains("Maximum memory available: "+MyString.getMemInfo(Runtime.getRuntime().maxMemory())));
	}
}

// MyString_8Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#getMemInfo(float)} method.
*/
class MyString_8Test {
		
	@Test
	void testGetMemInfo() {
		String result = MyString.getMemInfo(0);
		assertNotNull(result);
		assertEquals("0.00 B", result);
		
		result = MyString.getMemInfo(1023);
		assertNotNull(result);
		assertEquals("1023.00 B", result);
		
		result = MyString.getMemInfo(1024);
		assertNotNull(result);
		assertEquals("1.00 KB", result);
		
		result = MyString.getMemInfo(1048575);
		assertNotNull(result);
		assertEquals("1023.99 KB", result);
		
		result = MyString.getMemInfo(1048576);
		assertNotNull(result);
		assertEquals("1.00 MB", result);
		
		result = MyString.getMemInfo(1073741823);
		assertNotNull(result);
		assertEquals("1023.99 MB", result);
		
		result = MyString.getMemInfo(1073741824);
		assertNotNull(result);
		assertEquals("1.00 GB", result);
	}
}

// MyString_7Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#alignLeft(String, int)} method.
*/
class MyString_7Test {
		
	@Test
	void testAlignLeft() {
		String result = MyString.alignLeft("", 0);
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.alignLeft("", 1);
		assertNotNull(result);
		assertEquals(" ", result);
		
		result = MyString.alignLeft("", 2);
		assertNotNull(result);
		assertEquals("  ", result);
		
		result = MyString.alignLeft("", 3);
		assertNotNull(result);
		assertEquals("   ", result);
		
		result = MyString.alignLeft("", 4);
		assertNotNull(result);
		assertEquals("    ", result);
		
		result = MyString.alignLeft("", 5);
		assertNotNull(result);
		assertEquals("     ", result);
		
		result = MyString.alignLeft("", 6);
		assertNotNull(result);
		assertEquals("      ", result);
		
		result = MyString.alignLeft("", 7);
		assertNotNull(result);
		assertEquals("       ", result);
		
		result = MyString.alignLeft("", 8);
		assertNotNull(result);
		assertEquals("        ", result);
		
		result = MyString.alignLeft("", 9);
		assertNotNull(result);
		assertEquals("         ", result);
	}
}

// MyString_6Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#alignRight(String, int)} method.
*/
class MyString_6Test {
		
	@Test
	void testAlignRight() {
		String result = MyString.alignRight("", 0);
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.alignRight("", 1);
		assertNotNull(result);
		assertEquals(" ", result);
		
		result = MyString.alignRight("", 2);
		assertNotNull(result);
		assertEquals("  ", result);
		
		result = MyString.alignRight("", 3);
		assertNotNull(result);
		assertEquals("   ", result);
		
		result = MyString.alignRight("", 4);
		assertNotNull(result);
		assertEquals("    ", result);
		
		result = MyString.alignRight("", 5);
		assertNotNull(result);
		assertEquals("     ", result);
		
		result = MyString.alignRight("", 6);
		assertNotNull(result);
		assertEquals("      ", result);
		
		result = MyString.alignRight("", 7);
		assertNotNull(result);
		assertEquals("       ", result);
		
		result = MyString.alignRight("", 8);
		assertNotNull(result);
		assertEquals("        ", result);
		
		result = MyString.alignRight("", 9);
		assertNotNull(result);
		assertEquals("         ", result);
	}
}

// MyString_5Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#replaceAllTags(String, String)} method.
*/
class MyString_5Test {
		
	@Test
	void testReplaceAllTags() {
		String result = MyString.replaceAllTags("", "");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAllTags("<>", "");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAllTags("<>", " ");
		assertNotNull(result);
		assertEquals(" ", result);
+		
+		result = MyString.replaceAllTags("<>", "  ");
+		assertNotNull(result);
+		assertEquals("  ", result);
+		
+		result = MyString.replaceAllTags("<>", "   ");
+		assertNotNull(result);
+		assertEquals("   ", result);
+		
+		result = MyString.replaceAllTags("<>", "    ");
+		assertNotNull(result);
+		assertEquals("    ", result);
+		
+		result = MyString.replaceAllTags("<>", "     ");
+		assertNotNull(result);
+		assertEquals("     ", result);
+		
+		result = MyString.replaceAllTags("<>", "      ");
+		assertNotNull(result);
+		assertEquals("      ", result);
+		
+		result = MyString.replaceAllTags("<>", "       ");
+		assertNotNull(result);
+		assertEquals("       ", result);
+		
+		result = MyString.replaceAllTags("<>", "        ");
+		assertNotNull(result);
+		assertEquals("        ", result);
	}
}

// MyString_4Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#replaceTags(String, String)} method.
*/
class MyString_4Test {
		
	@Test
	void testReplaceTags() {
		String result = MyString.replaceTags("", "");
		assertNull(result);
		
		result = MyString.replaceTags("<>", "");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceTags("<>", " ");
		assertNotNull(result);
		assertEquals(" ", result);
+		
+		result = MyString.replaceTags("<>", "  ");
+		assertNotNull(result);
+		assertEquals("  ", result);
+		
+		result = MyString.replaceTags("<>", "   ");
+		assertNotNull(result);
+		assertEquals("   ", result);
+		
+		result = MyString.replaceTags("<>", "    ");
+		assertNotNull(result);
+		assertEquals("    ", result);
+		
+		result = MyString.replaceTags("<>", "     ");
+		assertNotNull(result);
+		assertEquals("     ", result);
+		
+		result = MyString.replaceTags("<>", "      ");
+		assertNotNull(result);
+		assertEquals("      ", result);
+		
+		result = MyString.replaceTags("<>", "       ");
+		assertNotNull(result);
+		assertEquals("       ", result);
+		
+		result = MyString.replaceTags("<>", "        ");
+		assertNotNull(result);
+		assertEquals("        ", result);
	}
}

// MyString_3Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#removeAllHtmlSpChar(String)} method.
*/
class MyString_3Test {
		
	@Test
	void testRemoveAllHtmlSpChar() {
		String result = MyString.removeAllHtmlSpChar("");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.removeAllHtmlSpChar("&nbsp;");
		assertNotNull(result);
		assertEquals(" ", result);
		
		result = MyString.removeAllHtmlSpChar("&lt;");
		assertNotNull(result);
		assertEquals("<", result);
		
		result = MyString.removeAllHtmlSpChar("&gt;");
		assertNotNull(result);
		assertEquals(">", result);
		
		result = MyString.removeAllHtmlSpChar("&amp;");
		assertNotNull(result);
		assertEquals("&", result);
		
		result = MyString.removeAllHtmlSpChar("&quot;");
		assertNotNull(result);
		assertEquals("\"", result);
	}
}

// MyString_2Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#replaceAllNo(String, String)} method.
*/
class MyString_2Test {
		
	@Test
	void testReplaceAllNo() {
		String result = MyString.replaceAllNo("", "");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAllNo("", " ");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAllNo("", "  ");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAllNo("", "   ");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAllNo("", "    ");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAllNo("", "     ");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAllNo("", "      ");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAllNo("", "       ");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAllNo("", "        ");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAllNo("", "         ");
		assertNotNull(result);
		assertEquals("", result);
	}
}

// MyString_1Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#replaceAll(String, String, String)} method.
*/
class MyString_1Test {
		
	@Test
	void testReplaceAll() {
		String result = MyString.replaceAll("", "", "");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAll("", "", " ");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString.replaceAll("", "", "  ");
		assertNotNull(result);
		assertEquals("", result);
		
		result = MyString