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
			throw new Exception("Test Exception");
		} catch (Exception e) {
			String stackTrace = MyString.getStackTrace(e);
			assertTrue(stackTrace.contains("Test Exception"));
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
		String memInfo = MyString.getMemInfo(1024);
		assertEquals("1.00 KB", memInfo);
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
		String data = MyString.alignRight("test", 10);
		assertEquals("      test", data);
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
		String data = MyString.alignLeft("test", 10);
		assertEquals("test      ", data);
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
		String data = MyString.replaceAllNo("test", "*");
		assertEquals("****", data);
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
		String data = MyString.removeAllHtmlSpChar("&nbsp;&lt;&gt;&amp;&quot;");
		assertEquals(" <>&\"", data);
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
		String data = MyString.replaceAllTags("<a>test</a>", "*");
		assertEquals("*test*", data);
	}
}

// MyString_15Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#replaceTags(String, String)} method.
*/
class MyString_15Test {
		
	@Test
	void testReplaceTags() {
		String data = MyString.replaceTags("<a>test</a>", "*");
		assertEquals("*test*", data);
	}
}

// MyString_16Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#replaceCount(String, String)} method.
*/
class MyString_16Test {
		
	@Test
	void testReplaceCount() {
		int count = MyString.replaceCount("test", "t");
		assertEquals(2, count);
	}
}

// MyString_17Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#replaceAll(String, String, String)} method.
*/
class MyString_17Test {
		
	@Test
	void testReplaceAll() {
		String data = MyString.replaceAll("test", "t", "*");
		assertEquals("*es*", data);
	}
}

// MyString_18Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#replace(String, String, String)} method.
*/
class MyString_18Test {
		
	@Test
	void testReplace() {
		String data = MyString.replace("test", "t", "*");
		assertEquals("*es*", data);
	}
}

// MyString_19Test.java
package org.quickserver.util;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MyString}.
* It contains ten unit test cases for the {@link MyString#getStackTrace(Throwable)} method.