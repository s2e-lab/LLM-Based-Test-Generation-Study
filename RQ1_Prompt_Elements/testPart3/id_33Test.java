class SortThirdTest {
    @Test
    void testSortThird() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        assertEquals(l2, SortThird.sortThird(l));
        l.clear();
        l2.clear();
        l.add(5);
        l.add(6);
        l.add(3);
        l.add(4);
        l.add(8);
        l.add(9);
        l.add(2);
        l2.add(2);
        l2.add(6);
        l2.add(3);
        l2.add(4);
        l2.add(8);
        l2.add(9);
        l2.add(5);
        assertEquals(l2, SortThird.sortThird(l));
        l.clear();
        l2.clear();
        l.add(5);
        l.add(8);
        l.add(-12);
        l.add(4);
        l.add(23);
        l.add(2);
        l.add(3);
        l.add(11);
        l.add(12);
        l.add(-10);
        l2.add(-10);
        l2.add(8);
        l2.add(-12);
        l2.add(3);
        l2.add(23);
        l2.add(2);
        l2.add(4);
        l2.add(11);
        l2.add(12);
        l2.add(5);
        assertEquals(l2, SortThird.sortThird(l));
        l.clear();
        l2.clear();
        l.add(5);
        l.add(8);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(9);
        l.add(2);
        l2.add(2);
        l2.add(8);
        l2.add(3);
        l2.add(4);
        l2.add(6);
        l2.add(9);
        l2.add(5);
        assertEquals(l2, SortThird.sortThird(l));
        l.clear();
        l2.clear();
        l.add(5);
        l.add(6);
        l.add(9);
        l.add(4);
        l.add(8);
        l.add(3);
        l.add(2);
        l2.add(2);
        l2.add(6);
        l2.add(9);
        l2.add(4);
        l2.add(8);
        l2.add(3);
        l2.add(5);
        assertEquals(l2, SortThird.sortThird(l));
        l.clear();
        l2.clear();
        l.add(5);
        l.add(6);
        l.add(3);
        l.add(4);
        l.add(8);
        l.add(9);
        l.add(2);
        l.add(1);
        l2.add(2);
        l2.add(6);
        l2.add(3);
        l2.add(4);
        l2.add(8);
        l2.add(9);
        l2.add(5);
        l2.add(1);
        assertEquals(l2, SortThird.sortThird(l));
    }
}