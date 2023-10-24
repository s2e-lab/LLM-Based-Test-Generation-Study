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
        String[] cmd = InspirentoUtilities.tokenize(null);
        assertEquals(0, cmd.length);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with an empty input.
     */
    @Test
    void testTokenize_1() {
        String[] cmd = InspirentoUtilities.tokenize("");
        assertEquals(0, cmd.length);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a single token input.
     */
    @Test
    void testTokenize_2() {
        String[] cmd = InspirentoUtilities.tokenize("file");
        assertEquals(1, cmd.length);
        assertEquals("file", cmd[0]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_3() {
        String[] cmd = InspirentoUtilities.tokenize("file edit view");
        assertEquals(3, cmd.length);
        assertEquals("file", cmd[0]);
        assertEquals("edit", cmd[1]);
        assertEquals("view", cmd[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_4() {
        String[] cmd = InspirentoUtilities.tokenize("file edit view ");
        assertEquals(3, cmd.length);
        assertEquals("file", cmd[0]);
        assertEquals("edit", cmd[1]);
        assertEquals("view", cmd[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_5() {
        String[] cmd = InspirentoUtilities.tokenize(" file edit view ");
        assertEquals(3, cmd.length);
        assertEquals("file", cmd[0]);
        assertEquals("edit", cmd[1]);
        assertEquals("view", cmd[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_6() {
        String[] cmd = InspirentoUtilities.tokenize(" file edit view ");
        assertEquals(3, cmd.length);
        assertEquals("file", cmd[0]);
        assertEquals("edit", cmd[1]);
        assertEquals("view", cmd[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_7() {
        String[] cmd = InspirentoUtilities.tokenize(" file edit view ");
        assertEquals(3, cmd.length);
        assertEquals("file", cmd[0]);
        assertEquals("edit", cmd[1]);
        assertEquals("view", cmd[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_8() {
        String[] cmd = InspirentoUtilities.tokenize(" file edit view ");
        assertEquals(3, cmd.length);
        assertEquals("file", cmd[0]);
        assertEquals("edit", cmd[1]);
        assertEquals("view", cmd[2]);
    }

    /**
     * Test case for {@link InspirentoUtilities#tokenize(String)}.
     * It tests the method with a multiple token input.
     */
    @Test
    void testTokenize_9() {
        String[] cmd = InspirentoUtilities.tokenize(" file edit view ");
        assertEquals(3, cmd.length);
        assertEquals("file", cmd[0]);
        assertEquals("edit", cmd[1]);
        assertEquals("view", cmd[2]);
    }
}
