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

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a null input.
     */
    @Test
    void testTokenize_0() {
        String str = null;
        String[] array = InspirentoUtilities.tokenize(str);
        assertEquals(0, array.length);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with an empty input.
     */
    @Test
    void testTokenize_1() {
        String str = "";
        String[] array = InspirentoUtilities.tokenize(str);
        assertEquals(0, array.length);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a single token input.
     */
    @Test
    void testTokenize_2() {
        String str = "file";
        String[] array = InspirentoUtilities.tokenize(str);
        assertEquals(1, array.length);
        assertEquals("file", array[0]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_3() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str);
        assertEquals(3, array.length);
        assertEquals("file", array[0]);
        assertEquals("edit", array[1]);
        assertEquals("view", array[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_4() {
        String str = "file edit view ";
        String[] array = InspirentoUtilities.tokenize(str);
        assertEquals(3, array.length);
        assertEquals("file", array[0]);
        assertEquals("edit", array[1]);
        assertEquals("view", array[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_5() {
        String str = " file edit view ";
        String[] array = InspirentoUtilities.tokenize(str);
        assertEquals(3, array.length);
        assertEquals("file", array[0]);
        assertEquals("edit", array[1]);
        assertEquals("view", array[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_6() {
        String str = " file edit view ";
        String[] array = InspirentoUtilities.tokenize(str);
        assertEquals(3, array.length);
        assertEquals("file", array[0]);
        assertEquals("edit", array[1]);
        assertEquals("view", array[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_7() {
        String str = " file edit view ";
        String[] array = InspirentoUtilities.tokenize(str);
        assertEquals(3, array.length);
        assertEquals("file", array[0]);
        assertEquals("edit", array[1]);
        assertEquals("view", array[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_8() {
        String str = " file edit view ";
        String[] array = InspirentoUtilities.tokenize(str);
        assertEquals(3, array.length);
        assertEquals("file", array[0]);
        assertEquals("edit", array[1]);
        assertEquals("view", array[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_9() {
        String str = " file edit view ";
        String[] array = InspirentoUtilities.tokenize(str);
        assertEquals(3, array.length);
        assertEquals("file", array[0]);
        assertEquals("edit", array[1]);
        assertEquals("view", array[2]);
    }
}
