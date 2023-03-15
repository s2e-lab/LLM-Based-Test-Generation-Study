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
		
		result = MyString.alignLeft("", 10);
		assertNotNull(result);
		assertEquals("          ", result);
		
		result = MyString.alignLeft("", 11);
		assertNotNull(result);
		assertEquals("           ", result);
		
		result = MyString.alignLeft("", 12);
		assertNotNull(result);
		assertEquals("            ", result);
		
		result = MyString.alignLeft("", 13);
		assertNotNull(result);
		assertEquals("             ", result);
		
		result = MyString.alignLeft("", 14);
		assertNotNull(result);
		assertEquals("              ", result);
		
		result = MyString.alignLeft("", 15);
		assertNotNull(result);
		assertEquals("               ", result);
		
		result = MyString.alignLeft("", 16);
		assertNotNull(result);
		assertEquals("                ", result);
		
		result = MyString.alignLeft("", 17);
		assertNotNull(result);
		assertEquals("                 ", result);
		
		result = MyString.alignLeft("", 18);
		assertNotNull(result);
		assertEquals("                  ", result);
		
		result = MyString.alignLeft("", 19);
		assertNotNull(result);
		assertEquals("                   ", result);
		
		result = MyString.alignLeft("", 20);
		assertNotNull(result);
		assertEquals("                    ", result);
		
		result = MyString.alignLeft("", 21);
		assertNotNull(result);
		assertEquals("                     ", result);
		
		result = MyString.alignLeft("", 22);
		assertNotNull(result);
		assertEquals("                      ", result);
		
		result = MyString.alignLeft("", 23);
		assertNotNull(result);
		assertEquals("                       ", result);
		
		result = MyString.alignLeft("", 24);
		assertNotNull(result);
		assertEquals("                        ", result);
		
		result = MyString.alignLeft("", 25);
		assertNotNull(result);
		assertEquals("                         ", result);
		
		result = MyString.alignLeft("", 26);
		assertNotNull(result);
		assertEquals("                          ", result);
		
		result = MyString.alignLeft("", 27);
		assertNotNull(result);
		assertEquals("                           ", result);
		
		result = MyString.alignLeft("", 28);
		assertNotNull(result);
		assertEquals("                            ", result);
		
		result = MyString.alignLeft("", 29);
		assertNotNull(result);
		assertEquals("                             ", result);
		
		result = MyString.alignLeft("", 30);
		assert