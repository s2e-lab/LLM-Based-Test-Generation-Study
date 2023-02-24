// SumSquaresTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link SumSquares}.
 * It contains ten test cases for the {@link scenario1.SumSquares#sumSquares()} method.
 */
class SumSquaresTest {
		


    @Test
    void testSumSquares() {
        List<Number> lst = new ArrayList<Number>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        assertEquals(55, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares2() {
        List<Number> lst = new ArrayList<Number>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        assertEquals(385, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares3() {
        List<Number> lst = new ArrayList<Number>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        lst.add(11);
        lst.add(12);
        lst.add(13);
        lst.add(14);
        lst.add(15);
        lst.add(16);
        lst.add(17);
        lst.add(18);
        lst.add(19);
        lst.add(20);
        assertEquals(2870, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares4() {
        List<Number> lst = new ArrayList<Number>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        lst.add(11);
        lst.add(12);
        lst.add(13);
        lst.add(14);
        lst.add(15);
        lst.add(16);
        lst.add(17);
        lst.add(18);
        lst.add(19);
        lst.add(20);
        lst.add(21);
        lst.add(22);
        lst.add(23);
        lst.add(24);
        lst.add(25);
        lst.add(26);
        lst.add(27);
        lst.add(28);
        lst.add(29);
        lst.add(30);
        assertEquals(5050, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares5() {
        List<Number> lst = new ArrayList<Number>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        lst.add(11);
        lst.add(12);
        lst.add(13);
        lst.add(14);
        lst.add(15);
        lst.add(16);
        lst.add(17);
        lst.add(18);
        lst.add(19);
        lst.add(20);
        lst.add(21);
        lst.add(22);
