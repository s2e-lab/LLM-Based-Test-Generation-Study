Here's the code for the test class:

```
class FindClosestElementsTest {

    @Test
    void testEmptyList() {
        List<Double> numbers = new ArrayList<>();
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleElementList() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertTrue(result.isEmpty());
    }

    @Test
    void testTwoElementList() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.0, result.get(1));
    }

    @Test
    void testThreeElementList() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(2.0, result.get(0));
        assertEquals(3.0, result.get(1));
    }

    @Test
    void testFourElementList() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(3.0, result.get(0));
        assertEquals(4.0, result.get(1));
    }

    @Test
    void testFiveElementList() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(4.0, result.get(0));
        assertEquals(5.0, result.get(1));
    }

    @Test
    void testNegativeNumbers() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(-1.0);
        numbers.add(-2.0);
        numbers.add(-3.0);
        numbers.add(-4.0);
        numbers.add(-5.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(-4.0, result.get(0));
        assertEquals(-5.0, result.get(1));
    }

    @Test
    void testMixedNumbers() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(-1.0);
        numbers.add(2.0);
        numbers.add(-3.0);
        numbers.add(4.0);
        numbers.add(-5.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(-1.0, result.get(0));
        assertEquals(2.0, result.get(1));
    }

    @Test
    void testEqualNumbers() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(1.0);
        numbers.add(1.0);
        numbers.add(1.0);
        numbers.add(1.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(1.0, result.get(1));
    }

    @Test
    void testLargeList() {
        List<Double> numbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(Math.random() * 100);
        }
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
    }
}
```