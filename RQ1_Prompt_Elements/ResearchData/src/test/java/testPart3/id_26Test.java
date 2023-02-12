class RemoveDuplicatesTest {
    @Test
    void testRemoveDuplicates() {
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(3);
        result.add(4);
        assertEquals(result, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicates2() {
        List<Object> list = new ArrayList<Object>();
        List<Object> result = new ArrayList<Object>();
        assertEquals(result, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicates3() {
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        assertEquals(result, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicates4() {
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(4);
        result.add(5);
        assertEquals(result, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicates5() {
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(7);
        result.add(8);
        result.add(9);
        result.add(10);
        assertEquals(result, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicates6() {
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(7);
        result.add(8);
        result.add(9);
        result.add(10);
        result.add(11);
        result.add(12);
        result.add(13);