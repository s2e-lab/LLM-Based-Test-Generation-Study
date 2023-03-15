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
	void testUnpackd_6() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
		double d = Packer.unpackd(b);
		assertEquals(Double.NaN, d);
	}
	
	/**
	* Test case 7 for {@link Packer#unpackd(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackd_7() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfe};
		double d = Packer.unpackd(b);
		assertEquals(Double.NaN, d);
	}
	
	/**
	* Test case 8 for {@link Packer#unpackd(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackd_8() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfd};
		double d = Packer.unpackd(b);
		assertEquals(Double.NaN, d);
	}
	
	/**
	* Test case 9 for {@link Packer#unpackd(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackd_9() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfc};
		double d = Packer.unpackd(b);
		assertEquals(Double.NaN, d);
	}
	
	/**
	* Test case 10 for {@link Packer#unpackd(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpackd_10() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfb};
		double d = Packer.unpackd(b);
		assertEquals(Double.NaN, d);
	}
	
}

// Packer_13Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpacki(byte[])} method.
*/
class Packer_13Test {
		
	/**
	* Test case 1 for {@link Packer#unpacki(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpacki_1() {
		byte[] b = {0x00, 0x00, 0x00, 0x00};
		int i = Packer.unpacki(b);
		assertEquals(0, i);
	}
	
	/**
	* Test case 2 for {@link Packer#unpacki(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpacki_2() {
		byte[] b = {(byte) 0x80, 0x00, 0x00, 0x00};
		int i = Packer.unpacki(b);
		assertEquals(-2147483648, i);
	}
	
	/**
	* Test case 3 for {@link Packer#unpacki(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpacki_3() {
		byte[] b = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
		int i = Packer.unpacki(b);
		assertEquals(-1, i);
	}
	
	/**
	* Test case 4 for {@link Packer#unpacki(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpacki_4() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff};
		int i = Packer.unpacki(b);
		assertEquals(2147483647, i);
	}
	
	/**
	* Test case 5 for {@link Packer#unpacki(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpacki_5() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xfe};
		int i = Packer.unpacki(b);
		assertEquals(2147483646, i);
	}
	
	/**
	* Test case 6 for {@link Packer#unpacki(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpacki_6() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xfd};
		int i = Packer.unpacki(b);
		assertEquals(2147483645, i);
	}
	
	/**
	* Test case 7 for {@link Packer#unpacki(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpacki_7() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xfc};
		int i = Packer.unpacki(b);
		assertEquals(2147483644, i);
	}
	
	/**
	* Test case 8 for {@link Packer#unpacki(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpacki_8() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xfb};
		int i = Packer.unpacki(b);
		assertEquals(2147483643, i);
	}
	
	/**
	* Test case 9 for {@link Packer#unpacki(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpacki_9() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xfa};
		int i = Packer.unpacki(b);
		assertEquals(2147483642, i);
	}
	
	/**
	* Test case 10 for {@link Packer#unpacki(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpacki_10() {
		byte[] b = {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xf9};
		int i = Packer.unpacki(b);
		assertEquals(2147483641, i);
	}
	
}

// Packer_14Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Ass