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
        run.add(new PlotDatum(1, 2, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(2, 3, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(3, 4, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(4, 5, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(5, 6, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(6, 7, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(7, 8, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(8, 9, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(9, 10, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(10, 11, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(11, 12, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(12, 13, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(13, 14, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(14, 15, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(15, 16, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(16, 17, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(17, 18, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(18, 19, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(19, 20, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(20, 21, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(21, 22, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(22, 23, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(23, 24, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(24, 25, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(25, 26, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(26, 27, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(27, 28, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(28, 29, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(29, 30, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(30, 31, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(31, 32, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(32, 33, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(33, 34, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(34, 35, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(35, 36, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(36, 37, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(37, 38, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(38, 39, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(39, 40, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(40, 41, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(41, 42, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(42, 43, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(43, 44, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(44, 45, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(45, 46, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(46, 47, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(47, 48, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(48, 49, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(49, 50, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(50, 51, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(51, 52, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(52, 53, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(53, 54, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(54, 55, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(55, 56, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(56, 57, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(57, 58, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(58, 59, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(59, 60, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(60, 61, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(61, 62, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(62, 63, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(63, 64, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(64, 65, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(65, 66, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(66, 67, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(67, 68, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(68, 69, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(69, 70, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(70, 71, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(71, 72, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(72, 73, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(73, 74, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(74, 75, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(75, 76, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(76, 77, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(77, 78, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(78, 79, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(79, 80, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(80, 81, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(81, 82, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(82, 83, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(83, 