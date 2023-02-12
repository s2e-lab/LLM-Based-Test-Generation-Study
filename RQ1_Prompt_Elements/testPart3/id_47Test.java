class MedianTest {
    @Test
    void testMedian() {
        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(1);
        l1.add(2);
        l1.add(4);
        l1.add(5);
        assertEquals(3, Median.median(l1));

        List<Integer> l2 = new ArrayList<>();
        l2.add(-10);
        l2.add(4);
        l2.add(6);
        l2.add(1000);
        l2.add(10);
        l2.add(20);
        assertEquals(15.0, Median.median(l2));

        List<Integer> l3 = new ArrayList<>();
        l3.add(3);
        l3.add(1);
        l3.add(2);
        l3.add(4);
        l3.add(5);
        assertEquals(3, Median.median(l3));

        List<Integer> l4 = new ArrayList<>();
        l4.add(-10);
        l4.add(4);
        l4.add(6);
        l4.add(1000);
        l4.add(10);
        l4.add(20);
        assertEquals(8.0, Median.median(l4));

        List<Integer> l5 = new ArrayList<>();
        l5.add(5);
        assertEquals(5, Median.median(l5));

        List<Integer> l6 = new ArrayList<>();
        l6.add(6);
        l6.add(5);
        assertEquals(5.5, Median.median(l6));

        List<Integer> l7 = new ArrayList<>();
        l7.add(8);
        l7.add(1);
        l7.add(3);
        l7.add(9);
        l7.add(9);
        l7.add(2);
        l7.add(7);
        assertEquals(7, Median.median(l7));
    }
}