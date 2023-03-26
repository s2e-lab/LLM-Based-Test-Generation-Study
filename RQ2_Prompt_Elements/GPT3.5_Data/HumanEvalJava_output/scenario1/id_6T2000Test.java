Here's the code for the test class:

```
class ParseNestedParensTest {

    @Test
    void testEmptyString() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = ParseNestedParens.parseNestedParens("");
        assertEquals(expected, result);
    }

    @Test
    void testSinglePair() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> result = ParseNestedParens.parseNestedParens("()");
        assertEquals(expected, result);
    }

    @Test
    void testMultiplePairs() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(1);
        List<Integer> result = ParseNestedParens.parseNestedParens("()()()");
        assertEquals(expected, result);
    }

    @Test
    void testNestedPairs() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(1);
        List<Integer> result = ParseNestedParens.parseNestedParens("(())()");
        assertEquals(expected, result);
    }

    @Test
    void testMultipleNestedPairs() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(1);
        List<Integer> result = ParseNestedParens.parseNestedParens("(()())()");
        assertEquals(expected, result);
    }

    @Test
    void testSingleNestedPair() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        List<Integer> result = ParseNestedParens.parseNestedParens("(()())");
        assertEquals(expected, result);
    }

    @Test
    void testMultipleNestedPairs2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(2);
        List<Integer> result = ParseNestedParens.parseNestedParens("(()(()))()");
        assertEquals(expected, result);
    }

    @Test
    void testMultipleNestedPairs3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(3);
        List<Integer> result = ParseNestedParens.parseNestedParens("(()(()()))()");
        assertEquals(expected, result);
    }

    @Test
    void testMultipleNestedPairs4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(2);
        List<Integer> result = ParseNestedParens.parseNestedParens("(()(()))");
        assertEquals(expected, result);
    }

    @Test
    void testMultipleNestedPairs5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(3);
        List<Integer> result = ParseNestedParens.parseNestedParens("(()(()()))");
        assertEquals(expected, result);
    }
}
```