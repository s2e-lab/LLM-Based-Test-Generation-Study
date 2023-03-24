Here's the code for the unit test class:

```
class RescaleToUnitTest {

    @Test
    void testRescaleToUnit() {
        List<Double> input1 = new ArrayList<Double>();
        input1.add(1.0);
        input1.add(2.0);
        input1.add(3.0);
        input1.add(4.0);
        input1.add(5.0);
        List<Double> expected1 = new ArrayList<Double>();
        expected1.add(0.0);
        expected1.add(0.25);
        expected1.add(0.5);
        expected1.add(0.75);
        expected1.add(1.0);
        assertEquals(expected1, RescaleToUnit.rescaleToUnit(input1));

        List<Double> input2 = new ArrayList<Double>();
        input2.add(2.0);
        input2.add(49.9);
        List<Double> expected2 = new ArrayList<Double>();
        expected2.add(0.0);
        expected2.add(1.0);
        assertEquals(expected2, RescaleToUnit.rescaleToUnit(input2));

        List<Double> input3 = new ArrayList<Double>();
        input3.add(100.0);
        input3.add(49.9);
        List<Double> expected3 = new ArrayList<Double>();
        expected3.add(1.0);
        expected3.add(0.0);
        assertEquals(expected3, RescaleToUnit.rescaleToUnit(input3));

        List<Double> input4 = new ArrayList<Double>();
        input4.add(1.0);
        input4.add(2.0);
        input4.add(3.0);
        input4.add(4.0);
        input4.add(5.0);
        List<Double> expected4 = new ArrayList<Double>();
        expected4.add(0.0);
        expected4.add(0.25);
        expected4.add(0.5);
        expected4.add(0.75);
        expected4.add(1.0);
        assertEquals(expected4, RescaleToUnit.rescaleToUnit(input4));

        List<Double> input5 = new ArrayList<Double>();
        input5.add(2.0);
        input5.add(1.0);
        input5.add(5.0);
        input5.add(3.0);
        input5.add(4.0);
        List<Double> expected5 = new ArrayList<Double>();
        expected5.add(0.25);
        expected5.add(0.0);
        expected5.add(1.0);
        expected5.add(0.5);
        expected5.add(0.75);
        assertEquals(expected5, RescaleToUnit.rescaleToUnit(input5));

        List<Double> input6 = new ArrayList<Double>();
        input6.add(12.0);
        input6.add(11.0);
        input6.add(15.0);
        input6.add(13.0);
        input6.add(14.0);
        List<Double> expected6 = new ArrayList<Double>();
        expected6.add(0.25);
        expected6.add(0.0);
        expected6.add(1.0);
        expected6.add(0.5);
        expected6.add(0.75);
        assertEquals(expected6, RescaleToUnit.rescaleToUnit(input6));

        List<Double> input7 = new ArrayList<Double>();
        input7.add(1.0);
        input7.add(1.0);
        input7.add(1.0);
        input7.add(1.0);
        input7.add(1.0);
        List<Double> expected7 = new ArrayList<Double>();
        expected7.add(0.0);
        expected7.add(0.0);
        expected7.add(0.0);
        expected7.add(0.0);
        expected7.add(0.0);
        assertEquals(expected7, RescaleToUnit.rescaleToUnit(input7));

        List<Double> input8 = new ArrayList<Double>();
        input8.add(1.0);
        input8.add(1.0);
        input8.add(1.0);
        input8.add(1.0);
        input8.add(2.0);
        List<Double> expected8 = new ArrayList<Double>();
        expected8.add(0.0);
        expected8.add(0.0);
        expected8.add(0.0);
        expected8.add(0.0);
        expected8.add(1.0);
        assertEquals(expected8, RescaleToUnit.rescaleToUnit(input8));

        List<Double> input9 = new ArrayList<Double>();
        input9.add(1.0);
        input9.add(2.0);
        input9.add(3.0);
        input9.add(4.0);
        input9.add(4.0);
        List<Double> expected9 = new ArrayList<Double>();
        expected9.add(0.0);
        expected9.add(0.25);
        expected9.add(0.5);
        expected9.add(0.75);
        expected9.add(0.75);
        assertEquals(expected9, RescaleToUnit.rescaleToUnit(input9));

        List<Double> input10 = new ArrayList<Double>();
        input10.add(1.0);
        input10.add(2.0);
        List<Double> expected10 = new ArrayList<Double>();
        expected10.add(0.0);
        expected10.add(1.0);
        assertEquals(expected10, RescaleToUnit.rescaleToUnit(input10));
    }
}
```