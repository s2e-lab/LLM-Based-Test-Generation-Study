package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SortArrayTest {
    @Test
    public void test1() {
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(5);
        assertEquals(expected, SortArray.sortArray(list));
    }

    @Test
    public void test2() {
        List<Object> list = new ArrayList<Object>();
        list.add(-2);
        list.add(-3);
        list.add(-4);
        list.add(-5);
        list.add(-6);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-4);
        expected.add(-2);
        expected.add(-6);
        expected.add(-5);
        expected.add(-3);
        assertEquals(expected, SortArray.sortArray(list));
    }

    @Test
    public void test3() {
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        assertEquals(expected, SortArray.sortArray(list));
    }

    @Test
    public void test4() {
        List<Object> list = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, SortArray.sortArray(list));
    }

    @Test
    public void test5() {
        List<Object> list = new ArrayList<Object>();
        list.add(2);
        list.add(5);
        list.add(77);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(2);
        expected.add(4);
        expected.add(4);
        expected.add(3);
        expected.add(3);
        expected.add(5);
        expected.add(5);
        expected.add(5);
        expected.add(7);
        expected.add(77);
        assertEquals(expected, SortArray.sortArray(list));
    }

    @Test
    public void test6() {
        List<Object> list = new ArrayList<Object>();
        list.add(3);
        list.add(6);
        list.add(44);
        list.add(12);
        list.add(32);
        list.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(32);
        expected.add(3);
        expected.add(5);
        expected.add(6);
        expected.add(12);
        expected.add(44);
        assertEquals(expected, SortArray.sortArray(list));
    }

    @Test
    public void test7() {
        List<Object> list = new ArrayList<Object>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(16);
        list.add(32);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(4);
        expected.add(8);
        expected.add(16);
        expected.add(32);
        assertEquals(expected, SortArray.sortArray(list));
    }

    @Test
    public void test8() {
        List<Object> list = new ArrayList<Object>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(16);
        list.add(32);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(4);
        expected.add(8);
        expected.add(16);
        expected.add(32);
        assertEquals(expected, SortArray.sortArray(list));
    }

    @Test
    public void test9() {
        List<Object> list = new ArrayList<Object>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(16);
        list.add(32);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(4);
        expected.add(8);
        expected.add(16);
        expected.add(32);
        assertEquals(expected, SortArray.sortArray(list));
    }

    @Test
    public void test10() {
        List<Object> list = new ArrayList<Object>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(16);
        list.add(32);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(4);
        expected.add(8);
        expected.add(16);
        expected.add(32);
        assertEquals(expected, SortArray.sortArray(list));
    }
}