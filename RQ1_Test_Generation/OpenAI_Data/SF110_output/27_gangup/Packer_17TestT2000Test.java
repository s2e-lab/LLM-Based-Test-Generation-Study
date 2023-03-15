// Packer_17Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpackd(byte[])} method.
*/
class Packer_17Test {

		/**
		* Test case 1 for {@link Packer#unpackd(byte[])}.
		* It tests the method with a double value of 0.0.
		*/
		@Test
		void testUnpackd_1() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, 0};
				double d = Packer.unpackd(b);
				assertEquals(0.0, d);
		}
		
		/**
		* Test case 2 for {@link Packer#unpackd(byte[])}.
		* It tests the method with a double value of 1.0.
		*/
		@Test
		void testUnpackd_2() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, 64};
				double d = Packer.unpackd(b);
				assertEquals(1.0, d);
		}
		
		/**
		* Test case 3 for {@link Packer#unpackd(byte[])}.
		* It tests the method with a double value of -1.0.
		*/
		@Test
		void testUnpackd_3() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, -64};
				double d = Packer.unpackd(b);
				assertEquals(-1.0, d);
		}
		
		/**
		* Test case 4 for {@link Packer#unpackd(byte[])}.
		* It tests the method with a double value of 0.5.
		*/
		@Test
		void testUnpackd_4() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, 63};
				double d = Packer.unpackd(b);
				assertEquals(0.5, d);
		}
		
		/**
		* Test case 5 for {@link Packer#unpackd(byte[])}.
		* It tests the method with a double value of -0.5.
		*/
		@Test
		void testUnpackd_5() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, -65};
				double d = Packer.unpackd(b);
				assertEquals(-0.5, d);
		}
		
		/**
		* Test case 6 for {@link Packer#unpackd(byte[])}.
		* It tests the method with a double value of 0.25.
		*/
		@Test
		void testUnpackd_6() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, 62};
				double d = Packer.unpackd(b);
				assertEquals(0.25, d);
		}
		
		/**
		* Test case 7 for {@link Packer#unpackd(byte[])}.
		* It tests the method with a double value of -0.25.
		*/
		@Test
		void testUnpackd_7() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, -66};
				double d = Packer.unpackd(b);
				assertEquals(-0.25, d);
		}
		
		/**
		* Test case 8 for {@link Packer#unpackd(byte[])}.
		* It tests the method with a double value of 0.75.
		*/
		@Test
		void testUnpackd_8() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, 64};
				double d = Packer.unpackd(b);
				assertEquals(0.75, d);
		}
		
		/**
		* Test case 9 for {@link Packer#unpackd(byte[])}.
		* It tests the method with a double value of -0.75.
		*/
		@Test
		void testUnpackd_9() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, -64};
				double d = Packer.unpackd(b);
				assertEquals(-0.75, d);
		}
		
		/**
		* Test case 10 for {@link Packer#unpackd(byte[])}.
		* It tests the method with a double value of 0.125.
		*/
		@Test
		void testUnpackd_10() {
				byte[] b = {0, 0, 0, 0, 0, 0, 0, 61};
				double d = Packer.unpackd(b);
				assertEquals(0.125, d);
		}
}

// Packer_18Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpackf(byte[])} method.
*/
class Packer_18Test {
		
		/**
		* Test case 1 for {@link Packer#unpackf(byte[])}.
		* It tests the method with a float value of 0.0.
		*/
		@Test
		void testUnpackf_1() {
				byte[] b = {0, 0, 0, 0};
				float f = Packer.unpackf(b);
				assertEquals(0.0, f);
		}
		
		/**
		* Test case 2 for {@link Packer#unpackf(byte[])}.
		* It tests the method with a float value of 1.0.
		*/
		@Test
		void testUnpackf_2() {
				byte[] b = {0, 0, 0, 64};
				float f = Packer.unpackf(b);
				assertEquals(1.0, f);
		}
		
		/**
		* Test case 3 for {@link Packer#unpackf(byte[])}.
		* It tests the method with a float value of -1.0.
		*/
		@Test
		void testUnpackf_3() {
				byte[] b = {0, 0, 0, -64};
				float f = Packer.unpackf(b);
				assertEquals(-1.0, f);
		}
		
		/**
		* Test case 4 for {@link Packer#unpackf(byte[])}.
		* It tests the method with a float value of 0.5.
		*/
		@Test
		void testUnpackf_4() {
				byte[] b = {0, 0, 0, 63};
				float f = Packer.unpackf(b);
				assertEquals(0.5, f);
		}
		
		/**
		* Test case 5 for {@link Packer#unpackf(byte[])}.
		* It tests the method with a float value of -0.5.
		*/
		@Test
		void testUnpackf_5() {
				byte[] b = {0, 0, 0, -65};
				float f = Packer.unpackf(b);
				assertEquals(-0.5, f);
