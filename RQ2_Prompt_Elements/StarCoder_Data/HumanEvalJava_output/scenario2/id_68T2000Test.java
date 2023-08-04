// PluckTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {

    /**
     * Test case for {@link Pluck#pluck(List)} where the given array is empty.
     */
    @Test
    void testPluckEmpty() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> result = Pluck.pluck(arr);
        assertEquals(new ArrayList<Object>(), result);
    }

    /**
     * Test case for {@link Pluck#pluck(List)} where the given array contains only odd values.
     */
    @Test
    void testPluckOdd() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(new ArrayList<Object>(), result);
    }

    /**
     * Test case for {@link Pluck#pluck(List)} where the given array contains only even values.
     */
    @Test
    void testPluckEven() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(new ArrayList<Object>(), result);
    }

    /**
     * Test case for {@link Pluck#pluck(List)} where the given array contains only even values.
     */
    @Test
    void testPluckEven2() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.add(12);
        arr.add(14);
        arr.add(16);
        arr.add(18);
        arr.add(20);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(new ArrayList<Object>(), result);
    }

    /**
     * Test case for {@link Pluck#pluck(List)} where the given array contains only even values.
     */
    @Test
    void testPluckEven3() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.add(12);
        arr.add(14);
        arr.add(16);
        arr.add(18);
        arr.add(20);
        arr.add(22);
        arr.add(24);
        arr.add(26);
        arr.add(28);
        arr.add(30);
        arr.add(32);
        arr.add(34);
        arr.add(36);
        arr.add(38);
        arr.add(40);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(new ArrayList<Object>(), result);
    }

    /**
     * Test case for {@link Pluck#pluck(List)} where the given array contains only even values.
     */
    @Test
    void testPluckEven4() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.add(12);
        arr.add(14);
        arr.add(16);
        arr.add(18);
        arr.add(20);
        arr.add(22);
        arr.add(24);
        arr.add(26);
        arr.add(28);
        arr.add(30);
        arr.add(32);
        arr.add(34);
        arr.add(36);
        arr.add(38);
        arr.add(40);
        arr.add(42);
        arr.add(44);
        arr.add(46);
        arr.add(48);
        arr.add(50);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(new ArrayList<Object>(), result);
    }

    /**
     * Test case for {@link Pluck#pluck(List)} where the given array contains only even values.
     */
    @Test
    void testPluckEven5() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.add(12);
        arr.add(14);
        arr.add(16);
        arr.add(18);
        arr.add(20);
        arr.add(22);
        arr.add(24);
        arr.add(26);
        arr.add(28);
        arr.add(30);
        arr.add(32);
        arr.add(34);
        arr.add(36);
        arr.add(38);
        arr.add(40);
        arr.add(42);
        arr.add(44);
        arr.add(46);
        arr.add(48);
        arr.add(50);
        arr.add(52);
        arr.add(54);
        arr.add(56);
        arr.add(58);
        arr.add(60);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(new ArrayList<Object>(), result);
    }

    /**
     * Test case for {@link Pluck#pluck(List)} where the given array contains only even values.
     */
    @Test
    void testPluckEven6() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.add(12);
        arr.add(14);
        arr.add(16);
        arr.add(18);
        arr.add(20);
        arr.add(22);
        arr.add(24);
        arr.add(26);
        arr.add(28);
        arr.add(30);
        arr.add(32);
        arr.add(34);
        arr.add(36);
        arr.add(38);
        arr.add(40);
        arr.add(42);
        arr.add(44);
        arr.add(46);
        arr.add(48);
        arr.add(50);
        arr.add(52);
        arr.add(54);
        arr.add(56);
        arr.add(58);
        arr.add(60);
        arr.add(62);
        arr.add(64);
        arr.add(66);
        arr.add(68);
        arr.add(70);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(new ArrayList<Object>(), result);
    }

    /**
     * Test case for {@link Pluck#pluck(List)} where the given array contains only even values.
     */
    @Test
    void testPluckEven7() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.add(12);
        arr.add(14);
        arr.add(16);
        arr.add(18);
        arr.add(20);
        arr.add(22);
        arr.add(24);
        arr.add(26);
        arr.add(28);
        arr.add(30);
        arr.add(32);
        arr.add(34);
        arr.add(36);
        arr.add(38);
        arr.add(40);
        arr.add(42);
        arr.add(44);
        arr.add(46);
        arr.add(48);
        arr.add(50);
        arr.add(52);
        arr.add(54);
        arr.add(56);
        arr.add(58);
        arr.add(60);
        arr.add(62);
        arr.add(64);
        arr.add(66);
        arr.add(68);
        arr.add(70);
        arr.add(72);
        arr.add(74);
        arr.add(76);
        arr.add(78);
        arr.add(80);
        List<Object> result = Pluck.pluck