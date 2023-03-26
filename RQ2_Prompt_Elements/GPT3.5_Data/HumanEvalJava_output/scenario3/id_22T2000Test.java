import java.util.ArrayList;
import java.util.Arrays;

class FilterIntegers {

    /**
     * Filter given list of any Java values only for integers.
     *
     * > filterIntegers(["a", 3.14, 5])
     * [5]
     * > filterIntegers([1, 2, 3, "abc", {}, []])
     * [1, 2, 3]
     * > filterIntegers([])
     * []
     * > filterIntegers([4, {}, [], 23.2, 9, "adasd"])
     * [4, 9]
     * > filterIntegers([3, "c", 3, 3, "a", "b"])
     * [3, 3, 3]
     */
    public static List<Object> filterIntegers(List<Object> values) {
        List<Object> integers = new ArrayList<>();
        for (Object value : values) {
            if (value instanceof Integer) {
                integers.add(value);
            }
        }
        return integers;
    }
}

class FilterIntegersTest {

    @Test
    void testFilterIntegers1() {
        List<Object> values = Arrays.asList("a", 3.14, 5);
        List<Object> expected = Arrays.asList(5);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegers2() {
        List<Object> values = Arrays.asList(1, 2, 3, "abc", {}, []);
        List<Object> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegers3() {
        List<Object> values = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegers4() {
        List<Object> values = Arrays.asList(4, {}, [], 23.2, 9, "adasd");
        List<Object> expected = Arrays.asList(4, 9);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegers5() {
        List<Object> values = Arrays.asList(3, "c", 3, 3, "a", "b");
        List<Object> expected = Arrays.asList(3, 3, 3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegers6() {
        List<Object> values = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegers7() {
        List<Object> values = Arrays.asList("a", "b", "c");
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegers8() {
        List<Object> values = Arrays.asList(1.1, 2.2, 3.3);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegers9() {
        List<Object> values = Arrays.asList(null, 1, 2, null, 3);
        List<Object> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegers10() {
        List<Object> values = Arrays.asList(1, 2, 3, "4", "5", "6");
        List<Object> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }
}