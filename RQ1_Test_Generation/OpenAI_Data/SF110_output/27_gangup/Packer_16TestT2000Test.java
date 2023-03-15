// Packer_16Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#packd(double)} method.
*/
class Packer_16Test {

		/**
		* Test case 1 for {@link Packer#packd(double)}.
		* It tests the method with a positive double value.
		*/
		@Test
		void testPackd_1() {
				double d = 1.0;
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
		* Test case 2 for {@link Packer#packd(double)}.
		* It tests the method with a negative double value.
		*/
		@Test
		void testPackd_2() {
				double d = -1.0;
				byte[] b = Packer.packd(d);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
				assertEquals(0, b[2]);
				assertEquals(0, b[3]);
				assertEquals(0, b[4]);
				assertEquals(0, b[5]);
				assertEquals(0, b[6]);
				assertEquals(-64, b[7]);
		}
		
		/**
		* Test case 3 for {@link Packer#packd(double)}.
		* It tests the method with a positive double value.
		*/
		@Test
		void testPackd_3() {
				double d = 1.5;
				byte[] b = Packer.packd(d);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
				assertEquals(0, b[2]);
				assertEquals(0, b[3]);
				assertEquals(0, b[4]);
				assertEquals(0, b[5]);
				assertEquals(0, b[6]);
				assertEquals(64, b[7]);
		}
		
		/**
		* Test case 4 for {@link Packer#packd(double)}.
		* It tests the method with a negative double value.
		*/
		@Test
		void testPackd_4() {
				double d = -1.5;
				byte[] b = Packer.packd(d);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
				assertEquals(0, b[2]);
				assertEquals(0, b[3]);
				assertEquals(0, b[4]);
				assertEquals(0, b[5]);
				assertEquals(0, b[6]);
				assertEquals(-65, b[7]);
		}
		
		/**
		* Test case 5 for {@link Packer#packd(double)}.
		* It tests the method with a positive double value.
		*/
		@Test
		void testPackd_5() {
				double d = 1.25;
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
		* Test case 6 for {@link Packer#packd(double)}.
		* It tests the method with a negative double value.
		*/
		@Test
		void testPackd_6() {
				double d = -1.25;
				byte[] b = Packer.packd(d);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
				assertEquals(0, b[2]);
				assertEquals(0, b[3]);
				assertEquals(0, b[4]);
				assertEquals(0, b[5]);
				assertEquals(0, b[6]);
				assertEquals(-64, b[7]);
		}
		
		/**
		* Test case 7 for {@link Packer#packd(double)}.
		* It tests the method with a positive double value.
		*/
		@Test
		void testPackd_7() {
				double d = 1.75;
				byte[] b = Packer.packd(d);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
				assertEquals(0, b[2]);
				assertEquals(0, b[3]);
				assertEquals(0, b[4]);
				assertEquals(0, b[5]);
				assertEquals(0, b[6]);
				assertEquals(64, b[7]);
		}
		
		/**
		* Test case 8 for {@link Packer#packd(double)}.
		* It tests the method with a negative double value.
		*/
		@Test
		void testPackd_8() {
				double d = -1.75;
				byte[] b = Packer.packd(d);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
				assertEquals(0, b[2]);
				assertEquals(0, b[3]);
				assertEquals(0, b[4]);
				assertEquals(0, b[5]);
				assertEquals(0, b[6]);
				assertEquals(-65, b[7]);
		}
		
		/**
		* Test case 9 for {@link Packer#packd(double)}.
		* It tests the method with a positive double value.
		*/
		@Test
		void testPackd_9() {
				double d = 1.125;
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
		* Test case 10 for {@link Packer#packd(double)}.
		* It tests the method with a negative double value.
		*/
		@Test
		void testPackd_10() {
				double d = -1.125