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
     *  Test case for the {@link PlotRun#remove(int)} method.
     *  It tests the removal of the first plot data object in a run.
     */
    @Test
    void testRemoveFirst() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        run.add(new PlotDatum(3, 3));
        run.add(new PlotDatum(4, 4));
        run.add(new PlotDatum(5, 5));
        run.add(new PlotDatum(6, 6));
        run.add(new PlotDatum(7, 7));
        run.add(new PlotDatum(8, 8));
        run.add(new PlotDatum(9, 9));
        run.add(new PlotDatum(10, 10));
        run.add(new PlotDatum(11, 11));
        run.add(new PlotDatum(12, 12));
        run.add(new PlotDatum(13, 13));
        run.add(new PlotDatum(14, 14));
        run.add(new PlotDatum(15, 15));
        run.add(new PlotDatum(16, 16));
        run.add(new PlotDatum(17, 17));
        run.add(new PlotDatum(18, 18));
        run.add(new PlotDatum(19, 19));
        run.add(new PlotDatum(20, 20));
        run.add(new PlotDatum(21, 21));
        run.add(new PlotDatum(22, 22));
        run.add(new PlotDatum(23, 23));
        run.add(new PlotDatum(24, 24));
        run.add(new PlotDatum(25, 25));
        run.add(new PlotDatum(26, 26));
        run.add(new PlotDatum(27, 27));
        run.add(new PlotDatum(28, 28));
        run.add(new PlotDatum(29, 29));
        run.add(new PlotDatum(30, 30));
        run.add(new PlotDatum(31, 31));
        run.add(new PlotDatum(32, 32));
        run.add(new PlotDatum(33, 33));
        run.add(new PlotDatum(34, 34));
        run.add(new PlotDatum(35, 35));
        run.add(new PlotDatum(36, 36));
        run.add(new PlotDatum(37, 37));
        run.add(new PlotDatum(38, 38));
        run.add(new PlotDatum(39, 39));
        run.add(new PlotDatum(40, 40));
        run.add(new PlotDatum(41, 41));
        run.add(new PlotDatum(42, 42));
        run.add(new PlotDatum(43, 43));
        run.add(new PlotDatum(44, 44));
        run.add(new PlotDatum(45, 45));
        run.add(new PlotDatum(46, 46));
        run.add(new PlotDatum(47, 47));
        run.add(new PlotDatum(48, 48));
        run.add(new PlotDatum(49, 49));
        run.add(new PlotDatum(50, 50));
        run.add(new PlotDatum(51, 51));
        run.add(new PlotDatum(52, 52));
        run.add(new PlotDatum(53, 53));
        run.add(new PlotDatum(54, 54));
        run.add(new PlotDatum(55, 55));
        run.add(new PlotDatum(56, 56));
        run.add(new PlotDatum(57, 57));
        run.add(new PlotDatum(58, 58));
        run.add(new PlotDatum(59, 59));
        run.add(new PlotDatum(60, 60));
        run.add(new PlotDatum(61, 61));
        run.add(new PlotDatum(62, 62));
        run.add(new PlotDatum(63, 63));
        run.add(new PlotDatum(64, 64));
        run.add(new PlotDatum(65, 65));
        run.add(new PlotDatum(66, 66));
        run.add(new PlotDatum(67, 67));
        run.add(new PlotDatum(68, 68));
        run.add(new PlotDatum(69, 69));
        run.add(new PlotDatum(70, 70));
        run.add(new PlotDatum(71, 71));
        run.add(new PlotDatum(72, 72));
        run.add(new PlotDatum(73, 73));
        run.add(new PlotDatum(74, 74));
        run.add(new PlotDatum(75, 75));
        run.add(new PlotDatum(76, 76));
        run.add(new PlotDatum(77, 77));
        run.add(new PlotDatum(78, 78));
        run.add(new PlotDatum(79, 79));
        run.add(new PlotDatum(80, 80));
        run.add(new PlotDatum(81, 81));
        run.add(new PlotDatum(82, 82));
        run.add(new PlotDatum(83, 83));
        run.add(new PlotDatum(84, 84));
        run.add(new PlotDatum(85, 85));
        run.add(new PlotDatum(86, 86));
        run.add(new PlotDatum(87, 87));
        run.add(new PlotDatum(88, 88));
        run.add(new PlotDatum(89, 89));
        run.add(new PlotDatum(90, 90));
        run.add(new PlotDatum(91, 91));
        run.add(new PlotDatum(92, 92));
        run.add(new PlotDatum(93, 93));
        run.add(new PlotDatum(94, 94));
        run.add(new PlotDatum(95, 95));
        run.add(new PlotDatum(96, 96));
        run.add(new PlotDatum(97, 97));
        run.add(new PlotDatum(98, 98));
        run.add(new PlotDatum(99, 99));
        run.add(new PlotDatum(100, 100));
        run.add(new PlotDatum(101, 101));
        run.add(new PlotDatum(102, 102));
        run.add(new PlotDatum(103, 103));
        run.add(new PlotDatum(104, 104));
        run.add(new PlotDatum(105, 105));
        run.add(new PlotDatum(106, 106));
        run.add(new PlotDatum(107, 107));
        run.add(new PlotDatum(108, 108));
        run.add(new PlotDatum(109, 109));
        run.add(new PlotDatum(110, 110));
        run.add(new PlotDatum(111, 111));
        run.add(new PlotDatum(112, 112));
        run.add(new PlotDatum(113, 113));
        run.add(new PlotDatum(114, 114));
        run.add(new PlotDatum(115, 115));
        run.add(new PlotDatum(116, 116));
        run.add(new PlotDatum(117, 117));
        run.add(new PlotDatum(118, 118));
        run.add(new PlotDatum(119, 119));
        run.add(new PlotDatum(120, 12