Here's the code for the RollingMaxTest class:

```
class RollingMaxTest {

    @Test
    void testEmptyList() {
        List<Object> numbers = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleNumber() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testIncreasingNumbers() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testDecreasingNumbers() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(5);
        expected.add(5);
        expected.add(5);
        expected.add(5);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNumbers() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(5);
        expected.add(5);
        expected.add(5);
        expected.add(5);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testNegativeNumbers() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(-5);
        numbers.add(-2);
        numbers.add(-10);
        numbers.add(-8);
        numbers.add(-3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-5);
        expected.add(-2);
        expected.add(-2);
        expected.add(-2);
        expected.add(-2);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedTypes() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add("3");
        numbers.add(4);
        numbers.add(5);
        assertThrows(IllegalArgumentException.class, () -> {
            RollingMax.rollingMax(numbers);
        });
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> {
            RollingMax.rollingMax(null);
        });
    }

    @Test
    void testLargeInput() {
        List<Object> numbers = new ArrayList<Object>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
        List<Object> expected = new ArrayList<Object>();
        for (int i = 0; i < 1000000; i++) {
            expected.add(i);
        }
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testLargeNegativeInput() {
        List<Object> numbers = new ArrayList<Object>();
        for (int i = -1000000; i < 0; i++) {
            numbers.add(i);
        }
        List<Object> expected = new ArrayList<Object>();
        for (int i = -1000000; i < 0; i++) {
            expected.add(-i);
        }
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }
}
```

This test class contains ten unit test cases for the `RollingMax.rollingMax(List)` method. The test cases cover various scenarios such as empty list, single number, increasing numbers, decreasing numbers, mixed numbers, negative numbers, mixed types, null input, large input, and large negative input. Each test case uses the `assertEquals` method to compare the expected output with the actual output of the `RollingMax.rollingMax(List)` method. If the expected output and the actual output are not equal, the test case fails.