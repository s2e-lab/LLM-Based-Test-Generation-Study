// Test case 1: Empty string
@Test
void testEmptyString() {
    List<String> expected = new ArrayList<String>();
    List<String> result = SeparateParenGroups.separateParenGroups("");
    assertEquals(expected, result);
}

// Test case 2: Single group of parentheses
@Test
void testSingleGroup() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("()");
    assertEquals(expected, result);
}

// Test case 3: Multiple groups of parentheses
@Test
void testMultipleGroups() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    expected.add("()");
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("()()()");
    assertEquals(expected, result);
}

// Test case 4: Nested groups of parentheses
@Test
void testNestedGroups() {
    List<String> expected = new ArrayList<String>();
    expected.add("(())");
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("(())()");
    assertEquals(expected, result);
}

// Test case 5: Unbalanced groups of parentheses
@Test
void testUnbalancedGroups() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("()(");
    assertEquals(expected, result);
}

// Test case 6: Groups of parentheses with spaces
@Test
void testGroupsWithSpaces() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("( ) ( )");
    assertEquals(expected, result);
}

// Test case 7: Groups of parentheses with other characters
@Test
void testGroupsWithOtherCharacters() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("(a)b(c)d(e)f(g)h");
    assertEquals(expected, result);
}

// Test case 8: Groups of parentheses with special characters
@Test
void testGroupsWithSpecialCharacters() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("(+) (-)");
    assertEquals(expected, result);
}

// Test case 9: Groups of parentheses with non-ASCII characters
@Test
void testGroupsWithNonASCIICharacters() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("(é) (ñ)");
    assertEquals(expected, result);
}

// Test case 10: Groups of parentheses with mixed types of brackets
@Test
void testGroupsWithMixedBrackets() {
    List<String> expected = new ArrayList<String>();
    expected.add("[]");
    expected.add("{}");
    expected.add("<>");
    List<String> result = SeparateParenGroups.separateParenGroups("[]{}<>");
    assertEquals(expected, result);
}
}