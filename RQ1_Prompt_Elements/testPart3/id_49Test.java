class ModpTest {
    @Test
    void testModp() {
        assertEquals(3, Modp.modp(3, 5));
        assertEquals(2, Modp.modp(1101, 101));
        assertEquals(1, Modp.modp(0, 101));
        assertEquals(8, Modp.modp(3, 11));
        assertEquals(1, Modp.modp(100, 101));
        assertEquals(4, Modp.modp(30, 5));
        assertEquals(3, Modp.modp(31, 5));
        assertEquals(1, Modp.modp(1, 5));
        assertEquals(1, Modp.modp(2, 5));
        assertEquals(1, Modp.modp(3, 5));
    }
}