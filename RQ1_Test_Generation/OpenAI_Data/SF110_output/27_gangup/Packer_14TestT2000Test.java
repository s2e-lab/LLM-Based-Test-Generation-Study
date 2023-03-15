// Packer_14Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#packl(long)} method.
*/
class Packer_14Test {

		/**
		* Test case 1 for {@link Packer#packl(long)}.
		* It tests the normal case.
		*/
		@Test
		void testPackl_1() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, 1};
				byte[] actual = Packer.packl(1);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link Packer#packl(long)}.
		* It tests the normal case.
		*/
		@Test
		void testPackl_2() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, -1};
				byte[] actual = Packer.packl(-1);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link Packer#packl(long)}.
		* It tests the normal case.
		*/
		@Test
		void testPackl_3() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, 0};
				byte[] actual = Packer.packl(0);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link Packer#packl(long)}.
		* It tests the normal case.
		*/
		@Test
		void testPackl_4() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, -128};
				byte[] actual = Packer.packl(-128);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link Packer#packl(long)}.
		* It tests the normal case.
		*/
		@Test
		void testPackl_5() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, 127};
				byte[] actual = Packer.packl(127);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link Packer#packl(long)}.
		* It tests the normal case.
		*/
		@Test
		void testPackl_6() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, -2};
				byte[] actual = Packer.packl(-2);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link Packer#packl(long)}.
		* It tests the normal case.
		*/
		@Test
		void testPackl_7() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, 2};
				byte[] actual = Packer.packl(2);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link Packer#packl(long)}.
		* It tests the normal case.
		*/
		@Test
		void testPackl_8() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, -3};
				byte[] actual = Packer.packl(-3);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link Packer#packl(long)}.
		* It tests the normal case.
		*/
		@Test
		void testPackl_9() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, 3};
				byte[] actual = Packer.packl(3);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link Packer#packl(long)}.
		* It tests the normal case.
		*/
		@Test
		void testPackl_10() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, -4};
				byte[] actual = Packer.packl(-4);
				assertArrayEquals(expected, actual);
		}
}

// Packer_15Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#packd(double)} method.
*/
class Packer_15Test {
		
		/**
		* Test case 1 for {@link Packer#packd(double)}.
		* It tests the normal case.
		*/
		@Test
		void testPackd_1() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, 0};
				byte[] actual = Packer.packd(0.0);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link Packer#packd(double)}.
		* It tests the normal case.
		*/
		@Test
		void testPackd_2() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, -1};
				byte[] actual = Packer.packd(-1.0);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link Packer#packd(double)}.
		* It tests the normal case.
		*/
		@Test
		void testPackd_3() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, 1};
				byte[] actual = Packer.packd(1.0);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link Packer#packd(double)}.
		* It tests the normal case.
		*/
		@Test
		void testPackd_4() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, -2};
				byte[] actual = Packer.packd(-2.0);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link Packer#packd(double)}.
		* It tests the normal case.
		*/
		@Test
		void testPackd_5() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, 2};
				byte[] actual = Packer.packd(2.0);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link Packer#packd(double)}.
		* It tests the normal case.
		*/
		@Test
		void testPackd_6() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, -3};
				byte[] actual = Packer.packd(-3.0);
				assertArrayEquals(expected, actual);
		