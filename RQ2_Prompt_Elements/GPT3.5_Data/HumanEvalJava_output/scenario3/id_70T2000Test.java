// Here's an implementation of the StrangeSortList method:

public static List<Object> strangeSortList(List<Object> lst) {
    List<Object> result = new ArrayList<>();
    if (lst == null || lst.isEmpty()) {
        return result;
    }
    List<Integer> nums = new ArrayList<>();
    for (Object obj : lst) {
        if (obj instanceof Integer) {
            nums.add((Integer) obj);
        }
    }
    Collections.sort(nums);
    int left = 0;
    int right = nums.size() - 1;
    while (left <= right) {
        if (left == right) {
            result.add(nums.get(left));
            break;
        }
        result.add(nums.get(left));
        result.add(nums.get(right));
        left++;
        right--;
    }
    return result;
}

// And here are the test cases:

class StrangeSortListTest {

    @Test
    void testEmptyList() {
        List<Object> lst = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    @Test
    void testSingleElementList() {
        List<Object> lst = Arrays.asList(111111);
        List<Object> expected = Arrays.asList(111111);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    @Test
    void testAllEqualElementsList() {
        List<Object> lst = Arrays.asList(5, 5, 5, 5);
        List<Object> expected = Arrays.asList(5, 5, 5, 5);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    @Test
    void testOddNumberOfElementsList() {
        List<Object> lst = Arrays.asList(5, 6, 7, 8, 9, 1);
        List<Object> expected = Arrays.asList(1, 9, 5, 8, 6, 7);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    @Test
    void testEvenNumberOfElementsList() {
        List<Object> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Object> expected = Arrays.asList(1, 8, 2, 7, 3, 6, 4, 5);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    @Test
    void testNegativeElementsList() {
        List<Object> lst = Arrays.asList(0, 2, 2, 2, 5, 5, -5, -5);
        List<Object> expected = Arrays.asList(-5, 5, -5, 5, 0, 2, 2, 2);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    @Test
    void testMixedElementsList() {
        List<Object> lst = Arrays.asList(1, 2, 3, 4);
        List<Object> expected = Arrays.asList(1, 4, 2, 3);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    @Test
    void testMixedElementsList2() {
        List<Object> lst = Arrays.asList(5, 6, 7, 8, 9);
        List<Object> expected = Arrays.asList(5, 9, 6, 8, 7);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    @Test
    void testMixedElementsList3() {
        List<Object> lst = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expected = Arrays.asList(1, 5, 2, 4, 3);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    @Test
    void testMixedElementsList4() {
        List<Object> lst = Arrays.asList(5, 5, 5, 5);
        List<Object> expected = Arrays.asList(5, 5, 5, 5);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }
}