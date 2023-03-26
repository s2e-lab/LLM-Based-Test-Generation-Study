Here's the code for UniqueTest class:

```
class UniqueTest {

    @Test
    void testEmptyList() {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = Unique.unique(l);
        assertEquals(expected, result);
    }

    @Test
    void testSingleElementList() {
        List<Integer> l = Arrays.asList(1);
        List<Integer> expected = Arrays.asList(1);
        List<Integer> result = Unique.unique(l);
        assertEquals(expected, result);
    }

    @Test
    void testDuplicateElements() {
        List<Integer> l = Arrays.asList(1, 2, 3, 2, 1);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> result = Unique.unique(l);
        assertEquals(expected, result);
    }

    @Test
    void testSortedElements() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = Unique.unique(l);
        assertEquals(expected, result);
    }

    @Test
    void testReverseSortedElements() {
        List<Integer> l = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = Unique.unique(l);
        assertEquals(expected, result);
    }

    @Test
    void testRandomOrderElements() {
        List<Integer> l = Arrays.asList(3, 1, 5, 2, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = Unique.unique(l);
        assertEquals(expected, result);
    }

    @Test
    void testLargeList() {
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            l.add(i % 100);
        }
        List<Integer> expected = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            expected.add(i);
        }
        List<Integer> result = Unique.unique(l);
        assertEquals(expected, result);
    }

    @Test
    void testNullList() {
        List<Integer> l = null;
        assertThrows(NullPointerException.class, () -> Unique.unique(l));
    }

    @Test
    void testEmptyResult() {
        List<Integer> l = Arrays.asList(1, 1, 1);
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = Unique.unique(l);
        assertEquals(expected, result);
    }

    @Test
    void testImmutableList() {
        List<Integer> l = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> result = Unique.unique(Collections.unmodifiableList(l));
        assertEquals(expected, result);
    }
}
``` 

This test class contains ten unit test cases for the `unique` method of the `Unique` class. The test cases cover different scenarios such as empty list, single element list, duplicate elements, sorted elements, reverse sorted elements, random order elements, large list, null list, empty result, and immutable list. The `assertEquals` method is used to compare the expected result with the actual result. The `assertThrows` method is used to test for expected exceptions.