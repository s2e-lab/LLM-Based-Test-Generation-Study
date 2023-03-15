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
		}
		
		/**
		* Test case 6 for {@link Packer#unpackf(byte[])}.
		* It tests the method with a float value of 0.25.
		*/
		@Test
		void testUnpackf_6() {
				byte[] b = {0, 0, 0, 62};
				float f = Packer.unpackf(b);
				assertEquals(0.25, f);
		}
		
		/**
		* Test case 7 for {@link Packer#unpackf(byte[])}.
		* It tests the method with a float value of -0.25.
		*/
		@Test
		void testUnpackf_7() {
				byte[] b = {0, 0, 0, -66};
				float f = Packer.unpackf(b);
				assertEquals(-0.25, f);
		}
		
		/**
		* Test case 8 for {@link Packer#unpackf(byte[])}.
		* It tests the method with a float value of 0.75.
		*/
		@Test
		void testUnpackf_8() {
				byte[] b = {0, 0, 0, 64};
				float f = Packer.unpackf(b);
				assertEquals(0.75, f);
		}
		
		/**
		* Test case 9 for {@link Packer#unpackf(byte[])}.
		* It tests the method with a float value of -0.75.
		*/
		@Test
		void testUnpackf_9() {
				byte[] b = {0, 0, 0, -64};
				float f = Packer.unpackf(b);
				assertEquals(-0.75, f);
		}
		
		/**
		* Test case 10 for {@link Packer#unpackf(byte[])}.
		* It tests the method with a float value of 0.125.
		*/
		@Test
		void testUnpackf_10() {
				byte[] b = {0, 0, 0, 61};
				float f = Packer.unpackf(b);
				assertEquals(0.125, f);
		}
}

// Packer_19Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpacki(byte[])} method.
*/
class Packer_19Test {
		
		/**
		* Test case 1 for {@link Packer#unpacki(byte[])}.
		* It tests the method with an integer value of 0.
		*/
		@Test
		void testUnpacki_1() {
				byte[] b = {0, 0, 0, 0};
				int i = Packer.unpacki(b);
				assertEquals(0, i);
		}
		
		/**
		* Test case 2 for {@link Packer#unpacki(byte[])}.
		* It tests the method with an integer value of 1.
		*/
		@Test
		void testUnpacki_2() {
				byte[] b = {0, 0, 0, 1};
				int i = Packer.unpacki(b);
				assertEquals(1, i);
		}
		
		/**
		* Test case 3 for {@link Packer#unpacki(byte[])}.
		* It tests the method with an integer value of -1.
		*/
		@Test
		void testUnpacki_3() {
				byte[] b = {-1, -1, -1, -1};
				int i = Packer.unpacki(b);
				assertEquals(-1, i);
		}
		
		/**
		* Test case 4 for {@link Packer#unpacki(byte[])}.
		* It tests the method with an integer value of 2147483647.
		*/
		@Test
		void testUnpacki_4() {
				byte[] b = {127, -1, -1, -1};
				int i = Packer.unpacki(b);
				assertEquals(2147483647, i);
		}
		
		/**
		* Test case 5 for {@link Packer#unpacki(byte[])}.
		* It tests the method with an integer value of -2147483648.
		*/
		@Test
		void testUnpacki_5() {
				byte[] b = {-128, 0, 0, 0};
				int i = Packer.unpacki(b);
				assertEquals(-2147483648, i);
		}
		
		/**
		* Test case 6 for {@link Packer#unpacki(byte[])}.
		* It tests the method with an integer value of 2147483646.
		*/
		@Test
		void testUnpacki_6() {
				byte[] b = {126, -1, -1, -1};
				int i = Packer.unpacki(b);
				assertEquals(2147483646, i);
		}
		
		/**
		* Test case 7 for {@link Packer#unpacki(byte[])}.
		* It tests the method with an integer value of -2147483647.
		*/
		@Test
		void testUnpacki_7() {
				byte[] b = {-127, 0, 0, 0};
				int i = Packer.unpacki(b);
				assertEquals(-2147483647, i);
		}
		
		/**
		* Test case 8 for {@link Packer#unpacki(byte[])}.
		* It tests the method with an integer value of 1073741823.
		*/
		@Test
		void testUnpacki_8() {
				byte[] b = {63, -1, -1, -1};
				int i = Packer.unpacki(b);
				assertEquals(1073741823, i);
		}
		
		/**
		* Test case 9 for {@link Packer#unpacki(byte[])}.
		* It tests the method with an integer value of -1073741824.
		*/
		@Test
		void testUnpacki_9() {
				byte[] b = {-64, 0, 0, 0};
				int i = Packer.unpacki(b);
				assertEquals(-1073741824, i);
		}
		
		/**
		* Test case 10 for {@link Packer#unpacki(byte[])}.
		* It tests the method with an integer value of 1073741822.
		*/
		@Test
		void testUnpacki_10() {
				byte[] b = {62, -1, -1, -1};
				int i = Packer.unpacki(b);
				assertEquals(1073741822, i);
		}
}

// Packer_20Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assert