// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {

    /**
    * Test method for {@link PlotRunList#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        Iterator it = runList.iterator();
        assertTrue(it.hasNext());
        assertEquals(run1, it.next());
        assertTrue(it.hasNext());
        assertEquals(run2, it.next());
        assertTrue(it.hasNext());
        assertEquals(run3, it.next());
        assertFalse(it.hasNext());
    }
}
