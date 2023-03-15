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
				byte[] b = {-1, 1};
				short expected = -255;
				short actual = Packer.unpack16(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link Packer#unpack16(byte[])}.
		* It tests the method with a byte array of length 2.
		*/
		@Test
		void testUnpack16_5() {
				byte[] b = {-1, 2};
				short expected = -254;
				short actual = Packer.unpack16(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link Packer#unpack16(byte[])}.
		* It tests the method with a byte array of length 2.
		*/
		@Test
		void testUnpack16_6() {
				byte[] b = {-1, 3};
				short expected = -253;
				short actual = Packer.unpack16(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link Packer#unpack16(byte[])}.
		* It tests the method with a byte array of length 2.
		*/
		@Test
		void testUnpack16_7() {
				byte[] b = {-1, 4};
				short expected = -252;
				short actual = Packer.unpack16(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link Packer#unpack16(byte[])}.
		* It tests the method with a byte array of length 2.
		*/
		@Test
		void testUnpack16_8() {
				byte[] b = {-1, 5};
				short expected = -251;
				short actual = Packer.unpack16(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link Packer#unpack16(byte[])}.
		* It tests the method with a byte array of length 2.
		*/
		@Test
		void testUnpack16_9() {
				byte[] b = {-1, 6};
				short expected = -250;
				short actual = Packer.unpack16(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link Packer#unpack16(byte[])}.
		* It tests the method with a byte array of length 2.
		*/
		@Test
		void testUnpack16_10() {
				byte[] b = {-1, 7};
				short expected = -249;
				short actual = Packer.unpack16(b);
				assertEquals(expected, actual);
		}
}

// Packer_17Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpack32(byte[])} method.
*/
class Packer_17Test {
		
		/**
		* Test case 1 for {@link Packer#unpack32(byte[])}.
		* It tests the method with a byte array of length 4.
		*/
		@Test
		void testUnpack32_1() {
				byte[] b = {0, 0, 0, 0};
				int expected = 0;
				int actual = Packer.unpack32(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link Packer#unpack32(byte[])}.
		* It tests the method with a byte array of length 4.
		*/
		@Test
		void testUnpack32_2() {
				byte[] b = {-1, -1, -1, -1};
				int expected = -1;
				int actual = Packer.unpack32(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link Packer#unpack32(byte[])}.
		* It tests the method with a byte array of length 4.
		*/
		@Test
		void testUnpack32_3() {
				byte[] b = {-1, -1, -1, 0};
				int expected = -65536;
				int actual = Packer.unpack32(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link Packer#unpack32(byte[])}.
		* It tests the method with a byte array of length 4.
		*/
		@Test
		void testUnpack32_4() {
				byte[] b = {-1, -1, -1, 1};
				int expected = -65535;
				int actual = Packer.unpack32(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link Packer#unpack32(byte[])}.
		* It tests the method with a byte array of length 4.
		*/
		@Test
		void testUnpack32_5() {
				byte[] b = {-1, -1, -1, 2};
				int expected = -65534;
				int actual = Packer.unpack32(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link Packer#unpack32(byte[])}.
		* It tests the method with a byte array of length 4.
		*/
		@Test
		void testUnpack32_6() {
				byte[] b = {-1, -1, -1, 3};
				int expected = -65533;
				int actual = Packer.unpack32(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link Packer#unpack32(byte[])}.
		* It tests the method with a byte array of length 4.
		*/
		@Test
		void testUnpack32_7() {
				byte[] b = {-1, -1, -1, 4};
				int expected = -65532;
				int actual = Packer.unpack32(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link Packer#unpack32(byte[])}.
		* It tests the method with a byte array of length 4.
		*/
		@Test
		void testUnpack32_8() {
				byte[] b = {-1, -1, -1, 5};
				int expected = -65531;
				int actual = Packer.unpack32(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link Packer#unpack32(byte[])}.
		* It