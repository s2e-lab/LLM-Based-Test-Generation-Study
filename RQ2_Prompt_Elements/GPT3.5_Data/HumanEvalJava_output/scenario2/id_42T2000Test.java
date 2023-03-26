Here's the code for the test class:

```
class IncrListTest {

    @Test
    void testEmptyList() {
        List<Object> input = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        List<Object> result = IncrList.incrList(input);
        assertEquals(expected, result);
    }

    @Test
    void testListWithOneInteger() {
        List<Object> input = new ArrayList<Object>();
        input.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        List<Object> result = IncrList.incrList(input);
        assertEquals(expected, result);
    }

    @Test
    void testListWithOneNonInteger() {
        List<Object> input = new ArrayList<Object>();
        input.add("hello");
        List<Object> expected = new ArrayList<Object>();
        List<Object> result = IncrList.incrList(input);
        assertEquals(expected, result);
    }

    @Test
    void testListWithMultipleIntegers() {
        List<Object> input = new ArrayList<Object>();
        input.add(1);
        input.add(2);
        input.add(3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        List<Object> result = IncrList.incrList(input);
        assertEquals(expected, result);
    }

    @Test
    void testListWithMultipleIntegersAndNonIntegers() {
        List<Object> input = new ArrayList<Object>();
        input.add(1);
        input.add("hello");
        input.add(2);
        input.add("world");
        input.add(3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        List<Object> result = IncrList.incrList(input);
        assertEquals(expected, result);
    }

    @Test
    void testListWithAllNonIntegers() {
        List<Object> input = new ArrayList<Object>();
        input.add("hello");
        input.add("world");
        List<Object> expected = new ArrayList<Object>();
        List<Object> result = IncrList.incrList(input);
        assertEquals(expected, result);
    }

    @Test
    void testListWithNull() {
        List<Object> input = null;
        assertThrows(NullPointerException.class, () -> {
            IncrList.incrList(input);
        });
    }

    @Test
    void testListWithNestedList() {
        List<Object> input = new ArrayList<Object>();
        List<Object> nestedList = new ArrayList<Object>();
        nestedList.add(1);
        nestedList.add(2);
        input.add(nestedList);
        List<Object> expected = new ArrayList<Object>();
        List<Object> expectedNestedList = new ArrayList<Object>();
        expectedNestedList.add(2);
        expectedNestedList.add(3);
        expected.add(expectedNestedList);
        List<Object> result = IncrList.incrList(input);
        assertEquals(expected, result);
    }

    @Test
    void testListWithNestedListAndNonInteger() {
        List<Object> input = new ArrayList<Object>();
        List<Object> nestedList = new ArrayList<Object>();
        nestedList.add(1);
        nestedList.add("hello");
        nestedList.add(2);
        input.add(nestedList);
        input.add("world");
        List<Object> expected = new ArrayList<Object>();
        List<Object> expectedNestedList = new ArrayList<Object>();
        expectedNestedList.add(2);
        expectedNestedList.add(3);
        expected.add(expectedNestedList);
        List<Object> result = IncrList.incrList(input);
        assertEquals(expected, result);
    }

    @Test
    void testListWithNestedListAndNull() {
        List<Object> input = new ArrayList<Object>();
        List<Object> nestedList = null;
        input.add(nestedList);
        List<Object> expected = new ArrayList<Object>();
        List<Object> expectedNestedList = null;
        expected.add(expectedNestedList);
        List<Object> result = IncrList.incrList(input);
        assertEquals(expected, result);
    }
}
```