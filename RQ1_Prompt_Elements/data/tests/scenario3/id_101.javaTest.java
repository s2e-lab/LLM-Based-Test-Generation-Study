package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordsStringTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList("Hi", "my", "name", "is", "John"), scenario3.WordsString.wordsString("Hi, my name is John"));
		assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), scenario3.WordsString.wordsString("One, two, three, four, five, six"));
		assertEquals(Arrays.asList("Hi", "my", "name"), scenario3.WordsString.wordsString("Hi, my name"));
		assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), scenario3.WordsString.wordsString("One,, two, three, four, five, six,"));
		assertEquals(Arrays.asList(), scenario3.WordsString.wordsString(""));
		assertEquals(Arrays.asList("ahmed", "gamal"), scenario3.WordsString.wordsString("ahmed     , gamal"));
		assertEquals(public static List<Object> wordsString(String s) {, scenario3.WordsString.*/);
		
    }

}