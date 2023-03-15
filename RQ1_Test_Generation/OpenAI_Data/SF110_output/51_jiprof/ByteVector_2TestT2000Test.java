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
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with a positive integer.
	 */
	@Test
	void testPutInt_1() {
		ByteVector bv = new ByteVector();
		bv.putInt(1);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(1, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with a negative integer.
	 */
	@Test
	void testPutInt_2() {
		ByteVector bv = new ByteVector();
		bv.putInt(-1);
		assertEquals(4, bv.length);
		assertEquals(-1, bv.data[0]);
		assertEquals(-1, bv.data[1]);
		assertEquals(-1, bv.data[2]);
		assertEquals(-1, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with a positive integer.
	 */
	@Test
	void testPutInt_3() {
		ByteVector bv = new ByteVector();
		bv.putInt(2147483647);
		assertEquals(4, bv.length);
		assertEquals(127, bv.data[0]);
		assertEquals(-1, bv.data[1]);
		assertEquals(-1, bv.data[2]);
		assertEquals(-1, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with a negative integer.
	 */
	@Test
	void testPutInt_4() {
		ByteVector bv = new ByteVector();
		bv.putInt(-2147483648);
		assertEquals(4, bv.length);
		assertEquals(-128, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with a positive integer.
	 */
	@Test
	void testPutInt_5() {
		ByteVector bv = new ByteVector();
		bv.putInt(2147483646);
		assertEquals(4, bv.length);
		assertEquals(126, bv.data[0]);
		assertEquals(-1, bv.data[1]);
		assertEquals(-1, bv.data[2]);
		assertEquals(-1, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with a negative integer.
	 */
	@Test
	void testPutInt_6() {
		ByteVector bv = new ByteVector();
		bv.putInt(-2147483647);
		assertEquals(4, bv.length);
		assertEquals(-127, bv.data[0]);
		assertEquals(-1, bv.data[1]);
		assertEquals(-1, bv.data[2]);
		assertEquals(-1, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with a positive integer.
	 */
	@Test
	void testPutInt_7() {
		ByteVector bv = new ByteVector();
		bv.putInt(2147483645);
		assertEquals(4, bv.length);
		assertEquals(125, bv.data[0]);
		assertEquals(-1, bv.data[1]);
		assertEquals(-1, bv.data[2]);
		assertEquals(-1, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with a negative integer.
	 */
	@Test
	void testPutInt_8() {
		ByteVector bv = new ByteVector();
		bv.putInt(-2147483646);
		assertEquals(4, bv.length);
		assertEquals(-126, bv.data[0]);
		assertEquals(-1, bv.data[1]);
		assertEquals(-1, bv.data[2]);
		assertEquals(-1, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with a positive integer.
	 */
	@Test
	void testPutInt_9() {
		ByteVector bv = new ByteVector();
		bv.putInt(2147483644);
		assertEquals(4, bv.length);
		assertEquals(124, bv.data[0]);
		assertEquals(-1, bv.data[1]);
		assertEquals(-1, bv.data[2]);
		assertEquals(-1, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with a negative integer.
	 */
	@Test
	void testPutInt_10() {
		ByteVector bv = new ByteVector();
		bv.putInt(-2147483645);
		assertEquals(4, bv.length);
		assertEquals(-125, bv.data[0]);
		assertEquals(-1, bv.data[1]);
		assertEquals(-1, bv.data[2]);
		assertEquals(-1, bv.data[3]);
	}
}

// ByteVector_3Test.java
package org.objectweb.asm.jip;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteVector}.
* It contains ten unit test cases for the {@link ByteVector#putLong(long)} method.
*/
class ByteVector_3Test {
		
	/**
	 * Test case for {@link ByteVector#putLong(long)}.
	 * This test case is for the method with a positive long.
	 */
	@Test
	void testPutLong_1() {
		ByteVector bv = new ByteVector();
		bv.putLong(1);
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(1, bv.data[7]);
	}
	
	/**
	 * Test case for {@link ByteVector#putLong(long)}.
	 * This test case is for the method with a negative long.
	 */
	@Test
	void testPutLong_