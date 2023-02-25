package scenario3;

import java.util.Arrays;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AntiShuffleTest {

    @Test
    public void test() throws Exception{
        assertEquals("Hi", scenario3.AntiShuffle.antiShuffle("Hi"));
		assertEquals("ehllo", scenario3.AntiShuffle.antiShuffle("hello"));
		assertEquals("bemnru", scenario3.AntiShuffle.antiShuffle("number"));
		assertEquals("abcd", scenario3.AntiShuffle.antiShuffle("abcd"));
		assertEquals("Hello !!!Wdlor", scenario3.AntiShuffle.antiShuffle("Hello World!!!"));
		assertEquals("", scenario3.AntiShuffle.antiShuffle(""));
		assertEquals(".Hi My aemn is Meirst .Rboot How aer ?ouy", scenario3.AntiShuffle.antiShuffle("Hi. My name is Mister Robot. How are you?"));
		assertEquals(public static String antiShuffle(String s) {, scenario3.AntiShuffle.*/);
		
    }

}