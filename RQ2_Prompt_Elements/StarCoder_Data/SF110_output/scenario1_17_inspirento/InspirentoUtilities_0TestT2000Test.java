// InspirentoUtilities_0Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#tokenize(String)} method.
*/
class InspirentoUtilities_0Test {

    @Test
    void tokenize_0() {
        String input = "a b c";
        String[] expected = {"a", "b", "c"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void tokenize_1() {
        String input = "a b c ";
        String[] expected = {"a", "b", "c"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void tokenize_2() {
        String input = "a b c d";
        String[] expected = {"a", "b", "c", "d"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void tokenize_3() {
        String input = "a b c d ";
        String[] expected = {"a", "b", "c", "d"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void tokenize_4() {
        String input = "a b c d e";
        String[] expected = {"a", "b", "c", "d", "e"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void tokenize_5() {
        String input = "a b c d e ";
        String[] expected = {"a", "b", "c", "d", "e"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void tokenize_6() {
        String input = "a b c d e f";
        String[] expected = {"a", "b", "c", "d", "e", "f"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void tokenize_7() {
        String input = "a b c d e f ";
        String[] expected = {"a", "b", "c", "d", "e", "f"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void tokenize_8() {
        String input = "a b c d e f g";
        String[] expected = {"a", "b", "c", "d", "e", "f", "g"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void tokenize_9() {
        String input = "a b c d e f g ";
        String[] expected = {"a", "b", "c", "d", "e", "f", "g"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }
}
