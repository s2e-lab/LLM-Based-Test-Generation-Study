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
		* Test case 1 for {@link Packer#unpacks(byte[])}.
		* It tests the method with a null byte array.
		*/
		@Test
		void testUnpacks1() {
				byte[] b = null;
				assertThrows(NullPointerException.class, () -> {
						Packer.unpacks(b);
				});
		}
		
		/**
		* Test case 2 for {@link Packer#unpacks(byte[])}.
		* It tests the method with an empty byte array.
		*/
		@Test
		void testUnpacks2() {
				byte[] b = new byte[0];
				assertEquals("", Packer.unpacks(b));
		}
		
		/**
		* Test case 3 for {@link Packer#unpacks(byte[])}.
		* It tests the method with a byte array containing a single byte.
		*/
		@Test
		void testUnpacks3() {
				byte[] b = new byte[1];
				b[0] = (byte) 0x00;
				assertEquals("\u0000", Packer.unpacks(b));
		}
		
		/**
		* Test case 4 for {@link Packer#unpacks(byte[])}.
		* It tests the method with a byte array containing a single byte.
		*/
		@Test
		void testUnpacks4() {
				byte[] b = new byte[1];
				b[0] = (byte) 0x7F;
				assertEquals("\u007F", Packer.unpacks(b));
		}
		
		/**
		* Test case 5 for {@link Packer#unpacks(byte[])}.
		* It tests the method with a byte array containing a single byte.
		*/
		@Test
		void testUnpacks5() {
				byte[] b = new byte[1];
				b[0] = (byte) 0x80;
				assertEquals("\u0080", Packer.unpacks(b));
		}
		
		/**
		* Test case 6 for {@link Packer#unpacks(byte[])}.
		* It tests the method with a byte array containing a single byte.
		*/
		@Test
		void testUnpacks6() {
				byte[] b = new byte[1];
				b[0] = (byte) 0xFF;
				assertEquals("\u00FF", Packer.unpacks(b));
		}
		
		/**
		* Test case 7 for {@link Packer#unpacks(byte[])}.
		* It tests the method with a byte array containing two bytes.
		*/
		@Test
		void testUnpacks7() {
				byte[] b = new byte[2];
				b[0] = (byte) 0xC2;
				b[1] = (byte) 0x80;
				assertEquals("\u0080", Packer.unpacks(b));
		}
		
		/**
		* Test case 8 for {@link Packer#unpacks(byte[])}.
		* It tests the method with a byte array containing two bytes.
		*/
		@Test
		void testUnpacks8() {
				byte[] b = new byte[2];
				b[0] = (byte) 0xDF;
				b[1] = (byte) 0xBF;
				assertEquals("\u07FF", Packer.unpacks(b));
		}
		
		/**
		* Test case 9 for {@link Packer#unpacks(byte[])}.
		* It tests the method with a byte array containing three bytes.
		*/
		@Test
		void testUnpacks9() {
				byte[] b = new byte[3];
				b[0] = (byte) 0xE0;
				b[1] = (byte) 0xA0;
				b[2] = (byte) 0x80;
				assertEquals("\u0800", Packer.unpacks(b));
		}
		
		/**
		* Test case 10 for {@link Packer#unpacks(byte[])}.
		* It tests the method with a byte array containing three bytes.
		*/
		@Test
		void testUnpacks10() {
				byte[] b = new byte[3];
				b[0] = (byte) 0xEF;
				b[1] = (byte) 0xBF;
				b[2] = (byte) 0xBF;
				assertEquals("\uFFFF", Packer.unpacks(b));
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
		* Test case 1 for {@link Packer#unpacks(byte[], int, int)}.
		* It tests the method with a null byte array.
		*/
		@Test
		void testUnpacks1() {
				byte[] b = null;
				assertThrows(NullPointerException.class, () -> {
						Packer.unpacks(b, 0, 0);
				});
		}
		
		/**
		* Test case 2 for {@link Packer#unpacks(byte[], int, int)}.
		* It tests the method with an empty byte array.
		*/
		@Test
		void testUnpacks2() {
				byte[] b = new byte[0];
				assertEquals("", Packer.unpacks(b, 0, 0));
		}
		
		/**
		* Test case 3 for {@link Packer#unpacks(byte[], int, int)}.
		* It tests the method with a byte array containing a single byte.
		*/
		@Test
		void testUnpacks3() {
				byte[] b = new byte[1];
				b[0] = (byte) 0x00;
				assertEquals("\u0000", Packer.unpacks(b, 0, 1));
		}
		
		/**
		* Test case 4 for {@link Packer#unpacks(byte[], int, int)}.
		* It tests the method with a byte array containing a single byte.
		*/
		@Test
		void testUnpacks4() {
				byte[] b = new byte[1];
				b[0] = (byte) 0x7F;
				assertEquals("\u007F", Packer.unpacks(b, 0, 1));
		}
		
		/**
		* Test case 5 for {@link Packer#unpacks(byte[], int, int)}.
		* It tests the method with a byte array containing a single byte.
		*/
		@Test
		void testUnpacks5() {
				byte[] b = new byte[1];
				b[0] = (byte) 0x80;
				assertEquals("\u0080", Packer.unpacks(b, 0, 1));
		}
		
		/**
		* Test case 6 for {@link Packer#unpacks(byte[], int, int)}.
		* It tests the method with a byte array containing a single byte.
		*/
		@Test
		void testUnpacks6() {
				byte[] b = new byte[1];
				b[0] = (byte) 0xFF;
				assertEquals("\u00FF", Packer.unpacks(b, 0, 1));
		}
		
		/**
		* Test case 7 for {@link Packer#unpacks(byte[], int, int)}.
		* It tests the method with a byte array containing two bytes.
		*/
		@Test
		void testUnpacks7() {
				byte[] b = new byte[2];
				b[0] = (byte) 0xC2;
				b[1] = (byte) 0x80;
				assertEquals("\u0080", Packer.unpacks(b, 0, 2));
		}
		
		/**
		* Test case 8 for {@link Packer#unpacks(byte[], int, int)}.
		* It tests the method with a byte array containing two bytes.
		*/
		@Test
		void testUnpacks8() {
				byte[] b = new byte[2];
				b[0] = (byte) 0xDF;
				b[1] = (byte) 0xBF;
				assertEquals("\u07FF", Packer.unpacks(b, 0, 2));
		}
		
		/**
		* Test case 9 for {@link Packer#unpacks(byte[], int, int)}.
		* It tests the method with a byte array containing three bytes.
		*/
		@Test
		void testUnpacks9() {
				byte[] b = new byte[3];
				b[0] = (byte) 0xE0;
				b[1] = (byte) 0xA0;
				b[2] = (byte) 0x80;
				assertEquals("\u0800", Packer.unpacks(b, 0, 3));
		}
		
		/**
		* Test case 10 for {@link Packer#unpacks(byte[], int, int)}.
		* It tests the method with a byte array containing three bytes.
		*/
		@Test
		void testUnpacks10() {
				byte[] b = new byte[3];
				b[0] = (byte) 0xEF;
				b[1] = (byte) 0xBF;
				b[2] = (byte) 0xBF;
				assertEquals("\uFFFF", Packer.unpacks(b, 0, 3));
		}
}

// Packer_22Test.java
package util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Packer}.
* It contains ten unit test cases for the {@link Packer#packs(String)} method.
*/
class Packer_22Test {
		
		/**
		* Test case 1 for {@link Packer#packs(String)}.
		* It tests the method with a null string.
		*/
		@Test
		void testPacks1() {
				String s = null;
				assertThrows(NullPointerException.class, () -> {
						Packer.packs(s);
				});
		}
		
		/**
		* Test case 2 for {@link Packer#packs(String)}.
		* It tests the method with an empty string.
		*/
		@Test
		void testPacks2() {
				String s = "";
				byte[] b = Packer.packs(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case 3 for {@link Packer#packs(String)}.
		* It tests the method with a string containing a single character.
		*/
		@Test
		void testPacks3() {
				String s = "\u0000";
				byte[] b = Packer.packs(s);
				assertEquals(1, b.length);
				assertEquals((byte) 0x00, b[0]);
		}
		
		/**
		* Test case 4 for {@link Packer#packs(String)}.
		* It tests the method with a string containing a single character.
		*/
		@Test
		void testPacks4() {
				String s = "\u007F";
				byte[] b = Packer.packs(s);
				assertEquals(1, b.length);
				assertEquals((byte) 0x7F, b[0]);
		}
		
		/**
		* Test case 5 for {@link Packer#packs(String)}.
		* It tests the method with a string containing a single character.
		*/
		@Test
		void testPacks5() {
				String s = "\u0080";
				byte[] b = Packer.packs(s);
				assertEquals(2, b.length);
				assertEquals((byte) 0xC2, b[0]);
				assertEquals((byte) 0x80, b[1]);
		}
		
		/**
		* Test case 6 for {@link Packer#packs(String)}.
		* It tests the method with a string containing a single character.
		*/
		@Test
		void testPacks6() {
				String s = "\u07FF";
				byte[] b = Packer.packs(s);
				assertEquals(2, b.length);
				assertEquals((byte) 0xDF, b[0]);
				assertEquals((byte) 0xBF, b[1]);
		}
		
		/**
		* Test case 7 for {@link Packer#packs(String)}.
		* It tests the method with a string containing a single character.
		*/
		@Test
		void testPacks7() {
				String s = "\u0800";
				byte[] b = Packer.packs(s);
				assertEquals(3, b.length);
				assertEquals((byte) 0xE0, b[0]);
				assertEquals((byte) 0xA0, b[1]);
				assertEquals((byte) 0x80, b[2]);
		}
		
		/**
		* Test case 8 for {@link Packer#packs(String)}.
		* It tests the method with a string containing a single character.
		*/
		@Test
		void testPacks8() {
				String s = "\uFFFF";
				byte[] b = Packer.packs(s);
				assertEquals(3, b.length);
				assertEquals((byte) 0xEF, b[0]);
				assertEquals((byte) 0xBF, b[1]);
				assertEquals((byte) 0xBF, b[2]);
		}
		
		/**
		* Test case 9 for {@link Packer#packs(String)}.
		* It tests the method with a string containing a single character.
		*/
		@Test
		void testPacks9() {
				String