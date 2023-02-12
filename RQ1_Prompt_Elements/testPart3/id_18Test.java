class HowManyTimesTest {
    @Test
    void testHowManyTimes() {
        assertEquals(0, HowManyTimes.howManyTimes("", "a"));
        assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
        assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
        assertEquals(0, HowManyTimes.howManyTimes("", "x"));
        assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
        assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
        assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
        assertEquals(0, HowManyTimes.howManyTimes("", ""));
        assertEquals(1, HowManyTimes.howManyTimes("a", "a"));
        assertEquals(0, HowManyTimes.howManyTimes("a", "b"));
    }
}