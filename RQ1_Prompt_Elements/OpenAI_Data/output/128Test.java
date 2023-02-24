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
* It contains ten test cases for the {@link ProdSigns#prodSigns()} method.
*/
class ProdSignsTest {


    @Test
    void testProdSigns() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        assertEquals(Integer.valueOf(15), ProdSigns.prodSigns(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(-5);
        assertEquals(Integer.valueOf(-15), ProdSigns.prodSigns(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(5);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(5);
        arr.add(6);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
    }
}