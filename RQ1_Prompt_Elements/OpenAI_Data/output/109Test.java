// MoveOneBallTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link MoveOneBall}.
 * It contains ten test cases for the {@link scenario1.MoveOneBall#moveOneBall()} method.
 */
class MoveOneBallTest {
		


    @Test
    void testMoveOneBall() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        assertEquals(true, MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testMoveOneBall1() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        assertEquals(true, MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testMoveOneBall2() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        assertEquals(true, MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testMoveOneBall3() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        assertEquals(true, MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testMoveOneBall4() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        assertEquals(true, MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testMoveOneBall5() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        assertEquals(true, MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testMoveOneBall6() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        assertEquals(true, MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testMoveOneBall7() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        assertEquals(true, MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testMoveOneBall8() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr