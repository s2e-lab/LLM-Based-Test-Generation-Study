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
    * Test case for {@link PlotRunList#remove(int)}.
    * It tests the removal of the first element of the list.
    */
    @Test
    void testRemoveFirst() {
        PlotRunList list = new PlotRunList();
        list.add(new PlotDatum(1, 1));
        list.add(new PlotDatum(2, 2));
        list.add(new PlotDatum(3, 3));
        list.add(new PlotDatum(4, 4));
        list.add(new PlotDatum(5, 5));
        list.add(new PlotDatum(6, 6));
        list.add(new PlotDatum(7, 7));
        list.add(new PlotDatum(8, 8));
        list.add(new PlotDatum(9, 9));
        list.add(new PlotDatum(10, 10));
        assertEquals(10, list.size());
        assertEquals(1, list.get(0).getX());
        assertEquals(1, list.get(0).getY());
        assertEquals(2, list.get(1).getX());
        assertEquals(2, list.get(1).getY());
        assertEquals(3, list.get(2).getX());
        assertEquals(3, list.get(2).getY());
        assertEquals(4, list.get(3).getX());
        assertEquals(4, list.get(3).getY());
        assertEquals(5, list.get(4).getX());
        assertEquals(5, list.get(4).getY());
        assertEquals(6, list.get(5).getX());
        assertEquals(6, list.get(5).getY());
        assertEquals(7, list.get(6).getX());
        assertEquals(7, list.get(6).getY());
        assertEquals(8, list.get(7).getX());
        assertEquals(8, list.get(7).getY());
        assertEquals(9, list.get(8).getX());
        assertEquals(9, list.get(8).getY());
        assertEquals(10, list.get(9).getX());
        assertEquals(10, list.get(9).getY());
        list.remove(0);
        assertEquals(9, list.size());
        assertEquals(2, list.get(0).getX());
        assertEquals(2, list.get(0).getY());
        assertEquals(3, list.get(1).getX());
        assertEquals(3, list.get(1).getY());
        assertEquals(4, list.get(2).getX());
        assertEquals(4, list.get(2).getY());
        assertEquals(5, list.get(3).getX());
        assertEquals(5, list.get(3).getY());
        assertEquals(6, list.get(4).getX());
        assertEquals(6, list.get(4).getY());
        assertEquals(7, list.get(5).getX());
        assertEquals(7, list.get(5).getY());
        assertEquals(8, list.get(6).getX());
        assertEquals(8, list.get(6).getY());
        assertEquals(9, list.get(7).getX());
        assertEquals(9, list.get(7).getY());
        assertEquals(10, list.get(8).getX());
        assertEquals(10, list.get(8).getY());
    }

    /**
    * Test case for {@link PlotRunList#remove(int)}.
    * It tests the removal of the last element of the list.
    */
    @Test
    void testRemoveLast() {
        PlotRunList list = new PlotRunList();
        list.add(new PlotDatum(1, 1));
        list.add(new PlotDatum(2, 2));
        list.add(new PlotDatum(3, 3));
        list.add(new PlotDatum(4, 4));
        list.add(new PlotDatum(5, 5));
        list.add(new PlotDatum(6, 6));
        list.add(new PlotDatum(7, 7));
        list.add(new PlotDatum(8, 8));
        list.add(new PlotDatum(9, 9));
        list.add(new PlotDatum(10, 10));
        assertEquals(10, list.size());
        assertEquals(1, list.get(0).getX());
        assertEquals(1, list.get(0).getY());
        assertEquals(2, list.get(1).getX());
        assertEquals(2, list.get(1).getY());
        assertEquals(3, list.get(2).getX());
        assertEquals(3, list.get(2).getY());
        assertEquals(4, list.get(3).getX());
        assertEquals(4, list.get(3).getY());
        assertEquals(5, list.get(4).getX());
        assertEquals(5, list.get(4).getY());
        assertEquals(6, list.get(5).getX());
        assertEquals(6, list.get(5).getY());
        assertEquals(7, list.get(6).getX());
        assertEquals(7, list.get(6).getY());
        assertEquals(8, list.get(7).getX());
        assertEquals(8, list.get(7).getY());
        assertEquals(9, list.get(8).getX());
        assertEquals(9, list.get(8).getY());
        assertEquals(10, list.get(9).getX());
        assertEquals(10, list.get(9).getY());
        list.remove(9);
        assertEquals(9, list.size());
        assertEquals(1, list.get(0).getX());
        assertEquals(1, list.get(0).getY());
        assertEquals(2, list.get(1).getX());
        assertEquals(2, list.get(1).getY());
        assertEquals(3, list.get(2).getX());
        assertEquals(3, list.get(2).getY());
        assertEquals(4, list.get(3).getX());
        assertEquals(4, list.get(3).getY());
        assertEquals(5, list.get(4).getX());
        assertEquals(5, list.get(4).getY());
        assertEquals(6, list.get(5).getX());
        assertEquals(6, list.get(5).getY());
        assertEquals(7, list.get(6).getX());
        assertEquals(7, list.get(6).getY());
        assertEquals(8, list.get(7).getX());
        assertEquals(8, list.get(7).getY());
        assertEquals(9, list.get(8).getX());
        assertEquals(9, list.get(8).getY());
    }

    /**
    * Test case for {@link PlotRunList#remove(int)}.
    * It tests the removal of the middle element of the list.
    */
    @Test
    void testRemoveMiddle() {
        PlotRunList list = new PlotRunList();
        list.add(new PlotDatum(1, 1));
        list.add(new PlotDatum(2, 2));
        list.add(new PlotDatum(3, 3));
        list.add(new PlotDatum(4, 4));
        list.add(new PlotDatum(5, 5));
        list.add(new PlotDatum(6, 6));
        list.add(new PlotDatum(7, 7));
        list.add(new PlotDatum(8, 8));
        list.add(new PlotDatum(9, 9));
        list.add(new PlotDatum(10, 10));
        assertEquals(10, list.size());
        assertEquals(1, list.get(0).getX());
        assertEquals(1, list.get(0).getY());
        assertEquals(2, list.get(1).getX());
        assertEquals(2, list.get(1).getY());
        assertEquals(3, list.get(2).getX());
        assertEquals(3, list.get(2).getY());
        assertEquals(4, list.get(3).getX());
        assertEquals(4, list.get(3).getY());
        assertEquals(5, list.get(4).getX());
        assertEquals(5, list.get(4).getY());
        assertEquals(6, list.get(5).getX());
        assertEquals(6, list.get(5).getY());
        assertEquals(7, list.get(6).getX());
        assertEquals(7, list.get(6).getY());
        assertEquals(8, list.get(7).getX());
        assertEquals(8, list.get(7).getY());
        assertEquals(9, list.get(8).getX());
        assertEquals(9, list.get(8).getY());
        assertEquals(10, list.get(9).getX());
        assertEquals(10, list.get(9).getY());
        list.remove(4);
        assertEquals(9, list.size());
        assertEquals(1, list.get(0).getX());
        assertEquals(1, list.get(0).getY());
        assertEquals(2, list.get(1).getX());
        assertEquals(2, list.get(1).getY());
        assertEquals(3, list.get(2).getX());
        assertEquals(3, list.get(