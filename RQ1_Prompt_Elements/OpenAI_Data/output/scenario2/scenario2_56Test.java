// CorrectBracketingTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains ten unit test cases for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {

	/**
	* Test case 1:
	* Input: <><<>>
	* Expected output: true
	*/
	@Test
	void test1() {
		assertTrue(CorrectBracketing.correctBracketing("<><<>>"));
	}
	
	/**
	* Test case 2:
	* Input: <<>><
	* Expected output: false
	*/
	@Test
	void test2() {
		assertFalse(CorrectBracketing.correctBracketing("<<>><"));
	}
	
	/**
	* Test case 3:
	* Input: <><<>><
	* Expected output: false
	*/
	@Test
	void test3() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>><"));
	}
	
	/**
	* Test case 4:
	* Input: <><<>><<
	* Expected output: false
	*/
	@Test
	void test4() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>><<"));
	}
	
	/**
	* Test case 5:
	* Input: <><<>>><
	* Expected output: false
	*/
	@Test
	void test5() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>>><"));
	}
	
	/**
	* Test case 6:
	* Input: <><<>>><<
	* Expected output: false
	*/
	@Test
	void test6() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>>><<"));
	}
	
	/**
	* Test case 7:
	* Input: <><<>>><><
	* Expected output: false
	*/
	@Test
	void test7() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>>><><"));
	}
	
	/**
	* Test case 8:
	* Input: <><<>>><><>
	* Expected output: true
	*/
	@Test
	void test8() {
		assertTrue(CorrectBracketing.correctBracketing("<><<>>><><>"));
	}
	
	/**
	* Test case 9:
	* Input: <><<>>><><><
	* Expected output: false
	*/
	@Test
	void test9() {
		assertFalse(CorrectBracketing.correctBracketing("<><<>>><><><"));
	}
	
	/**
	* Test case 10:
	* Input: <><<>>><><><>
	* Expected output: true
	*/
	@Test
	void test10() {
		assertTrue(CorrectBracketing.correctBracketing("<><<>>><><><>"));
	}
}