// ByteVector_3Test.java
package org.objectweb.asm.jip;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteVector}.
* It contains ten unit test cases for the {@link ByteVector#putLong(long)} method.
*/
class ByteVector_3Test {

	@Test
	void testPutLong_1() {
		ByteVector bv = new ByteVector();
		bv.putLong(0);
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(0, bv.data[7]);
	}
	
	@Test
	void testPutLong_2() {
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
	
	@Test
	void testPutLong_3() {
		ByteVector bv = new ByteVector();
		bv.putLong(2);
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(2, bv.data[7]);
	}
	
	@Test
	void testPutLong_4() {
		ByteVector bv = new ByteVector();
		bv.putLong(3);
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(3, bv.data[7]);
	}
	
	@Test
	void testPutLong_5() {
		ByteVector bv = new ByteVector();
		bv.putLong(4);
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(4, bv.data[7]);
	}
	
	@Test
	void testPutLong_6() {
		ByteVector bv = new ByteVector();
		bv.putLong(5);
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(5, bv.data[7]);
	}
	
	@Test
	void testPutLong_7() {
		ByteVector bv = new ByteVector();
		bv.putLong(6);
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(6, bv.data[7]);
	}
	
	@Test
	void testPutLong_8() {
		ByteVector bv = new ByteVector();
		bv.putLong(7);
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(7, bv.data[7]);
	}
	
	@Test
	void testPutLong_9() {
		ByteVector bv = new ByteVector();
		bv.putLong(8);
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(8, bv.data[7]);
	}
	
	@Test
	void testPutLong_10() {
		ByteVector bv = new ByteVector();
		bv.putLong(9);
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(9, bv.data[7]);
	}
}

// ByteVector_4Test.java
package org.objectweb.asm.jip;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteVector}.
* It contains ten unit test cases for the {@link ByteVector#putUTF8(String)} method.
*/
class ByteVector_4Test {
		
	@Test
	void testPutUTF8_1() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("");
		assertEquals(2, bv.length);
	