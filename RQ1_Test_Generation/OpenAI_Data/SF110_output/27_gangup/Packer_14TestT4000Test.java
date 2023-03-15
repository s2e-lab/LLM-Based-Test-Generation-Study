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
		}
		
		/**
		* Test case 7 for {@link Packer#packd(double)}.
		* It tests the normal case.
		*/
		@Test
		void testPackd_7() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, 3};
				byte[] actual = Packer.packd(3.0);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link Packer#packd(double)}.
		* It tests the normal case.
		*/
		@Test
		void testPackd_8() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, -4};
				byte[] actual = Packer.packd(-4.0);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link Packer#packd(double)}.
		* It tests the normal case.
		*/
		@Test
		void testPackd_9() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, 4};
				byte[] actual = Packer.packd(4.0);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link Packer#packd(double)}.
		* It tests the normal case.
		*/
		@Test
		void testPackd_10() {
				byte[] expected = {0, 0, 0, 0, 0, 0, 0, -5};
				byte[] actual = Packer.packd(-5.0);
				assertArrayEquals(expected, actual);
		}
}

// Packer_16Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#packf(float)} method.
*/
class Packer_16Test {
		
		/**
		* Test case 1 for {@link Packer#packf(float)}.
		* It tests the normal case.
		*/
		@Test
		void testPackf_1() {
				byte[] expected = {0, 0, 0, 0};
				byte[] actual = Packer.packf(0.0f);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link Packer#packf(float)}.
		* It tests the normal case.
		*/
		@Test
		void testPackf_2() {
				byte[] expected = {0, 0, 0, -1};
				byte[] actual = Packer.packf(-1.0f);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link Packer#packf(float)}.
		* It tests the normal case.
		*/
		@Test
		void testPackf_3() {
				byte[] expected = {0, 0, 0, 1};
				byte[] actual = Packer.packf(1.0f);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link Packer#packf(float)}.
		* It tests the normal case.
		*/
		@Test
		void testPackf_4() {
				byte[] expected = {0, 0, 0, -2};
				byte[] actual = Packer.packf(-2.0f);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link Packer#packf(float)}.
		* It tests the normal case.
		*/
		@Test
		void testPackf_5() {
				byte[] expected = {0, 0, 0, 2};
				byte[] actual = Packer.packf(2.0f);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link Packer#packf(float)}.
		* It tests the normal case.
		*/
		@Test
		void testPackf_6() {
				byte[] expected = {0, 0, 0, -3};
				byte[] actual = Packer.packf(-3.0f);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link Packer#packf(float)}.
		* It tests the normal case.
		*/
		@Test
		void testPackf_7() {
				byte[] expected = {0, 0, 0, 3};
				byte[] actual = Packer.packf(3.0f);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link Packer#packf(float)}.
		* It tests the normal case.
		*/
		@Test
		void testPackf_8() {
				byte[] expected = {0, 0, 0, -4};
				byte[] actual = Packer.packf(-4.0f);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link Packer#packf(float)}.
		* It tests the normal case.
		*/
		@Test
		void testPackf_9() {
				byte[] expected = {0, 0, 0, 4};
				byte[] actual = Packer.packf(4.0f);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link Packer#packf(float)}.
		* It tests the normal case.
		*/
		@Test
		void testPackf_10() {
				byte[] expected = {0, 0, 0, -5};
				byte[] actual = Packer.packf(-5.0f);
				assertArrayEquals(expected, actual);
		}
}

// Packer_17Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#packi(int)} method.
*/
class Packer_17Test {
		
		/**
		* Test case 1 for {@link Packer#packi(int)}.
		* It tests the normal case.
		*/
		@Test
		void testPacki_1() {
				byte[] expected = {0, 0, 0, 1};
				byte[] actual = Packer.packi(1);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link Packer#packi(int)}.
		* It tests the normal case.
		*/
		@Test
		void testPacki_2() {
				byte[] expected = {0, 0, 0, -1};
			