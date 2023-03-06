// JavaCharStreamTest2.java
package com.soops.CEN4010.JMCA.JParser;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaCharStream}.
* It contains ten unit test cases for the {@link JavaCharStream#GetImage()} method.
*/
class JavaCharStreamTest2 {

	/**
	* Test case for {@link JavaCharStream#GetImage()} method.
	* It tests the method with a string of length 1.
	*/
	@Test
	void testGetImage1() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("a"), 1, 1, 1);
		jcs.BeginToken();
		assertEquals("a", jcs.GetImage());
	}
	
	/**
	* Test case for {@link JavaCharStream#GetImage()} method.
	* It tests the method with a string of length 2.
	*/
	@Test
	void testGetImage2() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("ab"), 1, 1, 2);
		jcs.BeginToken();
		jcs.readChar();
		assertEquals("ab", jcs.GetImage());
	}
	
	/**
	* Test case for {@link JavaCharStream#GetImage()} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testGetImage3() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abc"), 1, 1, 3);
		jcs.BeginToken();
		jcs.readChar();
		jcs.readChar();
		assertEquals("abc", jcs.GetImage());
	}
	
	/**
	* Test case for {@link JavaCharStream#GetImage()} method.
	* It tests the method with a string of length 4.
	*/
	@Test
	void testGetImage4() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abcd"), 1, 1, 4);
		jcs.BeginToken();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		assertEquals("abcd", jcs.GetImage());
	}
	
	/**
	* Test case for {@link JavaCharStream#GetImage()} method.
	* It tests the method with a string of length 5.
	*/
	@Test
	void testGetImage5() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abcde"), 1, 1, 5);
		jcs.BeginToken();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		assertEquals("abcde", jcs.GetImage());
	}
	
	/**
	* Test case for {@link JavaCharStream#GetImage()} method.
	* It tests the method with a string of length 6.
	*/
	@Test
	void testGetImage6() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abcdef"), 1, 1, 6);
		jcs.BeginToken();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		assertEquals("abcdef", jcs.GetImage());
	}
	
	/**
	* Test case for {@link JavaCharStream#GetImage()} method.
	* It tests the method with a string of length 7.
	*/
	@Test
	void testGetImage7() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abcdefg"), 1, 1, 7);
		jcs.BeginToken();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		assertEquals("abcdefg", jcs.GetImage());
	}
	
	/**
	* Test case for {@link JavaCharStream#GetImage()} method.
	* It tests the method with a string of length 8.
	*/
	@Test
	void testGetImage8() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abcdefgh"), 1, 1, 8);
		jcs.BeginToken();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		assertEquals("abcdefgh", jcs.GetImage());
	}
	
	/**
	* Test case for {@link JavaCharStream#GetImage()} method.
	* It tests the method with a string of length 9.
	*/
	@Test
	void testGetImage9() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abcdefghi"), 1, 1, 9);
		jcs.BeginToken();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		jcs.readChar();
		assertEquals("abcdefghi", jcs.GetImage());
	}
	
	/**
	* Test case for {@link JavaCharStream#GetImage()} method.
	* It tests the method with a string of length 10.
	*/
	@Test
	void testGetImage10() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abcdefghij"), 1, 1, 10);
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
		assertEquals("abcdefghij", jcs.GetImage());
	}
}

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
	* It tests the method with a string of length 1.
	*/
	@Test
	void testGetSuffix1() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("a"), 1, 1, 1);
		jcs.BeginToken();
		assertArrayEquals(new char[] {'a'}, jcs.GetSuffix(1));
	}
	
	/**
	* Test case for {@link JavaCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 2.
	*/
	@Test
	void testGetSuffix2() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("ab"), 1, 1, 2);
		jcs.BeginToken();
		jcs.readChar();
		assertArrayEquals(new char[] {'a', 'b'}, jcs.GetSuffix(2));
	}
	
	/**
	* Test case for {@link JavaCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testGetSuffix3() {
		JavaCharStream jcs = new JavaCharStream(new java.io.StringReader("abc"), 1, 1, 3);
		jcs.BeginToken();
		jcs.readChar();
		jcs.readChar();
		assertArrayEquals(new char[] {