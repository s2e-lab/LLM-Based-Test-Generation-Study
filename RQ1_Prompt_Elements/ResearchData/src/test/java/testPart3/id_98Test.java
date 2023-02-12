public class CountUpperTest {
    @Test
    public void testCountUpper() {
        assertEquals(0, CountUpper.countUpper("abcdefg"));
        assertEquals(0, CountUpper.countUpper("dBBE"));
        assertEquals(0, CountUpper.countUpper(""));
        assertEquals(2, CountUpper.countUpper("EEEE"));
        assertEquals(0, CountUpper.countUpper("aBCdEf"));
        assertEquals(0, CountUpper.countUpper("abcdefg"));
        assertEquals(0, CountUpper.countUpper("dBBE"));
        assertEquals(0, CountUpper.countUpper(""));
        assertEquals(2, CountUpper.countUpper("EEEE"));
        assertEquals(0, CountUpper.countUpper("aBCdEf"));
    }
}