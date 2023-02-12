class ClosestIntegerTest {
    @Test
    void testClosestInteger() {
        assertEquals(10, ClosestInteger.closestInteger("10"));
        assertEquals(15, ClosestInteger.closestInteger("15.3"));
        assertEquals(15, ClosestInteger.closestInteger("14.5"));
        assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
        assertEquals(15, ClosestInteger.closestInteger("15.3"));
        assertEquals(0, ClosestInteger.closestInteger("0"));
        assertEquals(0, ClosestInteger.closestInteger("0.0"));
        assertEquals(0, ClosestInteger.closestInteger("-0.0"));
        assertEquals(0, ClosestInteger.closestInteger("-0"));
        assertEquals(0, ClosestInteger.closestInteger("0.5"));
    }
}