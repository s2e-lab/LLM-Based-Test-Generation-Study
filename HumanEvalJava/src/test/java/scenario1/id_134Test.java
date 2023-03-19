package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckIfLastCharIsALetterTest {
    @Test
	public void test1() throws Exception {
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(true, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(true, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie "));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee e "));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
	}

	@Test
	public void test10() throws Exception {
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
	}

	
}