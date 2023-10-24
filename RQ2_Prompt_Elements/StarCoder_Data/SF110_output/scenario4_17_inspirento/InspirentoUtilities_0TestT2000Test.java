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
     * Test method for {@link InspirentoUtilities#tokenize(String)}.
     */
    @Test
    void testTokenize() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str);
        assertEquals(array.length, 3);
        assertEquals(array[0], "file");
        assertEquals(array[1], "edit");
        assertEquals(array[2], "view");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_01() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "file");
        assertEquals(array[1], "edit");
        assertEquals(array[2], "view");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_02() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, "e");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_03() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, "e ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_04() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " e");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_05() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " e ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_06() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " e ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_07() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " e ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_08() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " e ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_09() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " e ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_10() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " e ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }
}

// InspirentoUtilities_1Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#tokenize(String, String)} method.
*/
class InspirentoUtilities_1Test {
		
    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "file");
        assertEquals(array[1], "edit");
        assertEquals(array[2], "view");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_01() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, "e");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_02() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, "e ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_03() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " e");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_04() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " e ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_05() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " e ");
        assertEquals(array.length, 3);
        assertEquals(array[0], "f");
        assertEquals(array[1], "dit");
        assertEquals(array[2], "w");
    }

    /**
     * Test method for {@link InspirentoUtilities#tokenize(String, String)}.
     */
    @Test
    void testTokenize_06() {
        String str = "file edit view";
        String[] array = InspirentoUtilities.tokenize(str, " e ");