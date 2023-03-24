// Here's the generated code for the test cases:

@Test
void testLargestSmallestIntegers() {
    List<Object> lst1 = new ArrayList<Object>();
    lst1.add(2);
    lst1.add(4);
    lst1.add(1);
    lst1.add(3);
    lst1.add(5);
    lst1.add(7);
    assertEquals(List.of(null, 1), LargestSmallestIntegers.largestSmallestIntegers(lst1));

    List<Object> lst2 = new ArrayList<Object>();
    assertEquals(List.of(null, null), LargestSmallestIntegers.largestSmallestIntegers(lst2));

    List<Object> lst3 = new ArrayList<Object>();
    lst3.add(0);
    assertEquals(List.of(null, null), LargestSmallestIntegers.largestSmallestIntegers(lst3));

    List<Object> lst4 = new ArrayList<Object>();
    lst4.add(-1);
    lst4.add(-3);
    lst4.add(-5);
    lst4.add(-6);
    assertEquals(List.of(-1, null), LargestSmallestIntegers.largestSmallestIntegers(lst4));

    List<Object> lst5 = new ArrayList<Object>();
    lst5.add(-1);
    lst5.add(-3);
    lst5.add(-5);
    lst5.add(-6);
    lst5.add(0);
    assertEquals(List.of(-1, null), LargestSmallestIntegers.largestSmallestIntegers(lst5));

    List<Object> lst6 = new ArrayList<Object>();
    lst6.add(-6);
    lst6.add(-4);
    lst6.add(-4);
    lst6.add(-3);
    lst6.add(1);
    assertEquals(List.of(-3, 1), LargestSmallestIntegers.largestSmallestIntegers(lst6));

    List<Object> lst7 = new ArrayList<Object>();
    lst7.add(-6);
    lst7.add(-4);
    lst7.add(-4);
    lst7.add(-3);
    lst7.add(-100);
    lst7.add(1);
    assertEquals(List.of(-3, 1), LargestSmallestIntegers.largestSmallestIntegers(lst7));

    List<Object> lst8 = new ArrayList<Object>();
    lst8.add(1);
    lst8.add(3);
    lst8.add(2);
    lst8.add(4);
    lst8.add(5);
    lst8.add(6);
    lst8.add(-2);
    assertEquals(List.of(-2, 1), LargestSmallestIntegers.largestSmallestIntegers(lst8));

    List<Object> lst9 = new ArrayList<Object>();
    lst9.add(4);
    lst9.add(5);
    lst9.add(3);
    lst9.add(6);
    lst9.add(2);
    lst9.add(7);
    lst9.add(-7);
    assertEquals(List.of(-7, 2), LargestSmallestIntegers.largestSmallestIntegers(lst9));

    List<Object> lst10 = new ArrayList<Object>();
    lst10.add(7);
    lst10.add(3);
    lst10.add(8);
    lst10.add(4);
    lst10.add(9);
    lst10.add(2);
    lst10.add(5);
    lst10.add(-9);
    assertEquals(List.of(-9, 2), LargestSmallestIntegers.largestSmallestIntegers(lst10));
}