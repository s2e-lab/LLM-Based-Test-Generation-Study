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
	* It tests the method with a float value of 0.
	*/
	@Test
	void testPackf_1() {
		float f = 0;
		byte[] b = Packer.packf(f);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
	}
	
	/**
	* Test case 2 for {@link Packer#packf(float)}.
	* It tests the method with a float value of 1.
	*/
	@Test
	void testPackf_2() {
		float f = 1;
		byte[] b = Packer.packf(f);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(63, b[3]);
	}
	
	/**
	* Test case 3 for {@link Packer#packf(float)}.
	* It tests the method with a float value of -1.
	*/
	@Test
	void testPackf_3() {
		float f = -1;
		byte[] b = Packer.packf(f);
		assertEquals(-1, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(63, b[3]);
	}
	
	/**
	* Test case 4 for {@link Packer#packf(float)}.
	* It tests the method with a float value of 0.5.
	*/
	@Test
	void testPackf_4() {
		float f = 0.5f;
		byte[] b = Packer.packf(f);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(62, b[3]);
	}
	
	/**
	* Test case 5 for {@link Packer#packf(float)}.
	* It tests the method with a float value of -0.5.
	*/
	@Test
	void testPackf_5() {
		float f = -0.5f;
		byte[] b = Packer.packf(f);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(191, b[3]);
	}
	
	/**
	* Test case 6 for {@link Packer#packf(float)}.
	* It tests the method with a float value of Float.MAX_VALUE.
	*/
	@Test
	void testPackf_6() {
		float f = Float.MAX_VALUE;
		byte[] b = Packer.packf(f);
		assertEquals(127, b[0]);
		assertEquals(127, b[1]);
		assertEquals(255, b[2]);
		assertEquals(127, b[3]);
	}
	
	/**
	* Test case 7 for {@link Packer#packf(float)}.
	* It tests the method with a float value of Float.MIN_VALUE.
	*/
	@Test
	void testPackf_7() {
		float f = Float.MIN_VALUE;
		byte[] b = Packer.packf(f);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(1, b[3]);
	}
	
	/**
	* Test case 8 for {@link Packer#packf(float)}.
	* It tests the method with a float value of Float.NaN.
	*/
	@Test
	void testPackf_8() {
		float f = Float.NaN;
		byte[] b = Packer.packf(f);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(128, b[2]);
		assertEquals(127, b[3]);
	}
	
	/**
	* Test case 9 for {@link Packer#packf(float)}.
	* It tests the method with a float value of Float.POSITIVE_INFINITY.
	*/
	@Test
	void testPackf_9() {
		float f = Float.POSITIVE_INFINITY;
		byte[] b = Packer.packf(f);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(128, b[2]);
		assertEquals(127, b[3]);
	}
	
	/**
	* Test case 10 for {@link Packer#packf(float)}.
	* It tests the method with a float value of Float.NEGATIVE_INFINITY.
	*/
	@Test
	void testPackf_10() {
		float f = Float.NEGATIVE_INFINITY;
		byte[] b = Packer.packf(f);
		assertEquals(-1, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(127, b[3]);
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
	* It tests the method with a double value of 0.
	*/
	@Test
	void testPackd_1() {
		double d = 0;
		byte[] b = Packer.packd(d);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
		assertEquals(0, b[4]);
		assertEquals(0, b[5]);
		assertEquals(0, b[6]);
		assertEquals(0, b[7]);
	}
	
	/**
	* Test case 2 for {@link Packer#packd(double)}.
	* It tests the method with a double value of 1.
	*/
	@Test
	void testPackd_2() {
		double d = 1;
		byte[] b = Packer.packd(d);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
		assertEquals(0, b[4]);
		assertEquals(0, b[5]);
		assertEquals(0, b[6]);
		assertEquals(63, b[7]);
	}
	
	/**
	* Test case 3 for {@link Packer#packd(double)}.
	* It tests the method with a double value of -1.
	*/
	@Test
	void testPackd_3() {
		double d = -1;
		byte[] b = Packer.packd(d);
		assertEquals(-1, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(-1, b[3]);
		assertEquals(-1, b[4]);
		assertEquals(-1, b[5]);
		assertEquals(-1, b[6]);
		assertEquals(63, b[7]);
	}
	
	/**
	* Test case 4 for {@link Packer#packd(double)}.
	* It tests the method with a double value of 0.5.
	*/
	@Test
	void testPackd_4() {
		double d = 0.5;
		byte[] b = Packer.packd(d);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
		assertEquals(0, b[4]);
		assertEquals(0, b[5]);
		assertEquals(0, b[6]);
		assertEquals(62, b[7]);
	}
	
	/**
	* Test case 5 for {@link Packer#packd(double)}.
	* It tests the method with a double value of -0.5.
	*/
	@Test
	void testPackd_5() {
		double d = -0.5;
		byte[] b = Packer.packd(d);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
		assertEquals(0, b[4]);
		assertEquals(0, b[5]);
		assertEquals(0, b[6]);
		assertEquals(191, b[7]);
	}
	
	/**
	* Test case 6 for {@link Packer#packd(double)}.
	* It tests the method with a double value of Double.MAX_VALUE.
	*/
	@Test
	void testPackd_6() {
		double d = Double.MAX_VALUE;
		byte[] b = Packer.packd(d);
		assertEquals(127, b[0]);
		assertEquals(127, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(-1, b[3]);
		assertEquals(-1, b[4]);
		assertEquals(-1, b[5]);
		assertEquals(-1, b[6]);
		assertEquals(127, b[7]);
	}
	
	/**
	* Test case 7 for {@link Packer#packd(double)}.
	* It tests the method with a double value of Double.MIN_VALUE.
	*/
	@Test
	void testPackd_7() {
		double d = Double.MIN_VALUE;
		byte[] b = Packer.packd(d);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
		assertEquals(0, b[4]);
		assertEquals(0, b[5]);
		assertEquals(0, b[6]);
		assertEquals(1, b[7]);
	}
	
	/**
	* Test case 8 for {@link Packer#packd(double)}.
	* It tests the method with a double value of Double.NaN.
	*/
	@Test
	void testPackd_8() {
		double d = Double.NaN;
		byte[] b = Packer.packd(d);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
		assertEquals(0, b[4]);
		assertEquals(0, b[5]);
		assertEquals(128, b[6]);
		assertEquals(127, b[7]);
	}
	
	/**
	* Test case 9 for {@link Packer#packd(double)}.
	* It tests the method with a double value of Double.POSITIVE_INFINITY.
	*/
	@Test
	void testPackd_9() {
		double d = Double.POSITIVE_INFINITY;
		byte[] b = Packer.packd(d);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
		assertEquals(0, b[4]);
		assertEquals(0, b[5]);
		assertEquals(128, b[6]);
		assertEquals(127, b[7]);
	}
	
	/**
	* Test case 10 for {@link Packer#packd(double)}.
	* It tests the method with a double value of Double.NEGATIVE_INFINITY.
	*/
	@Test
	void testPackd_10() {
		double d = Double.NEGATIVE_INFINITY;
		byte[] b = Packer.packd(d);
		assertEquals(-1, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(-1, b[3]);
		assertEquals(-1, b[4]);
		assertEquals(-1, b[5]);
		assertEquals(-1, b[6]);
		assertEquals(127, b[7]);
	}
}

// Packer_11Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#packi(int)} method.
*/
class Packer_11Test {
		
	/**
	* Test case 1 for {@link Packer#packi(int)}.
	* It tests the method with an integer value of 0.
	*/
	@Test
	void testPacki_1() {
		int i = 0;
		byte[] b = Packer.packi(i);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(0, b[3]);
	}
	
	/**
	* Test case 2 for {@link Packer#packi(int)}.
	* It tests the method with an integer value of 1.
	*/
	@Test
	void testPacki_2() {
		int i = 1;
		byte[] b = Packer.packi(i);
		assertEquals(0, b[0]);
		assertEquals(0, b[1]);
		assertEquals(0, b[2]);
		assertEquals(1, b[3]);
	}
	
	/**
	* Test case 3 for {@link Packer#packi(int)}.
	* It tests the method with an integer value of -1.
	*/
	@Test
	void testPacki_3() {
		int i = -1;
		byte[] b = Packer.packi(i);
		assertEquals(-1, b[0]);
		assertEquals(-1, b[1]);
		assertEquals(-1, b[2]);
		assertEquals(255, b[3]);
	}
	
	/**
	* Test case 4 for {@link Packer#packi(int)}.
	* It tests the method with an integer value of Integer.MAX_VALUE.
	*/
	@Test
	void testPacki_4() {
		int i = Integer.MAX_VALUE;
		byte[] b = Packer.packi(i);
		assertEquals(