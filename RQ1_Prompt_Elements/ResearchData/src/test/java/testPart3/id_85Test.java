class Add1Test {
    @Test
    void testAdd() {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(4);
        lst.add(2);
        lst.add(6);
        lst.add(7);
        assertEquals(2, Add1.add(lst));
        lst.clear();
        lst.add(4);
        lst.add(88);
        assertEquals(88, Add1.add(lst));
        lst.clear();
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(2);
        lst.add(122);
        assertEquals(122, Add1.add(lst));
        lst.clear();
        lst.add(4);
        lst.add(0);
        lst.add(6);
        lst.add(7);
        assertEquals(0, Add1.add(lst));
        lst.clear();
        lst.add(4);
        lst.add(4);
        lst.add(6);
        lst.add(8);
        assertEquals(12, Add1.add(lst));
    }
}