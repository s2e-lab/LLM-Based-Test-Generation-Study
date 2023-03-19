package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeLengthTest {
    @Test
	public void test1() throws Exception {
		assertEquals(true, scenario2.PrimeLength.primeLength("Hello"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(true, scenario2.PrimeLength.primeLength("abcdcba"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(true, scenario2.PrimeLength.primeLength("kittens"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(false, scenario2.PrimeLength.primeLength("orange"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(true, scenario2.PrimeLength.primeLength("wow"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(true, scenario2.PrimeLength.primeLength("world"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(true, scenario2.PrimeLength.primeLength("MadaM"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(true, scenario2.PrimeLength.primeLength("Wow"));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(false, scenario2.PrimeLength.primeLength(""));
	}

	@Test
	public void test10() throws Exception {
		assertEquals(true, scenario2.PrimeLength.primeLength("HI"));
	}

	@Test
	public void test11() throws Exception {
		assertEquals(true, scenario2.PrimeLength.primeLength("go"));
	}

	@Test
	public void test12() throws Exception {
		assertEquals(false, scenario2.PrimeLength.primeLength("gogo"));
	}

	@Test
	public void test13() throws Exception {
		assertEquals(false, scenario2.PrimeLength.primeLength("aaaaaaaaaaaaaaa"));
	}

	@Test
	public void test14() throws Exception {
		assertEquals(true, scenario2.PrimeLength.primeLength("Madam"));
	}

	@Test
	public void test15() throws Exception {
		assertEquals(false, scenario2.PrimeLength.primeLength("M"));
	}

	@Test
	public void test16() throws Exception {
		assertEquals(false, scenario2.PrimeLength.primeLength("0"));
	}

	
}