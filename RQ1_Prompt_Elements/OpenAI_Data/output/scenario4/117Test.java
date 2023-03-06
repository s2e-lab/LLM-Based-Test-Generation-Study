// SelectWordsTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains ten unit test cases for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {

	@Test
	void testSelectWords1() {
		List<Object> expected = new ArrayList<>();
		expected.add("little");
		assertEquals(expected, SelectWords.selectWords("Mary had a little lamb", 4));
	}
	
	@Test
	void testSelectWords2() {
		List<Object> expected = new ArrayList<>();
		expected.add("Mary");
		expected.add("lamb");
		assertEquals(expected, SelectWords.selectWords("Mary had a little lamb", 3));
	}
	
	@Test
	void testSelectWords3() {
		List<Object> expected = new ArrayList<>();
		assertEquals(expected, SelectWords.selectWords("simple white space", 2));
	}
	
	@Test
	void testSelectWords4() {
		List<Object> expected = new ArrayList<>();
		expected.add("world");
		assertEquals(expected, SelectWords.selectWords("Hello world", 4));
	}
	
	@Test
	void testSelectWords5() {
		List<Object> expected = new ArrayList<>();
		expected.add("Uncle");
		assertEquals(expected, SelectWords.selectWords("Uncle sam", 3));
	}
	
	@Test
	void testSelectWords6() {
		List<Object> expected = new ArrayList<>();
		assertEquals(expected, SelectWords.selectWords("", 4));
	}
	
	@Test
	void testSelectWords7() {
		List<Object> expected = new ArrayList<>();
		expected.add("b");
		expected.add("c");
		expected.add("d");
		expected.add("f");
		assertEquals(expected, SelectWords.selectWords("a b c d e f", 1));
	}
	
	@Test
	void testSelectWords8() {
		List<Object> expected = new ArrayList<>();
		expected.add("a");
		expected.add("b");
		expected.add("c");
		expected.add("d");
		expected.add("e");
		expected.add("f");
		assertEquals(expected, SelectWords.selectWords("a b c d e f", 0));
	}
	
	@Test
	void testSelectWords9() {
		List<Object> expected = new ArrayList<>();
		expected.add("a");
		expected.add("b");
		expected.add("c");
		expected.add("d");
		expected.add("e");
		expected.add("f");
		assertEquals(expected, SelectWords.selectWords("a b c d e f", -1));
	}
	
	@Test
	void testSelectWords10() {
		List<Object> expected = new ArrayList<>();
		assertEquals(expected, SelectWords.selectWords("a b c d e f", 7));
	}
}