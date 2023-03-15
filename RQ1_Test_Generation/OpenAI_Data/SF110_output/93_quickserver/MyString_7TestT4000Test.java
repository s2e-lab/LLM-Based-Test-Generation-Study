// MyString_7Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#getStackTrace(Throwable)} method.
*/
class MyString_7Test {

	@Test
	void testGetStackTrace() {
		try {
			throw new NullPointerException("Test");
		} catch (Exception e) {
			String stackTrace = MyString.getStackTrace(e);
			assertTrue(stackTrace.contains("java.lang.NullPointerException: Test"));
			assertTrue(stackTrace.contains("at org.quickserver.util.MyString_7Test.testGetStackTrace(MyString_7Test.java:"));
		}
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
		assertEquals("1.00 B", MyString.getMemInfo(1));
		assertEquals("1.00 KB", MyString.getMemInfo(1024));
		assertEquals("1.00 MB", MyString.getMemInfo(1024*1024));
		assertEquals("1.00 GB", MyString.getMemInfo(1024*1024*1024));
	}
}

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
		String systemInfo = MyString.getSystemInfo("1.4.5");
		assertTrue(systemInfo.contains("QuickServer v1.4.5 is being used."));
		assertTrue(systemInfo.contains("Java VM v"));
		assertTrue(systemInfo.contains(" is being used."));
		assertTrue(systemInfo.contains("Operating System: "));
		assertTrue(systemInfo.contains("Current working directory: "));
		assertTrue(systemInfo.contains("Class/s loaded from: "));
		assertTrue(systemInfo.contains("Total memory currently available: "));
		assertTrue(systemInfo.contains("Memory currently in use: "));
		assertTrue(systemInfo.contains("Maximum memory available: "));
	}
}

// MyString_10Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#alignRight(String, int)} method.
*/
class MyString_10Test {
		
	@Test
	void testAlignRight() {
		assertEquals("    1", MyString.alignRight("1", 5));
		assertEquals("   12", MyString.alignRight("12", 5));
		assertEquals("  123", MyString.alignRight("123", 5));
		assertEquals(" 1234", MyString.alignRight("1234", 5));
		assertEquals("12345", MyString.alignRight("12345", 5));
		assertEquals("123456", MyString.alignRight("123456", 5));
	}
}

// MyString_11Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#alignLeft(String, int)} method.
*/
class MyString_11Test {
		
	@Test
	void testAlignLeft() {
		assertEquals("1    ", MyString.alignLeft("1", 5));
		assertEquals("12   ", MyString.alignLeft("12", 5));
		assertEquals("123  ", MyString.alignLeft("123", 5));
		assertEquals("1234 ", MyString.alignLeft("1234", 5));
		assertEquals("12345", MyString.alignLeft("12345", 5));
		assertEquals("123456", MyString.alignLeft("123456", 5));
	}
}

// MyString_12Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#replaceAllNo(String, String)} method.
*/
class MyString_12Test {
		
	@Test
	void testReplaceAllNo() {
		assertEquals("1", MyString.replaceAllNo("1", ""));
		assertEquals("", MyString.replaceAllNo("1", "1"));
		assertEquals("", MyString.replaceAllNo("1234567890", ""));
		assertEquals("", MyString.replaceAllNo("1234567890", "1"));
		assertEquals("", MyString.replaceAllNo("1234567890", "2"));
		assertEquals("", MyString.replaceAllNo("1234567890", "3"));
		assertEquals("", MyString.replaceAllNo("1234567890", "4"));
		assertEquals("", MyString.replaceAllNo("1234567890", "5"));
		assertEquals("", MyString.replaceAllNo("1234567890", "6"));
		assertEquals("", MyString.replaceAllNo("1234567890", "7"));
		assertEquals("", MyString.replaceAllNo("1234567890", "8"));
		assertEquals("", MyString.replaceAllNo("1234567890", "9"));
		assertEquals("", MyString.replaceAllNo("1234567890", "0"));
	}
}

// MyString_13Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#removeAllHtmlSpChar(String)} method.
*/
class MyString_13Test {
		
	@Test
	void testRemoveAllHtmlSpChar() {
		assertEquals("&nbsp;", MyString.removeAllHtmlSpChar("&nbsp;"));
		assertEquals("&lt;", MyString.removeAllHtmlSpChar("&lt;"));
		assertEquals("&gt;", MyString.removeAllHtmlSpChar("&gt;"));
		assertEquals("&amp;", MyString.removeAllHtmlSpChar("&amp;"));
		assertEquals("&quot;", MyString.removeAllHtmlSpChar("&quot;"));
		assertEquals(" ", MyString.removeAllHtmlSpChar("&nbsp;"));
		assertEquals("<", MyString.removeAllHtmlSpChar("&lt;"));
		assertEquals(">", MyString.removeAllHtmlSpChar("&gt;"));
		assertEquals("&", MyString.removeAllHtmlSpChar("&amp;"));
		assertEquals("\"", MyString.removeAllHtmlSpChar("&quot;"));
	}
}

// MyString_14Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#replaceAllTags(String, String)} method.
*/
class MyString_14Test {
		
