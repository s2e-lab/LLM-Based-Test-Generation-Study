class AntiShuffleTest {
    @Test
    void testAntiShuffle() {
        assertEquals("Hi", AntiShuffle.antiShuffle("Hi"));
        assertEquals("ehllo", AntiShuffle.antiShuffle("hello"));
        assertEquals("bemnru", AntiShuffle.antiShuffle("number"));
        assertEquals("abcd", AntiShuffle.antiShuffle("abcd"));
        assertEquals("Hello !!!Wdlor", AntiShuffle.antiShuffle("Hello World!!!"));
        assertEquals("", AntiShuffle.antiShuffle(""));
        assertEquals(".Hi My aemn is Meirst .Rboot How aer ?ouy", AntiShuffle.antiShuffle("Hi. My name is Mister Robot. How are you?"));
    }
}