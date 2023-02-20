package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class GetPositiveTest {
    @Test
    void testGetPositive() {
        List<Object> l = new ArrayList<Object>();
        l.add(-1);
        l.add(2);
        l.add(-4);
        l.add(5);
        l.add(6);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(5);
        result.add(6);
        assertEquals(result, GetPositive.getPositive(l));
    }

    @Test
    void testGetPositive2() {
        List<Object> l = new ArrayList<Object>();
        l.add(5);
        l.add(3);
        l.add(-5);
        l.add(2);
        l.add(-3);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(123);
        l.add(1);
        l.add(-10);
        List<Object> result = new ArrayList<Object>();
        result.add(5);
        result.add(3);
        result.add(2);
        result.add(3);
        result.add(9);
        result.add(123);
        result.add(1);
        assertEquals(result, GetPositive.getPositive(l));
    }

    @Test
    void testGetPositive3() {
        List<Object> l = new ArrayList<Object>();
        l.add(-1);
        l.add(-2);
        l.add(4);
        l.add(5);
        l.add(6);
        List<Object> result = new ArrayList<Object>();
        result.add(4);
        result.add(5);
        result.add(6);
        assertEquals(result, GetPositive.getPositive(l));
    }

    @Test
    void testGetPositive4() {
        List<Object> l = new ArrayList<Object>();
        l.add(5);
        l.add(3);
        l.add(-5);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(123);
        l.add(1);
        l.add(-10);
        List<Object> result = new ArrayList<Object>();
        result.add(5);
        result.add(3);
        result.add(2);
        result.add(3);
        result.add(3);
        result.add(9);
        result.add(123);
        result.add(1);
        assertEquals(result, GetPositive.getPositive(l));
    }

    @Test
    void testGetPositive5() {
        List<Object> l = new ArrayList<Object>();
        l.add(-1);
        l.add(-2);
        List<Object> result = new ArrayList<Object>();
        assertEquals(result, GetPositive.getPositive(l));
    }

    @Test
    void testGetPositive6() {
        List<Object> l = new ArrayList<Object>();
        List<Object> result = new ArrayList<Object>();
        assertEquals(result, GetPositive.getPositive(l));
    }

    @Test
    void testGetPositive7() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(7);
        result.add(8);
        result.add(9);
        result.add(10);
        assertEquals(result, GetPositive.getPositive(l));
    }

    @Test
    void testGetPositive8() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(17);
        l.add(18);
        l.add(19);
        l.add(20);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(7);
        result.add(8);
        result.add(9);
        result.add(10);
        result.add(11);
        result.add(12);
        result.add(13);
        result.add(14);
        result.add(15);
        result.add(16);
        result.add(17);
        result.add(18);
        result.add(19);
        result.add(20);
        assertEquals(result, GetPositive.getPositive(l));
    }

    @Test
    void testGetPositive9() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(17);
        l.add(18);
        l.add(19);
        l.add(20);
        l.add(21);
        l.add(22);
        l.add(23);
        l.add(24);
        l.add(25);
        l.add(26);
        l.add(27);
        l.add(28);
        l.add(29);
        l.add(30);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(7);
        result.add(8);
        result.add(9);
        result.add(10);
        result.add(11);
        result.add(12);
        result.add(13);
        result.add(14);
        result.add(15);
        result.add(16);
        result.add(17);
        result.add(18);
        result.add(19);
        result.add(20);
        result.add(21);
        result.add(22);
        result.add(23);
        result.add(24);
        result.add(25);
        result.add(26);
        result.add(27);
        result.add(28);
        result.add(29);
        result.add(30);
        assertEquals(result, GetPositive.getPositive(l));
    }

    @Test
    void testGetPositive10() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(17);
        l.add(18);
        l.add(19);
        l.add(20);
        l.add(21);
        l.add(22);
        l.add(23);
        l.add(24);
        l.add(25);
        l.add(26);
        l.add(27);
        l.add(28);
        l.add(29);
        l.add(30);
        l.add(31);
        l.add(32);
        l.add(33);
        l.add(34);
        l.add(35);
        l.add(36);
        l.add(37);
        l.add(38);
        l.add(39);
        l.add(40);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(7);
        result.add(8);
        result.add(9);
        result.add(10);
        result.add(11);
        result.add(12);
        result.add(13);
        result.add(14);
        result.add(15);
        result.add(16);
        result.add(17);
        result.add(18);
        result.add(19);
        result.add(20);
        result.add(21);
        result.add(22);
        result.add(23);
        result.add(24);
        result.add(25);
        result.add(26);
        result.add(27);
        result.add(28);
        result.add(29);
        result.add(30);
        result.add(31);
        result.add(32);
        result.add(33);
        result.add(34);
        result.add(35);
        result.add(36);
        result.add(37);
        result.add(38);
        result.add(39);
        result.add(40);
        assertEquals(result, GetPositive.getPositive(l));
    }
}