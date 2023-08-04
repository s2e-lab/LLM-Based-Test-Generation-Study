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
    * Test case for {@link PlotRun#remove(int)}.
    * It tests the removal of the first element of the run.
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
        assertEquals(1, run.remove(0).getX());
        assertEquals(2, run.remove(0).getX());
        assertEquals(3, run.remove(0).getX());
        assertEquals(4, run.remove(0).getX());
        assertEquals(5, run.remove(0).getX());
        assertEquals(6, run.remove(0).getX());
        assertEquals(7, run.remove(0).getX());
        assertEquals(8, run.remove(0).getX());
        assertEquals(9, run.remove(0).getX());
        assertEquals(10, run.remove(0).getX());
    }

    /**
    * Test case for {@link PlotRun#remove(int)}.
    * It tests the removal of the last element of the run.
    */
    @Test
    void testRemoveLast() {
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
        assertEquals(10, run.remove(9).getX());
        assertEquals(9, run.remove(9).getX());
        assertEquals(8, run.remove(9).getX());
        assertEquals(7, run.remove(9).getX());
        assertEquals(6, run.remove(9).getX());
        assertEquals(5, run.remove(9).getX());
        assertEquals(4, run.remove(9).getX());
        assertEquals(3, run.remove(9).getX());
        assertEquals(2, run.remove(9).getX());
        assertEquals(1, run.remove(9).getX());
    }

    /**
    * Test case for {@link PlotRun#remove(int)}.
    * It tests the removal of the middle element of the run.
    */
    @Test
    void testRemoveMiddle() {
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
        assertEquals(6, run.remove(4).getX());
        assertEquals(7, run.remove(4).getX());
        assertEquals(8, run.remove(4).getX());
        assertEquals(9, run.remove(4).getX());
        assertEquals(10, run.remove(4).getX());
        assertEquals(1, run.remove(4).getX());
        assertEquals(2, run.remove(4).getX());
        assertEquals(3, run.remove(4).getX());
        assertEquals(4, run.remove(4).getX());
        assertEquals(5, run.remove(4).getX());
    }

    /**
    * Test case for {@link PlotRun#remove(int)}.
    * It tests the removal of the first element of the run.
    */
    @Test
    void testRemoveFirst2() {
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
        assertEquals(1, run.remove(0).getX());
        assertEquals(2, run.remove(0).getX());
        assertEquals(3, run.remove(0).getX());
        assertEquals(4, run.remove(0).getX());
        assertEquals(5, run.remove(0).getX());
        assertEquals(6, run.remove(0).getX());
        assertEquals(7, run.remove(0).getX());
        assertEquals(8, run.remove(0).getX());
        assertEquals(9, run.remove(0).getX());
        assertEquals(10, run.remove(0).getX());
    }

    /**
    * Test case for {@link PlotRun#remove(int)}.
    * It tests the removal of the last element of the run.
    */
    @Test
    void testRemoveLast2() {
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
        assertEquals(10, run.remove(9).getX());
        assertEquals(9, run.remove(9).getX());
        assertEquals(8, run.remove(9).getX());
        assertEquals(7, run.remove(9).getX());
        assertEquals(6, run.remove(9).getX());
        assertEquals(5, run.remove(9).getX());
        assertEquals(4, run.remove(9).getX());
        assertEquals(3, run.remove(9).getX());
        assertEquals(2, run.remove(9).getX());
        assertEquals(1, run.remove(9).getX());
    }

    /**
    * Test case for {@link PlotRun#remove(int)}.
    * It tests the removal of the middle element of the run.
    */
    @Test
    void testRemoveMiddle2() {
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
        assertEquals(6, run.remove(4).getX());
        assertEquals(7, run.remove(4).getX());
        assertEquals(8, run.remove(4).getX());
        assertEquals(9, run.remove(4).getX());
        assertEquals(10, run.remove(4).getX());
        assertEquals(1, run.remove(4).getX());
        assertEquals(2, run.remove(4).getX());
        assertEquals(3, run.remove(4).getX());
        assertEquals(4, run.remove(4).getX());
        assertEquals(5, run.remove(4).getX());
    }
}

// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.