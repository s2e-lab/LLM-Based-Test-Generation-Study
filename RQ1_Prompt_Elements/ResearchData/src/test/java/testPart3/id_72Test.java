class WillItFlyTest {
    @Test
    void testWillItFly() {
        assertEquals(true, WillItFly.willItFly(Arrays.asList(3, 2, 3), 9));
        assertEquals(false, WillItFly.willItFly(Arrays.asList(1, 2), 5));
        assertEquals(true, WillItFly.willItFly(Arrays.asList(3), 5));
        assertEquals(false, WillItFly.willItFly(Arrays.asList(3, 2, 3), 1));
        assertEquals(false, WillItFly.willItFly(Arrays.asList(1, 2, 3), 6));
        assertEquals(true, WillItFly.willItFly(Arrays.asList(5), 5));
        assertEquals(false, WillItFly.willItFly(Arrays.asList(1, 2, 3, 4, 5), 15));
        assertEquals(true, WillItFly.willItFly(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1), 15));
        assertEquals(false, WillItFly.willItFly(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1), 14));
        assertEquals(true, WillItFly.willItFly(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1), 16));
    }
}