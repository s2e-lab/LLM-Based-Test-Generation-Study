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
        assertEquals("0", StringSequence.stringSequence(0));
    }

    @Test
    void testStringSequenceWithPositiveNumber() {
        assertEquals("0 1 2 3 4 5", StringSequence.stringSequence(5));
    }

    @Test
    void testStringSequenceWithNegativeNumber() {
        assertEquals("", StringSequence.stringSequence(-5));
    }

    @Test
    void testStringSequenceWithOne() {
        assertEquals("0 1", StringSequence.stringSequence(1));
    }

    @Test
    void testStringSequenceWithTen() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10", StringSequence.stringSequence(10));
    }

    @Test
    void testStringSequenceWithMaxValue() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", StringSequence.stringSequence(Integer.MAX_VALUE));
    }

    @Test
    void testStringSequenceWithOddNumber() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11", StringSequence.stringSequence(11));
    }

    @Test
    void testStringSequenceWithEvenNumber() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12", StringSequence.stringSequence(12));
    }

    @Test
    void testStringSequenceWithLargeNumber() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30", StringSequence.stringSequence(30));
    }

    @Test
    void testStringSequenceWithVeryLargeNumber() {
        assertEquals("", StringSequence.stringSequence(Integer.MAX_VALUE - 1));
    }
}