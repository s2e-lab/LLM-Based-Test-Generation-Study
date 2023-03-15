// SimpleCharStream_3Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#GetSuffix(int)} method.
*/
class SimpleCharStream_3Test {

	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is empty.
	*/
	@Test
	void testGetSuffix_1() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 4096);
		char[] expected = new char[0];
		char[] actual = stream.GetSuffix(0);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is not empty.
	*/
	@Test
	void testGetSuffix_2() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 4096);
		char[] expected = new char[] {'a', 'b', 'c'};
		char[] actual = stream.GetSuffix(3);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is not empty.
	*/
	@Test
	void testGetSuffix_3() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 4096);
		char[] expected = new char[] {'a', 'b', 'c'};
		char[] actual = stream.GetSuffix(4);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is not empty.
	*/
	@Test
	void testGetSuffix_4() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 4096);
		char[] expected = new char[] {'a', 'b', 'c'};
		char[] actual = stream.GetSuffix(5);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is not empty.
	*/
	@Test
	void testGetSuffix_5() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 4096);
		char[] expected = new char[] {'a', 'b', 'c'};
		char[] actual = stream.GetSuffix(6);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is not empty.
	*/
	@Test
	void testGetSuffix_6() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 4096);
		char[] expected = new char[] {'a', 'b', 'c'};
		char[] actual = stream.GetSuffix(7);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is not empty.
	*/
	@Test
	void testGetSuffix_7() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 4096);
		char[] expected = new char[] {'a', 'b', 'c'};
		char[] actual = stream.GetSuffix(8);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is not empty.
	*/
	@Test
	void testGetSuffix_8() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 4096);
		char[] expected = new char[] {'a', 'b', 'c'};
		char[] actual = stream.GetSuffix(9);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is not empty.
	*/
	@Test
	void testGetSuffix_9() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 4096);
		char[] expected = new char[] {'a', 'b', 'c'};
		char[] actual = stream.GetSuffix(10);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is not empty.
	*/
	@Test
	void testGetSuffix_10() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 4096);
		char[] expected = new char[] {'a', 'b', 'c'};
		char[] actual = stream.GetSuffix(11);
		assertArrayEquals(expected, actual);
	}
}
/* JavaCC - OriginalChecksum=d9128cf5d82a12eb06ed3b6fa19acc59 (do not edit this line) */

// SimpleCharStream_4Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#GetSuffix(int)} method.
*/
class SimpleCharStream_4Test {
		
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is empty.
	*/
	@Test
	void testGetSuffix_1() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 4096);
		char[] expected = new char[0];
		char[] actual = stream.GetSuffix(0);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is not empty.
	*/
	@Test
	void testGetSuffix_2() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 4096);
		char[] expected = new char[] {'a', 'b', 'c'};
		char[] actual = stream.GetSuffix(3);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* Test case for the case when the buffer is not empty.
	*/
	@Test
	void testGetSuffix_3() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 4096);
		char[] expected = new char[] {'a', 'b', 'c'};
		char[] actual = stream.GetSuffix(4);
		assertArrayEquals(expected, actual);
	}
	
	