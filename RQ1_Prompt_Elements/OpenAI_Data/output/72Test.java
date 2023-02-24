// WillItFlyTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link WillItFly}.
 * It contains ten test cases for the {@link scenario1.WillItFly#willItFly()} method.
 */
class WillItFlyTest {
		


    @Test
    void testWillItFly() {
        List<Integer> q = new ArrayList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(true, WillItFly.willItFly(q, 10));
    }

    @Test
    void testWillItFly2() {
        List<Integer> q = new ArrayList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, 9));
    }

    @Test
    void testWillItFly3() {
        List<Integer> q = new ArrayList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, 11));
    }

    @Test
    void testWillItFly4() {
        List<Integer> q = new ArrayList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, 7));
    }

    @Test
    void testWillItFly5() {
        List<Integer> q = new ArrayList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, 8));
    }

    @Test
    void testWillItFly6() {
        List<Integer> q = new ArrayList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, 6));
    }

    @Test
    void testWillItFly7() {
        List<Integer> q = new ArrayList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, 5));
    }

    @Test
    void testWillItFly8() {
        List<Integer> q = new ArrayList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, 4));
    }

    @Test
    void testWillItFly9() {
        List<Integer> q = new ArrayList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, 3));
    }

    @Test
    void testWillItFly10() {
        List<Integer> q = new ArrayList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3