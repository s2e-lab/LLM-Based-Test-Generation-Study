// TextFile_1Test.java
package org.quickserver.util;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextFile}.
* It contains ten unit test cases for the {@link TextFile#read(File)} method.
*/
class TextFile_1Test {

	@Test
	void testRead_1() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_1Test.txt");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_2() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_1Test.txt");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_3() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_1Test.txt");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_4() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_1Test.txt");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_5() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_1Test.txt");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_6() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_1Test.txt");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_7() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_1Test.txt");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_8() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_1Test.txt");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_9() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_1Test.txt");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_10() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_1Test.txt");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
}

// TextFile_2Test.java
package org.quickserver.util;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextFile}.
* It contains ten unit test cases for the {@link TextFile#read(String)} method.
*/
class TextFile_2Test {
		
	@Test
	void testRead_1() throws IOException {
		String text = TextFile.read("test/org/quickserver/util/TextFile_2Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_2() throws IOException {
		String text = TextFile.read("test/org/quickserver/util/TextFile_2Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_3() throws IOException {
		String text = TextFile.read("test/org/quickserver/util/TextFile_2Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_4() throws IOException {
		String text = TextFile.read("test/org/quickserver/util/TextFile_2Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_5() throws IOException {
		String text = TextFile.read("test/org/quickserver/util/TextFile_2Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_6() throws IOException {
		String text = TextFile.read("test/org/quickserver/util/TextFile_2Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_7() throws IOException {
		String text = TextFile.read("test/org/quickserver/util/TextFile_2Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_8() throws IOException {
		String text = TextFile.read("test/org/quickserver/util/TextFile_2Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_9() throws IOException {
		String text = TextFile.read("test/org/quickserver/util/TextFile_2Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testRead_10() throws IOException {
		String text = TextFile.read("test/org/quickserver/util/TextFile_2Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
}

// TextFile_3Test.java
package org.quickserver.util;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextFile}.
* It contains ten unit test cases for the {@link TextFile#write(File, String)} method.
*/
class TextFile_3Test {
		
	@Test
	void testWrite_1() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_3Test.txt");
		TextFile.write(file, "This is a test file.\n");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_2() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_3Test.txt");
		TextFile.write(file, "This is a test file.\n");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_3() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_3Test.txt");
		TextFile.write(file, "This is a test file.\n");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_4() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_3Test.txt");
		TextFile.write(file, "This is a test file.\n");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_5() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_3Test.txt");
		TextFile.write(file, "This is a test file.\n");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_6() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_3Test.txt");
		TextFile.write(file, "This is a test file.\n");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_7() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_3Test.txt");
		TextFile.write(file, "This is a test file.\n");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_8() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_3Test.txt");
		TextFile.write(file, "This is a test file.\n");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_9() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_3Test.txt");
		TextFile.write(file, "This is a test file.\n");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_10() throws IOException {
		File file = new File("test/org/quickserver/util/TextFile_3Test.txt");
		TextFile.write(file, "This is a test file.\n");
		String text = TextFile.read(file);
		assertEquals("This is a test file.\n", text);
	}
	
}

// TextFile_4Test.java
package org.quickserver.util;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextFile}.
* It contains ten unit test cases for the {@link TextFile#write(String, String)} method.
*/
class TextFile_4Test {
		
	@Test
	void testWrite_1() throws IOException {
		TextFile.write("test/org/quickserver/util/TextFile_4Test.txt", "This is a test file.\n");
		String text = TextFile.read("test/org/quickserver/util/TextFile_4Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_2() throws IOException {
		TextFile.write("test/org/quickserver/util/TextFile_4Test.txt", "This is a test file.\n");
		String text = TextFile.read("test/org/quickserver/util/TextFile_4Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_3() throws IOException {
		TextFile.write("test/org/quickserver/util/TextFile_4Test.txt", "This is a test file.\n");
		String text = TextFile.read("test/org/quickserver/util/TextFile_4Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_4() throws IOException {
		TextFile.write("test/org/quickserver/util/TextFile_4Test.txt", "This is a test file.\n");
		String text = TextFile.read("test/org/quickserver/util/TextFile_4Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_5() throws IOException {
		TextFile.write("test/org/quickserver/util/TextFile_4Test.txt", "This is a test file.\n");
		String text = TextFile.read("test/org/quickserver/util/TextFile_4Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_6() throws IOException {
		TextFile.write("test/org/quickserver/util/TextFile_4Test.txt", "This is a test file.\n");
		String text = TextFile.read("test/org/quickserver/util/TextFile_4Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_7() throws IOException {
		TextFile.write("test/org/quickserver/util/TextFile_4Test.txt", "This is a test file.\n");
		String text = TextFile.read("test/org/quickserver/util/TextFile_4Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_8() throws IOException {
		TextFile.write("test/org/quickserver/util/TextFile_4Test.txt", "This is a test file.\n");
		String text = TextFile.read("test/org/quickserver/util/TextFile_4Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_9() throws IOException {
		TextFile.write("test/org/quickserver/util/TextFile_4Test.txt", "This is a test file.\n");
		String text = TextFile.read("test/org/quickserver/util/TextFile_4Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
	@Test
	void testWrite_10() throws IOException {
		TextFile.write("test/org/quickserver/util/TextFile_4Test.txt", "This is a test file.\n");
		String text = TextFile.read("test/org/quickserver/util/TextFile_4Test.txt");
		assertEquals("This is a test file.\n", text);
	}
	
}

// TextFile_5Test.java
package org.quickserver.util;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextFile}.
* It contains ten unit test cases for the {@link TextFile#read(String, Object)} method.
*/
class TextFile_5Test {
		
	@Test
	void testRead_1() throws IOException {
		String text =