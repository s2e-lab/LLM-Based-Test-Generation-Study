// ByteVector_1Test.java
package org.objectweb.asm.jip;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteVector}.
* It contains ten unit test cases for the {@link ByteVector#putShort(int)} method.
*/
class ByteVector_1Test {

	/**
	 * Test case for {@link ByteVector#putShort(int)}
	 * Assertion: put a short into this byte vector.
	 */
	@Test
	void testPutShort_1() {
		ByteVector bv = new ByteVector();
		bv.putShort(0);
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
	}
	
	/**
	 * Test case for {@link ByteVector#putShort(int)}
	 * Assertion: put a short into this byte vector.
	 */
	@Test
	void testPutShort_2() {
		ByteVector bv = new ByteVector();
		bv.putShort(1);
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(1, bv.data[1]);
	}
	
	/**
	 * Test case for {@link ByteVector#putShort(int)}
	 * Assertion: put a short into this byte vector.
	 */
	@Test
	void testPutShort_3() {
		ByteVector bv = new ByteVector();
		bv.putShort(2);
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(2, bv.data[1]);
	}
	
	/**
	 * Test case for {@link ByteVector#putShort(int)}
	 * Assertion: put a short into this byte vector.
	 */
	@Test
	void testPutShort_4() {
		ByteVector bv = new ByteVector();
		bv.putShort(3);
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(3, bv.data[1]);
	}
	
	/**
	 * Test case for {@link ByteVector#putShort(int)}
	 * Assertion: put a short into this byte vector.
	 */
	@Test
	void testPutShort_5() {
		ByteVector bv = new ByteVector();
		bv.putShort(4);
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(4, bv.data[1]);
	}
	
	/**
	 * Test case for {@link ByteVector#putShort(int)}
	 * Assertion: put a short into this byte vector.
	 */
	@Test
	void testPutShort_6() {
		ByteVector bv = new ByteVector();
		bv.putShort(5);
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(5, bv.data[1]);
	}
	
	/**
	 * Test case for {@link ByteVector#putShort(int)}
	 * Assertion: put a short into this byte vector.
	 */
	@Test
	void testPutShort_7() {
		ByteVector bv = new ByteVector();
		bv.putShort(6);
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(6, bv.data[1]);
	}
	
	/**
	 * Test case for {@link ByteVector#putShort(int)}
	 * Assertion: put a short into this byte vector.
	 */
	@Test
	void testPutShort_8() {
		ByteVector bv = new ByteVector();
		bv.putShort(7);
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(7, bv.data[1]);
	}
	
	/**
	 * Test case for {@link ByteVector#putShort(int)}
	 * Assertion: put a short into this byte vector.
	 */
	@Test
	void testPutShort_9() {
		ByteVector bv = new ByteVector();
		bv.putShort(8);
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(8, bv.data[1]);
	}
	
	/**
	 * Test case for {@link ByteVector#putShort(int)}
	 * Assertion: put a short into this byte vector.
	 */
	@Test
	void testPutShort_10() {
		ByteVector bv = new ByteVector();
		bv.putShort(9);
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(9, bv.data[1]);
	}
}

// ByteVector_2Test.java
package org.objectweb.asm.jip;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteVector}.
* It contains ten unit test cases for the {@link ByteVector#putInt(int)} method.
*/
class ByteVector_2Test {
		
	/**
	 * Test case for {@link ByteVector#putInt(int)}
	 * Assertion: put an int into this byte vector.
	 */
	@Test
	void testPutInt_1() {
		ByteVector bv = new ByteVector();
		bv.putInt(0);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}
	 * Assertion: put an int into this byte vector.
	 */
	@Test
	void testPutInt_2() {
		ByteVector bv = new ByteVector();
		bv.putInt(1);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(1, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}
	 * Assertion: put an int into this byte vector.
	 */
	@Test
	void testPutInt_3() {
		ByteVector bv = new ByteVector();
		bv.putInt(2);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(2, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}
	 * Assertion: put an int into this byte vector.
	 */
	@Test
	void testPutInt_4() {
		ByteVector bv = new ByteVector();
		bv.putInt(3);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(3, bv.data[3]);
	}
	
	/**