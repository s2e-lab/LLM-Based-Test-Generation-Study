// Packer_11Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpackf(byte[])} method.
*/
class Packer_11Test {

	/**
	* Test case 1 for {@link Packer#unpackf(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackf_1() {
		byte[] b = {0x00, 0x00, 0x00, 0x00};
		float f = Packer.unpackf(b);
		assertEquals(0.0f, f);
	}
	
	/**
	* Test case 2 for {@link Packer#unpackf(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackf_2() {
		byte[] b = {(byte) 0x80, 0x00, 0x00, 0x00};
		float f = Packer.unpackf(b);
		assertEquals(-0.0f, f);
	}
	
	/**
	* Test case 3 for {@link Packer#unpackf(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackf_3() {
		byte[] b = {(byte) 0x7f, (byte) 0x80, 0x00, 0x00};
		float f = Packer.unpackf(b);
		assertEquals(Float.POSITIVE_INFINITY, f);
	}
	
	/**
	* Test case 4 for {@link Packer#unpackf(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackf_4() {
		byte[] b = {(byte) 0xff, (byte) 0x80, 0x00, 0x00};
		float f = Packer.unpackf(b);
		assertEquals(Float.NEGATIVE_INFINITY, f);
	}
	
	/**
	* Test case 5 for {@link Packer#unpackf(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackf_5() {
		byte[] b = {(byte) 0xff, (byte) 0x7f, (byte) 0xff, (byte) 0xff};
		float f = Packer.unpackf(b);
		assertEquals(Float.NaN, f);
	}
	
	/**
	* Test case 6 for {@link Packer#unpackf(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackf_6() {
		byte[] b = {(byte) 0x7f, (byte) 0x7f, (byte) 0xff, (byte) 0xff};
		float f = Packer.unpackf(b);
		assertEquals(Float.NaN, f);
	}
	
	/**
	* Test case 7 for {@link Packer#unpackf(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackf_7() {
		byte[] b = {(byte) 0x7f, (byte) 0x7f, (byte) 0xff, (byte) 0xfe};
		float f = Packer.unpackf(b);
		assertEquals(Float.NaN, f);
	}
	
	/**
	* Test case 8 for {@link Packer#unpackf(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackf_8() {
		byte[] b = {(byte) 0x7f, (byte) 0x7f, (byte) 0xff, (byte) 0xfd};
		float f = Packer.unpackf(b);
		assertEquals(Float.NaN, f);
	}
	
	/**
	* Test case 9 for {@link Packer#unpackf(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackf_9() {
		byte[] b = {(byte) 0x7f, (byte) 0x7f, (byte) 0xff, (byte) 0xfc};
		float f = Packer.unpackf(b);
		assertEquals(Float.NaN, f);
	}
	
	/**
	* Test case 10 for {@link Packer#unpackf(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackf_10() {
		byte[] b = {(byte) 0x7f, (byte) 0x7f, (byte) 0xff, (byte) 0xfb};
		float f = Packer.unpackf(b);
		assertEquals(Float.NaN, f);
	}
	
}

// Packer_12Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpackd(byte[])} method.
*/
class Packer_12Test {
		
	/**
	* Test case 1 for {@link Packer#unpackd(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackd_1() {
		byte[] b = {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
		double d = Packer.unpackd(b);
		assertEquals(0.0, d);
	}
	
	/**
	* Test case 2 for {@link Packer#unpackd(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackd_2() {
		byte[] b = {(byte) 0x80, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
		double d = Packer.unpackd(b);
		assertEquals(-0.0, d);
	}
	
	/**
	* Test case 3 for {@link Packer#unpackd(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackd_3() {
		byte[] b = {(byte) 0x7f, (byte) 0xf0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
		double d = Packer.unpackd(b);
		assertEquals(Double.POSITIVE_INFINITY, d);
	}
	
	/**
	* Test case 4 for {@link Packer#unpackd(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackd_4() {
		byte[] b = {(byte) 0xff, (byte) 0xf0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
		double d = Packer.unpackd(b);
		assertEquals(Double.NEGATIVE_INFINITY, d);
	}
	
	/**
	* Test case 5 for {@link Packer#unpackd(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackd_5() {
		byte[] b = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
		double d = Packer.unpackd(b);
		assertEquals(Double.NaN, d);
	}
	
	/**
	* Test case 6 for {@link Packer#unpackd(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUn