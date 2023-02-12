class PairsSumToZeroTest {
    @Test
    void testPairsSumToZero() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(0);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l1));

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(3);
        l2.add(-2);
        l2.add(1);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l2));

        List<Integer> l3 = new ArrayList<Integer>();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(7);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l3));

        List<Integer> l4 = new ArrayList<Integer>();
        l4.add(2);
        l4.add(4);
        l4.add(-5);
        l4.add(3);
        l4.add(5);
        l4.add(7);
        assertEquals(true, PairsSumToZero.pairsSumToZero(l4));

        List<Integer> l5 = new ArrayList<Integer>();
        l5.add(1);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l5));

        List<Integer> l6 = new ArrayList<Integer>();
        l6.add(-3);
        l6.add(9);
        l6.add(-1);
        l6.add(3);
        l6.add(2);
        l6.add(30);
        assertEquals(true, PairsSumToZero.pairsSumToZero(l6));

        List<Integer> l7 = new ArrayList<Integer>();
        l7.add(-3);
        l7.add(9);
        l7.add(-1);
        l7.add(3);
        l7.add(2);
        l7.add(31);
        assertEquals(true, PairsSumToZero.pairsSumToZero(l7));

        List<Integer> l8 = new ArrayList<Integer>();
        l8.add(-3);
        l8.add(9);
        l8.add(-1);
        l8.add(4);
        l8.add(2);
        l8.add(30);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l8));

        List<Integer> l9 = new ArrayList<Integer>();
        l9.add(-3);
        l9.add(9);
        l9.add(-1);
        l9.add(4);
        l9.add(2);
        l9.add(31);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l9));

        List<Integer> l10 = new ArrayList<Integer>();
        l10.add(0);
        l10.add(0);
        l10.add(0);
        l10.add(0);
        l10.add(0);
        l10.add(0);
        assertEquals(true, PairsSumToZero.pairsSumToZero(l10));
    }
}