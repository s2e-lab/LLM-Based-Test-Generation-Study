package scenario1;

import java.util.Arrays;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AntiShuffleTest {

    @Test
    public void test() throws Exception{
        assertEquals("Hi", scenario1.AntiShuffle.antiShuffle("Hi"));
		assertEquals("ehllo", scenario1.AntiShuffle.antiShuffle("hello"));
		assertEquals("bemnru", scenario1.AntiShuffle.antiShuffle("number"));
		assertEquals("abcd", scenario1.AntiShuffle.antiShuffle("abcd"));
		assertEquals("Hello !!!Wdlor", scenario1.AntiShuffle.antiShuffle("Hello World!!!"));
		assertEquals("", scenario1.AntiShuffle.antiShuffle(""));
		assertEquals(".Hi My aemn is Meirst .Rboot How aer ?ouy", scenario1.AntiShuffle.antiShuffle("Hi. My name is Mister Robot. How are you?"));
		assertEquals(public static String antiShuffle(String s) {, scenario1.AntiShuffle.*/);
		
    }

}