// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {

    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with one run.
     */
    @Test
    void testSize_0() {
        PlotRunList runList = new PlotRunList();
        runList.add(new PlotRun(new PlotDatum(1, 1)));
        assertEquals(1, runList.size());
    }

    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with two runs.
     */
    @Test
    void testSize_1() {
        PlotRunList runList = new PlotRunList();
        runList.add(new PlotRun(new PlotDatum(1, 1)));
        runList.add(new PlotRun(new PlotDatum(2, 2)));
        assertEquals(2, runList.size());
    }

    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with three runs.
     */
    @Test
    void testSize_2() {
        PlotRunList runList = new PlotRunList();
        runList.add(new PlotRun(new PlotDatum(1, 1)));
        runList.add(new PlotRun(new PlotDatum(2, 2)));
        runList.add(new PlotRun(new PlotDatum(3, 3)));
        assertEquals(3, runList.size());
    }

    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with four runs.
     */
    @Test
    void testSize_3() {
        PlotRunList runList = new PlotRunList();
        runList.add(new PlotRun(new PlotDatum(1, 1)));
        runList.add(new PlotRun(new PlotDatum(2, 2)));
        runList.add(new PlotRun(new PlotDatum(3, 3)));
        runList.add(new PlotRun(new PlotDatum(4, 4)));
        assertEquals(4, runList.size());
    }

    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with five runs.
     */
    @Test
    void testSize_4() {
        PlotRunList runList = new PlotRunList();
        runList.add(new PlotRun(new PlotDatum(1, 1)));
        runList.add(new PlotRun(new PlotDatum(2, 2)));
        runList.add(new PlotRun(new PlotDatum(3, 3)));
        runList.add(new PlotRun(new PlotDatum(4, 4)));
        runList.add(new PlotRun(new PlotDatum(5, 5)));
        assertEquals(5, runList.size());
    }

    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with six runs.
     */
    @Test
    void testSize_5() {
        PlotRunList runList = new PlotRunList();
        runList.add(new PlotRun(new PlotDatum(1, 1)));
        runList.add(new PlotRun(new PlotDatum(2, 2)));
        runList.add(new PlotRun(new PlotDatum(3, 3)));
        runList.add(new PlotRun(new PlotDatum(4, 4)));
        runList.add(new PlotRun(new PlotDatum(5, 5)));
        runList.add(new PlotRun(new PlotDatum(6, 6)));
        assertEquals(6, runList.size());
    }

    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with seven runs.
     */
    @Test
    void testSize_6() {
        PlotRunList runList = new PlotRunList();
        runList.add(new PlotRun(new PlotDatum(1, 1)));
        runList.add(new PlotRun(new PlotDatum(2, 2)));
        runList.add(new PlotRun(new PlotDatum(3, 3)));
        runList.add(new PlotRun(new PlotDatum(4, 4)));
        runList.add(new PlotRun(new PlotDatum(5, 5)));
        runList.add(new PlotRun(new PlotDatum(6, 6)));
        runList.add(new PlotRun(new PlotDatum(7, 7)));
        assertEquals(7, runList.size());
    }

    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with eight runs.
     */
    @Test
    void testSize_7() {
        PlotRunList runList = new PlotRunList();
        runList.add(new PlotRun(new PlotDatum(1, 1)));
        runList.add(new PlotRun(new PlotDatum(2, 2)));
        runList.add(new PlotRun(new PlotDatum(3, 3)));
        runList.add(new PlotRun(new PlotDatum(4, 4)));
        runList.add(new PlotRun(new PlotDatum(5, 5)));
        runList.add(new PlotRun(new PlotDatum(6, 6)));
        runList.add(new PlotRun(new PlotDatum(7, 7)));
        runList.add(new PlotRun(new PlotDatum(8, 8)));
        assertEquals(8, runList.size());
    }

    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with nine runs.
     */
    @Test
    void testSize_8() {
        PlotRunList runList = new PlotRunList();
        runList.add(new PlotRun(new PlotDatum(1, 1)));
        runList.add(new PlotRun(new PlotDatum(2, 2)));
        runList.add(new PlotRun(new PlotDatum(3, 3)));
        runList.add(new PlotRun(new PlotDatum(4, 4)));
        runList.add(new PlotRun(new PlotDatum(5, 5)));
        runList.add(new PlotRun(new PlotDatum(6, 6)));
        runList.add(new PlotRun(new PlotDatum(7, 7)));
        runList.add(new PlotRun(new PlotDatum(8, 8)));
        runList.add(new PlotRun(new PlotDatum(9, 9)));
        assertEquals(9, runList.size());
    }

    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with ten runs.
     */
    @Test
    void testSize_9() {
        PlotRunList runList = new PlotRunList();
        runList.add(new PlotRun(new PlotDatum(1, 1)));
        runList.add(new PlotRun(new PlotDatum(2, 2)));
        runList.add(new PlotRun(new PlotDatum(3, 3)));
        runList.add(new PlotRun(new PlotDatum(4, 4)));
        runList.add(new PlotRun(new PlotDatum(5, 5)));
        runList.add(new PlotRun(new PlotDatum(6, 6)));
        runList.add(new PlotRun(new PlotDatum(7, 7)));
        runList.add(new PlotRun(new PlotDatum(8, 8)));
        runList.add(new PlotRun(new PlotDatum(9, 9)));
        runList.add(new PlotRun(new PlotDatum(10, 10)));
        assertEquals(10, runList.size());
    }
}

// PlotRunList_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#size()} method.
*/
class PlotRunList_1Test {
		
    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with one run.
     */
    @Test
    void testSize_0() {
        PlotRunList runList = new PlotRunList();
        runList.add(new PlotRun(new PlotDatum(1, 1)));
        assertEquals(1, runList.size());
    }

    /**
     *  Test case for the {@link PlotRunList#size()} method.
     *  It tests the size of a run list with two runs.
     */
    @Test
    void test