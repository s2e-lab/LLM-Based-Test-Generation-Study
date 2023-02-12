public class WordsStringTest {
    @Test
    public void testWordsString() {
        assertEquals(Arrays.asList("Hi", "my", "name", "is", "John"), WordsString.wordsString("Hi, my name is John"));
        assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), WordsString.wordsString("One, two, three, four, five, six"));
        assertEquals(Arrays.asList("Hi", "my", "name"), WordsString.wordsString("Hi, my name"));
        assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), WordsString.wordsString("One,, two, three, four, five, six,"));
        assertEquals(Arrays.asList(), WordsString.wordsString(""));
        assertEquals(Arrays.asList("ahmed", "gamal"), WordsString.wordsString("ahmed     , gamal"));
        assertEquals(Arrays.asList("ahmed", "gamal"), WordsString.wordsString("ahmed,gamal"));
        assertEquals(Arrays.asList("ahmed", "gamal"), WordsString.wordsString("ahmed, gamal"));
        assertEquals(Arrays.asList("ahmed", "gamal"), WordsString.wordsString("ahmed , gamal"));
        assertEquals(Arrays.asList("ahmed", "gamal"), WordsString.wordsString("ahmed ,gamal"));
    }
}