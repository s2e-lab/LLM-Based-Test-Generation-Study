// JavaCharStreamTest1.java
package com.soops.CEN4010.JMCA.JParser;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaCharStream}.
* It contains ten unit test cases for the {@link JavaCharStream#readChar()} method.
*/
class JavaCharStreamTest1 {

	/**
	* Test case 1 for {@link JavaCharStream#readChar()}.
	* It tests the method with a simple string.
	*/
	@Test
	void testReadChar1() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("Hello World!"));
		assertEquals('H', jcs.readChar());
		assertEquals('e', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals('W', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals('r', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('d', jcs.readChar());
		assertEquals('!', jcs.readChar());
	}
	
	/**
	* Test case 2 for {@link JavaCharStream#readChar()}.
	* It tests the method with a string containing a backslash.
	*/
	@Test
	void testReadChar2() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("Hello \\ World!"));
		assertEquals('H', jcs.readChar());
		assertEquals('e', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals('\\', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals('W', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals('r', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('d', jcs.readChar());
		assertEquals('!', jcs.readChar());
	}
	
	/**
	* Test case 3 for {@link JavaCharStream#readChar()}.
	* It tests the method with a string containing a backslash followed by a 'u'.
	*/
	@Test
	void testReadChar3() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("Hello \\u World!"));
		assertEquals('H', jcs.readChar());
		assertEquals('e', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals('\\', jcs.readChar());
		assertEquals('u', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals('W', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals('r', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('d', jcs.readChar());
		assertEquals('!', jcs.readChar());
	}
	
	/**
	* Test case 4 for {@link JavaCharStream#readChar()}.
	* It tests the method with a string containing a backslash followed by a 'u' and a hexadecimal number.
	*/
	@Test
	void testReadChar4() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("Hello \\u0020 World!"));
		assertEquals('H', jcs.readChar());
		assertEquals('e', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals('W', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals('r', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('d', jcs.readChar());
		assertEquals('!', jcs.readChar());
	}
	
	/**
	* Test case 5 for {@link JavaCharStream#readChar()}.
	* It tests the method with a string containing a backslash followed by a 'u' and a hexadecimal number.
	*/
	@Test
	void testReadChar5() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("Hello \\u0020 World!"));
		assertEquals('H', jcs.readChar());
		assertEquals('e', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals('W', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals('r', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('d', jcs.readChar());
		assertEquals('!', jcs.readChar());
	}
	
	/**
	* Test case 6 for {@link JavaCharStream#readChar()}.
	* It tests the method with a string containing a backslash followed by a 'u' and a hexadecimal number.
	*/
	@Test
	void testReadChar6() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("Hello \\u0020 World!"));
		assertEquals('H', jcs.readChar());
		assertEquals('e', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals('W', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals('r', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('d', jcs.readChar());
		assertEquals('!', jcs.readChar());
	}
	
	/**
	* Test case 7 for {@link JavaCharStream#readChar()}.
	* It tests the method with a string containing a backslash followed by a 'u' and a hexadecimal number.
	*/
	@Test
	void testReadChar7() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("Hello \\u0020 World!"));
		assertEquals('H', jcs.readChar());
		assertEquals('e', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals(' ', jcs.readChar());
		assertEquals('W', jcs.readChar());
		assertEquals('o', jcs.readChar());
		assertEquals('r', jcs.readChar());
		assertEquals('l', jcs.readChar());
		assertEquals('d', jcs.readChar());
		assertEquals('!', jcs.readChar());
	}
	
	/**
	*