class ParseNestedParensTest {
    @Test
    void testParseNestedParens() {
        assertEquals(ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"), Arrays.asList(2, 3, 1, 3));
        assertEquals(ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"), Arrays.asList(1, 2, 3, 4));
        assertEquals(ParseNestedParens.parseNestedParens("(()(())((())))"), Arrays.asList(4));
        assertEquals(ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"), Arrays.asList(2, 3, 1, 3));
        assertEquals(ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"), Arrays.asList(1, 2, 3, 4));
        assertEquals(ParseNestedParens.parseNestedParens("(()(())((())))"), Arrays.asList(4));
        assertEquals(ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"), Arrays.asList(2, 3, 1, 3));
        assertEquals(ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"), Arrays.asList(1, 2, 3, 4));
        assertEquals(ParseNestedParens.parseNestedParens("(()(())((())))"), Arrays.asList(4));
        assertEquals(ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"), Arrays.asList(2, 3, 1, 3));
    }
}