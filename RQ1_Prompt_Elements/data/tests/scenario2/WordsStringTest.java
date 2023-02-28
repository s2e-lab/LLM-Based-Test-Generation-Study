package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordsStringTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList("Hi", "my", "name", "is", "John"), scenario2.WordsString.wordsString("Hi, my name is John"));
		assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), scenario2.WordsString.wordsString("One, two, three, four, five, six"));
		assertEquals(Arrays.asList("Hi", "my", "name"), scenario2.WordsString.wordsString("Hi, my name"));
		assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), scenario2.WordsString.wordsString("One,, two, three, four, five, six,"));
		assertEquals(Arrays.asList(), scenario2.WordsString.wordsString(""));
		assertEquals(Arrays.asList("ahmed", "gamal"), scenario2.WordsString.wordsString("ahmed     , gamal"));
		
    }

}