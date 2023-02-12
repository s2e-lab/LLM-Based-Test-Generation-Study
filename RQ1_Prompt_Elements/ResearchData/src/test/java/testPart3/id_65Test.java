class CircularShiftTest {
    @Test
    void testCircularShift() {
        assertEquals("21", CircularShift.circularShift(12, 1));
        assertEquals("12", CircularShift.circularShift(12, 2));
        assertEquals("001", CircularShift.circularShift(100, 2));
        assertEquals("12", CircularShift.circularShift(12, 2));
        assertEquals("79", CircularShift.circularShift(97, 8));
        assertEquals("21", CircularShift.circularShift(12, 1));
        assertEquals("11", CircularShift.circularShift(11, 101));
        assertEquals("123456789", CircularShift.circularShift(123456789, 9));
        assertEquals("123456789", CircularShift.circularShift(123456789, 10));
        assertEquals("123456789", CircularShift.circularShift(123456789, 11));
    }
}