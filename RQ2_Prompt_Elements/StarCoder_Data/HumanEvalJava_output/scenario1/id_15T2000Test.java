// StringSequenceTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains ten unit test cases for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {

    @Test
    void testStringSequence1() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 ", StringSequence.stringSequence(9));
    }

    @Test
    void testStringSequence2() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 ", StringSequence.stringSequence(10));
    }

    @Test
    void testStringSequence3() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 ", StringSequence.stringSequence(11));
    }

    @Test
    void testStringSequence4() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 ", StringSequence.stringSequence(12));
    }

    @Test
    void testStringSequence5() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13 ", StringSequence.stringSequence(13));
    }

    @Test
    void testStringSequence6() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 ", StringSequence.stringSequence(14));
    }

    @Test
    void testStringSequence7() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 ", StringSequence.stringSequence(15));
    }

    @Test
    void testStringSequence8() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 ", StringSequence.stringSequence(16));
    }

    @Test
    void testStringSequence9() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 ", StringSequence.stringSequence(17));
    }

    @Test
    void testStringSequence10() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 ", StringSequence.stringSequence(18));
    }
}
