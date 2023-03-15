// Utils_4Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#nChars(int, char)} method.
*/
class Utils_4Test {

	@Test
	void test_nChars_1() {
		assertEquals("", Utils.nChars(0, 'a'));
	}
	
	@Test
	void test_nChars_2() {
		assertEquals("a", Utils.nChars(1, 'a'));
	}
	
	@Test
	void test_nChars_3() {
		assertEquals("aa", Utils.nChars(2, 'a'));
	}
	
	@Test
	void test_nChars_4() {
		assertEquals("aaa", Utils.nChars(3, 'a'));
	}
	
	@Test
	void test_nChars_5() {
		assertEquals("aaaa", Utils.nChars(4, 'a'));
	}
	
	@Test
	void test_nChars_6() {
		assertEquals("aaaaa", Utils.nChars(5, 'a'));
	}
	
	@Test
	void test_nChars_7() {
		assertEquals("aaaaaa", Utils.nChars(6, 'a'));
	}
	
	@Test
	void test_nChars_8() {
		assertEquals("aaaaaaa", Utils.nChars(7, 'a'));
	}
	
	@Test
	void test_nChars_9() {
		assertEquals("aaaaaaaa", Utils.nChars(8, 'a'));
	}
	
	@Test
	void test_nChars_10() {
		assertEquals("aaaaaaaaa", Utils.nChars(9, 'a'));
	}
}