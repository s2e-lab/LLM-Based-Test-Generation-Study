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
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpacki_1() {
		byte[] b = {0, 0, 0, 0};
		int expected = 0;
		int actual = Packer.unpacki(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link Packer#unpacki(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpacki_2() {
		byte[] b = {-1, -1, -1, -1};
		int expected = -1;
		int actual = Packer.unpacki(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link Packer#unpacki(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpacki_3() {
		byte[] b = {-1, -1, -1, 0};
		int expected = 16777215;
		int actual = Packer.unpacki(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link Packer#unpacki(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpacki_4() {
		byte[] b = {-1, -1, 0, 0};
		int expected = 65535;
		int actual = Packer.unpacki(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link Packer#unpacki(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpacki_5() {
		byte[] b = {-1, 0, 0, 0};
		int expected = 255;
		int actual = Packer.unpacki(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link Packer#unpacki(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpacki_6() {
		byte[] b = {0, 0, 0, -1};
		int expected = -16777216;
		int actual = Packer.unpacki(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link Packer#unpacki(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpacki_7() {
		byte[] b = {0, 0, -1, -1};
		int expected = -256;
		int actual = Packer.unpacki(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link Packer#unpacki(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpacki_8() {
		byte[] b = {0, -1, -1, -1};
		int expected = -1;
		int actual = Packer.unpacki(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link Packer#unpacki(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpacki_9() {
		byte[] b = {-1, -1, -1, -1};
		int expected = -1;
		int actual = Packer.unpacki(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link Packer#unpacki(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpacki_10() {
		byte[] b = {-1, -1, -1, -1};
		int expected = -1;
		int actual = Packer.unpacki(b);
		assertEquals(expected, actual);
	}
}

// Packer_14Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpackl(byte[])} method.
*/
class Packer_14Test {
		
	/**
	* Test case 1 for {@link Packer#unpackl(byte[])}.
	* It tests the method with a byte array of length 8.
	*/
	@Test
	void testUnpackl_1() {
		byte[] b = {0, 0, 0, 0, 0, 0, 0, 0};
		long expected = 0;
		long actual = Packer.unpackl(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link Packer#unpackl(byte[])}.
	* It tests the method with a byte array of length 8.
	*/
	@Test
	void testUnpackl_2() {
		byte[] b = {-1, -1, -1, -1, -1, -1, -1, -1};
		long expected = -1;
		long actual = Packer.unpackl(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link Packer#unpackl(byte[])}.
	* It tests the method with a byte array of length 8.
	*/
	@Test
	void testUnpackl_3() {
		byte[] b = {-1, -1, -1, -1, -1, -1, -1, 0};
		long expected = 72057594037927935L;
		long actual = Packer.unpackl(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link Packer#unpackl(byte[])}.
	* It tests the method with a byte array of length 8.
	*/
	@Test
	void testUnpackl_4() {
		byte[] b = {-1, -1, -1, -1, -1, -1, 0, 0};
		long expected = 281474976710655L;
		long actual = Packer.unpackl(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link Packer#unpackl(byte[])}.
	* It tests the method with a byte array of length 8.
	*/
	@Test
	void testUnpackl_5() {
		byte[] b = {-1, -1, -1, -1, -1, 0, 0, 0};
		long expected = 1099511627775L;
		long actual = Packer.unpackl(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link Packer#unpackl(byte[])}.
	* It tests the method with a byte array of length 8.
	*/
	@Test
	void testUnpackl_6() {
		byte[] b = {-1, -1, -1, -1, 0, 0, 0, 0};
		long expected = 4294967295L;
		long actual = Packer.unpackl(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link Packer#unpackl(byte[])}.
	* It tests the method with a byte array of length 8.
	*/
	@Test
	void testUnpackl_7() {
		byte[] b = {-1, -1, -1, 0, 0, 0, 0, 0};
		long expected = 16777215L;
		long actual = Packer.unpackl(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link Packer#unpackl(byte[])}.
	* It tests the method with a byte array of length 8.
	*/
	@Test
	void testUnpackl_8() {
		byte[] b = {-1, -1, 0, 0, 0, 0, 0, 0};
		long expected = 65535L;
		long actual = Packer.unpackl(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link Packer#unpackl(byte[])}.
	* It tests the method with a byte array of length 8.
	*/
	@Test
	void testUnpackl_9() {
		byte[] b = {-1, 0, 0, 0, 0, 0, 0, 0};
		long expected = 255L;
		long actual = Packer.unpackl(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link Packer#unpackl(byte[])}.
	* It tests the method with a byte array of length 8.
	*/
	@Test
	void testUnpackl_10() {
		byte[] b = {0, 0, 0, 0, 0, 0, 0, -1};
		long expected = -72057594037927936L;
		long actual = Packer.unpackl(b);
		assertEquals(expected, actual);
	}
}

// Packer_15Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpackf(byte[])} method.
*/
class Packer_15Test {
		
	/**
	* Test case 1 for {@link Packer#unpackf(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpackf_1() {
		byte[] b = {0, 0, 0, 0};
		float expected = 0.0f;
		float actual = Packer.unpackf(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link Packer#unpackf(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpackf_2() {
		byte[] b = {-1, -1, -1, -1};
		float expected = -1.0f;
		float actual = Packer.unpackf(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link Packer#unpackf(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpackf_3() {
		byte[] b = {-1, -1, -1, 0};
		float expected = 16777215.0f;
		float actual = Packer.unpackf(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link Packer#unpackf(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpackf_4() {
		byte[] b = {-1, -1, 0, 0};
		float expected = 65535.0f;
		float actual = Packer.unpackf(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link Packer#unpackf(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpackf_5() {
		byte[] b = {-1, 0, 0, 0};
		float expected = 255.0f;
		float actual = Packer.unpackf(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link Packer#unpackf(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpackf_6() {
		byte[] b = {0, 0, 0, -1};
		float expected = -16777216.0f;
		float actual = Packer.unpackf(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link Packer#unpackf(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpackf_7() {
		byte[] b = {0, 0, -1, -1};
		float expected = -256.0f;
		float actual = Packer.unpackf(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link Packer#unpackf(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpackf_8() {
		byte[] b = {0, -1, -1, -1};
		float expected = -1.0f;
		float actual = Packer.unpackf(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link Packer#unpackf(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpackf_9() {
		byte[] b = {-1, -1, -1, -1};
		float expected = -1.0f;
		float actual = Packer.unpackf(b);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link Packer#unpackf(byte[])}.
	* It tests the method with a byte array of length 4.
	*/
	@Test
	void testUnpackf_10() {
		byte[] b = {-1, -1, -1, -1};
		float expected = -1.0f;
		float actual = Packer.unpackf(b);
		assertEquals(expected, actual);
	}
}

// Packer_16Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpackd(byte[])} method.
*/
class Packer_16Test {
		
	/**
	* Test case 1 for {@link Packer#unpackd(byte[])}.
	* It tests the method with a byte array of length 8.
	*/
	@Test
	void testUnpackd_1() {
		byte[] b = {0, 0, 0, 0, 0, 0, 0, 0};