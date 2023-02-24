// BelowZeroTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link BelowZero}.
* It contains ten test cases for the {@link BelowZero#belowZero()} method.
*/
class BelowZeroTest {


    @Test
    void testBelowZero() {
        List<Object> operations = new ArrayList<>();
        operations.add(1.0);
        operations.add(2.0);
        operations.add(3.0);
        operations.add(4.0);
        operations.add(5.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero2() {
        List<Object> operations = new ArrayList<>();
        operations.add(1.0);
        operations.add(2.0);
        operations.add(3.0);
        operations.add(4.0);
        operations.add(-5.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero3() {
        List<Object> operations = new ArrayList<>();
        operations.add(1.0);
        operations.add(2.0);
        operations.add(3.0);
        operations.add(4.0);
        operations.add(-5.0);
        operations.add(6.0);
        operations.add(7.0);
        operations.add(8.0);
        operations.add(9.0);
        operations.add(10.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero4() {
        List<Object> operations = new ArrayList<>();
        operations.add(1.0);
        operations.add(2.0);
        operations.add(3.0);
        operations.add(4.0);
        operations.add(-5.0);
        operations.add(6.0);
        operations.add(7.0);
        operations.add(8.0);
        operations.add(9.0);
        operations.add(10.0);
        operations.add(11.0);
        operations.add(12.0);
        operations.add(13.0);
        operations.add(14.0);
        operations.add(15.0);
        operations.add(16.0);
        operations.add(17.0);
        operations.add(18.0);
        operations.add(19.0);
        operations.add(20.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero5() {
        List<Object> operations = new ArrayList<>();
        operations.add(1.0);
        operations.add(2.0);
        operations.add(3.0);
        operations.add(4.0);
        operations.add(-5.0);
        operations.add(6.0);
        operations.add(7.0);
        operations.add(8.0);
        operations.add(9.0);
        operations.add(10.0);
        operations.add(11.0);
        operations.add(12.0);
        operations.add(13.0);
        operations.add(14.0);
        operations.add(15.0);
        operations.add(16.0);
        operations.add(17.0);
        operations.add(18.0);
        operations.add(19.0);
        operations.add(20.0);
        operations.add(21.0);
        operations.add(22.0);
        operations.add(23.0);
        operations.add(24.0);
        operations.add(25.0);
        operations.add(26.0);
        operations.add(27.0);
        operations.add(28.0);
        operations.add(29.0);
        operations.add(30.0);
        operations.add(31.0);
        operations.add(32.0);
        operations.add(33.0);
        operations.add(34.0);
        operations.add(35.0);
        operations.add(36.0);
        operations.add(37.0);
        operations.add(38.0);
        operations.add(39.0);
        operations.add(40.0);
        operations.add(41.0);
        operations.add(42.0);
