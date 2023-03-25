package scenario1;

import java.util.Arrays;
import original.AntiShuffle;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AntiShuffleTest {
    @Test
	public void test1() throws Exception {
		assertEquals("Hi", scenario1.AntiShuffle.antiShuffle("Hi"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("ehllo", scenario1.AntiShuffle.antiShuffle("hello"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("bemnru", scenario1.AntiShuffle.antiShuffle("number"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("abcd", scenario1.AntiShuffle.antiShuffle("abcd"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("Hello !!!Wdlor", scenario1.AntiShuffle.antiShuffle("Hello World!!!"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("", scenario1.AntiShuffle.antiShuffle(""));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(".Hi My aemn is Meirst .Rboot How aer ?ouy", scenario1.AntiShuffle.antiShuffle("Hi. My name is Mister Robot. How are you?"));
	}

	
}