	@Test
	void testReplaceAllTags() {
		assertEquals("", MyString.replaceAllTags("<>", ""));
		assertEquals("", MyString.replaceAllTags("<a>", ""));
		assertEquals("", MyString.replaceAllTags("<a>", "a"));
		assertEquals("", MyString.replaceAllTags("<a>", "b"));
		assertEquals("", MyString.replaceAllTags("<a>", "c"));
		assertEquals("", MyString.replaceAllTags("<a>", "d"));
		assertEquals("", MyString.replaceAllTags("<a>", "e"));
		assertEquals("", MyString.replaceAllTags("<a>", "f"));
		assertEquals("", MyString.replaceAllTags("<a>", "g"));
		assertEquals("", MyString.replaceAllTags("<a>", "h"));
		assertEquals("", MyString.replaceAllTags("<a>", "i"));
		assertEquals("", MyString.replaceAllTags("<a>", "j"));
		assertEquals("", MyString.replaceAllTags("<a>", "k"));
		assertEquals("", MyString.replaceAllTags("<a>", "l"));
		assertEquals("", MyString.replaceAllTags("<a>", "m"));
		assertEquals("", MyString.replaceAllTags("<a>", "n"));
		assertEquals("", MyString.replaceAllTags("<a>", "o"));
		assertEquals("", MyString.replaceAllTags("<a>", "p"));
		assertEquals("", MyString.replaceAllTags("<a>", "q"));
		assertEquals("", MyString.replaceAllTags("<a>", "r"));
		assertEquals("", MyString.replaceAllTags("<a>", "s"));
		assertEquals("", MyString.replaceAllTags("<a>", "t"));
		assertEquals("", MyString.replaceAllTags("<a>", "u"));
		assertEquals("", MyString.replaceAllTags("<a>", "v"));
		assertEquals("", MyString.replaceAllTags("<a>", "w"));
		assertEquals("", MyString.replaceAllTags("<a>", "x"));
		assertEquals("", MyString.replaceAllTags("<a>", "y"));
		assertEquals("", MyString.replaceAllTags("<a>", "z"));
		assertEquals("", MyString.replaceAllTags("<a>", "A"));
		assertEquals("", MyString.replaceAllTags("<a>", "B"));
		assertEquals("", MyString.replaceAllTags("<a>", "C"));
		assertEquals("", MyString.replaceAllTags("<a>", "D"));
		assertEquals("", MyString.replaceAllTags("<a>", "E"));
		assertEquals("", MyString.replaceAllTags("<a>", "F"));
		assertEquals("", MyString.replaceAllTags("<a>", "G"));
		assertEquals("", MyString.replaceAllTags("<a>", "H"));
		assertEquals("", MyString.replaceAllTags("<a>", "I"));
		assertEquals("", MyString.replaceAllTags("<a>", "J"));
		assertEquals("", MyString.replaceAllTags("<a>", "K"));
		assertEquals("", MyString.replaceAllTags("<a>", "L"));
		assertEquals("", MyString.replaceAllTags("<a>", "M"));
		assertEquals("", MyString.replaceAllTags("<a>", "N"));
		assertEquals("", MyString.replaceAllTags("<a>", "O"));
		assertEquals("", MyString.replaceAllTags("<a>", "P"));
		assertEquals("", MyString.replaceAllTags("<a>", "Q"));
		assertEquals("", MyString.replaceAllTags("<a>", "R"));
		assertEquals("", MyString.replaceAllTags("<a>", "S"));
		assertEquals("", MyString.replaceAllTags("<a>", "T"));
		assertEquals("", MyString.replaceAllTags("<a>", "U"));
		assertEquals("", MyString.replaceAllTags("<a>", "V"));
		assertEquals("", MyString.replaceAllTags("<a>", "W"));
		assertEquals("", MyString.replaceAllTags("<a>", "X"));
		assertEquals("", MyString.replaceAllTags("<a>", "Y"));
		assertEquals("", MyString.replaceAllTags("<a>", "Z"));
		assertEquals("", MyString.replaceAllTags("<a>", "0"));
		assertEquals("", MyString.replaceAllTags("<a>", "1"));
		assertEquals("", MyString.replaceAllTags("<a>", "2"));
		assertEquals("", MyString.replaceAllTags("<a>", "3"));
		assertEquals("", MyString.replaceAllTags("<a>", "4"));
		assertEquals("", MyString.replaceAllTags("<a>", "5"));
		assertEquals("", MyString.replaceAllTags("<a>", "6"));
		assertEquals("", MyString.replaceAllTags("<a>", "7"));
		assertEquals("", MyString.replaceAllTags("<a>", "8"));
		assertEquals("", MyString.replaceAllTags("<a>", "9"));
		assertEquals("", MyString.replaceAllTags("<a>", " "));
		assertEquals("", MyString.replaceAllTags("<a>", "!"));
		assertEquals("", MyString.replaceAllTags("<a>", "@"));
		assertEquals("", MyString.replaceAllTags("<a>", "#"));
		assertEquals("", MyString.replaceAllTags("<a>", "$"));
		assertEquals("", MyString.replaceAllTags("<a>", "%"));
		assertEquals("", MyString.replaceAllTags("<a>", "^"));
		assertEquals("", MyString.replaceAllTags("<a>", "&"));
		assertEquals("", MyString.replaceAllTags("<a>", "*"));
		assertEquals("", MyString.replaceAllTags("<a>", "("));
		assertEquals("", MyString.replaceAllTags("<a>", ")"));
		assertEquals("", MyString.replaceAllTags("<a>", "-"));
		assertEquals("", MyString.replaceAllTags("<a>", "_"));
		assertEquals("", MyString.replaceAllTags("<a>", "="));
		assertEquals("", MyString.replaceAllTags("<a>", "+"));
		assertEquals("", MyString.replaceAllTags("<a>", "["));
		assertEquals("", MyString.replaceAllTags("<a>", "]"));
		assertEquals("", MyString.replace