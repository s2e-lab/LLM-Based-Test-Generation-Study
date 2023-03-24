// StringSequenceTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StringSequence}.
 * It contains ten unit test cases for the {@link StringSequence#stringSequence(int)} method.
 */
class StringSequenceTest {

    @Test
    void testStringSequenceWithZero() {
        String expected = "0";
        String actual = StringSequence.stringSequence(0);
        assertEquals(expected, actual);
    }

    @Test
    void testStringSequenceWithPositiveNumber() {
        String expected = "0 1 2 3 4 5";
        String actual = StringSequence.stringSequence(5);
        assertEquals(expected, actual);
    }

    @Test
    void testStringSequenceWithSameNumber() {
        String expected = "0";
        String actual = StringSequence.stringSequence(0);
        assertEquals(expected, actual);
    }

    @Test
    void testStringSequenceWithAnotherPositiveNumber() {
        String expected = "0 1 2 3";
        String actual = StringSequence.stringSequence(3);
        assertEquals(expected, actual);
    }

    @Test
    void testStringSequenceWithLargeNumber() {
        String expected = "0 1 2 3 4 5 6 7 8 9 10";
        String actual = StringSequence.stringSequence(10);
        assertEquals(expected, actual);
    }

    @Test
    void testStringSequenceWithNegativeNumber() {
        String expected = "";
        String actual = StringSequence.stringSequence(-5);
        assertEquals(expected, actual);
    }

    @Test
    void testStringSequenceWithMaxValue() {
        String expected = "";
        String actual = StringSequence.stringSequence(Integer.MAX_VALUE);
        assertEquals(expected, actual);
    }

    @Test
    void testStringSequenceWithMinValue() {
        String expected = "0";
        String actual = StringSequence.stringSequence(Integer.MIN_VALUE);
        assertEquals(expected, actual);
    }

    @Test
    void testStringSequenceWithOddNumber() {
        String expected = "0 1 2 3 4 5 6 7 8 9 10 11";
        String actual = StringSequence.stringSequence(11);
        assertEquals(expected, actual);
    }

    @Test
    void testStringSequenceWithEvenNumber() {
        String expected = "0 1 2 3 4 5 6 7 8 9 10 11 12";
        String actual = StringSequence.stringSequence(12);
        assertEquals(expected, actual);
    }
}