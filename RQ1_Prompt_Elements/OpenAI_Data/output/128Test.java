// ProdSignsTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link ProdSigns}.
 * It contains ten test cases for the {@link scenario1.ProdSigns#prodSigns()} method.
 */
class ProdSignsTest {
		


    @Test
    void testProdSigns() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        assertEquals(Integer.valueOf(1), ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns2() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(-5);
        assertEquals(Integer.valueOf(-1), ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns3() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns4() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(0);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns5() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns6() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns7() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns8() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns9() {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        assertEquals(Integer.valueOf(