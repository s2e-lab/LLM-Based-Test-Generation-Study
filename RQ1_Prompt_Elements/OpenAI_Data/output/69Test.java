// SearchTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Search}.
* It contains ten test cases for the {@link Search#search()} method.
*/
class SearchTest {


    @Test
    void testSearch() {
        List<Integer> lst = new ArrayList<Integer>();
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
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch1() {
        List<Integer> lst = new ArrayList<Integer>();
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
        lst.add(10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch2() {
        List<Integer> lst = new ArrayList<Integer>();
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
        lst.add(10);
        lst.add(10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch3() {
        List<Integer> lst = new ArrayList<Integer>();
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
        lst.add(10);
        lst.add(10);
        lst.add(10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch4() {
        List<Integer> lst = new ArrayList<Integer>();
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
        lst.add(10);
        lst.add(10);
        lst.add(10);
        lst.add(10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch5() {
        List<Integer> lst = new ArrayList<Integer>();
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
        lst.add(10);
        lst.add(10);
        lst.add(10);
        lst.add(10);
        lst.add(10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch6() {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);