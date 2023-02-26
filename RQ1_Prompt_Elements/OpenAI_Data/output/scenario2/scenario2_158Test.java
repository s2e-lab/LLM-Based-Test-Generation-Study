// FindMaxTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {

	@Test
	void testFindMax() {
		List<String> words = List.of("abc", "abcd", "abcde", "abcdef");
		assertEquals("abcdef", FindMax.findMax(words));
	}
	
	@Test
	void testFindMax2() {
		List<String> words = List.of("abc", "abcd", "abcde", "abcdef", "abcdefg");
		assertEquals("abcdefg", FindMax.findMax(words));
	}
	
	@Test
	void testFindMax3() {
		List<String> words = List.of("abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh");
		assertEquals("abcdefgh", FindMax.findMax(words));
	}
	
	@Test
	void testFindMax4() {
		List<String> words = List.of("abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi");
		assertEquals("abcdefghi", FindMax.findMax(words));
	}
	
	@Test
	void testFindMax5() {
		List<String> words = List.of("abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij");
		assertEquals("abcdefghij", FindMax.findMax(words));
	}
	
	@Test
	void testFindMax6() {
		List<String> words = List.of("abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk");
		assertEquals("abcdefghijk", FindMax.findMax(words));
	}
	
	@Test
	void testFindMax7() {
		List<String> words = List.of("abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl");
		assertEquals("abcdefghijkl", FindMax.findMax(words));
	}
	
	@Test
	void testFindMax8() {
		List<String> words = List.of("abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl", "abcdefghijklm");
		assertEquals("abcdefghijklm", FindMax.findMax(words));
	}
	
	@Test
	void testFindMax9() {
		List<String> words = List.of("abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl", "abcdefghijklm", "abcdefghijklmn");
		assertEquals("abcdefghijklmn", FindMax.findMax(words));
	}
	
	@Test
	void testFindMax10() {
		List<String> words = List.of("abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl", "abcdefghijklm", "abcdefghijklmn", "abcdefghijklmno");
		assertEquals("abcdefghijklmno", FindMax.findMax(words));
	}
}