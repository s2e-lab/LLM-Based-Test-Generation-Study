// VowelsCountTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link VowelsCount}.
* It contains ten test cases for the {@link VowelsCount#vowelsCount()} method.
*/
class VowelsCountTest {


    @Test
    void testVowelsCount() {
        assertEquals(0, VowelsCount.vowelsCount(""));
        assertEquals(1, VowelsCount.vowelsCount("a"));
        assertEquals(1, VowelsCount.vowelsCount("e"));
        assertEquals(1, VowelsCount.vowelsCount("i"));
        assertEquals(1, VowelsCount.vowelsCount("o"));
        assertEquals(1, VowelsCount.vowelsCount("u"));
        assertEquals(1, VowelsCount.vowelsCount("A"));
        assertEquals(1, VowelsCount.vowelsCount("E"));
        assertEquals(1, VowelsCount.vowelsCount("I"));
        assertEquals(1, VowelsCount.vowelsCount("O"));
        assertEquals(1, VowelsCount.vowelsCount("U"));
        assertEquals(1, VowelsCount.vowelsCount("y"));
        assertEquals(1, VowelsCount.vowelsCount("Y"));
        assertEquals(2, VowelsCount.vowelsCount("ae"));
        assertEquals(2, VowelsCount.vowelsCount("ei"));
        assertEquals(2, VowelsCount.vowelsCount("io"));
        assertEquals(2, VowelsCount.vowelsCount("ou"));
        assertEquals(2, VowelsCount.vowelsCount("ua"));
        assertEquals(2, VowelsCount.vowelsCount("AE"));
        assertEquals(2, VowelsCount.vowelsCount("EI"));
        assertEquals(2, VowelsCount.vowelsCount("IO"));
        assertEquals(2, VowelsCount.vowelsCount("OU"));
        assertEquals(2, VowelsCount.vowelsCount("UA"));
        assertEquals(2, VowelsCount.vowelsCount("ay"));
        assertEquals(2, VowelsCount.vowelsCount("Ay"));
        assertEquals(2, VowelsCount.vowelsCount("aY"));
        assertEquals(2, VowelsCount.vowelsCount("AY"));
        assertEquals(2, VowelsCount.vowelsCount("ey"));
        assertEquals(2, VowelsCount.vowelsCount("Ey"));
        assertEquals(2, VowelsCount.vowelsCount("eY"));
        assertEquals(2, VowelsCount.vowelsCount("EY"));
        assertEquals(2, VowelsCount.vowelsCount("iy"));
        assertEquals(2, VowelsCount.vowelsCount("Iy"));
        assertEquals(2, VowelsCount.vowelsCount("iY"));
        assertEquals(2, VowelsCount.vowelsCount("IY"));
        assertEquals(2, VowelsCount.vowelsCount("oy"));
        assertEquals(2, VowelsCount.vowelsCount("Oy"));
        assertEquals(2, VowelsCount.vowelsCount("oY"));
        assertEquals(2, VowelsCount.vowelsCount("OY"));
        assertEquals(2, VowelsCount.vowelsCount("uy"));
        assertEquals(2, VowelsCount.vowelsCount("Uy"));
        assertEquals(2, VowelsCount.vowelsCount("uY"));
        assertEquals(2, VowelsCount.vowelsCount("UY"));
        assertEquals(3, VowelsCount.vowelsCount("aei"));
        assertEquals(3, VowelsCount.vowelsCount("eio"));
        assertEquals(3, VowelsCount.vowelsCount("iou"));
        assertEquals(3, VowelsCount.vowelsCount("oua"));
        assertEquals(3,