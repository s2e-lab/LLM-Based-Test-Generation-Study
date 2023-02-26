// FilterByPrefixTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains ten unit test cases for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {

		@Test
		void testFilterByPrefix_1() {
			List<Object> input = new ArrayList<Object>();
			input.add("abc");
			input.add("bcd");
			input.add("cde");
			input.add("def");
			input.add("efg");
			input.add("fgh");
			input.add("ghi");
			input.add("hij");
			input.add("ijk");
			input.add("jkl");
			input.add("klm");
			input.add("lmn");
			input.add("mno");
			input.add("nop");
			input.add("opq");
			input.add("pqr");
			input.add("qrs");
			input.add("rst");
			input.add("stu");
			input.add("tuv");
			input.add("uvw");
			input.add("vwx");
			input.add("wxy");
			input.add("xyz");
			List<Object> expected = new ArrayList<Object>();
			expected.add("abc");
			expected.add("bcd");
			expected.add("cde");
			expected.add("def");
			expected.add("efg");
			expected.add("fgh");
			expected.add("ghi");
			expected.add("hij");
			expected.add("ijk");
			expected.add("jkl");
			expected.add("klm");
			expected.add("lmn");
			expected.add("mno");
			expected.add("nop");
			expected.add("opq");
			expected.add("pqr");
			expected.add("qrs");
			expected.add("rst");
			expected.add("stu");
			expected.add("tuv");
			expected.add("uvw");
			expected.add("vwx");
			expected.add("wxy");
			expected.add("xyz");
			List<Object> actual = FilterByPrefix.filterByPrefix(input, "");
			assertEquals(expected, actual);
		}
		
		@Test
		void testFilterByPrefix_2() {
			List<Object> input = new ArrayList<Object>();
			input.add("abc");
			input.add("bcd");
			input.add("cde");
			input.add("def");
			input.add("efg");
			input.add("fgh");
			input.add("ghi");
			input.add("hij");
			input.add("ijk");
			input.add("jkl");
			input.add("klm");
			input.add("lmn");
			input.add("mno");
			input.add("nop");
			input.add("opq");
			input.add("pqr");
			input.add("qrs");
			input.add("rst");
			input.add("stu");
			input.add("tuv");
			input.add("uvw");
			input.add("vwx");
			input.add("wxy");
			input.add("xyz");
			List<Object> expected = new ArrayList<Object>();
			expected.add("abc");
			expected.add("bcd");
			expected.add("cde");
			expected.add("def");
			expected.add("efg");
			expected.add("fgh");
			expected.add("ghi");
			expected.add("hij");
			expected.add("ijk");
			expected.add("jkl");
			expected.add("klm");
			expected.add("lmn");
			expected.add("mno");
			expected.add("nop");
			expected.add("opq");
			expected.add("pqr");
			expected.add("qrs");
			expected.add("rst");
			expected.add("stu");
			expected.add("tuv");
			expected.add("uvw");
			expected.add("vwx");
			expected.add("wxy");
			expected.add("xyz");
			List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
			assertEquals(expected, actual);
		}
		
		@Test
		void testFilterByPrefix_3() {
			List<Object> input = new ArrayList<Object>();
			input.add("abc");
			input.add("bcd");
			input.add("cde");
			input.add("def");
			input.add("efg");
			input.add("fgh");
			input.add("ghi");
			input.add("hij");
			input.add("ijk");
			input.add("jkl");
			input.add("klm");
			input.add("lmn");
			input.add("mno");
			input.add("nop");
			input.add("opq");
			input.add("pqr");
			input.add("qrs");
			input.add("rst");
			input.add("stu");
			input.add("tuv");
			input.add("uvw");
			input.add("vwx");
			input.add("wxy");
			input.add("xyz");
			List<Object> expected = new ArrayList<Object>();
			expected.add("abc");
			expected.add("bcd");
			expected.add("cde");
			expected.add("def");
			expected.add("efg");
			expected.add("fgh");
			expected.add("ghi");
			expected.add("hij");
			expected.add("ijk");
			expected.add("jkl");
			expected.add("klm");
			expected.add("lmn");
			expected.add("mno");
			expected.add("nop");
			expected.add("opq");
			expected.add("pqr");
			expected.add("qrs");
			expected.add("rst");
			expected.add("stu");
			expected.add("tuv");
			expected.add("uvw");
			expected.add("vwx");
			expected.add("wxy");
			expected.add("xyz");
			List<Object> actual = FilterByPrefix.filterByPrefix(input, "ab");
			assertEquals(expected, actual);
		}
		
		@Test
		void testFilterByPrefix_4() {
			List<Object> input = new ArrayList<Object>();
			input.add("abc");
			input.add("bcd");
			input.add("cde");
			input.add("def");
			input.add("efg");
			input.add("fgh");
			input.add("ghi");
			input.add("hij");
			input.add("ijk");
			input.add("jkl");
			input.add("klm");
			input.add("lmn");
			input.add("mno");
			input.add("nop");
		