// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_2Test {

    /**
     *  Test case for the {@link PlotRunList#remove(int)} method.
     *  It tests the removal of the first plot run object in this run list.
     */
    @Test
    void testRemoveFirst() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        run1.add(new PlotDatum(1, 1));
        run1.add(new PlotDatum(2, 2));
        runList.add(run1);
        PlotRun run2 = new PlotRun();
        run2.add(new PlotDatum(3, 3));
        run2.add(new PlotDatum(4, 4));
        runList.add(run2);
        PlotRun run3 = new PlotRun();
        run3.add(new PlotDatum(5, 5));
        run3.add(new PlotDatum(6, 6));
        runList.add(run3);
        PlotRun run4 = new PlotRun();
        run4.add(new PlotDatum(7, 7));
        run4.add(new PlotDatum(8, 8));
        runList.add(run4);
        PlotRun run5 = new PlotRun();
        run5.add(new PlotDatum(9, 9));
        run5.add(new PlotDatum(10, 10));
        runList.add(run5);
        PlotRun run6 = new PlotRun();
        run6.add(new PlotDatum(11, 11));
        run6.add(new PlotDatum(12, 12));
        runList.add(run6);
        PlotRun run7 = new PlotRun();
        run7.add(new PlotDatum(13, 13));
        run7.add(new PlotDatum(14, 14));
        runList.add(run7);
        PlotRun run8 = new PlotRun();
        run8.add(new PlotDatum(15, 15));
        run8.add(new PlotDatum(16, 16));
        runList.add(run8);
        PlotRun run9 = new PlotRun();
        run9.add(new PlotDatum(17, 17));
        run9.add(new PlotDatum(18, 18));
        runList.add(run9);
        PlotRun run10 = new PlotRun();
        run10.add(new PlotDatum(19, 19));
        run10.add(new PlotDatum(20, 20));
        runList.add(run10);
        PlotRun run11 = new PlotRun();
        run11.add(new PlotDatum(21, 21));
        run11.add(new PlotDatum(22, 22));
        runList.add(run11);
        PlotRun run12 = new PlotRun();
        run12.add(new PlotDatum(23, 23));
        run12.add(new PlotDatum(24, 24));
        runList.add(run12);
        PlotRun run13 = new PlotRun();
        run13.add(new PlotDatum(25, 25));
        run13.add(new PlotDatum(26, 26));
        runList.add(run13);
        PlotRun run14 = new PlotRun();
        run14.add(new PlotDatum(27, 27));
        run14.add(new PlotDatum(28, 28));
        runList.add(run14);
        PlotRun run15 = new PlotRun();
        run15.add(new PlotDatum(29, 29));
        run15.add(new PlotDatum(30, 30));
        runList.add(run15);
        PlotRun run16 = new PlotRun();
        run16.add(new PlotDatum(31, 31));
        run16.add(new PlotDatum(32, 32));
        runList.add(run16);
        PlotRun run17 = new PlotRun();
        run17.add(new PlotDatum(33, 33));
        run17.add(new PlotDatum(34, 34));
        runList.add(run17);
        PlotRun run18 = new PlotRun();
        run18.add(new PlotDatum(35, 35));
        run18.add(new PlotDatum(36, 36));
        runList.add(run18);
        PlotRun run19 = new PlotRun();
        run19.add(new PlotDatum(37, 37));
        run19.add(new PlotDatum(38, 38));
        runList.add(run19);
        PlotRun run20 = new PlotRun();
        run20.add(new PlotDatum(39, 39));
        run20.add(new PlotDatum(40, 40));
        runList.add(run20);
        PlotRun run21 = new PlotRun();
        run21.add(new PlotDatum(41, 41));
        run21.add(new PlotDatum(42, 42));
        runList.add(run21);
        PlotRun run22 = new PlotRun();
        run22.add(new PlotDatum(43, 43));
        run22.add(new PlotDatum(44, 44));
        runList.add(run22);
        PlotRun run23 = new PlotRun();
        run23.add(new PlotDatum(45, 45));
        run23.add(new PlotDatum(46, 46));
        runList.add(run23);
        PlotRun run24 = new PlotRun();
        run24.add(new PlotDatum(47, 47));
        run24.add(new PlotDatum(48, 48));
        runList.add(run24);
        PlotRun run25 = new PlotRun();
        run25.add(new PlotDatum(49, 49));
        run25.add(new PlotDatum(50, 50));
        runList.add(run25);
        PlotRun run26 = new PlotRun();
        run26.add(new PlotDatum(51, 51));
        run26.add(new PlotDatum(52, 52));
        runList.add(run26);
        PlotRun run27 = new PlotRun();
        run27.add(new PlotDatum(53, 53));
        run27.add(new PlotDatum(54, 54));
        runList.add(run27);
        PlotRun run28 = new PlotRun();
        run28.add(new PlotDatum(55, 55));
        run28.add(new PlotDatum(56, 56));
        runList.add(run28);
        PlotRun run29 = new PlotRun();
        run29.add(new PlotDatum(57, 57));
        run29.add(new PlotDatum(58, 58));
        runList.add(run29);
        PlotRun run30 = new PlotRun();
        run30.add(new PlotDatum(59, 59));
        run30.add(new PlotDatum(60, 60));
        runList.add(run30);
        PlotRun run31 = new PlotRun();
        run31.add(new PlotDatum(61, 61));
        run31.add(new PlotDatum(62, 62));
        runList.add(run31);
        PlotRun run32 = new PlotRun();
        run32.add(new PlotDatum(63, 63));
        run32.add(new PlotDatum(64, 64));
        runList.add(run32);
        PlotRun run33 = new PlotRun();
        run33.add(new PlotDatum(65, 65));
        run33.add(new PlotDatum(66, 66));
        runList.add(run33);
        PlotRun run34 = new PlotRun();
        run34.add(new PlotDatum(67, 67));
        run34.add(new PlotDatum(68, 68));
        runList.add(run34);
        PlotRun run35 = new PlotRun();
        run35.add(new PlotDatum(69, 69));
        run35.add(new PlotDatum(70, 70));
        runList.add(