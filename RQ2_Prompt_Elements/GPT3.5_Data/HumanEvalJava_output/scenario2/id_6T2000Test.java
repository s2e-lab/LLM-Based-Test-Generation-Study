Here's the code for the test class:

```
class ParseNestedParensTest {

    @Test
    void testEmptyString() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = ParseNestedParens.parseNestedParens("");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleGroup() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> actual = ParseNestedParens.parseNestedParens("(())");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleGroups() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(1);
        List<Integer> actual = ParseNestedParens.parseNestedParens("((())) ()");
        assertEquals(expected, actual);
    }

    @Test
    void testNestedGroups() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(2);
        List<Integer> actual = ParseNestedParens.parseNestedParens("((())()) ((())) ()");
        assertEquals(expected, actual);
    }

    @Test
    void testNoGroups() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = ParseNestedParens.parseNestedParens("abc");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleOpenParen() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = ParseNestedParens.parseNestedParens("(");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleCloseParen() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = ParseNestedParens.parseNestedParens(")");
        assertEquals(expected, actual);
    }

    @Test
    void testUnmatchedOpenParen() {
        assertThrows(RuntimeException.class, () -> {
            ParseNestedParens.parseNestedParens("(()");
        });
    }

    @Test
    void testUnmatchedCloseParen() {
        assertThrows(RuntimeException.class, () -> {
            ParseNestedParens.parseNestedParens("())");
        });
    }

    @Test
    void testInvalidCharacter() {
        assertThrows(RuntimeException.class, () -> {
            ParseNestedParens.parseNestedParens("(a)");
        });
    }

    @Test
    void testWhitespace() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> actual = ParseNestedParens.parseNestedParens("( )");
        assertEquals(expected, actual);
    }
}
```