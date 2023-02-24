// SkjkasdkdTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Skjkasdkd}.
* It contains ten test cases for the {@link Skjkasdkd#skjkasdkd()} method.
*/
class SkjkasdkdTest {

    @Test
    void test1() {
        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(3);
        lst.add(5);
        lst.add(7);
        lst.add(11);
        lst.add(13);
        lst.add(17);
        lst.add(19);
        lst.add(23);
        lst.add(29);
        assertEquals(Skjkasdkd.skjkasdkd(lst), 10);
    }
    @Test
    void test2() {
        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(3);
        lst.add(5);
        lst.add(7);
        lst.add(11);
        lst.add(13);
        lst.add(17);
        lst.add(19);
        lst.add(23);
        lst.add(29);
        lst.add(31);
        lst.add(37);
        lst.add(41);
        lst.add(43);
        lst.add(47);
        lst.add(53);
        lst.add(59);
        lst.add(61);
        lst.add(67);
        lst.add(71);
        lst.add(73);
        lst.add(79);
        lst.add(83);
        lst.add(89);
        lst.add(97);
        assertEquals(Skjkasdkd.skjkasdkd(lst), 10);
    }
    @Test
    void test3() {
        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(3);
        lst.add(5);
        lst.add(7);
        lst.add(11);
        lst.add(13);
        lst.add(17);
        lst.add(19);
        lst.add(23);
        lst.add(29);
        lst.add(31);
        lst.add(37);
        lst.add(41);
        lst.add(43);
        lst.add(47);
        lst.add(53);
        lst.add(59);
        lst.add(61);
        lst.add(67);
        lst.add(71);
        lst.add(73);
        lst.add(79);
        lst.add(83);
        lst.add(89);
        lst.add(97);
        lst.add(101);
        lst.add(103);
        lst.add(107);
        lst.add(109);
        lst.add(113);
        lst.add(127);
        lst.add(131);
        lst.add(137);
        lst.add(139);
        lst.add(149);
        lst.add(151);
        lst.add(157);
        lst.add(163);
        lst.add(167);
        lst.add(173);
        lst.add(179);
        lst.add(181);
        lst.add(191);
        lst.add(193);
        lst.add(197);
        lst.add(199);
        assertEquals(Skjkasdkd.skjkasdkd(lst), 10);
    }
    @Test
    void test4() {
        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(3);
        lst.add(5);
        lst.add(7);
        lst.add(11);
        lst.add(13);
        lst.add(17);
        lst.add(19);
        lst.add(23);
        lst.add(29);
        lst.add(31);
        lst.add(37);
        lst