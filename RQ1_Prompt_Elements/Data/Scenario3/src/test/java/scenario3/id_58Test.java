package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CommonTest {
    @Test
    void testCommon() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(4);
        l1.add(3);
        l1.add(34);
        l1.add(653);
        l1.add(2);
        l1.add(5);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(5);
        l2.add(7);
        l2.add(1);
        l2.add(5);
        l2.add(9);
        l2.add(653);
        l2.add(121);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(5);
        result.add(653);
        assertEquals(result, Common.common(l1, l2));
    }

    @Test
    void testCommon2() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(5);
        l1.add(3);
        l1.add(2);
        l1.add(8);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add(2);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(3);
        assertEquals(result, Common.common(l1, l2));
    }

    @Test
    void testCommon3() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(8);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add(2);
        l2.add(4);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(3);
        result.add(4);
        assertEquals(result, Common.common(l1, l2));
    }

    @Test
    void testCommon4() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(8);
        List<Object> l2 = new ArrayList<Object>();
        List<Object> result = new ArrayList<Object>();
        assertEquals(result, Common.common(l1, l2));
    }

    @Test
    void testCommon5() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(4);
        l1.add(3);
        l1.add(34);
        l1.add(653);
        l1.add(2);
        l1.add(5);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(5);
        l2.add(7);
        l2.add(1);
        l2.add(5);
        l2.add(9);
        l2.add(653);
        l2.add(121);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(5);
        result.add(653);
        assertEquals(result, Common.common(l1, l2));
    }

    @Test
    void testCommon6() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(5);
        l1.add(3);
        l1.add(2);
        l1.add(8);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add(2);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(3);
        assertEquals(result, Common.common(l1, l2));
    }

    @Test
    void testCommon7() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(8);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add(2);
        l2.add(4);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(3);
        result.add(4);
        assertEquals(result, Common.common(l1, l2));
    }

    @Test
    void testCommon8() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(8);
        List<Object> l2 = new ArrayList<Object>();
        List<Object> result = new ArrayList<Object>();
        assertEquals(result, Common.common(l1, l2));
    }

    @Test
    void testCommon9() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(4);
        l1.add(3);
        l1.add(34);
        l1.add(653);
        l1.add(2);
        l1.add(5);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(5);
        l2.add(7);
        l2.add(1);
        l2.add(5);
        l2.add(9);
        l2.add(653);
        l2.add(121);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(5);
        result.add(653);
        assertEquals(result, Common.common(l1, l2));
    }

    @Test
    void testCommon10() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(5);
        l1.add(3);
        l1.add(2);
        l1.add(8);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add(2);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(3);
        assertEquals(result, Common.common(l1, l2));
    }
}