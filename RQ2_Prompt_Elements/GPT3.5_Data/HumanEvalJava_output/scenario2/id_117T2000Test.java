Here's the code for the test class:

```
class SelectWordsTest {

    @Test
    void testEmptyString() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("", 2);
        assertEquals(expected, actual);
    }

    @Test
    void testNoWordsWithNConsonants() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("hello world", 4);
        assertEquals(expected, actual);
    }

    @Test
    void testOneWordWithNConsonants() {
        List<Object> expected = new ArrayList<>();
        expected.add("world");
        List<Object> actual = SelectWords.selectWords("hello world", 4);
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithNConsonants() {
        List<Object> expected = new ArrayList<>();
        expected.add("world");
        expected.add("people");
        List<Object> actual = SelectWords.selectWords("hello world how are you people doing today", 4);
        assertEquals(expected, actual);
    }

    @Test
    void testAllWordsWithNConsonants() {
        List<Object> expected = new ArrayList<>();
        expected.add("world");
        expected.add("people");
        expected.add("doing");
        List<Object> actual = SelectWords.selectWords("hello world how are you people doing today", 3);
        assertEquals(expected, actual);
    }

    @Test
    void testNConsonantsIsZero() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("hello world how are you people doing today", 0);
        assertEquals(expected, actual);
    }

    @Test
    void testNConsonantsIsNegative() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("hello world how are you people doing today", -1);
        assertEquals(expected, actual);
    }

    @Test
    void testStringContainsOnlyOneWord() {
        List<Object> expected = new ArrayList<>();
        expected.add("hello");
        List<Object> actual = SelectWords.selectWords("hello", 3);
        assertEquals(expected, actual);
    }

    @Test
    void testStringContainsOnlyOneWordWithNConsonants() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("hello", 0);
        assertEquals(expected, actual);
    }

    @Test
    void testStringContainsOnlyOneWordWithNoConsonants() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("aeiou", 2);
        assertEquals(expected, actual);
    }
}
```