package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class LargestSmallestIntegersTest {
    @Test
    void test1() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(4);
        lst.add(1);
        lst.add(3);
        lst.add(5);
        lst.add(7);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void test2() {
        List<Object> lst = new ArrayList<Object>();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void test3() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(0);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void test4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(4);
        lst.add(1);
        lst.add(3);
        lst.add(5);
        lst.add(7);
        lst.add(0);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void test5() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(3);
        lst.add(2);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(-2);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-2);
        expected.add(1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void test6() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(4);
        lst.add(5);
        lst.add(3);
        lst.add(6);
        lst.add(2);
        lst.add(7);
        lst.add(-7);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-7);
        expected.add(2);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void test7() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(7);
        lst.add(3);
        lst.add(8);
        lst.add(4);
        lst.add(9);
        lst.add(2);
        lst.add(5);
        lst.add(-9);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-9);
        expected.add(2);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void test8() {
        List<Object> lst = new ArrayList<Object>();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void test9() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(0);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void test10() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-1);
        lst.add(-3);
        lst.add(-5);
        lst.add(-6);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-1);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }
}