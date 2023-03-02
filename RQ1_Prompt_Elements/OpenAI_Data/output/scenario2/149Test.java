// SortedListSumTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {
/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings
	* when the input list contains only strings with even length.
	*/
	@Test
	void testSortedListSum_1() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		lst.add("hhhhhhhh");
		lst.add("iiiiiiiii");
		lst.add("jjjjjjjjjj");
		List<Object> result = new ArrayList<Object>();
		result.add("a");
		result.add("bb");
		result.add("ccc");
		result.add("dddd");
		result.add("eeeee");
		result.add("ffffff");
		result.add("ggggggg");
		result.add("hhhhhhhh");
		result.add("iiiiiiiii");
		result.add("jjjjjjjjjj");
		Collections.sort(result, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1.toString().length() == o2.toString().length()) {
					return o1.toString().compareTo(o2.toString());
				} else {
					return o1.toString().length() - o2.toString().length();
				}
			}
		});
		assertEquals(result, SortedListSum.sortedListSum(lst));
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings
	* when the input list contains only strings with odd length.
	*/
	@Test
	void testSortedListSum_2() {
		List<String> lst = new ArrayList<String>();
		lst.add("aa");
		lst.add("bbb");
		lst.add("cccc");
		lst.add("ddddd");
		lst.add("eeeeee");
		lst.add("fffffff");
		lst.add("gggggggg");
		lst.add("hhhhhhhhh");
		lst.add("iiiiiiiiii");
		lst.add("jjjjjjjjjjj");
		List<Object> result = new ArrayList<Object>();
		Collections.sort(result, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1.toString().length() == o2.toString().length()) {
					return o1.toString().compareTo(o2.toString());
				} else {
					return o1.toString().length() - o2.toString().length();
				}
			}
		});
		assertEquals(result, SortedListSum.sortedListSum(lst));
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings
	* when the input list contains strings with both even and odd length.
	*/
	@Test
	void testSortedListSum_3() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		lst.add("hhhhhhhh");
		lst.add("iiiiiiiii");
		lst.add("jjjjjjjjjj");
		lst.add("aa");
		lst.add("bbb");
		lst.add("cccc");
		lst.add("ddddd");
		lst.add("eeeeee");
		lst.add("fffffff");
		lst.add("gggggggg");
		lst.add("hhhhhhhhh");
		lst.add("iiiiiiiiii");
		lst.add("jjjjjjjjjjj");
		List<Object> result = new ArrayList<Object>();
		result.add("a");
		result.add("bb");
		result.add("ccc");
		result.add("dddd");
		result.add("eeeee");
		result.add("ffffff");
		result.add("ggggggg");
		result.add("hhhhhhhh");
		result.add("iiiiiiiii");
		result.add("jjjjjjjjjj");
		Collections.sort(result, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1.toString().length() == o2.toString().length()) {
					return o1.toString().compareTo(o2.toString());
				} else {
					return o1.toString().length() - o2.toString().length();
				}
			}
		});
		assertEquals(result, SortedListSum.sortedListSum(lst));
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings
	* when the input list contains strings with both even and odd length,
	* and the list contains duplicates.
	*/
	@Test
	void testSortedListSum_4() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		lst.add("hhhhhhhh");
		lst.add("iiiiiiiii");
		lst.add("jjjjjjjjjj");
		lst.add("aa");
		lst.add("bbb");
		lst.add("cccc");
		lst.add("ddddd");
		lst.add("eeeeee");
		lst.add("fffffff");
		lst.add("gggggggg");
		lst.add("hhhhhhhhh");
		lst.add("iiiiiiiiii");
		lst.add("jjjjjjjjjjj");
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		lst.add("hhhhhhhh");
		lst.add("iiiiiiiii");
		lst.add("jjjjjjjjjj");
		lst.add("aa");
		lst.add("bbb");
		lst.add("cccc");
		lst.add("ddddd");
		lst.add("eeeeee");
		lst.add("fffffff");
		lst.add("gggggggg");
		lst.add("hhhhhhhhh");
		lst.add("