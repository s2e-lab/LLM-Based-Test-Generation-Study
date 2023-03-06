// AllPrefixesTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains ten unit test cases for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {

	@Test
	void testAllPrefixes_1() {
		List<Object> expected = new ArrayList<>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		assertEquals(expected, AllPrefixes.allPrefixes("abc"));
	}
	
	@Test
	void testAllPrefixes_2() {
		List<Object> expected = new ArrayList<>();
		assertEquals(expected, AllPrefixes.allPrefixes(""));
	}
	
	@Test
	void testAllPrefixes_3() {
		List<Object> expected = new ArrayList<>();
		expected.add("a");
		expected.add("as");
		expected.add("asd");
		expected.add("asdf");
		expected.add("asdfg");
		expected.add("asdfgh");
		assertEquals(expected, AllPrefixes.allPrefixes("asdfgh"));
	}
	
	@Test
	void testAllPrefixes_4() {
		List<Object> expected = new ArrayList<>();
		expected.add("W");
		expected.add("WW");
		expected.add("WWW");
		assertEquals(expected, AllPrefixes.allPrefixes("WWW"));
	}
	
	@Test
	void testAllPrefixes_5() {
		List<Object> expected = new ArrayList<>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		expected.add("abcd");
		expected.add("abcde");
		expected.add("abcdef");
		expected.add("abcdefg");
		expected.add("abcdefgh");
		expected.add("abcdefghi");
		expected.add("abcdefghij");
		assertEquals(expected, AllPrefixes.allPrefixes("abcdefghij"));
	}
	
	@Test
	void testAllPrefixes_6() {
		List<Object> expected = new ArrayList<>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		expected.add("abcd");
		expected.add("abcde");
		expected.add("abcdef");
		expected.add("abcdefg");
		expected.add("abcdefgh");
		expected.add("abcdefghi");
		expected.add("abcdefghij");
		expected.add("abcdefghijk");
		expected.add("abcdefghijkl");
		expected.add("abcdefghijklm");
		expected.add("abcdefghijklmn");
		expected.add("abcdefghijklmno");
		expected.add("abcdefghijklmnop");
		expected.add("abcdefghijklmnopq");
		expected.add("abcdefghijklmnopqr");
		expected.add("abcdefghijklmnopqrs");
		expected.add("abcdefghijklmnopqrst");
		expected.add("abcdefghijklmnopqrstu");
		expected.add("abcdefghijklmnopqrstuv");
		expected.add("abcdefghijklmnopqrstuvw");
		expected.add("abcdefghijklmnopqrstuvwx");
		expected.add("abcdefghijklmnopqrstuvwxy");
		expected.add("abcdefghijklmnopqrstuvwxyz");
		assertEquals(expected, AllPrefixes.allPrefixes("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	void testAllPrefixes_7() {
		List<Object> expected = new ArrayList<>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		expected.add("abcd");
		expected.add("abcde");
		expected.add("abcdef");
		expected.add("abcdefg");
		expected.add("abcdefgh");
		expected.add("abcdefghi");
		expected.add("abcdefghij");
		expected.add("abcdefghijk");
		expected.add("abcdefghijkl");
		expected.add("abcdefghijklm");
		expected.add("abcdefghijklmn");
		expected.add("abcdefghijklmno");
		expected.add("abcdefghijklmnop");
		expected.add("abcdefghijklmnopq");
		expected.add("abcdefghijklmnopqr");
		expected.add("abcdefghijklmnopqrs");
		expected.add("abcdefghijklmnopqrst");
		expected.add("abcdefghijklmnopqrstu");
		expected.add("abcdefghijklmnopqrstuv");
		expected.add("abcdefghijklmnopqrstuvw");
		expected.add("abcdefghijklmnopqrstuvwx");
		expected.add("abcdefghijklmnopqrstuvwxy");
		expected.add("abcdefghijklmnopqrstuvwxyz");
		expected.add("abcdefghijklmnopqrstuvwxyzA");
		expected.add("abcdefghijklmnopqrstuvwxyzAB");
		expected.add("abcdefghijklmnopqrstuvwxyzABC");
		expected.add("abcdefghijklmnopqrstuvwxyzABCD");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDE");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEF");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFG");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGH");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHI");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJ");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJK");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKL");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLM");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMN");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNO");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOP");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQ");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQR");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRS");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRST");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTU");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUV");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVW");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXY");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertEquals(expected, AllPrefixes.allPrefixes("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
	
	@Test
	void testAllPrefixes_8() {
		List<Object> expected = new ArrayList<>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		expected.add("abcd");
		expected.add("abcde");
		expected.add("abcdef");
		expected.add("abcdefg");
		expected.add("abcdefgh");
		expected.add("abcdefghi");
		expected.add("abcdefghij");
		expected.add("abcdefghijk");
		expected.add("abcdefghijkl");
		expected.add("abcdefghijklm");
		expected.add("abcdefghijklmn");
		expected.add("abcdefghijklmno");
		expected.add("abcdefghijklmnop");
		expected.add("abcdefghijklmnopq");
		expected.add("abcdefghijklmnopqr");
		expected.add("abcdefghijklmnopqrs");
		expected.add("abcdefghijklmnopqrst");
		expected.add("abcdefghijklmnopqrstu");
		expected.add("abcdefghijklmnopqrstuv");
		expected.add("abcdefghijklmnopqrstuvw");
		expected.add("abcdefghijklmnopqrstuvwx");
		expected.add("abcdefghijklmnopqrstuvwxy");
		expected.add("abcdefghijklmnopqrstuvwxyz");
		expected.add("abcdefghijklmnopqrstuvwxyzA");
		expected.add("abcdefghijklmnopqrstuvwxyzAB");
		expected.add("abcdefghijklmnopqrstuvwxyzABC");
		expected.add("abcdefghijklmnopqrstuvwxyzABCD");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDE");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEF");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFG");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGH");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHI");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJ");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJK");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKL");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLM");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMN");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNO");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOP");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQ");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQR");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRS");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRST");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTU");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUV");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVW");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXY");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZa");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZab");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabc");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcd");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcde");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdef");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefg");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefgh");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghij");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkl");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklm");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmn");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmno");
		expected.add("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnop");
		expected.add("abcdefghijklmnopqr