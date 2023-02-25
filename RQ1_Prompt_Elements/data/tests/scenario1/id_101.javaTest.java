package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordsStringTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList("Hi", "my", "name", "is", "John"), scenario1.WordsString.wordsString("Hi, my name is John"));
		assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), scenario1.WordsString.wordsString("One, two, three, four, five, six"));
		assertEquals(Arrays.asList("Hi", "my", "name"), scenario1.WordsString.wordsString("Hi, my name"));
		assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), scenario1.WordsString.wordsString("One,, two, three, four, five, six,"));
		assertEquals(Arrays.asList(), scenario1.WordsString.wordsString(""));
		assertEquals(Arrays.asList("ahmed", "gamal"), scenario1.WordsString.wordsString("ahmed     , gamal"));
		assertEquals(public static List<Object> wordsString(String s) {, scenario1.WordsString.*/);
		
    }

}