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
		void testFindMax_1() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				words.add("abcde");
				words.add("abcdef");
				words.add("abcdefg");
				words.add("abcdefgh");
				words.add("abcdefghi");
				words.add("abcdefghij");
				words.add("abcdefghijk");
				words.add("abcdefghijkl");
				words.add("abcdefghijklm");
				words.add("abcdefghijklmn");
				words.add("abcdefghijklmno");
				words.add("abcdefghijklmnop");
				words.add("abcdefghijklmnopq");
				words.add("abcdefghijklmnopqr");
				words.add("abcdefghijklmnopqrs");
				words.add("abcdefghijklmnopqrst");
				words.add("abcdefghijklmnopqrstu");
				words.add("abcdefghijklmnopqrstuv");
				words.add("abcdefghijklmnopqrstuvw");
				words.add("abcdefghijklmnopqrstuvwx");
				words.add("abcdefghijklmnopqrstuvwxy");
				words.add("abcdefghijklmnopqrstuvwxyz");
				assertEquals("abcdefghijklmnopqrstuvwxyz", FindMax.findMax(words));
		}
		
		@Test
		void testFindMax_2() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				words.add("abcde");
				words.add("abcdef");
				words.add("abcdefg");
				words.add("abcdefgh");
				words.add("abcdefghi");
				words.add("abcdefghij");
				words.add("abcdefghijk");
				words.add("abcdefghijkl");
				words.add("abcdefghijklm");
				words.add("abcdefghijklmn");
				words.add("abcdefghijklmno");
				words.add("abcdefghijklmnop");
				words.add("abcdefghijklmnopq");
				words.add("abcdefghijklmnopqr");
				words.add("abcdefghijklmnopqrs");
				words.add("abcdefghijklmnopqrst");
				words.add("abcdefghijklmnopqrstu");
				words.add("abcdefghijklmnopqrstuv");
				words.add("abcdefghijklmnopqrstuvw");
				words.add("abcdefghijklmnopqrstuvwx");
				words.add("abcdefghijklmnopqrstuvwxy");
				words.add("abcdefghijklmnopqrstuvwxyz");
				words.add("abcdefghijklmnopqrstuvwxyza");
				words.add("abcdefghijklmnopqrstuvwxyzab");
				words.add("abcdefghijklmnopqrstuvwxyzabc");
				words.add("abcdefghijklmnopqrstuvwxyzabcd");
				words.add("abcdefghijklmnopqrstuvwxyzabcde");
				words.add("abcdefghijklmnopqrstuvwxyzabcdef");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefg");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefgh");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghi");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghij");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijk");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijkl");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklm");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmn");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmno");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmnop");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopq");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqr");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrs");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrst");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstu");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuv");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvw");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxy");
				words.add("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
				assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz", FindMax.findMax(words));
		}
		
		@Test
		void testFindMax_3() {
				List<String> words = new ArrayList<>();
				words.add("abc");
				words.add("abcd");
				words.add("abcde");
				words.add("abcdef");
				words.add("abcdefg");
				words.add("abcdefgh");
				words.add("abcdefghi");
				words.add("abcdefghij");
				words.add("abcdefghijk");
				words.add("abcdefghijkl");
				words.add("abcdefghijklm");
				words.add("abcdefghijklmn");
				words.add("abcdefghijklmno");
				words.add("abcdefghijklmnop");
				words.add("abcdefghijklmnopq");
				words.add("abcdefghijklmnopqr");
				words.add("abcdefghijklmnopqrs");
				