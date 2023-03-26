// Test case 1: Test with an empty string
    @Test
    void testEmptyString() {
        assertEquals(0, VowelsCount.vowelsCount(""));
    }

    // Test case 2: Test with a string containing no vowels
    @Test
    void testNoVowels() {
        assertEquals(0, VowelsCount.vowelsCount("xyz"));
    }

    // Test case 3: Test with a string containing only one vowel
    @Test
    void testOneVowel() {
        assertEquals(1, VowelsCount.vowelsCount("a"));
    }

    // Test case 4: Test with a string containing multiple vowels
    @Test
    void testMultipleVowels() {
        assertEquals(3, VowelsCount.vowelsCount("hello"));
    }

    // Test case 5: Test with a string containing both upper and lower case vowels
    @Test
    void testMixedCaseVowels() {
        assertEquals(3, VowelsCount.vowelsCount("HeLLo"));
    }

    // Test case 6: Test with a string containing 'y' at the end
    @Test
    void testYAtEnd() {
        assertEquals(1, VowelsCount.vowelsCount("happy"));
    }

    // Test case 7: Test with a string containing 'Y' at the end
    @Test
    void testCapitalYAtEnd() {
        assertEquals(1, VowelsCount.vowelsCount("HAPPY"));
    }

    // Test case 8: Test with a string containing 'y' not at the end
    @Test
    void testYNotAtEnd() {
        assertEquals(0, VowelsCount.vowelsCount("yellow"));
    }

    // Test case 9: Test with a string containing 'Y' not at the end
    @Test
    void testCapitalYNotAtEnd() {
        assertEquals(0, VowelsCount.vowelsCount("YELLOW"));
    }

    // Test case 10: Test with a string containing all vowels
    @Test
    void testAllVowels() {
        assertEquals(6, VowelsCount.vowelsCount("aeiouy"));
    }
}