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
    * Test method for {@link PlotRunList#remove(int)}.
    */
    @Test
    void testRemove() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun(new PlotDatum(1, 1));
        PlotRun run2 = new PlotRun(new PlotDatum(2, 2));
        PlotRun run3 = new PlotRun(new PlotDatum(3, 3));
        PlotRun run4 = new PlotRun(new PlotDatum(4, 4));
        PlotRun run5 = new PlotRun(new PlotDatum(5, 5));
        PlotRun run6 = new PlotRun(new PlotDatum(6, 6));
        PlotRun run7 = new PlotRun(new PlotDatum(7, 7));
        PlotRun run8 = new PlotRun(new PlotDatum(8, 8));
        PlotRun run9 = new PlotRun(new PlotDatum(9, 9));
        PlotRun run10 = new PlotRun(new PlotDatum(10, 10));
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        runList.add(run4);
        runList.add(run5);
        runList.add(run6);
        runList.add(run7);
        runList.add(run8);
        runList.add(run9);
        runList.add(run10);
        runList.remove(0);
        assertEquals(9, runList.size());
        assertEquals(2, runList.get(0).size());
        assertEquals(3, runList.get(1).size());
        assertEquals(4, runList.get(2).size());
        assertEquals(5, runList.get(3).size());
        assertEquals(6, runList.get(4).size());
        assertEquals(7, runList.get(5).size());
        assertEquals(8, runList.get(6).size());
        assertEquals(9, runList.get(7).size());
        assertEquals(10, runList.get(8).size());
    }
}
