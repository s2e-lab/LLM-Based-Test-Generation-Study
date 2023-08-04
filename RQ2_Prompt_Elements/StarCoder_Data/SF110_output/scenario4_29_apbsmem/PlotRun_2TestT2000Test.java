// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_2Test {

    /**
    * Test method for {@link PlotRun#remove(int)}.
    */
    @Test
    void testRemove() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 2));
        run.add(new PlotDatum(2, 3));
        run.add(new PlotDatum(3, 4));
        run.add(new PlotDatum(4, 5));
        run.add(new PlotDatum(5, 6));
        run.add(new PlotDatum(6, 7));
        run.add(new PlotDatum(7, 8));
        run.add(new PlotDatum(8, 9));
        run.add(new PlotDatum(9, 10));
        run.add(new PlotDatum(10, 11));
        run.add(new PlotDatum(11, 12));
        run.add(new PlotDatum(12, 13));
        run.add(new PlotDatum(13, 14));
        run.add(new PlotDatum(14, 15));
        run.add(new PlotDatum(15, 16));
        run.add(new PlotDatum(16, 17));
        run.add(new PlotDatum(17, 18));
        run.add(new PlotDatum(18, 19));
        run.add(new PlotDatum(19, 20));
        run.add(new PlotDatum(20, 21));
        run.add(new PlotDatum(21, 22));
        run.add(new PlotDatum(22, 23));
        run.add(new PlotDatum(23, 24));
        run.add(new PlotDatum(24, 25));
        run.add(new PlotDatum(25, 26));
        run.add(new PlotDatum(26, 27));
        run.add(new PlotDatum(27, 28));
        run.add(new PlotDatum(28, 29));
        run.add(new PlotDatum(29, 30));
        run.add(new PlotDatum(30, 31));
        run.add(new PlotDatum(31, 32));
        run.add(new PlotDatum(32, 33));
        run.add(new PlotDatum(33, 34));
        run.add(new PlotDatum(34, 35));
        run.add(new PlotDatum(35, 36));
        run.add(new PlotDatum(36, 37));
        run.add(new PlotDatum(37, 38));
        run.add(new PlotDatum(38, 39));
        run.add(new PlotDatum(39, 40));
        run.add(new PlotDatum(40, 41));
        run.add(new PlotDatum(41, 42));
        run.add(new PlotDatum(42, 43));
        run.add(new PlotDatum(43, 44));
        run.add(new PlotDatum(44, 45));
        run.add(new PlotDatum(45, 46));
        run.add(new PlotDatum(46, 47));
        run.add(new PlotDatum(47, 48));
        run.add(new PlotDatum(48, 49));
        run.add(new PlotDatum(49, 50));
        run.add(new PlotDatum(50, 51));
        run.add(new PlotDatum(51, 52));
        run.add(new PlotDatum(52, 53));
        run.add(new PlotDatum(53, 54));
        run.add(new PlotDatum(54, 55));
        run.add(new PlotDatum(55, 56));
        run.add(new PlotDatum(56, 57));
        run.add(new PlotDatum(57, 58));
        run.add(new PlotDatum(58, 59));
        run.add(new PlotDatum(59, 60));
        run.add(new PlotDatum(60, 61));
        run.add(new PlotDatum(61, 62));
        run.add(new PlotDatum(62, 63));
        run.add(new PlotDatum(63, 64));
        run.add(new PlotDatum(64, 65));
        run.add(new PlotDatum(65, 66));
        run.add(new PlotDatum(66, 67));
        run.add(new PlotDatum(67, 68));
        run.add(new PlotDatum(68, 69));
        run.add(new PlotDatum(69, 70));
        run.add(new PlotDatum(70, 71));
        run.add(new PlotDatum(71, 72));
        run.add(new PlotDatum(72, 73));
        run.add(new PlotDatum(73, 74));
        run.add(new PlotDatum(74, 75));
        run.add(new PlotDatum(75, 76));
        run.add(new PlotDatum(76, 77));
        run.add(new PlotDatum(77, 78));
        run.add(new PlotDatum(78, 79));
        run.add(new PlotDatum(79, 80));
        run.add(new PlotDatum(80, 81));
        run.add(new PlotDatum(81, 82));
        run.add(new PlotDatum(82, 83));
        run.add(new PlotDatum(83, 84));
        run.add(new PlotDatum(84, 85));
        run.add(new PlotDatum(85, 86));
        run.add(new PlotDatum(86, 87));
        run.add(new PlotDatum(87, 88));
        run.add(new PlotDatum(88, 89));
        run.add(new PlotDatum(89, 90));
        run.add(new PlotDatum(90, 91));
        run.add(new PlotDatum(91, 92));
        run.add(new PlotDatum(92, 93));
        run.add(new PlotDatum(93, 94));
        run.add(new PlotDatum(94, 95));
        run.add(new PlotDatum(95, 96));
        run.add(new PlotDatum(96, 97));
        run.add(new PlotDatum(97, 98));
        run.add(new PlotDatum(98, 99));
        run.add(new PlotDatum(99, 100));
        run.add(new PlotDatum(100, 101));
        run.add(new PlotDatum(101, 102));
        run.add(new PlotDatum(102, 103));
        run.add(new PlotDatum(103, 104));
        run.add(new PlotDatum(104, 105));
        run.add(new PlotDatum(105, 106));
        run.add(new PlotDatum(106, 107));
        run.add(new PlotDatum(107, 108));
        run.add(new PlotDatum(108, 109));
        run.add(new PlotDatum(109, 110));
        run.add(new PlotDatum(110, 111));
        run.add(new PlotDatum(111, 112));
        run.add(new PlotDatum(112, 113));
        run.add(new PlotDatum(113, 114));
        run.add(new PlotDatum(114, 115));
        run.add(new PlotDatum(115, 116));
        run.add(new PlotDatum(116, 117));
        run.add(new PlotDatum(117, 118));
        run.add(new PlotDatum(118, 119));
        run.add(new PlotDatum(119, 120));
        run.add(new PlotDatum(120, 121));
        run.add(new PlotDatum(121, 122));