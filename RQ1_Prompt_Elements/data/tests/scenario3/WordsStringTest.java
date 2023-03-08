package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsStringTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList("Hi", "my", "name", "is", "John"), scenario3.WordsString.wordsString("Hi, my name is John"));
        assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), scenario3.WordsString.wordsString("One, two, three, four, five, six"));
        assertEquals(Arrays.asList("Hi", "my", "name"), scenario3.WordsString.wordsString("Hi, my name"));
        assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), scenario3.WordsString.wordsString("One,, two, three, four, five, six,"));
        assertEquals(Arrays.asList(), scenario3.WordsString.wordsString(""));
        assertEquals(Arrays.asList("ahmed", "gamal"), scenario3.WordsString.wordsString("ahmed     , gamal"));

    }

}