class SeparateParenGroupsTest {
    @Test
    void test1() {
        List<String> result = SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())");
        List<String> expected = new ArrayList<String>();
        expected.add("(()())");
        expected.add("((()))");
        expected.add("()");
        expected.add("((())()())");
        assertEquals(expected, result);
    }

    @Test
    void test2() {
        List<String> result = SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))");
        List<String> expected = new ArrayList<String>();
        expected.add("()");
        expected.add("(())");
        expected.add("((()))");
        expected.add("(((())))");
        assertEquals(expected, result);
    }

    @Test
    void test3() {
        List<String> result = SeparateParenGroups.separateParenGroups("(()(())((())))");
        List<String> expected = new ArrayList<String>();
        expected.add("(()(())((())))");
        assertEquals(expected, result);
    }

    @Test
    void test4() {
        List<String> result = SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))");
        List<String> expected = new ArrayList<String>();
        expected.add("()");
        expected.add("(())");
        expected.add("(()())");
        assertEquals(expected, result);
    }

    @Test
    void test5() {
        List<String> result = SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())");
        List<String> expected = new ArrayList<String>();
        expected.add("(()())");
        expected.add("((()))");
        expected.add("()");
        expected.add("((())()())");
        assertEquals(expected, result);
    }

    @Test
    void test6() {
        List<String> result = SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))");
        List<String> expected = new ArrayList<String>();
        expected.add("()");
        expected.add("(())");
        expected.add("((()))");
        expected.add("(((())))");
        assertEquals(expected, result);
    }

    @Test
    void test7() {
        List<String> result = SeparateParenGroups.separateParenGroups("(()(())((())))");
        List<String> expected = new ArrayList<String>();
        expected.add("(()(())((())))");
        assertEquals(expected, result);
    }

    @Test
    void test8() {
        List<String> result = SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))");
        List<String> expected = new ArrayList<String>();
        expected.add("()");
        expected.add("(())");
        expected.add("(()())");
        assertEquals(expected, result);
    }

    @Test
    void test9() {
        List<String> result = SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())");
        List<String> expected = new ArrayList<String>();
        expected.add("(()())");
        expected.add("((()))");
        expected.add("()");
        expected.add("((())()())");
        assertEquals(expected, result);
    }

    @Test
    void test10() {
        List<String> result = SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))");
        List<String> expected = new ArrayList<String>();
        expected.add("()");
        expected.add("(())");
        expected.add("((()))");
        expected.add("(((())))");
        assertEquals(expected, result);
    }
}