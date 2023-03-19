package scenario3;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AntiShuffleTest {
    @Test
	public void test1() throws Exception {
		assertEquals("Hi", scenario3.AntiShuffle.antiShuffle("Hi"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("ehllo", scenario3.AntiShuffle.antiShuffle("hello"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("bemnru", scenario3.AntiShuffle.antiShuffle("number"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("abcd", scenario3.AntiShuffle.antiShuffle("abcd"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("Hello !!!Wdlor", scenario3.AntiShuffle.antiShuffle("Hello World!!!"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("", scenario3.AntiShuffle.antiShuffle(""));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(".Hi My aemn is Meirst .Rboot How aer ?ouy", scenario3.AntiShuffle.antiShuffle("Hi. My name is Mister Robot. How are you?"));
	}

	
}