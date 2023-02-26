// TotalMatchTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {

	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* Both lists are empty.
	*/
	@Test
	void testTotalMatch_BothListsEmpty() {
		List<Object> lst1 = List.of();
		List<Object> lst2 = List.of();
		List<Object> expected = List.of();
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* First list is empty.
	*/
	@Test
	void testTotalMatch_FirstListEmpty() {
		List<Object> lst1 = List.of();
		List<Object> lst2 = List.of("a", "b", "c");
		List<Object> expected = List.of();
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* Second list is empty.
	*/
	@Test
	void testTotalMatch_SecondListEmpty() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of();
		List<Object> expected = List.of("a", "b", "c");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* Both lists have same number of chars.
	*/
	@Test
	void testTotalMatch_BothListsSameNumberOfChars() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of("d", "e", "f");
		List<Object> expected = List.of("a", "b", "c");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* First list has more number of chars.
	*/
	@Test
	void testTotalMatch_FirstListMoreNumberOfChars() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of("d", "e");
		List<Object> expected = List.of("d", "e");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* Second list has more number of chars.
	*/
	@Test
	void testTotalMatch_SecondListMoreNumberOfChars() {
		List<Object> lst1 = List.of("a", "b");
		List<Object> lst2 = List.of("d", "e", "f");
		List<Object> expected = List.of("a", "b");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* First list has more number of chars.
	* Second list has more number of chars.
	*/
	@Test
	void testTotalMatch_BothListsMoreNumberOfChars() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of("d", "e", "f", "g");
		List<Object> expected = List.of("d", "e", "f", "g");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* First list has more number of chars.
	* Second list has more number of chars.
	*/
	@Test
	void testTotalMatch_BothListsMoreNumberOfChars2() {
		List<Object> lst1 = List.of("a", "b", "c", "d");
		List<Object> lst2 = List.of("e", "f", "g");
		List<Object> expected = List.of("e", "f", "g");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* First list has more number of chars.
	* Second list has more number of chars.
	*/
	@Test
	void testTotalMatch_BothListsMoreNumberOfChars3() {
		List<Object> lst1 = List.of("a", "b", "c", "d", "e");
		List<Object> lst2 = List.of("f", "g", "h", "i");
		List<Object> expected = List.of("f", "g", "h", "i");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* First list has more number of chars.
	* Second list has more number of chars.
	*/
	@Test
	void testTotalMatch_BothListsMoreNumberOfChars4() {
		List<Object> lst1 = List.of("a", "b", "c", "d", "e", "f");
		List<Object> lst2 = List.of("g", "h", "i", "j", "k");
		List<Object> expected = List.of("g", "h", "i", "j", "k");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* First list has more number of chars.
	* Second list has more number of chars.
	*/
	@Test
	void testTotalMatch_BothListsMoreNumberOfChars5() {
		List<Object> lst1 = List.of("a", "b", "c", "d", "e", "f", "g");
		List<Object> lst2 = List.of("h", "i", "j", "k", "l", "m");
		List<Object> expected = List.of("h", "i", "j", "k", "l", "m");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
}