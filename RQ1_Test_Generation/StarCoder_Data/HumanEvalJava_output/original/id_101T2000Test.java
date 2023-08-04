// WordsStringTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {

    /**
    * Test case number: 1
    * Test case values: "Hi, my name is John"
    * Expected output (Post-state): ["Hi", "my", "name", "is", "John"]
    */
    @Test
    public void test1() {
        String s = "Hi, my name is John";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Hi", "my", "name", "is", "John"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case number: 2
    * Test case values: "One, two, three, four, five, six"
    * Expected output (Post-state): ["One", "two", "three", "four", "five", "six"]
    */
    @Test
    public void test2() {
        String s = "One, two, three, four, five, six";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("One", "two", "three", "four", "five", "six"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case number: 3
    * Test case values: "Hi, my name"
    * Expected output (Post-state): ["Hi", "my", "name"]
    */
    @Test
    public void test3() {
        String s = "Hi, my name";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Hi", "my", "name"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case number: 4
    * Test case values: "One,, two, three, four, five, six,"
    * Expected output (Post-state): ["One", "two", "three", "four", "five", "six"]
    */
    @Test
    public void test4() {
        String s = "One,, two, three, four, five, six,";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("One", "two", "three", "four", "five", "six"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case number: 5
    * Test case values: ""
    * Expected output (Post-state): []
    */
    @Test
    public void test5() {
        String s = "";
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case number: 6
    * Test case values: "ahmed     , gamal"
    * Expected output (Post-state): ["ahmed", "gamal"]
    */
    @Test
    public void test6() {
        String s = "ahmed     , gamal";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("ahmed", "gamal"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case number: 7
    * Test case values: "ahmed, gamal"
    * Expected output (Post-state): ["ahmed", "gamal"]
    */
    @Test
    public void test7() {
        String s = "ahmed, gamal";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("ahmed", "gamal"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case number: 8
    * Test case values: "ahmed, gamal, "
    * Expected output (Post-state): ["ahmed", "gamal"]
    */
    @Test
    public void test8() {
        String s = "ahmed, gamal, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("ahmed", "gamal"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case number: 9
    * Test case values: "ahmed, gamal, "
    * Expected output (Post-state): ["ahmed", "gamal"]
    */
    @Test
    public void test9() {
        String s = "ahmed, gamal, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("ahmed", "gamal"));
        assertEquals(expected, WordsString.wordsString(s));
    }

    /**
    * Test case number: 10
    * Test case values: "ahmed, gamal, "
    * Expected output (Post-state): ["ahmed", "gamal"]
    */
    @Test
    public void test10() {
        String s = "ahmed, gamal, ";
        List<Object> expected = new ArrayList<Object>(Arrays.asList("ahmed", "gamal"));
        assertEquals(expected, WordsString.wordsString(s));
    }
}
