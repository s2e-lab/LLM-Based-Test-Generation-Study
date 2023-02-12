class DigitsTest {
    @Test
    void testDigits() {
        assertEquals(1, Digits.digits(1));
        assertEquals(0, Digits.digits(4));
        assertEquals(15, Digits.digits(235));
        assertEquals(5, Digits.digits(5));
        assertEquals(5, Digits.digits(54));
        assertEquals(1, Digits.digits(120));
        assertEquals(5, Digits.digits(5014));
        assertEquals(315, Digits.digits(98765));
        assertEquals(2625, Digits.digits(5576543));
        assertEquals(0, Digits.digits(2468));
    }
}