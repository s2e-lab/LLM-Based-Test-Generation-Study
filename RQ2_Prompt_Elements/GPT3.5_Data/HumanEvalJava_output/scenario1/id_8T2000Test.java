Here's the code for the SumProductTest class with ten unit test cases for the sumProduct method:

```
class SumProductTest {

    @Test
    void testSumProductWithEmptyList() {
        List<Object> numbers = new ArrayList<>();
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void testSumProductWithOneNumber() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(5);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(5, result.get(0));
        assertEquals(5, result.get(1));
    }

    @Test
    void testSumProductWithTwoNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(15, result.get(0));
        assertEquals(50, result.get(1));
    }

    @Test
    void testSumProductWithNegativeNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(-5);
        numbers.add(10);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(5, result.get(0));
        assertEquals(-50, result.get(1));
    }

    @Test
    void testSumProductWithZero() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(0);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(0, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void testSumProductWithNonInteger() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add("test");
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(numbers));
    }

    @Test
    void testSumProductWithNull() {
        List<Object> numbers = null;
        assertThrows(NullPointerException.class, () -> SumProduct.sumProduct(numbers));
    }

    @Test
    void testSumProductWithLargeNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(Integer.MAX_VALUE);
        numbers.add(Integer.MAX_VALUE);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(-2, result.get(0).intValue());
        assertEquals(1, result.get(1).intValue());
    }

    @Test
    void testSumProductWithSmallNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(Integer.MIN_VALUE);
        numbers.add(Integer.MIN_VALUE);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(0, result.get(0).intValue());
        assertEquals(0, result.get(1).intValue());
    }

    @Test
    void testSumProductWithMixedNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(-10);
        numbers.add(2);
        numbers.add(0);
        numbers.add(3);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(0, result.get(0).intValue());
        assertEquals(0, result.get(1).intValue());
    }
}
```