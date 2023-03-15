// Packer_19Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#packs(String)} method.
*/
class Packer_19Test {

		/**
		* Test case for {@link Packer#packs(String)} method.
		* It tests if the method returns the correct byte array for the string "abc".
		*/
		@Test
		void testPacks_1() {
				byte[] expected = {97, 98, 99};
				byte[] actual = Packer.packs("abc");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#packs(String)} method.
		* It tests if the method returns the correct byte array for the string "abcdefghijklmnopqrstuvwxyz".
		*/
		@Test
		void testPacks_2() {
				byte[] expected = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
				byte[] actual = Packer.packs("abcdefghijklmnopqrstuvwxyz");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#packs(String)} method.
		* It tests if the method returns the correct byte array for the string "ABCDEFGHIJKLMNOPQRSTUVWXYZ".
		*/
		@Test
		void testPacks_3() {
				byte[] expected = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
				byte[] actual = Packer.packs("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#packs(String)} method.
		* It tests if the method returns the correct byte array for the string "0123456789".
		*/
		@Test
		void testPacks_4() {
				byte[] expected = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
				byte[] actual = Packer.packs("0123456789");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#packs(String)} method.
		* It tests if the method returns the correct byte array for the string "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".
		*/
		@Test
		void testPacks_5() {
				byte[] expected = {33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 64, 91, 92, 93, 94, 95, 96, 123, 124, 125, 126};
				byte[] actual = Packer.packs("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#packs(String)} method.
		* It tests if the method returns the correct byte array for the string "ÅÄÖåäö".
		*/
		@Test
		void testPacks_6() {
				byte[] expected = {-30, -126, -84, -30, -126, -96, -30, -126, -80, -30, -126, -94, -30, -126, -92};
				byte[] actual = Packer.packs("ÅÄÖåäö");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#packs(String)} method.
		* It tests if the method returns the correct byte array for the string "ÆØÞæøþ".
		*/
		@Test
		void testPacks_7() {
				byte[] expected = {-30, -126, -78, -30, -126, -72, -30, -126, -66, -30, -126, -70, -30, -126, -68};
				byte[] actual = Packer.packs("ÆØÞæøþ");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#packs(String)} method.
		* It tests if the method returns the correct byte array for the string "Ðð".
		*/
		@Test
		void testPacks_8() {
				byte[] expected = {-30, -126, -64, -30, -126, -62};
				byte[] actual = Packer.packs("Ðð");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#packs(String)} method.
		* It tests if the method returns the correct byte array for the string "Ññ".
		*/
		@Test
		void testPacks_9() {
				byte[] expected = {-30, -126, -60, -30, -126, -58};
				byte[] actual = Packer.packs("Ññ");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#packs(String)} method.
		* It tests if the method returns the correct byte array for the string "Ýý".
		*/
		@Test
		void testPacks_10() {
				byte[] expected = {-30, -126, -54, -30, -126, -50};
				byte[] actual = Packer.packs("Ýý");
				assertArrayEquals(expected, actual);
		}
}

// Packer_20Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpacks(byte[])} method.
*/
class Packer_20Test {
		
		/**
		* Test case for {@link Packer#unpacks(byte[])} method.
		* It tests if the method returns the correct string for the byte array {97, 98, 99}.
		*/
		@Test
		void testUnpacks_1() {
				byte[] b = {97, 98, 99};
				String expected = "abc";
				String actual = Packer.unpacks(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#unpacks(byte[])} method.
		* It tests if the method returns the correct string for the byte array {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122}.
		*/
		@Test
		void testUnpacks_2() {
				byte[] b = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
				String expected = "abcdefghijklmnopqrstuvwxyz";
				String actual = Packer.unpacks(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#unpacks(byte[])} method.
		* It tests if the method returns the correct string for the byte array {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90}.
		*/
		@Test
		void testUnpacks_3() {
				byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
				String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String actual = Packer.unpacks(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#unpacks(byte[])} method.
		* It tests if the method returns the correct string for the byte array {48, 49, 50, 51, 52, 53, 54, 55, 56, 57}.
		*/
		@Test
		void testUnpacks_4() {
				byte[] b = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
				String expected = "0123456789";
				String actual = Packer.unpacks(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#unpacks(byte[])} method.
		* It tests if the method returns the correct string for the byte array {33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 64, 91, 92, 93, 94, 95, 96, 123, 124, 125, 126}.
		*/
		@Test
		void testUnpacks_5() {
				byte[] b = {33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 64, 91, 92, 93, 94, 95, 96, 123, 124, 125, 126};
				String expected = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
				String actual = Packer.unpacks(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#unpacks(byte[])} method.
		* It tests if the method returns the correct string for the byte array {-30, -126, -84, -30, -126, -96, -30, -126, -80, -30, -126, -94, -30, -126, -92}.
		*/
		@Test
		void testUnpacks_6() {
				byte[] b = {-30, -126, -84, -30, -126, -96, -30, -126, -80, -30, -126, -94, -30, -126, -92};
				String expected = "ÅÄÖåäö";
				String actual = Packer.unpacks(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#unpacks(byte[])} method.
		* It tests if the method returns the correct string for the byte array {-30, -126, -78, -30, -126, -72, -30, -126, -66, -30, -126, -70, -30, -126, -68}.
		*/
		@Test
		void testUnpacks_7() {
				byte[] b = {-30, -126, -78, -30, -126, -72, -30, -126, -66, -30, -126, -70, -30, -126, -68};
				String expected = "ÆØÞæøþ";
				String actual = Packer.unpacks(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#unpacks(byte[])} method.
		* It tests if the method returns the correct string for the byte array {-30, -126, -64, -30, -126, -62}.
		*/
		@Test
		void testUnpacks_8() {
				byte[] b = {-30, -126, -64, -30, -126, -62};
				String expected = "Ðð";
				String actual = Packer.unpacks(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#unpacks(byte[])} method.
		* It tests if the method returns the correct string for the byte array {-30, -126, -60, -30, -126, -58}.
		*/
		@Test
		void testUnpacks_9() {
				byte[] b = {-30, -126, -60, -30, -126, -58};
				String expected = "Ññ";
				String actual = Packer.unpacks(b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#unpacks(byte[])} method.
		* It tests if the method returns the correct string for the byte array {-30, -126, -54, -30, -126, -50}.
		*/
		@Test
		void testUnpacks_10() {
				byte[] b = {-30, -126, -54, -30, -126, -50};
				String expected = "Ýý";
				String actual = Packer.unpacks(b);
				assertEquals(expected, actual);
		}
}

// Packer_21Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#unpacks(byte[], int, int)} method.
*/
class Packer_21Test {
		
		/**
		* Test case for {@link Packer#unpacks(byte[], int, int)} method.
		* It tests if the method returns the correct string for the byte array {97, 98, 99} and the offset 0 and length 3.
		*/
		@Test
		void testUnpacks_1() {
				byte[] b = {97, 98, 99};
				String expected = "abc";
				String actual = Packer.unpacks(b, 0, 3);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Packer#unpacks(byte[], int, int)} method.
		* It tests if the method returns the correct string for the byte array {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116