public class SortNumbersTest {
    @Test
    public void testSortNumbers() {
        assertEquals("one three five", SortNumbers.sortNumbers("three one five"));
        assertEquals("", SortNumbers.sortNumbers(""));
        assertEquals("three", SortNumbers.sortNumbers("three"));
        assertEquals("three five nine", SortNumbers.sortNumbers("three five nine"));
        assertEquals("zero four five seven eight nine", SortNumbers.sortNumbers("five zero four seven nine eight"));
        assertEquals("zero one two three four five six", SortNumbers.sortNumbers("six five four three two one zero"));
        assertEquals("one two three four five six seven eight nine", SortNumbers.sortNumbers("nine eight seven six five four three two one"));
        assertEquals("one two three four five six seven eight nine", SortNumbers.sortNumbers("one two three four five six seven eight nine"));
        assertEquals("one two three four five six seven eight nine", SortNumbers.sortNumbers("one two three four five six seven eight nine"));
        assertEquals("one two three four five six seven eight nine", SortNumbers.sortNumbers("one two three four five six seven eight nine"));
    }
}