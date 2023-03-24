// Here's the generated source code for the RemoveDuplicatesTest class with ten test cases:

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicatesWithDuplicates() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(4);
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesWithEmptyList() {
        List<Object> numbers = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesWithNoDuplicates() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesWithMultipleDuplicates() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);
        expected.add(5);
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesWithAllDuplicates() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        List<Object> expected = new ArrayList<>();
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesWithNull() {
        List<Object> numbers = null;
        assertThrows(NullPointerException.class, () -> RemoveDuplicates.removeDuplicates(numbers));
    }

    @Test
    void testRemoveDuplicatesWithOneElement() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesWithTwoElements() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesWithThreeElements() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesWithFourElements() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }
}