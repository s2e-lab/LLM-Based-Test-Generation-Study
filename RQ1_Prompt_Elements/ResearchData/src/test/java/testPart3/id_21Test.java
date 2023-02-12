class RescaleToUnitTest {
    @Test
    void testRescaleToUnit() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        List<Double> result = new ArrayList<Double>();
        result.add(0.0);
        result.add(0.25);
        result.add(0.5);
        result.add(0.75);
        result.add(1.0);
        assertEquals(result, RescaleToUnit.rescaleToUnit(numbers));
    }

    @Test
    void testRescaleToUnit2() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(2.0);
        numbers.add(49.9);
        List<Double> result = new ArrayList<Double>();
        result.add(0.0);
        result.add(1.0);
        assertEquals(result, RescaleToUnit.rescaleToUnit(numbers));
    }

    @Test
    void testRescaleToUnit3() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(100.0);
        numbers.add(49.9);
        List<Double> result = new ArrayList<Double>();
        result.add(1.0);
        result.add(0.0);
        assertEquals(result, RescaleToUnit.rescaleToUnit(numbers));
    }

    @Test
    void testRescaleToUnit4() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        List<Double> result = new ArrayList<Double>();
        result.add(0.0);
        result.add(0.25);
        result.add(0.5);
        result.add(0.75);
        result.add(1.0);
        assertEquals(result, RescaleToUnit.rescaleToUnit(numbers));
    }

    @Test
    void testRescaleToUnit5() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(2.0);
        numbers.add(1.0);
        numbers.add(5.0);
        numbers.add(3.0);
        numbers.add(4.0);
        List<Double> result = new ArrayList<Double>();
        result.add(0.25);
        result.add(0.0);
        result.add(1.0);
        result.add(0.5);
        result.add(0.75);
        assertEquals(result, RescaleToUnit.rescaleToUnit(numbers));
    }

    @Test
    void testRescaleToUnit6() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(12.0);
        numbers.add(11.0);
        numbers.add(15.0);
        numbers.add(13.0);
        numbers.add(14.0);
        List<Double> result = new ArrayList<Double>();
        result.add(0.25);
        result.add(0.0);
        result.add(1.0);
        result.add(0.5);
        result.add(0.75);
        assertEquals(result, RescaleToUnit.rescaleToUnit(numbers));
    }

    @Test
    void testRescaleToUnit7() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        List<Double> result = new ArrayList<Double>();
        result.add(0.0);
        result.add(0.25);
        result.add(0.5);
        result.add(0.75);
        result.add(1.0);
        assertEquals(result, RescaleToUnit.rescaleToUnit(numbers));
    }

    @Test
    void testRescaleToUnit8() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(2.0);
        numbers.add(1.0);
        numbers.add(5.0);
        numbers.add(3.0);
        numbers.add(4.0);
        List<Double> result = new ArrayList<Double>();
        result.add(0.25);
        result.add(0.0);
        result.add(1.0);
        result.add(0.5);
        result.add(0.75);
        assertEquals(result, RescaleToUnit.rescaleToUnit(numbers));
    }

    @Test
    void testRescaleToUnit9() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(12.0);
        numbers.add(11.0);
        numbers.add(15.0);
        numbers.add(13.0);
        numbers.add(14.0);
        List<Double> result = new ArrayList<Double>();
        result.add(0.25);
        result.add(0.0);
        result.add(1.0);
        result.add(0.5);
        result.add(0.75);
        assertEquals(result, RescaleToUnit.rescaleToUnit(numbers));
    }

    @Test
    void testRescaleToUnit10() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        List<Double> result = new ArrayList<Double>();
        result.add(0.0);
        result.add(0.25);
        result.add(0.5);
        result.add(0.75);
        result.add(1.0);
        assertEquals(result, RescaleToUnit.rescaleToUnit(numbers));
    }
}