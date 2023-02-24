// CompareOneTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link CompareOne}.
 * It contains ten test cases for the {@link scenario1.CompareOne#compareOne()} method.
 */
class CompareOneTest {
		


    /**
     * Test case 1.
     * Input: a = "1.0", b = "2.0".
     * Expected result: b = "2.0".
     */
    @Test
    void testCompareOne1() {
        Object a = "1.0";
        Object b = "2.0";
        Object expected = "2.0";
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Test case 2.
     * Input: a = "2.0", b = "1.0".
     * Expected result: a = "2.0".
     */
    @Test
    void testCompareOne2() {
        Object a = "2.0";
        Object b = "1.0";
        Object expected = "2.0";
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Test case 3.
     * Input: a = "1.0", b = "1.0".
     * Expected result: null.
     */
    @Test
    void testCompareOne3() {
        Object a = "1.0";
        Object b = "1.0";
        Object expected = null;
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Test case 4.
     * Input: a = "1.0", b = "1,0".
     * Expected result: null.
     */
    @Test
    void testCompareOne4() {
        Object a = "1.0";
        Object b = "1,0";
        Object expected = null;
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Test case 5.
     * Input: a = "1,0", b = "1.0".
     * Expected result: null.
     */
    @Test
    void testCompareOne5() {
        Object a = "1,0";
        Object b = "1.0";
        Object expected = null;
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Test case 6.
     * Input: a = "1,0", b = "2,0".
     * Expected result: b = "2,0".
     */
    @Test
    void testCompareOne6() {
        Object a = "1,0";
        Object b = "2,0";
        Object expected = "2,0";
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Test case 7.
     * Input: a = "2,0", b = "1,0".
     * Expected result: a = "2,0".
     */
    @Test
    void testCompareOne7() {
        Object a = "2,0";
        Object b = "1,0";
        Object expected = "2,0";
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Test case 8.
     * Input: a = "1,0", b = "1,0".
     * Expected result: null.
     */
    @Test
    void testCompareOne8() {
        Object a = "1,0";
        Object b = "1,0";
        Object expected = null;
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Test case 9.
     * Input: a = "1.0", b = "2,0".
     * Expected result: b = "2,0".
     */
    @Test
    void testCompareOne9() {
        Object a = "1.0";
        Object b = "2,0";
        Object expected = "2,0";
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(