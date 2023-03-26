Here's the source code for the SpecialfilterTest class:

```
class SpecialfilterTest {

    @Test
    void testEmptyList() {
        List<Object> nums = Arrays.asList();
        assertEquals(0, Specialfilter.specialfilter(nums));
    }

    @Test
    void testNoSpecialNumbers() {
        List<Object> nums = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18);
        assertEquals(0, Specialfilter.specialfilter(nums));
    }

    @Test
    void testOneSpecialNumber() {
        List<Object> nums = Arrays.asList(13);
        assertEquals(1, Specialfilter.specialfilter(nums));
    }

    @Test
    void testMultipleSpecialNumbers() {
        List<Object> nums = Arrays.asList(13, 15, 17, 19, 31, 33, 35, 37, 39);
        assertEquals(9, Specialfilter.specialfilter(nums));
    }

    @Test
    void testSpecialNumbersWithLeadingZeros() {
        List<Object> nums = Arrays.asList(103, 105, 107, 109);
        assertEquals(4, Specialfilter.specialfilter(nums));
    }

    @Test
    void testSpecialNumbersWithTrailingZeros() {
        List<Object> nums = Arrays.asList(130, 150, 170, 190);
        assertEquals(0, Specialfilter.specialfilter(nums));
    }

    @Test
    void testSpecialNumbersWithEvenDigits() {
        List<Object> nums = Arrays.asList(123, 135, 157, 179);
        assertEquals(0, Specialfilter.specialfilter(nums));
    }

    @Test
    void testSpecialNumbersWithNonDigits() {
        List<Object> nums = Arrays.asList(13, "15", 17.0, true, "abc");
        assertEquals(1, Specialfilter.specialfilter(nums));
    }

    @Test
    void testSpecialNumbersWithNegativeNumbers() {
        List<Object> nums = Arrays.asList(-13, -15, -17, -19, -31, -33, -35, -37, -39);
        assertEquals(0, Specialfilter.specialfilter(nums));
    }

    @Test
    void testSpecialNumbersWithMixedNumbers() {
        List<Object> nums = Arrays.asList(-13, 15, "17", 19.0, -31, "33", -35.0, true, "abc");
        assertEquals(2, Specialfilter.specialfilter(nums));
    }
}
```

This test class contains ten unit test cases for the `specialfilter` method of the `Specialfilter` class. Each test case tests a different scenario, such as an empty list, a list with no special numbers, a list with one special number, a list with multiple special numbers, and so on. The test cases cover a variety of input types, including integers, strings, doubles, and booleans. The test cases also cover edge cases, such as numbers with leading or trailing zeros, negative numbers, and non-digit characters.