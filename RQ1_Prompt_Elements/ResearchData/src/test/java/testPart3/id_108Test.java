public class CountNumsTest {
    @Test
    public void testCountNums() {
        List<Object> arr = new ArrayList<>();
        assertEquals(0, CountNums.countNums(arr));
        arr.add(-1);
        arr.add(-2);
        arr.add(0);
        assertEquals(0, CountNums.countNums(arr));
        arr.clear();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(-2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        assertEquals(6, CountNums.countNums(arr));
        arr.clear();
        arr.add(1);
        arr.add(6);
        arr.add(9);
        arr.add(-6);
        arr.add(0);
        arr.add(1);
        arr.add(5);
        assertEquals(5, CountNums.countNums(arr));
        arr.clear();
        arr.add(1);
        arr.add(100);
        arr.add(98);
        arr.add(-7);
        arr.add(1);
        arr.add(-1);
        assertEquals(4, CountNums.countNums(arr));
        arr.clear();
        arr.add(12);
        arr.add(23);
        arr.add(34);
        arr.add(-45);
        arr.add(-56);
        arr.add(0);
        assertEquals(5, CountNums.countNums(arr));
        arr.clear();
        arr.add(0);
        arr.add(1);
        assertEquals(1, CountNums.countNums(arr));
        arr.clear();
        arr.add(1);
        assertEquals(1, CountNums.countNums(arr));
    }
}