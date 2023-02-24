// ExchangeTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Exchange}.
 * It contains ten test cases for the {@link scenario1.Exchange#exchange()} method.
 */
class ExchangeTest {
		


    @Test
    void testExchange() {
        List<Integer> lst1 = new ArrayList<Integer>();
        List<Integer> lst2 = new ArrayList<Integer>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);
        lst2.add(6);
        lst2.add(7);
        lst2.add(8);
        lst2.add(9);
        lst2.add(10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange1() {
        List<Integer> lst1 = new ArrayList<Integer>();
        List<Integer> lst2 = new ArrayList<Integer>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);
        lst2.add(6);
        lst2.add(7);
        lst2.add(8);
        lst2.add(9);
        lst2.add(10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange2() {
        List<Integer> lst1 = new ArrayList<Integer>();
        List<Integer> lst2 = new ArrayList<Integer>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);
        lst2.add(6);
        lst2.add(7);
        lst2.add(8);
        lst2.add(9);
        lst2.add(10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange3() {
        List<Integer> lst1 = new ArrayList<Integer>();
        List<Integer> lst2 = new ArrayList<Integer>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);
        lst2.add(6);
        lst2.add(7);
        lst2.add(8);
        lst2.add(9);
        lst2.add(10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange4() {
        List<Integer> lst1 = new ArrayList<Integer>();
        List<Integer> lst2 = new ArrayList<Integer>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);
        lst2.add(6);
        lst2.add(7);
        lst2.add(8);
        lst2.add(9);
        lst2.add(10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange5() {
        List<Integer> lst1 = new ArrayList<Integer>();
        List<Integer> lst2 = new ArrayList<Integer>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);
        lst2.add(6);
        lst2.add(7);
        lst2.add(8);
        lst2.add(9);
        lst2.add(10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
