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
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(0)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_0() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(0);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(1)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_1() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(1);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(1, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(2)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_2() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(2);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(2, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(3)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_3() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(3);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(3, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(4)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_4() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(4);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(4, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(5)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_5() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(5);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(5, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(6)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_6() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(6);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(6, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(7)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_7() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(7);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(7, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(8)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_8() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(8);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(8, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(9)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_9() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(9);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(9, bv.data[3]);
	}
	
}

// ByteVector_3Test.java
package org.objectweb.asm.jip;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteVector}.
* It contains ten unit test cases for the {@link ByteVector#putInt(int)} method.
*/
class ByteVector_3Test {
		
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(10)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_0() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(10);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(10, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(11)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_1() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(11);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(11, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(12)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_2() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(12);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(12, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(13)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_3() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(13);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(13, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(14)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_4() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(14);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(14, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(15)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_5() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(15);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(15, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(16)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_6() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(16);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(16, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	 * This test case is for the method with the following parameters:
	 * <br>
	 * <code>putInt(17)</code>
	 * <br>
	 * <br>
	 * The expected result is that the byte vector is enlarged and the int is put into the byte vector.
	 */
	@Test
	void testPutInt_7() {
		ByteVector bv = new ByteVector(1);
		bv.putInt(17);
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(17, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putInt(int)}.
	