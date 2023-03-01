// FindMaxTest.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {

		@Test
		void testFindMax_null() {
				assertNull(FindMax.findMax(null));
		}
		
		@Test
		void testFindMax_empty() {
				assertNull(FindMax.findMax(new ArrayList<String>()));
		}
		
		@Test
		void testFindMax_one() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				assertEquals("abc", FindMax.findMax(words));
		}
		
		@Test
		void testFindMax_two() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				assertEquals("abcd", FindMax.findMax(words));
		}
		
		@Test
		void testFindMax_three() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				words.add("ab");
				assertEquals("abcd", FindMax.findMax(words));
		}
		
		@Test
		void testFindMax_four() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				words.add("ab");
				words.add("abce");
				assertEquals("abce", FindMax.findMax(words));
		}
		
		@Test
		void testFindMax_five() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				words.add("ab");
				words.add("abce");
				words.add("abcef");
				assertEquals("abcef", FindMax.findMax(words));
		}
		
		@Test
		void testFindMax_six() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				words.add("ab");
				words.add("abce");
				words.add("abcef");
				words.add("abcefg");
				assertEquals("abcefg", FindMax.findMax(words));
		}
		
		@Test
		void testFindMax_seven() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				words.add("ab");
				words.add("abce");
				words.add("abcef");
				words.add("abcefg");
				words.add("abcefgh");
				assertEquals("abcefgh", FindMax.findMax(words));
		}
		
		@Test
		void testFindMax_eight() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				words.add("ab");
				words.add("abce");
				words.add("abcef");
				words.add("abcefg");
				words.add("abcefgh");
				words.add("abcefghi");
				assertEquals("abcefghi", FindMax.findMax(words));
		}
		
		@Test
		void testFindMax_nine() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				words.add("ab");
				words.add("abce");
				words.add("abcef");
				words.add("abcefg");
				words.add("abcefgh");
				words.add("abcefghi");
				words.add("abcefghij");
				assertEquals("abcefghij", FindMax.findMax(words));
		}
		
		@Test
		void testFindMax_ten() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				words.add("ab");
				words.add("abce");
				words.add("abcef");
				words.add("abcefg");
				words.add("abcefgh");
				words.add("abcefghi");
				words.add("abcefghij");
				words.add("abcefghijk");
				assertEquals("abcefghijk", FindMax.findMax(words));
		}
}