package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class OrderByPointsTest {
    @Test
    public void testOrderByPoints() {
        List<Object> nums = new ArrayList<Object>();
        nums.add(1);
        nums.add(11);
        nums.add(-1);
        nums.add(-11);
        nums.add(-12);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-1);
        expected.add(-11);
        expected.add(1);
        expected.add(-12);
        expected.add(11);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
    @Test
    public void testOrderByPoints2() {
        List<Object> nums = new ArrayList<Object>();
        nums.add(1234);
        nums.add(423);
        nums.add(463);
        nums.add(145);
        nums.add(2);
        nums.add(423);
        nums.add(423);
        nums.add(53);
        nums.add(6);
        nums.add(37);
        nums.add(3457);
        nums.add(3);
        nums.add(56);
        nums.add(0);
        nums.add(46);
        List<Object> expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(2);
        expected.add(3);
        expected.add(6);
        expected.add(53);
        expected.add(423);
        expected.add(423);
        expected.add(423);
        expected.add(1234);
        expected.add(145);
        expected.add(37);
        expected.add(46);
        expected.add(56);
        expected.add(463);
        expected.add(3457);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
    @Test
    public void testOrderByPoints3() {
        List<Object> nums = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
    @Test
    public void testOrderByPoints4() {
        List<Object> nums = new ArrayList<Object>();
        nums.add(1);
        nums.add(-11);
        nums.add(-32);
        nums.add(43);
        nums.add(54);
        nums.add(-98);
        nums.add(2);
        nums.add(-3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-3);
        expected.add(-32);
        expected.add(-98);
        expected.add(-11);
        expected.add(1);
        expected.add(2);
        expected.add(43);
        expected.add(54);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
    @Test
    public void testOrderByPoints5() {
        List<Object> nums = new ArrayList<Object>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(10);
        expected.add(2);
        expected.add(11);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
    @Test
    public void testOrderByPoints6() {
        List<Object> nums = new ArrayList<Object>();
        nums.add(0);
        nums.add(6);
        nums.add(6);
        nums.add(-76);
        nums.add(-21);
        nums.add(23);
        nums.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-76);
        expected.add(-21);
        expected.add(0);
        expected.add(4);
        expected.add(23);
        expected.add(6);
        expected.add(6);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
    @Test
    public void testOrderByPoints7() {
        List<Object> nums = new ArrayList<Object>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(10);
        expected.add(2);
        expected.add(11);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
    @Test
    public void testOrderByPoints8() {
        List<Object> nums = new ArrayList<Object>();
        nums.add(0);
        nums.add(6);
        nums.add(6);
        nums.add(-76);
        nums.add(-21);
        nums.add(23);
        nums.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-76);
        expected.add(-21);
        expected.add(0);
        expected.add(4);
        expected.add(23);
        expected.add(6);
        expected.add(6);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
    @Test
    public void testOrderByPoints9() {
        List<Object> nums = new ArrayList<Object>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(10);
        expected.add(2);
        expected.add(11);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
    @Test
    public void testOrderByPoints10() {
        List<Object> nums = new ArrayList<Object>();
        nums.add(0);
        nums.add(6);
        nums.add(6);
        nums.add(-76);
        nums.add(-21);
        nums.add(23);
        nums.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-76);
        expected.add(-21);
        expected.add(0);
        expected.add(4);
        expected.add(23);
        expected.add(6);
        expected.add(6);
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
}