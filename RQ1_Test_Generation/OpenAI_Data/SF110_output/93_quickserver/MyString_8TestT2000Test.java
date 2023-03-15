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
		assertEquals("0.00 B", MyString.getMemInfo(0));
		assertEquals("1.00 B", MyString.getMemInfo(1));
		assertEquals("1023.00 B", MyString.getMemInfo(1023));
		assertEquals("1.00 KB", MyString.getMemInfo(1024));
		assertEquals("1.00 KB", MyString.getMemInfo(1025));
		assertEquals("1.00 MB", MyString.getMemInfo(1024*1024));
		assertEquals("1.00 MB", MyString.getMemInfo(1024*1024+1));
		assertEquals("1.00 GB", MyString.getMemInfo(1024*1024*1024));
		assertEquals("1.00 GB", MyString.getMemInfo(1024*1024*1024+1));
		assertEquals("1.00 GB", MyString.getMemInfo(1024*1024*1024*1024));
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
		String info = MyString.getSystemInfo("1.4.5");
		assertTrue(info.contains("QuickServer v1.4.5 is being used."));
		assertTrue(info.contains("Java VM v"));
		assertTrue(info.contains(" is being used."));
		assertTrue(info.contains("Operating System: "));
		assertTrue(info.contains("Current working directory: "));
		assertTrue(info.contains("Class/s loaded from: "));
		assertTrue(info.contains("Total memory currently available: "));
		assertTrue(info.contains("Memory currently in use: "));
		assertTrue(info.contains("Maximum memory available: "));
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
		assertEquals("    ", MyString.alignRight("", 4));
		assertEquals("    ", MyString.alignRight(" ", 4));
		assertEquals("    ", MyString.alignRight("  ", 4));
		assertEquals("    ", MyString.alignRight("   ", 4));
		assertEquals("    ", MyString.alignRight("    ", 4));
		assertEquals("    ", MyString.alignRight("     ", 4));
		assertEquals("    ", MyString.alignRight("      ", 4));
		assertEquals("    ", MyString.alignRight("       ", 4));
		assertEquals("    ", MyString.alignRight("        ", 4));
		assertEquals("    ", MyString.alignRight("         ", 4));
		assertEquals("    ", MyString.alignRight("          ", 4));
		assertEquals("    ", MyString.alignRight("           ", 4));
		assertEquals("    ", MyString.alignRight("            ", 4));
		assertEquals("    ", MyString.alignRight("             ", 4));
		assertEquals("    ", MyString.alignRight("              ", 4));
		assertEquals("    ", MyString.alignRight("               ", 4));
		assertEquals("    ", MyString.alignRight("                ", 4));
		assertEquals("    ", MyString.alignRight("                 ", 4));
		assertEquals("    ", MyString.alignRight("                  ", 4));
		assertEquals("    ", MyString.alignRight("                   ", 4));
		assertEquals("    ", MyString.alignRight("                    ", 4));
		assertEquals("    ", MyString.alignRight("                     ", 4));
		assertEquals("    ", MyString.alignRight("                      ", 4));
		assertEquals("    ", MyString.alignRight("                       ", 4));
		assertEquals("    ", MyString.alignRight("                        ", 4));
		assertEquals("    ", MyString.alignRight("                         ", 4));
		assertEquals("    ", MyString.alignRight("                          ", 4));
		assertEquals("    ", MyString.alignRight("                           ", 4));
		assertEquals("    ", MyString.alignRight("                            ", 4));
		assertEquals("    ", MyString.alignRight("                             ", 4));
		assertEquals("    ", MyString.alignRight("                              ", 4));
		assertEquals("    ", MyString.alignRight("                               ", 4));
		assertEquals("    ", MyString.alignRight("                                ", 4));
		assertEquals("    ", MyString.alignRight("                                 ", 4));
		assertEquals("    ", MyString.alignRight("                                  ", 4));
		assertEquals("    ", MyString.alignRight("                                   ", 4));
		assertEquals("    ", MyString.alignRight("                                    ", 4));
		assertEquals("    ", MyString.alignRight("                                     ", 4));
		assertEquals("    ", MyString.alignRight("                                      ", 4));
		assertEquals("    ", MyString.alignRight("                                       ", 4));
		assertEquals("    ", MyString.alignRight("                                        ", 4));
		assertEquals("    ", MyString.alignRight("                                         ", 4));
		assertEquals("    ", MyString.alignRight("                                          ", 4));
		assertEquals("    ", MyString.alignRight("                                           ", 4));
		assertEquals("    ", MyString.alignRight("                                            ", 4));
		assertEquals("    ", MyString.alignRight("                                             ", 4));
		assertEquals("    ", MyString.alignRight("                                              ", 4));
		assertEquals("    ", MyString.alignRight("                                               ", 4));
		assertEquals("    ", MyString.alignRight("                                                ", 4));
		assertEquals("    ", MyString.alignRight("                                                 ", 4));
		assertEquals("    ", MyString.alignRight("                                                  ", 4));
		assertEquals("    ", MyString.alignRight("                                                   ", 4));
		assertEquals("    ", MyString.alignRight("                                                    ", 4));
		assertEquals("    ", MyString.alignRight("                                                     ", 4));
		assertEquals("    ", MyString.alignRight("                                                      ", 4));
		assertEquals("    ", MyString.alignRight("                                                       ", 4));
		assertEquals("    ", MyString.alignRight("                                                        ", 4));
		assertEquals("    ", MyString.alignRight("                                                         ", 4));
		assertEquals("    ", MyString.alignRight("                                                          ", 4));
		assertEquals("    ", MyString.alignRight("                                                           ", 4));
		assertEquals("    ", MyString.alignRight("                                                            ", 4));
		assertEquals("    ", MyString.alignRight("                                                             ", 4));
		assertEquals("    ", MyString.alignRight("                                                              ", 4));
		assertEquals("    ", MyString.alignRight("                                                               ", 4));
		assertEquals("    ", MyString.alignRight("                                                                ", 4));
		assertEquals("    ", My