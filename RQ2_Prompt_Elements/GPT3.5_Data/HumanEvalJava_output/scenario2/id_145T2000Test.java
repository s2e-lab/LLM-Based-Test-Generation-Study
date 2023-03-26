Here's the code for the test class:

```
class OrderByPointsTest {

    @Test
    void testOrderByPoints_emptyList() {
        List<Object> nums = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints_singleElement() {
        List<Object> nums = Arrays.asList(5);
        List<Object> expected = Arrays.asList(5);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints_multipleElements() {
        List<Object> nums = Arrays.asList(12, 34, 56, 78, 90);
        List<Object> expected = Arrays.asList(90, 12, 34, 56, 78);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints_negativeNumbers() {
        List<Object> nums = Arrays.asList(-12, 34, -56, 78, -90);
        List<Object> expected = Arrays.asList(-90, -56, -12, 34, 78);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints_duplicateNumbers() {
        List<Object> nums = Arrays.asList(12, 34, 56, 78, 90, 12, 34, 56, 78, 90);
        List<Object> expected = Arrays.asList(90, 90, 12, 12, 34, 34, 56, 56, 78, 78);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints_allNumbersHaveSameDigitSum() {
        List<Object> nums = Arrays.asList(11, 22, 33, 44, 55);
        List<Object> expected = Arrays.asList(11, 22, 33, 44, 55);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints_largeNumbers() {
        List<Object> nums = Arrays.asList(123456789, 987654321, 111111111, 999999999);
        List<Object> expected = Arrays.asList(111111111, 123456789, 987654321, 999999999);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints_mixedNumbers() {
        List<Object> nums = Arrays.asList(-12, 34, 56, -78, 90, 123, -456, 789);
        List<Object> expected = Arrays.asList(-456, -78, -12, 123, 34, 56, 789, 90);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints_nullList() {
        List<Object> nums = null;
        assertThrows(NullPointerException.class, () -> OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints_listContainsNonInteger() {
        List<Object> nums = Arrays.asList(12, "34", 56, 78, 90);
        assertThrows(ClassCastException.class, () -> OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints_listContainsNull() {
        List<Object> nums = Arrays.asList(12, null, 56, 78, 90);
        assertThrows(NullPointerException.class, () -> OrderByPoints.orderByPoints(nums));
    }
}
```

This test class contains ten test cases that cover various scenarios for the `orderByPoints` method. The test cases include:

- An empty list
- A list with a single element
- A list with multiple elements
- A list with negative numbers
- A list with duplicate numbers
- A list where all numbers have the same digit sum
- A list with large numbers
- A list with mixed positive and negative numbers
- A null list
- A list that contains a non-integer element
- A list that contains a null element

Each test case uses the `assertEquals` method to compare the expected result with the actual result returned by the `orderByPoints` method. The last two test cases use the `assertThrows` method to check that the method throws the expected exception when given invalid input.