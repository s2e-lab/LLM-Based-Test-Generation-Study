// InspirentoUtilities_2Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
*/
class InspirentoUtilities_2Test {

    @Test
    void stringReplaceAll_1() {
        StringBuffer source = new StringBuffer("Hello World");
        String replacement = "Goodbye";
        String expected = "Goodbye World";
        assertEquals(expected, InspirentoUtilities.stringReplaceAll(source, 'o', replacement).toString());
    }

    @Test
    void stringReplaceAll_2() {
        StringBuffer source = new StringBuffer("Hello World");
        String replacement = "Goodbye";
        String expected = "HeGoodbye Worldb";
        assertEquals(expected, InspirentoUtilities.stringReplaceAll(source, 'l', replacement).toString());
    }

    @Test
    void stringReplaceAll_3() {
        StringBuffer source = new StringBuffer("Hello World");
        String replacement = "Goodbye";
        String expected = "HeGoodbye Worldb";
        assertEquals(expected, InspirentoUtilities.stringReplaceAll(source, 'l', replacement).toString());
    }

    @Test
    void stringReplaceAll_4() {
        StringBuffer source = new StringBuffer("Hello World");
        String replacement = "Goodbye";
        String expected = "HeGoodbye Worldb";
        assertEquals(expected, InspirentoUtilities.stringReplaceAll(source, 'l', replacement).toString());
    }

    @Test
    void stringReplaceAll_5() {
        StringBuffer source = new StringBuffer("Hello World");
        String replacement = "Goodbye";
        String expected = "HeGoodbye Worldb";
        assertEquals(expected, InspirentoUtilities.stringReplaceAll(source, 'l', replacement).toString());
    }

    @Test
    void stringReplaceAll_6() {
        StringBuffer source = new StringBuffer("Hello World");
        String replacement = "Goodbye";
        String expected = "HeGoodbye Worldb";
        assertEquals(expected, InspirentoUtilities.stringReplaceAll(source, 'l', replacement).toString());
    }

    @Test
    void stringReplaceAll_7() {
        StringBuffer source = new StringBuffer("Hello World");
        String replacement = "Goodbye";
        String expected = "HeGoodbye Worldb";
        assertEquals(expected, InspirentoUtilities.stringReplaceAll(source, 'l', replacement).toString());
    }

    @Test
    void stringReplaceAll_8() {
        StringBuffer source = new StringBuffer("Hello World");
        String replacement = "Goodbye";
        String expected = "HeGoodbye Worldb";
        assertEquals(expected, InspirentoUtilities.stringReplaceAll(source, 'l', replacement).toString());
    }

    @Test
    void stringReplaceAll_9() {
        StringBuffer source = new StringBuffer("Hello World");
        String replacement = "Goodbye";
        String expected = "HeGoodbye Worldb";
        assertEquals(expected, InspirentoUtilities.stringReplaceAll(source, 'l', replacement).toString());
    }

    @Test
    void stringReplaceAll_10() {
        StringBuffer source = new StringBuffer("Hello World");
        String replacement = "Goodbye";
        String expected = "HeGoodbye Worldb";
        assertEquals(expected, InspirentoUtilities.stringReplaceAll(source, 'l', replacement).toString());
    }
}
