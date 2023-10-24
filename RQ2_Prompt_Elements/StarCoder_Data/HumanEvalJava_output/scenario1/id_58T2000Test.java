// CommonTest.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {

    @Test
    void testCommon1() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    @Test
    void testCommon2() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l2.add(18);
        l2.add(19);
        l2.add(20);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    @Test
    void testCommon3() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l2.add(18);
        l2.add(19);
        l2.add(20);
        l2.add(21);
        l2.add(22);
        l2.add(23);
        l2.add(24);
        l2.add(25);
        l2.add(26);
        l2.add(27);
        l2.add(28);
        l2.add(29);
        l2.add(30);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    @Test
    void testCommon4() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l2.add(18);
        l2.add(19);
        l2.add(20);
        l2.add(21);
        l2.add(22);
        l2.add(23);
        l2.add(24);
        l2.add(25);
        l2.add(26);
        l2.add(27);
        l2.add(28);
        l2.add(29);
        l2.add(30);
        l2.add(31);
        l2.add(32);
        l2.add(33);
        l2.add(34);
        l2.add(35);
        l2.add(36);
        l2.add(37);
        l2.add(38);
        l2.add(39);
        l2.add(40);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    @Test
    void testCommon5() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l2.add(18);
        l2.add(19);
        l2.add(20);
        l2.add(21);
        l2.add(22);
        l2.add(23);
        l2.add(24);
        l2.add(25);
        l2.add(26);
        l2.add(27);
        l2.add(28);
        l2.add(29);
        l2.add(30);
        l2.add(31);
        l2.add(32);
        l2.add(33);
        l2.add(34);
        l2.add(35);
        l2.add(36);
        l2.add(37);
        l2.add(38);
        l2.add(39);
        l2.add(40);
        l2.add(41);
        l2.add(42);
        l2.add(43);
        l2.add(44);
        l2.add(45);
        l2.add(46);
        l2.add(47);
        l2.add(48);
        l2.add(49);
        l2.add(50);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    @Test
    void testCommon6() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(