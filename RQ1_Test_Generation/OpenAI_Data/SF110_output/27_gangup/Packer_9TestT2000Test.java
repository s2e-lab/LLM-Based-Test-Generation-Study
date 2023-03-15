// Packer_9Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#packf(float)} method.
*/
class Packer_9Test {

	/**
	* Test case 1 for {@link Packer#packf(float)}.
	* It tests the method with a positive float value.
	*/
	@Test
	void testPackf_1() {
		float f = 1.0f;
		byte[] b = Packer.packf(f);
		assertEquals(4, b.length);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(128, b[2]);
		assertEquals(63, b[3]);
	}
	
	/**
	* Test case 2 for {@link Packer#packf(float)}.
	* It tests the method with a negative float value.
	*/
	@Test
	void testPackf_2() {
		float f = -1.0f;
		byte[] b = Packer.packf(f);
		assertEquals(4, b.length);
		assertEquals(-1, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-128, b[2]);
		assertEquals(-64, b[3]);
	}
	
	/**
	* Test case 3 for {@link Packer#packf(float)}.
	* It tests the method with a positive float value.
	*/
	@Test
	void testPackf_3() {
		float f = 0.0f;
		byte[] b = Packer.packf(f);
		assertEquals(4, b.length);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
	}
	
	/**
	* Test case 4 for {@link Packer#packf(float)}.
	* It tests the method with a negative float value.
	*/
	@Test
	void testPackf_4() {
		float f = -0.0f;
		byte[] b = Packer.packf(f);
		assertEquals(4, b.length);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
	}
	
	/**
	* Test case 5 for {@link Packer#packf(float)}.
	* It tests the method with a positive float value.
	*/
	@Test
	void testPackf_5() {
		float f = Float.MAX_VALUE;
		byte[] b = Packer.packf(f);
		assertEquals(4, b.length);
		assertEquals(127, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(-1, b[3]);
	}
	
	/**
	* Test case 6 for {@link Packer#packf(float)}.
	* It tests the method with a negative float value.
	*/
	@Test
	void testPackf_6() {
		float f = Float.MIN_VALUE;
		byte[] b = Packer.packf(f);
		assertEquals(4, b.length);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(1, b[3]);
	}
	
	/**
	* Test case 7 for {@link Packer#packf(float)}.
	* It tests the method with a positive float value.
	*/
	@Test
	void testPackf_7() {
		float f = Float.POSITIVE_INFINITY;
		byte[] b = Packer.packf(f);
		assertEquals(4, b.length);
		assertEquals(127, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(-1, b[3]);
	}
	
	/**
	* Test case 8 for {@link Packer#packf(float)}.
	* It tests the method with a negative float value.
	*/
	@Test
	void testPackf_8() {
		float f = Float.NEGATIVE_INFINITY;
		byte[] b = Packer.packf(f);
		assertEquals(4, b.length);
		assertEquals(-1, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(-1, b[3]);
	}
	
	/**
	* Test case 9 for {@link Packer#packf(float)}.
	* It tests the method with a positive float value.
	*/
	@Test
	void testPackf_9() {
		float f = Float.NaN;
		byte[] b = Packer.packf(f);
		assertEquals(4, b.length);
		assertEquals(127, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(-1, b[3]);
	}
	
	/**
	* Test case 10 for {@link Packer#packf(float)}.
	* It tests the method with a negative float value.
	*/
	@Test
	void testPackf_10() {
		float f = Float.NaN;
		byte[] b = Packer.packf(f);
		assertEquals(4, b.length);
		assertEquals(127, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(-1, b[3]);
	}
}

// Packer_10Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#packd(double)} method.
*/
class Packer_10Test {
		
	/**
	* Test case 1 for {@link Packer#packd(double)}.
	* It tests the method with a positive double value.
	*/
	@Test
	void testPackd_1() {
		double d = 1.0;
		byte[] b = Packer.packd(d);
		assertEquals(8, b.length);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
		assertEquals(0, b[4]);
		assertEquals(0, b[5]);
		assertEquals(240, b[6]);
		assertEquals(63, b[7]);
	}
	
	/**
	* Test case 2 for {@link Packer#packd(double)}.
	* It tests the method with a negative double value.
	*/
	@Test
	void testPackd_2() {
		double d = -1.0;
		byte[] b = Packer.packd(d);
		assertEquals(8, b.length);
		assertEquals(-1, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(-1, b[3]);
		assertEquals(-1, b[4]);
		assertEquals(-1, b[5]);
		assertEquals(-16, b[6]);
		assertEquals(-64, b[7]);
	}
	
	/**
	* Test case 3 for