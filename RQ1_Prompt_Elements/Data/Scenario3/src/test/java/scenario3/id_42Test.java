package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IncrListTest {
    @Test
    void testIncrList() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Object> result = IncrList.incrList(l);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertEquals(expected, result);
    }

    @Test
    void testIncrList2() {
        List<Object> l = new ArrayList<Object>();
        l.add(5);
        l.add(3);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(123);
        List<Object> result = IncrList.incrList(l);
        List<Object> expected = new ArrayList<Object>();
        expected.add(6);
        expected.add(4);
        expected.add(6);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(10);
        expected.add(1);
        expected.add(124);
        assertEquals(expected, result);
    }

    @Test
    void testIncrList3() {
        List<Object> l = new ArrayList<Object>();
        List<Object> result = IncrList.incrList(l);
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, result);
    }

    @Test
    void testIncrList4() {
        List<Object> l = new ArrayList<Object>();
        l.add(3);
        l.add(2);
        l.add(1);
        List<Object> result = IncrList.incrList(l);
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(3);
        expected.add(2);
        assertEquals(expected, result);
    }

    @Test
    void testIncrList5() {
        List<Object> l = new ArrayList<Object>();
        l.add(5);
        l.add(2);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(123);
        List<Object> result = IncrList.incrList(l);
        List<Object> expected = new ArrayList<Object>();
        expected.add(6);
        expected.add(3);
        expected.add(6);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(10);
        expected.add(1);
        expected.add(124);
        assertEquals(expected, result);
    }

    @Test
    void testIncrList6() {
        List<Object> l = new ArrayList<Object>();
        l.add(5);
        l.add(2);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(123);
        List<Object> result = IncrList.incrList(l);
        List<Object> expected = new ArrayList<Object>();
        expected.add(6);
        expected.add(3);
        expected.add(6);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(10);
        expected.add(1);
        expected.add(124);
        assertEquals(expected, result);
    }

    @Test
    void testIncrList7() {
        List<Object> l = new ArrayList<Object>();
        l.add(5);
        l.add(2);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(123);
        List<Object> result = IncrList.incrList(l);
        List<Object> expected = new ArrayList<Object>();
        expected.add(6);
        expected.add(3);
        expected.add(6);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(10);
        expected.add(1);
        expected.add(124);
        assertEquals(expected, result);
    }

    @Test
    void testIncrList8() {
        List<Object> l = new ArrayList<Object>();
        l.add(5);
        l.add(2);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(123);
        List<Object> result = IncrList.incrList(l);
        List<Object> expected = new ArrayList<Object>();
        expected.add(6);
        expected.add(3);
        expected.add(6);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(10);
        expected.add(1);
        expected.add(124);
        assertEquals(expected, result);
    }

    @Test
    void testIncrList9() {
        List<Object> l = new ArrayList<Object>();
        l.add(5);
        l.add(2);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(123);
        List<Object> result = IncrList.incrList(l);
        List<Object> expected = new ArrayList<Object>();
        expected.add(6);
        expected.add(3);
        expected.add(6);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(10);
        expected.add(1);
        expected.add(124);
        assertEquals(expected, result);
    }

    @Test
    void testIncrList10() {
        List<Object> l = new ArrayList<Object>();
        l.add(5);
        l.add(2);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(123);
        List<Object> result = IncrList.incrList(l);
        List<Object> expected = new ArrayList<Object>();
        expected.add(6);
        expected.add(3);
        expected.add(6);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(10);
        expected.add(1);
        expected.add(124);
        assertEquals(expected, result);
    }
}