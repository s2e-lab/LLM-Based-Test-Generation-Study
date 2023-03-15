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
		* It tests the method with a byte array containing the value 0.
		*/
		@Test
		void testUnpacki1() {
				byte[] b = {0, 0, 0, 0};
				int expected = 0;
				int actual = Packer.unpacki(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link Packer#unpacki(byte[])}.
		* It tests the method with a byte array containing the value 1.
		*/
		@Test
		void testUnpacki2() {
				byte[] b = {0, 0, 0, 1};
				int expected = 1;
				int actual = Packer.unpacki(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link Packer#unpacki(byte[])}.
		* It tests the method with a byte array containing the value -1.
		*/
		@Test
		void testUnpacki3() {
				byte[] b = {-1, -1, -1, -1};
				int expected = -1;
				int actual = Packer.unpacki(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link Packer#unpacki(byte[])}.
		* It tests the method with a byte array containing the value 2147483647.
		*/
		@Test
		void testUnpacki4() {
				byte[] b = {127, -1, -1, -1};
				int expected = 2147483647;
				int actual = Packer.unpacki(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link Packer#unpacki(byte[])}.
		* It tests the method with a byte array containing the value -2147483648.
		*/
		@Test
		void testUnpacki5() {
				byte[] b = {-128, 0, 0, 0};
				int expected = -2147483648;
				int actual = Packer.unpacki(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link Packer#unpacki(byte[])}.
		* It tests the method with a byte array containing the value -2147483647.
		*/
		@Test
		void testUnpacki6() {
				byte[] b = {-1, -1, -1, 1};
				int expected = -2147483647;
				int actual = Packer.unpacki(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link Packer#unpacki(byte[])}.
		* It tests the method with a byte array containing the value -2147483646.
		*/
		@Test
		void testUnpacki7() {
				byte[] b = {-2, -1, -1, -1};
				int expected = -2147483646;
				int actual = Packer.unpacki(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link Packer#unpacki(byte[])}.
		* It tests the method with a byte array containing the value -2147483645.
		*/
		@Test
		void testUnpacki8() {
				byte[] b = {-3, -1, -1, -1};
				int expected = -2147483645;
				int actual = Packer.unpacki(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link Packer#unpacki(byte[])}.
		* It tests the method with a byte array containing the value -2147483644.
		*/
		@Test
		void testUnpacki9() {
				byte[] b = {-4, -1, -1, -1};
				int expected = -2147483644;
				int actual = Packer.unpacki(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link Packer#unpacki(byte[])}.
		* It tests the method with a byte array containing the value -2147483643.
		*/
		@Test
		void testUnpacki10() {
				byte[] b = {-5, -1, -1, -1};
				int expected = -2147483643;
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
		* It tests the method with a byte array containing the value 0.
		*/
		@Test
		void testUnpackl1() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, 0};
				long expected = 0;
				long actual = Packer.unpackl(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link Packer#unpackl(byte[])}.
		* It tests the method with a byte array containing the value 1.
		*/
		@Test
		void testUnpackl2() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, 1};
				long expected = 1;
				long actual = Packer.unpackl(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link Packer#unpackl(byte[])}.
		* It tests the method with a byte array containing the value -1.
		*/
		@Test
		void testUnpackl3() {
				byte[] b = {-1, -1, -1, -1, -1, -1, -1, -1};
				long expected = -1;
				long actual = Packer.unpackl(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link Packer#unpackl(byte[])}.
		* It tests the method with a byte array containing the value 2147483647.
		*/
		@Test
		void testUnpackl4() {
				byte[] b = {127, -1, -1, -1, -1, -1, -1, -1};
				long