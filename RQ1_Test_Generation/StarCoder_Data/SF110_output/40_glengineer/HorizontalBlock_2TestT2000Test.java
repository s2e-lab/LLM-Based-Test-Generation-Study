// HorizontalBlock_2Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_2Test {

    @Test
    void testExtractSequentialSubblocks_1() {
        Scheme scheme = new Scheme();
        scheme.add(new CharPosition1(0, 0), "1");
        scheme.add(new CharPosition1(1, 0), "2");
        scheme.add(new CharPosition1(2, 0), "3");
        scheme.add(new CharPosition1(3, 0), "4");
        scheme.add(new CharPosition1(4, 0), "5");
        scheme.add(new CharPosition1(5, 0), "6");
        scheme.add(new CharPosition1(6, 0), "7");
        scheme.add(new CharPosition1(7, 0), "8");
        scheme.add(new CharPosition1(8, 0), "9");
        scheme.add(new CharPosition1(9, 0), "10");
        scheme.add(new CharPosition1(10, 0), "11");
        scheme.add(new CharPosition1(11, 0), "12");
        scheme.add(new CharPosition1(12, 0), "13");
        scheme.add(new CharPosition1(13, 0), "14");
        scheme.add(new CharPosition1(14, 0), "15");
        scheme.add(new CharPosition1(15, 0), "16");
        scheme.add(new CharPosition1(16, 0), "17");
        scheme.add(new CharPosition1(17, 0), "18");
        scheme.add(new CharPosition1(18, 0), "19");
        scheme.add(new CharPosition1(19, 0), "20");
        scheme.add(new CharPosition1(20, 0), "21");
        scheme.add(new CharPosition1(21, 0), "22");
        scheme.add(new CharPosition1(22, 0), "23");
        scheme.add(new CharPosition1(23, 0), "24");
        scheme.add(new CharPosition1(24, 0), "25");
        scheme.add(new CharPosition1(25, 0), "26");
        scheme.add(new CharPosition1(26, 0), "27");
        scheme.add(new CharPosition1(27, 0), "28");
        scheme.add(new CharPosition1(28, 0), "29");
        scheme.add(new CharPosition1(29, 0), "30");
        scheme.add(new CharPosition1(30, 0), "31");
        scheme.add(new CharPosition1(31, 0), "32");
        scheme.add(new CharPosition1(32, 0), "33");
        scheme.add(new CharPosition1(33, 0), "34");
        scheme.add(new CharPosition1(34, 0), "35");
        scheme.add(new CharPosition1(35, 0), "36");
        scheme.add(new CharPosition1(36, 0), "37");
        scheme.add(new CharPosition1(37, 0), "38");
        scheme.add(new CharPosition1(38, 0), "39");
        scheme.add(new CharPosition1(39, 0), "40");
        scheme.add(new CharPosition1(40, 0), "41");
        scheme.add(new CharPosition1(41, 0), "42");
        scheme.add(new CharPosition1(42, 0), "43");
        scheme.add(new CharPosition1(43, 0), "44");
        scheme.add(new CharPosition1(44, 0), "45");
        scheme.add(new CharPosition1(45, 0), "46");
        scheme.add(new CharPosition1(46, 0), "47");
        scheme.add(new CharPosition1(47, 0), "48");
        scheme.add(new CharPosition1(48, 0), "49");
        scheme.add(new CharPosition1(49, 0), "50");
        scheme.add(new CharPosition1(50, 0), "51");
        scheme.add(new CharPosition1(51, 0), "52");
        scheme.add(new CharPosition1(52, 0), "53");
        scheme.add(new CharPosition1(53, 0), "54");
        scheme.add(new CharPosition1(54, 0), "55");
        scheme.add(new CharPosition1(55, 0), "56");
        scheme.add(new CharPosition1(56, 0), "57");
        scheme.add(new CharPosition1(57, 0), "58");
        scheme.add(new CharPosition1(58, 0), "59");
        scheme.add(new CharPosition1(59, 0), "60");
        scheme.add(new CharPosition1(60, 0), "61");
        scheme.add(new CharPosition1(61, 0), "62");
        scheme.add(new CharPosition1(62, 0), "63");
        scheme.add(new CharPosition1(63, 0), "64");
        scheme.add(new CharPosition1(64, 0), "65");
        scheme.add(new CharPosition1(65, 0), "66");
        scheme.add(new CharPosition1(66, 0), "67");
        scheme.add(new CharPosition1(67, 0), "68");
        scheme.add(new CharPosition1(68, 0), "69");
        scheme.add(new CharPosition1(69, 0), "70");
        scheme.add(new CharPosition1(70, 0), "71");
        scheme.add(new CharPosition1(71, 0), "72");
        scheme.add(new CharPosition1(72, 0), "73");
        scheme.add(new CharPosition1(73, 0), "74");
        scheme.add(new CharPosition1(74, 0), "75");
        scheme.add(new CharPosition1(75, 0), "76");
        scheme.add(new CharPosition1(76, 0), "77");
        scheme.add(new CharPosition1(77, 0), "78");
        scheme.add(new CharPosition1(78, 0), "79");
        scheme.add(new CharPosition1(79, 0), "80");
        scheme.add(new CharPosition1(80, 0), "81");
        scheme.add(new CharPosition1(81, 0), "82");
        scheme.add(new CharPosition1(82, 0), "83");
        scheme.add(new CharPosition1(83, 0), "84");
        scheme.add(new CharPosition1(84, 0), "85");
        scheme.add(new CharPosition1(85, 0), "86");
        scheme.add(new CharPosition1(86, 0), "87");
        scheme.add(new CharPosition1(87, 0), "88");
        scheme.add(new CharPosition1(88, 0), "89");
        scheme.add(new CharPosition1(89, 0), "90");
        scheme.add(new CharPosition1(90, 0), "91");
        scheme.add(new CharPosition1(91, 0), "92");
        scheme.add(new CharPosition1(92, 0), "93");
        scheme.add(new CharPosition1(93, 0), "94");
        scheme.add(new CharPosition1(94, 0), "95");
        scheme.add(new CharPosition1(95, 0), "96");
        scheme.add(new CharPosition1(96, 0), "97");
        scheme.add(new CharPosition1(97, 0), "98");
        scheme.add(new CharPosition1(98, 0), "99");
        scheme.add(new CharPosition1(99, 0), "1