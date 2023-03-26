// Test case 1: Test when both inputs are integers and the first input is larger
    @Test
    void testCompareOneIntLargerFirst() {
        Object result = CompareOne.compareOne(5, 3);
        assertEquals(5, result);
    }

    // Test case 2: Test when both inputs are integers and the second input is larger
    @Test
    void testCompareOneIntLargerSecond() {
        Object result = CompareOne.compareOne(3, 5);
        assertEquals(5, result);
    }

    // Test case 3: Test when both inputs are integers and they are equal
    @Test
    void testCompareOneIntEqual() {
        Object result = CompareOne.compareOne(5, 5);
        assertNull(result);
    }

    // Test case 4: Test when both inputs are floats and the first input is larger
    @Test
    void testCompareOneFloatLargerFirst() {
        Object result = CompareOne.compareOne(5.5f, 3.3f);
        assertEquals(5.5f, result);
    }

    // Test case 5: Test when both inputs are floats and the second input is larger
    @Test
    void testCompareOneFloatLargerSecond() {
        Object result = CompareOne.compareOne(3.3f, 5.5f);
        assertEquals(5.5f, result);
    }

    // Test case 6: Test when both inputs are floats and they are equal
    @Test
    void testCompareOneFloatEqual() {
        Object result = CompareOne.compareOne(5.5f, 5.5f);
        assertNull(result);
    }

    // Test case 7: Test when both inputs are strings representing integers and the first input is larger
    @Test
    void testCompareOneStringIntLargerFirst() {
        Object result = CompareOne.compareOne("5", "3");
        assertEquals("5", result);
    }

    // Test case 8: Test when both inputs are strings representing integers and the second input is larger
    @Test
    void testCompareOneStringIntLargerSecond() {
        Object result = CompareOne.compareOne("3", "5");
        assertEquals("5", result);
    }

    // Test case 9: Test when both inputs are strings representing floats and the first input is larger
    @Test
    void testCompareOneStringFloatLargerFirst() {
        Object result = CompareOne.compareOne("5.5", "3.3");
        assertEquals("5.5", result);
    }

    // Test case 10: Test when both inputs are strings representing floats and the second input is larger
    @Test
    void testCompareOneStringFloatLargerSecond() {
        Object result = CompareOne.compareOne("3.3", "5.5");
        assertEquals("5.5", result);
    }
}