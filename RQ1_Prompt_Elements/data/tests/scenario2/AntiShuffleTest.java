package scenario2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AntiShuffleTest {

    @Test
    public void test() throws Exception {

        assertEquals("Hi", scenario2.AntiShuffle.antiShuffle("Hi"));
        assertEquals("ehllo", scenario2.AntiShuffle.antiShuffle("hello"));
        assertEquals("bemnru", scenario2.AntiShuffle.antiShuffle("number"));
        assertEquals("abcd", scenario2.AntiShuffle.antiShuffle("abcd"));
        assertEquals("Hello !!!Wdlor", scenario2.AntiShuffle.antiShuffle("Hello World!!!"));
        assertEquals("", scenario2.AntiShuffle.antiShuffle(""));
        assertEquals(".Hi My aemn is Meirst .Rboot How aer ?ouy", scenario2.AntiShuffle.antiShuffle("Hi. My name is Mister Robot. How are you?"));

    }

}