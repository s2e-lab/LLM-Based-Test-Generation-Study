// HexKeyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {

		/**
		* Test case 1 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey1() {
				String hex = "0x2A";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey2() {
				String hex = "0x2A3";
				int expected = 2;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey3() {
				String hex = "0x2A3B";
				int expected = 3;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey4() {
				String hex = "0x2A3B5";
				int expected = 4;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey5() {
				String hex = "0x2A3B5D";
				int expected = 5;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey6() {
				String hex = "0x2A3B5D7";
				int expected = 6;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey7() {
				String hex = "0x2A3B5D7B";
				int expected = 7;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey8() {
				String hex = "0x2A3B5D7B9";
				int expected = 7;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey9() {
				String hex = "0x2A3B5D7B9C";
				int expected = 7;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey10() {
				String hex = "0x2A3B5D7B9C2";
				int expected = 8;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
}

// HexKeyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {
		
		/**
		* Test case 1 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey1() {
				String hex = "0x2A";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey2() {
				String hex = "0x2A3";
				int expected = 2;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey3() {
				String hex = "0x2A3B";
				int expected = 3;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey4() {
				String hex = "0x2A3B5";
				int expected = 4;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey5() {
				String hex = "0x2A3B5D";
				int expected = 5;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey6() {
				String hex = "0x2A3B5D7";
				