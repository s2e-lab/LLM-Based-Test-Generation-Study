// VowelsCountTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {

		@Test
		void testVowelsCount_1() {
			assertEquals(0, VowelsCount.vowelsCount(""));
		}
		
		@Test
		void testVowelsCount_2() {
			assertEquals(1, VowelsCount.vowelsCount("a"));
		}
		
		@Test
		void testVowelsCount_3() {
			assertEquals(1, VowelsCount.vowelsCount("e"));
		}
		
		@Test
		void testVowelsCount_4() {
			assertEquals(1, VowelsCount.vowelsCount("i"));
		}
		
		@Test
		void testVowelsCount_5() {
			assertEquals(1, VowelsCount.vowelsCount("o"));
		}
		
		@Test
		void testVowelsCount_6() {
			assertEquals(1, VowelsCount.vowelsCount("u"));
		}
		
		@Test
		void testVowelsCount_7() {
			assertEquals(1, VowelsCount.vowelsCount("A"));
		}
		
		@Test
		void testVowelsCount_8() {
			assertEquals(1, VowelsCount.vowelsCount("E"));
		}
		
		@Test
		void testVowelsCount_9() {
			assertEquals(1, VowelsCount.vowelsCount("I"));
		}
		
		@Test
		void testVowelsCount_10() {
			assertEquals(1, VowelsCount.vowelsCount("O"));
		}
		
		@Test
		void testVowelsCount_11() {
			assertEquals(1, VowelsCount.vowelsCount("U"));
		}
		
		@Test
		void testVowelsCount_12() {
			assertEquals(1, VowelsCount.vowelsCount("y"));
		}
		
		@Test
		void testVowelsCount_13() {
			assertEquals(1, VowelsCount.vowelsCount("Y"));
		}
		
		@Test
		void testVowelsCount_14() {
			assertEquals(2, VowelsCount.vowelsCount("ae"));
		}
		
		@Test
		void testVowelsCount_15() {
			assertEquals(2, VowelsCount.vowelsCount("ei"));
		}
		
		@Test
		void testVowelsCount_16() {
			assertEquals(2, VowelsCount.vowelsCount("io"));
		}
		
		@Test
		void testVowelsCount_17() {
			assertEquals(2, VowelsCount.vowelsCount("ou"));
		}
		
		@Test
		void testVowelsCount_18() {
			assertEquals(2, VowelsCount.vowelsCount("uy"));
		}
		
		@Test
		void testVowelsCount_19() {
			assertEquals(2, VowelsCount.vowelsCount("AE"));
		}
		
		@Test
		void testVowelsCount_20() {
			assertEquals(2, VowelsCount.vowelsCount("EI"));
		}
		
		@Test
		void testVowelsCount_21() {
			assertEquals(2, VowelsCount.vowelsCount("IO"));
		}
		
		@Test
		void testVowelsCount_22() {
			assertEquals(2, VowelsCount.vowelsCount("OU"));
		}
		
		@Test
		void testVowelsCount_23() {
			assertEquals(2, VowelsCount.vowelsCount("UY"));
		}
		
		@Test
		void testVowelsCount_24() {
			assertEquals(2, VowelsCount.vowelsCount("aei"));
		}
		
		@Test
		void testVowelsCount_25() {
			assertEquals(2, VowelsCount.vowelsCount("eio"));
		}
		
		@Test
		void testVowelsCount_26() {
			assertEquals(2, VowelsCount.vowelsCount("iou"));
		}
		
		@Test
		void testVowelsCount_27() {
			assertEquals(2, VowelsCount.vowelsCount("ouy"));
		}
		
		@Test
		void testVowelsCount_28() {
			assertEquals(2, VowelsCount.vowelsCount("AEI"));
		}
		
		@Test
		void testVowelsCount_29() {
			assertEquals(2, VowelsCount.vowelsCount("EIO"));
		}
		
		@Test
		void testVowelsCount_30() {
			assertEquals(2, VowelsCount.vowelsCount("IOU"));
		}
		
		@Test
		void testVowelsCount_31() {
			assertEquals(2, VowelsCount.vowelsCount("OUY"));
		}
		
		@Test
		void testVowelsCount_32() {
			assertEquals(3, VowelsCount.vowelsCount("aeio"));
		}
		
		@Test
		void testVowelsCount_33() {
			assertEquals(3, VowelsCount.vowelsCount("eioi"));
		}
		
		@Test
		void testVowelsCount_34() {
			assertEquals(3, VowelsCount.vowelsCount("ioou"));
		}
		
		@Test
		void testVowelsCount_35() {
			assertEquals(3, VowelsCount.vowelsCount("ouuy"));
		}
		
		@Test
		void testVowelsCount_36() {
			assertEquals(3, VowelsCount.vowelsCount("AEIO"));
		}
		
		@Test
		void testVowelsCount_37() {
			assertEquals(3, VowelsCount.vowelsCount("EIOI"));
		}
		
		@Test
		void testVowelsCount_38() {
			assertEquals(3, VowelsCount.vowelsCount("IOUO"));
		}
		
		@Test
		void testVowelsCount_39() {
			assertEquals(3, VowelsCount.vowelsCount("OUUY"));
		}
		
		@Test
		void testVowelsCount_40() {
			assertEquals(4, VowelsCount.vowelsCount("aeiou"));
		}
		
		@Test
		void testVowelsCount_41() {
			assertEquals(4, VowelsCount.vowelsCount("eioiu"));
		}
		
		@Test
		void testVowelsCount_42() {
			assertEquals(4, VowelsCount.vowelsCount("ioouy"));
		}
		
		@Test