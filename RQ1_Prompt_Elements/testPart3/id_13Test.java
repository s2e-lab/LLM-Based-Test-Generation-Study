class GreatestCommonDivisorTest {
    @Test
    void testGreatestCommonDivisor() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(3, 5));
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(25, 15));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(3, 7));
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(10, 15));
        assertEquals(7, GreatestCommonDivisor.greatestCommonDivisor(49, 14));
        assertEquals(12, GreatestCommonDivisor.greatestCommonDivisor(144, 60));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(3, 5));
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(25, 15));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(3, 7));
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(10, 15));
    }
}