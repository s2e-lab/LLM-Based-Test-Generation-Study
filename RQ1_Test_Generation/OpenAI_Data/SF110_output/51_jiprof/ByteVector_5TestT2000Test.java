// ByteVector_5Test.java
package org.objectweb.asm.jip;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteVector}.
* It contains ten unit test cases for the {@link ByteVector#putByteArray(byte[], int, int)} method.
*/
class ByteVector_5Test {

	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array.
	 */
	@Test
	void testPutByteArray_1() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, 0, 0);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset.
	 */
	@Test
	void testPutByteArray_2() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, 0);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative length.
	 */
	@Test
	void testPutByteArray_3() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, 0, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_4() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_5() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_6() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_7() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_8() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_9() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_10() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, -1);
		assertEquals(0, bv.length);
	}
}

// ByteVector_6Test.java
package org.objectweb.asm.jip;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteVector}.
* It contains ten unit test cases for the {@link ByteVector#putByteArray(byte[], int, int)} method.
*/
class ByteVector_6Test {
		
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array.
	 */
	@Test
	void testPutByteArray_1() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, 0, 0);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset.
	 */
	@Test
	void testPutByteArray_2() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, 0);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative length.
	 */
	@Test
	void testPutByteArray_3() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, 0, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_4() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_5() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_6() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_7() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(null, -1, -1);
		assertEquals(0, bv.length);
	}
	
	/**
	 * Test case for {@link ByteVector#putByteArray(byte[], int, int)}
	 * with a null byte array and a negative offset and length.
	 */
	@Test
	void testPutByteArray_8() {
		ByteVector bv = new ByteVector();
		bv.putByteArray(