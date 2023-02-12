class StringXorTest {
    @Test
    void stringXorTest() {
        assertEquals("100", StringXor.stringXor("010", "110"));
        assertEquals("010010", StringXor.stringXor("111000", "101010"));
        assertEquals("0", StringXor.stringXor("1", "1"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
    }
}