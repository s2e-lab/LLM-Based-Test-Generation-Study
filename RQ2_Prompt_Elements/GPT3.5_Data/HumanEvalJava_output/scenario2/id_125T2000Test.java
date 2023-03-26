// Test case 1: Test splitting on whitespace
    @Test
    void testSplitWordsWithWhitespace() {
        String txt = "Hello world";
        Object expected = Arrays.asList("Hello", "world");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    // Test case 2: Test splitting on comma
    @Test
    void testSplitWordsWithComma() {
        String txt = "apple,banana,orange";
        Object expected = Arrays.asList("apple", "banana", "orange");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    // Test case 3: Test counting odd lower-case letters when no whitespaces or commas exist
    @Test
    void testSplitWordsWithNoWhitespaceOrComma() {
        String txt = "Thequickbrownfoxjumpsoverthelazydog";
        Object expected = 13;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    // Test case 4: Test counting odd lower-case letters when input is empty
    @Test
    void testSplitWordsWithEmptyInput() {
        String txt = "";
        Object expected = 0;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    // Test case 5: Test splitting on multiple whitespaces
    @Test
    void testSplitWordsWithMultipleWhitespaces() {
        String txt = "Hello     world";
        Object expected = Arrays.asList("Hello", "world");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    // Test case 6: Test splitting on multiple commas
    @Test
    void testSplitWordsWithMultipleCommas() {
        String txt = "apple,,,banana,orange";
        Object expected = Arrays.asList("apple", "", "banana", "orange");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    // Test case 7: Test splitting on mixed whitespaces and commas
    @Test
    void testSplitWordsWithMixedWhitespacesAndCommas() {
        String txt = "apple, banana orange";
        Object expected = Arrays.asList("apple,", "banana", "orange");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    // Test case 8: Test splitting on only one word
    @Test
    void testSplitWordsWithOneWord() {
        String txt = "Hello";
        Object expected = Arrays.asList("Hello");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    // Test case 9: Test counting odd lower-case letters when no letters exist
    @Test
    void testSplitWordsWithNoLetters() {
        String txt = "1234567890";
        Object expected = 0;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }

    // Test case 10: Test counting odd lower-case letters when all letters are even
    @Test
    void testSplitWordsWithAllEvenLetters() {
        String txt = "bcdfghjklmnpqrstvwxyz";
        Object expected = 0;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
}