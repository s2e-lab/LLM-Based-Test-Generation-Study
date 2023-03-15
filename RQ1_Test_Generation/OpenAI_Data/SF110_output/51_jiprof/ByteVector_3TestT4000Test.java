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
	 * Test case for {@link ByteVector#putLong(long)}
	 * <p>
	 * Test if the method putLong(long) works properly.
	 * <p>
	 * The method should put the given long value into the byte vector.
	 * <p>
	 * The method should return the byte vector itself.
	 */
	@Test
	void testPutLong() {
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
		
		bv.putLong(1);
		assertEquals(16, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(0, bv.data[7]);
		assertEquals(0, bv.data[8]);
		assertEquals(0, bv.data[9]);
		assertEquals(0, bv.data[10]);
		assertEquals(0, bv.data[11]);
		assertEquals(0, bv.data[12]);
		assertEquals(0, bv.data[13]);
		assertEquals(0, bv.data[14]);
		assertEquals(1, bv.data[15]);
		
		bv.putLong(Long.MAX_VALUE);
		assertEquals(24, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(0, bv.data[7]);
		assertEquals(0, bv.data[8]);
		assertEquals(0, bv.data[9]);
		assertEquals(0, bv.data[10]);
		assertEquals(0, bv.data[11]);
		assertEquals(0, bv.data[12]);
		assertEquals(0, bv.data[13]);
		assertEquals(0, bv.data[14]);
		assertEquals(1, bv.data[15]);
		assertEquals(-1, bv.data[16]);
		assertEquals(-1, bv.data[17]);
		assertEquals(-1, bv.data[18]);
		assertEquals(-1, bv.data[19]);
		assertEquals(-1, bv.data[20]);
		assertEquals(-1, bv.data[21]);
		assertEquals(-1, bv.data[22]);
		assertEquals(-1, bv.data[23]);
		
		bv.putLong(Long.MIN_VALUE);
		assertEquals(32, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(0, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(0, bv.data[4]);
		assertEquals(0, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(0, bv.data[7]);
		assertEquals(0, bv.data[8]);
		assertEquals(0, bv.data[9]);
		assertEquals(0, bv.data[10]);
		assertEquals(0, bv.data[11]);
		assertEquals(0, bv.data[12]);
		assertEquals(0, bv.data[13]);
		assertEquals(0, bv.data[14]);
		assertEquals(1, bv.data[15]);
		assertEquals(-1, bv.data[16]);
		assertEquals(-1, bv.data[17]);
		assertEquals(-1, bv.data[18]);
		assertEquals(-1, bv.data[19]);
		assertEquals(-1, bv.data[20]);
		assertEquals(-1, bv.data[21]);
		assertEquals(-1, bv.data[22]);
		assertEquals(-1, bv.data[23]);
		assertEquals(0, bv.data[24]);
		assertEquals(0, bv.data[25]);
		assertEquals(0, bv.data[26]);
		assertEquals(0, bv.data[27]);
		assertEquals(0, bv.data[28]);
		assertEquals(0, bv.data[29]);
		assertEquals(0, bv.data[30]);
		assertEquals(0, bv.data[31]);
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
		
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test if the method putUTF8(String) works properly.
	 * <p>
	 * The method should put the given string into the byte vector.
	 * <p>
	 * The method should return the byte vector itself.
	 */
	@Test
	void testPutUTF8() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("");
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		
		bv.putUTF8("a");
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(0, bv.data[3]);
		
		bv.putUTF8("abc");
		assertEquals(7, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(98, bv.data[4]);
		assertEquals(99, bv.data[5]);
		assertEquals(0, bv.data[6]);
		
		bv.putUTF8("abcd");
		assertEquals(10, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(98, bv.data[4]);
		assertEquals(99, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(97, bv.data[7]);
		assertEquals(98, bv.data[8]);
		assertEquals(99, bv.data[9]);
		
		bv.putUTF8("abcde");
		assertEquals(13, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(98, bv.data[4]);
		assertEquals(99, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(97, bv.data[7]);
		assertEquals(98, bv.data[8]);
		assertEquals(99, bv.data[9]);
		assertEquals(97, bv.data[10]);
		assertEquals(98, bv.data[11]);
		assertEquals(101, bv.data[12]);
		
		bv.putUTF8("abcdef");
		assertEquals(16, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(98, bv.data[4]);
		assertEquals(99, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(97, bv.data[7]);
		assertEquals(98, bv.data[8]);
		assertEquals(99, bv.data[9]);
		assertEquals(97, bv.data[10]);
		assertEquals(98, bv.data[11]);
		assertEquals(101, bv.data[12]);
		assertEquals(97, bv.data[13]);
		assertEquals(98, bv.data[14]);
		assertEquals(102, bv.data[15]);
		
		bv.putUTF8("abcdefg");
		assertEquals(19, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(98, bv.data[4]);
		assertEquals(99, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(97, bv.data[7]);
		assertEquals(98, bv.data[8]);
		assertEquals(99, bv.data[9]);
		assertEquals(97, bv.data[10]);
		assertEquals(98, bv.data[11]);
		assertEquals(101, bv.data[12]);
		assertEquals(97, bv.data[13]);
		assertEquals(98, bv.data[14]);
		assertEquals(102, bv.data[15]);
		assertEquals(97, bv.data[16]);
		assertEquals(98, bv.data[17]);
		assertEquals(103, bv.data[18]);
		
		bv.putUTF8("abcdefgh");
		assertEquals(22, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(98, bv.data[4]);
		assertEquals(99, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(97, bv.data[7]);
		assertEquals(98, bv.data[8]);
		assertEquals(99, bv.data[9]);
		assertEquals(97, bv.data[10]);
		assertEquals(98, bv.data[11]);
		assertEquals(101, bv.data[12]);
		assertEquals(97, bv.data[13]);
		assertEquals(98, bv.data[14]);
		assertEquals(102, bv.data[15]);
		assertEquals(97, bv.data[16]);
		assertEquals(98, bv.data[17]);
		assertEquals(103, bv.data[18]);
		assertEquals(97, bv.data[19]);
		assertEquals(98, bv.data[20]);
		assertEquals(104, bv.data[21]);
		
		bv.putUTF8("abcdefghi");
		assertEquals(25, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(98, bv.data[4]);
		assertEquals(99, bv.data[5]);
		assertEquals(0, bv.data[6]);
		assertEquals(97, bv.data[7]);
		assertEquals(98, bv.data[8]);
		assertEquals(99, bv.data[9]);
		assertEquals(97, bv.data[10]);
		assertEquals(98, bv.data[11]);
		assertEquals(101, bv.data[12]);
		assertEquals(97, bv.data[13]);
		assertEquals(98, bv.data[14]);
		assertEquals(102, bv.data[15]);
		assertEquals(97, bv.data[16]);
		assertEquals(98, bv.data[17]);
		assertEquals(103, bv.data[18]);
		assertEquals(97, bv.data[19]);
		assertEquals(98, bv.data[20]);
		assertEquals(104, bv.data[21]);
		assertEquals(97, bv.data[22]);
		assertEquals(98, bv.data[23]);
		assertEquals(105, bv.data[24]);
		
		bv.putUTF8("abcdefghij");
		assertEquals(28, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(0, bv.data[3]);
		assertEquals(98, bv.data[4]);
		assertEquals(