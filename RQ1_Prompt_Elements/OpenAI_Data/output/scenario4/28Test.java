// ConcatenateTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

	@Test
	void testConcatenate_emptyList() {
		List<Object> list = List.of();
		assertEquals("", Concatenate.concatenate(list));
	}
	
	@Test
	void testConcatenate_singleElement() {
		List<Object> list = List.of("a");
		assertEquals("a", Concatenate.concatenate(list));
	}
	
	@Test
	void testConcatenate_multipleElements() {
		List<Object> list = List.of("a", "b", "c");
		assertEquals("abc", Concatenate.concatenate(list));
	}
	
	@Test
	void testConcatenate_emptyList_2() {
		List<Object> list = List.of();
		assertEquals("", Concatenate.concatenate(list));
	}
	
	@Test
	void testConcatenate_singleElement_2() {
		List<Object> list = List.of("x");
		assertEquals("x", Concatenate.concatenate(list));
	}
	
	@Test
	void testConcatenate_multipleElements_2() {
		List<Object> list = List.of("x", "y", "z");
		assertEquals("xyz", Concatenate.concatenate(list));
	}
	
	@Test
	void testConcatenate_multipleElements_3() {
		List<Object> list = List.of("x", "y", "z", "w", "k");
		assertEquals("xyzwk", Concatenate.concatenate(list));
	}
	
	@Test
	void testConcatenate_multipleElements_4() {
		List<Object> list = List.of("x", "y", "z", "w", "k", "a", "b", "c", "d", "e");
		assertEquals("xyzwkabcde", Concatenate.concatenate(list));
	}
	
	@Test
	void testConcatenate_multipleElements_5() {
		List<Object> list = List.of("x", "y", "z", "w", "k", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
		assertEquals("xyzwkabcdefghij", Concatenate.concatenate(list));
	}
	
	@Test
	void testConcatenate_multipleElements_6() {
		List<Object> list = List.of("x", "y", "z", "w", "k", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "m", "n", "o", "p");
		assertEquals("xyzwkabcdefghijlmnop", Concatenate.concatenate(list));
	}
}