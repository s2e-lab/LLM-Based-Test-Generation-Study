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
     *  Test case for the {@link PlotRunList#iterator()} method.
     *  It tests the iterator for a run list with one run.
     */
    @Test
    void testIterator_1() {
        PlotRunList runList = new PlotRunList();
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        runList.add(run);
        Iterator iterator = runList.iterator();
        assertTrue(iterator.hasNext());
        PlotRun nextRun = (PlotRun) iterator.next();
        assertEquals(1.0, nextRun.get(0).getX());
        assertEquals(2.0, nextRun.get(0).getY());
        assertFalse(iterator.hasNext());
    }

    /**
     *  Test case for the {@link PlotRunList#iterator()} method.
     *  It tests the iterator for a run list with two runs.
     */
    @Test
    void testIterator_2() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        run1.add(new PlotDatum(1.0, 2.0));
        runList.add(run1);
        PlotRun run2 = new PlotRun();
        run2.add(new PlotDatum(3.0, 4.0));
        runList.add(run2);
        Iterator iterator = runList.iterator();
        assertTrue(iterator.hasNext());
        PlotRun nextRun = (PlotRun) iterator.next();
        assertEquals(1.0, nextRun.get(0).getX());
        assertEquals(2.0, nextRun.get(0).getY());
        assertTrue(iterator.hasNext());
        nextRun = (PlotRun) iterator.next();
        assertEquals(3.0, nextRun.get(0).getX());
        assertEquals(4.0, nextRun.get(0).getY());
        assertFalse(iterator.hasNext());
    }

    /**
     *  Test case for the {@link PlotRunList#iterator()} method.
     *  It tests the iterator for a run list with three runs.
     */
    @Test
    void testIterator_3() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        run1.add(new PlotDatum(1.0, 2.0));
        runList.add(run1);
        PlotRun run2 = new PlotRun();
        run2.add(new PlotDatum(3.0, 4.0));
        runList.add(run2);
        PlotRun run3 = new PlotRun();
        run3.add(new PlotDatum(5.0, 6.0));
        runList.add(run3);
        Iterator iterator = runList.iterator();
        assertTrue(iterator.hasNext());
        PlotRun nextRun = (PlotRun) iterator.next();
        assertEquals(1.0, nextRun.get(0).getX());
        assertEquals(2.0, nextRun.get(0).getY());
        assertTrue(iterator.hasNext());
        nextRun = (PlotRun) iterator.next();
        assertEquals(3.0, nextRun.get(0).getX());
        assertEquals(4.0, nextRun.get(0).getY());
        assertTrue(iterator.hasNext());
        nextRun = (PlotRun) iterator.next();
        assertEquals(5.0, nextRun.get(0).getX());
        assertEquals(6.0, nextRun.get(0).getY());
        assertFalse(iterator.hasNext());
    }

    /**
     *  Test case for the {@link PlotRunList#iterator()} method.
     *  It tests the iterator for a run list with four runs.
     */
    @Test
    void testIterator_4() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        run1.add(new PlotDatum(1.0, 2.0));
        runList.add(run1);
        PlotRun run2 = new PlotRun();
        run2.add(new PlotDatum(3.0, 4.0));
        runList.add(run2);
        PlotRun run3 = new PlotRun();
        run3.add(new PlotDatum(5.0, 6.0));
        runList.add(run3);
        PlotRun run4 = new PlotRun();
        run4.add(new PlotDatum(7.0, 8.0));
        runList.add(run4);
        Iterator iterator = runList.iterator();
        assertTrue(iterator.hasNext());
        PlotRun nextRun = (PlotRun) iterator.next();
        assertEquals(1.0, nextRun.get(0).getX());
        assertEquals(2.0, nextRun.get(0).getY());
        assertTrue(iterator.hasNext());
        nextRun = (PlotRun) iterator.next();
        assertEquals(3.0, nextRun.get(0).getX());
        assertEquals(4.0, nextRun.get(0).getY());
        assertTrue(iterator.hasNext());
        nextRun = (PlotRun) iterator.next();
        assertEquals(5.0, nextRun.get(0).getX());
        assertEquals(6.0, nextRun.get(0).getY());
        assertTrue(iterator.hasNext());
        nextRun = (PlotRun) iterator.next();
        assertEquals(7.0, nextRun.get(0).getX());
        assertEquals(8.0, nextRun.get(0).getY());
        assertFalse(iterator.hasNext());
    }

    /**
     *  Test case for the {@link PlotRunList#iterator()} method.
     *  It tests the iterator for a run list with five runs.
     */
    @Test
    void testIterator_5() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        run1.add(new PlotDatum(1.0, 2.0));
        runList.add(run1);
        PlotRun run2 = new PlotRun();
        run2.add(new PlotDatum(3.0, 4.0));
        runList.add(run2);
        PlotRun run3 = new PlotRun();
        run3.add(new PlotDatum(5.0, 6.0));
        runList.add(run3);
        PlotRun run4 = new PlotRun();
        run4.add(new PlotDatum(7.0, 8.0));
        runList.add(run4);
        PlotRun run5 = new PlotRun();
        run5.add(new PlotDatum(9.0, 10.0));
        runList.add(run5);
        Iterator iterator = runList.iterator();
        assertTrue(iterator.hasNext());
        PlotRun nextRun = (PlotRun) iterator.next();
        assertEquals(1.0, nextRun.get(0).getX());
        assertEquals(2.0, nextRun.get(0).getY());
        assertTrue(iterator.hasNext());
        nextRun = (PlotRun) iterator.next();
        assertEquals(3.0, nextRun.get(0).getX());
        assertEquals(4.0, nextRun.get(0).getY());
        assertTrue(iterator.hasNext());
        nextRun = (PlotRun) iterator.next();
        assertEquals(5.0, nextRun.get(0).getX());
        assertEquals(6.0, nextRun.get(0).getY());
        assertTrue(iterator.hasNext());
        nextRun = (PlotRun) iterator.next();
        assertEquals(7.0, nextRun.get(0).getX());
        assertEquals(8.0, nextRun.get(0).getY());
        assertTrue(iterator.hasNext());
        nextRun = (PlotRun) iterator.next();
        assertEquals(9.0, nextRun.get(0).getX());
        assertEquals(10.0, nextRun.get(0).getY());
        assertFalse(iterator.hasNext());
    }

    /**
     *  Test case for the {@link PlotRunList#iterator()} method.
     *  It tests the iterator for a run list with six runs.
     */
    @Test
    void testIterator_6() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        run1.add(new PlotDatum(1.0, 2.0));
        runList.add(run1);
        PlotRun run2 = new PlotRun();
        run2.add(new PlotDatum(3.0, 4.0));
        runList.add(run2);
        PlotRun run3 = new PlotRun();
        run3.add(new PlotDatum(5.0, 6.0));
        runList.add(run3);
        PlotRun run4 = new PlotRun();
        run4.add(new PlotDatum(7.0, 8.0));
        runList.add(run4);
        PlotRun run5 = new PlotRun();
        run5.add(new PlotDatum(9.0, 10.0));
        runList.add(run5);
        PlotRun run6 = new PlotRun();
        run6.add(new PlotDatum(1