// ByteVector_4Test.java
package org.objectweb.asm.jip;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteVector}.
* It contains ten unit test cases for the {@link ByteVector#putUTF8(String)} method.
*/
class ByteVector_4Test {

	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 0.
	 */
	@Test
	void testPutUTF8_0() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("");
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 1.
	 */
	@Test
	void testPutUTF8_1() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("a");
		assertEquals(3, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(1, bv.data[1]);
		assertEquals(97, bv.data[2]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 2.
	 */
	@Test
	void testPutUTF8_2() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("ab");
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(2, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 3.
	 */
	@Test
	void testPutUTF8_3() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abc");
		assertEquals(5, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(3, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 4.
	 */
	@Test
	void testPutUTF8_4() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcd");
		assertEquals(6, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(4, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 5.
	 */
	@Test
	void testPutUTF8_5() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcde");
		assertEquals(7, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(5, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
		assertEquals(101, bv.data[6]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 6.
	 */
	@Test
	void testPutUTF8_6() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcdef");
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(6, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
		assertEquals(101, bv.data[6]);
		assertEquals(102, bv.data[7]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 7.
	 */
	@Test
	void testPutUTF8_7() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcdefg");
		assertEquals(9, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(7, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
		assertEquals(101, bv.data[6]);
		assertEquals(102, bv.data[7]);
		assertEquals(103, bv.data[8]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 8.
	 */
	@Test
	void testPutUTF8_8() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcdefgh");
		assertEquals(10, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(8, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
		assertEquals(101, bv.data[6]);
		assertEquals(102, bv.data[7]);
		assertEquals(103, bv.data[8]);
		assertEquals(104