Here's the source code for the RescaleToUnitTest class with ten unit test cases for the RescaleToUnit.rescaleToUnit() method:

```
class RescaleToUnitTest {

    @Test
    void testEmptyList() {
        List<Double> input = new ArrayList<>();
        List<Double> expected = new ArrayList<>();
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleValue() {
        List<Double> input = List.of(1.0);
        List<Double> expected = List.of(0.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void testAllEqualValues() {
        List<Double> input = List.of(1.0, 1.0, 1.0, 1.0);
        List<Double> expected = List.of(0.0, 0.0, 0.0, 0.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void testPositiveValues() {
        List<Double> input = List.of(1.0, 2.0, 3.0, 4.0);
        List<Double> expected = List.of(0.0, 0.3333333333333333, 0.6666666666666666, 1.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void testNegativeValues() {
        List<Double> input = List.of(-4.0, -3.0, -2.0, -1.0);
        List<Double> expected = List.of(0.0, 0.3333333333333333, 0.6666666666666666, 1.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedValues() {
        List<Double> input = List.of(-2.0, 0.0, 2.0, 4.0);
        List<Double> expected = List.of(0.0, 0.3333333333333333, 0.6666666666666666, 1.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void testRepeatedValues() {
        List<Double> input = List.of(1.0, 2.0, 2.0, 3.0, 3.0, 3.0);
        List<Double> expected = List.of(0.0, 0.25, 0.25, 0.5, 0.5, 0.5);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void testExtremeValues() {
        List<Double> input = List.of(Double.MIN_VALUE, Double.MAX_VALUE);
        List<Double> expected = List.of(0.0, 1.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void testNaNValues() {
        List<Double> input = List.of(1.0, Double.NaN, 2.0, Double.NaN);
        List<Double> expected = List.of(Double.NaN, Double.NaN, Double.NaN, Double.NaN);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void testInfinityValues() {
        List<Double> input = List.of(1.0, Double.POSITIVE_INFINITY, 2.0, Double.NEGATIVE_INFINITY);
        List<Double> expected = List.of(Double.NaN, Double.NaN, Double.NaN, Double.NaN);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }
}
```