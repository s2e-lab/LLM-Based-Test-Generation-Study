// Here's the generated code for the test cases:

@Test
void testEmptyList() {
    List<Object> lst = new ArrayList<Object>();
    List<Object> expected = new ArrayList<Object>();
    List<Object> result = StrangeSortList.strangeSortList(lst);
    assertEquals(expected, result);
}

@Test
void testSingleElementList() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(111111);
    List<Object> expected = new ArrayList<Object>();
    expected.add(111111);
    List<Object> result = StrangeSortList.strangeSortList(lst);
    assertEquals(expected, result);
}

@Test
void testAllEqualElementsList() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(5);
    lst.add(5);
    lst.add(5);
    lst.add(5);
    List<Object> expected = new ArrayList<Object>();
    expected.add(5);
    expected.add(5);
    expected.add(5);
    expected.add(5);
    List<Object> result = StrangeSortList.strangeSortList(lst);
    assertEquals(expected, result);
}

@Test
void testOddNumberOfElementsList() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(5);
    lst.add(6);
    lst.add(7);
    lst.add(8);
    lst.add(9);
    List<Object> expected = new ArrayList<Object>();
    expected.add(5);
    expected.add(9);
    expected.add(6);
    expected.add(8);
    expected.add(7);
    List<Object> result = StrangeSortList.strangeSortList(lst);
    assertEquals(expected, result);
}

@Test
void testEvenNumberOfElementsList() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(1);
    lst.add(2);
    lst.add(3);
    lst.add(4);
    lst.add(5);
    lst.add(6);
    lst.add(7);
    lst.add(8);
    List<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(8);
    expected.add(2);
    expected.add(7);
    expected.add(3);
    expected.add(6);
    expected.add(4);
    expected.add(5);
    List<Object> result = StrangeSortList.strangeSortList(lst);
    assertEquals(expected, result);
}

@Test
void testNegativeElementsList() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(0);
    lst.add(2);
    lst.add(2);
    lst.add(2);
    lst.add(5);
    lst.add(5);
    lst.add(-5);
    lst.add(-5);
    List<Object> expected = new ArrayList<Object>();
    expected.add(-5);
    expected.add(5);
    expected.add(-5);
    expected.add(5);
    expected.add(0);
    expected.add(2);
    expected.add(2);
    expected.add(2);
    List<Object> result = StrangeSortList.strangeSortList(lst);
    assertEquals(expected, result);
}

@Test
void testMixedElementsList() {
    List<Object> lst = new ArrayList<Object>();
    lst.add(1);
    lst.add(2);
    lst.add(3);
    lst.add(4);
    lst.add(5);
    lst.add(6);
    lst.add(7);
    lst.add(8);
    lst.add(9);
    lst.add(10);
    lst.add(11);
    lst.add(12);
    lst.add(13);
    lst.add(14);
    lst.add(15);
    lst.add(16);
    lst.add(17);
    lst.add(18);
    lst.add(19);
    lst.add(20);
    lst.add(-1);
    lst.add(-2);
    lst.add(-3);
    lst.add(-4);
    lst.add(-5);
    lst.add(-6);
    lst.add(-7);
    lst.add(-8);
    lst.add(-9);
    lst.add(-10);
    List<Object> expected = new ArrayList<Object>();
    expected.add(-10);
    expected.add(20);
    expected.add(-9);
    expected.add(19);
    expected.add(-8);
    expected.add(18);
    expected.add(-7);
    expected.add(17);
    expected.add(-6);
    expected.add(16);
    expected.add(-5);
    expected.add(15);
    expected.add(-4);
    expected.add(14);
    expected.add(-3);
    expected.add(13);
    expected.add(-2);
    expected.add(12);
    expected.add(-1);
    expected.add(11);
    expected.add(1);
    expected.add(10);
    expected.add(2);
    expected.add(9);
    expected.add(3);
    expected.add(8);
    expected.add(4);
    expected.add(7);
    expected.add(5);
    expected.add(6);
    List<Object> result = StrangeSortList.strangeSortList(lst);
    assertEquals(expected, result);
}

@Test
void testNonIntegerElementsList() {
    List<Object> lst = new ArrayList<Object>();
    lst.add("hello");
    lst.add(2);
    lst.add(3.14);
    lst.add(4);
    lst.add(true);
    List<Object> expected = new ArrayList<Object>();
    expected.add(2);
    expected.add(4);
    expected.add(3.14);
    List<Object> result = StrangeSortList.strangeSortList(lst);
    assertEquals(expected, result);
}
}