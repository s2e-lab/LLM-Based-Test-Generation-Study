class DigitsumTest {
    @Test
    void testDigitsum() {
        assertEquals(0, Digitsum.digitsum(""));
        assertEquals(131, Digitsum.digitsum("abAB"));
        assertEquals(67, Digitsum.digitsum("abcCd"));
        assertEquals(69, Digitsum.digitsum("helloE"));
        assertEquals(131, Digitsum.digitsum("woArBld"));
        assertEquals(153, Digitsum.digitsum("aAaaaXa"));
        assertEquals(151, Digitsum.digitsum(" How are yOu?"));
        assertEquals(327, Digitsum.digitsum("You arE Very Smart"));
        assertEquals(0, Digitsum.digitsum(""));
        assertEquals(0, Digitsum.digitsum(""));
    }
}