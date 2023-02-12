package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class IsSortedTest {
    @Test
    public void test1() {
        List<Object> lst = new ArrayList<>();
        lst.add(5);
        assertEquals(true, IsSorted.isSorted(lst));
    }

    @Test
    public void test2() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        assertEquals(true, IsSorted.isSorted(lst));
    }

    @Test
    public void test3() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(3);
        lst.add(2);
        lst.add(4);
        lst.add(5);
        assertEquals(false, IsSorted.isSorted(lst));
    }

    @Test
    public void test4() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        assertEquals(true, IsSorted.isSorted(lst));
    }

    @Test
    public void test5() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        assertEquals(true, IsSorted.isSorted(lst));
    }

    @Test
    public void test6() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(3);
        lst.add(2);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        assertEquals(false, IsSorted.isSorted(lst));
    }

    @Test
    public void test7() {
        List<Object> lst = new ArrayList<>();
        assertEquals(true, IsSorted.isSorted(lst));
    }

    @Test
    public void test8() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        assertEquals(true, IsSorted.isSorted(lst));
    }

    @Test
    public void test9() {
        List<Object> lst = new ArrayList<>();
        lst.add(3);
        lst.add(2);
        lst.add(1);
        assertEquals(false, IsSorted.isSorted(lst));
    }

    @Test
    public void test10() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(2);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        assertEquals(false, IsSorted.isSorted(lst));
    }
}