// JavaCharStreamTest3.java
package com.soops.CEN4010.JMCA.JParser;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaCharStream}.
* It contains ten unit test cases for the {@link JavaCharStream#GetSuffix(int)} method.
*/
class JavaCharStreamTest3 {

	/**
	* Test case for {@link JavaCharStream#GetSuffix(int)} method.
	* It tests the case when the length of the suffix is greater than the length of the buffer.
	*/
	@Test
	void testGetSuffix1() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abcdefghijklmnopqrstuvwxyz"), 1, 1, 10);
		char[] expected = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char[] actual = jcs.GetSuffix(26);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JavaCharStream#GetSuffix(int)} method.
	* It tests the case when the length of the suffix is less than the length of the buffer.
	*/
	@Test
	void testGetSuffix2() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abcdefghijklmnopqrstuvwxyz"), 1, 1, 10);
		char[] expected = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		char[] actual = jcs.GetSuffix(10);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JavaCharStream#GetSuffix(int)} method.
	* It tests the case when the length of the suffix is equal to the length of the buffer.
	*/
	@Test
	void testGetSuffix3() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abcdefghijklmnopqrstuvwxyz"), 1, 1, 10);
		char[] expected = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		char[] actual = jcs.GetSuffix(10);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JavaCharStream#GetSuffix(int)} method.
	* It tests the case when the length of the suffix is greater than the length of the buffer and the buffer is full.
	*/
	@Test
	void testGetSuffix4() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abcdefghijklmnopqrstuvwxyz"), 1, 1, 10);
		jcs.BeginToken();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		