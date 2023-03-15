// Packer_10Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#packfv(float[], int, int)} method.
*/
class Packer_10Test {

		/**
		* Test case 1 for {@link Packer#packfv(float[], int, int)}.
		*/
		@Test
		void testPackfv1() {
				float[] fv = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f};
				byte[] b = Packer.packfv(fv, 0, 10);
				assertEquals(40, b.length);
				assertEquals(0x3f, b[0]);
				assertEquals(0x80, b[1]);
				assertEquals(0x00, b[2]);
				assertEquals(0x00, b[3]);
				assertEquals(0x40, b[4]);
				assertEquals(0x00, b[5]);
				assertEquals(0x00, b[6]);
				assertEquals(0x00, b[7]);
				assertEquals(0x40, b[8]);
				assertEquals(0x40, b[9]);
				assertEquals(0x00, b[10]);
				assertEquals(0x00, b[11]);
				assertEquals(0x40, b[12]);
				assertEquals(0x60, b[13]);
				assertEquals(0x00, b[14]);
				assertEquals(0x00, b[15]);
				assertEquals(0x40, b[16]);
				assertEquals(0x80, b[17]);
				assertEquals(0x00, b[18]);
				assertEquals(0x00, b[19]);
				assertEquals(0x40, b[20]);
				assertEquals(0xa0, b[21]);
				assertEquals(0x00, b[22]);
				assertEquals(0x00, b[23]);
				assertEquals(0x40, b[24]);
				assertEquals(0xc0, b[25]);
				assertEquals(0x00, b[26]);
				assertEquals(0x00, b[27]);
				assertEquals(0x40, b[28]);
				assertEquals(0xe0, b[29]);
				assertEquals(0x00, b[30]);
				assertEquals(0x00, b[31]);
				assertEquals(0x41, b[32]);
				assertEquals(0x00, b[33]);
				assertEquals(0x00, b[34]);
				assertEquals(0x00, b[35]);
				assertEquals(0x41, b[36]);
				assertEquals(0x20, b[37]);
				assertEquals(0x00, b[38]);
				assertEquals(0x00, b[39]);
		}
		
		/**
		* Test case 2 for {@link Packer#packfv(float[], int, int)}.
		*/
		@Test
		void testPackfv2() {
				float[] fv = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f};
				byte[] b = Packer.packfv(fv, 0, 5);
				assertEquals(20, b.length);
				assertEquals(0x3f, b[0]);
				assertEquals(0x80, b[1]);
				assertEquals(0x00, b[2]);
				assertEquals(0x00, b[3]);
				assertEquals(0x40, b[4]);
				assertEquals(0x00, b[5]);
				assertEquals(0x00, b[6]);
				assertEquals(0x00, b[7]);
				assertEquals(0x40, b[8]);
				assertEquals(0x40, b[9]);
				assertEquals(0x00, b[10]);
				assertEquals(0x00, b[11]);
				assertEquals(0x40, b[12]);
				assertEquals(0x60, b[13]);
				assertEquals(0x00, b[14]);
				assertEquals(0x00, b[15]);
				assertEquals(0x40, b[16]);
				assertEquals(0x80, b[17]);
				assertEquals(0x00, b[18]);
				assertEquals(0x00, b[19]);
		}
		
		/**
		* Test case 3 for {@link Packer#packfv(float[], int, int)}.
		*/
		@Test
		void testPackfv3() {
				float[] fv = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f};
				byte[] b = Packer.packfv(fv, 5, 5);
				assertEquals(20, b.length);
				assertEquals(0x40, b[0]);
				assertEquals(0xa0, b[1]);
				assertEquals(0x00, b[2]);
				assertEquals(0x00, b[3]);
				assertEquals(0x40, b[4]);
				assertEquals(0xc0, b[5]);
				assertEquals(0x00, b[6]);
				assertEquals(0x00, b[7]);
				assertEquals(0x40, b[8]);
				assertEquals(0xe0, b[9]);
				assertEquals(0x00, b[10]);
				assertEquals(0x00, b[11]);
				assertEquals(0x41, b[12]);
				assertEquals(0x00, b[13]);
				assertEquals(0x00, b[14]);
				assertEquals(0x00, b[15]);
				assertEquals(0x41, b[16]);
				assertEquals(0x20, b[17]);
				assertEquals(0x00, b[18]);
				assertEquals(0x00, b[19]);
		}
		
		/**
		* Test case 4 for {@link Packer#packfv(float[], int, int)}.
		*/
		@Test
		void testPackfv4() {
				float[] fv = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f};
				byte[] b = Packer.packfv(fv, 0, 0);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case 5 for {@