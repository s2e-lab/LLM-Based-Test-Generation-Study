class BelowThresholdTest {
    @Test
    void testBelowThreshold() {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(10);
        assertEquals(true, BelowThreshold.belowThreshold(l, 100));
        l.clear();
        l.add(1);
        l.add(20);
        l.add(4);
        l.add(10);
        assertEquals(false, BelowThreshold.belowThreshold(l, 5));
        l.clear();
        l.add(1);
        l.add(20);
        l.add(4);
        l.add(10);
        assertEquals(true, BelowThreshold.belowThreshold(l, 21));
        l.clear();
        l.add(1);
        l.add(20);
        l.add(4);
        l.add(10);
        assertEquals(true, BelowThreshold.belowThreshold(l, 22));
        l.clear();
        l.add(1);
        l.add(8);
        l.add(4);
        l.add(10);
        assertEquals(true, BelowThreshold.belowThreshold(l, 11));
        l.clear();
        l.add(1);
        l.add(8);
        l.add(4);
        l.add(10);
        assertEquals(false, BelowThreshold.belowThreshold(l, 10));
    }
}