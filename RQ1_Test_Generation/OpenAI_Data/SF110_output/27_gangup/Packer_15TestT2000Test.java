// Packer_15Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpackl(byte[])} method.
*/
class Packer_15Test {

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
				byte[] b = {-1, -1, -1, -1, 0, 0, 0, 0};
				long expected = -4294967296L;
				long actual = Packer.unpackl(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link Packer#unpackl(byte[])}.
		* It tests the method with a byte array of length 8.
		*/
		@Test
		void testUnpackl_4() {
				byte[] b = {-1, -1, -1, -1, -1, -1, -1, 127};
				long expected = 9223372036854775807L;
				long actual = Packer.unpackl(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link Packer#unpackl(byte[])}.
		* It tests the method with a byte array of length 8.
		*/
		@Test
		void testUnpackl_5() {
				byte[] b = {-1, -1, -1, -1, -1, -1, -1, -128};
				long expected = -9223372036854775808L;
				long actual = Packer.unpackl(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link Packer#unpackl(byte[])}.
		* It tests the method with a byte array of length 8.
		*/
		@Test
		void testUnpackl_6() {
				byte[] b = {-1, -1, -1, -1, -1, -1, -1, -1};
				long expected = -1;
				long actual = Packer.unpackl(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link Packer#unpackl(byte[])}.
		* It tests the method with a byte array of length 8.
		*/
		@Test
		void testUnpackl_7() {
				byte[] b = {-1, -1, -1, -1, -1, -1, -1, 0};
				long expected = -256;
				long actual = Packer.unpackl(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link Packer#unpackl(byte[])}.
		* It tests the method with a byte array of length 8.
		*/
		@Test
		void testUnpackl_8() {
				byte[] b = {-1, -1, -1, -1, -1, -1, -1, 1};
				long expected = -255;
				long actual = Packer.unpackl(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link Packer#unpackl(byte[])}.
		* It tests the method with a byte array of length 8.
		*/
		@Test
		void testUnpackl_9() {
				byte[] b = {-1, -1, -1, -1, -1, -1, -1, 2};
				long expected = -254;
				long actual = Packer.unpackl(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link Packer#unpackl(byte[])}.
		* It tests the method with a byte array of length 8.
		*/
		@Test
		void testUnpackl_10() {
				byte[] b = {-1, -1, -1, -1, -1, -1, -1, 3};
				long expected = -253;
				long actual = Packer.unpackl(b);
				assertEquals(expected, actual);
		}
}

// Packer_16Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpack16(byte[])} method.
*/
class Packer_16Test {
		
		/**
		* Test case 1 for {@link Packer#unpack16(byte[])}.
		* It tests the method with a byte array of length 2.
		*/
		@Test
		void testUnpack16_1() {
				byte[] b = {0, 0};
				short expected = 0;
				short actual = Packer.unpack16(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link Packer#unpack16(byte[])}.
		* It tests the method with a byte array of length 2.
		*/
		@Test
		void testUnpack16_2() {
				byte[] b = {-1, -1};
				short expected = -1;
				short actual = Packer.unpack16(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link Packer#unpack16(byte[])}.
		* It tests the method with a byte array of length 2.
		*/
		@Test
		void testUnpack16_3() {
				byte[] b = {-1, 0};
				short expected = -256;
				short actual = Packer.unpack16(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link Packer#unpack16(byte[])}.
		* It tests the method with a byte array of length 2.
		*/
		@Test
		void testUnpack16_4() {
				byte[] b